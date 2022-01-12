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
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  def f86(v0: s2): s2 = {
    var v1: s2 = v0
    var v8: s2 = v0
    val v3: Vector[Vector[s0]] = v8.p1
    v1 = v8
    val v5: Vector[s2] = Vector(v0)
    var v6: Vector[s2] = v5
    val v7: Vector[Vector[s0]] = v8.p1
    val v11: Vector[s1] = v1.p0
    v1 = v1.copy(p0 = v11)
    v6 = v6.updated(0, v1)
    val v4: Vector[s1] = v8.p0
    var v9: Vector[Vector[s0]] = v7
    v8 = v8.copy(p1 = v9)
    v1 = v1.copy(p0 = v4)
    val v43: s2 = v6(0)
    v8 = v8.copy(p1 = v3)
    v43
  }
  def f85(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v3(0)
    var v6: s0 = v0
    v6 = v6.copy(p1 = v2)
    var v5: Vector[Vector[Double]] = v3
    var v4: Vector[Double] = v1
    var v9: Vector[Vector[Double]] = v5
    var v8: s0 = v0
    val v12: Vector[Double] = v2(2)
    val v10: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v6.p1
    v5 = v5.updated(0, v12)
    v5 = v5.updated(0, v4)
    val v11: Vector[Double] = v10(0)
    val v17: Vector[Double] = v5(0)
    val v14: Vector[Vector[Vector[Double]]] = Vector(v10, v9, v10, v5, v9)
    val v24: Vector[Vector[Double]] = v0.p1
    val v16: Vector[Vector[Vector[Double]]] = Vector(v9, v5, v5, v3, v9, v5)
    var v29: Vector[Vector[Vector[Double]]] = v16
    v6 = v6.copy(p1 = v24)
    val v23: Vector[Vector[Double]] = v14(1)
    var v22: Vector[Vector[Vector[Double]]] = v16
    v29 = v29.updated(0, v5)
    val v19: Vector[Vector[Double]] = v0.p0
    v22 = v22.updated(3, v10)
    v6 = v6.copy(p0 = v3)
    val v31: Vector[Vector[Double]] = v22(0)
    val v21: Vector[Vector[Double]] = v0.p0
    v8 = v8.copy(p0 = v23)
    v8 = v8.copy(p0 = v23)
    val v32: Vector[Vector[Double]] = v14(4)
    var v47: Vector[Vector[Double]] = v7
    val v72: Vector[Vector[Double]] = v22(0)
    val v20: Vector[Vector[Vector[Vector[Double]]]] = Vector(v14, v14, v14, v14, v14)
    val v46: Vector[Vector[Double]] = v0.p1
    val v27: s0 = s0(v21, v7)
    v6 = v6.copy(p0 = v5)
    v6 = v6.copy(p1 = v7)
    val v33: Vector[Vector[Double]] = v8.p0
    v6 = v6.copy(p1 = v47)
    val v41: Vector[Vector[Double]] = v8.p0
    var v28: Vector[Vector[Vector[Double]]] = v14
    v8 = v8.copy(p0 = v9)
    v6 = v6.copy(p0 = v9)
    v29 = v29.updated(3, v41)
    val v40: Vector[Vector[Double]] = v28(2)
    v29 = v29.updated(3, v21)
    var v39: Vector[Vector[Vector[Double]]] = v28
    val v36: Vector[Vector[Double]] = v6.p1
    val v42: Vector[Vector[Double]] = v27.p1
    v6 = v6.copy(p1 = v2)
    val v35: Vector[Double] = v36(2)
    val v53: Vector[Vector[Double]] = v39(4)
    val v38: Vector[Vector[Double]] = v29(1)
    v47 = v47.updated(2, v1)
    val v43: Vector[Vector[Double]] = v27.p0
    val v51: Vector[Vector[Double]] = v0.p1
    v9 = v9.updated(0, v11)
    v6 = v6.copy(p1 = v46)
    val v60: Vector[Vector[Double]] = v0.p1
    v8 = v8.copy(p1 = v7)
    v9 = v38
    v39 = v39.updated(1, v23)
    val v104: Vector[Vector[Double]] = v6.p0
    var v94: s0 = v0
    v94 = v94.copy(p1 = v2)
    v8 = v8.copy(p0 = v19)
    v47 = v42
    v8 = v8.copy(p0 = v104)
    var v77: s0 = v6
    var v172: Vector[Vector[Double]] = v53
    val v106: Vector[Vector[Double]] = v6.p1
    v77 = v77.copy(p1 = v42)
    val v164: Vector[Vector[Vector[Double]]] = v20(3)
    val v129: Vector[Vector[Double]] = v0.p1
    val v134: Vector[Vector[Double]] = v94.p1
    v8 = v8.copy(p0 = v5)
    v9 = v9.updated(0, v17)
    v77 = v77.copy(p1 = v134)
    v94 = v94.copy(p1 = v106)
    v39 = v39.updated(4, v43)
    v6 = v6.copy(p1 = v46)
    v6 = v6.copy(p0 = v33)
    v94 = v94.copy(p0 = v32)
    v6 = v6.copy(p1 = v129)
    val v170: Vector[Vector[Double]] = v77.p1
    v94 = v94.copy(p1 = v60)
    val v109: Vector[Vector[Double]] = v164(1)
    v5 = v5.updated(0, v35)
    v77 = v77.copy(p0 = v172)
    v6 = v6.copy(p1 = v51)
    val v124: Vector[Vector[Double]] = v6.p0
    val v160: s0 = s0(v72, v42)
    var v143: s0 = v160
    v77 = v77.copy(p1 = v36)
    v39 = v39.updated(2, v109)
    v77 = v77.copy(p0 = v31)
    v6 = v6.copy(p0 = v40)
    v143 = v143.copy(p1 = v36)
    v143 = v143.copy(p1 = v129)
    v22 = v22.updated(0, v124)
    v143 = v143.copy(p1 = v170)
    v143 = v143.copy(p1 = v134)
    v22 = v22.updated(5, v109)
    v143
  }
  def f84(v0: s2): s2 = {
    val v2: s2 = f86(v0)
    val v8: s2 = f86(v2)
    val v16: Vector[Vector[s0]] = v8.p1
    val v21: Vector[s1] = v0.p0
    val v54: s2 = s2(v21, v16)
    val v35: s2 = f86(v54)
    val v49: s2 = f86(v2)
    val v85: s2 = f86(v8)
    val v58: s2 = f86(v85)
    val v98: Vector[s2] = Vector(v58, v49, v85, v58, v35)
    val v161: s2 = v98(1)
    val v205: s2 = f86(v161)
    v205
  }
  def f59(v0: s2, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v1.p1
    val v4: s0 = f85(v1)
    var v6: s0 = v4
    var v5: Vector[Vector[Double]] = v2
    v6 = v6.copy(p1 = v2)
    v5 = v2
    v6 = v6.copy(p1 = v2)
    val v18: Vector[Double] = v5(2)
    v5 = v5.updated(0, v18)
    v6 = v6.copy(p1 = v2)
    val v19: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p1 = v5)
    val v66: s0 = s0(v19, v5)
    v66
  }
  def f25(v0: s2, v1: s2): s2 = {
    val v7: Vector[Vector[s0]] = v0.p1
    var v5: s2 = v1
    val v4: Vector[s0] = v7(0)
    v5 = v5.copy(p1 = v7)
    val v3: Vector[s0] = v7(0)
    var v2: Vector[Vector[s0]] = v7
    val v8: Vector[Vector[s0]] = v0.p1
    val v12: Vector[s0] = v8(0)
    v2 = v2.updated(0, v4)
    v2 = v2.updated(0, v3)
    v2 = v2.updated(0, v12)
    v5 = v5.copy(p1 = v2)
    val v30: s2 = f84(v5)
    v30
  }
  def f22(v0: Double, v1: Vector[Vector[s0]], v2: s2): Double = {
    val v13: s2 = f25(v2, v2)
    val v9: Vector[s1] = v13.p0
    val v17: s1 = v9(0)
    val v15: Vector[Vector[s0]] = v17.p0
    val v18: Vector[s0] = v15(1)
    val v34: s0 = v18(0)
    val v16: s0 = f85(v34)
    val v36: Vector[Vector[Double]] = v16.p1
    val v58: Vector[Double] = v36(0)
    val v76: Double = v58(0)
    v76
  }
  @noinline
  def f0(v0: s0, v1: s1, v2: s2, v3: Vector[Vector[s0]], v4: Double): Double = {
    val v6: Vector[Vector[Double]] = v0.p0
    var v9: Vector[Vector[Double]] = v6
    val v7: s0 = v1.p1
    val v20: s0 = f59(v2, v7)
    val v13: s2 = f25(v2, v2)
    val v16: s2 = f84(v13)
    val v19: Vector[Double] = v9(0)
    var v30: Double = v4
    v9 = v9.updated(0, v19)
    v30 = v4
    v30 = v4
    var v34: Vector[Double] = v19
    val v32: Double = v34(0)
    val v31: Vector[Vector[Double]] = v20.p1
    val v45: Vector[Double] = v9(0)
    v9 = v9.updated(0, v19)
    val v66: Vector[Double] = v31(0)
    val v84: Double = f22(v32, v3, v16)
    val v46: Double = v4 + v84
    v9 = v9.updated(0, v34)
    var v72: Double = v46
    v34 = v45
    val v138: Double = v46 / v72
    v34 = v34.updated(0, v30)
    v9 = v9.updated(0, v66)
    v34 = v34.updated(0, v84)
    v34 = v34.updated(0, v72)
    v138
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))
    val v1: s1 = s1(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v2: s2 = s2(Vector(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s1(Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))))
    val v3: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))
    val v4: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}