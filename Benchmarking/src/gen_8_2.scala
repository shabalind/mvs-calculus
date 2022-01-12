import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s3]
  )
  case class s7 (
    p0: Vector[Vector[s1]],
    p1: s4,
    p2: s0,
    p3: s0,
    p4: Vector[s2],
    p5: s0,
    p6: s1,
    p7: Double
  )
  def f57(v0: Vector[s3], v1: s4): Vector[s3] = {
    val v4: Vector[s3] = v1.p0
    v4
  }
  def f56(v0: s1): s1 = {
    var v4: s1 = v0
    val v6: Vector[s0] = v0.p1
    var v7: Vector[s0] = v6
    val v3: s0 = v6(2)
    v4 = v4.copy(p1 = v6)
    val v2: Vector[s0] = v0.p1
    v4 = v4.copy(p1 = v7)
    var v1: s1 = v0
    val v14: s0 = v7(1)
    val v8: Vector[s0] = v1.p0
    var v20: s1 = v4
    val v5: s0 = v8(1)
    var v9: Vector[s0] = v8
    val v12: s0 = v9(1)
    v1 = v1.copy(p1 = v2)
    v7 = v7.updated(1, v3)
    v4 = v4.copy(p0 = v9)
    var v17: s0 = v14
    v9 = v9.updated(1, v17)
    val v21: Vector[Double] = v5.p0
    val v15: Vector[s1] = Vector(v0, v1, v4, v1, v20, v4, v0)
    val v13: s1 = v15(2)
    v20 = v20.copy(p0 = v8)
    val v16: s1 = v15(1)
    var v18: Vector[s1] = v15
    val v28: Vector[Vector[Double]] = v12.p1
    v18 = v18.updated(6, v20)
    var v27: Vector[Double] = v21
    val v35: Vector[s0] = v13.p1
    v4 = v4.copy(p0 = v9)
    val v33: Vector[Vector[Double]] = Vector(v21, v27, v27, v27, v27, v21)
    val v26: s0 = v8(1)
    val v31: Vector[Double] = v33(2)
    val v47: s1 = v18(5)
    v18 = v18.updated(5, v20)
    val v30: Vector[Vector[Double]] = v17.p1
    v7 = v35
    v7 = v7.updated(2, v26)
    val v49: Vector[s0] = v4.p1
    val v50: s0 = s0(v31, v28)
    v20 = v20.copy(p0 = v8)
    val v82: Vector[s0] = v16.p0
    v7 = v49
    v9 = v9.updated(1, v50)
    v17 = v17.copy(p1 = v30)
    var v95: s1 = v47
    var v70: Vector[s0] = v2
    v95 = v95.copy(p0 = v82)
    val v59: Vector[s0] = v20.p1
    val v67: Vector[s0] = v16.p0
    v95 = v95.copy(p0 = v67)
    v1 = v1.copy(p1 = v70)
    var v123: Vector[s0] = v67
    v20 = v20.copy(p1 = v59)
    v4 = v4.copy(p0 = v123)
    v20 = v20.copy(p1 = v49)
    v95
  }
  def f36(v0: s7): s7 = {
    val v4: s1 = v0.p6
    val v5: s1 = f56(v4)
    val v7: s0 = v0.p5
    var v2: s1 = v5
    val v1: Vector[Double] = v7.p0
    val v20: Double = v1(0)
    val v8: Double = v1(2)
    val v12: Double = v1(0)
    val v24: s1 = f56(v2)
    var v21: Double = v8
    var v29: s7 = v0
    val v25: s1 = f56(v5)
    val v16: s1 = f56(v4)
    val v23: s4 = v0.p1
    v29 = v29.copy(p6 = v5)
    v29 = v29.copy(p2 = v7)
    v29 = v29.copy(p5 = v7)
    var v19: Double = v20
    val v34: Double = v19 + v12
    v29 = v29.copy(p6 = v24)
    val v28: Vector[s3] = v23.p0
    v2 = v16
    val v26: Vector[s3] = f57(v28, v23)
    var v48: Double = v21
    v2 = v25
    val v67: Double = v34 + v34
    v29 = v29.copy(p7 = v8)
    val v97: s3 = v26(0)
    val v45: Vector[s0] = v97.p1
    v29 = v29.copy(p5 = v7)
    val v56: s0 = v0.p2
    v29 = v29.copy(p5 = v56)
    val v89: Double = v48 / v67
    val v248: s0 = v45(0)
    v29 = v29.copy(p3 = v248)
    v29 = v29.copy(p7 = v89)
    v29
  }
  def f10(v0: s7): s7 = {
    val v4: s7 = f36(v0)
    val v3: Vector[s7] = Vector(v0, v0, v4, v0, v4, v0, v0)
    val v10: s7 = v3(2)
    val v25: s7 = f36(v10)
    v25
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    var v2: Double = v1
    val v4: s7 = v0(1)
    val v3: s7 = f36(v4)
    val v10: s7 = f10(v3)
    val v6: s7 = f36(v3)
    val v17: s0 = v10.p3
    val v23: Vector[Double] = v17.p0
    val v27: s7 = f36(v6)
    var v28: Double = v2
    val v68: Double = v27.p7
    val v52: Double = v23(0)
    val v51: Double = v68 * v28
    val v64: Double = v52 / v51
    v64
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(Vector(s1(Vector(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))), Vector(s1(Vector(s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(54.0, 55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), Vector(s1(Vector(s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(66.0, 67.0, 68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), s0(Vector(78.0, 79.0, 80.0), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))))), s4(Vector(s3(s2(s0(Vector(90.0, 91.0, 92.0), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), Vector(s0(Vector(96.0, 97.0, 98.0), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(102.0, 103.0, 104.0), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(108.0, 109.0, 110.0), Vector(Vector(111.0), Vector(112.0), Vector(113.0))))), Vector(s0(Vector(114.0, 115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))), Vector(s3(s2(s0(Vector(120.0, 121.0, 122.0), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), Vector(s0(Vector(126.0, 127.0, 128.0), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(132.0, 133.0, 134.0), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(138.0, 139.0, 140.0), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))), Vector(s0(Vector(144.0, 145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))), s3(s2(s0(Vector(150.0, 151.0, 152.0), Vector(Vector(153.0), Vector(154.0), Vector(155.0))), Vector(s0(Vector(156.0, 157.0, 158.0), Vector(Vector(159.0), Vector(160.0), Vector(161.0))), s0(Vector(162.0, 163.0, 164.0), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), s0(Vector(168.0, 169.0, 170.0), Vector(Vector(171.0), Vector(172.0), Vector(173.0))))), Vector(s0(Vector(174.0, 175.0, 176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0))))))), s0(Vector(180.0, 181.0, 182.0), Vector(Vector(183.0), Vector(184.0), Vector(185.0))), s0(Vector(186.0, 187.0, 188.0), Vector(Vector(189.0), Vector(190.0), Vector(191.0))), Vector(s2(s0(Vector(192.0, 193.0, 194.0), Vector(Vector(195.0), Vector(196.0), Vector(197.0))), Vector(s0(Vector(198.0, 199.0, 200.0), Vector(Vector(201.0), Vector(202.0), Vector(203.0))), s0(Vector(204.0, 205.0, 206.0), Vector(Vector(207.0), Vector(208.0), Vector(209.0))), s0(Vector(210.0, 211.0, 212.0), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))), s2(s0(Vector(216.0, 217.0, 218.0), Vector(Vector(219.0), Vector(220.0), Vector(221.0))), Vector(s0(Vector(222.0, 223.0, 224.0), Vector(Vector(225.0), Vector(226.0), Vector(227.0))), s0(Vector(228.0, 229.0, 230.0), Vector(Vector(231.0), Vector(232.0), Vector(233.0))), s0(Vector(234.0, 235.0, 236.0), Vector(Vector(237.0), Vector(238.0), Vector(239.0))))), s2(s0(Vector(240.0, 241.0, 242.0), Vector(Vector(243.0), Vector(244.0), Vector(245.0))), Vector(s0(Vector(246.0, 247.0, 248.0), Vector(Vector(249.0), Vector(250.0), Vector(251.0))), s0(Vector(252.0, 253.0, 254.0), Vector(Vector(255.0), Vector(256.0), Vector(257.0))), s0(Vector(258.0, 259.0, 260.0), Vector(Vector(261.0), Vector(262.0), Vector(263.0)))))), s0(Vector(264.0, 265.0, 266.0), Vector(Vector(267.0), Vector(268.0), Vector(269.0))), s1(Vector(s0(Vector(270.0, 271.0, 272.0), Vector(Vector(273.0), Vector(274.0), Vector(275.0))), s0(Vector(276.0, 277.0, 278.0), Vector(Vector(279.0), Vector(280.0), Vector(281.0)))), Vector(s0(Vector(282.0, 283.0, 284.0), Vector(Vector(285.0), Vector(286.0), Vector(287.0))), s0(Vector(288.0, 289.0, 290.0), Vector(Vector(291.0), Vector(292.0), Vector(293.0))), s0(Vector(294.0, 295.0, 296.0), Vector(Vector(297.0), Vector(298.0), Vector(299.0))))), 300.0), s7(Vector(Vector(s1(Vector(s0(Vector(301.0, 302.0, 303.0), Vector(Vector(304.0), Vector(305.0), Vector(306.0))), s0(Vector(307.0, 308.0, 309.0), Vector(Vector(310.0), Vector(311.0), Vector(312.0)))), Vector(s0(Vector(313.0, 314.0, 315.0), Vector(Vector(316.0), Vector(317.0), Vector(318.0))), s0(Vector(319.0, 320.0, 321.0), Vector(Vector(322.0), Vector(323.0), Vector(324.0))), s0(Vector(325.0, 326.0, 327.0), Vector(Vector(328.0), Vector(329.0), Vector(330.0)))))), Vector(s1(Vector(s0(Vector(331.0, 332.0, 333.0), Vector(Vector(334.0), Vector(335.0), Vector(336.0))), s0(Vector(337.0, 338.0, 339.0), Vector(Vector(340.0), Vector(341.0), Vector(342.0)))), Vector(s0(Vector(343.0, 344.0, 345.0), Vector(Vector(346.0), Vector(347.0), Vector(348.0))), s0(Vector(349.0, 350.0, 351.0), Vector(Vector(352.0), Vector(353.0), Vector(354.0))), s0(Vector(355.0, 356.0, 357.0), Vector(Vector(358.0), Vector(359.0), Vector(360.0)))))), Vector(s1(Vector(s0(Vector(361.0, 362.0, 363.0), Vector(Vector(364.0), Vector(365.0), Vector(366.0))), s0(Vector(367.0, 368.0, 369.0), Vector(Vector(370.0), Vector(371.0), Vector(372.0)))), Vector(s0(Vector(373.0, 374.0, 375.0), Vector(Vector(376.0), Vector(377.0), Vector(378.0))), s0(Vector(379.0, 380.0, 381.0), Vector(Vector(382.0), Vector(383.0), Vector(384.0))), s0(Vector(385.0, 386.0, 387.0), Vector(Vector(388.0), Vector(389.0), Vector(390.0))))))), s4(Vector(s3(s2(s0(Vector(391.0, 392.0, 393.0), Vector(Vector(394.0), Vector(395.0), Vector(396.0))), Vector(s0(Vector(397.0, 398.0, 399.0), Vector(Vector(400.0), Vector(401.0), Vector(402.0))), s0(Vector(403.0, 404.0, 405.0), Vector(Vector(406.0), Vector(407.0), Vector(408.0))), s0(Vector(409.0, 410.0, 411.0), Vector(Vector(412.0), Vector(413.0), Vector(414.0))))), Vector(s0(Vector(415.0, 416.0, 417.0), Vector(Vector(418.0), Vector(419.0), Vector(420.0)))))), Vector(s3(s2(s0(Vector(421.0, 422.0, 423.0), Vector(Vector(424.0), Vector(425.0), Vector(426.0))), Vector(s0(Vector(427.0, 428.0, 429.0), Vector(Vector(430.0), Vector(431.0), Vector(432.0))), s0(Vector(433.0, 434.0, 435.0), Vector(Vector(436.0), Vector(437.0), Vector(438.0))), s0(Vector(439.0, 440.0, 441.0), Vector(Vector(442.0), Vector(443.0), Vector(444.0))))), Vector(s0(Vector(445.0, 446.0, 447.0), Vector(Vector(448.0), Vector(449.0), Vector(450.0))))), s3(s2(s0(Vector(451.0, 452.0, 453.0), Vector(Vector(454.0), Vector(455.0), Vector(456.0))), Vector(s0(Vector(457.0, 458.0, 459.0), Vector(Vector(460.0), Vector(461.0), Vector(462.0))), s0(Vector(463.0, 464.0, 465.0), Vector(Vector(466.0), Vector(467.0), Vector(468.0))), s0(Vector(469.0, 470.0, 471.0), Vector(Vector(472.0), Vector(473.0), Vector(474.0))))), Vector(s0(Vector(475.0, 476.0, 477.0), Vector(Vector(478.0), Vector(479.0), Vector(480.0))))))), s0(Vector(481.0, 482.0, 483.0), Vector(Vector(484.0), Vector(485.0), Vector(486.0))), s0(Vector(487.0, 488.0, 489.0), Vector(Vector(490.0), Vector(491.0), Vector(492.0))), Vector(s2(s0(Vector(493.0, 494.0, 495.0), Vector(Vector(496.0), Vector(497.0), Vector(498.0))), Vector(s0(Vector(499.0, 500.0, 501.0), Vector(Vector(502.0), Vector(503.0), Vector(504.0))), s0(Vector(505.0, 506.0, 507.0), Vector(Vector(508.0), Vector(509.0), Vector(510.0))), s0(Vector(511.0, 512.0, 513.0), Vector(Vector(514.0), Vector(515.0), Vector(516.0))))), s2(s0(Vector(517.0, 518.0, 519.0), Vector(Vector(520.0), Vector(521.0), Vector(522.0))), Vector(s0(Vector(523.0, 524.0, 525.0), Vector(Vector(526.0), Vector(527.0), Vector(528.0))), s0(Vector(529.0, 530.0, 531.0), Vector(Vector(532.0), Vector(533.0), Vector(534.0))), s0(Vector(535.0, 536.0, 537.0), Vector(Vector(538.0), Vector(539.0), Vector(540.0))))), s2(s0(Vector(541.0, 542.0, 543.0), Vector(Vector(544.0), Vector(545.0), Vector(546.0))), Vector(s0(Vector(547.0, 548.0, 549.0), Vector(Vector(550.0), Vector(551.0), Vector(552.0))), s0(Vector(553.0, 554.0, 555.0), Vector(Vector(556.0), Vector(557.0), Vector(558.0))), s0(Vector(559.0, 560.0, 561.0), Vector(Vector(562.0), Vector(563.0), Vector(564.0)))))), s0(Vector(565.0, 566.0, 567.0), Vector(Vector(568.0), Vector(569.0), Vector(570.0))), s1(Vector(s0(Vector(571.0, 572.0, 573.0), Vector(Vector(574.0), Vector(575.0), Vector(576.0))), s0(Vector(577.0, 578.0, 579.0), Vector(Vector(580.0), Vector(581.0), Vector(582.0)))), Vector(s0(Vector(583.0, 584.0, 585.0), Vector(Vector(586.0), Vector(587.0), Vector(588.0))), s0(Vector(589.0, 590.0, 591.0), Vector(Vector(592.0), Vector(593.0), Vector(594.0))), s0(Vector(595.0, 596.0, 597.0), Vector(Vector(598.0), Vector(599.0), Vector(600.0))))), 601.0))
    val v1: Double = 602.0
    val start = nanoTime()
    var result: Double = 602.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}