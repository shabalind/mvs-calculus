import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  def f11(v0: s0, v1: s0): s0 = {
    val v10: Vector[Double] = v1.p1
    val v8: Vector[Vector[Double]] = v1.p0
    var v16: Vector[Double] = v10
    var v42: s0 = v0
    val v12: Vector[Vector[Double]] = v42.p0
    v42 = v42.copy(p0 = v8)
    val v47: s0 = s0(v12, v16)
    v47
  }
  def f8(v0: s0): s0 = {
    var v1: s0 = v0
    val v5: s0 = f11(v0, v0)
    var v7: s0 = v1
    val v3: s0 = f11(v7, v1)
    var v6: s0 = v1
    val v9: s0 = f11(v3, v0)
    var v8: s0 = v5
    val v16: Vector[s0] = Vector(v0, v3, v8, v3, v9, v7)
    val v12: Vector[Vector[Double]] = v1.p0
    val v4: s0 = f11(v8, v9)
    v1 = v3
    val v2: Vector[Double] = v3.p1
    v1 = v1.copy(p1 = v2)
    val v11: s0 = f11(v0, v6)
    val v15: s0 = f11(v5, v6)
    var v18: Vector[s0] = v16
    var v21: Vector[Vector[Double]] = v12
    val v13: Vector[Vector[Double]] = v5.p0
    val v10: s0 = f11(v11, v7)
    val v17: s0 = v16(5)
    var v23: Vector[s0] = v16
    var v27: Vector[Vector[Double]] = v21
    v18 = v18.updated(1, v17)
    val v14: Vector[Vector[Double]] = v0.p0
    val v22: Vector[Double] = v10.p1
    val v19: Double = v2(1)
    v23 = v23.updated(4, v5)
    v8 = v8.copy(p1 = v22)
    v23 = v18
    val v42: s0 = f11(v6, v4)
    val v40: s0 = f11(v9, v8)
    val v58: s0 = f11(v3, v0)
    val v52: s0 = s0(v14, v22)
    v23 = v23.updated(2, v58)
    v18 = v23
    val v35: Vector[Double] = v7.p1
    var v72: Vector[s0] = v23
    var v46: Vector[Vector[Double]] = v27
    v7 = v7.copy(p0 = v46)
    val v82: s0 = f11(v6, v42)
    v6 = v6.copy(p0 = v14)
    v7 = v7.copy(p1 = v35)
    var v26: s0 = v7
    v72 = v72.updated(0, v26)
    val v38: Vector[Vector[Double]] = v26.p0
    v6 = v6.copy(p0 = v38)
    val v39: s0 = f11(v8, v1)
    val v44: s0 = f11(v0, v52)
    val v65: s0 = f11(v15, v52)
    v23 = v16
    val v32: Vector[Vector[Double]] = v9.p0
    v23 = v23.updated(5, v7)
    v18 = v16
    val v60: Vector[Vector[Double]] = v39.p0
    val v98: Vector[Double] = v13(0)
    val v66: Vector[Vector[Double]] = v3.p0
    v27 = v27.updated(0, v98)
    v8 = v40
    val v86: Vector[Double] = v66(0)
    v8 = v8.copy(p0 = v60)
    v23 = v23.updated(0, v44)
    v1 = v1.copy(p0 = v14)
    var v57: Double = v19
    val v92: Vector[Double] = v4.p1
    v23 = v23.updated(4, v17)
    v27 = v27.updated(0, v98)
    val v96: Vector[Vector[Double]] = v39.p0
    v26 = v26.copy(p0 = v96)
    v8 = v65
    v27 = v27.updated(0, v86)
    val v64: Vector[Double] = v39.p1
    v8 = v8.copy(p0 = v66)
    var v205: Vector[Double] = v98
    v27 = v27.updated(0, v205)
    val v70: s0 = f11(v1, v11)
    val v147: Vector[Double] = v6.p1
    v18 = v18.updated(0, v82)
    v205 = v205.updated(0, v57)
    v6 = v6.copy(p1 = v64)
    val v187: s0 = v72(2)
    val v284: Vector[Double] = v70.p1
    v8 = v8.copy(p1 = v284)
    val v362: s0 = f11(v4, v187)
    v7 = v7.copy(p1 = v147)
    v6 = v6.copy(p1 = v92)
    v6 = v6.copy(p0 = v32)
    v362
  }
  def f6(v0: s0, v1: s0): s0 = {
    val v2: Vector[Vector[Double]] = v1.p0
    val v5: s0 = f8(v0)
    val v6: Vector[Double] = v2(0)
    val v3: Vector[Double] = v0.p1
    var v11: s0 = v1
    v11 = v11.copy(p1 = v3)
    val v12: s0 = f8(v11)
    val v8: s0 = f11(v5, v5)
    val v4: s0 = s0(v2, v3)
    val v9: Vector[Vector[Double]] = v4.p0
    val v13: s0 = s0(v2, v3)
    var v16: Vector[Vector[Double]] = v9
    v16 = v16.updated(0, v6)
    val v17: s0 = f11(v4, v8)
    val v15: s0 = f8(v17)
    v16 = v16.updated(0, v6)
    v11 = v11.copy(p1 = v3)
    val v42: s0 = f11(v15, v13)
    v11 = v11.copy(p0 = v16)
    val v32: s0 = f11(v12, v42)
    val v47: Vector[Vector[Double]] = v1.p0
    val v72: s0 = f11(v32, v17)
    val v86: s0 = f8(v72)
    var v104: Vector[Vector[Double]] = v47
    v11 = v11.copy(p0 = v104)
    val v126: s0 = f8(v86)
    val v114: s0 = f8(v126)
    v114
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: s0 = f8(v0)
    var v6: s0 = v0
    val v4: Vector[Double] = v0.p1
    val v2: s0 = f11(v6, v6)
    val v7: Vector[Vector[Double]] = v3.p0
    val v10: s0 = f11(v6, v0)
    var v18: s0 = v6
    var v8: Vector[Vector[Double]] = v7
    val v11: s0 = s0(v8, v4)
    val v23: Vector[Vector[Double]] = v3.p0
    val v15: Vector[Vector[Double]] = v2.p0
    var v19: s0 = v18
    val v12: s0 = f8(v2)
    val v17: Vector[Double] = v8(0)
    v18 = v18.copy(p1 = v4)
    val v20: Vector[Double] = v7(0)
    val v24: Vector[Double] = v11.p1
    var v39: Vector[Vector[Double]] = v7
    val v21: Vector[Vector[Double]] = v12.p0
    val v31: Vector[Vector[Double]] = v18.p0
    val v41: Vector[Double] = v39(0)
    val v29: s0 = f8(v19)
    var v33: Vector[Double] = v20
    var v26: Vector[Vector[Double]] = v39
    val v30: Double = v33(0)
    v33 = v33.updated(0, v1)
    var v32: Vector[Double] = v24
    v32 = v32.updated(1, v30)
    v19 = v19.copy(p0 = v23)
    val v46: Vector[Double] = v21(0)
    v18 = v18.copy(p0 = v15)
    v6 = v6.copy(p1 = v24)
    v6 = v6.copy(p1 = v32)
    v18 = v18.copy(p0 = v8)
    val v99: Vector[Vector[Double]] = v10.p0
    val v59: s0 = f6(v3, v3)
    val v68: Double = v4(1)
    val v71: Double = v68 + v1
    val v53: s0 = f6(v2, v59)
    v33 = v33.updated(0, v71)
    val v50: Vector[Double] = v11.p1
    v18 = v18.copy(p0 = v7)
    var v63: Vector[Double] = v17
    val v45: Vector[Double] = v11.p1
    v6 = v6.copy(p0 = v39)
    v39 = v39.updated(0, v63)
    v18 = v18.copy(p0 = v23)
    val v113: Double = v46(0)
    val v90: Double = v17(0)
    v6 = v6.copy(p1 = v45)
    v6 = v6.copy(p0 = v31)
    val v47: s0 = s0(v99, v45)
    val v137: s0 = f11(v53, v29)
    v26 = v99
    val v66: Vector[Vector[Double]] = v47.p0
    v18 = v18.copy(p1 = v45)
    val v92: s0 = f6(v137, v3)
    v33 = v33.updated(0, v90)
    v6 = v6.copy(p0 = v39)
    val v139: Vector[Double] = v92.p1
    v63 = v41
    val v143: Vector[Double] = v26(0)
    v19 = v19.copy(p0 = v8)
    v8 = v66
    v6 = v6.copy(p1 = v139)
    v8 = v8.updated(0, v33)
    v6 = v6.copy(p1 = v45)
    v19 = v19.copy(p1 = v50)
    v8 = v8.updated(0, v143)
    v113
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(1.0, 2.0))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}