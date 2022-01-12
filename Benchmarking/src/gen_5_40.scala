import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double,
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]],
    p6: Vector[Vector[Double]],
    p7: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f84(v0: s1): s1 = {
    var v5: s1 = v0
    val v7: Vector[s0] = v5.p0
    var v4: s1 = v0
    val v12: s0 = v5.p1
    var v3: s0 = v12
    val v11: s0 = v0.p1
    val v2: s0 = v7(1)
    val v8: Vector[s0] = v4.p0
    val v16: s0 = v4.p1
    var v10: s1 = v4
    var v25: s0 = v16
    var v20: s1 = v5
    val v14: Vector[s0] = v4.p0
    val v18: Vector[s0] = v20.p0
    val v13: s1 = s1(v18, v25)
    val v26: Vector[Vector[Double]] = v25.p4
    v4 = v4.copy(p1 = v2)
    var v29: Vector[Vector[Double]] = v26
    val v23: Vector[Vector[Double]] = v3.p4
    var v37: s1 = v4
    val v45: s0 = v10.p1
    var v28: Vector[Vector[Double]] = v23
    v10 = v10.copy(p1 = v11)
    v10 = v10.copy(p0 = v8)
    val v55: s0 = v0.p1
    v5 = v5.copy(p1 = v45)
    val v60: s0 = v14(1)
    v3 = v3.copy(p4 = v29)
    val v31: s0 = v13.p1
    val v39: Vector[s1] = Vector(v4, v0, v13, v37, v20, v13, v10)
    v37 = v37.copy(p1 = v55)
    val v63: s1 = v39(0)
    v4 = v4.copy(p0 = v7)
    v25 = v25.copy(p4 = v28)
    val v83: Vector[Double] = v23(0)
    val v64: Vector[s1] = Vector(v13, v0, v63, v10)
    var v163: Vector[s1] = v64
    v163 = v163.updated(3, v37)
    v37 = v37.copy(p1 = v31)
    v3 = v3.copy(p6 = v23)
    v4 = v4.copy(p0 = v8)
    val v96: s1 = v39(2)
    val v178: s1 = v163(3)
    v28 = v28.updated(0, v83)
    v10 = v10.copy(p1 = v60)
    v163 = v163.updated(0, v96)
    v178
  }
  def f79(v0: Vector[Double]): Vector[Double] = {
    var v5: Vector[Double] = v0
    var v6: Vector[Double] = v0
    val v4: Double = v5(0)
    var v3: Double = v4
    var v9: Double = v4
    var v1: Double = v3
    val v2: Double = v0(0)
    val v10: Double = v6(0)
    v5 = v5.updated(0, v2)
    v6 = v6.updated(0, v9)
    var v14: Vector[Double] = v5
    val v17: Double = v5(0)
    val v30: Double = v5(0)
    v5 = v5.updated(0, v9)
    var v12: Vector[Double] = v6
    v12 = v6
    v12 = v12.updated(0, v2)
    var v16: Vector[Double] = v14
    val v20: Double = v12(0)
    v16 = v16.updated(0, v1)
    val v35: Double = v6(0)
    val v13: Vector[Double] = Vector(v9, v9, v4, v35, v10, v30, v35)
    v16 = v16.updated(0, v17)
    var v47: Vector[Double] = v13
    val v22: Double = v47(4)
    val v42: Double = v47(3)
    v6 = v6.updated(0, v22)
    var v50: Vector[Double] = v16
    v50 = v6
    v6 = v6.updated(0, v42)
    v47 = v47.updated(3, v20)
    v50
  }
  def f70(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p6
    val v4: Vector[Double] = v5(0)
    var v12: s0 = v0
    val v6: Vector[Double] = f79(v4)
    v12 = v12.copy(p6 = v5)
    val v8: Vector[Vector[Double]] = v12.p0
    var v16: Vector[Vector[Double]] = v8
    v12 = v0
    v16 = v16.updated(0, v6)
    v16 = v16.updated(0, v6)
    val v22: Vector[Vector[Double]] = v0.p7
    v12 = v12.copy(p3 = v16)
    v12 = v12.copy(p0 = v16)
    v12 = v12.copy(p7 = v22)
    v12
  }
  def f60(v0: s1): s1 = {
    val v4: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0)
    val v2: s1 = v4(3)
    val v7: s1 = f84(v0)
    val v3: Vector[s0] = v7.p0
    val v19: s0 = v3(0)
    val v13: s1 = s1(v3, v19)
    val v41: s0 = f70(v19)
    var v24: Vector[s0] = v3
    var v78: s1 = v13
    v24 = v24.updated(1, v41)
    v78 = v2
    v78 = v78.copy(p0 = v24)
    v78
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[Vector[s1]], v2: Double): Double = {
    val v5: Vector[s1] = v1(0)
    val v6: Double = v2 - v2
    var v7: Vector[s1] = v5
    val v13: s1 = v7(0)
    val v20: Double = v2 * v2
    val v17: s0 = v13.p1
    val v18: s1 = f84(v13)
    val v40: Vector[Vector[Double]] = v17.p4
    var v34: Vector[Vector[Double]] = v40
    var v42: Double = v20
    val v68: Vector[Double] = v34(0)
    var v67: Vector[Double] = v68
    val v45: s1 = f60(v18)
    var v32: Vector[Double] = v68
    val v80: Double = v6 / v42
    v32 = v67
    v7 = v7.updated(0, v45)
    var v94: Vector[Double] = v32
    val v76: Double = v94(0)
    v32 = v32.updated(0, v80)
    val v140: Double = v67(0)
    val v208: Double = v140 * v76
    v208
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), 1.0, Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), 13.0, Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), 25.0, Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0)), Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(36.0)), 37.0, Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0)), Vector(Vector(41.0)), Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), 49.0, Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0)), Vector(Vector(53.0)), Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0)), 61.0, Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0)), Vector(Vector(65.0)), Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), Vector(s1(Vector(s0(Vector(Vector(72.0)), 73.0, Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0)), Vector(Vector(77.0)), Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), 85.0, Vector(Vector(86.0), Vector(87.0)), Vector(Vector(88.0)), Vector(Vector(89.0)), Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), s0(Vector(Vector(96.0)), 97.0, Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0)), Vector(Vector(101.0)), Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))))), Vector(s1(Vector(s0(Vector(Vector(108.0)), 109.0, Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0)), Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), 121.0, Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0)), Vector(Vector(125.0)), Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), s0(Vector(Vector(132.0)), 133.0, Vector(Vector(134.0), Vector(135.0)), Vector(Vector(136.0)), Vector(Vector(137.0)), Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))))))
    val v2: Double = 144.0
    val start = nanoTime()
    var result: Double = 144.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}