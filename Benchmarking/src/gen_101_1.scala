import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f2(v0: Vector[s0], v1: s0): Vector[s0] = {
    val v4: s0 = v0(1)
    val v6: s0 = v0(1)
    var v2: Vector[s0] = v0
    val v8: Vector[Vector[Double]] = v6.p0
    v2 = v2.updated(1, v1)
    var v12: Vector[s0] = v0
    var v7: s0 = v6
    val v3: Vector[Vector[Double]] = v6.p0
    val v5: Vector[Vector[Double]] = v4.p1
    val v9: Vector[Vector[Double]] = v7.p0
    var v10: Vector[s0] = v12
    val v13: Vector[Double] = v5(0)
    var v25: Vector[Vector[Double]] = v3
    val v22: Double = v13(0)
    var v19: Vector[Vector[Double]] = v9
    var v14: Vector[Vector[Double]] = v25
    var v11: Vector[Vector[Double]] = v14
    val v15: Vector[Vector[Double]] = v7.p1
    val v37: Vector[Vector[Double]] = v1.p1
    var v51: Vector[Vector[Double]] = v37
    val v28: Vector[Vector[Double]] = v4.p1
    var v26: Vector[Double] = v13
    v7 = v7.copy(p0 = v8)
    v7 = v7.copy(p0 = v3)
    v26 = v26.updated(0, v22)
    val v17: Vector[Double] = v14(0)
    v10 = v10.updated(1, v6)
    val v27: Vector[Double] = v51(0)
    v7 = v7.copy(p0 = v19)
    var v60: Double = v22
    var v29: s0 = v7
    val v16: Vector[Vector[Double]] = v7.p1
    v10 = v10.updated(0, v29)
    var v43: Vector[Vector[Double]] = v51
    val v42: Vector[Vector[Double]] = v1.p0
    v7 = v7.copy(p1 = v43)
    val v24: s0 = v12(0)
    val v52: Double = v27(0)
    val v38: Double = v60 + v52
    v29 = v29.copy(p1 = v37)
    v7 = v7.copy(p1 = v5)
    v29 = v29.copy(p1 = v5)
    var v47: s0 = v29
    val v31: Vector[Vector[Double]] = v7.p0
    val v56: Vector[Vector[Double]] = v47.p1
    var v36: s0 = v4
    val v44: Vector[Double] = v15(0)
    v29 = v29.copy(p1 = v51)
    v26 = v26.updated(0, v38)
    val v79: Vector[Vector[Vector[Double]]] = Vector(v5, v16, v51)
    v47 = v47.copy(p0 = v11)
    var v49: Vector[Double] = v44
    var v86: Vector[Vector[Vector[Double]]] = v79
    var v54: Vector[Vector[Double]] = v9
    v2 = v2.updated(0, v47)
    v7 = v7.copy(p1 = v37)
    var v129: Vector[Vector[Double]] = v9
    val v65: s0 = v12(0)
    v47 = v47.copy(p1 = v37)
    v19 = v19.updated(1, v17)
    v26 = v49
    val v63: s0 = v10(1)
    v11 = v11.updated(0, v17)
    v12 = v12.updated(0, v65)
    v51 = v51.updated(0, v26)
    val v150: Vector[Vector[Double]] = v36.p0
    var v96: Vector[s0] = v12
    v2 = v2.updated(0, v65)
    val v69: s0 = v10(1)
    v47 = v63
    v2 = v2.updated(0, v69)
    var v122: Vector[Vector[Vector[Double]]] = v86
    val v100: s0 = s0(v31, v56)
    v96 = v96.updated(1, v100)
    v47 = v47.copy(p0 = v129)
    val v93: Vector[Double] = v150(2)
    v86 = v122
    val v128: Vector[Vector[s0]] = Vector(v96, v96, v12, v10, v0, v0, v2)
    val v82: Vector[s0] = v128(5)
    v19 = v19.updated(1, v93)
    val v53: Vector[Vector[Double]] = v24.p1
    v29 = v29.copy(p1 = v53)
    v7 = v7.copy(p0 = v42)
    val v231: Vector[Vector[s0]] = Vector(v96, v0, v2, v96, v82)
    v7 = v7.copy(p1 = v28)
    val v178: Vector[Vector[Double]] = v86(0)
    v47 = v47.copy(p1 = v178)
    val v201: Vector[s0] = v231(4)
    v12 = v12.updated(1, v69)
    v47 = v47.copy(p0 = v54)
    v201
  }
  def f1(v0: s0, v1: Vector[s0]): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Vector[Double]]] = Vector(v7, v7)
    val v5: s0 = v1(0)
    val v8: Vector[Vector[Double]] = v6(0)
    val v2: Vector[Double] = v8(0)
    val v4: Vector[Vector[Double]] = v6(1)
    val v21: Vector[s0] = f2(v1, v0)
    val v11: Vector[s0] = f2(v21, v0)
    val v9: Vector[Vector[Double]] = v5.p1
    val v13: Vector[Vector[Double]] = v5.p1
    val v14: Vector[s0] = f2(v11, v0)
    val v10: Vector[s0] = f2(v14, v5)
    var v18: s0 = v5
    val v17: Vector[Vector[Double]] = v0.p1
    v18 = v18.copy(p1 = v9)
    val v30: Vector[Double] = v13(0)
    val v31: Vector[s0] = f2(v1, v18)
    val v25: Vector[s0] = f2(v10, v18)
    val v16: Vector[Vector[Double]] = v18.p0
    val v33: Vector[Vector[Double]] = v18.p0
    val v48: s0 = v25(0)
    val v57: Vector[Vector[Double]] = v5.p1
    val v50: Vector[Vector[Double]] = v18.p1
    val v56: Vector[Vector[Double]] = v18.p0
    val v54: s0 = v11(0)
    v18 = v18.copy(p0 = v4)
    var v59: Vector[Vector[Vector[Double]]] = v6
    v18 = v5
    val v71: Vector[Vector[Double]] = v59(1)
    val v53: Vector[s0] = f2(v31, v5)
    val v47: Vector[Vector[Double]] = v54.p1
    v59 = v6
    val v82: s0 = v53(0)
    v18 = v18.copy(p0 = v71)
    var v74: Vector[Vector[Double]] = v33
    v59 = v59.updated(1, v56)
    v18 = v18.copy(p1 = v50)
    v18 = v18.copy(p1 = v57)
    val v126: s0 = s0(v74, v57)
    v18 = v18.copy(p1 = v50)
    v18 = v18.copy(p0 = v7)
    v74 = v74.updated(2, v30)
    v18 = v18.copy(p1 = v17)
    v18 = v18.copy(p1 = v17)
    v18 = v18.copy(p0 = v33)
    v18 = v18.copy(p0 = v74)
    var v105: s0 = v82
    val v195: Vector[Vector[Double]] = v126.p0
    v105 = v105.copy(p0 = v33)
    val v73: Vector[Vector[Double]] = v0.p0
    v105 = v105.copy(p0 = v16)
    v105 = v105.copy(p1 = v47)
    val v76: Vector[s0] = Vector(v18, v0, v105, v5, v48, v48, v5)
    v18 = v18.copy(p0 = v73)
    v105 = v105.copy(p0 = v195)
    var v107: Vector[s0] = v76
    v74 = v74.updated(0, v2)
    var v251: Vector[s0] = v107
    v105 = v105.copy(p0 = v4)
    val v174: s0 = v251(1)
    v105 = v105.copy(p0 = v73)
    v174
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: s0, v3: s0, v4: s0, v5: Vector[s0], v6: s0, v7: Vector[s0], v8: Double): Double = {
    val v9: Vector[Vector[Double]] = v3.p0
    val v17: s0 = v5(0)
    val v13: Vector[s0] = f2(v0, v17)
    val v22: Vector[s0] = f2(v13, v6)
    val v19: s0 = f1(v17, v22)
    val v32: Double = v8 / v8
    val v35: Vector[Vector[Double]] = v19.p1
    val v47: Vector[Double] = v9(2)
    val v28: Vector[Double] = v35(0)
    var v51: Vector[Double] = v28
    v51 = v51.updated(0, v8)
    v51 = v51.updated(0, v32)
    val v134: Double = v51(0)
    v51 = v47
    v134
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
    val v2: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))
    val v3: s0 = s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))
    val v4: s0 = s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))
    val v5: Vector[s0] = Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))
    val v6: s0 = s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))
    val v7: Vector[s0] = Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))
    val v8: Double = 44.0
    val start = nanoTime()
    var result: Double = 44.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}