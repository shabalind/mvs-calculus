import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v7: Double = v1
    val v5: s0 = v0.p0
    val v2: Vector[Vector[Double]] = v5.p1
    val v9: Vector[Double] = v2(0)
    val v3: Double = v9(0)
    v7 = v3
    var v14: Double = v3
    val v13: Double = v9(0)
    val v24: Double = v14 * v7
    val v101: Double = v13 * v24
    v101
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))
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