import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s3 (
    p0: s1,
    p1: s0,
    p2: Vector[s2],
    p3: s2
  )
  case class s6 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s7 (
    p0: s3,
    p1: Vector[s0]
  )
  case class s8 (
    p0: s7,
    p1: s6,
    p2: Vector[s6],
    p3: s3
  )
  case class s9 (
    p0: s1,
    p1: Vector[Vector[s8]]
  )
  case class s10 (
    p0: Vector[s9],
    p1: Vector[s3]
  )
  case class s13 (
    p0: Vector[s0],
    p1: s2
  )
  def f111(v0: s0): s0 = {
    v0
  }
  def f90(v0: s1, v1: s1): s1 = {
    v0
  }
  def f82(v0: s1): s1 = {
    var v5: s1 = v0
    val v1: Vector[s1] = Vector(v5, v0, v5, v0, v5)
    val v9: s1 = f90(v0, v0)
    val v2: s1 = f90(v5, v0)
    val v3: s1 = f90(v5, v9)
    val v8: s0 = v9.p0
    v5 = v5.copy(p0 = v8)
    v5 = v5.copy(p0 = v8)
    var v29: Vector[s1] = v1
    val v109: s1 = f90(v9, v3)
    val v32: s0 = v2.p0
    v5 = v2
    val v30: s0 = v109.p0
    v5 = v5.copy(p0 = v32)
    v5 = v5.copy(p1 = v30)
    var v96: s1 = v5
    val v59: s0 = v96.p0
    v5 = v5.copy(p1 = v59)
    val v60: s1 = v29(2)
    v60
  }
  def f78(v0: s1): s1 = {
    var v6: s1 = v0
    val v8: s0 = v0.p1
    val v5: s1 = f90(v0, v0)
    var v7: s0 = v8
    val v1: s0 = f111(v8)
    val v4: s1 = f82(v5)
    val v3: Double = v1.p1
    val v15: s0 = v6.p0
    v7 = v7.copy(p1 = v3)
    val v9: s1 = f90(v6, v0)
    v7 = v7.copy(p1 = v3)
    val v13: Vector[s1] = Vector(v4, v9, v6)
    var v19: Vector[s1] = v13
    v19 = v19.updated(0, v5)
    v19 = v19.updated(1, v9)
    v7 = v7.copy(p1 = v3)
    val v11: s1 = v13(0)
    val v25: Vector[Vector[Double]] = v15.p0
    v19 = v19.updated(0, v11)
    var v34: s1 = v4
    val v54: s0 = f111(v7)
    val v70: Vector[s1] = Vector(v34, v0, v9)
    v19 = v70
    val v27: s1 = v19(2)
    v7 = v7.copy(p0 = v25)
    v34 = v34.copy(p0 = v54)
    val v49: s1 = f90(v27, v34)
    v34 = v34.copy(p0 = v54)
    v19 = v19.updated(2, v11)
    v49
  }
  def f54(v0: Double): Double = {
    var v1: Double = v0
    val v7: Double = v1 + v1
    var v2: Double = v1
    var v8: Double = v2
    var v6: Double = v1
    var v5: Double = v2
    var v4: Double = v1
    var v14: Double = v4
    var v10: Double = v8
    var v9: Double = v6
    var v18: Double = v10
    v4 = v5
    var v40: Double = v14
    val v16: Vector[Double] = Vector(v7, v9, v14, v5, v40)
    val v27: Double = v16(3)
    var v45: Vector[Double] = v16
    var v166: Double = v5
    val v80: Double = v45(0)
    v45 = v45.updated(4, v166)
    v45 = v45.updated(2, v18)
    v45 = v45.updated(3, v27)
    v80
  }
  def f50(v0: s1, v1: s1): s1 = {
    var v4: s1 = v0
    val v2: s1 = f78(v4)
    var v5: s1 = v4
    val v3: s0 = v1.p1
    val v7: s1 = f90(v1, v4)
    var v8: s0 = v3
    var v6: s1 = v4
    val v14: s1 = f82(v7)
    val v16: s1 = f90(v14, v7)
    v6 = v6.copy(p1 = v3)
    val v22: s0 = v2.p1
    var v12: s1 = v14
    v5 = v5.copy(p0 = v8)
    val v9: s1 = f82(v16)
    var v15: s0 = v22
    v4 = v4.copy(p1 = v8)
    val v11: s1 = f82(v16)
    val v20: s0 = v11.p1
    var v23: s0 = v3
    val v18: s0 = f111(v15)
    val v13: Double = v18.p1
    val v10: s0 = v5.p1
    val v36: Double = v20.p1
    val v17: Double = f54(v36)
    v4 = v4.copy(p0 = v8)
    v5 = v6
    val v19: s0 = v4.p1
    val v21: s1 = f90(v14, v14)
    val v28: Vector[Vector[Double]] = v10.p0
    val v39: Vector[Vector[Double]] = v22.p0
    v23 = v23.copy(p1 = v36)
    v6 = v6.copy(p0 = v18)
    val v29: Vector[Double] = v28(0)
    val v46: Double = v29(0)
    var v54: s0 = v23
    v54 = v54.copy(p0 = v28)
    val v24: Vector[s1] = Vector(v16, v21, v14, v12, v11)
    var v30: Vector[Double] = v29
    val v25: Vector[Vector[Double]] = v8.p0
    v5 = v5.copy(p1 = v8)
    val v70: s0 = s0(v25, v36)
    v30 = v30.updated(0, v13)
    val v38: s0 = v9.p1
    var v34: Vector[Vector[Double]] = v39
    var v47: Double = v36
    val v104: Double = v47 - v46
    v34 = v34.updated(0, v29)
    v34 = v34.updated(0, v30)
    val v52: s0 = f111(v38)
    v5 = v5.copy(p1 = v3)
    val v67: s0 = s0(v28, v104)
    v34 = v34.updated(0, v30)
    var v26: Double = v13
    val v32: Double = f54(v46)
    val v40: Vector[Double] = v25(0)
    val v57: s1 = f78(v2)
    v54 = v70
    v12 = v12.copy(p0 = v10)
    v34 = v34.updated(0, v40)
    val v50: s0 = v1.p0
    val v33: s0 = v2.p0
    v30 = v30.updated(0, v17)
    v34 = v34.updated(0, v29)
    v30 = v30.updated(0, v46)
    v30 = v30.updated(0, v32)
    v34 = v34.updated(0, v40)
    v5 = v5.copy(p1 = v8)
    var v94: s0 = v52
    v12 = v12.copy(p0 = v19)
    val v85: Vector[s1] = Vector(v4, v9, v57, v12)
    val v56: s1 = f82(v12)
    val v82: Double = v29(0)
    v4 = v4.copy(p0 = v54)
    val v48: s1 = v24(4)
    v6 = v6.copy(p1 = v70)
    val v84: s1 = s1(v20, v50)
    var v76: Vector[s1] = v24
    v23 = v23.copy(p0 = v25)
    val v95: s1 = v85(1)
    v6 = v6.copy(p0 = v38)
    v23 = v23.copy(p1 = v82)
    v76 = v76.updated(2, v56)
    v5 = v5.copy(p1 = v94)
    v4 = v4.copy(p0 = v33)
    v34 = v34.updated(0, v29)
    v4 = v4.copy(p0 = v67)
    v76 = v76.updated(2, v9)
    v76 = v76.updated(1, v84)
    v54 = v54.copy(p0 = v34)
    v76 = v76.updated(0, v9)
    v30 = v30.updated(0, v26)
    val v113: s1 = v76(1)
    v76 = v76.updated(4, v95)
    v76 = v76.updated(4, v48)
    v4 = v4.copy(p1 = v23)
    v4 = v4.copy(p0 = v8)
    v113
  }
  @noinline
  def f0(v0: s13, v1: s10, v2: Double): Double = {
    val v25: s2 = v0.p1
    val v9: s1 = v25.p1
    var v19: s1 = v9
    val v21: s1 = f50(v19, v9)
    val v60: s0 = v21.p1
    val v35: Double = v60.p1
    v35
  }
  def benchmark(): Unit = {
    val v0: s13 = s13(Vector(s0(Vector(Vector(0.0)), 1.0), s0(Vector(Vector(2.0)), 3.0), s0(Vector(Vector(4.0)), 5.0)), s2(Vector(Vector(s1(s0(Vector(Vector(6.0)), 7.0), s0(Vector(Vector(8.0)), 9.0)))), s1(s0(Vector(Vector(10.0)), 11.0), s0(Vector(Vector(12.0)), 13.0))))
    val v1: s10 = s10(Vector(s9(s1(s0(Vector(Vector(14.0)), 15.0), s0(Vector(Vector(16.0)), 17.0)), Vector(Vector(s8(s7(s3(s1(s0(Vector(Vector(18.0)), 19.0), s0(Vector(Vector(20.0)), 21.0)), s0(Vector(Vector(22.0)), 23.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(24.0)), 25.0), s0(Vector(Vector(26.0)), 27.0)))), s1(s0(Vector(Vector(28.0)), 29.0), s0(Vector(Vector(30.0)), 31.0))), s2(Vector(Vector(s1(s0(Vector(Vector(32.0)), 33.0), s0(Vector(Vector(34.0)), 35.0)))), s1(s0(Vector(Vector(36.0)), 37.0), s0(Vector(Vector(38.0)), 39.0))), s2(Vector(Vector(s1(s0(Vector(Vector(40.0)), 41.0), s0(Vector(Vector(42.0)), 43.0)))), s1(s0(Vector(Vector(44.0)), 45.0), s0(Vector(Vector(46.0)), 47.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(48.0)), 49.0), s0(Vector(Vector(50.0)), 51.0)))), s1(s0(Vector(Vector(52.0)), 53.0), s0(Vector(Vector(54.0)), 55.0)))), Vector(s0(Vector(Vector(56.0)), 57.0), s0(Vector(Vector(58.0)), 59.0))), s6(s0(Vector(Vector(60.0)), 61.0), Vector(Vector(s0(Vector(Vector(62.0)), 63.0)), Vector(s0(Vector(Vector(64.0)), 65.0)))), Vector(s6(s0(Vector(Vector(66.0)), 67.0), Vector(Vector(s0(Vector(Vector(68.0)), 69.0)), Vector(s0(Vector(Vector(70.0)), 71.0)))), s6(s0(Vector(Vector(72.0)), 73.0), Vector(Vector(s0(Vector(Vector(74.0)), 75.0)), Vector(s0(Vector(Vector(76.0)), 77.0)))), s6(s0(Vector(Vector(78.0)), 79.0), Vector(Vector(s0(Vector(Vector(80.0)), 81.0)), Vector(s0(Vector(Vector(82.0)), 83.0))))), s3(s1(s0(Vector(Vector(84.0)), 85.0), s0(Vector(Vector(86.0)), 87.0)), s0(Vector(Vector(88.0)), 89.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(90.0)), 91.0), s0(Vector(Vector(92.0)), 93.0)))), s1(s0(Vector(Vector(94.0)), 95.0), s0(Vector(Vector(96.0)), 97.0))), s2(Vector(Vector(s1(s0(Vector(Vector(98.0)), 99.0), s0(Vector(Vector(100.0)), 101.0)))), s1(s0(Vector(Vector(102.0)), 103.0), s0(Vector(Vector(104.0)), 105.0))), s2(Vector(Vector(s1(s0(Vector(Vector(106.0)), 107.0), s0(Vector(Vector(108.0)), 109.0)))), s1(s0(Vector(Vector(110.0)), 111.0), s0(Vector(Vector(112.0)), 113.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(114.0)), 115.0), s0(Vector(Vector(116.0)), 117.0)))), s1(s0(Vector(Vector(118.0)), 119.0), s0(Vector(Vector(120.0)), 121.0)))))), Vector(s8(s7(s3(s1(s0(Vector(Vector(122.0)), 123.0), s0(Vector(Vector(124.0)), 125.0)), s0(Vector(Vector(126.0)), 127.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(128.0)), 129.0), s0(Vector(Vector(130.0)), 131.0)))), s1(s0(Vector(Vector(132.0)), 133.0), s0(Vector(Vector(134.0)), 135.0))), s2(Vector(Vector(s1(s0(Vector(Vector(136.0)), 137.0), s0(Vector(Vector(138.0)), 139.0)))), s1(s0(Vector(Vector(140.0)), 141.0), s0(Vector(Vector(142.0)), 143.0))), s2(Vector(Vector(s1(s0(Vector(Vector(144.0)), 145.0), s0(Vector(Vector(146.0)), 147.0)))), s1(s0(Vector(Vector(148.0)), 149.0), s0(Vector(Vector(150.0)), 151.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(152.0)), 153.0), s0(Vector(Vector(154.0)), 155.0)))), s1(s0(Vector(Vector(156.0)), 157.0), s0(Vector(Vector(158.0)), 159.0)))), Vector(s0(Vector(Vector(160.0)), 161.0), s0(Vector(Vector(162.0)), 163.0))), s6(s0(Vector(Vector(164.0)), 165.0), Vector(Vector(s0(Vector(Vector(166.0)), 167.0)), Vector(s0(Vector(Vector(168.0)), 169.0)))), Vector(s6(s0(Vector(Vector(170.0)), 171.0), Vector(Vector(s0(Vector(Vector(172.0)), 173.0)), Vector(s0(Vector(Vector(174.0)), 175.0)))), s6(s0(Vector(Vector(176.0)), 177.0), Vector(Vector(s0(Vector(Vector(178.0)), 179.0)), Vector(s0(Vector(Vector(180.0)), 181.0)))), s6(s0(Vector(Vector(182.0)), 183.0), Vector(Vector(s0(Vector(Vector(184.0)), 185.0)), Vector(s0(Vector(Vector(186.0)), 187.0))))), s3(s1(s0(Vector(Vector(188.0)), 189.0), s0(Vector(Vector(190.0)), 191.0)), s0(Vector(Vector(192.0)), 193.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(194.0)), 195.0), s0(Vector(Vector(196.0)), 197.0)))), s1(s0(Vector(Vector(198.0)), 199.0), s0(Vector(Vector(200.0)), 201.0))), s2(Vector(Vector(s1(s0(Vector(Vector(202.0)), 203.0), s0(Vector(Vector(204.0)), 205.0)))), s1(s0(Vector(Vector(206.0)), 207.0), s0(Vector(Vector(208.0)), 209.0))), s2(Vector(Vector(s1(s0(Vector(Vector(210.0)), 211.0), s0(Vector(Vector(212.0)), 213.0)))), s1(s0(Vector(Vector(214.0)), 215.0), s0(Vector(Vector(216.0)), 217.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(218.0)), 219.0), s0(Vector(Vector(220.0)), 221.0)))), s1(s0(Vector(Vector(222.0)), 223.0), s0(Vector(Vector(224.0)), 225.0)))))), Vector(s8(s7(s3(s1(s0(Vector(Vector(226.0)), 227.0), s0(Vector(Vector(228.0)), 229.0)), s0(Vector(Vector(230.0)), 231.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(232.0)), 233.0), s0(Vector(Vector(234.0)), 235.0)))), s1(s0(Vector(Vector(236.0)), 237.0), s0(Vector(Vector(238.0)), 239.0))), s2(Vector(Vector(s1(s0(Vector(Vector(240.0)), 241.0), s0(Vector(Vector(242.0)), 243.0)))), s1(s0(Vector(Vector(244.0)), 245.0), s0(Vector(Vector(246.0)), 247.0))), s2(Vector(Vector(s1(s0(Vector(Vector(248.0)), 249.0), s0(Vector(Vector(250.0)), 251.0)))), s1(s0(Vector(Vector(252.0)), 253.0), s0(Vector(Vector(254.0)), 255.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(256.0)), 257.0), s0(Vector(Vector(258.0)), 259.0)))), s1(s0(Vector(Vector(260.0)), 261.0), s0(Vector(Vector(262.0)), 263.0)))), Vector(s0(Vector(Vector(264.0)), 265.0), s0(Vector(Vector(266.0)), 267.0))), s6(s0(Vector(Vector(268.0)), 269.0), Vector(Vector(s0(Vector(Vector(270.0)), 271.0)), Vector(s0(Vector(Vector(272.0)), 273.0)))), Vector(s6(s0(Vector(Vector(274.0)), 275.0), Vector(Vector(s0(Vector(Vector(276.0)), 277.0)), Vector(s0(Vector(Vector(278.0)), 279.0)))), s6(s0(Vector(Vector(280.0)), 281.0), Vector(Vector(s0(Vector(Vector(282.0)), 283.0)), Vector(s0(Vector(Vector(284.0)), 285.0)))), s6(s0(Vector(Vector(286.0)), 287.0), Vector(Vector(s0(Vector(Vector(288.0)), 289.0)), Vector(s0(Vector(Vector(290.0)), 291.0))))), s3(s1(s0(Vector(Vector(292.0)), 293.0), s0(Vector(Vector(294.0)), 295.0)), s0(Vector(Vector(296.0)), 297.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(298.0)), 299.0), s0(Vector(Vector(300.0)), 301.0)))), s1(s0(Vector(Vector(302.0)), 303.0), s0(Vector(Vector(304.0)), 305.0))), s2(Vector(Vector(s1(s0(Vector(Vector(306.0)), 307.0), s0(Vector(Vector(308.0)), 309.0)))), s1(s0(Vector(Vector(310.0)), 311.0), s0(Vector(Vector(312.0)), 313.0))), s2(Vector(Vector(s1(s0(Vector(Vector(314.0)), 315.0), s0(Vector(Vector(316.0)), 317.0)))), s1(s0(Vector(Vector(318.0)), 319.0), s0(Vector(Vector(320.0)), 321.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(322.0)), 323.0), s0(Vector(Vector(324.0)), 325.0)))), s1(s0(Vector(Vector(326.0)), 327.0), s0(Vector(Vector(328.0)), 329.0))))))))), Vector(s3(s1(s0(Vector(Vector(330.0)), 331.0), s0(Vector(Vector(332.0)), 333.0)), s0(Vector(Vector(334.0)), 335.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(336.0)), 337.0), s0(Vector(Vector(338.0)), 339.0)))), s1(s0(Vector(Vector(340.0)), 341.0), s0(Vector(Vector(342.0)), 343.0))), s2(Vector(Vector(s1(s0(Vector(Vector(344.0)), 345.0), s0(Vector(Vector(346.0)), 347.0)))), s1(s0(Vector(Vector(348.0)), 349.0), s0(Vector(Vector(350.0)), 351.0))), s2(Vector(Vector(s1(s0(Vector(Vector(352.0)), 353.0), s0(Vector(Vector(354.0)), 355.0)))), s1(s0(Vector(Vector(356.0)), 357.0), s0(Vector(Vector(358.0)), 359.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(360.0)), 361.0), s0(Vector(Vector(362.0)), 363.0)))), s1(s0(Vector(Vector(364.0)), 365.0), s0(Vector(Vector(366.0)), 367.0)))), s3(s1(s0(Vector(Vector(368.0)), 369.0), s0(Vector(Vector(370.0)), 371.0)), s0(Vector(Vector(372.0)), 373.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(374.0)), 375.0), s0(Vector(Vector(376.0)), 377.0)))), s1(s0(Vector(Vector(378.0)), 379.0), s0(Vector(Vector(380.0)), 381.0))), s2(Vector(Vector(s1(s0(Vector(Vector(382.0)), 383.0), s0(Vector(Vector(384.0)), 385.0)))), s1(s0(Vector(Vector(386.0)), 387.0), s0(Vector(Vector(388.0)), 389.0))), s2(Vector(Vector(s1(s0(Vector(Vector(390.0)), 391.0), s0(Vector(Vector(392.0)), 393.0)))), s1(s0(Vector(Vector(394.0)), 395.0), s0(Vector(Vector(396.0)), 397.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(398.0)), 399.0), s0(Vector(Vector(400.0)), 401.0)))), s1(s0(Vector(Vector(402.0)), 403.0), s0(Vector(Vector(404.0)), 405.0)))), s3(s1(s0(Vector(Vector(406.0)), 407.0), s0(Vector(Vector(408.0)), 409.0)), s0(Vector(Vector(410.0)), 411.0), Vector(s2(Vector(Vector(s1(s0(Vector(Vector(412.0)), 413.0), s0(Vector(Vector(414.0)), 415.0)))), s1(s0(Vector(Vector(416.0)), 417.0), s0(Vector(Vector(418.0)), 419.0))), s2(Vector(Vector(s1(s0(Vector(Vector(420.0)), 421.0), s0(Vector(Vector(422.0)), 423.0)))), s1(s0(Vector(Vector(424.0)), 425.0), s0(Vector(Vector(426.0)), 427.0))), s2(Vector(Vector(s1(s0(Vector(Vector(428.0)), 429.0), s0(Vector(Vector(430.0)), 431.0)))), s1(s0(Vector(Vector(432.0)), 433.0), s0(Vector(Vector(434.0)), 435.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(436.0)), 437.0), s0(Vector(Vector(438.0)), 439.0)))), s1(s0(Vector(Vector(440.0)), 441.0), s0(Vector(Vector(442.0)), 443.0))))))
    val v2: Double = 444.0
    val start = nanoTime()
    var result: Double = 444.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}