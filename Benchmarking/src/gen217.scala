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
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s0]
  )
  case class s5 (
    p0: s3,
    p1: Vector[Vector[s0]]
  )
  case class s8 (
    p0: Vector[s4],
    p1: Vector[s5]
  )
  def f19(v0: Double): Double = {
    var v5: Double = v0
    var v7: Double = v0
    var v8: Double = v0
    var v9: Double = v8
    var v6: Double = v0
    var v13: Double = v7
    val v20: Vector[Double] = Vector(v9)
    v8 = v6
    val v15: Double = v20(0)
    var v19: Vector[Double] = v20
    var v28: Vector[Double] = v20
    v28 = v28.updated(0, v5)
    v28 = v19
    var v16: Vector[Double] = v19
    v19 = v19.updated(0, v13)
    var v44: Vector[Double] = v20
    val v21: Double = v16(0)
    val v23: Double = v16(0)
    val v49: Double = v28(0)
    var v42: Vector[Double] = v44
    var v26: Vector[Double] = v44
    v42 = v42.updated(0, v13)
    val v73: Double = v44(0)
    val v85: Vector[Double] = Vector(v73, v21, v9, v23, v13, v5)
    v26 = v26.updated(0, v5)
    var v25: Vector[Double] = v85
    val v50: Double = v26(0)
    v16 = v42
    v42 = v42.updated(0, v49)
    val v101: Vector[Vector[Double]] = Vector(v25, v25, v25, v25, v25)
    var v45: Vector[Vector[Double]] = v101
    v13 = v15
    val v61: Vector[Double] = v45(1)
    val v88: Vector[Double] = v45(1)
    val v177: Vector[Vector[Double]] = Vector(v88, v85)
    var v90: Vector[Vector[Double]] = v177
    v25 = v25.updated(0, v50)
    v45 = v45.updated(2, v85)
    val v102: Vector[Double] = v90(1)
    val v81: Double = v102(2)
    v16 = v16.updated(0, v0)
    v45 = v45.updated(3, v61)
    v81
  }
  @noinline
  def f0(v0: s8, v1: s2, v2: Double): Double = {
    val v3: Double = v2 / v2
    val v29: Double = f19(v3)
    val v48: Double = f19(v29)
    val v52: Double = v48 - v29
    v52
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(Vector(s4(Vector(s3(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s3(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s4(Vector(s3(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), s3(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), s4(Vector(s3(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), s3(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))), Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))), Vector(s5(s3(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), Vector(Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))), s5(s3(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), Vector(Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))), Vector(s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0)))))), s5(s3(Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0)))), Vector(Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0)))), Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))))))
    val v1: s2 = s2(Vector(Vector(s1(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0))))), Vector(s1(s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0)))))), Vector(Vector(s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0)))), Vector(s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0))))))
    val v2: Double = 204.0
    val start = nanoTime()
    var result: Double = 204.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}