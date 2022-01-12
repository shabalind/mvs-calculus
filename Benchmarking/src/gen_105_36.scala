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
  case class s2 (
    p0: Vector[s1],
    p1: s0,
    p2: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: Vector[s0] = v0.p0
    val v3: s0 = v5(0)
    val v9: Vector[Vector[Double]] = v3.p1
    val v4: Vector[Double] = v9(2)
    val v18: s0 = v5(0)
    val v13: Vector[Vector[Double]] = v18.p1
    val v19: Vector[Double] = v13(1)
    val v26: Double = v19(0)
    val v34: Double = v26 * v1
    val v35: Double = v4(0)
    val v55: Double = v35 * v34
    v55
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(Vector(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s1(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))))
    val v1: Double = 54.0
    val start = nanoTime()
    var result: Double = 54.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}