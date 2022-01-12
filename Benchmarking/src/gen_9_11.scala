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
    p1: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  case class s5 (
    p0: s2,
    p1: Vector[s2]
  )
  def f88(v0: Double): Double = {
    var v7: Double = v0
    val v4: Double = v7 + v0
    val v1: Double = v7 + v4
    var v6: Double = v1
    var v10: Double = v1
    var v9: Double = v1
    var v3: Double = v7
    val v2: Double = v3 + v6
    var v11: Double = v3
    var v5: Double = v2
    var v21: Double = v1
    var v14: Double = v0
    var v13: Double = v1
    var v15: Double = v5
    var v19: Double = v15
    v10 = v11
    v11 = v21
    var v20: Double = v13
    var v48: Double = v21
    var v16: Double = v1
    var v22: Double = v9
    v7 = v19
    var v27: Double = v15
    var v50: Double = v14
    val v51: Vector[Double] = Vector(v2, v20)
    var v99: Vector[Double] = v51
    v99 = v99.updated(1, v50)
    v99 = v99.updated(0, v22)
    var v39: Vector[Double] = v99
    var v43: Vector[Double] = v39
    v43 = v43.updated(1, v4)
    var v34: Vector[Double] = v39
    v99 = v99.updated(1, v16)
    val v37: Double = v34(1)
    val v44: Double = v51(1)
    var v170: Double = v44
    v34 = v34.updated(1, v1)
    v99 = v99.updated(1, v20)
    val v70: Double = v48 * v10
    var v53: Vector[Double] = v51
    var v71: Double = v170
    val v82: Double = v99(0)
    val v102: Double = v43(0)
    v99 = v99.updated(1, v37)
    val v124: Double = v39(1)
    var v68: Double = v124
    val v57: Double = v53(1)
    v99 = v99.updated(0, v70)
    v53 = v53.updated(1, v68)
    var v56: Double = v82
    val v179: Double = v27 * v102
    v99 = v99.updated(0, v57)
    val v81: Double = v51(0)
    v53 = v53.updated(1, v71)
    v21 = v81
    v6 = v56
    v179
  }
  @noinline
  def f0(v0: Vector[s3], v1: s5, v2: s5, v3: Double): Double = {
    var v6: Double = v3
    var v5: Double = v6
    val v4: Double = f88(v5)
    v5 = v3
    v5 = v3
    val v43: Vector[Double] = Vector(v5)
    var v52: Vector[Double] = v43
    val v61: Double = v52(0)
    val v150: Double = v52(0)
    v52 = v52.updated(0, v61)
    v52 = v52.updated(0, v61)
    val v184: Double = v150 / v4
    v184
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s2(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s2(Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))), s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), s3(Vector(s2(Vector(s1(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))), s1(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), s1(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), s1(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s2(Vector(s1(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))), s1(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)))), s1(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))))), s1(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))))
    val v1: s5 = s5(s2(Vector(s1(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0)))), s1(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), s1(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))), s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))), s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))), s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0)), Vector(Vector(136.0), Vector(137.0)))), s1(s0(Vector(Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))), s1(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0)), Vector(Vector(148.0), Vector(149.0)))))))
    val v2: s5 = s5(s2(Vector(s1(s0(Vector(Vector(150.0)), Vector(Vector(151.0), Vector(152.0))), s0(Vector(Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))), s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0))), s0(Vector(Vector(159.0)), Vector(Vector(160.0), Vector(161.0)))), s1(s0(Vector(Vector(162.0)), Vector(Vector(163.0), Vector(164.0))), s0(Vector(Vector(165.0)), Vector(Vector(166.0), Vector(167.0))))), s1(s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0))), s0(Vector(Vector(171.0)), Vector(Vector(172.0), Vector(173.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(174.0)), Vector(Vector(175.0), Vector(176.0))), s0(Vector(Vector(177.0)), Vector(Vector(178.0), Vector(179.0)))), s1(s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0))), s0(Vector(Vector(183.0)), Vector(Vector(184.0), Vector(185.0)))), s1(s0(Vector(Vector(186.0)), Vector(Vector(187.0), Vector(188.0))), s0(Vector(Vector(189.0)), Vector(Vector(190.0), Vector(191.0))))), s1(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0))), s0(Vector(Vector(195.0)), Vector(Vector(196.0), Vector(197.0)))))))
    val v3: Double = 198.0
    val start = nanoTime()
    var result: Double = 198.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}