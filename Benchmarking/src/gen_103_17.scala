import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s8 (
    p0: s2,
    p1: Vector[s1]
  )
  def f15(v0: s0): s0 = {
    var v5: s0 = v0
    var v3: s0 = v0
    val v4: Vector[Vector[Double]] = v3.p1
    v5 = v5.copy(p1 = v4)
    var v7: s0 = v0
    var v6: Vector[Vector[Double]] = v4
    val v10: Vector[Vector[Double]] = v3.p1
    val v27: Vector[Vector[Double]] = v0.p1
    val v14: Vector[Vector[Double]] = v0.p1
    val v15: Vector[Vector[Double]] = v7.p1
    var v25: Vector[Vector[Double]] = v14
    val v22: Vector[Double] = v27(0)
    v7 = v7.copy(p1 = v10)
    val v54: Vector[Double] = v27(0)
    val v32: Vector[Vector[Double]] = v7.p0
    v6 = v6.updated(0, v22)
    v7 = v7.copy(p2 = v15)
    v7 = v7.copy(p2 = v4)
    val v86: Vector[Vector[Double]] = v5.p0
    val v42: Vector[Double] = v86(0)
    v25 = v25.updated(0, v54)
    val v47: s0 = s0(v32, v15, v14)
    v7 = v7.copy(p0 = v86)
    val v87: Vector[Vector[Double]] = v3.p1
    v6 = v6.updated(0, v42)
    v5 = v5.copy(p1 = v25)
    v3 = v3.copy(p1 = v6)
    v5 = v5.copy(p2 = v87)
    v47
  }
  @noinline
  def f0(v0: s8, v1: Double, v2: s8): Double = {
    val v5: s2 = v2.p0
    val v3: Vector[s0] = v5.p1
    val v7: s0 = v3(1)
    val v4: s0 = v3(1)
    val v11: s0 = f15(v7)
    val v23: Vector[Vector[Double]] = v11.p0
    val v18: Vector[Double] = v23(1)
    val v32: Double = v1 / v1
    val v40: Vector[Vector[Double]] = v4.p2
    val v25: Double = v18(0)
    val v77: Vector[Double] = v40(0)
    val v78: Double = v77(0)
    val v86: Double = v32 / v25
    val v135: Double = v78 * v86
    v135
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0)), Vector(Vector(31.0))))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0)), Vector(Vector(35.0))))))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0))))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0)), Vector(Vector(55.0)))))))
    val v1: Double = 56.0
    val v2: s8 = s8(s2(Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)), Vector(Vector(60.0)))), Vector(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0)), Vector(Vector(64.0))))), Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0)), Vector(Vector(68.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)), Vector(Vector(72.0)))), Vector(s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0)), Vector(Vector(76.0))))), Vector(s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0)), Vector(Vector(80.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)), Vector(Vector(84.0)))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0))))), Vector(s0(Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0)), Vector(Vector(92.0))))))), Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)), Vector(Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0)), Vector(Vector(100.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0)), Vector(Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)), Vector(Vector(108.0))))), Vector(s0(Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0)), Vector(Vector(112.0)))))))
    val start = nanoTime()
    var result: Double = StructValue(Name(str='s8', ty=None), [StructValue(Name(str='s2', ty=None), [[[StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[57.0], [58.0]], [[59.0]], [[60.0]]])], [StructValue(Name(str='s0', ty=None), [[[61.0], [62.0]], [[63.0]], [[64.0]]])]], [StructValue(Name(str='s0', ty=None), [[[65.0], [66.0]], [[67.0]], [[68.0]]])]])], [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[69.0], [70.0]], [[71.0]], [[72.0]]])], [StructValue(Name(str='s0', ty=None), [[[73.0], [74.0]], [[75.0]], [[76.0]]])]], [StructValue(Name(str='s0', ty=None), [[[77.0], [78.0]], [[79.0]], [[80.0]]])]])], [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[81.0], [82.0]], [[83.0]], [[84.0]]])], [StructValue(Name(str='s0', ty=None), [[[85.0], [86.0]], [[87.0]], [[88.0]]])]], [StructValue(Name(str='s0', ty=None), [[[89.0], [90.0]], [[91.0]], [[92.0]]])]])]], [StructValue(Name(str='s0', ty=None), [[[93.0], [94.0]], [[95.0]], [[96.0]]]), StructValue(Name(str='s0', ty=None), [[[97.0], [98.0]], [[99.0]], [[100.0]]])]]), [StructValue(Name(str='s1', ty=None), [[[StructValue(Name(str='s0', ty=None), [[[101.0], [102.0]], [[103.0]], [[104.0]]])], [StructValue(Name(str='s0', ty=None), [[[105.0], [106.0]], [[107.0]], [[108.0]]])]], [StructValue(Name(str='s0', ty=None), [[[109.0], [110.0]], [[111.0]], [[112.0]]])]])]])
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}