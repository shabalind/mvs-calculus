import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s4 (
    p0: s2,
    p1: Vector[Vector[s3]]
  )
  case class s5 (
    p0: s1,
    p1: s0
  )
  case class s9 (
    p0: s5,
    p1: s4,
    p2: Vector[s3]
  )
  def f53(v0: Double): Double = {
    var v1: Double = v0
    var v4: Double = v1
    var v2: Double = v0
    v2 = v0
    var v6: Double = v2
    var v7: Double = v6
    var v12: Double = v0
    var v5: Double = v12
    var v3: Double = v12
    var v8: Double = v0
    v3 = v5
    var v14: Double = v5
    var v19: Double = v12
    var v13: Double = v6
    var v17: Double = v4
    val v15: Double = v13 / v19
    var v24: Double = v13
    v17 = v3
    val v18: Vector[Double] = Vector(v17, v7, v6, v13, v13)
    var v28: Vector[Double] = v18
    var v27: Vector[Double] = v18
    v28 = v28.updated(4, v0)
    var v31: Vector[Double] = v27
    v28 = v28.updated(4, v14)
    var v74: Vector[Double] = v18
    val v69: Double = v28(2)
    var v32: Vector[Double] = v28
    val v21: Double = v28(4)
    v32 = v32.updated(2, v13)
    v31 = v31.updated(1, v13)
    v74 = v74.updated(4, v8)
    var v43: Vector[Double] = v31
    v31 = v31.updated(3, v69)
    var v42: Double = v24
    v74 = v74.updated(2, v19)
    v42 = v24
    var v40: Vector[Double] = v43
    var v49: Double = v3
    v43 = v43.updated(0, v1)
    val v59: Vector[Vector[Double]] = Vector(v40, v32, v40, v32, v32)
    var v65: Vector[Vector[Double]] = v59
    v32 = v32.updated(1, v42)
    v43 = v43.updated(3, v4)
    v65 = v65.updated(0, v74)
    v28 = v28.updated(3, v15)
    v40 = v40.updated(4, v14)
    v4 = v49
    val v104: Vector[Vector[Vector[Double]]] = Vector(v65, v59, v59)
    var v86: Vector[Vector[Vector[Double]]] = v104
    v32 = v32.updated(0, v21)
    val v57: Vector[Vector[Double]] = v86(2)
    val v63: Vector[Double] = v57(0)
    v65 = v65.updated(4, v43)
    val v53: Double = v63(0)
    v53
  }
  @noinline
  def f0(v0: s4, v1: s9, v2: Double): Double = {
    val v5: Double = f53(v2)
    val v13: Double = v5 * v5
    val v74: Double = f53(v13)
    v74
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(Vector(s3(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s2(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))), Vector(s3(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s2(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), Vector(s3(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s2(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))))))
    val v1: s9 = s9(s5(s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), s4(s2(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(Vector(s3(Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), s2(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))))), Vector(s3(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), s2(Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))))), Vector(s3(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), s2(Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0)))), s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))))))), Vector(s3(Vector(s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), s0(Vector(Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0), Vector(163.0)))), s2(Vector(s0(Vector(Vector(164.0)), Vector(Vector(165.0), Vector(166.0), Vector(167.0)))), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0), Vector(171.0))))), s3(Vector(s0(Vector(Vector(172.0)), Vector(Vector(173.0), Vector(174.0), Vector(175.0))), s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0), Vector(182.0), Vector(183.0)))), s2(Vector(s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0), Vector(187.0)))), s0(Vector(Vector(188.0)), Vector(Vector(189.0), Vector(190.0), Vector(191.0))))), s3(Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0), Vector(195.0))), s0(Vector(Vector(196.0)), Vector(Vector(197.0), Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), s2(Vector(s0(Vector(Vector(204.0)), Vector(Vector(205.0), Vector(206.0), Vector(207.0)))), s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0), Vector(211.0)))))))
    val v2: Double = 212.0
    val start = nanoTime()
    var result: Double = 212.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}