import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    var v4: Double = v1
    val v12: s0 = v0(0)
    val v8: Vector[Vector[Double]] = v12.p0
    val v18: Double = v1 + v4
    val v17: Vector[Double] = v8(1)
    var v44: Double = v4
    v44 = v18
    val v88: Double = v17(0)
    val v58: Double = v4 - v44
    val v109: Double = v88 + v58
    v109
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))
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