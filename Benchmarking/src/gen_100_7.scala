import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Double]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1],
    p2: Vector[s0],
    p3: s0,
    p4: Vector[Vector[s0]]
  )
  case class s5 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  case class s6 (
    p0: s1,
    p1: s5
  )
  def f52(v0: s0): s0 = {
    val v2: Vector[Double] = v0.p3
    val v6: Double = v2(1)
    var v5: Double = v6
    var v8: s0 = v0
    var v4: Vector[Double] = v2
    val v3: Double = v4(2)
    var v10: Double = v6
    v4 = v4.updated(1, v10)
    v4 = v4.updated(1, v5)
    var v11: s0 = v0
    var v13: s0 = v0
    var v12: s0 = v8
    var v14: s0 = v8
    val v23: Double = v2(2)
    val v25: Vector[Vector[Double]] = v8.p1
    var v17: Vector[Vector[Double]] = v25
    val v19: Vector[Double] = v25(1)
    val v16: Vector[Vector[Double]] = v11.p0
    var v42: Vector[Double] = v19
    v17 = v17.updated(1, v42)
    var v20: Vector[Vector[Double]] = v16
    var v18: Vector[Double] = v42
    v11 = v11.copy(p1 = v25)
    v42 = v42.updated(0, v5)
    val v22: Vector[Vector[Double]] = v14.p0
    val v27: Vector[Vector[Vector[Double]]] = Vector(v17)
    v4 = v4.updated(1, v3)
    val v21: Vector[Vector[Double]] = v0.p1
    var v58: Vector[Vector[Double]] = v25
    v4 = v4.updated(1, v10)
    v14 = v14.copy(p1 = v17)
    var v31: Vector[Double] = v19
    v12 = v12.copy(p0 = v20)
    val v55: Vector[Double] = v13.p3
    v20 = v20.updated(0, v42)
    val v32: Vector[Vector[Double]] = v0.p2
    var v127: Vector[Vector[Double]] = v25
    v58 = v58.updated(0, v31)
    val v36: Vector[Double] = v32(1)
    val v30: Vector[Vector[Double]] = v13.p0
    var v98: Vector[Double] = v4
    val v40: Vector[Vector[Double]] = v12.p1
    val v54: Vector[Vector[Double]] = v13.p2
    val v62: Vector[Double] = v22(0)
    var v57: Vector[Vector[Double]] = v21
    v11 = v11.copy(p3 = v55)
    val v79: Vector[Vector[Double]] = v27(0)
    val v103: Vector[Vector[Double]] = v14.p0
    val v100: s0 = s0(v103, v54, v40, v4)
    val v75: Vector[Vector[Double]] = v13.p0
    v11 = v11.copy(p0 = v20)
    val v80: Vector[Vector[Double]] = v0.p2
    v8 = v8.copy(p3 = v98)
    val v118: Vector[s0] = Vector(v11, v12, v100, v14, v100)
    val v119: s0 = v118(0)
    val v122: Vector[Vector[Double]] = v0.p2
    val v68: s0 = v118(4)
    v13 = v13.copy(p2 = v58)
    v31 = v31.updated(0, v23)
    val v161: Vector[Double] = v68.p3
    v11 = v11.copy(p0 = v75)
    v13 = v13.copy(p1 = v122)
    val v108: Vector[Vector[Double]] = v119.p2
    v58 = v58.updated(1, v62)
    val v84: Vector[Vector[Double]] = v13.p0
    val v60: s0 = s0(v20, v127, v79, v161)
    val v153: Vector[Double] = v57(0)
    v20 = v20.updated(0, v18)
    v8 = v8.copy(p0 = v20)
    v14 = v14.copy(p2 = v54)
    v12 = v12.copy(p2 = v108)
    v8 = v8.copy(p0 = v30)
    v58 = v58.updated(1, v36)
    v14 = v14.copy(p1 = v80)
    v127 = v127.updated(0, v153)
    v13 = v13.copy(p0 = v84)
    v20 = v20.updated(0, v31)
    v60
  }
  def f34(v0: s0): s0 = {
    var v8: s0 = v0
    val v6: Vector[Vector[Double]] = v8.p1
    v8 = v8.copy(p1 = v6)
    var v1: s0 = v8
    val v4: Vector[Vector[Double]] = v0.p2
    v1 = v1.copy(p1 = v6)
    v8 = v8.copy(p1 = v4)
    var v7: s0 = v8
    val v9: s0 = f52(v1)
    val v14: s0 = f52(v7)
    val v13: s0 = f52(v8)
    val v18: Vector[Vector[Double]] = v7.p1
    val v23: Vector[Vector[Double]] = v13.p0
    val v34: Vector[Vector[Double]] = v9.p1
    val v28: s0 = f52(v14)
    val v48: Vector[Double] = v28.p3
    var v73: Vector[Vector[Double]] = v23
    val v36: s0 = s0(v73, v18, v34, v48)
    v36
  }
  def f22(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(0)
    val v1: s0 = v0(0)
    val v7: s0 = v0(0)
    val v11: s0 = f34(v4)
    var v10: Vector[s0] = v0
    v10 = v10.updated(0, v7)
    v10 = v10.updated(0, v11)
    val v29: s0 = f52(v1)
    var v35: Vector[s0] = v10
    v35 = v35.updated(0, v29)
    v35 = v35.updated(0, v1)
    v35
  }
  @noinline
  def f0(v0: Vector[s2], v1: s6, v2: Vector[s0], v3: Double): Double = {
    val v6: Vector[s0] = f22(v2)
    val v5: s0 = v6(0)
    val v13: s0 = f52(v5)
    var v15: s0 = v13
    var v18: Vector[s0] = v2
    v18 = v18.updated(0, v5)
    v18 = v6
    v18 = v18.updated(0, v13)
    val v41: s0 = v18(0)
    val v56: s0 = f52(v41)
    var v85: s0 = v15
    val v92: Vector[Vector[Double]] = v85.p0
    v15 = v13
    var v214: s0 = v56
    val v90: s0 = f34(v214)
    val v89: Vector[Vector[Double]] = v214.p2
    val v137: Vector[Double] = v92(0)
    val v133: Double = v137(0)
    v214 = v214.copy(p2 = v89)
    val v105: Vector[Double] = v214.p3
    val v129: Double = v3 - v133
    v15 = v15.copy(p3 = v105)
    v18 = v18.updated(0, v90)
    v129
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(5.0, 6.0, 7.0)), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(13.0, 14.0, 15.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0)))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(29.0, 30.0, 31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)), Vector(37.0, 38.0, 39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(45.0, 46.0, 47.0)), Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(53.0, 54.0, 55.0))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(61.0, 62.0, 63.0))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(69.0, 70.0, 71.0))))), s2(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0)), Vector(77.0, 78.0, 79.0)), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)), Vector(85.0, 86.0, 87.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(93.0, 94.0, 95.0)))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(101.0, 102.0, 103.0)))), Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0)), Vector(109.0, 110.0, 111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0)), Vector(117.0, 118.0, 119.0)), Vector(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)), Vector(125.0, 126.0, 127.0))), Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0), Vector(132.0)), Vector(133.0, 134.0, 135.0))), Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0)), Vector(141.0, 142.0, 143.0))))))
    val v1: s6 = s6(s1(Vector(Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0)), Vector(149.0, 150.0, 151.0)))), s0(Vector(Vector(152.0)), Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0), Vector(156.0)), Vector(157.0, 158.0, 159.0))), s5(s2(Vector(s0(Vector(Vector(160.0)), Vector(Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0)), Vector(165.0, 166.0, 167.0)), s0(Vector(Vector(168.0)), Vector(Vector(169.0), Vector(170.0)), Vector(Vector(171.0), Vector(172.0)), Vector(173.0, 174.0, 175.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(176.0)), Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0), Vector(180.0)), Vector(181.0, 182.0, 183.0)))), s0(Vector(Vector(184.0)), Vector(Vector(185.0), Vector(186.0)), Vector(Vector(187.0), Vector(188.0)), Vector(189.0, 190.0, 191.0)))), Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0), Vector(194.0)), Vector(Vector(195.0), Vector(196.0)), Vector(197.0, 198.0, 199.0))), s0(Vector(Vector(200.0)), Vector(Vector(201.0), Vector(202.0)), Vector(Vector(203.0), Vector(204.0)), Vector(205.0, 206.0, 207.0)), Vector(Vector(s0(Vector(Vector(208.0)), Vector(Vector(209.0), Vector(210.0)), Vector(Vector(211.0), Vector(212.0)), Vector(213.0, 214.0, 215.0))), Vector(s0(Vector(Vector(216.0)), Vector(Vector(217.0), Vector(218.0)), Vector(Vector(219.0), Vector(220.0)), Vector(221.0, 222.0, 223.0))), Vector(s0(Vector(Vector(224.0)), Vector(Vector(225.0), Vector(226.0)), Vector(Vector(227.0), Vector(228.0)), Vector(229.0, 230.0, 231.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(232.0)), Vector(Vector(233.0), Vector(234.0)), Vector(Vector(235.0), Vector(236.0)), Vector(237.0, 238.0, 239.0)))), s0(Vector(Vector(240.0)), Vector(Vector(241.0), Vector(242.0)), Vector(Vector(243.0), Vector(244.0)), Vector(245.0, 246.0, 247.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(248.0)), Vector(Vector(249.0), Vector(250.0)), Vector(Vector(251.0), Vector(252.0)), Vector(253.0, 254.0, 255.0)))), s0(Vector(Vector(256.0)), Vector(Vector(257.0), Vector(258.0)), Vector(Vector(259.0), Vector(260.0)), Vector(261.0, 262.0, 263.0)))))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(264.0)), Vector(Vector(265.0), Vector(266.0)), Vector(Vector(267.0), Vector(268.0)), Vector(269.0, 270.0, 271.0)))
    val v3: Double = 272.0
    val start = nanoTime()
    var result: Double = 272.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}