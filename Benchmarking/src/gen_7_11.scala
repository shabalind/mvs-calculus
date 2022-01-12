import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  def f34(v0: s0): s0 = {
    var v1: s0 = v0
    var v7: s0 = v1
    val v8: Vector[Vector[Double]] = v0.p0
    v1 = v7
    v1 = v1.copy(p0 = v8)
    val v6: Vector[Vector[Double]] = v1.p1
    v1 = v1.copy(p1 = v6)
    v7 = v7.copy(p1 = v6)
    val v12: Vector[Vector[Double]] = v1.p0
    val v18: Vector[Vector[Double]] = v0.p1
    val v15: Vector[Vector[Double]] = v0.p0
    val v21: Vector[Vector[Double]] = v1.p0
    val v33: Vector[Vector[Double]] = v1.p1
    v7 = v7.copy(p1 = v6)
    val v26: Vector[Vector[Double]] = v7.p1
    val v17: Vector[Vector[Double]] = v7.p0
    val v24: Vector[Vector[Double]] = v0.p1
    v7 = v7.copy(p0 = v12)
    val v54: Vector[Vector[Vector[Double]]] = Vector(v24, v26, v26, v6, v24, v18, v26)
    var v36: s0 = v1
    val v61: Vector[Vector[Double]] = v0.p1
    v36 = v36.copy(p0 = v12)
    var v29: Vector[Vector[Vector[Double]]] = v54
    v1 = v1.copy(p1 = v33)
    v7 = v7.copy(p0 = v17)
    var v43: Vector[Vector[Vector[Double]]] = v54
    v36 = v36.copy(p0 = v21)
    val v63: Vector[Vector[Double]] = v7.p1
    v1 = v1.copy(p1 = v61)
    val v37: Vector[Vector[Double]] = v0.p0
    v43 = v43.updated(3, v61)
    val v42: Vector[Vector[Double]] = v1.p1
    val v56: Vector[Vector[Double]] = v36.p1
    val v101: Vector[Vector[Double]] = v0.p1
    v1 = v7
    v1 = v1.copy(p0 = v15)
    val v59: Vector[Vector[Double]] = v36.p0
    v1 = v1.copy(p1 = v63)
    val v80: Vector[Vector[Double]] = v43(1)
    val v57: Vector[Vector[Double]] = v7.p0
    val v152: Vector[Vector[Double]] = v29(0)
    v36 = v36.copy(p0 = v59)
    v36 = v36.copy(p1 = v6)
    val v118: Vector[Vector[Vector[Double]]] = Vector(v101)
    v7 = v7.copy(p1 = v80)
    var v138: Vector[Vector[Vector[Double]]] = v118
    val v65: s0 = s0(v37, v24)
    v1 = v1.copy(p1 = v56)
    val v73: Vector[Vector[Double]] = v138(0)
    val v145: Vector[Vector[Double]] = v65.p1
    val v131: Vector[Vector[Double]] = v65.p0
    var v82: Vector[Vector[Vector[Double]]] = v43
    val v151: Vector[Vector[Double]] = v0.p0
    val v213: Vector[Vector[Double]] = v82(4)
    v7 = v7.copy(p0 = v21)
    v36 = v36.copy(p0 = v57)
    v7 = v7.copy(p1 = v213)
    val v132: Vector[Vector[Double]] = v36.p1
    v1 = v1.copy(p1 = v145)
    val v196: Vector[Vector[Double]] = v36.p1
    v36 = v36.copy(p1 = v132)
    v36 = v36.copy(p0 = v151)
    v36 = v36.copy(p1 = v42)
    v7 = v7.copy(p1 = v196)
    val v221: s0 = s0(v131, v152)
    v1 = v1.copy(p1 = v6)
    v36 = v36.copy(p1 = v73)
    v221
  }
  def f33(v0: s2): s2 = {
    var v6: s2 = v0
    val v4: Vector[s1] = v6.p0
    var v2: Vector[s1] = v4
    val v8: s1 = v2(0)
    val v11: s1 = v4(0)
    val v7: Vector[s0] = v8.p0
    v2 = v2.updated(0, v8)
    var v3: Vector[s1] = v2
    var v15: Vector[s0] = v7
    v6 = v6.copy(p0 = v4)
    var v13: Vector[s1] = v2
    var v12: Vector[s0] = v15
    val v10: s1 = v13(0)
    val v20: s0 = v12(0)
    val v24: s0 = f34(v20)
    val v18: s0 = f34(v24)
    var v25: s0 = v18
    val v21: Vector[s1] = v0.p0
    v13 = v13.updated(0, v11)
    v13 = v13.updated(0, v10)
    v12 = v12.updated(1, v18)
    var v14: s1 = v8
    val v46: s0 = v14.p1
    v14 = v10
    v13 = v13.updated(0, v8)
    v2 = v2.updated(0, v11)
    val v22: s1 = v21(0)
    val v28: s2 = s2(v3, v25)
    v6 = v6.copy(p1 = v46)
    v13 = v13.updated(0, v22)
    v28
  }
  def f28(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Double] = v1(1)
    var v4: Vector[Vector[Double]] = v1
    val v11: s0 = f34(v0)
    val v2: s0 = f34(v0)
    val v12: s0 = f34(v2)
    val v21: Vector[Vector[Double]] = v11.p0
    val v19: s0 = f34(v0)
    val v28: Vector[Double] = v4(0)
    val v16: s0 = f34(v19)
    val v27: Vector[Double] = v21(1)
    val v26: s0 = f34(v12)
    val v66: Vector[Vector[Double]] = v16.p0
    var v57: Vector[Vector[Double]] = v4
    v57 = v57.updated(1, v28)
    var v103: s0 = v26
    v103 = v103.copy(p0 = v66)
    v103 = v103.copy(p1 = v57)
    val v86: Vector[Vector[Double]] = v2.p1
    v57 = v86
    val v46: s0 = f34(v103)
    v57 = v57.updated(0, v27)
    v4 = v4.updated(0, v9)
    v46
  }
  def f20(v0: s2, v1: s2): s2 = {
    val v3: s0 = v0.p1
    var v7: s0 = v3
    val v4: Vector[Vector[Double]] = v3.p1
    v7 = v7.copy(p1 = v4)
    var v6: s0 = v7
    val v2: Vector[Vector[Double]] = v3.p0
    var v8: Vector[Vector[Double]] = v2
    val v9: Vector[Double] = v8(0)
    val v5: s0 = s0(v2, v4)
    var v12: Vector[Vector[Double]] = v8
    val v13: s2 = f33(v0)
    val v14: Vector[Vector[Double]] = v5.p1
    v12 = v12.updated(1, v9)
    val v18: Vector[Double] = v8(0)
    v6 = v6.copy(p0 = v12)
    v8 = v8.updated(1, v9)
    val v25: Vector[Double] = v2(1)
    v8 = v8.updated(0, v25)
    val v26: s2 = f33(v0)
    v7 = v7.copy(p1 = v4)
    var v19: Vector[Vector[Double]] = v4
    val v15: Vector[Vector[Double]] = v5.p0
    val v34: Vector[Vector[Double]] = v5.p1
    v7 = v7.copy(p0 = v15)
    val v17: s0 = f28(v6)
    v8 = v8.updated(0, v9)
    v12 = v12.updated(0, v25)
    v7 = v7.copy(p0 = v15)
    val v29: s2 = f33(v26)
    var v30: s0 = v6
    val v38: Vector[Vector[Double]] = v3.p0
    v19 = v19.updated(1, v18)
    val v40: s0 = f34(v5)
    val v28: Vector[Vector[Double]] = v40.p0
    val v35: Vector[Vector[Double]] = v17.p0
    v12 = v35
    var v41: s0 = v3
    val v96: s0 = f34(v30)
    v30 = v30.copy(p1 = v19)
    var v69: Vector[Vector[Double]] = v38
    val v119: Vector[Vector[Double]] = v17.p1
    val v56: Vector[Vector[Double]] = v96.p1
    v41 = v41.copy(p1 = v56)
    v41 = v41.copy(p1 = v119)
    val v113: s0 = v1.p1
    var v82: Vector[Vector[Double]] = v4
    v82 = v82.updated(2, v18)
    var v100: Vector[Vector[Double]] = v28
    var v98: s0 = v5
    var v44: Vector[Vector[Double]] = v14
    val v78: Vector[Double] = v38(1)
    var v108: s2 = v29
    val v109: Vector[Vector[Double]] = v41.p1
    v98 = v98.copy(p1 = v34)
    v30 = v30.copy(p0 = v35)
    v108 = v108.copy(p1 = v96)
    v12 = v12.updated(1, v78)
    v98 = v113
    var v66: Vector[Vector[Double]] = v69
    v30 = v30.copy(p1 = v82)
    v6 = v98
    v7 = v7.copy(p0 = v100)
    v69 = v69.updated(1, v9)
    v6 = v6.copy(p1 = v44)
    v108 = v108.copy(p1 = v98)
    v41 = v41.copy(p0 = v66)
    val v202: Vector[s1] = v13.p0
    v6 = v6.copy(p1 = v109)
    var v107: s2 = v108
    v6 = v6.copy(p1 = v119)
    v107 = v107.copy(p0 = v202)
    v107
  }
  def f14(v0: s0): s0 = {
    val v3: s0 = f28(v0)
    val v43: s0 = f28(v3)
    val v46: s0 = f28(v43)
    val v48: s0 = f34(v46)
    v48
  }
  def f5(v0: s2, v1: s0): s0 = {
    val v6: s0 = v0.p1
    val v5: s0 = f14(v6)
    var v10: s0 = v6
    v10 = v5
    v10
  }
  @noinline
  def f0(v0: Vector[s1], v1: s2, v2: Double): Double = {
    var v7: s2 = v1
    val v3: Vector[s1] = v7.p0
    val v5: Vector[s2] = Vector(v1, v1, v1, v1, v1, v7)
    val v4: s1 = v3(0)
    val v8: s2 = v5(4)
    val v18: Vector[s1] = v8.p0
    var v13: Vector[s1] = v3
    val v6: s2 = f20(v1, v7)
    val v22: s1 = v0(0)
    v7 = v7.copy(p0 = v18)
    v7 = v7.copy(p0 = v18)
    v13 = v3
    v7 = v7.copy(p0 = v13)
    v7 = v7.copy(p0 = v18)
    val v19: s0 = v6.p1
    val v51: s0 = f28(v19)
    var v30: s1 = v4
    val v16: s0 = f5(v1, v19)
    v13 = v13.updated(0, v22)
    val v37: Vector[Vector[Double]] = v16.p1
    v30 = v30.copy(p1 = v51)
    val v42: Vector[Double] = v37(0)
    val v63: Double = v42(0)
    val v83: s0 = v6.p1
    v13 = v13.updated(0, v22)
    var v122: s0 = v83
    var v65: Double = v63
    v122 = v122.copy(p1 = v37)
    var v72: Double = v65
    v13 = v13.updated(0, v30)
    v7 = v7.copy(p1 = v122)
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))
    val v1: s2 = s2(Vector(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))
    val v2: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}