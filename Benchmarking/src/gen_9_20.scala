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
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s0],
    p2: Vector[Vector[Double]]
  )
  def f37(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v6
    var v2: Double = v3
    var v4: Double = v0
    var v8: Double = v0
    var v5: Double = v4
    val v13: Double = v6 - v5
    var v24: Double = v2
    var v14: Double = v24
    var v10: Double = v0
    val v12: Double = v13 * v3
    var v15: Double = v14
    var v60: Double = v12
    var v28: Double = v8
    v28 = v60
    val v25: Vector[Double] = Vector(v28)
    var v64: Vector[Double] = v25
    var v20: Vector[Double] = v64
    v64 = v64.updated(0, v10)
    val v26: Double = v20(0)
    v20 = v20.updated(0, v14)
    v64 = v64.updated(0, v24)
    v64 = v64.updated(0, v15)
    var v37: Double = v26
    v37
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: Vector[s3], v3: Vector[Vector[s0]], v4: Vector[Vector[s2]], v5: Double): Double = {
    val v10: Vector[Vector[Double]] = v1.p1
    val v19: Double = v5 - v5
    val v33: Vector[Double] = v10(0)
    val v17: Double = f37(v19)
    val v42: Double = v19 * v5
    var v38: Vector[Double] = v33
    val v53: Double = v38(0)
    val v80: Double = f37(v17)
    val v212: Double = v53 * v42
    v38 = v38.updated(0, v80)
    v212
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: s0 = s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: Vector[s3] = Vector(s3(Vector(s2(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(Vector(60.0))), s3(Vector(s2(Vector(Vector(s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0)))), Vector(s0(Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)))), Vector(s0(Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0))))), s1(s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0)))))), Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))), s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)))), Vector(Vector(109.0))))
    val v3: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))))
    val v4: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0), Vector(121.0)))), Vector(s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), Vector(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0), Vector(132.0), Vector(133.0))))), s1(s0(Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0), Vector(145.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))), Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0), Vector(157.0)))), Vector(s0(Vector(Vector(158.0), Vector(159.0), Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))))), s1(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), Vector(Vector(167.0), Vector(168.0), Vector(169.0))), s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))))), Vector(s2(Vector(Vector(s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0), Vector(181.0)))), Vector(s0(Vector(Vector(182.0), Vector(183.0), Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)))), Vector(s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), Vector(Vector(191.0), Vector(192.0), Vector(193.0))))), s1(s0(Vector(Vector(194.0), Vector(195.0), Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0), Vector(205.0)))))))
    val v5: Double = 206.0
    val start = nanoTime()
    var result: Double = 206.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}