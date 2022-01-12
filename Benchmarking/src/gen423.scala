import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s7 (
    p0: Vector[s2],
    p1: s3,
    p2: s0
  )
  def f109(v0: Vector[s1]): Vector[s1] = {
    var v7: Vector[s1] = v0
    var v3: Vector[s1] = v7
    val v2: s1 = v0(0)
    v3 = v3.updated(0, v2)
    var v1: Vector[s1] = v3
    v1
  }
  def f77(v0: Vector[s1], v1: Double): Double = {
    val v7: s1 = v0(1)
    val v6: s0 = v7.p1
    var v18: s1 = v7
    v18 = v18.copy(p1 = v6)
    val v31: s0 = v18.p1
    v18 = v18.copy(p1 = v6)
    v18 = v18.copy(p1 = v6)
    v18 = v18.copy(p1 = v6)
    val v17: Vector[s0] = Vector(v6, v31, v31, v31, v31)
    val v47: s0 = v17(4)
    val v34: s0 = v17(4)
    val v41: Vector[Vector[s0]] = v18.p0
    var v72: Vector[s0] = v17
    v18 = v18.copy(p1 = v34)
    val v59: Vector[s0] = v41(1)
    v18 = v18.copy(p1 = v34)
    v18 = v18.copy(p1 = v47)
    val v93: s0 = v72(0)
    v72 = v72.updated(3, v47)
    v18 = v18.copy(p1 = v31)
    v18 = v18.copy(p0 = v41)
    val v159: Vector[Vector[s0]] = v18.p0
    v18 = v18.copy(p0 = v159)
    val v163: s0 = v59(0)
    v18 = v18.copy(p0 = v41)
    val v126: Vector[Double] = v93.p1
    v18 = v18.copy(p1 = v163)
    val v195: Double = v126(1)
    v18 = v18.copy(p1 = v34)
    v195
  }
  def f53(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v3: Vector[Vector[s0]] = v0
    val v5: Vector[s0] = v3(1)
    val v4: Vector[s0] = v3(1)
    var v12: Vector[s0] = v4
    v3 = v3.updated(0, v12)
    var v6: Vector[Vector[s0]] = v3
    v3 = v3.updated(0, v4)
    val v10: s0 = v4(0)
    v3 = v3.updated(0, v5)
    val v18: Vector[s0] = v6(1)
    v3 = v3.updated(0, v12)
    v12 = v12.updated(0, v10)
    var v29: Vector[Vector[s0]] = v0
    v29 = v29.updated(1, v18)
    v12 = v5
    v29
  }
  def f52(v0: s0, v1: s1): s1 = {
    val v4: Vector[s1] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v5: s1 = v4(3)
    val v7: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p0
    var v14: s1 = v5
    v14 = v14.copy(p1 = v0)
    val v12: Vector[Double] = v0.p1
    val v15: Vector[Double] = v0.p1
    val v18: Double = v15(0)
    var v17: s0 = v0
    val v10: Vector[Vector[s0]] = v5.p0
    val v31: Vector[Vector[s0]] = f53(v10)
    var v30: Vector[Double] = v12
    val v20: Vector[Vector[s0]] = f53(v31)
    v14 = v14.copy(p1 = v17)
    val v23: Vector[Double] = v2(1)
    v30 = v30.updated(1, v18)
    var v27: Vector[Vector[s0]] = v20
    val v33: Double = v23(0)
    val v36: Vector[Vector[s0]] = f53(v27)
    val v54: Double = v33 / v18
    var v48: s0 = v17
    var v47: Vector[Double] = v15
    val v91: Vector[Vector[Double]] = v48.p0
    v30 = v30.updated(1, v18)
    v30 = v30.updated(0, v54)
    val v49: Vector[s0] = v10(0)
    val v129: s0 = v49(0)
    var v51: s0 = v17
    v17 = v51
    val v73: Vector[Vector[s0]] = f53(v10)
    val v41: Vector[Vector[s0]] = f53(v36)
    v47 = v47.updated(1, v54)
    var v110: Vector[Vector[Double]] = v91
    val v106: Vector[Double] = v48.p1
    var v140: Vector[Double] = v30
    val v125: s0 = v14.p1
    v14 = v14.copy(p1 = v129)
    v17 = v17.copy(p1 = v140)
    v14 = v14.copy(p1 = v51)
    val v112: Vector[Vector[Double]] = v125.p0
    v17 = v17.copy(p0 = v110)
    v48 = v48.copy(p0 = v112)
    val v234: Vector[Vector[s0]] = f53(v73)
    v48 = v48.copy(p1 = v106)
    v14 = v14.copy(p0 = v41)
    v17 = v17.copy(p1 = v47)
    v51 = v51.copy(p0 = v7)
    v14 = v14.copy(p0 = v234)
    v14
  }
  @noinline
  def f0(v0: s1, v1: s3, v2: Vector[s7], v3: Double): Double = {
    val v5: Vector[s0] = v1.p1
    val v6: s0 = v5(2)
    val v8: Vector[s0] = v1.p1
    val v15: s0 = v8(2)
    val v16: s1 = f52(v15, v0)
    val v19: Vector[Double] = v6.p1
    val v32: s0 = v8(2)
    val v18: Double = v19(1)
    val v33: Double = v18 / v3
    var v22: Vector[Double] = v19
    val v17: Vector[Vector[s0]] = v0.p0
    val v56: Double = v19(1)
    var v24: s1 = v0
    val v35: Vector[Vector[s0]] = f53(v17)
    val v64: Vector[s1] = Vector(v0, v16, v24)
    val v59: s0 = v5(1)
    v22 = v22.updated(1, v56)
    val v50: s1 = v64(0)
    val v37: Vector[s1] = f109(v64)
    val v58: s1 = s1(v17, v59)
    val v63: Vector[Vector[s0]] = v58.p0
    var v85: Vector[Vector[s0]] = v63
    v24 = v24.copy(p0 = v35)
    v24 = v50
    val v91: Double = f77(v37, v33)
    v24 = v24.copy(p0 = v85)
    v24 = v24.copy(p1 = v32)
    var v77: Vector[Double] = v22
    v77 = v77.updated(1, v91)
    val v163: Double = v77(0)
    v77 = v77.updated(0, v56)
    v163
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(13.0, 14.0)))
    val v1: s3 = s3(s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0, 24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(28.0, 29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0)), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(38.0, 39.0)), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0, 44.0))))
    val v2: Vector[s7] = Vector(s7(Vector(s2(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(48.0, 49.0)), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(53.0, 54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(58.0, 59.0))), s2(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0)), Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(68.0, 69.0)))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(73.0, 74.0))), s2(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(78.0, 79.0)), Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(83.0, 84.0)))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(88.0, 89.0)))), s3(s1(Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0))), Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(98.0, 99.0)))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(103.0, 104.0))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(108.0, 109.0)), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(113.0, 114.0)), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(118.0, 119.0)))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(123.0, 124.0))))
    val v3: Double = 125.0
    val start = nanoTime()
    var result: Double = 125.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}