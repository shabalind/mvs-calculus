import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1],
    p2: Vector[Vector[s1]],
    p3: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s6]], v2: Double): Double = {
    val v7: Vector[s6] = v1(0)
    val v8: s6 = v7(0)
    val v21: s0 = v8.p1
    val v44: Vector[Vector[Double]] = v21.p1
    val v40: Vector[Double] = v44(0)
    var v96: Vector[Vector[Double]] = v44
    var v125: Vector[Vector[Double]] = v96
    v96 = v96.updated(0, v40)
    var v146: Vector[Vector[Double]] = v125
    val v117: Vector[Double] = v146(0)
    var v106: Vector[Double] = v40
    v146 = v146.updated(0, v106)
    var v126: Vector[Double] = v117
    val v201: Double = v126(0)
    v201
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(s1(Vector(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0))), s0(Vector(4.0, 5.0, 6.0), Vector(Vector(7.0))), s0(Vector(8.0, 9.0, 10.0), Vector(Vector(11.0)))), s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0)))), s1(Vector(s0(Vector(16.0, 17.0, 18.0), Vector(Vector(19.0))), s0(Vector(20.0, 21.0, 22.0), Vector(Vector(23.0))), s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0)))), s0(Vector(28.0, 29.0, 30.0), Vector(Vector(31.0)))), s1(Vector(s0(Vector(32.0, 33.0, 34.0), Vector(Vector(35.0))), s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0))), s0(Vector(40.0, 41.0, 42.0), Vector(Vector(43.0)))), s0(Vector(44.0, 45.0, 46.0), Vector(Vector(47.0))))), Vector(s1(Vector(s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0))), s0(Vector(52.0, 53.0, 54.0), Vector(Vector(55.0))), s0(Vector(56.0, 57.0, 58.0), Vector(Vector(59.0)))), s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0)))), s1(Vector(s0(Vector(64.0, 65.0, 66.0), Vector(Vector(67.0))), s0(Vector(68.0, 69.0, 70.0), Vector(Vector(71.0))), s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0)))), s0(Vector(76.0, 77.0, 78.0), Vector(Vector(79.0))))), Vector(Vector(s1(Vector(s0(Vector(80.0, 81.0, 82.0), Vector(Vector(83.0))), s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0))), s0(Vector(88.0, 89.0, 90.0), Vector(Vector(91.0)))), s0(Vector(92.0, 93.0, 94.0), Vector(Vector(95.0))))), Vector(s1(Vector(s0(Vector(96.0, 97.0, 98.0), Vector(Vector(99.0))), s0(Vector(100.0, 101.0, 102.0), Vector(Vector(103.0))), s0(Vector(104.0, 105.0, 106.0), Vector(Vector(107.0)))), s0(Vector(108.0, 109.0, 110.0), Vector(Vector(111.0))))), Vector(s1(Vector(s0(Vector(112.0, 113.0, 114.0), Vector(Vector(115.0))), s0(Vector(116.0, 117.0, 118.0), Vector(Vector(119.0))), s0(Vector(120.0, 121.0, 122.0), Vector(Vector(123.0)))), s0(Vector(124.0, 125.0, 126.0), Vector(Vector(127.0)))))), s1(Vector(s0(Vector(128.0, 129.0, 130.0), Vector(Vector(131.0))), s0(Vector(132.0, 133.0, 134.0), Vector(Vector(135.0))), s0(Vector(136.0, 137.0, 138.0), Vector(Vector(139.0)))), s0(Vector(140.0, 141.0, 142.0), Vector(Vector(143.0)))))), Vector(s0(Vector(144.0, 145.0, 146.0), Vector(Vector(147.0)))))
    val v1: Vector[Vector[s6]] = Vector(Vector(s6(Vector(Vector(s1(Vector(s0(Vector(148.0, 149.0, 150.0), Vector(Vector(151.0))), s0(Vector(152.0, 153.0, 154.0), Vector(Vector(155.0))), s0(Vector(156.0, 157.0, 158.0), Vector(Vector(159.0)))), s0(Vector(160.0, 161.0, 162.0), Vector(Vector(163.0))))), Vector(s1(Vector(s0(Vector(164.0, 165.0, 166.0), Vector(Vector(167.0))), s0(Vector(168.0, 169.0, 170.0), Vector(Vector(171.0))), s0(Vector(172.0, 173.0, 174.0), Vector(Vector(175.0)))), s0(Vector(176.0, 177.0, 178.0), Vector(Vector(179.0)))))), s0(Vector(180.0, 181.0, 182.0), Vector(Vector(183.0))))), Vector(s6(Vector(Vector(s1(Vector(s0(Vector(184.0, 185.0, 186.0), Vector(Vector(187.0))), s0(Vector(188.0, 189.0, 190.0), Vector(Vector(191.0))), s0(Vector(192.0, 193.0, 194.0), Vector(Vector(195.0)))), s0(Vector(196.0, 197.0, 198.0), Vector(Vector(199.0))))), Vector(s1(Vector(s0(Vector(200.0, 201.0, 202.0), Vector(Vector(203.0))), s0(Vector(204.0, 205.0, 206.0), Vector(Vector(207.0))), s0(Vector(208.0, 209.0, 210.0), Vector(Vector(211.0)))), s0(Vector(212.0, 213.0, 214.0), Vector(Vector(215.0)))))), s0(Vector(216.0, 217.0, 218.0), Vector(Vector(219.0))))), Vector(s6(Vector(Vector(s1(Vector(s0(Vector(220.0, 221.0, 222.0), Vector(Vector(223.0))), s0(Vector(224.0, 225.0, 226.0), Vector(Vector(227.0))), s0(Vector(228.0, 229.0, 230.0), Vector(Vector(231.0)))), s0(Vector(232.0, 233.0, 234.0), Vector(Vector(235.0))))), Vector(s1(Vector(s0(Vector(236.0, 237.0, 238.0), Vector(Vector(239.0))), s0(Vector(240.0, 241.0, 242.0), Vector(Vector(243.0))), s0(Vector(244.0, 245.0, 246.0), Vector(Vector(247.0)))), s0(Vector(248.0, 249.0, 250.0), Vector(Vector(251.0)))))), s0(Vector(252.0, 253.0, 254.0), Vector(Vector(255.0))))))
    val v2: Double = 256.0
    val start = nanoTime()
    var result: Double = 256.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}