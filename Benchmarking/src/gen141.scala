import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s10 (
    p0: s1,
    p1: Vector[Vector[s1]],
    p2: Vector[s0]
  )
  def f62(v0: s0, v1: Vector[s1]): s0 = {
    var v2: s0 = v0
    val v7: s1 = v1(0)
    val v3: Vector[s0] = v7.p1
    val v6: Vector[Vector[Double]] = v2.p2
    val v9: Vector[Double] = v6(0)
    var v24: s1 = v7
    val v8: s0 = v3(1)
    v2 = v2.copy(p1 = v6)
    v2 = v2.copy(p2 = v6)
    var v16: Vector[Vector[Double]] = v6
    var v15: Vector[Vector[Double]] = v16
    var v14: Vector[Double] = v9
    val v34: Vector[Vector[Double]] = v8.p1
    val v10: Vector[Vector[Double]] = v2.p2
    val v12: s0 = v24.p0
    val v36: Vector[Vector[Double]] = v0.p0
    val v29: Vector[Vector[Double]] = v8.p0
    v24 = v24.copy(p0 = v2)
    var v33: Vector[Vector[Double]] = v29
    val v69: Vector[Vector[Double]] = v2.p2
    val v30: Vector[Vector[Double]] = v8.p0
    v2 = v2.copy(p1 = v15)
    var v79: Vector[Double] = v14
    var v35: Vector[s0] = v3
    v2 = v2.copy(p0 = v30)
    val v53: Vector[Vector[Double]] = v12.p1
    var v43: s0 = v2
    val v52: Vector[Vector[Double]] = v0.p1
    v43 = v43.copy(p0 = v33)
    var v48: Vector[Vector[Double]] = v34
    val v97: s1 = s1(v2, v3)
    var v42: Vector[s0] = v35
    var v38: Vector[Double] = v79
    val v85: s0 = v97.p0
    val v25: Vector[Double] = v15(0)
    v2 = v2.copy(p2 = v52)
    var v39: Vector[Vector[Double]] = v69
    v39 = v53
    v2 = v2.copy(p0 = v36)
    v35 = v35.updated(1, v85)
    var v86: Vector[Vector[Double]] = v33
    val v37: Vector[Vector[Double]] = v85.p1
    v35 = v35.updated(0, v0)
    v2 = v2.copy(p2 = v37)
    v2 = v2.copy(p0 = v86)
    v24 = v24.copy(p1 = v42)
    var v95: s0 = v8
    v24 = v24.copy(p0 = v95)
    v35 = v35.updated(1, v43)
    v2 = v2.copy(p1 = v6)
    v95 = v95.copy(p1 = v39)
    v39 = v39.updated(0, v38)
    v16 = v16.updated(0, v25)
    var v215: Vector[Vector[Double]] = v10
    v15 = v15.updated(0, v79)
    v2 = v2.copy(p1 = v15)
    v2 = v2.copy(p2 = v215)
    v39 = v48
    v95
  }
  def f46(v0: s10): s10 = {
    val v2: Vector[s10] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v3: Vector[s10] = v2
    v3 = v3.updated(4, v0)
    val v6: s10 = v3(1)
    val v4: s10 = v2(6)
    val v7: s10 = v2(1)
    v3 = v3.updated(2, v0)
    var v8: s10 = v7
    val v11: Vector[s0] = v4.p2
    val v5: s0 = v11(1)
    var v28: Vector[s0] = v11
    v3 = v3.updated(2, v8)
    val v16: Vector[Vector[s0]] = Vector(v11, v28)
    var v12: s10 = v4
    val v14: s1 = v7.p0
    val v21: Vector[s0] = v14.p1
    val v13: Vector[Vector[Double]] = v5.p0
    var v10: s0 = v5
    v12 = v12.copy(p2 = v11)
    v10 = v10.copy(p0 = v13)
    v8 = v8.copy(p0 = v14)
    val v15: Vector[Vector[s0]] = Vector(v21, v21, v21)
    var v30: Vector[Vector[Double]] = v13
    val v19: Vector[s0] = v16(0)
    v28 = v28.updated(2, v10)
    v28 = v19
    var v36: s1 = v14
    val v38: Vector[Vector[s1]] = v7.p1
    val v41: Vector[Vector[Double]] = v10.p1
    v12 = v12.copy(p2 = v19)
    val v27: Vector[Double] = v41(1)
    val v43: Vector[Vector[s1]] = v6.p1
    val v65: Vector[s0] = v36.p1
    v3 = v3.updated(6, v0)
    var v24: Vector[Double] = v27
    val v34: Vector[s1] = v43(0)
    v3 = v2
    val v40: Vector[s0] = v4.p2
    val v26: Vector[Vector[s1]] = Vector(v34, v34, v34, v34)
    v28 = v28.updated(2, v10)
    v8 = v12
    val v114: s1 = v34(0)
    v8 = v8.copy(p0 = v36)
    val v44: Vector[s0] = v114.p1
    var v42: s10 = v4
    val v51: Vector[s0] = v15(1)
    val v72: Vector[Vector[Double]] = v10.p2
    v30 = v30.updated(2, v24)
    v36 = v36.copy(p1 = v65)
    val v79: Vector[s1] = v26(3)
    val v46: Vector[s1] = v43(0)
    val v95: s0 = f62(v10, v34)
    val v54: s0 = s0(v13, v41, v72)
    val v58: s0 = f62(v5, v79)
    v36 = v36.copy(p1 = v21)
    val v88: s1 = v8.p0
    var v199: Vector[Vector[Double]] = v72
    val v116: s0 = f62(v58, v46)
    val v149: Vector[s1] = Vector(v88)
    v36 = v36.copy(p0 = v116)
    val v49: Vector[s0] = v42.p2
    var v93: Vector[Vector[Double]] = v30
    v8 = v8.copy(p2 = v40)
    v10 = v10.copy(p0 = v93)
    val v106: s0 = f62(v10, v149)
    v12 = v12.copy(p2 = v19)
    v12 = v12.copy(p1 = v38)
    v42 = v42.copy(p0 = v114)
    v28 = v28.updated(2, v106)
    v36 = v36.copy(p0 = v106)
    v42 = v42.copy(p0 = v14)
    v8 = v8.copy(p1 = v38)
    v10 = v10.copy(p1 = v199)
    v10 = v10.copy(p0 = v93)
    val v150: Vector[Vector[s1]] = v0.p1
    v36 = v36.copy(p1 = v44)
    v12 = v12.copy(p1 = v150)
    val v212: Vector[s0] = v14.p1
    val v96: s0 = f62(v95, v79)
    v36 = v36.copy(p0 = v96)
    v8 = v8.copy(p1 = v150)
    v36 = v36.copy(p0 = v54)
    v12 = v12.copy(p2 = v40)
    var v131: s10 = v42
    v42 = v42.copy(p2 = v49)
    v36 = v36.copy(p1 = v51)
    v36 = v36.copy(p1 = v212)
    v131
  }
  def f43(v0: s0, v1: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Double] = v3(1)
    var v13: s0 = v0
    val v9: Vector[Vector[Double]] = v1.p2
    var v12: Vector[Vector[Double]] = v9
    v12 = v12.updated(1, v6)
    val v18: Vector[Vector[Double]] = v1.p2
    v13 = v13.copy(p1 = v12)
    v13 = v13.copy(p2 = v18)
    v13
  }
  def f38(v0: s10): s10 = {
    val v7: s10 = f46(v0)
    val v3: Vector[Vector[s1]] = v7.p1
    val v5: Vector[s1] = v3(0)
    val v1: s10 = f46(v7)
    val v8: s1 = v5(0)
    val v4: s10 = f46(v1)
    val v10: Vector[s0] = v4.p2
    var v19: Vector[s0] = v10
    val v21: s0 = v8.p0
    val v46: Vector[s0] = v8.p1
    val v59: s1 = s1(v21, v46)
    val v89: s0 = v59.p0
    var v104: Vector[Vector[s1]] = v3
    val v82: s10 = s10(v8, v104, v19)
    v19 = v19.updated(1, v89)
    v82
  }
  def f6(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0, v0)
    var v2: s0 = v0
    val v3: s0 = f43(v0, v0)
    val v4: Vector[Vector[Double]] = v0.p2
    v2 = v2.copy(p1 = v4)
    val v5: Vector[Vector[Double]] = v3.p2
    val v9: Vector[Vector[Double]] = v2.p0
    val v11: s0 = v1(0)
    v2 = v2.copy(p2 = v5)
    val v12: Vector[Vector[Double]] = v11.p1
    val v17: s0 = s0(v9, v5, v12)
    v17
  }
  @noinline
  def f0(v0: s10, v1: Double): Double = {
    val v6: s10 = f38(v0)
    var v2: Double = v1
    val v5: s10 = f46(v0)
    var v4: Double = v2
    var v7: Double = v2
    var v11: s10 = v0
    val v15: s1 = v6.p0
    val v12: Vector[s0] = v11.p2
    val v14: s10 = f38(v0)
    var v13: s1 = v15
    v4 = v7
    v11 = v11.copy(p0 = v13)
    var v25: Vector[s0] = v12
    val v17: s0 = v25(0)
    var v27: Vector[s0] = v12
    v27 = v27.updated(2, v17)
    val v23: s0 = f6(v17)
    val v35: s0 = f43(v23, v17)
    val v45: s0 = f6(v35)
    val v48: Vector[Vector[Double]] = v17.p2
    val v22: s0 = f6(v35)
    val v41: s10 = f38(v5)
    val v51: s1 = v41.p0
    val v40: s10 = f46(v41)
    v13 = v13.copy(p0 = v22)
    v13 = v13.copy(p0 = v23)
    v27 = v27.updated(1, v22)
    v13 = v13.copy(p0 = v17)
    v11 = v11.copy(p0 = v51)
    val v44: Double = v7 + v7
    val v43: s0 = f43(v45, v17)
    val v59: Vector[Double] = v48(0)
    val v39: Vector[s0] = v51.p1
    v13 = v13.copy(p0 = v35)
    v25 = v25.updated(2, v22)
    var v33: s1 = v15
    val v65: s1 = v40.p0
    v33 = v51
    val v87: Double = v59(0)
    val v92: Vector[s0] = v65.p1
    v13 = v13.copy(p0 = v17)
    val v73: s0 = v51.p0
    var v94: Vector[s0] = v92
    val v32: Double = v59(0)
    v33 = v33.copy(p1 = v39)
    v11 = v11.copy(p2 = v12)
    var v50: Double = v2
    v13 = v13.copy(p1 = v94)
    v94 = v94.updated(1, v73)
    v94 = v94.updated(0, v43)
    val v60: Vector[Double] = Vector(v32, v50, v32, v87, v44, v4)
    v50 = v87
    v13 = v13.copy(p1 = v92)
    v11 = v11.copy(p2 = v27)
    v50 = v1
    v27 = v27.updated(0, v17)
    v13 = v13.copy(p0 = v23)
    val v172: Vector[Vector[s1]] = v14.p1
    val v173: Double = v60(0)
    v11 = v11.copy(p1 = v172)
    v11 = v11.copy(p0 = v33)
    v173
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0))), Vector(s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), Vector(Vector(s1(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))))
    val v1: Double = 63.0
    val start = nanoTime()
    var result: Double = 63.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}