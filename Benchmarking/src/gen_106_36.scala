import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v6: s0 = v0.p1
    val v12: Vector[Vector[Double]] = v6.p0
    val v8: Vector[Double] = v12(2)
    val v2: Double = v8(0)
    var v10: Double = v1
    val v28: Vector[Double] = v12(2)
    val v25: Double = v28(0)
    val v20: Double = v10 / v25
    val v80: Double = v8(0)
    v10 = v2
    val v152: Double = v20 / v80
    v152
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}