import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
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
    p1: s1,
    p2: s0
  )
  case class s7 (
    p0: s2,
    p1: s1
  )
  def f38(v0: Vector[s1]): Vector[s1] = {
    val v1: s1 = v0(1)
    var v4: s1 = v1
    val v6: s1 = v0(1)
    val v8: s1 = v0(1)
    val v3: s1 = v0(1)
    val v7: s0 = v3.p1
    val v9: Vector[Vector[Double]] = v7.p1
    val v21: Vector[Vector[Double]] = v7.p1
    val v25: s1 = v0(2)
    val v18: s0 = v4.p0
    var v39: Vector[s1] = v0
    v39 = v39.updated(2, v25)
    val v22: s0 = s0(v9, v21)
    var v46: Vector[s1] = v0
    val v60: s0 = v4.p1
    val v29: s1 = v39(2)
    val v41: s0 = v8.p0
    v4 = v4.copy(p1 = v18)
    var v37: Vector[s1] = v0
    var v57: Vector[s1] = v37
    v4 = v4.copy(p1 = v60)
    v4 = v4.copy(p1 = v41)
    var v47: Vector[s1] = v39
    v47 = v47.updated(0, v6)
    val v76: Vector[s1] = Vector(v8, v6)
    val v28: s1 = v46(0)
    v37 = v37.updated(1, v4)
    val v79: s1 = v76(0)
    val v73: s1 = v76(0)
    var v113: Vector[s1] = v76
    var v126: Vector[s1] = v113
    val v43: s0 = v29.p0
    var v72: Vector[s1] = v57
    v4 = v4.copy(p1 = v7)
    v72 = v72.updated(0, v8)
    var v81: Vector[s1] = v72
    val v130: s1 = v47(0)
    v72 = v72.updated(1, v28)
    val v134: s1 = v126(1)
    val v127: s1 = v72(0)
    v4 = v4.copy(p1 = v22)
    v57 = v57.updated(2, v134)
    v37 = v37.updated(0, v73)
    v46 = v46.updated(0, v73)
    v47 = v47.updated(1, v127)
    v57 = v81
    val v218: Vector[Vector[s1]] = Vector(v0, v47, v72, v81, v57, v47)
    v4 = v4.copy(p0 = v43)
    v37 = v37.updated(2, v79)
    v37 = v37.updated(2, v130)
    val v186: Vector[s1] = v218(2)
    v186
  }
  def f23(v0: s1): s1 = {
    val v1: s0 = v0.p1
    val v8: Vector[Vector[Double]] = v1.p1
    val v5: s0 = s0(v8, v8)
    var v2: s0 = v5
    var v9: s0 = v2
    var v14: s0 = v1
    var v10: s1 = v0
    val v11: Vector[Vector[Double]] = v14.p1
    v14 = v1
    var v19: s1 = v10
    var v24: s0 = v14
    val v22: s0 = v0.p1
    val v36: s0 = v19.p0
    var v18: s0 = v36
    val v17: Vector[Vector[Double]] = v36.p1
    var v27: s1 = v0
    var v50: s0 = v24
    v14 = v14.copy(p0 = v11)
    val v65: Vector[Vector[Double]] = v22.p0
    v9 = v9.copy(p0 = v17)
    v14 = v14.copy(p0 = v11)
    v2 = v2.copy(p0 = v65)
    val v53: s0 = v0.p1
    v2 = v2.copy(p0 = v17)
    val v35: Vector[Vector[Double]] = v53.p1
    v19 = v10
    v18 = v18.copy(p0 = v35)
    v10 = v10.copy(p0 = v18)
    v2 = v2.copy(p1 = v35)
    var v58: Vector[Vector[Double]] = v8
    v18 = v18.copy(p0 = v35)
    v50 = v24
    v18 = v18.copy(p0 = v58)
    v27 = v27.copy(p1 = v50)
    val v56: s3 = s3(v27, v27, v9)
    v14 = v14.copy(p1 = v11)
    val v63: s1 = v56.p1
    v63
  }
  def f16(v0: s2): s2 = {
    var v4: s2 = v0
    var v6: s2 = v4
    val v5: s0 = v4.p1
    val v9: Vector[Vector[Double]] = v5.p1
    val v3: s0 = s0(v9, v9)
    v6 = v6.copy(p1 = v3)
    v4 = v4.copy(p1 = v3)
    v6
  }
  def f1(v0: s0): s0 = {
    var v7: s0 = v0
    val v4: s1 = s1(v0, v7)
    val v3: s1 = f23(v4)
    val v1: s1 = f23(v3)
    var v2: s0 = v0
    val v6: s1 = f23(v1)
    var v9: s0 = v2
    var v10: s0 = v0
    val v20: s1 = f23(v3)
    val v13: s1 = f23(v6)
    val v5: s1 = f23(v13)
    val v11: Vector[Vector[Double]] = v0.p1
    v9 = v9.copy(p0 = v11)
    v7 = v7.copy(p0 = v11)
    var v18: s1 = v4
    val v12: s1 = f23(v1)
    val v22: s0 = s0(v11, v11)
    var v27: s0 = v2
    val v14: s1 = f23(v18)
    var v19: Vector[Vector[Double]] = v11
    val v16: s1 = f23(v18)
    v2 = v2.copy(p0 = v19)
    val v33: Vector[Double] = v11(0)
    var v45: Vector[Double] = v33
    val v55: s0 = v20.p0
    val v42: Vector[Double] = v11(0)
    val v34: Vector[Vector[Double]] = v27.p0
    val v44: Vector[s1] = Vector(v5, v12, v16)
    v10 = v22
    val v52: Double = v42(0)
    v9 = v9.copy(p1 = v34)
    val v39: Vector[Vector[Double]] = v10.p1
    val v43: Vector[Vector[Double]] = v9.p1
    var v62: Vector[Vector[Double]] = v34
    var v66: Vector[s1] = v44
    val v90: s1 = f23(v14)
    v19 = v19.updated(0, v33)
    val v69: Vector[Vector[Double]] = v0.p0
    val v51: Vector[s1] = f38(v66)
    v45 = v45.updated(0, v52)
    v19 = v19.updated(0, v45)
    v2 = v2.copy(p0 = v69)
    val v82: Vector[Vector[s1]] = Vector(v66, v51, v66, v66)
    val v102: Vector[Double] = v11(0)
    v66 = v66.updated(1, v18)
    var v54: Vector[Vector[s1]] = v82
    v7 = v7.copy(p0 = v39)
    v2 = v2.copy(p0 = v19)
    var v172: Vector[s1] = v51
    v66 = v66.updated(1, v90)
    val v145: s0 = v16.p1
    val v97: Vector[s1] = v54(1)
    var v151: Vector[Double] = v102
    v18 = v18.copy(p0 = v55)
    v2 = v2.copy(p1 = v69)
    v66 = v172
    v172 = v97
    v7 = v7.copy(p1 = v62)
    v18 = v18.copy(p0 = v145)
    v10 = v10.copy(p0 = v34)
    val v118: s1 = v172(2)
    v45 = v151
    val v163: s0 = v118.p0
    v2 = v2.copy(p1 = v43)
    v10 = v10.copy(p1 = v39)
    v163
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v6: s2 = v0.p0
    val v5: s2 = f16(v6)
    val v2: s2 = f16(v5)
    val v3: s2 = f16(v6)
    val v13: s2 = f16(v5)
    var v10: s2 = v2
    val v18: Vector[s0] = v2.p0
    val v20: s2 = f16(v2)
    val v9: s2 = f16(v10)
    v10 = v10.copy(p0 = v18)
    var v40: s2 = v20
    v10 = v10.copy(p0 = v18)
    val v26: s2 = f16(v13)
    val v19: s0 = v18(0)
    var v31: s2 = v26
    val v30: s0 = v18(0)
    val v22: Vector[s0] = v9.p0
    val v35: s0 = v22(1)
    val v44: s0 = f1(v35)
    val v24: Vector[Vector[Double]] = v19.p0
    val v59: s0 = f1(v35)
    val v28: Vector[Vector[Double]] = v35.p0
    val v25: Vector[Vector[Double]] = v30.p1
    val v23: Vector[Double] = v25(0)
    val v56: s0 = f1(v44)
    v31 = v40
    val v37: s0 = f1(v56)
    v10 = v10.copy(p1 = v35)
    val v53: Vector[Vector[Double]] = v59.p0
    val v38: Vector[Double] = v24(0)
    val v76: Vector[s0] = v6.p0
    val v72: s0 = f1(v37)
    v31 = v31.copy(p1 = v72)
    v10 = v10.copy(p0 = v76)
    val v65: Vector[s0] = v3.p0
    val v82: Vector[Double] = v28(0)
    val v132: Vector[Double] = v53(0)
    val v79: Vector[Vector[Double]] = v30.p0
    val v176: Vector[Double] = v79(0)
    val v192: Vector[Vector[Double]] = Vector(v38, v23, v23, v176, v38, v132, v82)
    val v171: s0 = v65(0)
    v40 = v40.copy(p1 = v171)
    val v174: Vector[s0] = v31.p0
    val v156: Vector[Double] = v192(6)
    val v154: Double = v156(0)
    v10 = v10.copy(p0 = v174)
    v154
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}