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
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s2], v1: Vector[Vector[s1]], v2: s2, v3: Vector[s2], v4: Vector[Vector[s4]], v5: Vector[Vector[s1]], v6: Vector[s0], v7: Double): Double = {
    val v8: Double = v7 + v7
    val v10: Vector[s1] = v5(0)
    val v20: s1 = v10(0)
    val v17: s0 = v20.p1
    val v14: Double = v17.p1
    val v29: s0 = v6(1)
    val v47: Double = v8 * v14
    val v22: Vector[Vector[Double]] = v29.p0
    val v55: Vector[Double] = v22(2)
    val v45: Double = v55(0)
    val v84: Double = v14 / v7
    val v136: Vector[Double] = Vector(v45, v8, v84, v14, v47)
    val v262: Double = v136(3)
    v262
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), 3.0), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), 7.0)), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), 11.0), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), 15.0), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), 19.0))), s2(s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), 23.0), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), 27.0)), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), 31.0), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), 35.0), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), 39.0))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), 43.0), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), 47.0))))
    val v2: s2 = s2(s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), 51.0), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), 55.0)), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), 59.0), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), 63.0), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), 67.0)))
    val v3: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), 71.0), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), 75.0)), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), 79.0), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), 83.0), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), 87.0))), s2(s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), 91.0), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), 95.0)), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), 99.0), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), 103.0), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), 107.0))), s2(s1(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), 111.0), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), 115.0)), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), 119.0), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), 123.0), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), 127.0))))
    val v4: Vector[Vector[s4]] = Vector(Vector(s4(s2(s1(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), 131.0), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), 135.0)), Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), 139.0), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), 143.0), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), 147.0))), Vector(s1(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), 151.0), s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), 155.0))))))
    val v5: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), 159.0), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), 163.0))), Vector(s1(s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), 167.0), s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), 171.0))), Vector(s1(s0(Vector(Vector(172.0), Vector(173.0), Vector(174.0)), 175.0), s0(Vector(Vector(176.0), Vector(177.0), Vector(178.0)), 179.0))))
    val v6: Vector[s0] = Vector(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), 183.0), s0(Vector(Vector(184.0), Vector(185.0), Vector(186.0)), 187.0), s0(Vector(Vector(188.0), Vector(189.0), Vector(190.0)), 191.0))
    val v7: Double = 192.0
    val start = nanoTime()
    var result: Double = 192.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}