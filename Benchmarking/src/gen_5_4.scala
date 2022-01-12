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
  def f34(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v2, v5, v2, v2, v5)
    var v4: Vector[Vector[Double]] = v7
    var v3: s0 = v0
    var v8: Vector[Vector[Vector[Double]]] = v6
    v3 = v3.copy(p1 = v7)
    val v1: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p1 = v4)
    v3 = v3.copy(p0 = v5)
    val v18: Vector[Double] = v7(0)
    var v26: Vector[Vector[Double]] = v4
    val v12: s0 = s0(v1, v26)
    var v16: Vector[Vector[Vector[Double]]] = v8
    v3 = v3.copy(p0 = v2)
    v8 = v8.updated(5, v5)
    val v11: Vector[Vector[Double]] = v3.p0
    var v43: Vector[Vector[Vector[Double]]] = v16
    v43 = v43.updated(5, v11)
    v8 = v8.updated(6, v11)
    var v14: s0 = v3
    var v46: s0 = v14
    val v19: Vector[Vector[Double]] = v14.p1
    v26 = v26.updated(0, v18)
    val v35: Vector[Vector[Double]] = v43(1)
    v8 = v8.updated(5, v11)
    val v28: Vector[Double] = v5(0)
    v3 = v3.copy(p1 = v19)
    val v52: s1 = s1(v46, v12)
    val v49: Vector[Double] = v11(1)
    val v98: Vector[Vector[Double]] = v43(0)
    val v65: Vector[Vector[Double]] = v6(3)
    v3 = v3.copy(p0 = v35)
    var v58: s0 = v12
    v3 = v3.copy(p0 = v11)
    v58 = v58.copy(p0 = v98)
    v26 = v26.updated(0, v49)
    v14 = v14.copy(p0 = v5)
    var v60: s1 = v52
    v46 = v46.copy(p0 = v65)
    v60 = v60.copy(p0 = v58)
    v26 = v26.updated(0, v28)
    val v87: s0 = v60.p0
    v87
  }
  def f33(v0: Double): Double = {
    var v8: Double = v0
    var v4: Double = v0
    var v2: Double = v8
    var v3: Double = v2
    var v11: Double = v4
    var v5: Double = v0
    val v27: Double = v11 * v3
    var v28: Double = v0
    val v16: Vector[Double] = Vector(v5, v28)
    val v17: Double = v16(0)
    v4 = v5
    v2 = v17
    v27
  }
  def f30(v0: s1): s1 = {
    var v6: s1 = v0
    var v3: s1 = v0
    var v4: s1 = v3
    val v5: Vector[s1] = Vector(v3, v3, v4, v3)
    val v2: Vector[Vector[s1]] = Vector(v5, v5, v5, v5, v5, v5)
    val v1: s0 = v6.p0
    val v12: s0 = v4.p0
    val v15: s0 = v6.p1
    var v10: s1 = v6
    var v11: s0 = v15
    val v25: s0 = v3.p0
    val v24: s0 = f34(v1)
    val v31: s0 = f34(v11)
    val v30: s0 = v4.p1
    val v21: s0 = f34(v31)
    v10 = v10.copy(p1 = v24)
    v6 = v6.copy(p1 = v21)
    v6 = v6.copy(p0 = v11)
    val v29: s0 = f34(v12)
    val v51: s0 = v4.p1
    val v84: Vector[Vector[Double]] = v51.p1
    v10 = v10.copy(p0 = v12)
    var v37: s1 = v10
    val v43: Vector[s1] = v2(0)
    val v49: s0 = f34(v31)
    v3 = v3.copy(p1 = v25)
    v4 = v4.copy(p0 = v49)
    val v41: s0 = f34(v51)
    v11 = v11.copy(p1 = v84)
    val v47: s0 = f34(v1)
    val v104: s0 = v37.p0
    val v94: s0 = v3.p1
    val v54: s0 = f34(v94)
    v4 = v4.copy(p0 = v47)
    val v110: Vector[Vector[Double]] = v30.p1
    v4 = v6
    v4 = v37
    v6 = v6.copy(p1 = v29)
    val v154: Vector[Vector[Double]] = v41.p0
    v37 = v37.copy(p0 = v31)
    v11 = v11.copy(p0 = v154)
    v11 = v11.copy(p1 = v110)
    v6 = v4
    v4 = v4.copy(p0 = v25)
    val v129: s1 = v43(3)
    v3 = v3.copy(p0 = v54)
    v4 = v4.copy(p0 = v47)
    v10 = v10.copy(p0 = v104)
    v129
  }
  def f25(v0: s0): s0 = {
    val v7: s0 = f34(v0)
    val v10: s0 = f34(v0)
    var v19: s0 = v0
    val v25: Vector[Vector[Double]] = v7.p1
    val v29: s0 = f34(v19)
    val v17: Vector[s0] = Vector(v29, v10, v19, v29, v29)
    var v72: Vector[s0] = v17
    v19 = v19.copy(p1 = v25)
    val v54: s0 = v72(2)
    v54
  }
  def f21(v0: s0): s0 = {
    var v6: s0 = v0
    val v4: s0 = f34(v0)
    val v10: s0 = f25(v0)
    val v20: Vector[Vector[Double]] = v4.p0
    v6 = v6.copy(p0 = v20)
    val v30: s1 = s1(v10, v6)
    var v84: s1 = v30
    var v63: s1 = v84
    val v151: s0 = v63.p1
    v63 = v63.copy(p0 = v4)
    val v100: s0 = f34(v151)
    v100
  }
  def f10(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v2: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p1
    val v8: s0 = f34(v2)
    val v9: s0 = f21(v0)
    val v6: s0 = s0(v5, v4)
    val v1: Vector[Double] = v5(1)
    val v12: s0 = f21(v9)
    val v13: s0 = f25(v12)
    val v3: Vector[Vector[Double]] = v9.p1
    v2 = v2.copy(p1 = v3)
    val v15: Vector[Vector[Double]] = v8.p0
    v2 = v2.copy(p0 = v15)
    val v18: Vector[Vector[Double]] = v8.p0
    v2 = v2.copy(p1 = v4)
    val v17: Vector[Vector[Double]] = v9.p0
    var v25: s0 = v0
    val v27: s0 = f21(v25)
    val v30: Vector[Vector[Double]] = v12.p1
    v2 = v2.copy(p1 = v30)
    val v37: Vector[Vector[Double]] = v27.p0
    val v51: Vector[Vector[Double]] = v6.p0
    v2 = v2.copy(p0 = v5)
    var v44: Vector[Vector[Double]] = v18
    v25 = v25.copy(p1 = v30)
    v2 = v27
    v25 = v25.copy(p1 = v3)
    val v47: Vector[Vector[Double]] = v13.p0
    val v31: s0 = f21(v2)
    v25 = v25.copy(p0 = v51)
    v2 = v2.copy(p0 = v18)
    v2 = v2.copy(p0 = v51)
    var v48: s0 = v31
    v25 = v25.copy(p0 = v44)
    v25 = v25.copy(p0 = v47)
    var v75: Vector[Vector[Double]] = v4
    val v41: Vector[Double] = v5(1)
    v44 = v44.updated(0, v41)
    var v215: s0 = v0
    var v53: s0 = v48
    val v71: s1 = s1(v53, v53)
    v53 = v53.copy(p0 = v5)
    val v112: s1 = s1(v6, v215)
    v215 = v215.copy(p1 = v75)
    v2 = v2.copy(p1 = v4)
    v75 = v75.updated(0, v1)
    val v198: s0 = v71.p1
    val v84: s0 = v112.p0
    v48 = v48.copy(p0 = v15)
    val v201: Vector[Vector[Double]] = v84.p0
    v2 = v2.copy(p0 = v37)
    v53 = v53.copy(p0 = v201)
    v25 = v25.copy(p0 = v17)
    v198
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v6: s1 = v0
    var v5: s1 = v0
    var v7: Double = v1
    var v4: s1 = v0
    val v3: s0 = v4.p0
    var v9: s1 = v0
    v9 = v9.copy(p0 = v3)
    val v10: s0 = v0.p1
    val v15: s0 = v5.p0
    val v14: s1 = s1(v3, v15)
    val v20: Vector[Vector[Double]] = v3.p1
    var v11: Vector[Vector[Double]] = v20
    val v30: s0 = v9.p0
    v4 = v4.copy(p1 = v30)
    val v24: Vector[Double] = v11(0)
    val v36: s0 = v6.p0
    v11 = v11.updated(0, v24)
    val v27: Vector[Vector[Double]] = v15.p0
    val v22: s0 = f34(v36)
    v11 = v11.updated(0, v24)
    val v61: Vector[Double] = v27(1)
    v6 = v6.copy(p0 = v36)
    v6 = v6.copy(p1 = v22)
    var v41: Vector[Double] = v61
    v41 = v24
    val v34: s0 = f10(v15)
    v5 = v5.copy(p0 = v10)
    val v58: s1 = f30(v14)
    v6 = v6.copy(p0 = v30)
    v9 = v9.copy(p0 = v30)
    val v67: s0 = v4.p0
    val v69: s0 = v58.p0
    v6 = v6.copy(p0 = v22)
    v41 = v41.updated(0, v7)
    val v120: Double = v41(0)
    v5 = v5.copy(p1 = v67)
    v4 = v4.copy(p0 = v69)
    val v71: s0 = f10(v22)
    v4 = v4.copy(p1 = v36)
    v5 = v5.copy(p0 = v71)
    v6 = v6.copy(p0 = v34)
    v4 = v4.copy(p0 = v69)
    v5 = v5.copy(p1 = v15)
    val v102: Double = f33(v120)
    val v140: Double = f33(v102)
    v140
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}