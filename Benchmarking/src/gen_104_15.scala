import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s4]], v2: Double): Double = {
    var v7: Double = v2
    val v9: Vector[s0] = v0.p1
    val v5: s0 = v9(0)
    val v12: Double = v7 + v7
    val v16: Double = v12 * v7
    var v19: Double = v12
    v19 = v16
    val v42: Vector[Vector[Double]] = v5.p1
    val v29: Vector[Double] = v42(0)
    val v36: Double = v7 / v19
    var v111: Vector[Double] = v29
    val v78: Double = v111(0)
    v111 = v111.updated(0, v16)
    v111 = v111.updated(0, v36)
    v78
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))), Vector(s1(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))), Vector(s1(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))), Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))))), Vector(s1(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))))))), Vector(s1(Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0)))), Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)))))))), Vector(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0))))), Vector(s1(Vector(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), Vector(Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0))))))))))
    val v2: Double = 148.0
    val start = nanoTime()
    var result: Double = 148.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}