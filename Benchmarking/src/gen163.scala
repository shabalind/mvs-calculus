import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: s2, v2: Double): Double = {
    var v11: Double = v2
    val v4: Vector[Double] = v0(0)
    val v12: Double = v4(0)
    val v19: Double = v11 * v11
    var v14: Vector[Double] = v4
    var v10: Vector[Double] = v14
    v10 = v10.updated(0, v2)
    v10 = v10.updated(0, v12)
    v14 = v14.updated(0, v19)
    val v50: Double = v4(0)
    v10 = v10.updated(0, v50)
    val v99: Double = v10(0)
    v99
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: s2 = s2(s1(Vector(s0(Vector(Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(8.0, 9.0, 10.0))), Vector(s0(Vector(Vector(11.0), Vector(12.0)), Vector(13.0, 14.0, 15.0))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(18.0, 19.0, 20.0))))), s1(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(23.0, 24.0, 25.0))), Vector(Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(28.0, 29.0, 30.0))), Vector(s0(Vector(Vector(31.0), Vector(32.0)), Vector(33.0, 34.0, 35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(38.0, 39.0, 40.0))))))
    val v2: Double = 41.0
    val start = nanoTime()
    var result: Double = 41.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}