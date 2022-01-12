import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  case class s4 (
    p0: s3,
    p1: Vector[s3]
  )
  case class s5 (
    p0: Vector[Vector[s4]],
    p1: Vector[Vector[s1]]
  )
  def f57(v0: s0): s0 = {
    var v3: s0 = v0
    var v2: s0 = v3
    val v6: Vector[Double] = v2.p1
    var v11: s0 = v3
    val v5: Vector[Double] = v2.p1
    val v7: Double = v6(1)
    val v13: Double = v5(0)
    var v4: Double = v13
    val v21: Double = v5(1)
    var v1: s0 = v3
    val v30: Vector[Double] = v1.p1
    var v15: Vector[Double] = v5
    v4 = v13
    var v18: Vector[Double] = v15
    v18 = v18.updated(0, v7)
    v15 = v15.updated(0, v4)
    var v9: s0 = v1
    v1 = v1.copy(p1 = v6)
    v3 = v3.copy(p1 = v30)
    var v29: s0 = v2
    val v35: Double = v30(0)
    v1 = v9
    v18 = v18.updated(1, v13)
    v2 = v2.copy(p1 = v15)
    val v25: Double = v15(0)
    val v22: Vector[Double] = v1.p1
    val v19: Vector[Vector[Double]] = Vector(v5, v18, v5)
    var v36: Vector[Double] = v22
    var v31: Vector[Double] = v36
    val v14: Vector[Vector[Double]] = v0.p0
    v15 = v15.updated(1, v35)
    v2 = v2.copy(p0 = v14)
    v36 = v18
    val v24: Vector[Double] = v14(0)
    v15 = v15.updated(1, v4)
    v1 = v1.copy(p0 = v14)
    val v58: s0 = s0(v14, v15)
    val v85: Vector[Double] = v14(0)
    v18 = v18.updated(0, v21)
    var v41: Vector[Double] = v85
    var v28: Vector[Vector[Double]] = v14
    val v83: Vector[Double] = v29.p1
    val v49: Vector[Vector[Double]] = v29.p0
    v3 = v3.copy(p1 = v83)
    v11 = v11.copy(p0 = v28)
    var v121: Vector[Vector[Double]] = v19
    val v43: Vector[Double] = v121(1)
    v1 = v1.copy(p1 = v18)
    var v118: s0 = v0
    val v65: Vector[Vector[Double]] = v11.p0
    var v53: Vector[Vector[Double]] = v65
    v2 = v2.copy(p0 = v49)
    var v51: Vector[Vector[Double]] = v53
    v1 = v1.copy(p0 = v51)
    v15 = v15.updated(1, v25)
    v1 = v1.copy(p1 = v43)
    var v88: Vector[Double] = v31
    var v148: Vector[Double] = v41
    var v63: Vector[Vector[Double]] = v49
    var v66: s0 = v11
    v2 = v2.copy(p0 = v63)
    val v96: Vector[Vector[Double]] = v11.p0
    v118 = v118.copy(p0 = v53)
    v9 = v9.copy(p0 = v49)
    v66 = v66.copy(p0 = v14)
    v63 = v63.updated(0, v24)
    v3 = v3.copy(p0 = v51)
    v66 = v66.copy(p1 = v88)
    val v97: Double = v83(0)
    val v135: Double = v43(0)
    var v71: Vector[Double] = v148
    val v62: Vector[Double] = v66.p1
    v2 = v118
    val v175: Vector[Double] = v14(0)
    v53 = v53.updated(0, v175)
    v66 = v66.copy(p1 = v62)
    v2 = v2.copy(p0 = v65)
    val v626: Vector[Double] = v58.p1
    v66 = v66.copy(p1 = v6)
    v9 = v9.copy(p1 = v626)
    v15 = v15.updated(0, v135)
    v51 = v51.updated(0, v71)
    v66 = v66.copy(p0 = v96)
    v148 = v148.updated(0, v97)
    v66
  }
  def f37(v0: s0, v1: s0): s0 = {
    var v2: s0 = v0
    val v5: s0 = f57(v2)
    val v10: Vector[Double] = v2.p1
    val v9: Vector[Vector[Double]] = v2.p0
    v2 = v2.copy(p1 = v10)
    val v16: s0 = s0(v9, v10)
    val v12: s0 = f57(v16)
    val v27: s0 = f57(v2)
    val v29: Vector[Vector[Double]] = v27.p0
    val v15: Vector[Double] = v29(0)
    val v25: Vector[Vector[Double]] = v5.p0
    v2 = v2.copy(p0 = v9)
    var v26: Vector[Vector[Double]] = v25
    var v24: Vector[Vector[Double]] = v9
    v2 = v2.copy(p0 = v26)
    v2 = v2.copy(p0 = v24)
    val v38: Vector[Double] = v0.p1
    var v67: Vector[Double] = v10
    var v60: Vector[Double] = v67
    v26 = v26.updated(0, v15)
    val v105: Double = v38(0)
    v67 = v67.updated(0, v105)
    v2 = v2.copy(p1 = v60)
    v12
  }
  def f6(v0: s0): s0 = {
    val v2: s0 = f57(v0)
    val v4: s0 = f57(v0)
    var v7: s0 = v0
    val v5: Vector[Double] = v2.p1
    v7 = v7.copy(p1 = v5)
    v7 = v7.copy(p1 = v5)
    val v1: s0 = f37(v4, v0)
    val v3: s0 = f57(v4)
    val v9: s0 = f57(v1)
    val v6: Vector[Double] = v4.p1
    val v12: Double = v5(0)
    v7 = v7.copy(p1 = v5)
    val v17: Vector[Double] = v9.p1
    val v16: Vector[Vector[Double]] = v9.p0
    val v13: Vector[Double] = v1.p1
    var v14: Double = v12
    val v15: Double = v17(0)
    val v29: Vector[Vector[Double]] = v0.p0
    val v25: s0 = f57(v3)
    v7 = v7.copy(p0 = v16)
    val v20: Vector[Double] = Vector(v15, v14)
    v7 = v7.copy(p1 = v20)
    v7 = v7.copy(p0 = v16)
    val v86: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v86)
    var v19: s0 = v0
    val v21: Vector[Vector[Double]] = v19.p0
    v7 = v7.copy(p0 = v29)
    val v34: s0 = f37(v1, v3)
    var v58: s0 = v4
    v58 = v58.copy(p1 = v6)
    val v62: Vector[Double] = v1.p1
    var v116: s0 = v58
    v58 = v7
    val v51: Vector[Vector[Double]] = v25.p0
    val v74: Vector[Double] = v116.p1
    val v38: Vector[Double] = v9.p1
    val v39: Vector[Vector[Double]] = v25.p0
    val v76: s0 = f57(v1)
    v19 = v19.copy(p1 = v62)
    val v64: Vector[Double] = v7.p1
    val v80: s0 = f37(v34, v0)
    v7 = v7.copy(p1 = v74)
    v58 = v58.copy(p1 = v13)
    v19 = v19.copy(p0 = v16)
    val v60: s0 = f37(v116, v76)
    v7 = v7.copy(p1 = v13)
    v7 = v7.copy(p1 = v64)
    v58 = v58.copy(p1 = v5)
    v58 = v58.copy(p0 = v86)
    v58 = v58.copy(p0 = v16)
    val v247: Vector[Double] = v7.p1
    v58 = v58.copy(p1 = v17)
    v116 = v116.copy(p0 = v39)
    v116 = v116.copy(p0 = v51)
    val v63: s0 = f37(v2, v80)
    val v217: Vector[Vector[Double]] = v63.p0
    v7 = v7.copy(p1 = v74)
    v7 = v7.copy(p0 = v217)
    val v202: Vector[Vector[Double]] = v19.p0
    v58 = v58.copy(p1 = v38)
    v116 = v116.copy(p1 = v247)
    v19 = v19.copy(p0 = v202)
    v116 = v116.copy(p0 = v21)
    v7 = v7.copy(p1 = v64)
    v60
  }
  @noinline
  def f0(v0: Vector[s1], v1: s5, v2: Double): Double = {
    val v18: s1 = v0(1)
    val v28: s0 = v18.p1
    val v36: s0 = f6(v28)
    val v22: s0 = f6(v36)
    val v23: Vector[Double] = v22.p1
    var v39: Vector[Double] = v23
    v39 = v39.updated(1, v2)
    val v83: Double = v39(0)
    v39 = v39.updated(0, v2)
    v83
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(1.0, 2.0)), s0(Vector(Vector(3.0)), Vector(4.0, 5.0))), s0(Vector(Vector(6.0)), Vector(7.0, 8.0))), s1(Vector(s0(Vector(Vector(9.0)), Vector(10.0, 11.0)), s0(Vector(Vector(12.0)), Vector(13.0, 14.0))), s0(Vector(Vector(15.0)), Vector(16.0, 17.0))))
    val v1: s5 = s5(Vector(Vector(s4(s3(s1(Vector(s0(Vector(Vector(18.0)), Vector(19.0, 20.0)), s0(Vector(Vector(21.0)), Vector(22.0, 23.0))), s0(Vector(Vector(24.0)), Vector(25.0, 26.0))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(27.0)), Vector(28.0, 29.0)), s0(Vector(Vector(30.0)), Vector(31.0, 32.0))), s0(Vector(Vector(33.0)), Vector(34.0, 35.0))), s1(Vector(s0(Vector(Vector(36.0)), Vector(37.0, 38.0)), s0(Vector(Vector(39.0)), Vector(40.0, 41.0))), s0(Vector(Vector(42.0)), Vector(43.0, 44.0)))), s0(Vector(Vector(45.0)), Vector(46.0, 47.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(48.0)), Vector(49.0, 50.0)), s0(Vector(Vector(51.0)), Vector(52.0, 53.0))), s0(Vector(Vector(54.0)), Vector(55.0, 56.0))), s1(Vector(s0(Vector(Vector(57.0)), Vector(58.0, 59.0)), s0(Vector(Vector(60.0)), Vector(61.0, 62.0))), s0(Vector(Vector(63.0)), Vector(64.0, 65.0)))), s0(Vector(Vector(66.0)), Vector(67.0, 68.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(69.0)), Vector(70.0, 71.0)), s0(Vector(Vector(72.0)), Vector(73.0, 74.0))), s0(Vector(Vector(75.0)), Vector(76.0, 77.0))), s1(Vector(s0(Vector(Vector(78.0)), Vector(79.0, 80.0)), s0(Vector(Vector(81.0)), Vector(82.0, 83.0))), s0(Vector(Vector(84.0)), Vector(85.0, 86.0)))), s0(Vector(Vector(87.0)), Vector(88.0, 89.0)))))), Vector(s3(s1(Vector(s0(Vector(Vector(90.0)), Vector(91.0, 92.0)), s0(Vector(Vector(93.0)), Vector(94.0, 95.0))), s0(Vector(Vector(96.0)), Vector(97.0, 98.0))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(99.0)), Vector(100.0, 101.0)), s0(Vector(Vector(102.0)), Vector(103.0, 104.0))), s0(Vector(Vector(105.0)), Vector(106.0, 107.0))), s1(Vector(s0(Vector(Vector(108.0)), Vector(109.0, 110.0)), s0(Vector(Vector(111.0)), Vector(112.0, 113.0))), s0(Vector(Vector(114.0)), Vector(115.0, 116.0)))), s0(Vector(Vector(117.0)), Vector(118.0, 119.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(120.0)), Vector(121.0, 122.0)), s0(Vector(Vector(123.0)), Vector(124.0, 125.0))), s0(Vector(Vector(126.0)), Vector(127.0, 128.0))), s1(Vector(s0(Vector(Vector(129.0)), Vector(130.0, 131.0)), s0(Vector(Vector(132.0)), Vector(133.0, 134.0))), s0(Vector(Vector(135.0)), Vector(136.0, 137.0)))), s0(Vector(Vector(138.0)), Vector(139.0, 140.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(141.0)), Vector(142.0, 143.0)), s0(Vector(Vector(144.0)), Vector(145.0, 146.0))), s0(Vector(Vector(147.0)), Vector(148.0, 149.0))), s1(Vector(s0(Vector(Vector(150.0)), Vector(151.0, 152.0)), s0(Vector(Vector(153.0)), Vector(154.0, 155.0))), s0(Vector(Vector(156.0)), Vector(157.0, 158.0)))), s0(Vector(Vector(159.0)), Vector(160.0, 161.0)))))), s3(s1(Vector(s0(Vector(Vector(162.0)), Vector(163.0, 164.0)), s0(Vector(Vector(165.0)), Vector(166.0, 167.0))), s0(Vector(Vector(168.0)), Vector(169.0, 170.0))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(171.0)), Vector(172.0, 173.0)), s0(Vector(Vector(174.0)), Vector(175.0, 176.0))), s0(Vector(Vector(177.0)), Vector(178.0, 179.0))), s1(Vector(s0(Vector(Vector(180.0)), Vector(181.0, 182.0)), s0(Vector(Vector(183.0)), Vector(184.0, 185.0))), s0(Vector(Vector(186.0)), Vector(187.0, 188.0)))), s0(Vector(Vector(189.0)), Vector(190.0, 191.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(192.0)), Vector(193.0, 194.0)), s0(Vector(Vector(195.0)), Vector(196.0, 197.0))), s0(Vector(Vector(198.0)), Vector(199.0, 200.0))), s1(Vector(s0(Vector(Vector(201.0)), Vector(202.0, 203.0)), s0(Vector(Vector(204.0)), Vector(205.0, 206.0))), s0(Vector(Vector(207.0)), Vector(208.0, 209.0)))), s0(Vector(Vector(210.0)), Vector(211.0, 212.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(213.0)), Vector(214.0, 215.0)), s0(Vector(Vector(216.0)), Vector(217.0, 218.0))), s0(Vector(Vector(219.0)), Vector(220.0, 221.0))), s1(Vector(s0(Vector(Vector(222.0)), Vector(223.0, 224.0)), s0(Vector(Vector(225.0)), Vector(226.0, 227.0))), s0(Vector(Vector(228.0)), Vector(229.0, 230.0)))), s0(Vector(Vector(231.0)), Vector(232.0, 233.0))))))))), Vector(s4(s3(s1(Vector(s0(Vector(Vector(234.0)), Vector(235.0, 236.0)), s0(Vector(Vector(237.0)), Vector(238.0, 239.0))), s0(Vector(Vector(240.0)), Vector(241.0, 242.0))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(243.0)), Vector(244.0, 245.0)), s0(Vector(Vector(246.0)), Vector(247.0, 248.0))), s0(Vector(Vector(249.0)), Vector(250.0, 251.0))), s1(Vector(s0(Vector(Vector(252.0)), Vector(253.0, 254.0)), s0(Vector(Vector(255.0)), Vector(256.0, 257.0))), s0(Vector(Vector(258.0)), Vector(259.0, 260.0)))), s0(Vector(Vector(261.0)), Vector(262.0, 263.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(264.0)), Vector(265.0, 266.0)), s0(Vector(Vector(267.0)), Vector(268.0, 269.0))), s0(Vector(Vector(270.0)), Vector(271.0, 272.0))), s1(Vector(s0(Vector(Vector(273.0)), Vector(274.0, 275.0)), s0(Vector(Vector(276.0)), Vector(277.0, 278.0))), s0(Vector(Vector(279.0)), Vector(280.0, 281.0)))), s0(Vector(Vector(282.0)), Vector(283.0, 284.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(285.0)), Vector(286.0, 287.0)), s0(Vector(Vector(288.0)), Vector(289.0, 290.0))), s0(Vector(Vector(291.0)), Vector(292.0, 293.0))), s1(Vector(s0(Vector(Vector(294.0)), Vector(295.0, 296.0)), s0(Vector(Vector(297.0)), Vector(298.0, 299.0))), s0(Vector(Vector(300.0)), Vector(301.0, 302.0)))), s0(Vector(Vector(303.0)), Vector(304.0, 305.0)))))), Vector(s3(s1(Vector(s0(Vector(Vector(306.0)), Vector(307.0, 308.0)), s0(Vector(Vector(309.0)), Vector(310.0, 311.0))), s0(Vector(Vector(312.0)), Vector(313.0, 314.0))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(315.0)), Vector(316.0, 317.0)), s0(Vector(Vector(318.0)), Vector(319.0, 320.0))), s0(Vector(Vector(321.0)), Vector(322.0, 323.0))), s1(Vector(s0(Vector(Vector(324.0)), Vector(325.0, 326.0)), s0(Vector(Vector(327.0)), Vector(328.0, 329.0))), s0(Vector(Vector(330.0)), Vector(331.0, 332.0)))), s0(Vector(Vector(333.0)), Vector(334.0, 335.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(336.0)), Vector(337.0, 338.0)), s0(Vector(Vector(339.0)), Vector(340.0, 341.0))), s0(Vector(Vector(342.0)), Vector(343.0, 344.0))), s1(Vector(s0(Vector(Vector(345.0)), Vector(346.0, 347.0)), s0(Vector(Vector(348.0)), Vector(349.0, 350.0))), s0(Vector(Vector(351.0)), Vector(352.0, 353.0)))), s0(Vector(Vector(354.0)), Vector(355.0, 356.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(357.0)), Vector(358.0, 359.0)), s0(Vector(Vector(360.0)), Vector(361.0, 362.0))), s0(Vector(Vector(363.0)), Vector(364.0, 365.0))), s1(Vector(s0(Vector(Vector(366.0)), Vector(367.0, 368.0)), s0(Vector(Vector(369.0)), Vector(370.0, 371.0))), s0(Vector(Vector(372.0)), Vector(373.0, 374.0)))), s0(Vector(Vector(375.0)), Vector(376.0, 377.0)))))), s3(s1(Vector(s0(Vector(Vector(378.0)), Vector(379.0, 380.0)), s0(Vector(Vector(381.0)), Vector(382.0, 383.0))), s0(Vector(Vector(384.0)), Vector(385.0, 386.0))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(387.0)), Vector(388.0, 389.0)), s0(Vector(Vector(390.0)), Vector(391.0, 392.0))), s0(Vector(Vector(393.0)), Vector(394.0, 395.0))), s1(Vector(s0(Vector(Vector(396.0)), Vector(397.0, 398.0)), s0(Vector(Vector(399.0)), Vector(400.0, 401.0))), s0(Vector(Vector(402.0)), Vector(403.0, 404.0)))), s0(Vector(Vector(405.0)), Vector(406.0, 407.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(408.0)), Vector(409.0, 410.0)), s0(Vector(Vector(411.0)), Vector(412.0, 413.0))), s0(Vector(Vector(414.0)), Vector(415.0, 416.0))), s1(Vector(s0(Vector(Vector(417.0)), Vector(418.0, 419.0)), s0(Vector(Vector(420.0)), Vector(421.0, 422.0))), s0(Vector(Vector(423.0)), Vector(424.0, 425.0)))), s0(Vector(Vector(426.0)), Vector(427.0, 428.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(429.0)), Vector(430.0, 431.0)), s0(Vector(Vector(432.0)), Vector(433.0, 434.0))), s0(Vector(Vector(435.0)), Vector(436.0, 437.0))), s1(Vector(s0(Vector(Vector(438.0)), Vector(439.0, 440.0)), s0(Vector(Vector(441.0)), Vector(442.0, 443.0))), s0(Vector(Vector(444.0)), Vector(445.0, 446.0)))), s0(Vector(Vector(447.0)), Vector(448.0, 449.0)))))))))), Vector(Vector(s1(Vector(s0(Vector(Vector(450.0)), Vector(451.0, 452.0)), s0(Vector(Vector(453.0)), Vector(454.0, 455.0))), s0(Vector(Vector(456.0)), Vector(457.0, 458.0)))), Vector(s1(Vector(s0(Vector(Vector(459.0)), Vector(460.0, 461.0)), s0(Vector(Vector(462.0)), Vector(463.0, 464.0))), s0(Vector(Vector(465.0)), Vector(466.0, 467.0)))), Vector(s1(Vector(s0(Vector(Vector(468.0)), Vector(469.0, 470.0)), s0(Vector(Vector(471.0)), Vector(472.0, 473.0))), s0(Vector(Vector(474.0)), Vector(475.0, 476.0))))))
    val v2: Double = 477.0
    val start = nanoTime()
    var result: Double = 477.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}