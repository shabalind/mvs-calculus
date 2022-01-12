import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s5 (
    p0: Vector[s4],
    p1: s3
  )
  case class s6 (
    p0: Vector[s0],
    p1: Vector[Vector[s5]]
  )
  case class s7 (
    p0: Vector[Vector[s3]],
    p1: Vector[s3]
  )
  case class s9 (
    p0: Vector[s3],
    p1: Vector[s6]
  )
  case class s11 (
    p0: s5,
    p1: s9
  )
  case class s13 (
    p0: s11,
    p1: Vector[s7]
  )
  @noinline
  def f0(v0: Vector[Vector[s7]], v1: s13, v2: Double): Double = {
    val v5: Vector[s7] = v1.p1
    val v12: s7 = v5(1)
    val v11: Vector[Vector[s3]] = v12.p0
    val v19: Vector[s3] = v11(0)
    val v31: s3 = v19(0)
    val v40: s3 = v19(0)
    val v37: s1 = v31.p1
    val v29: s1 = v40.p1
    var v62: s1 = v37
    val v184: s0 = v62.p1
    v62 = v29
    val v110: Vector[Double] = v184.p0
    val v111: Double = v110(1)
    v111
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s7]] = Vector(Vector(s7(Vector(Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(0.0, 1.0), Vector(2.0, 3.0, 4.0)), s0(Vector(5.0, 6.0), Vector(7.0, 8.0, 9.0)), s0(Vector(10.0, 11.0), Vector(12.0, 13.0, 14.0))), s0(Vector(15.0, 16.0), Vector(17.0, 18.0, 19.0)))), Vector(s1(Vector(s0(Vector(20.0, 21.0), Vector(22.0, 23.0, 24.0)), s0(Vector(25.0, 26.0), Vector(27.0, 28.0, 29.0)), s0(Vector(30.0, 31.0), Vector(32.0, 33.0, 34.0))), s0(Vector(35.0, 36.0), Vector(37.0, 38.0, 39.0)))), Vector(s1(Vector(s0(Vector(40.0, 41.0), Vector(42.0, 43.0, 44.0)), s0(Vector(45.0, 46.0), Vector(47.0, 48.0, 49.0)), s0(Vector(50.0, 51.0), Vector(52.0, 53.0, 54.0))), s0(Vector(55.0, 56.0), Vector(57.0, 58.0, 59.0))))), s0(Vector(60.0, 61.0), Vector(62.0, 63.0, 64.0))), s1(Vector(s0(Vector(65.0, 66.0), Vector(67.0, 68.0, 69.0)), s0(Vector(70.0, 71.0), Vector(72.0, 73.0, 74.0)), s0(Vector(75.0, 76.0), Vector(77.0, 78.0, 79.0))), s0(Vector(80.0, 81.0), Vector(82.0, 83.0, 84.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(85.0, 86.0), Vector(87.0, 88.0, 89.0)), s0(Vector(90.0, 91.0), Vector(92.0, 93.0, 94.0)), s0(Vector(95.0, 96.0), Vector(97.0, 98.0, 99.0))), s0(Vector(100.0, 101.0), Vector(102.0, 103.0, 104.0)))), Vector(s1(Vector(s0(Vector(105.0, 106.0), Vector(107.0, 108.0, 109.0)), s0(Vector(110.0, 111.0), Vector(112.0, 113.0, 114.0)), s0(Vector(115.0, 116.0), Vector(117.0, 118.0, 119.0))), s0(Vector(120.0, 121.0), Vector(122.0, 123.0, 124.0)))), Vector(s1(Vector(s0(Vector(125.0, 126.0), Vector(127.0, 128.0, 129.0)), s0(Vector(130.0, 131.0), Vector(132.0, 133.0, 134.0)), s0(Vector(135.0, 136.0), Vector(137.0, 138.0, 139.0))), s0(Vector(140.0, 141.0), Vector(142.0, 143.0, 144.0))))), s0(Vector(145.0, 146.0), Vector(147.0, 148.0, 149.0))), s1(Vector(s0(Vector(150.0, 151.0), Vector(152.0, 153.0, 154.0)), s0(Vector(155.0, 156.0), Vector(157.0, 158.0, 159.0)), s0(Vector(160.0, 161.0), Vector(162.0, 163.0, 164.0))), s0(Vector(165.0, 166.0), Vector(167.0, 168.0, 169.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(170.0, 171.0), Vector(172.0, 173.0, 174.0)), s0(Vector(175.0, 176.0), Vector(177.0, 178.0, 179.0)), s0(Vector(180.0, 181.0), Vector(182.0, 183.0, 184.0))), s0(Vector(185.0, 186.0), Vector(187.0, 188.0, 189.0)))), Vector(s1(Vector(s0(Vector(190.0, 191.0), Vector(192.0, 193.0, 194.0)), s0(Vector(195.0, 196.0), Vector(197.0, 198.0, 199.0)), s0(Vector(200.0, 201.0), Vector(202.0, 203.0, 204.0))), s0(Vector(205.0, 206.0), Vector(207.0, 208.0, 209.0)))), Vector(s1(Vector(s0(Vector(210.0, 211.0), Vector(212.0, 213.0, 214.0)), s0(Vector(215.0, 216.0), Vector(217.0, 218.0, 219.0)), s0(Vector(220.0, 221.0), Vector(222.0, 223.0, 224.0))), s0(Vector(225.0, 226.0), Vector(227.0, 228.0, 229.0))))), s0(Vector(230.0, 231.0), Vector(232.0, 233.0, 234.0))), s1(Vector(s0(Vector(235.0, 236.0), Vector(237.0, 238.0, 239.0)), s0(Vector(240.0, 241.0), Vector(242.0, 243.0, 244.0)), s0(Vector(245.0, 246.0), Vector(247.0, 248.0, 249.0))), s0(Vector(250.0, 251.0), Vector(252.0, 253.0, 254.0)))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(255.0, 256.0), Vector(257.0, 258.0, 259.0)), s0(Vector(260.0, 261.0), Vector(262.0, 263.0, 264.0)), s0(Vector(265.0, 266.0), Vector(267.0, 268.0, 269.0))), s0(Vector(270.0, 271.0), Vector(272.0, 273.0, 274.0)))), Vector(s1(Vector(s0(Vector(275.0, 276.0), Vector(277.0, 278.0, 279.0)), s0(Vector(280.0, 281.0), Vector(282.0, 283.0, 284.0)), s0(Vector(285.0, 286.0), Vector(287.0, 288.0, 289.0))), s0(Vector(290.0, 291.0), Vector(292.0, 293.0, 294.0)))), Vector(s1(Vector(s0(Vector(295.0, 296.0), Vector(297.0, 298.0, 299.0)), s0(Vector(300.0, 301.0), Vector(302.0, 303.0, 304.0)), s0(Vector(305.0, 306.0), Vector(307.0, 308.0, 309.0))), s0(Vector(310.0, 311.0), Vector(312.0, 313.0, 314.0))))), s0(Vector(315.0, 316.0), Vector(317.0, 318.0, 319.0))), s1(Vector(s0(Vector(320.0, 321.0), Vector(322.0, 323.0, 324.0)), s0(Vector(325.0, 326.0), Vector(327.0, 328.0, 329.0)), s0(Vector(330.0, 331.0), Vector(332.0, 333.0, 334.0))), s0(Vector(335.0, 336.0), Vector(337.0, 338.0, 339.0))))))), Vector(s7(Vector(Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(340.0, 341.0), Vector(342.0, 343.0, 344.0)), s0(Vector(345.0, 346.0), Vector(347.0, 348.0, 349.0)), s0(Vector(350.0, 351.0), Vector(352.0, 353.0, 354.0))), s0(Vector(355.0, 356.0), Vector(357.0, 358.0, 359.0)))), Vector(s1(Vector(s0(Vector(360.0, 361.0), Vector(362.0, 363.0, 364.0)), s0(Vector(365.0, 366.0), Vector(367.0, 368.0, 369.0)), s0(Vector(370.0, 371.0), Vector(372.0, 373.0, 374.0))), s0(Vector(375.0, 376.0), Vector(377.0, 378.0, 379.0)))), Vector(s1(Vector(s0(Vector(380.0, 381.0), Vector(382.0, 383.0, 384.0)), s0(Vector(385.0, 386.0), Vector(387.0, 388.0, 389.0)), s0(Vector(390.0, 391.0), Vector(392.0, 393.0, 394.0))), s0(Vector(395.0, 396.0), Vector(397.0, 398.0, 399.0))))), s0(Vector(400.0, 401.0), Vector(402.0, 403.0, 404.0))), s1(Vector(s0(Vector(405.0, 406.0), Vector(407.0, 408.0, 409.0)), s0(Vector(410.0, 411.0), Vector(412.0, 413.0, 414.0)), s0(Vector(415.0, 416.0), Vector(417.0, 418.0, 419.0))), s0(Vector(420.0, 421.0), Vector(422.0, 423.0, 424.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(425.0, 426.0), Vector(427.0, 428.0, 429.0)), s0(Vector(430.0, 431.0), Vector(432.0, 433.0, 434.0)), s0(Vector(435.0, 436.0), Vector(437.0, 438.0, 439.0))), s0(Vector(440.0, 441.0), Vector(442.0, 443.0, 444.0)))), Vector(s1(Vector(s0(Vector(445.0, 446.0), Vector(447.0, 448.0, 449.0)), s0(Vector(450.0, 451.0), Vector(452.0, 453.0, 454.0)), s0(Vector(455.0, 456.0), Vector(457.0, 458.0, 459.0))), s0(Vector(460.0, 461.0), Vector(462.0, 463.0, 464.0)))), Vector(s1(Vector(s0(Vector(465.0, 466.0), Vector(467.0, 468.0, 469.0)), s0(Vector(470.0, 471.0), Vector(472.0, 473.0, 474.0)), s0(Vector(475.0, 476.0), Vector(477.0, 478.0, 479.0))), s0(Vector(480.0, 481.0), Vector(482.0, 483.0, 484.0))))), s0(Vector(485.0, 486.0), Vector(487.0, 488.0, 489.0))), s1(Vector(s0(Vector(490.0, 491.0), Vector(492.0, 493.0, 494.0)), s0(Vector(495.0, 496.0), Vector(497.0, 498.0, 499.0)), s0(Vector(500.0, 501.0), Vector(502.0, 503.0, 504.0))), s0(Vector(505.0, 506.0), Vector(507.0, 508.0, 509.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(510.0, 511.0), Vector(512.0, 513.0, 514.0)), s0(Vector(515.0, 516.0), Vector(517.0, 518.0, 519.0)), s0(Vector(520.0, 521.0), Vector(522.0, 523.0, 524.0))), s0(Vector(525.0, 526.0), Vector(527.0, 528.0, 529.0)))), Vector(s1(Vector(s0(Vector(530.0, 531.0), Vector(532.0, 533.0, 534.0)), s0(Vector(535.0, 536.0), Vector(537.0, 538.0, 539.0)), s0(Vector(540.0, 541.0), Vector(542.0, 543.0, 544.0))), s0(Vector(545.0, 546.0), Vector(547.0, 548.0, 549.0)))), Vector(s1(Vector(s0(Vector(550.0, 551.0), Vector(552.0, 553.0, 554.0)), s0(Vector(555.0, 556.0), Vector(557.0, 558.0, 559.0)), s0(Vector(560.0, 561.0), Vector(562.0, 563.0, 564.0))), s0(Vector(565.0, 566.0), Vector(567.0, 568.0, 569.0))))), s0(Vector(570.0, 571.0), Vector(572.0, 573.0, 574.0))), s1(Vector(s0(Vector(575.0, 576.0), Vector(577.0, 578.0, 579.0)), s0(Vector(580.0, 581.0), Vector(582.0, 583.0, 584.0)), s0(Vector(585.0, 586.0), Vector(587.0, 588.0, 589.0))), s0(Vector(590.0, 591.0), Vector(592.0, 593.0, 594.0)))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(595.0, 596.0), Vector(597.0, 598.0, 599.0)), s0(Vector(600.0, 601.0), Vector(602.0, 603.0, 604.0)), s0(Vector(605.0, 606.0), Vector(607.0, 608.0, 609.0))), s0(Vector(610.0, 611.0), Vector(612.0, 613.0, 614.0)))), Vector(s1(Vector(s0(Vector(615.0, 616.0), Vector(617.0, 618.0, 619.0)), s0(Vector(620.0, 621.0), Vector(622.0, 623.0, 624.0)), s0(Vector(625.0, 626.0), Vector(627.0, 628.0, 629.0))), s0(Vector(630.0, 631.0), Vector(632.0, 633.0, 634.0)))), Vector(s1(Vector(s0(Vector(635.0, 636.0), Vector(637.0, 638.0, 639.0)), s0(Vector(640.0, 641.0), Vector(642.0, 643.0, 644.0)), s0(Vector(645.0, 646.0), Vector(647.0, 648.0, 649.0))), s0(Vector(650.0, 651.0), Vector(652.0, 653.0, 654.0))))), s0(Vector(655.0, 656.0), Vector(657.0, 658.0, 659.0))), s1(Vector(s0(Vector(660.0, 661.0), Vector(662.0, 663.0, 664.0)), s0(Vector(665.0, 666.0), Vector(667.0, 668.0, 669.0)), s0(Vector(670.0, 671.0), Vector(672.0, 673.0, 674.0))), s0(Vector(675.0, 676.0), Vector(677.0, 678.0, 679.0))))))))
    val v1: s13 = s13(s11(s5(Vector(s4(Vector(Vector(s1(Vector(s0(Vector(680.0, 681.0), Vector(682.0, 683.0, 684.0)), s0(Vector(685.0, 686.0), Vector(687.0, 688.0, 689.0)), s0(Vector(690.0, 691.0), Vector(692.0, 693.0, 694.0))), s0(Vector(695.0, 696.0), Vector(697.0, 698.0, 699.0)))), Vector(s1(Vector(s0(Vector(700.0, 701.0), Vector(702.0, 703.0, 704.0)), s0(Vector(705.0, 706.0), Vector(707.0, 708.0, 709.0)), s0(Vector(710.0, 711.0), Vector(712.0, 713.0, 714.0))), s0(Vector(715.0, 716.0), Vector(717.0, 718.0, 719.0)))), Vector(s1(Vector(s0(Vector(720.0, 721.0), Vector(722.0, 723.0, 724.0)), s0(Vector(725.0, 726.0), Vector(727.0, 728.0, 729.0)), s0(Vector(730.0, 731.0), Vector(732.0, 733.0, 734.0))), s0(Vector(735.0, 736.0), Vector(737.0, 738.0, 739.0))))), s1(Vector(s0(Vector(740.0, 741.0), Vector(742.0, 743.0, 744.0)), s0(Vector(745.0, 746.0), Vector(747.0, 748.0, 749.0)), s0(Vector(750.0, 751.0), Vector(752.0, 753.0, 754.0))), s0(Vector(755.0, 756.0), Vector(757.0, 758.0, 759.0)))), s4(Vector(Vector(s1(Vector(s0(Vector(760.0, 761.0), Vector(762.0, 763.0, 764.0)), s0(Vector(765.0, 766.0), Vector(767.0, 768.0, 769.0)), s0(Vector(770.0, 771.0), Vector(772.0, 773.0, 774.0))), s0(Vector(775.0, 776.0), Vector(777.0, 778.0, 779.0)))), Vector(s1(Vector(s0(Vector(780.0, 781.0), Vector(782.0, 783.0, 784.0)), s0(Vector(785.0, 786.0), Vector(787.0, 788.0, 789.0)), s0(Vector(790.0, 791.0), Vector(792.0, 793.0, 794.0))), s0(Vector(795.0, 796.0), Vector(797.0, 798.0, 799.0)))), Vector(s1(Vector(s0(Vector(800.0, 801.0), Vector(802.0, 803.0, 804.0)), s0(Vector(805.0, 806.0), Vector(807.0, 808.0, 809.0)), s0(Vector(810.0, 811.0), Vector(812.0, 813.0, 814.0))), s0(Vector(815.0, 816.0), Vector(817.0, 818.0, 819.0))))), s1(Vector(s0(Vector(820.0, 821.0), Vector(822.0, 823.0, 824.0)), s0(Vector(825.0, 826.0), Vector(827.0, 828.0, 829.0)), s0(Vector(830.0, 831.0), Vector(832.0, 833.0, 834.0))), s0(Vector(835.0, 836.0), Vector(837.0, 838.0, 839.0))))), s3(s2(Vector(Vector(s1(Vector(s0(Vector(840.0, 841.0), Vector(842.0, 843.0, 844.0)), s0(Vector(845.0, 846.0), Vector(847.0, 848.0, 849.0)), s0(Vector(850.0, 851.0), Vector(852.0, 853.0, 854.0))), s0(Vector(855.0, 856.0), Vector(857.0, 858.0, 859.0)))), Vector(s1(Vector(s0(Vector(860.0, 861.0), Vector(862.0, 863.0, 864.0)), s0(Vector(865.0, 866.0), Vector(867.0, 868.0, 869.0)), s0(Vector(870.0, 871.0), Vector(872.0, 873.0, 874.0))), s0(Vector(875.0, 876.0), Vector(877.0, 878.0, 879.0)))), Vector(s1(Vector(s0(Vector(880.0, 881.0), Vector(882.0, 883.0, 884.0)), s0(Vector(885.0, 886.0), Vector(887.0, 888.0, 889.0)), s0(Vector(890.0, 891.0), Vector(892.0, 893.0, 894.0))), s0(Vector(895.0, 896.0), Vector(897.0, 898.0, 899.0))))), s0(Vector(900.0, 901.0), Vector(902.0, 903.0, 904.0))), s1(Vector(s0(Vector(905.0, 906.0), Vector(907.0, 908.0, 909.0)), s0(Vector(910.0, 911.0), Vector(912.0, 913.0, 914.0)), s0(Vector(915.0, 916.0), Vector(917.0, 918.0, 919.0))), s0(Vector(920.0, 921.0), Vector(922.0, 923.0, 924.0))))), s9(Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(925.0, 926.0), Vector(927.0, 928.0, 929.0)), s0(Vector(930.0, 931.0), Vector(932.0, 933.0, 934.0)), s0(Vector(935.0, 936.0), Vector(937.0, 938.0, 939.0))), s0(Vector(940.0, 941.0), Vector(942.0, 943.0, 944.0)))), Vector(s1(Vector(s0(Vector(945.0, 946.0), Vector(947.0, 948.0, 949.0)), s0(Vector(950.0, 951.0), Vector(952.0, 953.0, 954.0)), s0(Vector(955.0, 956.0), Vector(957.0, 958.0, 959.0))), s0(Vector(960.0, 961.0), Vector(962.0, 963.0, 964.0)))), Vector(s1(Vector(s0(Vector(965.0, 966.0), Vector(967.0, 968.0, 969.0)), s0(Vector(970.0, 971.0), Vector(972.0, 973.0, 974.0)), s0(Vector(975.0, 976.0), Vector(977.0, 978.0, 979.0))), s0(Vector(980.0, 981.0), Vector(982.0, 983.0, 984.0))))), s0(Vector(985.0, 986.0), Vector(987.0, 988.0, 989.0))), s1(Vector(s0(Vector(990.0, 991.0), Vector(992.0, 993.0, 994.0)), s0(Vector(995.0, 996.0), Vector(997.0, 998.0, 999.0)), s0(Vector(1000.0, 1001.0), Vector(1002.0, 1003.0, 1004.0))), s0(Vector(1005.0, 1006.0), Vector(1007.0, 1008.0, 1009.0))))), Vector(s6(Vector(s0(Vector(1010.0, 1011.0), Vector(1012.0, 1013.0, 1014.0)), s0(Vector(1015.0, 1016.0), Vector(1017.0, 1018.0, 1019.0))), Vector(Vector(s5(Vector(s4(Vector(Vector(s1(Vector(s0(Vector(1020.0, 1021.0), Vector(1022.0, 1023.0, 1024.0)), s0(Vector(1025.0, 1026.0), Vector(1027.0, 1028.0, 1029.0)), s0(Vector(1030.0, 1031.0), Vector(1032.0, 1033.0, 1034.0))), s0(Vector(1035.0, 1036.0), Vector(1037.0, 1038.0, 1039.0)))), Vector(s1(Vector(s0(Vector(1040.0, 1041.0), Vector(1042.0, 1043.0, 1044.0)), s0(Vector(1045.0, 1046.0), Vector(1047.0, 1048.0, 1049.0)), s0(Vector(1050.0, 1051.0), Vector(1052.0, 1053.0, 1054.0))), s0(Vector(1055.0, 1056.0), Vector(1057.0, 1058.0, 1059.0)))), Vector(s1(Vector(s0(Vector(1060.0, 1061.0), Vector(1062.0, 1063.0, 1064.0)), s0(Vector(1065.0, 1066.0), Vector(1067.0, 1068.0, 1069.0)), s0(Vector(1070.0, 1071.0), Vector(1072.0, 1073.0, 1074.0))), s0(Vector(1075.0, 1076.0), Vector(1077.0, 1078.0, 1079.0))))), s1(Vector(s0(Vector(1080.0, 1081.0), Vector(1082.0, 1083.0, 1084.0)), s0(Vector(1085.0, 1086.0), Vector(1087.0, 1088.0, 1089.0)), s0(Vector(1090.0, 1091.0), Vector(1092.0, 1093.0, 1094.0))), s0(Vector(1095.0, 1096.0), Vector(1097.0, 1098.0, 1099.0)))), s4(Vector(Vector(s1(Vector(s0(Vector(1100.0, 1101.0), Vector(1102.0, 1103.0, 1104.0)), s0(Vector(1105.0, 1106.0), Vector(1107.0, 1108.0, 1109.0)), s0(Vector(1110.0, 1111.0), Vector(1112.0, 1113.0, 1114.0))), s0(Vector(1115.0, 1116.0), Vector(1117.0, 1118.0, 1119.0)))), Vector(s1(Vector(s0(Vector(1120.0, 1121.0), Vector(1122.0, 1123.0, 1124.0)), s0(Vector(1125.0, 1126.0), Vector(1127.0, 1128.0, 1129.0)), s0(Vector(1130.0, 1131.0), Vector(1132.0, 1133.0, 1134.0))), s0(Vector(1135.0, 1136.0), Vector(1137.0, 1138.0, 1139.0)))), Vector(s1(Vector(s0(Vector(1140.0, 1141.0), Vector(1142.0, 1143.0, 1144.0)), s0(Vector(1145.0, 1146.0), Vector(1147.0, 1148.0, 1149.0)), s0(Vector(1150.0, 1151.0), Vector(1152.0, 1153.0, 1154.0))), s0(Vector(1155.0, 1156.0), Vector(1157.0, 1158.0, 1159.0))))), s1(Vector(s0(Vector(1160.0, 1161.0), Vector(1162.0, 1163.0, 1164.0)), s0(Vector(1165.0, 1166.0), Vector(1167.0, 1168.0, 1169.0)), s0(Vector(1170.0, 1171.0), Vector(1172.0, 1173.0, 1174.0))), s0(Vector(1175.0, 1176.0), Vector(1177.0, 1178.0, 1179.0))))), s3(s2(Vector(Vector(s1(Vector(s0(Vector(1180.0, 1181.0), Vector(1182.0, 1183.0, 1184.0)), s0(Vector(1185.0, 1186.0), Vector(1187.0, 1188.0, 1189.0)), s0(Vector(1190.0, 1191.0), Vector(1192.0, 1193.0, 1194.0))), s0(Vector(1195.0, 1196.0), Vector(1197.0, 1198.0, 1199.0)))), Vector(s1(Vector(s0(Vector(1200.0, 1201.0), Vector(1202.0, 1203.0, 1204.0)), s0(Vector(1205.0, 1206.0), Vector(1207.0, 1208.0, 1209.0)), s0(Vector(1210.0, 1211.0), Vector(1212.0, 1213.0, 1214.0))), s0(Vector(1215.0, 1216.0), Vector(1217.0, 1218.0, 1219.0)))), Vector(s1(Vector(s0(Vector(1220.0, 1221.0), Vector(1222.0, 1223.0, 1224.0)), s0(Vector(1225.0, 1226.0), Vector(1227.0, 1228.0, 1229.0)), s0(Vector(1230.0, 1231.0), Vector(1232.0, 1233.0, 1234.0))), s0(Vector(1235.0, 1236.0), Vector(1237.0, 1238.0, 1239.0))))), s0(Vector(1240.0, 1241.0), Vector(1242.0, 1243.0, 1244.0))), s1(Vector(s0(Vector(1245.0, 1246.0), Vector(1247.0, 1248.0, 1249.0)), s0(Vector(1250.0, 1251.0), Vector(1252.0, 1253.0, 1254.0)), s0(Vector(1255.0, 1256.0), Vector(1257.0, 1258.0, 1259.0))), s0(Vector(1260.0, 1261.0), Vector(1262.0, 1263.0, 1264.0)))))), Vector(s5(Vector(s4(Vector(Vector(s1(Vector(s0(Vector(1265.0, 1266.0), Vector(1267.0, 1268.0, 1269.0)), s0(Vector(1270.0, 1271.0), Vector(1272.0, 1273.0, 1274.0)), s0(Vector(1275.0, 1276.0), Vector(1277.0, 1278.0, 1279.0))), s0(Vector(1280.0, 1281.0), Vector(1282.0, 1283.0, 1284.0)))), Vector(s1(Vector(s0(Vector(1285.0, 1286.0), Vector(1287.0, 1288.0, 1289.0)), s0(Vector(1290.0, 1291.0), Vector(1292.0, 1293.0, 1294.0)), s0(Vector(1295.0, 1296.0), Vector(1297.0, 1298.0, 1299.0))), s0(Vector(1300.0, 1301.0), Vector(1302.0, 1303.0, 1304.0)))), Vector(s1(Vector(s0(Vector(1305.0, 1306.0), Vector(1307.0, 1308.0, 1309.0)), s0(Vector(1310.0, 1311.0), Vector(1312.0, 1313.0, 1314.0)), s0(Vector(1315.0, 1316.0), Vector(1317.0, 1318.0, 1319.0))), s0(Vector(1320.0, 1321.0), Vector(1322.0, 1323.0, 1324.0))))), s1(Vector(s0(Vector(1325.0, 1326.0), Vector(1327.0, 1328.0, 1329.0)), s0(Vector(1330.0, 1331.0), Vector(1332.0, 1333.0, 1334.0)), s0(Vector(1335.0, 1336.0), Vector(1337.0, 1338.0, 1339.0))), s0(Vector(1340.0, 1341.0), Vector(1342.0, 1343.0, 1344.0)))), s4(Vector(Vector(s1(Vector(s0(Vector(1345.0, 1346.0), Vector(1347.0, 1348.0, 1349.0)), s0(Vector(1350.0, 1351.0), Vector(1352.0, 1353.0, 1354.0)), s0(Vector(1355.0, 1356.0), Vector(1357.0, 1358.0, 1359.0))), s0(Vector(1360.0, 1361.0), Vector(1362.0, 1363.0, 1364.0)))), Vector(s1(Vector(s0(Vector(1365.0, 1366.0), Vector(1367.0, 1368.0, 1369.0)), s0(Vector(1370.0, 1371.0), Vector(1372.0, 1373.0, 1374.0)), s0(Vector(1375.0, 1376.0), Vector(1377.0, 1378.0, 1379.0))), s0(Vector(1380.0, 1381.0), Vector(1382.0, 1383.0, 1384.0)))), Vector(s1(Vector(s0(Vector(1385.0, 1386.0), Vector(1387.0, 1388.0, 1389.0)), s0(Vector(1390.0, 1391.0), Vector(1392.0, 1393.0, 1394.0)), s0(Vector(1395.0, 1396.0), Vector(1397.0, 1398.0, 1399.0))), s0(Vector(1400.0, 1401.0), Vector(1402.0, 1403.0, 1404.0))))), s1(Vector(s0(Vector(1405.0, 1406.0), Vector(1407.0, 1408.0, 1409.0)), s0(Vector(1410.0, 1411.0), Vector(1412.0, 1413.0, 1414.0)), s0(Vector(1415.0, 1416.0), Vector(1417.0, 1418.0, 1419.0))), s0(Vector(1420.0, 1421.0), Vector(1422.0, 1423.0, 1424.0))))), s3(s2(Vector(Vector(s1(Vector(s0(Vector(1425.0, 1426.0), Vector(1427.0, 1428.0, 1429.0)), s0(Vector(1430.0, 1431.0), Vector(1432.0, 1433.0, 1434.0)), s0(Vector(1435.0, 1436.0), Vector(1437.0, 1438.0, 1439.0))), s0(Vector(1440.0, 1441.0), Vector(1442.0, 1443.0, 1444.0)))), Vector(s1(Vector(s0(Vector(1445.0, 1446.0), Vector(1447.0, 1448.0, 1449.0)), s0(Vector(1450.0, 1451.0), Vector(1452.0, 1453.0, 1454.0)), s0(Vector(1455.0, 1456.0), Vector(1457.0, 1458.0, 1459.0))), s0(Vector(1460.0, 1461.0), Vector(1462.0, 1463.0, 1464.0)))), Vector(s1(Vector(s0(Vector(1465.0, 1466.0), Vector(1467.0, 1468.0, 1469.0)), s0(Vector(1470.0, 1471.0), Vector(1472.0, 1473.0, 1474.0)), s0(Vector(1475.0, 1476.0), Vector(1477.0, 1478.0, 1479.0))), s0(Vector(1480.0, 1481.0), Vector(1482.0, 1483.0, 1484.0))))), s0(Vector(1485.0, 1486.0), Vector(1487.0, 1488.0, 1489.0))), s1(Vector(s0(Vector(1490.0, 1491.0), Vector(1492.0, 1493.0, 1494.0)), s0(Vector(1495.0, 1496.0), Vector(1497.0, 1498.0, 1499.0)), s0(Vector(1500.0, 1501.0), Vector(1502.0, 1503.0, 1504.0))), s0(Vector(1505.0, 1506.0), Vector(1507.0, 1508.0, 1509.0)))))), Vector(s5(Vector(s4(Vector(Vector(s1(Vector(s0(Vector(1510.0, 1511.0), Vector(1512.0, 1513.0, 1514.0)), s0(Vector(1515.0, 1516.0), Vector(1517.0, 1518.0, 1519.0)), s0(Vector(1520.0, 1521.0), Vector(1522.0, 1523.0, 1524.0))), s0(Vector(1525.0, 1526.0), Vector(1527.0, 1528.0, 1529.0)))), Vector(s1(Vector(s0(Vector(1530.0, 1531.0), Vector(1532.0, 1533.0, 1534.0)), s0(Vector(1535.0, 1536.0), Vector(1537.0, 1538.0, 1539.0)), s0(Vector(1540.0, 1541.0), Vector(1542.0, 1543.0, 1544.0))), s0(Vector(1545.0, 1546.0), Vector(1547.0, 1548.0, 1549.0)))), Vector(s1(Vector(s0(Vector(1550.0, 1551.0), Vector(1552.0, 1553.0, 1554.0)), s0(Vector(1555.0, 1556.0), Vector(1557.0, 1558.0, 1559.0)), s0(Vector(1560.0, 1561.0), Vector(1562.0, 1563.0, 1564.0))), s0(Vector(1565.0, 1566.0), Vector(1567.0, 1568.0, 1569.0))))), s1(Vector(s0(Vector(1570.0, 1571.0), Vector(1572.0, 1573.0, 1574.0)), s0(Vector(1575.0, 1576.0), Vector(1577.0, 1578.0, 1579.0)), s0(Vector(1580.0, 1581.0), Vector(1582.0, 1583.0, 1584.0))), s0(Vector(1585.0, 1586.0), Vector(1587.0, 1588.0, 1589.0)))), s4(Vector(Vector(s1(Vector(s0(Vector(1590.0, 1591.0), Vector(1592.0, 1593.0, 1594.0)), s0(Vector(1595.0, 1596.0), Vector(1597.0, 1598.0, 1599.0)), s0(Vector(1600.0, 1601.0), Vector(1602.0, 1603.0, 1604.0))), s0(Vector(1605.0, 1606.0), Vector(1607.0, 1608.0, 1609.0)))), Vector(s1(Vector(s0(Vector(1610.0, 1611.0), Vector(1612.0, 1613.0, 1614.0)), s0(Vector(1615.0, 1616.0), Vector(1617.0, 1618.0, 1619.0)), s0(Vector(1620.0, 1621.0), Vector(1622.0, 1623.0, 1624.0))), s0(Vector(1625.0, 1626.0), Vector(1627.0, 1628.0, 1629.0)))), Vector(s1(Vector(s0(Vector(1630.0, 1631.0), Vector(1632.0, 1633.0, 1634.0)), s0(Vector(1635.0, 1636.0), Vector(1637.0, 1638.0, 1639.0)), s0(Vector(1640.0, 1641.0), Vector(1642.0, 1643.0, 1644.0))), s0(Vector(1645.0, 1646.0), Vector(1647.0, 1648.0, 1649.0))))), s1(Vector(s0(Vector(1650.0, 1651.0), Vector(1652.0, 1653.0, 1654.0)), s0(Vector(1655.0, 1656.0), Vector(1657.0, 1658.0, 1659.0)), s0(Vector(1660.0, 1661.0), Vector(1662.0, 1663.0, 1664.0))), s0(Vector(1665.0, 1666.0), Vector(1667.0, 1668.0, 1669.0))))), s3(s2(Vector(Vector(s1(Vector(s0(Vector(1670.0, 1671.0), Vector(1672.0, 1673.0, 1674.0)), s0(Vector(1675.0, 1676.0), Vector(1677.0, 1678.0, 1679.0)), s0(Vector(1680.0, 1681.0), Vector(1682.0, 1683.0, 1684.0))), s0(Vector(1685.0, 1686.0), Vector(1687.0, 1688.0, 1689.0)))), Vector(s1(Vector(s0(Vector(1690.0, 1691.0), Vector(1692.0, 1693.0, 1694.0)), s0(Vector(1695.0, 1696.0), Vector(1697.0, 1698.0, 1699.0)), s0(Vector(1700.0, 1701.0), Vector(1702.0, 1703.0, 1704.0))), s0(Vector(1705.0, 1706.0), Vector(1707.0, 1708.0, 1709.0)))), Vector(s1(Vector(s0(Vector(1710.0, 1711.0), Vector(1712.0, 1713.0, 1714.0)), s0(Vector(1715.0, 1716.0), Vector(1717.0, 1718.0, 1719.0)), s0(Vector(1720.0, 1721.0), Vector(1722.0, 1723.0, 1724.0))), s0(Vector(1725.0, 1726.0), Vector(1727.0, 1728.0, 1729.0))))), s0(Vector(1730.0, 1731.0), Vector(1732.0, 1733.0, 1734.0))), s1(Vector(s0(Vector(1735.0, 1736.0), Vector(1737.0, 1738.0, 1739.0)), s0(Vector(1740.0, 1741.0), Vector(1742.0, 1743.0, 1744.0)), s0(Vector(1745.0, 1746.0), Vector(1747.0, 1748.0, 1749.0))), s0(Vector(1750.0, 1751.0), Vector(1752.0, 1753.0, 1754.0))))))))))), Vector(s7(Vector(Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(1755.0, 1756.0), Vector(1757.0, 1758.0, 1759.0)), s0(Vector(1760.0, 1761.0), Vector(1762.0, 1763.0, 1764.0)), s0(Vector(1765.0, 1766.0), Vector(1767.0, 1768.0, 1769.0))), s0(Vector(1770.0, 1771.0), Vector(1772.0, 1773.0, 1774.0)))), Vector(s1(Vector(s0(Vector(1775.0, 1776.0), Vector(1777.0, 1778.0, 1779.0)), s0(Vector(1780.0, 1781.0), Vector(1782.0, 1783.0, 1784.0)), s0(Vector(1785.0, 1786.0), Vector(1787.0, 1788.0, 1789.0))), s0(Vector(1790.0, 1791.0), Vector(1792.0, 1793.0, 1794.0)))), Vector(s1(Vector(s0(Vector(1795.0, 1796.0), Vector(1797.0, 1798.0, 1799.0)), s0(Vector(1800.0, 1801.0), Vector(1802.0, 1803.0, 1804.0)), s0(Vector(1805.0, 1806.0), Vector(1807.0, 1808.0, 1809.0))), s0(Vector(1810.0, 1811.0), Vector(1812.0, 1813.0, 1814.0))))), s0(Vector(1815.0, 1816.0), Vector(1817.0, 1818.0, 1819.0))), s1(Vector(s0(Vector(1820.0, 1821.0), Vector(1822.0, 1823.0, 1824.0)), s0(Vector(1825.0, 1826.0), Vector(1827.0, 1828.0, 1829.0)), s0(Vector(1830.0, 1831.0), Vector(1832.0, 1833.0, 1834.0))), s0(Vector(1835.0, 1836.0), Vector(1837.0, 1838.0, 1839.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(1840.0, 1841.0), Vector(1842.0, 1843.0, 1844.0)), s0(Vector(1845.0, 1846.0), Vector(1847.0, 1848.0, 1849.0)), s0(Vector(1850.0, 1851.0), Vector(1852.0, 1853.0, 1854.0))), s0(Vector(1855.0, 1856.0), Vector(1857.0, 1858.0, 1859.0)))), Vector(s1(Vector(s0(Vector(1860.0, 1861.0), Vector(1862.0, 1863.0, 1864.0)), s0(Vector(1865.0, 1866.0), Vector(1867.0, 1868.0, 1869.0)), s0(Vector(1870.0, 1871.0), Vector(1872.0, 1873.0, 1874.0))), s0(Vector(1875.0, 1876.0), Vector(1877.0, 1878.0, 1879.0)))), Vector(s1(Vector(s0(Vector(1880.0, 1881.0), Vector(1882.0, 1883.0, 1884.0)), s0(Vector(1885.0, 1886.0), Vector(1887.0, 1888.0, 1889.0)), s0(Vector(1890.0, 1891.0), Vector(1892.0, 1893.0, 1894.0))), s0(Vector(1895.0, 1896.0), Vector(1897.0, 1898.0, 1899.0))))), s0(Vector(1900.0, 1901.0), Vector(1902.0, 1903.0, 1904.0))), s1(Vector(s0(Vector(1905.0, 1906.0), Vector(1907.0, 1908.0, 1909.0)), s0(Vector(1910.0, 1911.0), Vector(1912.0, 1913.0, 1914.0)), s0(Vector(1915.0, 1916.0), Vector(1917.0, 1918.0, 1919.0))), s0(Vector(1920.0, 1921.0), Vector(1922.0, 1923.0, 1924.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(1925.0, 1926.0), Vector(1927.0, 1928.0, 1929.0)), s0(Vector(1930.0, 1931.0), Vector(1932.0, 1933.0, 1934.0)), s0(Vector(1935.0, 1936.0), Vector(1937.0, 1938.0, 1939.0))), s0(Vector(1940.0, 1941.0), Vector(1942.0, 1943.0, 1944.0)))), Vector(s1(Vector(s0(Vector(1945.0, 1946.0), Vector(1947.0, 1948.0, 1949.0)), s0(Vector(1950.0, 1951.0), Vector(1952.0, 1953.0, 1954.0)), s0(Vector(1955.0, 1956.0), Vector(1957.0, 1958.0, 1959.0))), s0(Vector(1960.0, 1961.0), Vector(1962.0, 1963.0, 1964.0)))), Vector(s1(Vector(s0(Vector(1965.0, 1966.0), Vector(1967.0, 1968.0, 1969.0)), s0(Vector(1970.0, 1971.0), Vector(1972.0, 1973.0, 1974.0)), s0(Vector(1975.0, 1976.0), Vector(1977.0, 1978.0, 1979.0))), s0(Vector(1980.0, 1981.0), Vector(1982.0, 1983.0, 1984.0))))), s0(Vector(1985.0, 1986.0), Vector(1987.0, 1988.0, 1989.0))), s1(Vector(s0(Vector(1990.0, 1991.0), Vector(1992.0, 1993.0, 1994.0)), s0(Vector(1995.0, 1996.0), Vector(1997.0, 1998.0, 1999.0)), s0(Vector(2000.0, 2001.0), Vector(2002.0, 2003.0, 2004.0))), s0(Vector(2005.0, 2006.0), Vector(2007.0, 2008.0, 2009.0)))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(2010.0, 2011.0), Vector(2012.0, 2013.0, 2014.0)), s0(Vector(2015.0, 2016.0), Vector(2017.0, 2018.0, 2019.0)), s0(Vector(2020.0, 2021.0), Vector(2022.0, 2023.0, 2024.0))), s0(Vector(2025.0, 2026.0), Vector(2027.0, 2028.0, 2029.0)))), Vector(s1(Vector(s0(Vector(2030.0, 2031.0), Vector(2032.0, 2033.0, 2034.0)), s0(Vector(2035.0, 2036.0), Vector(2037.0, 2038.0, 2039.0)), s0(Vector(2040.0, 2041.0), Vector(2042.0, 2043.0, 2044.0))), s0(Vector(2045.0, 2046.0), Vector(2047.0, 2048.0, 2049.0)))), Vector(s1(Vector(s0(Vector(2050.0, 2051.0), Vector(2052.0, 2053.0, 2054.0)), s0(Vector(2055.0, 2056.0), Vector(2057.0, 2058.0, 2059.0)), s0(Vector(2060.0, 2061.0), Vector(2062.0, 2063.0, 2064.0))), s0(Vector(2065.0, 2066.0), Vector(2067.0, 2068.0, 2069.0))))), s0(Vector(2070.0, 2071.0), Vector(2072.0, 2073.0, 2074.0))), s1(Vector(s0(Vector(2075.0, 2076.0), Vector(2077.0, 2078.0, 2079.0)), s0(Vector(2080.0, 2081.0), Vector(2082.0, 2083.0, 2084.0)), s0(Vector(2085.0, 2086.0), Vector(2087.0, 2088.0, 2089.0))), s0(Vector(2090.0, 2091.0), Vector(2092.0, 2093.0, 2094.0)))))), s7(Vector(Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(2095.0, 2096.0), Vector(2097.0, 2098.0, 2099.0)), s0(Vector(2100.0, 2101.0), Vector(2102.0, 2103.0, 2104.0)), s0(Vector(2105.0, 2106.0), Vector(2107.0, 2108.0, 2109.0))), s0(Vector(2110.0, 2111.0), Vector(2112.0, 2113.0, 2114.0)))), Vector(s1(Vector(s0(Vector(2115.0, 2116.0), Vector(2117.0, 2118.0, 2119.0)), s0(Vector(2120.0, 2121.0), Vector(2122.0, 2123.0, 2124.0)), s0(Vector(2125.0, 2126.0), Vector(2127.0, 2128.0, 2129.0))), s0(Vector(2130.0, 2131.0), Vector(2132.0, 2133.0, 2134.0)))), Vector(s1(Vector(s0(Vector(2135.0, 2136.0), Vector(2137.0, 2138.0, 2139.0)), s0(Vector(2140.0, 2141.0), Vector(2142.0, 2143.0, 2144.0)), s0(Vector(2145.0, 2146.0), Vector(2147.0, 2148.0, 2149.0))), s0(Vector(2150.0, 2151.0), Vector(2152.0, 2153.0, 2154.0))))), s0(Vector(2155.0, 2156.0), Vector(2157.0, 2158.0, 2159.0))), s1(Vector(s0(Vector(2160.0, 2161.0), Vector(2162.0, 2163.0, 2164.0)), s0(Vector(2165.0, 2166.0), Vector(2167.0, 2168.0, 2169.0)), s0(Vector(2170.0, 2171.0), Vector(2172.0, 2173.0, 2174.0))), s0(Vector(2175.0, 2176.0), Vector(2177.0, 2178.0, 2179.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(2180.0, 2181.0), Vector(2182.0, 2183.0, 2184.0)), s0(Vector(2185.0, 2186.0), Vector(2187.0, 2188.0, 2189.0)), s0(Vector(2190.0, 2191.0), Vector(2192.0, 2193.0, 2194.0))), s0(Vector(2195.0, 2196.0), Vector(2197.0, 2198.0, 2199.0)))), Vector(s1(Vector(s0(Vector(2200.0, 2201.0), Vector(2202.0, 2203.0, 2204.0)), s0(Vector(2205.0, 2206.0), Vector(2207.0, 2208.0, 2209.0)), s0(Vector(2210.0, 2211.0), Vector(2212.0, 2213.0, 2214.0))), s0(Vector(2215.0, 2216.0), Vector(2217.0, 2218.0, 2219.0)))), Vector(s1(Vector(s0(Vector(2220.0, 2221.0), Vector(2222.0, 2223.0, 2224.0)), s0(Vector(2225.0, 2226.0), Vector(2227.0, 2228.0, 2229.0)), s0(Vector(2230.0, 2231.0), Vector(2232.0, 2233.0, 2234.0))), s0(Vector(2235.0, 2236.0), Vector(2237.0, 2238.0, 2239.0))))), s0(Vector(2240.0, 2241.0), Vector(2242.0, 2243.0, 2244.0))), s1(Vector(s0(Vector(2245.0, 2246.0), Vector(2247.0, 2248.0, 2249.0)), s0(Vector(2250.0, 2251.0), Vector(2252.0, 2253.0, 2254.0)), s0(Vector(2255.0, 2256.0), Vector(2257.0, 2258.0, 2259.0))), s0(Vector(2260.0, 2261.0), Vector(2262.0, 2263.0, 2264.0))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(2265.0, 2266.0), Vector(2267.0, 2268.0, 2269.0)), s0(Vector(2270.0, 2271.0), Vector(2272.0, 2273.0, 2274.0)), s0(Vector(2275.0, 2276.0), Vector(2277.0, 2278.0, 2279.0))), s0(Vector(2280.0, 2281.0), Vector(2282.0, 2283.0, 2284.0)))), Vector(s1(Vector(s0(Vector(2285.0, 2286.0), Vector(2287.0, 2288.0, 2289.0)), s0(Vector(2290.0, 2291.0), Vector(2292.0, 2293.0, 2294.0)), s0(Vector(2295.0, 2296.0), Vector(2297.0, 2298.0, 2299.0))), s0(Vector(2300.0, 2301.0), Vector(2302.0, 2303.0, 2304.0)))), Vector(s1(Vector(s0(Vector(2305.0, 2306.0), Vector(2307.0, 2308.0, 2309.0)), s0(Vector(2310.0, 2311.0), Vector(2312.0, 2313.0, 2314.0)), s0(Vector(2315.0, 2316.0), Vector(2317.0, 2318.0, 2319.0))), s0(Vector(2320.0, 2321.0), Vector(2322.0, 2323.0, 2324.0))))), s0(Vector(2325.0, 2326.0), Vector(2327.0, 2328.0, 2329.0))), s1(Vector(s0(Vector(2330.0, 2331.0), Vector(2332.0, 2333.0, 2334.0)), s0(Vector(2335.0, 2336.0), Vector(2337.0, 2338.0, 2339.0)), s0(Vector(2340.0, 2341.0), Vector(2342.0, 2343.0, 2344.0))), s0(Vector(2345.0, 2346.0), Vector(2347.0, 2348.0, 2349.0)))))), Vector(s3(s2(Vector(Vector(s1(Vector(s0(Vector(2350.0, 2351.0), Vector(2352.0, 2353.0, 2354.0)), s0(Vector(2355.0, 2356.0), Vector(2357.0, 2358.0, 2359.0)), s0(Vector(2360.0, 2361.0), Vector(2362.0, 2363.0, 2364.0))), s0(Vector(2365.0, 2366.0), Vector(2367.0, 2368.0, 2369.0)))), Vector(s1(Vector(s0(Vector(2370.0, 2371.0), Vector(2372.0, 2373.0, 2374.0)), s0(Vector(2375.0, 2376.0), Vector(2377.0, 2378.0, 2379.0)), s0(Vector(2380.0, 2381.0), Vector(2382.0, 2383.0, 2384.0))), s0(Vector(2385.0, 2386.0), Vector(2387.0, 2388.0, 2389.0)))), Vector(s1(Vector(s0(Vector(2390.0, 2391.0), Vector(2392.0, 2393.0, 2394.0)), s0(Vector(2395.0, 2396.0), Vector(2397.0, 2398.0, 2399.0)), s0(Vector(2400.0, 2401.0), Vector(2402.0, 2403.0, 2404.0))), s0(Vector(2405.0, 2406.0), Vector(2407.0, 2408.0, 2409.0))))), s0(Vector(2410.0, 2411.0), Vector(2412.0, 2413.0, 2414.0))), s1(Vector(s0(Vector(2415.0, 2416.0), Vector(2417.0, 2418.0, 2419.0)), s0(Vector(2420.0, 2421.0), Vector(2422.0, 2423.0, 2424.0)), s0(Vector(2425.0, 2426.0), Vector(2427.0, 2428.0, 2429.0))), s0(Vector(2430.0, 2431.0), Vector(2432.0, 2433.0, 2434.0))))))))
    val v2: Double = 2435.0
    val start = nanoTime()
    var result: Double = 2435.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}