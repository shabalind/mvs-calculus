import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s4, v1: Vector[s2], v2: Double): Double = {
    val v3: s2 = v1(2)
    val v4: s1 = v3.p1
    val v11: Vector[s0] = v4.p0
    val v35: Double = v2 / v2
    val v29: Double = v35 + v2
    val v28: s0 = v11(0)
    val v30: Vector[Vector[Double]] = v28.p1
    val v62: Vector[Double] = v30(1)
    val v39: Double = v62(0)
    val v142: Double = v29 + v39
    val v119: s0 = v11(0)
    val v116: Vector[Double] = v119.p0
    val v101: Double = v116(1)
    val v202: Double = v101 + v142
    v202
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s1(Vector(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), Vector(s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))
    val v1: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(Vector(s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(54.0, 55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))), s1(Vector(s0(Vector(66.0, 67.0, 68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0), Vector(76.0), Vector(77.0))), Vector(Vector(s0(Vector(78.0, 79.0, 80.0), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(90.0, 91.0, 92.0), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))))), s2(s1(Vector(s0(Vector(96.0, 97.0, 98.0), Vector(Vector(99.0), Vector(100.0), Vector(101.0)))), s0(Vector(102.0, 103.0, 104.0), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), Vector(Vector(s0(Vector(108.0, 109.0, 110.0), Vector(Vector(111.0), Vector(112.0), Vector(113.0)))), Vector(s0(Vector(114.0, 115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(120.0, 121.0, 122.0), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))))), s1(Vector(s0(Vector(126.0, 127.0, 128.0), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), s0(Vector(132.0, 133.0, 134.0), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), Vector(Vector(s0(Vector(138.0, 139.0, 140.0), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), Vector(s0(Vector(144.0, 145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))), Vector(s0(Vector(150.0, 151.0, 152.0), Vector(Vector(153.0), Vector(154.0), Vector(155.0))))))), s2(s1(Vector(s0(Vector(156.0, 157.0, 158.0), Vector(Vector(159.0), Vector(160.0), Vector(161.0)))), s0(Vector(162.0, 163.0, 164.0), Vector(Vector(165.0), Vector(166.0), Vector(167.0))), Vector(Vector(s0(Vector(168.0, 169.0, 170.0), Vector(Vector(171.0), Vector(172.0), Vector(173.0)))), Vector(s0(Vector(174.0, 175.0, 176.0), Vector(Vector(177.0), Vector(178.0), Vector(179.0)))), Vector(s0(Vector(180.0, 181.0, 182.0), Vector(Vector(183.0), Vector(184.0), Vector(185.0)))))), s1(Vector(s0(Vector(186.0, 187.0, 188.0), Vector(Vector(189.0), Vector(190.0), Vector(191.0)))), s0(Vector(192.0, 193.0, 194.0), Vector(Vector(195.0), Vector(196.0), Vector(197.0))), Vector(Vector(s0(Vector(198.0, 199.0, 200.0), Vector(Vector(201.0), Vector(202.0), Vector(203.0)))), Vector(s0(Vector(204.0, 205.0, 206.0), Vector(Vector(207.0), Vector(208.0), Vector(209.0)))), Vector(s0(Vector(210.0, 211.0, 212.0), Vector(Vector(213.0), Vector(214.0), Vector(215.0))))))))
    val v2: Double = 216.0
    val start = nanoTime()
    var result: Double = 216.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}