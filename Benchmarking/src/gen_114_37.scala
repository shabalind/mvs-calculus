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
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s4 (
    p0: Vector[s0],
    p1: s2
  )
  case class s5 (
    p0: s2,
    p1: Vector[s0]
  )
  def f32(v0: Vector[s1], v1: s4): s4 = {
    val v6: s2 = v1.p1
    val v15: s2 = v1.p1
    val v30: Vector[Vector[s0]] = v6.p0
    val v72: Vector[s0] = v30(0)
    val v150: s4 = s4(v72, v15)
    v150
  }
  @noinline
  def f0(v0: s4, v1: s5, v2: s3, v3: s4, v4: Double, v5: Vector[Vector[s1]]): Double = {
    val v8: s2 = v3.p1
    var v10: s4 = v3
    val v13: s0 = v8.p1
    val v16: Vector[s1] = v5(1)
    val v26: Vector[Vector[Double]] = v13.p1
    val v27: s4 = f32(v16, v10)
    val v20: Vector[Double] = v26(0)
    val v44: s2 = v27.p1
    val v60: Vector[Vector[s0]] = v44.p0
    val v50: Vector[s0] = v60(0)
    val v51: Double = v20(0)
    v10 = v10.copy(p1 = v8)
    val v49: s0 = v50(0)
    val v41: Vector[Vector[Double]] = v49.p1
    val v43: Vector[Double] = v41(0)
    val v114: Double = v43(0)
    val v148: Double = v51 + v114
    v148
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), s2(Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
    val v1: s5 = s5(s2(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))))
    val v2: s3 = s3(s2(Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s1(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))
    val v3: s4 = s4(Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), s2(Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))))
    val v4: Double = 64.0
    val v5: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))), Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0)))), Vector(s0(Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0))))), s0(Vector(Vector(77.0), Vector(78.0), Vector(79.0)), Vector(Vector(80.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0)))), Vector(s0(Vector(Vector(89.0), Vector(90.0), Vector(91.0)), Vector(Vector(92.0))))), s0(Vector(Vector(93.0), Vector(94.0), Vector(95.0)), Vector(Vector(96.0))))))
    val start = nanoTime()
    var result: Double = [[StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[65.0], [66.0], [67.0]], [[68.0]]])], [StructValue(Name(str='s0', ty=None), [[[69.0], [70.0], [71.0]], [[72.0]]])], [StructValue(Name(str='s0', ty=None), [[[73.0], [74.0], [75.0]], [[76.0]]])]], StructValue(Name(str='s0', ty=None), [[[77.0], [78.0], [79.0]], [[80.0]]])])], [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[81.0], [82.0], [83.0]], [[84.0]]])], [StructValue(Name(str='s0', ty=None), [[[85.0], [86.0], [87.0]], [[88.0]]])], [StructValue(Name(str='s0', ty=None), [[[89.0], [90.0], [91.0]], [[92.0]]])]], StructValue(Name(str='s0', ty=None), [[[93.0], [94.0], [95.0]], [[96.0]]])])]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}