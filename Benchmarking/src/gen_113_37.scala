import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[Vector[s3]],
    p2: s1
  )
  case class s5 (
    p0: Vector[s0],
    p1: s4
  )
  case class s6 (
    p0: s0,
    p1: Vector[s3]
  )
  case class s7 (
    p0: s6,
    p1: s0
  )
  case class s8 (
    p0: Vector[Vector[s5]],
    p1: Vector[Vector[s7]]
  )
  case class s11 (
    p0: s1,
    p1: Vector[s5]
  )
  def f50(v0: Double): Double = {
    var v7: Double = v0
    var v2: Double = v0
    var v6: Double = v7
    val v22: Double = v6 * v2
    v22
  }
  @noinline
  def f0(v0: Vector[Vector[s11]], v1: Vector[s8], v2: s1, v3: s7, v4: Double): Double = {
    val v16: Double = f50(v4)
    val v15: Double = f50(v16)
    val v14: Double = f50(v15)
    var v10: Double = v14
    val v30: Double = v10 / v14
    val v35: Double = f50(v10)
    v10 = v35
    val v69: Double = v16 * v30
    v69
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s11]] = Vector(Vector(s11(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(1.0, 2.0, 3.0)))), s0(Vector(Vector(4.0)), Vector(5.0, 6.0, 7.0))), Vector(s5(Vector(s0(Vector(Vector(8.0)), Vector(9.0, 10.0, 11.0)), s0(Vector(Vector(12.0)), Vector(13.0, 14.0, 15.0))), s4(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(17.0, 18.0, 19.0)))), s0(Vector(Vector(20.0)), Vector(21.0, 22.0, 23.0))), s0(Vector(Vector(24.0)), Vector(25.0, 26.0, 27.0))), s2(s1(Vector(Vector(s0(Vector(Vector(28.0)), Vector(29.0, 30.0, 31.0)))), s0(Vector(Vector(32.0)), Vector(33.0, 34.0, 35.0))), s0(Vector(Vector(36.0)), Vector(37.0, 38.0, 39.0))), s2(s1(Vector(Vector(s0(Vector(Vector(40.0)), Vector(41.0, 42.0, 43.0)))), s0(Vector(Vector(44.0)), Vector(45.0, 46.0, 47.0))), s0(Vector(Vector(48.0)), Vector(49.0, 50.0, 51.0)))), Vector(Vector(s3(s0(Vector(Vector(52.0)), Vector(53.0, 54.0, 55.0)), s1(Vector(Vector(s0(Vector(Vector(56.0)), Vector(57.0, 58.0, 59.0)))), s0(Vector(Vector(60.0)), Vector(61.0, 62.0, 63.0)))))), s1(Vector(Vector(s0(Vector(Vector(64.0)), Vector(65.0, 66.0, 67.0)))), s0(Vector(Vector(68.0)), Vector(69.0, 70.0, 71.0))))), s5(Vector(s0(Vector(Vector(72.0)), Vector(73.0, 74.0, 75.0)), s0(Vector(Vector(76.0)), Vector(77.0, 78.0, 79.0))), s4(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(80.0)), Vector(81.0, 82.0, 83.0)))), s0(Vector(Vector(84.0)), Vector(85.0, 86.0, 87.0))), s0(Vector(Vector(88.0)), Vector(89.0, 90.0, 91.0))), s2(s1(Vector(Vector(s0(Vector(Vector(92.0)), Vector(93.0, 94.0, 95.0)))), s0(Vector(Vector(96.0)), Vector(97.0, 98.0, 99.0))), s0(Vector(Vector(100.0)), Vector(101.0, 102.0, 103.0))), s2(s1(Vector(Vector(s0(Vector(Vector(104.0)), Vector(105.0, 106.0, 107.0)))), s0(Vector(Vector(108.0)), Vector(109.0, 110.0, 111.0))), s0(Vector(Vector(112.0)), Vector(113.0, 114.0, 115.0)))), Vector(Vector(s3(s0(Vector(Vector(116.0)), Vector(117.0, 118.0, 119.0)), s1(Vector(Vector(s0(Vector(Vector(120.0)), Vector(121.0, 122.0, 123.0)))), s0(Vector(Vector(124.0)), Vector(125.0, 126.0, 127.0)))))), s1(Vector(Vector(s0(Vector(Vector(128.0)), Vector(129.0, 130.0, 131.0)))), s0(Vector(Vector(132.0)), Vector(133.0, 134.0, 135.0)))))))))
    val v1: Vector[s8] = Vector(s8(Vector(Vector(s5(Vector(s0(Vector(Vector(136.0)), Vector(137.0, 138.0, 139.0)), s0(Vector(Vector(140.0)), Vector(141.0, 142.0, 143.0))), s4(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(144.0)), Vector(145.0, 146.0, 147.0)))), s0(Vector(Vector(148.0)), Vector(149.0, 150.0, 151.0))), s0(Vector(Vector(152.0)), Vector(153.0, 154.0, 155.0))), s2(s1(Vector(Vector(s0(Vector(Vector(156.0)), Vector(157.0, 158.0, 159.0)))), s0(Vector(Vector(160.0)), Vector(161.0, 162.0, 163.0))), s0(Vector(Vector(164.0)), Vector(165.0, 166.0, 167.0))), s2(s1(Vector(Vector(s0(Vector(Vector(168.0)), Vector(169.0, 170.0, 171.0)))), s0(Vector(Vector(172.0)), Vector(173.0, 174.0, 175.0))), s0(Vector(Vector(176.0)), Vector(177.0, 178.0, 179.0)))), Vector(Vector(s3(s0(Vector(Vector(180.0)), Vector(181.0, 182.0, 183.0)), s1(Vector(Vector(s0(Vector(Vector(184.0)), Vector(185.0, 186.0, 187.0)))), s0(Vector(Vector(188.0)), Vector(189.0, 190.0, 191.0)))))), s1(Vector(Vector(s0(Vector(Vector(192.0)), Vector(193.0, 194.0, 195.0)))), s0(Vector(Vector(196.0)), Vector(197.0, 198.0, 199.0))))))), Vector(Vector(s7(s6(s0(Vector(Vector(200.0)), Vector(201.0, 202.0, 203.0)), Vector(s3(s0(Vector(Vector(204.0)), Vector(205.0, 206.0, 207.0)), s1(Vector(Vector(s0(Vector(Vector(208.0)), Vector(209.0, 210.0, 211.0)))), s0(Vector(Vector(212.0)), Vector(213.0, 214.0, 215.0)))), s3(s0(Vector(Vector(216.0)), Vector(217.0, 218.0, 219.0)), s1(Vector(Vector(s0(Vector(Vector(220.0)), Vector(221.0, 222.0, 223.0)))), s0(Vector(Vector(224.0)), Vector(225.0, 226.0, 227.0)))), s3(s0(Vector(Vector(228.0)), Vector(229.0, 230.0, 231.0)), s1(Vector(Vector(s0(Vector(Vector(232.0)), Vector(233.0, 234.0, 235.0)))), s0(Vector(Vector(236.0)), Vector(237.0, 238.0, 239.0)))))), s0(Vector(Vector(240.0)), Vector(241.0, 242.0, 243.0)))))), s8(Vector(Vector(s5(Vector(s0(Vector(Vector(244.0)), Vector(245.0, 246.0, 247.0)), s0(Vector(Vector(248.0)), Vector(249.0, 250.0, 251.0))), s4(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(252.0)), Vector(253.0, 254.0, 255.0)))), s0(Vector(Vector(256.0)), Vector(257.0, 258.0, 259.0))), s0(Vector(Vector(260.0)), Vector(261.0, 262.0, 263.0))), s2(s1(Vector(Vector(s0(Vector(Vector(264.0)), Vector(265.0, 266.0, 267.0)))), s0(Vector(Vector(268.0)), Vector(269.0, 270.0, 271.0))), s0(Vector(Vector(272.0)), Vector(273.0, 274.0, 275.0))), s2(s1(Vector(Vector(s0(Vector(Vector(276.0)), Vector(277.0, 278.0, 279.0)))), s0(Vector(Vector(280.0)), Vector(281.0, 282.0, 283.0))), s0(Vector(Vector(284.0)), Vector(285.0, 286.0, 287.0)))), Vector(Vector(s3(s0(Vector(Vector(288.0)), Vector(289.0, 290.0, 291.0)), s1(Vector(Vector(s0(Vector(Vector(292.0)), Vector(293.0, 294.0, 295.0)))), s0(Vector(Vector(296.0)), Vector(297.0, 298.0, 299.0)))))), s1(Vector(Vector(s0(Vector(Vector(300.0)), Vector(301.0, 302.0, 303.0)))), s0(Vector(Vector(304.0)), Vector(305.0, 306.0, 307.0))))))), Vector(Vector(s7(s6(s0(Vector(Vector(308.0)), Vector(309.0, 310.0, 311.0)), Vector(s3(s0(Vector(Vector(312.0)), Vector(313.0, 314.0, 315.0)), s1(Vector(Vector(s0(Vector(Vector(316.0)), Vector(317.0, 318.0, 319.0)))), s0(Vector(Vector(320.0)), Vector(321.0, 322.0, 323.0)))), s3(s0(Vector(Vector(324.0)), Vector(325.0, 326.0, 327.0)), s1(Vector(Vector(s0(Vector(Vector(328.0)), Vector(329.0, 330.0, 331.0)))), s0(Vector(Vector(332.0)), Vector(333.0, 334.0, 335.0)))), s3(s0(Vector(Vector(336.0)), Vector(337.0, 338.0, 339.0)), s1(Vector(Vector(s0(Vector(Vector(340.0)), Vector(341.0, 342.0, 343.0)))), s0(Vector(Vector(344.0)), Vector(345.0, 346.0, 347.0)))))), s0(Vector(Vector(348.0)), Vector(349.0, 350.0, 351.0)))))), s8(Vector(Vector(s5(Vector(s0(Vector(Vector(352.0)), Vector(353.0, 354.0, 355.0)), s0(Vector(Vector(356.0)), Vector(357.0, 358.0, 359.0))), s4(Vector(s2(s1(Vector(Vector(s0(Vector(Vector(360.0)), Vector(361.0, 362.0, 363.0)))), s0(Vector(Vector(364.0)), Vector(365.0, 366.0, 367.0))), s0(Vector(Vector(368.0)), Vector(369.0, 370.0, 371.0))), s2(s1(Vector(Vector(s0(Vector(Vector(372.0)), Vector(373.0, 374.0, 375.0)))), s0(Vector(Vector(376.0)), Vector(377.0, 378.0, 379.0))), s0(Vector(Vector(380.0)), Vector(381.0, 382.0, 383.0))), s2(s1(Vector(Vector(s0(Vector(Vector(384.0)), Vector(385.0, 386.0, 387.0)))), s0(Vector(Vector(388.0)), Vector(389.0, 390.0, 391.0))), s0(Vector(Vector(392.0)), Vector(393.0, 394.0, 395.0)))), Vector(Vector(s3(s0(Vector(Vector(396.0)), Vector(397.0, 398.0, 399.0)), s1(Vector(Vector(s0(Vector(Vector(400.0)), Vector(401.0, 402.0, 403.0)))), s0(Vector(Vector(404.0)), Vector(405.0, 406.0, 407.0)))))), s1(Vector(Vector(s0(Vector(Vector(408.0)), Vector(409.0, 410.0, 411.0)))), s0(Vector(Vector(412.0)), Vector(413.0, 414.0, 415.0))))))), Vector(Vector(s7(s6(s0(Vector(Vector(416.0)), Vector(417.0, 418.0, 419.0)), Vector(s3(s0(Vector(Vector(420.0)), Vector(421.0, 422.0, 423.0)), s1(Vector(Vector(s0(Vector(Vector(424.0)), Vector(425.0, 426.0, 427.0)))), s0(Vector(Vector(428.0)), Vector(429.0, 430.0, 431.0)))), s3(s0(Vector(Vector(432.0)), Vector(433.0, 434.0, 435.0)), s1(Vector(Vector(s0(Vector(Vector(436.0)), Vector(437.0, 438.0, 439.0)))), s0(Vector(Vector(440.0)), Vector(441.0, 442.0, 443.0)))), s3(s0(Vector(Vector(444.0)), Vector(445.0, 446.0, 447.0)), s1(Vector(Vector(s0(Vector(Vector(448.0)), Vector(449.0, 450.0, 451.0)))), s0(Vector(Vector(452.0)), Vector(453.0, 454.0, 455.0)))))), s0(Vector(Vector(456.0)), Vector(457.0, 458.0, 459.0)))))))
    val v2: s1 = s1(Vector(Vector(s0(Vector(Vector(460.0)), Vector(461.0, 462.0, 463.0)))), s0(Vector(Vector(464.0)), Vector(465.0, 466.0, 467.0)))
    val v3: s7 = s7(s6(s0(Vector(Vector(468.0)), Vector(469.0, 470.0, 471.0)), Vector(s3(s0(Vector(Vector(472.0)), Vector(473.0, 474.0, 475.0)), s1(Vector(Vector(s0(Vector(Vector(476.0)), Vector(477.0, 478.0, 479.0)))), s0(Vector(Vector(480.0)), Vector(481.0, 482.0, 483.0)))), s3(s0(Vector(Vector(484.0)), Vector(485.0, 486.0, 487.0)), s1(Vector(Vector(s0(Vector(Vector(488.0)), Vector(489.0, 490.0, 491.0)))), s0(Vector(Vector(492.0)), Vector(493.0, 494.0, 495.0)))), s3(s0(Vector(Vector(496.0)), Vector(497.0, 498.0, 499.0)), s1(Vector(Vector(s0(Vector(Vector(500.0)), Vector(501.0, 502.0, 503.0)))), s0(Vector(Vector(504.0)), Vector(505.0, 506.0, 507.0)))))), s0(Vector(Vector(508.0)), Vector(509.0, 510.0, 511.0)))
    val v4: Double = 512.0
    val start = nanoTime()
    var result: Double = 512.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}