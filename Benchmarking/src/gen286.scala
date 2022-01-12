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
  case class s4 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: Vector[s1],
    p1: Vector[s1],
    p2: Vector[s2]
  )
  case class s6 (
    p0: s0,
    p1: Vector[s4]
  )
  case class s7 (
    p0: Vector[s6],
    p1: s6
  )
  case class s9 (
    p0: s7,
    p1: s5
  )
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: s9, v2: Double): Double = {
    val v6: s7 = v1.p0
    var v4: Double = v2
    val v9: Vector[s6] = v6.p0
    val v7: s6 = v9(1)
    val v28: Double = v2 * v4
    val v42: s0 = v7.p0
    val v59: Vector[Double] = v42.p1
    val v47: Double = v59(2)
    val v77: Double = v2 + v47
    val v162: Double = v77 + v28
    v162
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(1.0, 2.0, 3.0)), s0(Vector(Vector(4.0)), Vector(5.0, 6.0, 7.0))), s0(Vector(Vector(8.0)), Vector(9.0, 10.0, 11.0))), s1(Vector(s0(Vector(Vector(12.0)), Vector(13.0, 14.0, 15.0)), s0(Vector(Vector(16.0)), Vector(17.0, 18.0, 19.0))), s0(Vector(Vector(20.0)), Vector(21.0, 22.0, 23.0))), s1(Vector(s0(Vector(Vector(24.0)), Vector(25.0, 26.0, 27.0)), s0(Vector(Vector(28.0)), Vector(29.0, 30.0, 31.0))), s0(Vector(Vector(32.0)), Vector(33.0, 34.0, 35.0)))), Vector(s1(Vector(s0(Vector(Vector(36.0)), Vector(37.0, 38.0, 39.0)), s0(Vector(Vector(40.0)), Vector(41.0, 42.0, 43.0))), s0(Vector(Vector(44.0)), Vector(45.0, 46.0, 47.0))), s1(Vector(s0(Vector(Vector(48.0)), Vector(49.0, 50.0, 51.0)), s0(Vector(Vector(52.0)), Vector(53.0, 54.0, 55.0))), s0(Vector(Vector(56.0)), Vector(57.0, 58.0, 59.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(60.0)), Vector(61.0, 62.0, 63.0)), s0(Vector(Vector(64.0)), Vector(65.0, 66.0, 67.0))), s0(Vector(Vector(68.0)), Vector(69.0, 70.0, 71.0))), s1(Vector(s0(Vector(Vector(72.0)), Vector(73.0, 74.0, 75.0)), s0(Vector(Vector(76.0)), Vector(77.0, 78.0, 79.0))), s0(Vector(Vector(80.0)), Vector(81.0, 82.0, 83.0))), s1(Vector(s0(Vector(Vector(84.0)), Vector(85.0, 86.0, 87.0)), s0(Vector(Vector(88.0)), Vector(89.0, 90.0, 91.0))), s0(Vector(Vector(92.0)), Vector(93.0, 94.0, 95.0)))), s0(Vector(Vector(96.0)), Vector(97.0, 98.0, 99.0)))))))
    val v1: s9 = s9(s7(Vector(s6(s0(Vector(Vector(100.0)), Vector(101.0, 102.0, 103.0)), Vector(s4(s1(Vector(s0(Vector(Vector(104.0)), Vector(105.0, 106.0, 107.0)), s0(Vector(Vector(108.0)), Vector(109.0, 110.0, 111.0))), s0(Vector(Vector(112.0)), Vector(113.0, 114.0, 115.0))), Vector(Vector(s0(Vector(Vector(116.0)), Vector(117.0, 118.0, 119.0))), Vector(s0(Vector(Vector(120.0)), Vector(121.0, 122.0, 123.0))))))), s6(s0(Vector(Vector(124.0)), Vector(125.0, 126.0, 127.0)), Vector(s4(s1(Vector(s0(Vector(Vector(128.0)), Vector(129.0, 130.0, 131.0)), s0(Vector(Vector(132.0)), Vector(133.0, 134.0, 135.0))), s0(Vector(Vector(136.0)), Vector(137.0, 138.0, 139.0))), Vector(Vector(s0(Vector(Vector(140.0)), Vector(141.0, 142.0, 143.0))), Vector(s0(Vector(Vector(144.0)), Vector(145.0, 146.0, 147.0)))))))), s6(s0(Vector(Vector(148.0)), Vector(149.0, 150.0, 151.0)), Vector(s4(s1(Vector(s0(Vector(Vector(152.0)), Vector(153.0, 154.0, 155.0)), s0(Vector(Vector(156.0)), Vector(157.0, 158.0, 159.0))), s0(Vector(Vector(160.0)), Vector(161.0, 162.0, 163.0))), Vector(Vector(s0(Vector(Vector(164.0)), Vector(165.0, 166.0, 167.0))), Vector(s0(Vector(Vector(168.0)), Vector(169.0, 170.0, 171.0)))))))), s5(Vector(s1(Vector(s0(Vector(Vector(172.0)), Vector(173.0, 174.0, 175.0)), s0(Vector(Vector(176.0)), Vector(177.0, 178.0, 179.0))), s0(Vector(Vector(180.0)), Vector(181.0, 182.0, 183.0))), s1(Vector(s0(Vector(Vector(184.0)), Vector(185.0, 186.0, 187.0)), s0(Vector(Vector(188.0)), Vector(189.0, 190.0, 191.0))), s0(Vector(Vector(192.0)), Vector(193.0, 194.0, 195.0))), s1(Vector(s0(Vector(Vector(196.0)), Vector(197.0, 198.0, 199.0)), s0(Vector(Vector(200.0)), Vector(201.0, 202.0, 203.0))), s0(Vector(Vector(204.0)), Vector(205.0, 206.0, 207.0)))), Vector(s1(Vector(s0(Vector(Vector(208.0)), Vector(209.0, 210.0, 211.0)), s0(Vector(Vector(212.0)), Vector(213.0, 214.0, 215.0))), s0(Vector(Vector(216.0)), Vector(217.0, 218.0, 219.0))), s1(Vector(s0(Vector(Vector(220.0)), Vector(221.0, 222.0, 223.0)), s0(Vector(Vector(224.0)), Vector(225.0, 226.0, 227.0))), s0(Vector(Vector(228.0)), Vector(229.0, 230.0, 231.0)))), Vector(s2(Vector(s1(Vector(s0(Vector(Vector(232.0)), Vector(233.0, 234.0, 235.0)), s0(Vector(Vector(236.0)), Vector(237.0, 238.0, 239.0))), s0(Vector(Vector(240.0)), Vector(241.0, 242.0, 243.0))), s1(Vector(s0(Vector(Vector(244.0)), Vector(245.0, 246.0, 247.0)), s0(Vector(Vector(248.0)), Vector(249.0, 250.0, 251.0))), s0(Vector(Vector(252.0)), Vector(253.0, 254.0, 255.0))), s1(Vector(s0(Vector(Vector(256.0)), Vector(257.0, 258.0, 259.0)), s0(Vector(Vector(260.0)), Vector(261.0, 262.0, 263.0))), s0(Vector(Vector(264.0)), Vector(265.0, 266.0, 267.0)))), s0(Vector(Vector(268.0)), Vector(269.0, 270.0, 271.0))))))
    val v2: Double = 272.0
    val start = nanoTime()
    var result: Double = 272.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}