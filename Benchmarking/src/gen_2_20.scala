import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  @noinline
  def f0(v0: Double, v1: Vector[s2], v2: s2): Double = {
    var v4: Double = v0
    v4 = v0
    val v16: Vector[s0] = v2.p0
    val v23: s0 = v16(2)
    val v28: Vector[Vector[Double]] = v23.p0
    var v26: Double = v0
    val v68: Double = v4 - v26
    val v77: Vector[Double] = v28(1)
    val v163: Double = v77(0)
    v26 = v68
    val v122: Double = v163 - v68
    v122
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0))), s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0))))), s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s2(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0))), s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), s1(Vector(Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)))), Vector(s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0))))), s2(Vector(s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0)))), s1(Vector(Vector(s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0)))), Vector(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0))))), s0(Vector(Vector(101.0), Vector(102.0), Vector(103.0)), Vector(Vector(104.0), Vector(105.0))))))
    val v2: s2 = s2(Vector(s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0), Vector(120.0)))), s1(Vector(Vector(s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0)))), Vector(s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0)))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s2', ty=None), [[StructValue(Name(str='s0', ty=None), [[[106.0], [107.0], [108.0]], [[109.0], [110.0]]]), StructValue(Name(str='s0', ty=None), [[[111.0], [112.0], [113.0]], [[114.0], [115.0]]]), StructValue(Name(str='s0', ty=None), [[[116.0], [117.0], [118.0]], [[119.0], [120.0]]])], StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[121.0], [122.0], [123.0]], [[124.0], [125.0]]])], [StructValue(Name(str='s0', ty=None), [[[126.0], [127.0], [128.0]], [[129.0], [130.0]]])], [StructValue(Name(str='s0', ty=None), [[[131.0], [132.0], [133.0]], [[134.0], [135.0]]])]], StructValue(Name(str='s0', ty=None), [[[136.0], [137.0], [138.0]], [[139.0], [140.0]]])])])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}