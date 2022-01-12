import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0],
    p2: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  case class s7 (
    p0: Vector[s1],
    p1: Vector[s3],
    p2: s3,
    p3: s2
  )
  def f29(v0: s7): s7 = {
    val v7: Vector[s3] = v0.p1
    val v4: s3 = v7(0)
    var v2: s7 = v0
    val v5: Vector[s3] = v0.p1
    v2 = v2.copy(p2 = v4)
    v2 = v2.copy(p1 = v5)
    val v10: s3 = v0.p2
    val v14: Vector[s3] = v2.p1
    var v21: s7 = v0
    v21 = v21.copy(p2 = v10)
    var v16: s7 = v21
    var v23: s7 = v16
    v23 = v23.copy(p1 = v5)
    v21 = v21.copy(p2 = v4)
    v23 = v23.copy(p1 = v14)
    v23
  }
  def f26(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v4
    val v2: Vector[Vector[Double]] = v0.p0
    var v5: s0 = v0
    val v10: Vector[Double] = v5.p1
    var v3: Vector[Vector[Double]] = v4
    val v7: Vector[Double] = v2(0)
    v5 = v5.copy(p1 = v10)
    var v8: s0 = v5
    val v11: Vector[Vector[Double]] = v5.p0
    v8 = v5
    v5 = v5.copy(p0 = v2)
    var v31: Vector[Vector[Double]] = v2
    v8 = v8.copy(p0 = v6)
    v8 = v8.copy(p0 = v31)
    val v69: s0 = s0(v11, v10)
    v5 = v5.copy(p0 = v4)
    val v36: Double = v7(0)
    v6 = v6.updated(1, v7)
    val v32: Vector[Double] = v2(1)
    v6 = v4
    val v38: Vector[Vector[Double]] = v69.p0
    v8 = v8.copy(p0 = v11)
    v8 = v8.copy(p0 = v6)
    val v29: Vector[Double] = v31(0)
    v8 = v8.copy(p0 = v31)
    var v34: s0 = v0
    v6 = v6.updated(0, v32)
    v31 = v31.updated(0, v32)
    v5 = v5.copy(p0 = v4)
    v31 = v31.updated(1, v29)
    v3 = v3.updated(1, v29)
    val v137: Vector[Vector[Double]] = v34.p0
    var v68: Vector[Double] = v29
    val v74: Vector[Double] = v69.p1
    val v46: Vector[Double] = v38(0)
    v6 = v137
    v31 = v31.updated(0, v68)
    v8 = v8.copy(p1 = v74)
    var v78: s0 = v34
    val v81: Vector[Double] = v78.p1
    v8 = v34
    v68 = v68.updated(0, v36)
    v8 = v8.copy(p1 = v81)
    var v93: Vector[Double] = v32
    v8 = v8.copy(p0 = v31)
    v8 = v8.copy(p0 = v3)
    v3 = v3.updated(0, v93)
    v6 = v6.updated(1, v46)
    v8
  }
  def f16(v0: s2, v1: s7): s2 = {
    var v6: s2 = v0
    val v9: s0 = v6.p2
    val v21: s0 = f26(v9)
    val v12: Vector[s0] = v6.p1
    v6 = v6.copy(p2 = v21)
    var v4: s2 = v6
    var v11: s2 = v6
    val v23: Vector[s2] = Vector(v11, v11, v4, v0)
    v6 = v6.copy(p1 = v12)
    val v201: s2 = v23(2)
    v201
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v3: s2 = v0.p3
    val v4: s3 = v0.p2
    val v7: s7 = f29(v0)
    val v8: s2 = f16(v3, v7)
    val v9: Vector[s0] = v4.p0
    var v16: Vector[s0] = v9
    val v13: s0 = v16(0)
    val v17: Vector[s0] = v4.p0
    val v12: s0 = f26(v13)
    val v15: s0 = v8.p2
    val v18: Vector[Vector[Double]] = v15.p0
    var v28: Vector[Vector[Double]] = v18
    v28 = v18
    var v36: s0 = v13
    v36 = v36.copy(p0 = v28)
    val v38: s0 = f26(v12)
    v16 = v17
    val v54: Vector[Vector[Double]] = v38.p0
    val v24: Vector[Double] = v54(1)
    val v35: Vector[Vector[Double]] = v36.p0
    v36 = v36.copy(p0 = v18)
    v36 = v36.copy(p0 = v18)
    v36 = v36.copy(p0 = v35)
    val v56: Vector[Double] = v35(1)
    v28 = v28.updated(0, v24)
    val v162: Double = v56(0)
    v162
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0, 4.0)), s0(Vector(Vector(5.0), Vector(6.0)), Vector(7.0, 8.0, 9.0)), s0(Vector(Vector(10.0), Vector(11.0)), Vector(12.0, 13.0, 14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(17.0, 18.0, 19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(22.0, 23.0, 24.0)), s0(Vector(Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0)))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(32.0, 33.0, 34.0)), s0(Vector(Vector(35.0), Vector(36.0)), Vector(37.0, 38.0, 39.0)), s0(Vector(Vector(40.0), Vector(41.0)), Vector(42.0, 43.0, 44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(47.0, 48.0, 49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(52.0, 53.0, 54.0)), s0(Vector(Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0)))), s1(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(62.0, 63.0, 64.0)), s0(Vector(Vector(65.0), Vector(66.0)), Vector(67.0, 68.0, 69.0)), s0(Vector(Vector(70.0), Vector(71.0)), Vector(72.0, 73.0, 74.0))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(77.0, 78.0, 79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(82.0, 83.0, 84.0)), s0(Vector(Vector(85.0), Vector(86.0)), Vector(87.0, 88.0, 89.0))))), Vector(s3(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(92.0, 93.0, 94.0))), Vector(s2(s1(Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(97.0, 98.0, 99.0)), s0(Vector(Vector(100.0), Vector(101.0)), Vector(102.0, 103.0, 104.0)), s0(Vector(Vector(105.0), Vector(106.0)), Vector(107.0, 108.0, 109.0))), Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(112.0, 113.0, 114.0))), Vector(s0(Vector(Vector(115.0), Vector(116.0)), Vector(117.0, 118.0, 119.0)), s0(Vector(Vector(120.0), Vector(121.0)), Vector(122.0, 123.0, 124.0)))), Vector(s0(Vector(Vector(125.0), Vector(126.0)), Vector(127.0, 128.0, 129.0)), s0(Vector(Vector(130.0), Vector(131.0)), Vector(132.0, 133.0, 134.0)), s0(Vector(Vector(135.0), Vector(136.0)), Vector(137.0, 138.0, 139.0))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(142.0, 143.0, 144.0))), s2(s1(Vector(s0(Vector(Vector(145.0), Vector(146.0)), Vector(147.0, 148.0, 149.0)), s0(Vector(Vector(150.0), Vector(151.0)), Vector(152.0, 153.0, 154.0)), s0(Vector(Vector(155.0), Vector(156.0)), Vector(157.0, 158.0, 159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(162.0, 163.0, 164.0))), Vector(s0(Vector(Vector(165.0), Vector(166.0)), Vector(167.0, 168.0, 169.0)), s0(Vector(Vector(170.0), Vector(171.0)), Vector(172.0, 173.0, 174.0)))), Vector(s0(Vector(Vector(175.0), Vector(176.0)), Vector(177.0, 178.0, 179.0)), s0(Vector(Vector(180.0), Vector(181.0)), Vector(182.0, 183.0, 184.0)), s0(Vector(Vector(185.0), Vector(186.0)), Vector(187.0, 188.0, 189.0))), s0(Vector(Vector(190.0), Vector(191.0)), Vector(192.0, 193.0, 194.0)))))), s3(Vector(s0(Vector(Vector(195.0), Vector(196.0)), Vector(197.0, 198.0, 199.0))), Vector(s2(s1(Vector(s0(Vector(Vector(200.0), Vector(201.0)), Vector(202.0, 203.0, 204.0)), s0(Vector(Vector(205.0), Vector(206.0)), Vector(207.0, 208.0, 209.0)), s0(Vector(Vector(210.0), Vector(211.0)), Vector(212.0, 213.0, 214.0))), Vector(s0(Vector(Vector(215.0), Vector(216.0)), Vector(217.0, 218.0, 219.0))), Vector(s0(Vector(Vector(220.0), Vector(221.0)), Vector(222.0, 223.0, 224.0)), s0(Vector(Vector(225.0), Vector(226.0)), Vector(227.0, 228.0, 229.0)))), Vector(s0(Vector(Vector(230.0), Vector(231.0)), Vector(232.0, 233.0, 234.0)), s0(Vector(Vector(235.0), Vector(236.0)), Vector(237.0, 238.0, 239.0)), s0(Vector(Vector(240.0), Vector(241.0)), Vector(242.0, 243.0, 244.0))), s0(Vector(Vector(245.0), Vector(246.0)), Vector(247.0, 248.0, 249.0))), s2(s1(Vector(s0(Vector(Vector(250.0), Vector(251.0)), Vector(252.0, 253.0, 254.0)), s0(Vector(Vector(255.0), Vector(256.0)), Vector(257.0, 258.0, 259.0)), s0(Vector(Vector(260.0), Vector(261.0)), Vector(262.0, 263.0, 264.0))), Vector(s0(Vector(Vector(265.0), Vector(266.0)), Vector(267.0, 268.0, 269.0))), Vector(s0(Vector(Vector(270.0), Vector(271.0)), Vector(272.0, 273.0, 274.0)), s0(Vector(Vector(275.0), Vector(276.0)), Vector(277.0, 278.0, 279.0)))), Vector(s0(Vector(Vector(280.0), Vector(281.0)), Vector(282.0, 283.0, 284.0)), s0(Vector(Vector(285.0), Vector(286.0)), Vector(287.0, 288.0, 289.0)), s0(Vector(Vector(290.0), Vector(291.0)), Vector(292.0, 293.0, 294.0))), s0(Vector(Vector(295.0), Vector(296.0)), Vector(297.0, 298.0, 299.0))))), s2(s1(Vector(s0(Vector(Vector(300.0), Vector(301.0)), Vector(302.0, 303.0, 304.0)), s0(Vector(Vector(305.0), Vector(306.0)), Vector(307.0, 308.0, 309.0)), s0(Vector(Vector(310.0), Vector(311.0)), Vector(312.0, 313.0, 314.0))), Vector(s0(Vector(Vector(315.0), Vector(316.0)), Vector(317.0, 318.0, 319.0))), Vector(s0(Vector(Vector(320.0), Vector(321.0)), Vector(322.0, 323.0, 324.0)), s0(Vector(Vector(325.0), Vector(326.0)), Vector(327.0, 328.0, 329.0)))), Vector(s0(Vector(Vector(330.0), Vector(331.0)), Vector(332.0, 333.0, 334.0)), s0(Vector(Vector(335.0), Vector(336.0)), Vector(337.0, 338.0, 339.0)), s0(Vector(Vector(340.0), Vector(341.0)), Vector(342.0, 343.0, 344.0))), s0(Vector(Vector(345.0), Vector(346.0)), Vector(347.0, 348.0, 349.0))))
    val v1: Double = 350.0
    val start = nanoTime()
    var result: Double = 350.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}