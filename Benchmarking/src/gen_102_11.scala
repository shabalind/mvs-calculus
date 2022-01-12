import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s3,
    p1: s2
  )
  case class s6 (
    p0: s1
  )
  case class s8 (
    p0: Vector[s1],
    p1: Vector[s1],
    p2: s2,
    p3: Vector[Vector[s2]],
    p4: s2,
    p5: s6,
    p6: Double
  )
  def f88(v0: s2): s2 = {
    var v3: s2 = v0
    var v5: s2 = v3
    val v2: Vector[s2] = Vector(v3, v3)
    val v6: Vector[s2] = Vector(v5, v0, v5, v3, v5, v0, v0)
    v5 = v0
    var v1: Vector[s2] = v6
    var v8: Vector[s2] = v6
    val v7: Vector[s0] = v3.p0
    val v14: s0 = v5.p1
    v8 = v8.updated(5, v5)
    var v11: s2 = v5
    val v10: Double = v14.p0
    val v9: s2 = v2(1)
    val v12: s0 = v7(1)
    val v13: Vector[Vector[Double]] = v14.p1
    val v19: s0 = s0(v10, v13)
    v8 = v8.updated(2, v0)
    v1 = v1.updated(0, v11)
    v8 = v8.updated(4, v3)
    val v25: s2 = v6(0)
    val v17: Vector[s0] = v9.p0
    v1 = v1.updated(4, v0)
    v5 = v5.copy(p0 = v17)
    val v24: s2 = s2(v7, v14)
    v11 = v11.copy(p0 = v7)
    v8 = v8.updated(5, v25)
    var v22: s2 = v24
    v3 = v3.copy(p0 = v17)
    var v21: Vector[s2] = v1
    val v50: Vector[s0] = v24.p0
    val v54: s2 = v8(1)
    var v37: s2 = v54
    val v67: s0 = v50(1)
    val v49: Vector[s0] = v3.p0
    var v53: Vector[s2] = v8
    v3 = v3.copy(p1 = v12)
    v3 = v3.copy(p1 = v19)
    var v31: s2 = v22
    v31 = v31.copy(p0 = v49)
    v37 = v37.copy(p0 = v50)
    v21 = v53
    v3 = v3.copy(p0 = v50)
    val v70: s2 = v21(0)
    v11 = v11.copy(p0 = v50)
    v8 = v8.updated(2, v31)
    v53 = v53.updated(4, v37)
    v8 = v8.updated(2, v70)
    v11 = v11.copy(p1 = v67)
    val v142: Vector[s0] = v5.p0
    v3 = v3.copy(p0 = v142)
    v37
  }
  def f36(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    var v2: s0 = v0
    val v11: Double = v2.p0
    val v7: s0 = s0(v11, v6)
    val v8: Vector[Vector[Double]] = v7.p1
    var v3: s0 = v2
    v2 = v2.copy(p1 = v8)
    val v22: Vector[s0] = Vector(v3, v2, v2, v2)
    val v16: s0 = v22(3)
    v16
  }
  def f15(v0: s0, v1: s4): s0 = {
    val v4: s0 = f36(v0)
    val v2: s0 = f36(v4)
    var v8: s0 = v2
    v8 = v2
    v8
  }
  def f1(v0: s2): s2 = {
    var v5: s2 = v0
    val v11: s2 = f88(v5)
    val v38: s2 = f88(v11)
    v38
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s8], v2: Double): Double = {
    val v7: s4 = v0(0)
    val v18: s4 = v0(0)
    val v11: s2 = v7.p1
    val v13: s2 = f88(v11)
    val v14: s2 = f1(v13)
    val v23: s2 = f88(v14)
    val v41: Vector[s0] = v23.p0
    val v45: s0 = v41(1)
    val v24: s0 = f15(v45, v18)
    val v46: Vector[Vector[Double]] = v24.p1
    val v58: Vector[Double] = v46(0)
    val v88: Double = v58(0)
    v88
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s3(s1(s0(0.0, Vector(Vector(1.0))), s0(2.0, Vector(Vector(3.0)))), Vector(s1(s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))))), s2(Vector(s0(8.0, Vector(Vector(9.0))), s0(10.0, Vector(Vector(11.0)))), s0(12.0, Vector(Vector(13.0))))), s4(s3(s1(s0(14.0, Vector(Vector(15.0))), s0(16.0, Vector(Vector(17.0)))), Vector(s1(s0(18.0, Vector(Vector(19.0))), s0(20.0, Vector(Vector(21.0)))))), s2(Vector(s0(22.0, Vector(Vector(23.0))), s0(24.0, Vector(Vector(25.0)))), s0(26.0, Vector(Vector(27.0))))))
    val v1: Vector[s8] = Vector(s8(Vector(s1(s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0)))), s1(s0(32.0, Vector(Vector(33.0))), s0(34.0, Vector(Vector(35.0))))), Vector(s1(s0(36.0, Vector(Vector(37.0))), s0(38.0, Vector(Vector(39.0)))), s1(s0(40.0, Vector(Vector(41.0))), s0(42.0, Vector(Vector(43.0))))), s2(Vector(s0(44.0, Vector(Vector(45.0))), s0(46.0, Vector(Vector(47.0)))), s0(48.0, Vector(Vector(49.0)))), Vector(Vector(s2(Vector(s0(50.0, Vector(Vector(51.0))), s0(52.0, Vector(Vector(53.0)))), s0(54.0, Vector(Vector(55.0))))), Vector(s2(Vector(s0(56.0, Vector(Vector(57.0))), s0(58.0, Vector(Vector(59.0)))), s0(60.0, Vector(Vector(61.0))))), Vector(s2(Vector(s0(62.0, Vector(Vector(63.0))), s0(64.0, Vector(Vector(65.0)))), s0(66.0, Vector(Vector(67.0)))))), s2(Vector(s0(68.0, Vector(Vector(69.0))), s0(70.0, Vector(Vector(71.0)))), s0(72.0, Vector(Vector(73.0)))), s6(s1(s0(74.0, Vector(Vector(75.0))), s0(76.0, Vector(Vector(77.0))))), 78.0), s8(Vector(s1(s0(79.0, Vector(Vector(80.0))), s0(81.0, Vector(Vector(82.0)))), s1(s0(83.0, Vector(Vector(84.0))), s0(85.0, Vector(Vector(86.0))))), Vector(s1(s0(87.0, Vector(Vector(88.0))), s0(89.0, Vector(Vector(90.0)))), s1(s0(91.0, Vector(Vector(92.0))), s0(93.0, Vector(Vector(94.0))))), s2(Vector(s0(95.0, Vector(Vector(96.0))), s0(97.0, Vector(Vector(98.0)))), s0(99.0, Vector(Vector(100.0)))), Vector(Vector(s2(Vector(s0(101.0, Vector(Vector(102.0))), s0(103.0, Vector(Vector(104.0)))), s0(105.0, Vector(Vector(106.0))))), Vector(s2(Vector(s0(107.0, Vector(Vector(108.0))), s0(109.0, Vector(Vector(110.0)))), s0(111.0, Vector(Vector(112.0))))), Vector(s2(Vector(s0(113.0, Vector(Vector(114.0))), s0(115.0, Vector(Vector(116.0)))), s0(117.0, Vector(Vector(118.0)))))), s2(Vector(s0(119.0, Vector(Vector(120.0))), s0(121.0, Vector(Vector(122.0)))), s0(123.0, Vector(Vector(124.0)))), s6(s1(s0(125.0, Vector(Vector(126.0))), s0(127.0, Vector(Vector(128.0))))), 129.0))
    val v2: Double = 130.0
    val start = nanoTime()
    var result: Double = 130.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}