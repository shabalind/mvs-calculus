import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s0, v1: s2, v2: Double): Double = {
    val v9: Vector[s0] = v1.p1
    val v13: s0 = v9(0)
    val v27: Vector[Vector[Double]] = v13.p0
    val v14: Vector[Double] = v27(0)
    val v28: Double = v14(0)
    val v77: Vector[Vector[Double]] = v13.p0
    val v167: Vector[Double] = v77(2)
    var v108: Double = v28
    val v72: Double = v167(0)
    val v252: Double = v108 / v72
    v252
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0))
    val v1: s2 = s2(s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0, 11.0)), Vector(12.0, 13.0)), Vector(s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(17.0, 18.0, 19.0))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}