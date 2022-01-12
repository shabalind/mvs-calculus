import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: s0 = v0(0)
    val v11: s1 = s1(v3, v0)
    val v12: s0 = v0(0)
    val v20: s0 = v11.p0
    val v26: Vector[Vector[Double]] = v20.p1
    val v25: Vector[Double] = v26(1)
    val v23: Vector[Vector[Double]] = v12.p1
    var v96: Vector[Vector[Double]] = v23
    val v72: Vector[Double] = v96(0)
    val v100: Vector[Double] = v26(0)
    v96 = v96.updated(1, v100)
    val v132: Double = v72(0)
    v96 = v96.updated(1, v25)
    v132
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}