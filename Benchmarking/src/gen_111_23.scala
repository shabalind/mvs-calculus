import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(0)
    val v3: Vector[s1] = v7.p1
    val v5: s1 = v3(2)
    var v10: s1 = v5
    val v8: s0 = v10.p1
    v10 = v10.copy(p1 = v8)
    var v16: s0 = v8
    val v9: Vector[Vector[Double]] = v16.p1
    val v24: Vector[Double] = v9(0)
    v10 = v10.copy(p1 = v8)
    val v43: Double = v24(0)
    v43
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), s2(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s1(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))))), s2(s1(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s1(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))), s1(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))))))
    val v1: Double = 144.0
    val start = nanoTime()
    var result: Double = 144.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}