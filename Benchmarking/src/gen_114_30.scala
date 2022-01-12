import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  case class s6 (
    p0: s0,
    p1: Vector[Vector[s3]]
  )
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s6], v2: Double): Double = {
    val v5: s6 = v1(0)
    val v3: s0 = v5.p0
    var v13: Double = v2
    val v18: Vector[Vector[Double]] = v3.p1
    val v7: Vector[Double] = v18(1)
    val v24: Double = v2 + v13
    val v30: Double = v7(0)
    val v35: Vector[Double] = v3.p0
    val v71: Double = v35(0)
    val v42: Vector[Double] = v18(0)
    val v46: Double = v42(0)
    var v49: Double = v2
    v49 = v24
    val v140: Double = v71 / v13
    val v82: Vector[Double] = Vector(v46, v30, v140, v49)
    val v97: Double = v82(0)
    v97
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s2(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0)))), s0(Vector(3.0), Vector(Vector(4.0), Vector(5.0)))), s2(Vector(s0(Vector(6.0), Vector(Vector(7.0), Vector(8.0)))), s0(Vector(9.0), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0)))), s3(Vector(s2(Vector(s0(Vector(15.0), Vector(Vector(16.0), Vector(17.0)))), s0(Vector(18.0), Vector(Vector(19.0), Vector(20.0)))), s2(Vector(s0(Vector(21.0), Vector(Vector(22.0), Vector(23.0)))), s0(Vector(24.0), Vector(Vector(25.0), Vector(26.0))))), s0(Vector(27.0), Vector(Vector(28.0), Vector(29.0)))), s3(Vector(s2(Vector(s0(Vector(30.0), Vector(Vector(31.0), Vector(32.0)))), s0(Vector(33.0), Vector(Vector(34.0), Vector(35.0)))), s2(Vector(s0(Vector(36.0), Vector(Vector(37.0), Vector(38.0)))), s0(Vector(39.0), Vector(Vector(40.0), Vector(41.0))))), s0(Vector(42.0), Vector(Vector(43.0), Vector(44.0)))))
    val v1: Vector[s6] = Vector(s6(s0(Vector(45.0), Vector(Vector(46.0), Vector(47.0))), Vector(Vector(s3(Vector(s2(Vector(s0(Vector(48.0), Vector(Vector(49.0), Vector(50.0)))), s0(Vector(51.0), Vector(Vector(52.0), Vector(53.0)))), s2(Vector(s0(Vector(54.0), Vector(Vector(55.0), Vector(56.0)))), s0(Vector(57.0), Vector(Vector(58.0), Vector(59.0))))), s0(Vector(60.0), Vector(Vector(61.0), Vector(62.0))))))), s6(s0(Vector(63.0), Vector(Vector(64.0), Vector(65.0))), Vector(Vector(s3(Vector(s2(Vector(s0(Vector(66.0), Vector(Vector(67.0), Vector(68.0)))), s0(Vector(69.0), Vector(Vector(70.0), Vector(71.0)))), s2(Vector(s0(Vector(72.0), Vector(Vector(73.0), Vector(74.0)))), s0(Vector(75.0), Vector(Vector(76.0), Vector(77.0))))), s0(Vector(78.0), Vector(Vector(79.0), Vector(80.0))))))))
    val v2: Double = 81.0
    val start = nanoTime()
    var result: Double = 81.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}