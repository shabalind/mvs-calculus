import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]],
    p3: Vector[Double],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Double
  )
  def f112(v0: s2): s2 = {
    var v2: s2 = v0
    var v3: s2 = v2
    v3
  }
  def f109(v0: s0): s0 = {
    var v1: s0 = v0
    var v3: s0 = v0
    v1 = v0
    var v7: s0 = v0
    var v10: s0 = v1
    val v8: Vector[Vector[Double]] = v10.p0
    val v4: Vector[Vector[Double]] = v3.p4
    val v12: Vector[Vector[Double]] = v1.p0
    val v21: Vector[Vector[Double]] = v1.p2
    var v27: s0 = v7
    v1 = v1.copy(p4 = v4)
    val v13: Vector[Vector[Double]] = v27.p4
    var v30: Vector[Vector[Double]] = v8
    val v15: Vector[Double] = v21(0)
    v30 = v30.updated(1, v15)
    v10 = v10.copy(p0 = v12)
    v1 = v7
    v10 = v10.copy(p0 = v4)
    val v50: Vector[Double] = v27.p1
    v1 = v1.copy(p1 = v50)
    v7 = v7.copy(p4 = v13)
    v10 = v10.copy(p4 = v30)
    v7 = v7.copy(p0 = v4)
    v10
  }
  def f105(v0: s1): s1 = {
    val v2: s0 = v0.p1
    val v3: Vector[s0] = v0.p0
    val v4: s0 = v0.p1
    val v6: s0 = v3(2)
    val v1: s0 = f109(v6)
    var v5: s0 = v6
    val v10: s0 = f109(v1)
    var v12: s1 = v0
    v12 = v12.copy(p1 = v5)
    v5 = v6
    var v20: s1 = v12
    var v22: s1 = v12
    v20 = v20.copy(p1 = v4)
    v5 = v6
    val v13: Vector[s0] = v20.p0
    v20 = v20.copy(p1 = v10)
    v20 = v20.copy(p1 = v5)
    var v37: s1 = v22
    v37 = v37.copy(p0 = v13)
    var v31: s1 = v37
    v20 = v20.copy(p1 = v2)
    v31
  }
  def f101(v0: s1, v1: s2): s2 = {
    val v5: s1 = f105(v0)
    val v8: s1 = f105(v5)
    val v13: Double = v1.p1
    val v34: s2 = s2(v8, v13)
    var v119: s2 = v34
    v119
  }
  def f97(v0: s2): s2 = {
    val v2: s1 = v0.p0
    var v8: s1 = v2
    val v1: s2 = f112(v0)
    val v3: s2 = f101(v8, v1)
    var v19: s2 = v3
    v19
  }
  def f95(v0: Vector[s0]): Vector[s0] = {
    val v5: s0 = v0(1)
    var v2: Vector[s0] = v0
    val v10: s0 = f109(v5)
    val v13: s0 = f109(v5)
    val v32: s0 = f109(v10)
    val v38: s0 = f109(v32)
    val v69: s0 = f109(v13)
    val v62: s0 = f109(v38)
    var v51: Vector[s0] = v2
    v2 = v2.updated(1, v13)
    v51 = v51.updated(1, v69)
    v2 = v2.updated(2, v62)
    v51
  }
  def f94(v0: s1, v1: s0): s0 = {
    var v3: s1 = v0
    val v4: s0 = f109(v1)
    val v11: s1 = f105(v3)
    v3 = v3.copy(p1 = v1)
    v3 = v11
    v3 = v3.copy(p1 = v4)
    val v61: Vector[s0] = v11.p0
    val v53: Vector[s0] = f95(v61)
    val v49: Vector[s0] = v0.p0
    val v266: Vector[s0] = f95(v53)
    val v242: Vector[s0] = f95(v49)
    v3 = v3.copy(p0 = v242)
    val v138: s0 = v266(1)
    val v243: s0 = f109(v138)
    v243
  }
  def f93(v0: s1, v1: Vector[s0]): s1 = {
    val v2: Vector[s0] = f95(v1)
    val v6: s0 = v2(1)
    val v7: s1 = s1(v1, v6)
    v7
  }
  def f88(v0: s2): s2 = {
    val v3: s2 = f112(v0)
    var v7: s2 = v3
    val v4: s1 = v7.p0
    var v2: s1 = v4
    var v5: s2 = v0
    var v10: s2 = v5
    val v9: Vector[s0] = v4.p0
    val v6: Double = v7.p1
    val v8: Double = v6 / v6
    val v17: s0 = v9(2)
    val v26: Vector[Double] = v17.p3
    val v24: s0 = f94(v2, v17)
    val v13: s0 = f94(v4, v24)
    var v14: Vector[Double] = v26
    var v36: Vector[s0] = v9
    var v22: s0 = v13
    val v19: Double = v3.p1
    v36 = v36.updated(0, v24)
    val v29: s1 = f105(v4)
    v36 = v36.updated(0, v17)
    v14 = v14.updated(1, v6)
    val v16: Vector[s0] = f95(v36)
    val v21: Vector[s0] = f95(v16)
    var v41: s0 = v22
    v36 = v36.updated(1, v17)
    val v34: Vector[Double] = v22.p1
    var v42: Double = v6
    val v59: Vector[s0] = v4.p0
    v7 = v7.copy(p0 = v4)
    v36 = v36.updated(2, v41)
    v14 = v14.updated(1, v8)
    val v38: s0 = f109(v22)
    v2 = v2.copy(p0 = v21)
    val v25: s1 = f93(v29, v59)
    val v28: Double = v34(0)
    var v55: Vector[s0] = v21
    v41 = v41.copy(p1 = v26)
    v5 = v5.copy(p1 = v42)
    val v35: s0 = v2.p1
    v5 = v5.copy(p0 = v29)
    val v56: s0 = v2.p1
    v36 = v36.updated(0, v38)
    v7 = v7.copy(p0 = v25)
    v36 = v36.updated(0, v22)
    v14 = v14.updated(0, v19)
    val v74: Double = v14(0)
    v36 = v36.updated(1, v24)
    val v92: s1 = v10.p0
    val v97: s1 = f93(v25, v55)
    val v96: s0 = f94(v92, v56)
    val v94: s0 = v29.p1
    v36 = v36.updated(2, v35)
    v7 = v7.copy(p1 = v28)
    v5 = v5.copy(p1 = v28)
    v36 = v36.updated(1, v94)
    v36 = v36.updated(0, v38)
    v5 = v5.copy(p1 = v42)
    val v102: s2 = s2(v97, v74)
    v55 = v55.updated(2, v96)
    v102
  }
  def f80(v0: s1): s1 = {
    val v7: Vector[s0] = v0.p0
    val v5: Vector[s0] = v0.p0
    val v1: Vector[s0] = v0.p0
    var v2: Vector[s0] = v5
    val v3: s0 = v2(1)
    val v10: s0 = v1(0)
    val v13: s0 = v5(0)
    v2 = v2.updated(2, v3)
    v2 = v2.updated(2, v3)
    v2 = v2.updated(1, v10)
    var v8: s1 = v0
    v8 = v8.copy(p1 = v10)
    val v15: s0 = v2(0)
    val v18: s0 = v2(1)
    v8 = v8.copy(p0 = v1)
    val v16: s0 = v8.p1
    val v24: s0 = f94(v8, v10)
    var v21: Vector[s0] = v1
    var v28: s1 = v0
    val v27: s0 = v7(1)
    val v19: Vector[Double] = v15.p1
    v28 = v28.copy(p0 = v1)
    v2 = v2.updated(2, v16)
    var v40: s1 = v8
    val v39: Vector[s0] = f95(v5)
    val v25: s1 = s1(v1, v3)
    val v85: Vector[s0] = v28.p0
    val v45: Vector[s1] = Vector(v25, v28, v40, v25, v8)
    val v37: Vector[s0] = f95(v7)
    val v54: Vector[s0] = f95(v2)
    val v76: Vector[s0] = f95(v2)
    val v64: Double = v19(0)
    val v38: Vector[Vector[s0]] = Vector(v1, v39, v85, v54, v85, v85)
    v40 = v40.copy(p0 = v37)
    val v63: s1 = f105(v8)
    val v66: Vector[s0] = v38(0)
    v28 = v28.copy(p1 = v13)
    v40 = v40.copy(p1 = v18)
    val v98: s0 = v0.p1
    var v79: Vector[s1] = v45
    val v99: s1 = f93(v63, v21)
    val v331: s1 = v79(3)
    v8 = v8.copy(p1 = v27)
    v2 = v2.updated(1, v24)
    var v125: Vector[s0] = v85
    val v363: s1 = f105(v99)
    v8 = v8.copy(p0 = v76)
    val v139: s2 = s2(v363, v64)
    val v94: s2 = f101(v331, v139)
    val v120: s2 = f112(v94)
    v28 = v28.copy(p0 = v66)
    v40 = v40.copy(p0 = v125)
    v8 = v8.copy(p0 = v85)
    val v237: s2 = f88(v120)
    v8 = v8.copy(p1 = v98)
    v2 = v7
    val v135: s2 = f97(v237)
    val v154: s1 = v135.p0
    v154
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v7: Vector[s1] = v0(1)
    val v4: s1 = v7(0)
    val v5: s1 = f80(v4)
    val v2: Vector[s0] = v4.p0
    val v8: s0 = v2(0)
    val v12: Vector[s0] = v5.p0
    val v16: s0 = v12(0)
    var v28: Double = v1
    val v29: Vector[Double] = v8.p1
    val v41: Vector[Vector[Double]] = v16.p4
    val v36: Vector[Double] = v41(0)
    val v43: Double = v36(0)
    var v54: Double = v43
    var v44: Vector[Double] = v29
    v44 = v44.updated(0, v28)
    val v167: Double = v44(1)
    val v73: Double = v54 * v167
    v73
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(7.0, 8.0), Vector(Vector(9.0), Vector(10.0))), s0(Vector(Vector(11.0), Vector(12.0)), Vector(13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0), Vector(Vector(20.0), Vector(21.0))), s0(Vector(Vector(22.0), Vector(23.0)), Vector(24.0, 25.0), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(29.0, 30.0), Vector(Vector(31.0), Vector(32.0)))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0))))), Vector(s1(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(46.0, 47.0), Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0, 52.0), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(57.0, 58.0), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(62.0, 63.0), Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(68.0, 69.0), Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(73.0, 74.0), Vector(Vector(75.0), Vector(76.0)))), s0(Vector(Vector(77.0), Vector(78.0)), Vector(79.0, 80.0), Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(84.0, 85.0), Vector(Vector(86.0), Vector(87.0))))))
    val v1: Double = 88.0
    val start = nanoTime()
    var result: Double = 88.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}