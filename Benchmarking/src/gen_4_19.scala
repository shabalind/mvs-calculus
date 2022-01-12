import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v7: s3 = v0(0)
    val v4: Vector[s0] = v7.p0
    val v10: s0 = v4(0)
    var v9: Double = v1
    v9 = v1
    val v15: Vector[Vector[Double]] = v10.p3
    val v13: Vector[Double] = v15(0)
    val v20: Double = v13(0)
    val v38: Double = v20 / v1
    val v69: Double = v13(0)
    val v82: Double = v69 - v38
    val v213: Vector[Double] = v15(0)
    val v72: Double = v213(0)
    v9 = v82
    val v103: Double = v9 - v69
    val v167: Double = v103 * v72
    val v118: Double = v167 - v82
    v118
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0))), s0(Vector(5.0), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(10.0), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)))), s1(s0(Vector(15.0), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(20.0), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0))))), s3(Vector(s0(Vector(25.0), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(30.0), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0))), s0(Vector(35.0), Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0)))), s1(s0(Vector(40.0), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0))), s0(Vector(45.0), Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0)), Vector(Vector(49.0))))))
    val v1: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}