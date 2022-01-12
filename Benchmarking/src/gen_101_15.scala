import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s6 (
    p0: s0,
    p1: s3
  )
  case class s7 (
    p0: Vector[s1],
    p1: s6
  )
  case class s9 (
    p0: Vector[s0],
    p1: Vector[s7]
  )
  @noinline
  def f0(v0: Vector[s7], v1: Vector[s9], v2: Vector[Vector[s2]], v3: Double): Double = {
    val v4: Vector[s2] = v2(0)
    val v6: s2 = v4(0)
    val v15: Vector[s0] = v6.p1
    val v9: s0 = v15(0)
    val v11: s0 = v15(1)
    var v17: Double = v3
    var v24: s0 = v11
    v24 = v24.copy(p0 = v17)
    v24 = v24.copy(p0 = v17)
    val v61: Vector[Vector[Double]] = v9.p1
    v24 = v24.copy(p1 = v61)
    val v180: Double = v24.p0
    v24 = v24.copy(p1 = v61)
    v180
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(s1(s0(0.0, Vector(Vector(1.0))))), s6(s0(2.0, Vector(Vector(3.0))), s3(Vector(s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))), s2(Vector(s0(8.0, Vector(Vector(9.0))), s0(10.0, Vector(Vector(11.0)))), Vector(s0(12.0, Vector(Vector(13.0))), s0(14.0, Vector(Vector(15.0))), s0(16.0, Vector(Vector(17.0)))))))), s7(Vector(s1(s0(18.0, Vector(Vector(19.0))))), s6(s0(20.0, Vector(Vector(21.0))), s3(Vector(s0(22.0, Vector(Vector(23.0))), s0(24.0, Vector(Vector(25.0)))), s2(Vector(s0(26.0, Vector(Vector(27.0))), s0(28.0, Vector(Vector(29.0)))), Vector(s0(30.0, Vector(Vector(31.0))), s0(32.0, Vector(Vector(33.0))), s0(34.0, Vector(Vector(35.0)))))))), s7(Vector(s1(s0(36.0, Vector(Vector(37.0))))), s6(s0(38.0, Vector(Vector(39.0))), s3(Vector(s0(40.0, Vector(Vector(41.0))), s0(42.0, Vector(Vector(43.0)))), s2(Vector(s0(44.0, Vector(Vector(45.0))), s0(46.0, Vector(Vector(47.0)))), Vector(s0(48.0, Vector(Vector(49.0))), s0(50.0, Vector(Vector(51.0))), s0(52.0, Vector(Vector(53.0)))))))))
    val v1: Vector[s9] = Vector(s9(Vector(s0(54.0, Vector(Vector(55.0))), s0(56.0, Vector(Vector(57.0)))), Vector(s7(Vector(s1(s0(58.0, Vector(Vector(59.0))))), s6(s0(60.0, Vector(Vector(61.0))), s3(Vector(s0(62.0, Vector(Vector(63.0))), s0(64.0, Vector(Vector(65.0)))), s2(Vector(s0(66.0, Vector(Vector(67.0))), s0(68.0, Vector(Vector(69.0)))), Vector(s0(70.0, Vector(Vector(71.0))), s0(72.0, Vector(Vector(73.0))), s0(74.0, Vector(Vector(75.0)))))))))), s9(Vector(s0(76.0, Vector(Vector(77.0))), s0(78.0, Vector(Vector(79.0)))), Vector(s7(Vector(s1(s0(80.0, Vector(Vector(81.0))))), s6(s0(82.0, Vector(Vector(83.0))), s3(Vector(s0(84.0, Vector(Vector(85.0))), s0(86.0, Vector(Vector(87.0)))), s2(Vector(s0(88.0, Vector(Vector(89.0))), s0(90.0, Vector(Vector(91.0)))), Vector(s0(92.0, Vector(Vector(93.0))), s0(94.0, Vector(Vector(95.0))), s0(96.0, Vector(Vector(97.0)))))))))), s9(Vector(s0(98.0, Vector(Vector(99.0))), s0(100.0, Vector(Vector(101.0)))), Vector(s7(Vector(s1(s0(102.0, Vector(Vector(103.0))))), s6(s0(104.0, Vector(Vector(105.0))), s3(Vector(s0(106.0, Vector(Vector(107.0))), s0(108.0, Vector(Vector(109.0)))), s2(Vector(s0(110.0, Vector(Vector(111.0))), s0(112.0, Vector(Vector(113.0)))), Vector(s0(114.0, Vector(Vector(115.0))), s0(116.0, Vector(Vector(117.0))), s0(118.0, Vector(Vector(119.0)))))))))))
    val v2: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s0(120.0, Vector(Vector(121.0))), s0(122.0, Vector(Vector(123.0)))), Vector(s0(124.0, Vector(Vector(125.0))), s0(126.0, Vector(Vector(127.0))), s0(128.0, Vector(Vector(129.0)))))))
    val v3: Double = 130.0
    val start = nanoTime()
    var result: Double = 130.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}