import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  case class s4 (
    p0: s1,
    p1: s0
  )
  case class s7 (
    p0: s3,
    p1: s4
  )
  case class s10 (
    p0: s2,
    p1: Vector[s7]
  )
  @noinline
  def f0(v0: s10, v1: Double): Double = {
    var v7: Double = v1
    var v17: Double = v1
    val v2: s2 = v0.p0
    var v16: Double = v1
    val v15: s1 = v2.p0
    val v24: Vector[s1] = Vector(v15)
    val v19: s1 = v24(0)
    val v27: s0 = v19.p1
    val v49: Vector[Double] = Vector(v16, v17)
    var v51: Vector[Double] = v49
    var v93: Double = v7
    v51 = v51.updated(0, v93)
    v51 = v51.updated(0, v17)
    val v55: Vector[Vector[Double]] = v27.p0
    val v37: Double = v49(0)
    val v81: Vector[Double] = v55(2)
    val v65: Double = v81(0)
    v51 = v49
    val v94: Double = v51(0)
    v51 = v51.updated(0, v1)
    v51 = v51.updated(1, v37)
    v51 = v51.updated(0, v65)
    v94
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0)), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0, 11.0)), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0, 16.0, 17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0)), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0)), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0, 35.0)))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0, 40.0, 41.0))), Vector(s7(s3(s1(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(45.0, 46.0, 47.0)), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0, 52.0, 53.0)), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0, 65.0)), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(69.0, 70.0, 71.0)), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(75.0, 76.0, 77.0)))), s2(s1(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(81.0, 82.0, 83.0)), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(87.0, 88.0, 89.0)), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0, 95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(99.0, 100.0, 101.0)), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(105.0, 106.0, 107.0)), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(111.0, 112.0, 113.0)))), s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(117.0, 118.0, 119.0)))), s4(s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(123.0, 124.0, 125.0)), s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(129.0, 130.0, 131.0)), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(135.0, 136.0, 137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(141.0, 142.0, 143.0)), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(147.0, 148.0, 149.0)), s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(153.0, 154.0, 155.0)))), s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(159.0, 160.0, 161.0)))), s7(s3(s1(Vector(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(165.0, 166.0, 167.0)), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(171.0, 172.0, 173.0)), s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(177.0, 178.0, 179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(183.0, 184.0, 185.0)), Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(189.0, 190.0, 191.0)), s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(195.0, 196.0, 197.0)))), s2(s1(Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(201.0, 202.0, 203.0)), s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(207.0, 208.0, 209.0)), s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(213.0, 214.0, 215.0))), s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(219.0, 220.0, 221.0)), Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(225.0, 226.0, 227.0)), s0(Vector(Vector(228.0), Vector(229.0), Vector(230.0)), Vector(231.0, 232.0, 233.0)))), s0(Vector(Vector(234.0), Vector(235.0), Vector(236.0)), Vector(237.0, 238.0, 239.0)))), s4(s1(Vector(s0(Vector(Vector(240.0), Vector(241.0), Vector(242.0)), Vector(243.0, 244.0, 245.0)), s0(Vector(Vector(246.0), Vector(247.0), Vector(248.0)), Vector(249.0, 250.0, 251.0)), s0(Vector(Vector(252.0), Vector(253.0), Vector(254.0)), Vector(255.0, 256.0, 257.0))), s0(Vector(Vector(258.0), Vector(259.0), Vector(260.0)), Vector(261.0, 262.0, 263.0)), Vector(s0(Vector(Vector(264.0), Vector(265.0), Vector(266.0)), Vector(267.0, 268.0, 269.0)), s0(Vector(Vector(270.0), Vector(271.0), Vector(272.0)), Vector(273.0, 274.0, 275.0)))), s0(Vector(Vector(276.0), Vector(277.0), Vector(278.0)), Vector(279.0, 280.0, 281.0))))))
    val v1: Double = 282.0
    val start = nanoTime()
    var result: Double = 282.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}