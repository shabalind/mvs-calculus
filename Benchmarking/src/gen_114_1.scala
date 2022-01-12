import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: s3,
    p1: s0
  )
  case class s6 (
    p0: Vector[s5],
    p1: s3,
    p2: Vector[Vector[s4]],
    p3: s0
  )
  case class s7 (
    p0: Vector[s5],
    p1: Vector[Vector[s6]]
  )
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v6: Vector[Vector[s6]] = v0.p1
    var v10: Vector[Vector[s6]] = v6
    val v4: Vector[s6] = v10(1)
    val v15: s6 = v4(0)
    var v8: Vector[s6] = v4
    v8 = v8.updated(0, v15)
    v10 = v10.updated(1, v8)
    val v13: Vector[s6] = v10(0)
    var v14: s7 = v0
    var v20: s6 = v15
    val v43: Vector[s5] = v14.p0
    val v19: s3 = v15.p1
    v20 = v20.copy(p1 = v19)
    var v38: s6 = v20
    val v28: s0 = v20.p3
    val v30: s5 = v43(0)
    var v34: Vector[s6] = v13
    var v75: s5 = v30
    var v22: s5 = v75
    var v42: s5 = v22
    val v48: Vector[Vector[s4]] = v20.p2
    val v96: s3 = v42.p0
    v34 = v34.updated(0, v38)
    var v44: s6 = v38
    v38 = v38.copy(p3 = v28)
    val v109: Vector[s6] = Vector(v44, v44, v20, v15)
    v42 = v42.copy(p1 = v28)
    v8 = v8.updated(0, v38)
    val v83: s6 = v109(2)
    val v101: s0 = v83.p3
    val v199: Vector[Vector[s4]] = v44.p2
    val v62: s6 = v109(1)
    v38 = v62
    v22 = v22.copy(p0 = v19)
    v10 = v10.updated(1, v34)
    val v139: Vector[Double] = v28.p0
    v22 = v22.copy(p1 = v101)
    v20 = v20.copy(p2 = v199)
    v8 = v8.updated(0, v62)
    v10 = v10.updated(0, v13)
    v20 = v20.copy(p2 = v48)
    v20 = v20.copy(p1 = v96)
    val v125: Double = v139(1)
    v125
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s5(s3(s1(s0(Vector(0.0, 1.0), Vector(Vector(2.0))), Vector(s0(Vector(3.0, 4.0), Vector(Vector(5.0))), s0(Vector(6.0, 7.0), Vector(Vector(8.0))), s0(Vector(9.0, 10.0), Vector(Vector(11.0)))), Vector(s0(Vector(12.0, 13.0), Vector(Vector(14.0))), s0(Vector(15.0, 16.0), Vector(Vector(17.0))))), Vector(s1(s0(Vector(18.0, 19.0), Vector(Vector(20.0))), Vector(s0(Vector(21.0, 22.0), Vector(Vector(23.0))), s0(Vector(24.0, 25.0), Vector(Vector(26.0))), s0(Vector(27.0, 28.0), Vector(Vector(29.0)))), Vector(s0(Vector(30.0, 31.0), Vector(Vector(32.0))), s0(Vector(33.0, 34.0), Vector(Vector(35.0))))), s1(s0(Vector(36.0, 37.0), Vector(Vector(38.0))), Vector(s0(Vector(39.0, 40.0), Vector(Vector(41.0))), s0(Vector(42.0, 43.0), Vector(Vector(44.0))), s0(Vector(45.0, 46.0), Vector(Vector(47.0)))), Vector(s0(Vector(48.0, 49.0), Vector(Vector(50.0))), s0(Vector(51.0, 52.0), Vector(Vector(53.0))))))), s0(Vector(54.0, 55.0), Vector(Vector(56.0))))), Vector(Vector(s6(Vector(s5(s3(s1(s0(Vector(57.0, 58.0), Vector(Vector(59.0))), Vector(s0(Vector(60.0, 61.0), Vector(Vector(62.0))), s0(Vector(63.0, 64.0), Vector(Vector(65.0))), s0(Vector(66.0, 67.0), Vector(Vector(68.0)))), Vector(s0(Vector(69.0, 70.0), Vector(Vector(71.0))), s0(Vector(72.0, 73.0), Vector(Vector(74.0))))), Vector(s1(s0(Vector(75.0, 76.0), Vector(Vector(77.0))), Vector(s0(Vector(78.0, 79.0), Vector(Vector(80.0))), s0(Vector(81.0, 82.0), Vector(Vector(83.0))), s0(Vector(84.0, 85.0), Vector(Vector(86.0)))), Vector(s0(Vector(87.0, 88.0), Vector(Vector(89.0))), s0(Vector(90.0, 91.0), Vector(Vector(92.0))))), s1(s0(Vector(93.0, 94.0), Vector(Vector(95.0))), Vector(s0(Vector(96.0, 97.0), Vector(Vector(98.0))), s0(Vector(99.0, 100.0), Vector(Vector(101.0))), s0(Vector(102.0, 103.0), Vector(Vector(104.0)))), Vector(s0(Vector(105.0, 106.0), Vector(Vector(107.0))), s0(Vector(108.0, 109.0), Vector(Vector(110.0))))))), s0(Vector(111.0, 112.0), Vector(Vector(113.0)))), s5(s3(s1(s0(Vector(114.0, 115.0), Vector(Vector(116.0))), Vector(s0(Vector(117.0, 118.0), Vector(Vector(119.0))), s0(Vector(120.0, 121.0), Vector(Vector(122.0))), s0(Vector(123.0, 124.0), Vector(Vector(125.0)))), Vector(s0(Vector(126.0, 127.0), Vector(Vector(128.0))), s0(Vector(129.0, 130.0), Vector(Vector(131.0))))), Vector(s1(s0(Vector(132.0, 133.0), Vector(Vector(134.0))), Vector(s0(Vector(135.0, 136.0), Vector(Vector(137.0))), s0(Vector(138.0, 139.0), Vector(Vector(140.0))), s0(Vector(141.0, 142.0), Vector(Vector(143.0)))), Vector(s0(Vector(144.0, 145.0), Vector(Vector(146.0))), s0(Vector(147.0, 148.0), Vector(Vector(149.0))))), s1(s0(Vector(150.0, 151.0), Vector(Vector(152.0))), Vector(s0(Vector(153.0, 154.0), Vector(Vector(155.0))), s0(Vector(156.0, 157.0), Vector(Vector(158.0))), s0(Vector(159.0, 160.0), Vector(Vector(161.0)))), Vector(s0(Vector(162.0, 163.0), Vector(Vector(164.0))), s0(Vector(165.0, 166.0), Vector(Vector(167.0))))))), s0(Vector(168.0, 169.0), Vector(Vector(170.0)))), s5(s3(s1(s0(Vector(171.0, 172.0), Vector(Vector(173.0))), Vector(s0(Vector(174.0, 175.0), Vector(Vector(176.0))), s0(Vector(177.0, 178.0), Vector(Vector(179.0))), s0(Vector(180.0, 181.0), Vector(Vector(182.0)))), Vector(s0(Vector(183.0, 184.0), Vector(Vector(185.0))), s0(Vector(186.0, 187.0), Vector(Vector(188.0))))), Vector(s1(s0(Vector(189.0, 190.0), Vector(Vector(191.0))), Vector(s0(Vector(192.0, 193.0), Vector(Vector(194.0))), s0(Vector(195.0, 196.0), Vector(Vector(197.0))), s0(Vector(198.0, 199.0), Vector(Vector(200.0)))), Vector(s0(Vector(201.0, 202.0), Vector(Vector(203.0))), s0(Vector(204.0, 205.0), Vector(Vector(206.0))))), s1(s0(Vector(207.0, 208.0), Vector(Vector(209.0))), Vector(s0(Vector(210.0, 211.0), Vector(Vector(212.0))), s0(Vector(213.0, 214.0), Vector(Vector(215.0))), s0(Vector(216.0, 217.0), Vector(Vector(218.0)))), Vector(s0(Vector(219.0, 220.0), Vector(Vector(221.0))), s0(Vector(222.0, 223.0), Vector(Vector(224.0))))))), s0(Vector(225.0, 226.0), Vector(Vector(227.0))))), s3(s1(s0(Vector(228.0, 229.0), Vector(Vector(230.0))), Vector(s0(Vector(231.0, 232.0), Vector(Vector(233.0))), s0(Vector(234.0, 235.0), Vector(Vector(236.0))), s0(Vector(237.0, 238.0), Vector(Vector(239.0)))), Vector(s0(Vector(240.0, 241.0), Vector(Vector(242.0))), s0(Vector(243.0, 244.0), Vector(Vector(245.0))))), Vector(s1(s0(Vector(246.0, 247.0), Vector(Vector(248.0))), Vector(s0(Vector(249.0, 250.0), Vector(Vector(251.0))), s0(Vector(252.0, 253.0), Vector(Vector(254.0))), s0(Vector(255.0, 256.0), Vector(Vector(257.0)))), Vector(s0(Vector(258.0, 259.0), Vector(Vector(260.0))), s0(Vector(261.0, 262.0), Vector(Vector(263.0))))), s1(s0(Vector(264.0, 265.0), Vector(Vector(266.0))), Vector(s0(Vector(267.0, 268.0), Vector(Vector(269.0))), s0(Vector(270.0, 271.0), Vector(Vector(272.0))), s0(Vector(273.0, 274.0), Vector(Vector(275.0)))), Vector(s0(Vector(276.0, 277.0), Vector(Vector(278.0))), s0(Vector(279.0, 280.0), Vector(Vector(281.0))))))), Vector(Vector(s4(s1(s0(Vector(282.0, 283.0), Vector(Vector(284.0))), Vector(s0(Vector(285.0, 286.0), Vector(Vector(287.0))), s0(Vector(288.0, 289.0), Vector(Vector(290.0))), s0(Vector(291.0, 292.0), Vector(Vector(293.0)))), Vector(s0(Vector(294.0, 295.0), Vector(Vector(296.0))), s0(Vector(297.0, 298.0), Vector(Vector(299.0))))), s1(s0(Vector(300.0, 301.0), Vector(Vector(302.0))), Vector(s0(Vector(303.0, 304.0), Vector(Vector(305.0))), s0(Vector(306.0, 307.0), Vector(Vector(308.0))), s0(Vector(309.0, 310.0), Vector(Vector(311.0)))), Vector(s0(Vector(312.0, 313.0), Vector(Vector(314.0))), s0(Vector(315.0, 316.0), Vector(Vector(317.0))))))), Vector(s4(s1(s0(Vector(318.0, 319.0), Vector(Vector(320.0))), Vector(s0(Vector(321.0, 322.0), Vector(Vector(323.0))), s0(Vector(324.0, 325.0), Vector(Vector(326.0))), s0(Vector(327.0, 328.0), Vector(Vector(329.0)))), Vector(s0(Vector(330.0, 331.0), Vector(Vector(332.0))), s0(Vector(333.0, 334.0), Vector(Vector(335.0))))), s1(s0(Vector(336.0, 337.0), Vector(Vector(338.0))), Vector(s0(Vector(339.0, 340.0), Vector(Vector(341.0))), s0(Vector(342.0, 343.0), Vector(Vector(344.0))), s0(Vector(345.0, 346.0), Vector(Vector(347.0)))), Vector(s0(Vector(348.0, 349.0), Vector(Vector(350.0))), s0(Vector(351.0, 352.0), Vector(Vector(353.0)))))))), s0(Vector(354.0, 355.0), Vector(Vector(356.0))))), Vector(s6(Vector(s5(s3(s1(s0(Vector(357.0, 358.0), Vector(Vector(359.0))), Vector(s0(Vector(360.0, 361.0), Vector(Vector(362.0))), s0(Vector(363.0, 364.0), Vector(Vector(365.0))), s0(Vector(366.0, 367.0), Vector(Vector(368.0)))), Vector(s0(Vector(369.0, 370.0), Vector(Vector(371.0))), s0(Vector(372.0, 373.0), Vector(Vector(374.0))))), Vector(s1(s0(Vector(375.0, 376.0), Vector(Vector(377.0))), Vector(s0(Vector(378.0, 379.0), Vector(Vector(380.0))), s0(Vector(381.0, 382.0), Vector(Vector(383.0))), s0(Vector(384.0, 385.0), Vector(Vector(386.0)))), Vector(s0(Vector(387.0, 388.0), Vector(Vector(389.0))), s0(Vector(390.0, 391.0), Vector(Vector(392.0))))), s1(s0(Vector(393.0, 394.0), Vector(Vector(395.0))), Vector(s0(Vector(396.0, 397.0), Vector(Vector(398.0))), s0(Vector(399.0, 400.0), Vector(Vector(401.0))), s0(Vector(402.0, 403.0), Vector(Vector(404.0)))), Vector(s0(Vector(405.0, 406.0), Vector(Vector(407.0))), s0(Vector(408.0, 409.0), Vector(Vector(410.0))))))), s0(Vector(411.0, 412.0), Vector(Vector(413.0)))), s5(s3(s1(s0(Vector(414.0, 415.0), Vector(Vector(416.0))), Vector(s0(Vector(417.0, 418.0), Vector(Vector(419.0))), s0(Vector(420.0, 421.0), Vector(Vector(422.0))), s0(Vector(423.0, 424.0), Vector(Vector(425.0)))), Vector(s0(Vector(426.0, 427.0), Vector(Vector(428.0))), s0(Vector(429.0, 430.0), Vector(Vector(431.0))))), Vector(s1(s0(Vector(432.0, 433.0), Vector(Vector(434.0))), Vector(s0(Vector(435.0, 436.0), Vector(Vector(437.0))), s0(Vector(438.0, 439.0), Vector(Vector(440.0))), s0(Vector(441.0, 442.0), Vector(Vector(443.0)))), Vector(s0(Vector(444.0, 445.0), Vector(Vector(446.0))), s0(Vector(447.0, 448.0), Vector(Vector(449.0))))), s1(s0(Vector(450.0, 451.0), Vector(Vector(452.0))), Vector(s0(Vector(453.0, 454.0), Vector(Vector(455.0))), s0(Vector(456.0, 457.0), Vector(Vector(458.0))), s0(Vector(459.0, 460.0), Vector(Vector(461.0)))), Vector(s0(Vector(462.0, 463.0), Vector(Vector(464.0))), s0(Vector(465.0, 466.0), Vector(Vector(467.0))))))), s0(Vector(468.0, 469.0), Vector(Vector(470.0)))), s5(s3(s1(s0(Vector(471.0, 472.0), Vector(Vector(473.0))), Vector(s0(Vector(474.0, 475.0), Vector(Vector(476.0))), s0(Vector(477.0, 478.0), Vector(Vector(479.0))), s0(Vector(480.0, 481.0), Vector(Vector(482.0)))), Vector(s0(Vector(483.0, 484.0), Vector(Vector(485.0))), s0(Vector(486.0, 487.0), Vector(Vector(488.0))))), Vector(s1(s0(Vector(489.0, 490.0), Vector(Vector(491.0))), Vector(s0(Vector(492.0, 493.0), Vector(Vector(494.0))), s0(Vector(495.0, 496.0), Vector(Vector(497.0))), s0(Vector(498.0, 499.0), Vector(Vector(500.0)))), Vector(s0(Vector(501.0, 502.0), Vector(Vector(503.0))), s0(Vector(504.0, 505.0), Vector(Vector(506.0))))), s1(s0(Vector(507.0, 508.0), Vector(Vector(509.0))), Vector(s0(Vector(510.0, 511.0), Vector(Vector(512.0))), s0(Vector(513.0, 514.0), Vector(Vector(515.0))), s0(Vector(516.0, 517.0), Vector(Vector(518.0)))), Vector(s0(Vector(519.0, 520.0), Vector(Vector(521.0))), s0(Vector(522.0, 523.0), Vector(Vector(524.0))))))), s0(Vector(525.0, 526.0), Vector(Vector(527.0))))), s3(s1(s0(Vector(528.0, 529.0), Vector(Vector(530.0))), Vector(s0(Vector(531.0, 532.0), Vector(Vector(533.0))), s0(Vector(534.0, 535.0), Vector(Vector(536.0))), s0(Vector(537.0, 538.0), Vector(Vector(539.0)))), Vector(s0(Vector(540.0, 541.0), Vector(Vector(542.0))), s0(Vector(543.0, 544.0), Vector(Vector(545.0))))), Vector(s1(s0(Vector(546.0, 547.0), Vector(Vector(548.0))), Vector(s0(Vector(549.0, 550.0), Vector(Vector(551.0))), s0(Vector(552.0, 553.0), Vector(Vector(554.0))), s0(Vector(555.0, 556.0), Vector(Vector(557.0)))), Vector(s0(Vector(558.0, 559.0), Vector(Vector(560.0))), s0(Vector(561.0, 562.0), Vector(Vector(563.0))))), s1(s0(Vector(564.0, 565.0), Vector(Vector(566.0))), Vector(s0(Vector(567.0, 568.0), Vector(Vector(569.0))), s0(Vector(570.0, 571.0), Vector(Vector(572.0))), s0(Vector(573.0, 574.0), Vector(Vector(575.0)))), Vector(s0(Vector(576.0, 577.0), Vector(Vector(578.0))), s0(Vector(579.0, 580.0), Vector(Vector(581.0))))))), Vector(Vector(s4(s1(s0(Vector(582.0, 583.0), Vector(Vector(584.0))), Vector(s0(Vector(585.0, 586.0), Vector(Vector(587.0))), s0(Vector(588.0, 589.0), Vector(Vector(590.0))), s0(Vector(591.0, 592.0), Vector(Vector(593.0)))), Vector(s0(Vector(594.0, 595.0), Vector(Vector(596.0))), s0(Vector(597.0, 598.0), Vector(Vector(599.0))))), s1(s0(Vector(600.0, 601.0), Vector(Vector(602.0))), Vector(s0(Vector(603.0, 604.0), Vector(Vector(605.0))), s0(Vector(606.0, 607.0), Vector(Vector(608.0))), s0(Vector(609.0, 610.0), Vector(Vector(611.0)))), Vector(s0(Vector(612.0, 613.0), Vector(Vector(614.0))), s0(Vector(615.0, 616.0), Vector(Vector(617.0))))))), Vector(s4(s1(s0(Vector(618.0, 619.0), Vector(Vector(620.0))), Vector(s0(Vector(621.0, 622.0), Vector(Vector(623.0))), s0(Vector(624.0, 625.0), Vector(Vector(626.0))), s0(Vector(627.0, 628.0), Vector(Vector(629.0)))), Vector(s0(Vector(630.0, 631.0), Vector(Vector(632.0))), s0(Vector(633.0, 634.0), Vector(Vector(635.0))))), s1(s0(Vector(636.0, 637.0), Vector(Vector(638.0))), Vector(s0(Vector(639.0, 640.0), Vector(Vector(641.0))), s0(Vector(642.0, 643.0), Vector(Vector(644.0))), s0(Vector(645.0, 646.0), Vector(Vector(647.0)))), Vector(s0(Vector(648.0, 649.0), Vector(Vector(650.0))), s0(Vector(651.0, 652.0), Vector(Vector(653.0)))))))), s0(Vector(654.0, 655.0), Vector(Vector(656.0)))))))
    val v1: Double = 657.0
    val start = nanoTime()
    var result: Double = 657.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}