import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s7 (
    p0: s1,
    p1: Vector[s2]
  )
  case class s8 (
    p0: s0,
    p1: s2,
    p2: Vector[Vector[s7]],
    p3: Vector[Vector[s0]],
    p4: Vector[s7]
  )
  def f60(v0: s2): s2 = {
    val v4: s0 = v0.p1
    var v1: s0 = v4
    var v7: s2 = v0
    v7 = v7.copy(p0 = v1)
    var v3: s0 = v1
    val v6: s0 = v0.p1
    var v10: s2 = v7
    v10 = v10.copy(p0 = v3)
    val v9: s0 = v10.p0
    val v14: s0 = v7.p1
    var v17: s2 = v0
    v10 = v10.copy(p0 = v4)
    val v2: s0 = v7.p1
    val v20: s0 = v10.p1
    var v16: s0 = v9
    val v23: s0 = v7.p0
    val v30: s0 = v17.p0
    v7 = v7.copy(p0 = v23)
    val v12: Vector[Vector[Double]] = v3.p1
    val v35: s0 = v7.p0
    v10 = v10.copy(p0 = v30)
    val v28: Vector[Vector[Double]] = v2.p1
    v17 = v17.copy(p1 = v6)
    var v18: s0 = v16
    v18 = v18.copy(p1 = v12)
    v10 = v17
    val v80: s0 = v17.p0
    var v52: s0 = v30
    v7 = v7.copy(p0 = v35)
    val v64: s2 = s2(v4, v80)
    var v31: s2 = v64
    v1 = v1.copy(p1 = v28)
    val v44: Vector[Vector[Double]] = v52.p0
    v17 = v17.copy(p1 = v52)
    v10 = v10.copy(p0 = v23)
    v3 = v3.copy(p0 = v44)
    v52 = v35
    v7 = v7.copy(p0 = v16)
    v10 = v10.copy(p0 = v20)
    v10 = v10.copy(p0 = v18)
    v3 = v16
    v7 = v7.copy(p1 = v14)
    val v271: Vector[Vector[Double]] = v52.p0
    v16 = v16.copy(p0 = v271)
    v31
  }
  def f31(v0: s2): s2 = {
    val v1: s2 = f60(v0)
    val v7: s2 = f60(v0)
    val v14: s2 = f60(v1)
    val v18: Vector[s2] = Vector(v1, v7, v14)
    val v29: s2 = v18(1)
    v29
  }
  def f28(v0: s2): s2 = {
    var v5: s2 = v0
    var v3: s2 = v5
    var v32: s2 = v3
    val v73: s2 = f31(v32)
    v73
  }
  def f1(v0: s8): s8 = {
    var v2: s8 = v0
    val v6: s2 = v0.p1
    var v4: s8 = v2
    v2 = v2.copy(p1 = v6)
    val v8: s2 = f31(v6)
    v2 = v2.copy(p1 = v8)
    v4 = v4.copy(p1 = v8)
    var v9: s8 = v4
    var v10: s8 = v4
    val v16: s2 = f28(v6)
    var v30: s8 = v4
    var v12: s2 = v16
    v30 = v0
    v30 = v10
    val v61: s0 = v6.p1
    val v53: Vector[Vector[s7]] = v9.p2
    v30 = v30.copy(p1 = v12)
    v30 = v30.copy(p2 = v53)
    v30 = v30.copy(p2 = v53)
    v2 = v2.copy(p0 = v61)
    v30
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v7: s8 = f1(v0)
    val v6: Vector[s7] = v7.p4
    val v11: s7 = v6(1)
    val v18: Vector[s2] = v11.p1
    val v17: s2 = v18(0)
    var v34: s2 = v17
    val v26: s2 = f28(v34)
    val v43: s0 = v26.p1
    val v45: Vector[Vector[Double]] = v43.p0
    var v46: Vector[Vector[Double]] = v45
    val v56: Vector[Double] = v46(1)
    v46 = v45
    v46 = v46.updated(0, v56)
    val v96: Double = v56(0)
    v96
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s2(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(Vector(s7(s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))), Vector(s2(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), s2(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), Vector(s7(s1(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))), Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))))), Vector(s2(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s2(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))), s7(s1(Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), Vector(s2(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0)))), s2(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}