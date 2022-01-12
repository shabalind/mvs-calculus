import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: s1
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s6 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: s6, v1: s3, v2: Double): Double = {
    val v3: Vector[s1] = v0.p0
    val v9: s1 = v3(0)
    val v14: Vector[s2] = v0.p1
    val v48: s0 = v9.p0
    var v16: s0 = v48
    val v25: s2 = v14(0)
    val v29: Vector[s0] = v25.p0
    val v65: s0 = v29(0)
    val v70: Vector[Vector[Double]] = v65.p0
    val v78: Vector[Double] = v16.p1
    val v211: Double = v78(1)
    v16 = v16.copy(p0 = v70)
    v211
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0, 5.0)), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0, 11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0, 16.0, 17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0)))))), Vector(s2(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0)), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0, 35.0)), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0, 40.0, 41.0))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(45.0, 46.0, 47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0, 52.0, 53.0)))), s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0)), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0, 65.0))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(69.0, 70.0, 71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(75.0, 76.0, 77.0)))))), s2(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(81.0, 82.0, 83.0)), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(87.0, 88.0, 89.0)), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0, 95.0))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(99.0, 100.0, 101.0))), Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(105.0, 106.0, 107.0)))), s1(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(111.0, 112.0, 113.0)), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(117.0, 118.0, 119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(123.0, 124.0, 125.0))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(129.0, 130.0, 131.0))))))))
    val v1: s3 = s3(Vector(s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(135.0, 136.0, 137.0)), Vector(Vector(s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(141.0, 142.0, 143.0))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(147.0, 148.0, 149.0))), Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(153.0, 154.0, 155.0))))), s1(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(159.0, 160.0, 161.0)), Vector(Vector(s0(Vector(Vector(162.0), Vector(163.0), Vector(164.0)), Vector(165.0, 166.0, 167.0))), Vector(s0(Vector(Vector(168.0), Vector(169.0), Vector(170.0)), Vector(171.0, 172.0, 173.0))), Vector(s0(Vector(Vector(174.0), Vector(175.0), Vector(176.0)), Vector(177.0, 178.0, 179.0))))), s1(s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(183.0, 184.0, 185.0)), Vector(Vector(s0(Vector(Vector(186.0), Vector(187.0), Vector(188.0)), Vector(189.0, 190.0, 191.0))), Vector(s0(Vector(Vector(192.0), Vector(193.0), Vector(194.0)), Vector(195.0, 196.0, 197.0))), Vector(s0(Vector(Vector(198.0), Vector(199.0), Vector(200.0)), Vector(201.0, 202.0, 203.0)))))), Vector(s1(s0(Vector(Vector(204.0), Vector(205.0), Vector(206.0)), Vector(207.0, 208.0, 209.0)), Vector(Vector(s0(Vector(Vector(210.0), Vector(211.0), Vector(212.0)), Vector(213.0, 214.0, 215.0))), Vector(s0(Vector(Vector(216.0), Vector(217.0), Vector(218.0)), Vector(219.0, 220.0, 221.0))), Vector(s0(Vector(Vector(222.0), Vector(223.0), Vector(224.0)), Vector(225.0, 226.0, 227.0)))))))
    val v2: Double = 228.0
    val start = nanoTime()
    var result: Double = 228.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}