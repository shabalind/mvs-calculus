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
  case class s3 (
    p0: s1,
    p1: s0,
    p2: s0,
    p3: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: s0, v1: s3, v2: Double): Double = {
    val v7: Double = v2 + v2
    val v6: Double = v2 - v7
    var v21: Double = v6
    v21 = v6
    val v73: Vector[Double] = Vector(v21)
    val v60: Double = v2 + v6
    val v46: Double = v73(0)
    val v81: Double = v2 * v60
    val v134: Double = v46 + v60
    val v148: Double = v81 * v134
    v148
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: s3 = s3(s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(Vector(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), Vector(s1(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))), Vector(s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))))))
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