import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  def f28(v0: Vector[s0]): Vector[s0] = {
    val v1: s0 = v0(0)
    val v2: Double = v1.p1
    val v6: Double = v2 - v2
    val v8: s0 = v0(0)
    val v7: Vector[Vector[Double]] = v8.p0
    var v3: Vector[Vector[Double]] = v7
    val v5: Vector[Vector[Double]] = v8.p0
    var v10: Vector[Vector[Double]] = v3
    val v21: Vector[Vector[Double]] = v1.p0
    var v9: s0 = v8
    v9 = v9.copy(p0 = v7)
    var v14: Vector[Vector[Double]] = v10
    val v22: Vector[Double] = v14(0)
    val v30: Double = v22(0)
    v14 = v14.updated(0, v22)
    var v16: Vector[s0] = v0
    v16 = v16.updated(0, v9)
    v3 = v5
    var v85: Vector[Double] = v22
    val v40: s0 = v16(0)
    val v57: Vector[Vector[Double]] = v9.p0
    v9 = v9.copy(p1 = v30)
    v16 = v16.updated(0, v9)
    val v52: Vector[Double] = v7(0)
    val v71: Vector[s0] = Vector(v40, v9, v40, v9, v8, v40)
    v3 = v3.updated(0, v52)
    v10 = v10.updated(0, v85)
    var v29: Vector[s0] = v16
    val v114: Double = v9.p1
    v9 = v9.copy(p0 = v57)
    v9 = v9.copy(p0 = v21)
    v16 = v16.updated(0, v40)
    var v38: Vector[s0] = v71
    v9 = v9.copy(p1 = v6)
    v9 = v9.copy(p1 = v114)
    v29 = v29.updated(0, v9)
    val v50: s0 = v38(0)
    v16 = v16.updated(0, v50)
    v29
  }
  def f22(v0: s0): s0 = {
    var v1: s0 = v0
    val v4: Double = v0.p1
    val v7: Double = v1.p1
    val v5: Vector[Double] = Vector(v4, v4, v4, v7, v4, v7)
    v1 = v1.copy(p1 = v7)
    var v18: s0 = v1
    var v14: s0 = v0
    val v16: Double = v5(5)
    v1 = v1.copy(p1 = v16)
    val v13: Vector[s0] = Vector(v14)
    val v11: Vector[s0] = f28(v13)
    v1 = v1.copy(p1 = v16)
    val v21: s0 = v11(0)
    val v24: Vector[Vector[Double]] = v14.p0
    var v15: Vector[Vector[Double]] = v24
    val v30: Vector[Vector[Double]] = v18.p0
    val v28: Vector[Double] = v15(0)
    v14 = v14.copy(p0 = v30)
    val v34: Vector[Vector[Vector[Double]]] = Vector(v24, v24, v15)
    v18 = v18.copy(p0 = v24)
    var v47: s0 = v14
    val v42: Vector[Vector[Double]] = v21.p0
    val v38: Double = v18.p1
    v15 = v15.updated(0, v28)
    var v27: Vector[Vector[Vector[Double]]] = v34
    v15 = v15.updated(0, v28)
    var v25: Vector[Vector[Double]] = v24
    val v41: Vector[Double] = v42(0)
    val v61: s0 = s0(v25, v38)
    val v53: Vector[Vector[Double]] = v47.p0
    val v80: Double = v28(0)
    val v54: Vector[Vector[Double]] = v27(0)
    v18 = v18.copy(p1 = v80)
    val v36: Vector[Double] = v42(0)
    v15 = v15.updated(0, v36)
    val v85: Vector[Vector[Double]] = v0.p0
    var v77: Vector[Vector[Double]] = v85
    var v72: Vector[Vector[Double]] = v15
    val v93: Vector[Vector[Double]] = v27(2)
    v1 = v1.copy(p0 = v54)
    var v91: Vector[Vector[Vector[Double]]] = v27
    var v154: Vector[Vector[Double]] = v93
    val v180: Vector[Vector[Double]] = v91(0)
    v25 = v42
    v154 = v154.updated(0, v41)
    v77 = v72
    v18 = v18.copy(p0 = v77)
    v27 = v27.updated(2, v154)
    v15 = v53
    v154 = v180
    v61
  }
  def f6(v0: s0): s0 = {
    val v2: s0 = f22(v0)
    var v7: s0 = v2
    val v5: s0 = f22(v2)
    val v4: s0 = f22(v7)
    var v3: s0 = v5
    var v9: s0 = v4
    var v6: s0 = v7
    val v8: Double = v7.p1
    val v1: Vector[Vector[Double]] = v2.p0
    val v11: s0 = f22(v2)
    v7 = v7.copy(p0 = v1)
    val v15: Double = v6.p1
    val v23: Double = v11.p1
    val v10: Vector[Vector[Double]] = v4.p0
    val v16: Vector[Double] = v10(0)
    val v14: s0 = s0(v1, v8)
    val v17: s0 = f22(v3)
    var v25: Vector[Double] = v16
    val v18: Vector[Vector[Double]] = v0.p0
    val v12: s0 = f22(v2)
    v25 = v16
    val v35: Double = v9.p1
    val v19: Double = v16(0)
    v25 = v25.updated(0, v15)
    v25 = v25.updated(0, v19)
    val v29: Vector[Double] = v18(0)
    v6 = v6.copy(p1 = v23)
    val v39: s0 = f22(v11)
    val v46: Vector[Double] = v1(0)
    val v27: s0 = f22(v0)
    var v68: Vector[Double] = v29
    val v44: Vector[Vector[Double]] = v12.p0
    val v45: Vector[Double] = v1(0)
    val v26: Vector[Vector[Double]] = v12.p0
    v3 = v3.copy(p1 = v35)
    v3 = v3.copy(p0 = v10)
    val v57: s0 = f22(v39)
    v25 = v25.updated(0, v19)
    val v49: Vector[Vector[Double]] = v11.p0
    v25 = v25.updated(0, v15)
    val v40: Vector[s0] = Vector(v4, v27, v2, v14, v5, v3, v57)
    v25 = v25.updated(0, v35)
    val v28: Double = v16(0)
    v68 = v68.updated(0, v28)
    v68 = v68.updated(0, v15)
    val v87: s0 = s0(v49, v8)
    val v43: Double = v4.p1
    v25 = v25.updated(0, v19)
    v25 = v25.updated(0, v19)
    v7 = v7.copy(p0 = v26)
    val v80: Vector[Double] = v10(0)
    var v51: Vector[Double] = v45
    val v36: Double = v17.p1
    v9 = v9.copy(p1 = v8)
    val v48: Double = v87.p1
    var v83: Vector[Vector[Double]] = v26
    v83 = v83.updated(0, v46)
    v51 = v51.updated(0, v8)
    val v93: Double = v51(0)
    v7 = v7.copy(p0 = v83)
    val v74: s0 = f22(v27)
    v51 = v51.updated(0, v28)
    v6 = v6.copy(p1 = v93)
    val v62: s0 = v40(3)
    v51 = v51.updated(0, v48)
    var v108: Vector[s0] = v40
    v3 = v3.copy(p1 = v35)
    val v137: s0 = s0(v44, v43)
    var v139: Vector[s0] = v108
    v25 = v25.updated(0, v36)
    val v158: s0 = f22(v137)
    v83 = v83.updated(0, v68)
    v83 = v83.updated(0, v25)
    val v194: s0 = v108(1)
    v108 = v108.updated(1, v5)
    val v141: Vector[Vector[Double]] = v62.p0
    v9 = v9.copy(p1 = v23)
    val v150: s0 = f22(v74)
    v108 = v139
    v108 = v108.updated(1, v158)
    v6 = v6.copy(p0 = v141)
    v108 = v108.updated(2, v150)
    v51 = v51.updated(0, v8)
    v6 = v6.copy(p1 = v48)
    v83 = v83.updated(0, v80)
    v194
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v4: s0 = v0
    val v7: Double = v1 - v1
    val v6: Vector[Vector[Double]] = v4.p0
    v4 = v0
    val v3: Vector[Double] = v6(0)
    val v5: s0 = f22(v0)
    val v2: Double = v4.p1
    val v12: Double = v7 + v2
    var v14: Vector[Vector[Double]] = v6
    v14 = v14.updated(0, v3)
    var v8: Vector[Double] = v3
    val v9: Vector[Double] = v14(0)
    v8 = v8.updated(0, v2)
    val v11: s0 = f6(v4)
    v4 = v4.copy(p1 = v2)
    val v15: s0 = s0(v14, v12)
    val v13: Vector[Double] = v14(0)
    val v20: s0 = f6(v11)
    val v33: Vector[Vector[Double]] = v20.p0
    var v21: Vector[Vector[Double]] = v6
    val v18: Vector[s0] = Vector(v4, v20, v20, v11, v15, v4)
    val v19: Vector[Double] = v6(0)
    val v24: Vector[Double] = v33(0)
    val v37: Vector[Vector[Double]] = v11.p0
    val v16: Double = v9(0)
    v4 = v4.copy(p1 = v1)
    var v46: Vector[Vector[Double]] = v21
    v8 = v8.updated(0, v1)
    v14 = v14.updated(0, v8)
    var v73: Vector[Double] = v24
    v4 = v4.copy(p0 = v46)
    v4 = v4.copy(p0 = v21)
    v4 = v4.copy(p0 = v46)
    val v36: Vector[Vector[Double]] = Vector(v73)
    val v55: s0 = v18(1)
    val v27: Double = v55.p1
    v73 = v73.updated(0, v2)
    val v35: s0 = v18(5)
    val v38: Double = v9(0)
    v4 = v4.copy(p1 = v16)
    v21 = v21.updated(0, v73)
    v8 = v8.updated(0, v1)
    v14 = v14.updated(0, v19)
    val v51: Double = v35.p1
    v8 = v8.updated(0, v1)
    v4 = v4.copy(p1 = v27)
    v4 = v4.copy(p0 = v36)
    val v31: s0 = f22(v5)
    val v67: Vector[Vector[Double]] = v15.p0
    v4 = v4.copy(p0 = v33)
    val v75: Double = v31.p1
    v4 = v4.copy(p0 = v36)
    v4 = v4.copy(p0 = v37)
    v8 = v8.updated(0, v1)
    var v104: Double = v38
    val v110: Vector[Vector[Double]] = v11.p0
    var v120: Double = v75
    v4 = v4.copy(p1 = v104)
    v4 = v4.copy(p0 = v110)
    var v88: Double = v120
    v4 = v4.copy(p0 = v37)
    val v130: Double = v1 - v51
    v4 = v4.copy(p0 = v67)
    v4 = v4.copy(p0 = v110)
    v4 = v4.copy(p1 = v88)
    v4 = v4.copy(p1 = v38)
    v21 = v21.updated(0, v13)
    v130
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), 1.0)
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}