import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s3]],
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: s4
  )
  def f71(v0: s4): s4 = {
    v0
  }
  def f11(v0: s5): s5 = {
    val v4: s0 = v0.p0
    val v11: s4 = v0.p1
    val v7: s4 = f71(v11)
    val v13: s1 = v7.p1
    val v25: s0 = v0.p0
    var v36: s4 = v11
    var v14: s5 = v0
    val v48: Vector[Vector[s3]] = v36.p0
    v14 = v14.copy(p1 = v7)
    val v22: s4 = f71(v11)
    v14 = v14.copy(p0 = v4)
    val v79: s4 = s4(v48, v13)
    v14 = v14.copy(p1 = v79)
    v14 = v14.copy(p1 = v22)
    v14 = v14.copy(p0 = v25)
    v14
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v6: s5 = v0(0)
    val v10: s5 = f11(v6)
    val v8: s0 = v10.p0
    val v35: Vector[Vector[Double]] = v8.p1
    val v26: Vector[Double] = v35(1)
    val v16: Double = v26(0)
    var v86: Double = v16
    v86
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s4(Vector(Vector(s3(Vector(s1(Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(s3(Vector(s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))))), s1(Vector(Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))))), s5(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s4(Vector(Vector(s3(Vector(s1(Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))), Vector(s3(Vector(s1(Vector(Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))))), s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)))))), s1(Vector(Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))), s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0))))))))
    val v1: Double = 150.0
    val start = nanoTime()
    var result: Double = 150.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}