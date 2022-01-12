import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    val v7: s0 = v0(0)
    val v10: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Double] = v10(1)
    val v5: Double = v11(0)
    val v8: s0 = v1.p1
    val v16: Vector[Vector[Double]] = v8.p1
    val v27: Double = v5 * v5
    val v18: Vector[Double] = v16(0)
    val v22: Double = v18(0)
    val v21: Double = v27 / v22
    val v45: Double = v5 / v21
    v45
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: s1 = s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}