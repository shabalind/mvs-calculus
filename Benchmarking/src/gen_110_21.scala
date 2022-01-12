import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Double): Double = {
    val v9: s0 = v1(0)
    val v5: Vector[Vector[Double]] = v9.p1
    var v14: Vector[Vector[Double]] = v5
    val v17: Vector[Double] = v14(2)
    var v16: Vector[Vector[Double]] = v14
    val v41: Double = v17(0)
    val v35: Double = v41 / v2
    v16 = v16.updated(1, v17)
    val v56: Double = v35 / v35
    val v64: Vector[Double] = v16(0)
    v14 = v14.updated(1, v64)
    v56
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}