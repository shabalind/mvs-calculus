import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f85(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v12: Vector[Vector[Double]] = v0.p0
    val v8: s0 = s0(v12, v3)
    v8
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: s0 = f85(v0)
    val v8: Vector[Vector[Double]] = v7.p1
    val v6: Vector[Double] = v8(1)
    val v4: Vector[Vector[Double]] = v0.p0
    var v11: Vector[Vector[Double]] = v4
    v11 = v11.updated(0, v6)
    val v20: Vector[Double] = v11(0)
    val v47: Double = v20(0)
    var v34: Double = v47
    v34
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}