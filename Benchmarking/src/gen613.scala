import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s2]]
  )
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: s4, v2: Double): Double = {
    var v7: Double = v2
    val v10: s0 = v1.p1
    val v19: Double = v2 / v2
    val v17: Vector[Vector[Double]] = v10.p0
    val v18: Double = v10.p1
    val v20: Double = v18 / v2
    val v28: s0 = s0(v17, v19)
    val v37: Vector[Vector[Double]] = v28.p0
    val v34: s0 = s0(v37, v19)
    val v45: Double = v20 / v19
    val v103: Double = v34.p1
    var v82: Double = v103
    val v99: Double = v18 - v7
    val v109: Double = v45 + v82
    val v137: Double = v99 * v109
    v137
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: s4 = s4(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), 4.0), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), 8.0), Vector(Vector(s2(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), 12.0), s1(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), 16.0), s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), 20.0)))), Vector(s2(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), 24.0), s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), 28.0), s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), 32.0))))))
    val v2: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}