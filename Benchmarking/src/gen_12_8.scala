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
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s4 (
    p0: s2,
    p1: s2
  )
  case class s5 (
    p0: Vector[Vector[s1]],
    p1: Vector[s4],
    p2: s2,
    p3: Vector[s0],
    p4: s3
  )
  case class s6 (
    p0: Vector[Vector[s5]],
    p1: s2
  )
  case class s7 (
    p0: Vector[s6],
    p1: s2
  )
  case class s8 (
    p0: s7,
    p1: s6,
    p2: Vector[s2]
  )
  case class s11 (
    p0: s4,
    p1: Vector[Vector[s1]]
  )
  def f83(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v7
    var v1: Double = v7
    var v2: Double = v4
    var v6: Double = v1
    var v5: Double = v6
    var v3: Double = v6
    val v8: Double = v3 + v2
    var v15: Double = v1
    var v27: Double = v5
    var v13: Double = v7
    v1 = v13
    v4 = v3
    val v12: Vector[Double] = Vector(v27, v4, v5)
    var v11: Vector[Double] = v12
    v11 = v11.updated(1, v3)
    val v33: Double = v11(1)
    val v40: Vector[Double] = Vector(v8, v2, v33, v27)
    val v20: Double = v40(2)
    val v21: Double = v40(2)
    v11 = v11.updated(0, v21)
    var v24: Vector[Double] = v40
    val v19: Double = v24(1)
    var v25: Double = v4
    v24 = v24.updated(3, v20)
    v11 = v11.updated(2, v21)
    val v75: Vector[Double] = Vector(v25, v19)
    v5 = v15
    val v47: Double = v75(1)
    val v48: Double = v75(1)
    v11 = v11.updated(0, v47)
    v48
  }
  @noinline
  def f0(v0: Vector[s8], v1: Vector[s11], v2: Double): Double = {
    val v4: Double = f83(v2)
    val v5: Double = f83(v2)
    var v3: Double = v2
    val v7: Double = f83(v5)
    val v25: Double = f83(v4)
    val v10: Double = f83(v3)
    val v129: Double = v25 / v10
    val v87: Double = v5 / v129
    val v90: Double = f83(v7)
    val v174: Double = v90 / v87
    v174
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s7(Vector(s6(Vector(Vector(s5(Vector(Vector(s1(s0(Vector(Vector(0.0)), 1.0), s0(Vector(Vector(2.0)), 3.0)))), Vector(s4(s2(Vector(s1(s0(Vector(Vector(4.0)), 5.0), s0(Vector(Vector(6.0)), 7.0))), s0(Vector(Vector(8.0)), 9.0)), s2(Vector(s1(s0(Vector(Vector(10.0)), 11.0), s0(Vector(Vector(12.0)), 13.0))), s0(Vector(Vector(14.0)), 15.0))), s4(s2(Vector(s1(s0(Vector(Vector(16.0)), 17.0), s0(Vector(Vector(18.0)), 19.0))), s0(Vector(Vector(20.0)), 21.0)), s2(Vector(s1(s0(Vector(Vector(22.0)), 23.0), s0(Vector(Vector(24.0)), 25.0))), s0(Vector(Vector(26.0)), 27.0)))), s2(Vector(s1(s0(Vector(Vector(28.0)), 29.0), s0(Vector(Vector(30.0)), 31.0))), s0(Vector(Vector(32.0)), 33.0)), Vector(s0(Vector(Vector(34.0)), 35.0), s0(Vector(Vector(36.0)), 37.0)), s3(s0(Vector(Vector(38.0)), 39.0), Vector(s2(Vector(s1(s0(Vector(Vector(40.0)), 41.0), s0(Vector(Vector(42.0)), 43.0))), s0(Vector(Vector(44.0)), 45.0)), s2(Vector(s1(s0(Vector(Vector(46.0)), 47.0), s0(Vector(Vector(48.0)), 49.0))), s0(Vector(Vector(50.0)), 51.0)), s2(Vector(s1(s0(Vector(Vector(52.0)), 53.0), s0(Vector(Vector(54.0)), 55.0))), s0(Vector(Vector(56.0)), 57.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(58.0)), 59.0), s0(Vector(Vector(60.0)), 61.0)))), Vector(s4(s2(Vector(s1(s0(Vector(Vector(62.0)), 63.0), s0(Vector(Vector(64.0)), 65.0))), s0(Vector(Vector(66.0)), 67.0)), s2(Vector(s1(s0(Vector(Vector(68.0)), 69.0), s0(Vector(Vector(70.0)), 71.0))), s0(Vector(Vector(72.0)), 73.0))), s4(s2(Vector(s1(s0(Vector(Vector(74.0)), 75.0), s0(Vector(Vector(76.0)), 77.0))), s0(Vector(Vector(78.0)), 79.0)), s2(Vector(s1(s0(Vector(Vector(80.0)), 81.0), s0(Vector(Vector(82.0)), 83.0))), s0(Vector(Vector(84.0)), 85.0)))), s2(Vector(s1(s0(Vector(Vector(86.0)), 87.0), s0(Vector(Vector(88.0)), 89.0))), s0(Vector(Vector(90.0)), 91.0)), Vector(s0(Vector(Vector(92.0)), 93.0), s0(Vector(Vector(94.0)), 95.0)), s3(s0(Vector(Vector(96.0)), 97.0), Vector(s2(Vector(s1(s0(Vector(Vector(98.0)), 99.0), s0(Vector(Vector(100.0)), 101.0))), s0(Vector(Vector(102.0)), 103.0)), s2(Vector(s1(s0(Vector(Vector(104.0)), 105.0), s0(Vector(Vector(106.0)), 107.0))), s0(Vector(Vector(108.0)), 109.0)), s2(Vector(s1(s0(Vector(Vector(110.0)), 111.0), s0(Vector(Vector(112.0)), 113.0))), s0(Vector(Vector(114.0)), 115.0))))))), s2(Vector(s1(s0(Vector(Vector(116.0)), 117.0), s0(Vector(Vector(118.0)), 119.0))), s0(Vector(Vector(120.0)), 121.0)))), s2(Vector(s1(s0(Vector(Vector(122.0)), 123.0), s0(Vector(Vector(124.0)), 125.0))), s0(Vector(Vector(126.0)), 127.0))), s6(Vector(Vector(s5(Vector(Vector(s1(s0(Vector(Vector(128.0)), 129.0), s0(Vector(Vector(130.0)), 131.0)))), Vector(s4(s2(Vector(s1(s0(Vector(Vector(132.0)), 133.0), s0(Vector(Vector(134.0)), 135.0))), s0(Vector(Vector(136.0)), 137.0)), s2(Vector(s1(s0(Vector(Vector(138.0)), 139.0), s0(Vector(Vector(140.0)), 141.0))), s0(Vector(Vector(142.0)), 143.0))), s4(s2(Vector(s1(s0(Vector(Vector(144.0)), 145.0), s0(Vector(Vector(146.0)), 147.0))), s0(Vector(Vector(148.0)), 149.0)), s2(Vector(s1(s0(Vector(Vector(150.0)), 151.0), s0(Vector(Vector(152.0)), 153.0))), s0(Vector(Vector(154.0)), 155.0)))), s2(Vector(s1(s0(Vector(Vector(156.0)), 157.0), s0(Vector(Vector(158.0)), 159.0))), s0(Vector(Vector(160.0)), 161.0)), Vector(s0(Vector(Vector(162.0)), 163.0), s0(Vector(Vector(164.0)), 165.0)), s3(s0(Vector(Vector(166.0)), 167.0), Vector(s2(Vector(s1(s0(Vector(Vector(168.0)), 169.0), s0(Vector(Vector(170.0)), 171.0))), s0(Vector(Vector(172.0)), 173.0)), s2(Vector(s1(s0(Vector(Vector(174.0)), 175.0), s0(Vector(Vector(176.0)), 177.0))), s0(Vector(Vector(178.0)), 179.0)), s2(Vector(s1(s0(Vector(Vector(180.0)), 181.0), s0(Vector(Vector(182.0)), 183.0))), s0(Vector(Vector(184.0)), 185.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(186.0)), 187.0), s0(Vector(Vector(188.0)), 189.0)))), Vector(s4(s2(Vector(s1(s0(Vector(Vector(190.0)), 191.0), s0(Vector(Vector(192.0)), 193.0))), s0(Vector(Vector(194.0)), 195.0)), s2(Vector(s1(s0(Vector(Vector(196.0)), 197.0), s0(Vector(Vector(198.0)), 199.0))), s0(Vector(Vector(200.0)), 201.0))), s4(s2(Vector(s1(s0(Vector(Vector(202.0)), 203.0), s0(Vector(Vector(204.0)), 205.0))), s0(Vector(Vector(206.0)), 207.0)), s2(Vector(s1(s0(Vector(Vector(208.0)), 209.0), s0(Vector(Vector(210.0)), 211.0))), s0(Vector(Vector(212.0)), 213.0)))), s2(Vector(s1(s0(Vector(Vector(214.0)), 215.0), s0(Vector(Vector(216.0)), 217.0))), s0(Vector(Vector(218.0)), 219.0)), Vector(s0(Vector(Vector(220.0)), 221.0), s0(Vector(Vector(222.0)), 223.0)), s3(s0(Vector(Vector(224.0)), 225.0), Vector(s2(Vector(s1(s0(Vector(Vector(226.0)), 227.0), s0(Vector(Vector(228.0)), 229.0))), s0(Vector(Vector(230.0)), 231.0)), s2(Vector(s1(s0(Vector(Vector(232.0)), 233.0), s0(Vector(Vector(234.0)), 235.0))), s0(Vector(Vector(236.0)), 237.0)), s2(Vector(s1(s0(Vector(Vector(238.0)), 239.0), s0(Vector(Vector(240.0)), 241.0))), s0(Vector(Vector(242.0)), 243.0))))))), s2(Vector(s1(s0(Vector(Vector(244.0)), 245.0), s0(Vector(Vector(246.0)), 247.0))), s0(Vector(Vector(248.0)), 249.0))), Vector(s2(Vector(s1(s0(Vector(Vector(250.0)), 251.0), s0(Vector(Vector(252.0)), 253.0))), s0(Vector(Vector(254.0)), 255.0)), s2(Vector(s1(s0(Vector(Vector(256.0)), 257.0), s0(Vector(Vector(258.0)), 259.0))), s0(Vector(Vector(260.0)), 261.0)))))
    val v1: Vector[s11] = Vector(s11(s4(s2(Vector(s1(s0(Vector(Vector(262.0)), 263.0), s0(Vector(Vector(264.0)), 265.0))), s0(Vector(Vector(266.0)), 267.0)), s2(Vector(s1(s0(Vector(Vector(268.0)), 269.0), s0(Vector(Vector(270.0)), 271.0))), s0(Vector(Vector(272.0)), 273.0))), Vector(Vector(s1(s0(Vector(Vector(274.0)), 275.0), s0(Vector(Vector(276.0)), 277.0))), Vector(s1(s0(Vector(Vector(278.0)), 279.0), s0(Vector(Vector(280.0)), 281.0))))), s11(s4(s2(Vector(s1(s0(Vector(Vector(282.0)), 283.0), s0(Vector(Vector(284.0)), 285.0))), s0(Vector(Vector(286.0)), 287.0)), s2(Vector(s1(s0(Vector(Vector(288.0)), 289.0), s0(Vector(Vector(290.0)), 291.0))), s0(Vector(Vector(292.0)), 293.0))), Vector(Vector(s1(s0(Vector(Vector(294.0)), 295.0), s0(Vector(Vector(296.0)), 297.0))), Vector(s1(s0(Vector(Vector(298.0)), 299.0), s0(Vector(Vector(300.0)), 301.0))))), s11(s4(s2(Vector(s1(s0(Vector(Vector(302.0)), 303.0), s0(Vector(Vector(304.0)), 305.0))), s0(Vector(Vector(306.0)), 307.0)), s2(Vector(s1(s0(Vector(Vector(308.0)), 309.0), s0(Vector(Vector(310.0)), 311.0))), s0(Vector(Vector(312.0)), 313.0))), Vector(Vector(s1(s0(Vector(Vector(314.0)), 315.0), s0(Vector(Vector(316.0)), 317.0))), Vector(s1(s0(Vector(Vector(318.0)), 319.0), s0(Vector(Vector(320.0)), 321.0))))))
    val v2: Double = 322.0
    val start = nanoTime()
    var result: Double = 322.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}