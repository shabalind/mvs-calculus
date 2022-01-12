import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: Vector[s1],
    p2: s0,
    p3: s2
  )
  case class s5 (
    p0: s4,
    p1: Vector[Vector[s4]],
    p2: Vector[s3]
  )
  case class s6 (
    p0: s2,
    p1: Vector[Vector[s4]]
  )
  case class s7 (
    p0: Vector[s5],
    p1: s4
  )
  case class s8 (
    p0: s1,
    p1: s2
  )
  def f68(v0: s4): s4 = {
    val v5: Vector[s4] = Vector(v0, v0, v0, v0)
    var v6: Vector[s4] = v5
    val v4: s4 = v6(1)
    val v2: s4 = v5(1)
    val v11: s4 = v5(1)
    v6 = v6.updated(0, v11)
    v6 = v6.updated(2, v2)
    v4
  }
  @noinline
  def f0(v0: Vector[s6], v1: Vector[s8], v2: Vector[Vector[s1]], v3: s7, v4: Double): Double = {
    val v6: s4 = v3.p1
    val v11: s4 = f68(v6)
    val v28: s0 = v11.p2
    val v35: Vector[Vector[Double]] = v28.p1
    val v44: Vector[Double] = v35(0)
    var v41: Vector[Double] = v44
    val v54: Double = v41(0)
    val v132: Double = v44(0)
    val v149: Double = v54 + v132
    v149
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s2(Vector(Vector(s1(Vector(Vector(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0)))), Vector(s0(Vector(4.0, 5.0, 6.0), Vector(Vector(7.0))))), s0(Vector(8.0, 9.0, 10.0), Vector(Vector(11.0))))))), Vector(Vector(s4(s1(Vector(Vector(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0)))), Vector(s0(Vector(16.0, 17.0, 18.0), Vector(Vector(19.0))))), s0(Vector(20.0, 21.0, 22.0), Vector(Vector(23.0)))), Vector(s1(Vector(Vector(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0)))), Vector(s0(Vector(28.0, 29.0, 30.0), Vector(Vector(31.0))))), s0(Vector(32.0, 33.0, 34.0), Vector(Vector(35.0))))), s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(40.0, 41.0, 42.0), Vector(Vector(43.0)))), Vector(s0(Vector(44.0, 45.0, 46.0), Vector(Vector(47.0))))), s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0))))))))), Vector(s4(s1(Vector(Vector(s0(Vector(52.0, 53.0, 54.0), Vector(Vector(55.0)))), Vector(s0(Vector(56.0, 57.0, 58.0), Vector(Vector(59.0))))), s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0)))), Vector(s1(Vector(Vector(s0(Vector(64.0, 65.0, 66.0), Vector(Vector(67.0)))), Vector(s0(Vector(68.0, 69.0, 70.0), Vector(Vector(71.0))))), s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0))))), s0(Vector(76.0, 77.0, 78.0), Vector(Vector(79.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(80.0, 81.0, 82.0), Vector(Vector(83.0)))), Vector(s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0))))), s0(Vector(88.0, 89.0, 90.0), Vector(Vector(91.0))))))))))), s6(s2(Vector(Vector(s1(Vector(Vector(s0(Vector(92.0, 93.0, 94.0), Vector(Vector(95.0)))), Vector(s0(Vector(96.0, 97.0, 98.0), Vector(Vector(99.0))))), s0(Vector(100.0, 101.0, 102.0), Vector(Vector(103.0))))))), Vector(Vector(s4(s1(Vector(Vector(s0(Vector(104.0, 105.0, 106.0), Vector(Vector(107.0)))), Vector(s0(Vector(108.0, 109.0, 110.0), Vector(Vector(111.0))))), s0(Vector(112.0, 113.0, 114.0), Vector(Vector(115.0)))), Vector(s1(Vector(Vector(s0(Vector(116.0, 117.0, 118.0), Vector(Vector(119.0)))), Vector(s0(Vector(120.0, 121.0, 122.0), Vector(Vector(123.0))))), s0(Vector(124.0, 125.0, 126.0), Vector(Vector(127.0))))), s0(Vector(128.0, 129.0, 130.0), Vector(Vector(131.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(132.0, 133.0, 134.0), Vector(Vector(135.0)))), Vector(s0(Vector(136.0, 137.0, 138.0), Vector(Vector(139.0))))), s0(Vector(140.0, 141.0, 142.0), Vector(Vector(143.0))))))))), Vector(s4(s1(Vector(Vector(s0(Vector(144.0, 145.0, 146.0), Vector(Vector(147.0)))), Vector(s0(Vector(148.0, 149.0, 150.0), Vector(Vector(151.0))))), s0(Vector(152.0, 153.0, 154.0), Vector(Vector(155.0)))), Vector(s1(Vector(Vector(s0(Vector(156.0, 157.0, 158.0), Vector(Vector(159.0)))), Vector(s0(Vector(160.0, 161.0, 162.0), Vector(Vector(163.0))))), s0(Vector(164.0, 165.0, 166.0), Vector(Vector(167.0))))), s0(Vector(168.0, 169.0, 170.0), Vector(Vector(171.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(172.0, 173.0, 174.0), Vector(Vector(175.0)))), Vector(s0(Vector(176.0, 177.0, 178.0), Vector(Vector(179.0))))), s0(Vector(180.0, 181.0, 182.0), Vector(Vector(183.0))))))))))))
    val v1: Vector[s8] = Vector(s8(s1(Vector(Vector(s0(Vector(184.0, 185.0, 186.0), Vector(Vector(187.0)))), Vector(s0(Vector(188.0, 189.0, 190.0), Vector(Vector(191.0))))), s0(Vector(192.0, 193.0, 194.0), Vector(Vector(195.0)))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(196.0, 197.0, 198.0), Vector(Vector(199.0)))), Vector(s0(Vector(200.0, 201.0, 202.0), Vector(Vector(203.0))))), s0(Vector(204.0, 205.0, 206.0), Vector(Vector(207.0)))))))), s8(s1(Vector(Vector(s0(Vector(208.0, 209.0, 210.0), Vector(Vector(211.0)))), Vector(s0(Vector(212.0, 213.0, 214.0), Vector(Vector(215.0))))), s0(Vector(216.0, 217.0, 218.0), Vector(Vector(219.0)))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(220.0, 221.0, 222.0), Vector(Vector(223.0)))), Vector(s0(Vector(224.0, 225.0, 226.0), Vector(Vector(227.0))))), s0(Vector(228.0, 229.0, 230.0), Vector(Vector(231.0)))))))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(232.0, 233.0, 234.0), Vector(Vector(235.0)))), Vector(s0(Vector(236.0, 237.0, 238.0), Vector(Vector(239.0))))), s0(Vector(240.0, 241.0, 242.0), Vector(Vector(243.0))))), Vector(s1(Vector(Vector(s0(Vector(244.0, 245.0, 246.0), Vector(Vector(247.0)))), Vector(s0(Vector(248.0, 249.0, 250.0), Vector(Vector(251.0))))), s0(Vector(252.0, 253.0, 254.0), Vector(Vector(255.0))))), Vector(s1(Vector(Vector(s0(Vector(256.0, 257.0, 258.0), Vector(Vector(259.0)))), Vector(s0(Vector(260.0, 261.0, 262.0), Vector(Vector(263.0))))), s0(Vector(264.0, 265.0, 266.0), Vector(Vector(267.0))))))
    val v3: s7 = s7(Vector(s5(s4(s1(Vector(Vector(s0(Vector(268.0, 269.0, 270.0), Vector(Vector(271.0)))), Vector(s0(Vector(272.0, 273.0, 274.0), Vector(Vector(275.0))))), s0(Vector(276.0, 277.0, 278.0), Vector(Vector(279.0)))), Vector(s1(Vector(Vector(s0(Vector(280.0, 281.0, 282.0), Vector(Vector(283.0)))), Vector(s0(Vector(284.0, 285.0, 286.0), Vector(Vector(287.0))))), s0(Vector(288.0, 289.0, 290.0), Vector(Vector(291.0))))), s0(Vector(292.0, 293.0, 294.0), Vector(Vector(295.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(296.0, 297.0, 298.0), Vector(Vector(299.0)))), Vector(s0(Vector(300.0, 301.0, 302.0), Vector(Vector(303.0))))), s0(Vector(304.0, 305.0, 306.0), Vector(Vector(307.0)))))))), Vector(Vector(s4(s1(Vector(Vector(s0(Vector(308.0, 309.0, 310.0), Vector(Vector(311.0)))), Vector(s0(Vector(312.0, 313.0, 314.0), Vector(Vector(315.0))))), s0(Vector(316.0, 317.0, 318.0), Vector(Vector(319.0)))), Vector(s1(Vector(Vector(s0(Vector(320.0, 321.0, 322.0), Vector(Vector(323.0)))), Vector(s0(Vector(324.0, 325.0, 326.0), Vector(Vector(327.0))))), s0(Vector(328.0, 329.0, 330.0), Vector(Vector(331.0))))), s0(Vector(332.0, 333.0, 334.0), Vector(Vector(335.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(336.0, 337.0, 338.0), Vector(Vector(339.0)))), Vector(s0(Vector(340.0, 341.0, 342.0), Vector(Vector(343.0))))), s0(Vector(344.0, 345.0, 346.0), Vector(Vector(347.0))))))))), Vector(s4(s1(Vector(Vector(s0(Vector(348.0, 349.0, 350.0), Vector(Vector(351.0)))), Vector(s0(Vector(352.0, 353.0, 354.0), Vector(Vector(355.0))))), s0(Vector(356.0, 357.0, 358.0), Vector(Vector(359.0)))), Vector(s1(Vector(Vector(s0(Vector(360.0, 361.0, 362.0), Vector(Vector(363.0)))), Vector(s0(Vector(364.0, 365.0, 366.0), Vector(Vector(367.0))))), s0(Vector(368.0, 369.0, 370.0), Vector(Vector(371.0))))), s0(Vector(372.0, 373.0, 374.0), Vector(Vector(375.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(376.0, 377.0, 378.0), Vector(Vector(379.0)))), Vector(s0(Vector(380.0, 381.0, 382.0), Vector(Vector(383.0))))), s0(Vector(384.0, 385.0, 386.0), Vector(Vector(387.0))))))))), Vector(s4(s1(Vector(Vector(s0(Vector(388.0, 389.0, 390.0), Vector(Vector(391.0)))), Vector(s0(Vector(392.0, 393.0, 394.0), Vector(Vector(395.0))))), s0(Vector(396.0, 397.0, 398.0), Vector(Vector(399.0)))), Vector(s1(Vector(Vector(s0(Vector(400.0, 401.0, 402.0), Vector(Vector(403.0)))), Vector(s0(Vector(404.0, 405.0, 406.0), Vector(Vector(407.0))))), s0(Vector(408.0, 409.0, 410.0), Vector(Vector(411.0))))), s0(Vector(412.0, 413.0, 414.0), Vector(Vector(415.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(416.0, 417.0, 418.0), Vector(Vector(419.0)))), Vector(s0(Vector(420.0, 421.0, 422.0), Vector(Vector(423.0))))), s0(Vector(424.0, 425.0, 426.0), Vector(Vector(427.0)))))))))), Vector(s3(Vector(s2(Vector(Vector(s1(Vector(Vector(s0(Vector(428.0, 429.0, 430.0), Vector(Vector(431.0)))), Vector(s0(Vector(432.0, 433.0, 434.0), Vector(Vector(435.0))))), s0(Vector(436.0, 437.0, 438.0), Vector(Vector(439.0)))))))), s0(Vector(440.0, 441.0, 442.0), Vector(Vector(443.0)))))), s5(s4(s1(Vector(Vector(s0(Vector(444.0, 445.0, 446.0), Vector(Vector(447.0)))), Vector(s0(Vector(448.0, 449.0, 450.0), Vector(Vector(451.0))))), s0(Vector(452.0, 453.0, 454.0), Vector(Vector(455.0)))), Vector(s1(Vector(Vector(s0(Vector(456.0, 457.0, 458.0), Vector(Vector(459.0)))), Vector(s0(Vector(460.0, 461.0, 462.0), Vector(Vector(463.0))))), s0(Vector(464.0, 465.0, 466.0), Vector(Vector(467.0))))), s0(Vector(468.0, 469.0, 470.0), Vector(Vector(471.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(472.0, 473.0, 474.0), Vector(Vector(475.0)))), Vector(s0(Vector(476.0, 477.0, 478.0), Vector(Vector(479.0))))), s0(Vector(480.0, 481.0, 482.0), Vector(Vector(483.0)))))))), Vector(Vector(s4(s1(Vector(Vector(s0(Vector(484.0, 485.0, 486.0), Vector(Vector(487.0)))), Vector(s0(Vector(488.0, 489.0, 490.0), Vector(Vector(491.0))))), s0(Vector(492.0, 493.0, 494.0), Vector(Vector(495.0)))), Vector(s1(Vector(Vector(s0(Vector(496.0, 497.0, 498.0), Vector(Vector(499.0)))), Vector(s0(Vector(500.0, 501.0, 502.0), Vector(Vector(503.0))))), s0(Vector(504.0, 505.0, 506.0), Vector(Vector(507.0))))), s0(Vector(508.0, 509.0, 510.0), Vector(Vector(511.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(512.0, 513.0, 514.0), Vector(Vector(515.0)))), Vector(s0(Vector(516.0, 517.0, 518.0), Vector(Vector(519.0))))), s0(Vector(520.0, 521.0, 522.0), Vector(Vector(523.0))))))))), Vector(s4(s1(Vector(Vector(s0(Vector(524.0, 525.0, 526.0), Vector(Vector(527.0)))), Vector(s0(Vector(528.0, 529.0, 530.0), Vector(Vector(531.0))))), s0(Vector(532.0, 533.0, 534.0), Vector(Vector(535.0)))), Vector(s1(Vector(Vector(s0(Vector(536.0, 537.0, 538.0), Vector(Vector(539.0)))), Vector(s0(Vector(540.0, 541.0, 542.0), Vector(Vector(543.0))))), s0(Vector(544.0, 545.0, 546.0), Vector(Vector(547.0))))), s0(Vector(548.0, 549.0, 550.0), Vector(Vector(551.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(552.0, 553.0, 554.0), Vector(Vector(555.0)))), Vector(s0(Vector(556.0, 557.0, 558.0), Vector(Vector(559.0))))), s0(Vector(560.0, 561.0, 562.0), Vector(Vector(563.0))))))))), Vector(s4(s1(Vector(Vector(s0(Vector(564.0, 565.0, 566.0), Vector(Vector(567.0)))), Vector(s0(Vector(568.0, 569.0, 570.0), Vector(Vector(571.0))))), s0(Vector(572.0, 573.0, 574.0), Vector(Vector(575.0)))), Vector(s1(Vector(Vector(s0(Vector(576.0, 577.0, 578.0), Vector(Vector(579.0)))), Vector(s0(Vector(580.0, 581.0, 582.0), Vector(Vector(583.0))))), s0(Vector(584.0, 585.0, 586.0), Vector(Vector(587.0))))), s0(Vector(588.0, 589.0, 590.0), Vector(Vector(591.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(592.0, 593.0, 594.0), Vector(Vector(595.0)))), Vector(s0(Vector(596.0, 597.0, 598.0), Vector(Vector(599.0))))), s0(Vector(600.0, 601.0, 602.0), Vector(Vector(603.0)))))))))), Vector(s3(Vector(s2(Vector(Vector(s1(Vector(Vector(s0(Vector(604.0, 605.0, 606.0), Vector(Vector(607.0)))), Vector(s0(Vector(608.0, 609.0, 610.0), Vector(Vector(611.0))))), s0(Vector(612.0, 613.0, 614.0), Vector(Vector(615.0)))))))), s0(Vector(616.0, 617.0, 618.0), Vector(Vector(619.0))))))), s4(s1(Vector(Vector(s0(Vector(620.0, 621.0, 622.0), Vector(Vector(623.0)))), Vector(s0(Vector(624.0, 625.0, 626.0), Vector(Vector(627.0))))), s0(Vector(628.0, 629.0, 630.0), Vector(Vector(631.0)))), Vector(s1(Vector(Vector(s0(Vector(632.0, 633.0, 634.0), Vector(Vector(635.0)))), Vector(s0(Vector(636.0, 637.0, 638.0), Vector(Vector(639.0))))), s0(Vector(640.0, 641.0, 642.0), Vector(Vector(643.0))))), s0(Vector(644.0, 645.0, 646.0), Vector(Vector(647.0))), s2(Vector(Vector(s1(Vector(Vector(s0(Vector(648.0, 649.0, 650.0), Vector(Vector(651.0)))), Vector(s0(Vector(652.0, 653.0, 654.0), Vector(Vector(655.0))))), s0(Vector(656.0, 657.0, 658.0), Vector(Vector(659.0)))))))))
    val v4: Double = 660.0
    val start = nanoTime()
    var result: Double = 660.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}