import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Double],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: s0,
    p4: Vector[s0],
    p5: s0,
    p6: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]],
    p2: Vector[s1]
  )
  case class s5 (
    p0: Vector[s0],
    p1: Vector[Vector[s2]]
  )
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v3: s5 = v0(0)
    val v13: Vector[Vector[s2]] = v3.p1
    val v8: Vector[s2] = v13(1)
    val v11: s2 = v8(0)
    val v16: s1 = v11.p0
    var v29: Double = v1
    val v24: Double = v29 / v1
    val v20: Vector[Double] = Vector(v29, v29, v1, v1, v24, v29, v29)
    val v35: s0 = v16.p5
    val v86: Vector[Double] = v35.p2
    val v100: Double = v86(0)
    val v84: Double = v20(3)
    val v160: Double = v84 + v100
    v160
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(2.0, 3.0, 4.0), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)), Vector(8.0, 9.0, 10.0), Vector(Vector(11.0)))), Vector(Vector(s2(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(14.0, 15.0, 16.0), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)), Vector(20.0, 21.0, 22.0), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(26.0, 27.0, 28.0), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)), Vector(32.0, 33.0, 34.0), Vector(Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)), Vector(38.0, 39.0, 40.0), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0)), Vector(44.0, 45.0, 46.0), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)), Vector(50.0, 51.0, 52.0), Vector(Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)), Vector(56.0, 57.0, 58.0), Vector(Vector(59.0))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0)), Vector(62.0, 63.0, 64.0), Vector(Vector(65.0))))), Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0)), Vector(68.0, 69.0, 70.0), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0)), Vector(74.0, 75.0, 76.0), Vector(Vector(77.0))))), Vector(s1(s0(Vector(Vector(78.0)), Vector(Vector(79.0)), Vector(80.0, 81.0, 82.0), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0)), Vector(86.0, 87.0, 88.0), Vector(Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0)), Vector(92.0, 93.0, 94.0), Vector(Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0)), Vector(98.0, 99.0, 100.0), Vector(Vector(101.0))), Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0)), Vector(104.0, 105.0, 106.0), Vector(Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0)), Vector(110.0, 111.0, 112.0), Vector(Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0)), Vector(116.0, 117.0, 118.0), Vector(Vector(119.0)))), s0(Vector(Vector(120.0)), Vector(Vector(121.0)), Vector(122.0, 123.0, 124.0), Vector(Vector(125.0))), Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0)), Vector(128.0, 129.0, 130.0), Vector(Vector(131.0)))))))), Vector(s2(s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0)), Vector(134.0, 135.0, 136.0), Vector(Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0)), Vector(140.0, 141.0, 142.0), Vector(Vector(143.0))), s0(Vector(Vector(144.0)), Vector(Vector(145.0)), Vector(146.0, 147.0, 148.0), Vector(Vector(149.0))), s0(Vector(Vector(150.0)), Vector(Vector(151.0)), Vector(152.0, 153.0, 154.0), Vector(Vector(155.0))), Vector(s0(Vector(Vector(156.0)), Vector(Vector(157.0)), Vector(158.0, 159.0, 160.0), Vector(Vector(161.0))), s0(Vector(Vector(162.0)), Vector(Vector(163.0)), Vector(164.0, 165.0, 166.0), Vector(Vector(167.0))), s0(Vector(Vector(168.0)), Vector(Vector(169.0)), Vector(170.0, 171.0, 172.0), Vector(Vector(173.0)))), s0(Vector(Vector(174.0)), Vector(Vector(175.0)), Vector(176.0, 177.0, 178.0), Vector(Vector(179.0))), Vector(s0(Vector(Vector(180.0)), Vector(Vector(181.0)), Vector(182.0, 183.0, 184.0), Vector(Vector(185.0))))), Vector(Vector(s0(Vector(Vector(186.0)), Vector(Vector(187.0)), Vector(188.0, 189.0, 190.0), Vector(Vector(191.0)))), Vector(s0(Vector(Vector(192.0)), Vector(Vector(193.0)), Vector(194.0, 195.0, 196.0), Vector(Vector(197.0))))), Vector(s1(s0(Vector(Vector(198.0)), Vector(Vector(199.0)), Vector(200.0, 201.0, 202.0), Vector(Vector(203.0))), s0(Vector(Vector(204.0)), Vector(Vector(205.0)), Vector(206.0, 207.0, 208.0), Vector(Vector(209.0))), s0(Vector(Vector(210.0)), Vector(Vector(211.0)), Vector(212.0, 213.0, 214.0), Vector(Vector(215.0))), s0(Vector(Vector(216.0)), Vector(Vector(217.0)), Vector(218.0, 219.0, 220.0), Vector(Vector(221.0))), Vector(s0(Vector(Vector(222.0)), Vector(Vector(223.0)), Vector(224.0, 225.0, 226.0), Vector(Vector(227.0))), s0(Vector(Vector(228.0)), Vector(Vector(229.0)), Vector(230.0, 231.0, 232.0), Vector(Vector(233.0))), s0(Vector(Vector(234.0)), Vector(Vector(235.0)), Vector(236.0, 237.0, 238.0), Vector(Vector(239.0)))), s0(Vector(Vector(240.0)), Vector(Vector(241.0)), Vector(242.0, 243.0, 244.0), Vector(Vector(245.0))), Vector(s0(Vector(Vector(246.0)), Vector(Vector(247.0)), Vector(248.0, 249.0, 250.0), Vector(Vector(251.0)))))))))))
    val v1: Double = 252.0
    val start = nanoTime()
    var result: Double = 252.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}