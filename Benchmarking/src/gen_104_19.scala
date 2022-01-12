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
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double, v2: Vector[s0], v3: Vector[s1], v4: s3, v5: s2, v6: Vector[s1]): Double = {
    val v30: Double = v1 * v1
    val v16: s0 = v2(1)
    val v19: Vector[Vector[Double]] = v16.p1
    val v37: Vector[Double] = v19(0)
    val v36: Double = v37(0)
    val v17: Vector[Vector[Double]] = v16.p1
    val v39: Vector[Double] = v17(1)
    val v47: Double = v39(0)
    val v67: Double = v36 / v30
    var v161: Double = v47
    val v147: Double = v161 + v67
    v147
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s2(s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s2(s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))
    val v1: Double = 48.0
    val v2: Vector[s0] = Vector(s0(Vector(Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0))), s0(Vector(Vector(53.0)), Vector(Vector(54.0), Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0))))
    val v3: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), Vector(Vector(s0(Vector(Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)))), Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)))))))
    val v4: s3 = s3(s2(s1(Vector(s0(Vector(Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)))), Vector(Vector(s0(Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0)))), Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))))), s0(Vector(Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)))), s0(Vector(Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0))))
    val v5: s2 = s2(s1(Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)))), Vector(Vector(s0(Vector(Vector(97.0)), Vector(Vector(98.0), Vector(99.0), Vector(100.0)))), Vector(s0(Vector(Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0))))
    val v6: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0)))), Vector(Vector(s0(Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)))), Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0)))))), s1(Vector(s0(Vector(Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)))), Vector(Vector(s0(Vector(Vector(125.0)), Vector(Vector(126.0), Vector(127.0), Vector(128.0)))), Vector(s0(Vector(Vector(129.0)), Vector(Vector(130.0), Vector(131.0), Vector(132.0)))))))
    val start = nanoTime()
    var result: Double = [StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[109.0]], [[110.0], [111.0], [112.0]]])], [[StructValue(Name(str='s0', ty=None), [[[113.0]], [[114.0], [115.0], [116.0]]])], [StructValue(Name(str='s0', ty=None), [[[117.0]], [[118.0], [119.0], [120.0]]])]]]), StructValue(Name(str='s1', ty=None), [[StructValue(Name(str='s0', ty=None), [[[121.0]], [[122.0], [123.0], [124.0]]])], [[StructValue(Name(str='s0', ty=None), [[[125.0]], [[126.0], [127.0], [128.0]]])], [StructValue(Name(str='s0', ty=None), [[[129.0]], [[130.0], [131.0], [132.0]]])]]])]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}