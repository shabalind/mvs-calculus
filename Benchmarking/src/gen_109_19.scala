import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s2]
  )
  case class s4 (
    p0: s2,
    p1: Vector[s3],
    p2: Vector[s3]
  )
  case class s5 (
    p0: Vector[s1],
    p1: s3
  )
  case class s7 (
    p0: s2,
    p1: Vector[Vector[s3]],
    p2: Vector[Vector[s5]]
  )
  case class s9 (
    p0: Vector[s4],
    p1: Vector[s7]
  )
  case class s10 (
    p0: Vector[Vector[s7]],
    p1: Vector[Vector[s3]]
  )
  def f67(v0: s3, v1: s7, v2: s3): s3 = {
    val v3: Vector[s0] = v2.p0
    val v6: s2 = v1.p0
    var v4: Vector[s0] = v3
    val v7: s0 = v4(0)
    v4 = v4.updated(0, v7)
    val v29: Vector[s0] = v6.p0
    var v37: Vector[s0] = v29
    v4 = v4.updated(0, v7)
    val v47: s0 = v37(1)
    v4 = v4.updated(0, v47)
    val v52: Vector[s2] = v2.p1
    val v78: s3 = s3(v4, v52)
    v78
  }
  def f45(v0: Vector[s3]): Vector[s3] = {
    v0
  }
  @noinline
  def f0(v0: s10, v1: s9, v2: Vector[s5], v3: Vector[Vector[s7]], v4: Double): Double = {
    val v7: Vector[s7] = v3(1)
    val v5: Vector[Vector[s3]] = v0.p1
    val v6: Vector[s3] = v5(2)
    val v33: s7 = v7(0)
    val v23: Vector[s3] = f45(v6)
    val v35: s3 = v23(0)
    val v43: s3 = f67(v35, v33, v35)
    val v63: s3 = f67(v35, v33, v43)
    val v53: Vector[s0] = v63.p0
    val v146: s0 = v53(0)
    val v82: Double = v146.p1
    v82
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(Vector(Vector(s7(s2(Vector(s0(0.0, 1.0), s0(2.0, 3.0)), Vector(Vector(s1(s0(4.0, 5.0), s0(6.0, 7.0), Vector(Vector(s0(8.0, 9.0))))))), Vector(Vector(s3(Vector(s0(10.0, 11.0)), Vector(s2(Vector(s0(12.0, 13.0), s0(14.0, 15.0)), Vector(Vector(s1(s0(16.0, 17.0), s0(18.0, 19.0), Vector(Vector(s0(20.0, 21.0))))))), s2(Vector(s0(22.0, 23.0), s0(24.0, 25.0)), Vector(Vector(s1(s0(26.0, 27.0), s0(28.0, 29.0), Vector(Vector(s0(30.0, 31.0))))))), s2(Vector(s0(32.0, 33.0), s0(34.0, 35.0)), Vector(Vector(s1(s0(36.0, 37.0), s0(38.0, 39.0), Vector(Vector(s0(40.0, 41.0)))))))))), Vector(s3(Vector(s0(42.0, 43.0)), Vector(s2(Vector(s0(44.0, 45.0), s0(46.0, 47.0)), Vector(Vector(s1(s0(48.0, 49.0), s0(50.0, 51.0), Vector(Vector(s0(52.0, 53.0))))))), s2(Vector(s0(54.0, 55.0), s0(56.0, 57.0)), Vector(Vector(s1(s0(58.0, 59.0), s0(60.0, 61.0), Vector(Vector(s0(62.0, 63.0))))))), s2(Vector(s0(64.0, 65.0), s0(66.0, 67.0)), Vector(Vector(s1(s0(68.0, 69.0), s0(70.0, 71.0), Vector(Vector(s0(72.0, 73.0))))))))))), Vector(Vector(s5(Vector(s1(s0(74.0, 75.0), s0(76.0, 77.0), Vector(Vector(s0(78.0, 79.0)))), s1(s0(80.0, 81.0), s0(82.0, 83.0), Vector(Vector(s0(84.0, 85.0))))), s3(Vector(s0(86.0, 87.0)), Vector(s2(Vector(s0(88.0, 89.0), s0(90.0, 91.0)), Vector(Vector(s1(s0(92.0, 93.0), s0(94.0, 95.0), Vector(Vector(s0(96.0, 97.0))))))), s2(Vector(s0(98.0, 99.0), s0(100.0, 101.0)), Vector(Vector(s1(s0(102.0, 103.0), s0(104.0, 105.0), Vector(Vector(s0(106.0, 107.0))))))), s2(Vector(s0(108.0, 109.0), s0(110.0, 111.0)), Vector(Vector(s1(s0(112.0, 113.0), s0(114.0, 115.0), Vector(Vector(s0(116.0, 117.0))))))))))))))), Vector(Vector(s3(Vector(s0(118.0, 119.0)), Vector(s2(Vector(s0(120.0, 121.0), s0(122.0, 123.0)), Vector(Vector(s1(s0(124.0, 125.0), s0(126.0, 127.0), Vector(Vector(s0(128.0, 129.0))))))), s2(Vector(s0(130.0, 131.0), s0(132.0, 133.0)), Vector(Vector(s1(s0(134.0, 135.0), s0(136.0, 137.0), Vector(Vector(s0(138.0, 139.0))))))), s2(Vector(s0(140.0, 141.0), s0(142.0, 143.0)), Vector(Vector(s1(s0(144.0, 145.0), s0(146.0, 147.0), Vector(Vector(s0(148.0, 149.0)))))))))), Vector(s3(Vector(s0(150.0, 151.0)), Vector(s2(Vector(s0(152.0, 153.0), s0(154.0, 155.0)), Vector(Vector(s1(s0(156.0, 157.0), s0(158.0, 159.0), Vector(Vector(s0(160.0, 161.0))))))), s2(Vector(s0(162.0, 163.0), s0(164.0, 165.0)), Vector(Vector(s1(s0(166.0, 167.0), s0(168.0, 169.0), Vector(Vector(s0(170.0, 171.0))))))), s2(Vector(s0(172.0, 173.0), s0(174.0, 175.0)), Vector(Vector(s1(s0(176.0, 177.0), s0(178.0, 179.0), Vector(Vector(s0(180.0, 181.0)))))))))), Vector(s3(Vector(s0(182.0, 183.0)), Vector(s2(Vector(s0(184.0, 185.0), s0(186.0, 187.0)), Vector(Vector(s1(s0(188.0, 189.0), s0(190.0, 191.0), Vector(Vector(s0(192.0, 193.0))))))), s2(Vector(s0(194.0, 195.0), s0(196.0, 197.0)), Vector(Vector(s1(s0(198.0, 199.0), s0(200.0, 201.0), Vector(Vector(s0(202.0, 203.0))))))), s2(Vector(s0(204.0, 205.0), s0(206.0, 207.0)), Vector(Vector(s1(s0(208.0, 209.0), s0(210.0, 211.0), Vector(Vector(s0(212.0, 213.0))))))))))))
    val v1: s9 = s9(Vector(s4(s2(Vector(s0(214.0, 215.0), s0(216.0, 217.0)), Vector(Vector(s1(s0(218.0, 219.0), s0(220.0, 221.0), Vector(Vector(s0(222.0, 223.0))))))), Vector(s3(Vector(s0(224.0, 225.0)), Vector(s2(Vector(s0(226.0, 227.0), s0(228.0, 229.0)), Vector(Vector(s1(s0(230.0, 231.0), s0(232.0, 233.0), Vector(Vector(s0(234.0, 235.0))))))), s2(Vector(s0(236.0, 237.0), s0(238.0, 239.0)), Vector(Vector(s1(s0(240.0, 241.0), s0(242.0, 243.0), Vector(Vector(s0(244.0, 245.0))))))), s2(Vector(s0(246.0, 247.0), s0(248.0, 249.0)), Vector(Vector(s1(s0(250.0, 251.0), s0(252.0, 253.0), Vector(Vector(s0(254.0, 255.0))))))))), s3(Vector(s0(256.0, 257.0)), Vector(s2(Vector(s0(258.0, 259.0), s0(260.0, 261.0)), Vector(Vector(s1(s0(262.0, 263.0), s0(264.0, 265.0), Vector(Vector(s0(266.0, 267.0))))))), s2(Vector(s0(268.0, 269.0), s0(270.0, 271.0)), Vector(Vector(s1(s0(272.0, 273.0), s0(274.0, 275.0), Vector(Vector(s0(276.0, 277.0))))))), s2(Vector(s0(278.0, 279.0), s0(280.0, 281.0)), Vector(Vector(s1(s0(282.0, 283.0), s0(284.0, 285.0), Vector(Vector(s0(286.0, 287.0)))))))))), Vector(s3(Vector(s0(288.0, 289.0)), Vector(s2(Vector(s0(290.0, 291.0), s0(292.0, 293.0)), Vector(Vector(s1(s0(294.0, 295.0), s0(296.0, 297.0), Vector(Vector(s0(298.0, 299.0))))))), s2(Vector(s0(300.0, 301.0), s0(302.0, 303.0)), Vector(Vector(s1(s0(304.0, 305.0), s0(306.0, 307.0), Vector(Vector(s0(308.0, 309.0))))))), s2(Vector(s0(310.0, 311.0), s0(312.0, 313.0)), Vector(Vector(s1(s0(314.0, 315.0), s0(316.0, 317.0), Vector(Vector(s0(318.0, 319.0))))))))))), s4(s2(Vector(s0(320.0, 321.0), s0(322.0, 323.0)), Vector(Vector(s1(s0(324.0, 325.0), s0(326.0, 327.0), Vector(Vector(s0(328.0, 329.0))))))), Vector(s3(Vector(s0(330.0, 331.0)), Vector(s2(Vector(s0(332.0, 333.0), s0(334.0, 335.0)), Vector(Vector(s1(s0(336.0, 337.0), s0(338.0, 339.0), Vector(Vector(s0(340.0, 341.0))))))), s2(Vector(s0(342.0, 343.0), s0(344.0, 345.0)), Vector(Vector(s1(s0(346.0, 347.0), s0(348.0, 349.0), Vector(Vector(s0(350.0, 351.0))))))), s2(Vector(s0(352.0, 353.0), s0(354.0, 355.0)), Vector(Vector(s1(s0(356.0, 357.0), s0(358.0, 359.0), Vector(Vector(s0(360.0, 361.0))))))))), s3(Vector(s0(362.0, 363.0)), Vector(s2(Vector(s0(364.0, 365.0), s0(366.0, 367.0)), Vector(Vector(s1(s0(368.0, 369.0), s0(370.0, 371.0), Vector(Vector(s0(372.0, 373.0))))))), s2(Vector(s0(374.0, 375.0), s0(376.0, 377.0)), Vector(Vector(s1(s0(378.0, 379.0), s0(380.0, 381.0), Vector(Vector(s0(382.0, 383.0))))))), s2(Vector(s0(384.0, 385.0), s0(386.0, 387.0)), Vector(Vector(s1(s0(388.0, 389.0), s0(390.0, 391.0), Vector(Vector(s0(392.0, 393.0)))))))))), Vector(s3(Vector(s0(394.0, 395.0)), Vector(s2(Vector(s0(396.0, 397.0), s0(398.0, 399.0)), Vector(Vector(s1(s0(400.0, 401.0), s0(402.0, 403.0), Vector(Vector(s0(404.0, 405.0))))))), s2(Vector(s0(406.0, 407.0), s0(408.0, 409.0)), Vector(Vector(s1(s0(410.0, 411.0), s0(412.0, 413.0), Vector(Vector(s0(414.0, 415.0))))))), s2(Vector(s0(416.0, 417.0), s0(418.0, 419.0)), Vector(Vector(s1(s0(420.0, 421.0), s0(422.0, 423.0), Vector(Vector(s0(424.0, 425.0)))))))))))), Vector(s7(s2(Vector(s0(426.0, 427.0), s0(428.0, 429.0)), Vector(Vector(s1(s0(430.0, 431.0), s0(432.0, 433.0), Vector(Vector(s0(434.0, 435.0))))))), Vector(Vector(s3(Vector(s0(436.0, 437.0)), Vector(s2(Vector(s0(438.0, 439.0), s0(440.0, 441.0)), Vector(Vector(s1(s0(442.0, 443.0), s0(444.0, 445.0), Vector(Vector(s0(446.0, 447.0))))))), s2(Vector(s0(448.0, 449.0), s0(450.0, 451.0)), Vector(Vector(s1(s0(452.0, 453.0), s0(454.0, 455.0), Vector(Vector(s0(456.0, 457.0))))))), s2(Vector(s0(458.0, 459.0), s0(460.0, 461.0)), Vector(Vector(s1(s0(462.0, 463.0), s0(464.0, 465.0), Vector(Vector(s0(466.0, 467.0)))))))))), Vector(s3(Vector(s0(468.0, 469.0)), Vector(s2(Vector(s0(470.0, 471.0), s0(472.0, 473.0)), Vector(Vector(s1(s0(474.0, 475.0), s0(476.0, 477.0), Vector(Vector(s0(478.0, 479.0))))))), s2(Vector(s0(480.0, 481.0), s0(482.0, 483.0)), Vector(Vector(s1(s0(484.0, 485.0), s0(486.0, 487.0), Vector(Vector(s0(488.0, 489.0))))))), s2(Vector(s0(490.0, 491.0), s0(492.0, 493.0)), Vector(Vector(s1(s0(494.0, 495.0), s0(496.0, 497.0), Vector(Vector(s0(498.0, 499.0))))))))))), Vector(Vector(s5(Vector(s1(s0(500.0, 501.0), s0(502.0, 503.0), Vector(Vector(s0(504.0, 505.0)))), s1(s0(506.0, 507.0), s0(508.0, 509.0), Vector(Vector(s0(510.0, 511.0))))), s3(Vector(s0(512.0, 513.0)), Vector(s2(Vector(s0(514.0, 515.0), s0(516.0, 517.0)), Vector(Vector(s1(s0(518.0, 519.0), s0(520.0, 521.0), Vector(Vector(s0(522.0, 523.0))))))), s2(Vector(s0(524.0, 525.0), s0(526.0, 527.0)), Vector(Vector(s1(s0(528.0, 529.0), s0(530.0, 531.0), Vector(Vector(s0(532.0, 533.0))))))), s2(Vector(s0(534.0, 535.0), s0(536.0, 537.0)), Vector(Vector(s1(s0(538.0, 539.0), s0(540.0, 541.0), Vector(Vector(s0(542.0, 543.0))))))))))))), s7(s2(Vector(s0(544.0, 545.0), s0(546.0, 547.0)), Vector(Vector(s1(s0(548.0, 549.0), s0(550.0, 551.0), Vector(Vector(s0(552.0, 553.0))))))), Vector(Vector(s3(Vector(s0(554.0, 555.0)), Vector(s2(Vector(s0(556.0, 557.0), s0(558.0, 559.0)), Vector(Vector(s1(s0(560.0, 561.0), s0(562.0, 563.0), Vector(Vector(s0(564.0, 565.0))))))), s2(Vector(s0(566.0, 567.0), s0(568.0, 569.0)), Vector(Vector(s1(s0(570.0, 571.0), s0(572.0, 573.0), Vector(Vector(s0(574.0, 575.0))))))), s2(Vector(s0(576.0, 577.0), s0(578.0, 579.0)), Vector(Vector(s1(s0(580.0, 581.0), s0(582.0, 583.0), Vector(Vector(s0(584.0, 585.0)))))))))), Vector(s3(Vector(s0(586.0, 587.0)), Vector(s2(Vector(s0(588.0, 589.0), s0(590.0, 591.0)), Vector(Vector(s1(s0(592.0, 593.0), s0(594.0, 595.0), Vector(Vector(s0(596.0, 597.0))))))), s2(Vector(s0(598.0, 599.0), s0(600.0, 601.0)), Vector(Vector(s1(s0(602.0, 603.0), s0(604.0, 605.0), Vector(Vector(s0(606.0, 607.0))))))), s2(Vector(s0(608.0, 609.0), s0(610.0, 611.0)), Vector(Vector(s1(s0(612.0, 613.0), s0(614.0, 615.0), Vector(Vector(s0(616.0, 617.0))))))))))), Vector(Vector(s5(Vector(s1(s0(618.0, 619.0), s0(620.0, 621.0), Vector(Vector(s0(622.0, 623.0)))), s1(s0(624.0, 625.0), s0(626.0, 627.0), Vector(Vector(s0(628.0, 629.0))))), s3(Vector(s0(630.0, 631.0)), Vector(s2(Vector(s0(632.0, 633.0), s0(634.0, 635.0)), Vector(Vector(s1(s0(636.0, 637.0), s0(638.0, 639.0), Vector(Vector(s0(640.0, 641.0))))))), s2(Vector(s0(642.0, 643.0), s0(644.0, 645.0)), Vector(Vector(s1(s0(646.0, 647.0), s0(648.0, 649.0), Vector(Vector(s0(650.0, 651.0))))))), s2(Vector(s0(652.0, 653.0), s0(654.0, 655.0)), Vector(Vector(s1(s0(656.0, 657.0), s0(658.0, 659.0), Vector(Vector(s0(660.0, 661.0)))))))))))))))
    val v2: Vector[s5] = Vector(s5(Vector(s1(s0(662.0, 663.0), s0(664.0, 665.0), Vector(Vector(s0(666.0, 667.0)))), s1(s0(668.0, 669.0), s0(670.0, 671.0), Vector(Vector(s0(672.0, 673.0))))), s3(Vector(s0(674.0, 675.0)), Vector(s2(Vector(s0(676.0, 677.0), s0(678.0, 679.0)), Vector(Vector(s1(s0(680.0, 681.0), s0(682.0, 683.0), Vector(Vector(s0(684.0, 685.0))))))), s2(Vector(s0(686.0, 687.0), s0(688.0, 689.0)), Vector(Vector(s1(s0(690.0, 691.0), s0(692.0, 693.0), Vector(Vector(s0(694.0, 695.0))))))), s2(Vector(s0(696.0, 697.0), s0(698.0, 699.0)), Vector(Vector(s1(s0(700.0, 701.0), s0(702.0, 703.0), Vector(Vector(s0(704.0, 705.0)))))))))), s5(Vector(s1(s0(706.0, 707.0), s0(708.0, 709.0), Vector(Vector(s0(710.0, 711.0)))), s1(s0(712.0, 713.0), s0(714.0, 715.0), Vector(Vector(s0(716.0, 717.0))))), s3(Vector(s0(718.0, 719.0)), Vector(s2(Vector(s0(720.0, 721.0), s0(722.0, 723.0)), Vector(Vector(s1(s0(724.0, 725.0), s0(726.0, 727.0), Vector(Vector(s0(728.0, 729.0))))))), s2(Vector(s0(730.0, 731.0), s0(732.0, 733.0)), Vector(Vector(s1(s0(734.0, 735.0), s0(736.0, 737.0), Vector(Vector(s0(738.0, 739.0))))))), s2(Vector(s0(740.0, 741.0), s0(742.0, 743.0)), Vector(Vector(s1(s0(744.0, 745.0), s0(746.0, 747.0), Vector(Vector(s0(748.0, 749.0)))))))))))
    val v3: Vector[Vector[s7]] = Vector(Vector(s7(s2(Vector(s0(750.0, 751.0), s0(752.0, 753.0)), Vector(Vector(s1(s0(754.0, 755.0), s0(756.0, 757.0), Vector(Vector(s0(758.0, 759.0))))))), Vector(Vector(s3(Vector(s0(760.0, 761.0)), Vector(s2(Vector(s0(762.0, 763.0), s0(764.0, 765.0)), Vector(Vector(s1(s0(766.0, 767.0), s0(768.0, 769.0), Vector(Vector(s0(770.0, 771.0))))))), s2(Vector(s0(772.0, 773.0), s0(774.0, 775.0)), Vector(Vector(s1(s0(776.0, 777.0), s0(778.0, 779.0), Vector(Vector(s0(780.0, 781.0))))))), s2(Vector(s0(782.0, 783.0), s0(784.0, 785.0)), Vector(Vector(s1(s0(786.0, 787.0), s0(788.0, 789.0), Vector(Vector(s0(790.0, 791.0)))))))))), Vector(s3(Vector(s0(792.0, 793.0)), Vector(s2(Vector(s0(794.0, 795.0), s0(796.0, 797.0)), Vector(Vector(s1(s0(798.0, 799.0), s0(800.0, 801.0), Vector(Vector(s0(802.0, 803.0))))))), s2(Vector(s0(804.0, 805.0), s0(806.0, 807.0)), Vector(Vector(s1(s0(808.0, 809.0), s0(810.0, 811.0), Vector(Vector(s0(812.0, 813.0))))))), s2(Vector(s0(814.0, 815.0), s0(816.0, 817.0)), Vector(Vector(s1(s0(818.0, 819.0), s0(820.0, 821.0), Vector(Vector(s0(822.0, 823.0))))))))))), Vector(Vector(s5(Vector(s1(s0(824.0, 825.0), s0(826.0, 827.0), Vector(Vector(s0(828.0, 829.0)))), s1(s0(830.0, 831.0), s0(832.0, 833.0), Vector(Vector(s0(834.0, 835.0))))), s3(Vector(s0(836.0, 837.0)), Vector(s2(Vector(s0(838.0, 839.0), s0(840.0, 841.0)), Vector(Vector(s1(s0(842.0, 843.0), s0(844.0, 845.0), Vector(Vector(s0(846.0, 847.0))))))), s2(Vector(s0(848.0, 849.0), s0(850.0, 851.0)), Vector(Vector(s1(s0(852.0, 853.0), s0(854.0, 855.0), Vector(Vector(s0(856.0, 857.0))))))), s2(Vector(s0(858.0, 859.0), s0(860.0, 861.0)), Vector(Vector(s1(s0(862.0, 863.0), s0(864.0, 865.0), Vector(Vector(s0(866.0, 867.0)))))))))))))), Vector(s7(s2(Vector(s0(868.0, 869.0), s0(870.0, 871.0)), Vector(Vector(s1(s0(872.0, 873.0), s0(874.0, 875.0), Vector(Vector(s0(876.0, 877.0))))))), Vector(Vector(s3(Vector(s0(878.0, 879.0)), Vector(s2(Vector(s0(880.0, 881.0), s0(882.0, 883.0)), Vector(Vector(s1(s0(884.0, 885.0), s0(886.0, 887.0), Vector(Vector(s0(888.0, 889.0))))))), s2(Vector(s0(890.0, 891.0), s0(892.0, 893.0)), Vector(Vector(s1(s0(894.0, 895.0), s0(896.0, 897.0), Vector(Vector(s0(898.0, 899.0))))))), s2(Vector(s0(900.0, 901.0), s0(902.0, 903.0)), Vector(Vector(s1(s0(904.0, 905.0), s0(906.0, 907.0), Vector(Vector(s0(908.0, 909.0)))))))))), Vector(s3(Vector(s0(910.0, 911.0)), Vector(s2(Vector(s0(912.0, 913.0), s0(914.0, 915.0)), Vector(Vector(s1(s0(916.0, 917.0), s0(918.0, 919.0), Vector(Vector(s0(920.0, 921.0))))))), s2(Vector(s0(922.0, 923.0), s0(924.0, 925.0)), Vector(Vector(s1(s0(926.0, 927.0), s0(928.0, 929.0), Vector(Vector(s0(930.0, 931.0))))))), s2(Vector(s0(932.0, 933.0), s0(934.0, 935.0)), Vector(Vector(s1(s0(936.0, 937.0), s0(938.0, 939.0), Vector(Vector(s0(940.0, 941.0))))))))))), Vector(Vector(s5(Vector(s1(s0(942.0, 943.0), s0(944.0, 945.0), Vector(Vector(s0(946.0, 947.0)))), s1(s0(948.0, 949.0), s0(950.0, 951.0), Vector(Vector(s0(952.0, 953.0))))), s3(Vector(s0(954.0, 955.0)), Vector(s2(Vector(s0(956.0, 957.0), s0(958.0, 959.0)), Vector(Vector(s1(s0(960.0, 961.0), s0(962.0, 963.0), Vector(Vector(s0(964.0, 965.0))))))), s2(Vector(s0(966.0, 967.0), s0(968.0, 969.0)), Vector(Vector(s1(s0(970.0, 971.0), s0(972.0, 973.0), Vector(Vector(s0(974.0, 975.0))))))), s2(Vector(s0(976.0, 977.0), s0(978.0, 979.0)), Vector(Vector(s1(s0(980.0, 981.0), s0(982.0, 983.0), Vector(Vector(s0(984.0, 985.0)))))))))))))), Vector(s7(s2(Vector(s0(986.0, 987.0), s0(988.0, 989.0)), Vector(Vector(s1(s0(990.0, 991.0), s0(992.0, 993.0), Vector(Vector(s0(994.0, 995.0))))))), Vector(Vector(s3(Vector(s0(996.0, 997.0)), Vector(s2(Vector(s0(998.0, 999.0), s0(1000.0, 1001.0)), Vector(Vector(s1(s0(1002.0, 1003.0), s0(1004.0, 1005.0), Vector(Vector(s0(1006.0, 1007.0))))))), s2(Vector(s0(1008.0, 1009.0), s0(1010.0, 1011.0)), Vector(Vector(s1(s0(1012.0, 1013.0), s0(1014.0, 1015.0), Vector(Vector(s0(1016.0, 1017.0))))))), s2(Vector(s0(1018.0, 1019.0), s0(1020.0, 1021.0)), Vector(Vector(s1(s0(1022.0, 1023.0), s0(1024.0, 1025.0), Vector(Vector(s0(1026.0, 1027.0)))))))))), Vector(s3(Vector(s0(1028.0, 1029.0)), Vector(s2(Vector(s0(1030.0, 1031.0), s0(1032.0, 1033.0)), Vector(Vector(s1(s0(1034.0, 1035.0), s0(1036.0, 1037.0), Vector(Vector(s0(1038.0, 1039.0))))))), s2(Vector(s0(1040.0, 1041.0), s0(1042.0, 1043.0)), Vector(Vector(s1(s0(1044.0, 1045.0), s0(1046.0, 1047.0), Vector(Vector(s0(1048.0, 1049.0))))))), s2(Vector(s0(1050.0, 1051.0), s0(1052.0, 1053.0)), Vector(Vector(s1(s0(1054.0, 1055.0), s0(1056.0, 1057.0), Vector(Vector(s0(1058.0, 1059.0))))))))))), Vector(Vector(s5(Vector(s1(s0(1060.0, 1061.0), s0(1062.0, 1063.0), Vector(Vector(s0(1064.0, 1065.0)))), s1(s0(1066.0, 1067.0), s0(1068.0, 1069.0), Vector(Vector(s0(1070.0, 1071.0))))), s3(Vector(s0(1072.0, 1073.0)), Vector(s2(Vector(s0(1074.0, 1075.0), s0(1076.0, 1077.0)), Vector(Vector(s1(s0(1078.0, 1079.0), s0(1080.0, 1081.0), Vector(Vector(s0(1082.0, 1083.0))))))), s2(Vector(s0(1084.0, 1085.0), s0(1086.0, 1087.0)), Vector(Vector(s1(s0(1088.0, 1089.0), s0(1090.0, 1091.0), Vector(Vector(s0(1092.0, 1093.0))))))), s2(Vector(s0(1094.0, 1095.0), s0(1096.0, 1097.0)), Vector(Vector(s1(s0(1098.0, 1099.0), s0(1100.0, 1101.0), Vector(Vector(s0(1102.0, 1103.0)))))))))))))))
    val v4: Double = 1104.0
    val start = nanoTime()
    var result: Double = 1104.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}