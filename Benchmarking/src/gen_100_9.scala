import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  case class s6 (
    p0: s3,
    p1: Vector[s3]
  )
  @noinline
  def f0(v0: s6, v1: Vector[Vector[s6]], v2: Double): Double = {
    val v5: s3 = v0.p0
    val v34: Vector[s0] = v5.p0
    val v26: s0 = v34(0)
    val v40: Vector[Vector[Double]] = v26.p1
    var v74: Vector[Vector[Double]] = v40
    val v38: Vector[Double] = v74(1)
    val v44: Double = v38(0)
    v74 = v74.updated(0, v38)
    v74 = v74.updated(1, v38)
    v74 = v74.updated(1, v38)
    val v86: Vector[Double] = v74(2)
    val v102: Vector[Double] = v74(0)
    v74 = v74.updated(1, v102)
    var v83: Vector[Double] = v86
    val v111: Double = v83(0)
    v83 = v83.updated(0, v44)
    v111
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s3(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s3(Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s3(Vector(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))
    val v1: Vector[Vector[s6]] = Vector(Vector(s6(s3(Vector(s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s0(Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s3(Vector(s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), s3(Vector(s0(Vector(50.0, 51.0), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), s0(Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))), Vector(s6(s3(Vector(s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), s0(Vector(65.0, 66.0), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), Vector(s3(Vector(s0(Vector(70.0, 71.0), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), s0(Vector(75.0, 76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s3(Vector(s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))), s0(Vector(85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))))))
    val v2: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}