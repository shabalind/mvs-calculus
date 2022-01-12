import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f51(v0: Vector[Double], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v1
    val v9: Vector[Double] = v1(0)
    v3 = v3.updated(1, v9)
    v3
  }
  def f47(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v0
    val v6: Vector[Double] = v3(0)
    var v1: Vector[Vector[Double]] = v3
    var v4: Vector[Vector[Double]] = v1
    var v8: Vector[Vector[Double]] = v0
    var v5: Vector[Double] = v6
    v1 = v1.updated(0, v5)
    val v27: Vector[Double] = v1(2)
    var v20: Vector[Vector[Double]] = v8
    var v2: Vector[Vector[Double]] = v4
    val v32: Vector[Double] = v4(1)
    var v28: Vector[Double] = v27
    v3 = v3.updated(0, v32)
    v3 = v3.updated(2, v32)
    val v81: Vector[Double] = v2(1)
    v5 = v28
    val v74: Vector[Vector[Vector[Double]]] = Vector(v8, v1, v20)
    v3 = v3.updated(0, v81)
    var v78: Vector[Vector[Vector[Double]]] = v74
    val v98: Vector[Vector[Double]] = v78(1)
    v98
  }
  def f44(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v6: Vector[Vector[Double]] = v0
    val v7: Vector[Double] = v0(1)
    val v1: Vector[Vector[Double]] = f47(v6)
    var v4: Vector[Double] = v7
    var v9: Vector[Vector[Double]] = v6
    v6 = v6.updated(1, v7)
    val v17: Vector[Vector[Double]] = f47(v0)
    var v12: Vector[Vector[Double]] = v17
    val v13: Vector[Vector[Double]] = f47(v0)
    val v10: Vector[Double] = v1(2)
    val v16: Vector[Vector[Double]] = f47(v0)
    v9 = v9.updated(1, v4)
    val v11: Vector[Vector[Double]] = f47(v9)
    v12 = v12.updated(2, v10)
    val v26: Vector[Double] = v13(2)
    v9 = v9.updated(2, v26)
    val v64: Vector[Vector[Double]] = f47(v16)
    val v56: Vector[Vector[Vector[Double]]] = Vector(v11, v1, v6, v16, v13, v1, v12)
    var v38: Vector[Vector[Vector[Double]]] = v56
    v38 = v38.updated(4, v64)
    var v142: Vector[Vector[Vector[Double]]] = v38
    val v139: Vector[Vector[Double]] = v142(1)
    v142 = v142.updated(3, v139)
    v139
  }
  def f43(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(0)
    val v8: Vector[Vector[Double]] = f44(v0)
    val v5: Vector[Double] = v8(1)
    var v12: Vector[Vector[Double]] = v8
    val v27: Vector[Double] = v12(1)
    var v14: Vector[Vector[Double]] = v8
    val v24: Double = v4(0)
    val v25: Vector[Vector[Double]] = f47(v8)
    val v36: Vector[Vector[Double]] = f44(v25)
    val v41: Vector[Double] = v36(2)
    var v30: Double = v24
    var v64: Double = v30
    v14 = v14.updated(1, v41)
    var v97: Vector[Double] = v27
    var v70: Double = v64
    v14 = v14.updated(0, v4)
    v97 = v97.updated(0, v70)
    val v194: Vector[Double] = v14(2)
    var v85: Vector[Double] = v194
    v12 = v12.updated(0, v5)
    val v140: Vector[Vector[Double]] = Vector(v27, v97, v85)
    v97 = v97.updated(0, v30)
    val v102: Vector[Vector[Double]] = f44(v140)
    v102
  }
  def f42(v0: Double): Double = {
    var v1: Double = v0
    var v6: Double = v1
    v6 = v0
    val v8: Vector[Double] = Vector(v6)
    val v19: Vector[Vector[Double]] = Vector(v8, v8, v8, v8)
    var v15: Vector[Vector[Double]] = v19
    val v18: Vector[Vector[Vector[Double]]] = Vector(v15, v15, v15, v15, v19, v15)
    val v11: Vector[Vector[Double]] = v18(4)
    val v20: Vector[Double] = v15(3)
    val v13: Vector[Double] = v11(3)
    v15 = v15.updated(1, v13)
    val v29: Vector[Vector[Double]] = Vector(v13, v8, v8, v13, v20)
    var v53: Vector[Vector[Double]] = v29
    val v37: Vector[Double] = v53(0)
    v15 = v15.updated(2, v8)
    var v42: Vector[Double] = v37
    v15 = v15.updated(3, v20)
    var v40: Vector[Double] = v13
    v53 = v53.updated(2, v8)
    val v67: Vector[Vector[Vector[Double]]] = Vector(v29, v53, v53, v29, v53)
    val v44: Vector[Vector[Double]] = v67(2)
    var v38: Vector[Vector[Vector[Double]]] = v67
    v15 = v15.updated(1, v42)
    var v90: Vector[Vector[Double]] = v53
    val v70: Vector[Vector[Double]] = v38(2)
    val v92: Vector[Double] = v53(4)
    val v78: Vector[Vector[Vector[Double]]] = Vector(v44, v70, v29)
    v90 = v90.updated(3, v92)
    var v132: Vector[Vector[Vector[Double]]] = v78
    val v59: Vector[Vector[Double]] = v132(2)
    v53 = v53.updated(0, v40)
    v53 = v53.updated(4, v13)
    v132 = v132.updated(1, v90)
    v15 = v15.updated(1, v92)
    var v58: Vector[Vector[Double]] = v59
    v53 = v53.updated(3, v20)
    val v155: Vector[Vector[Double]] = v78(2)
    val v134: Vector[Double] = v58(0)
    v132 = v132.updated(2, v58)
    v132 = v132.updated(2, v29)
    v38 = v38.updated(2, v58)
    val v140: Double = v134(0)
    v132 = v132.updated(0, v155)
    v140
  }
  def f38(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f47(v0)
    val v9: Vector[Vector[Double]] = f43(v5)
    val v15: Vector[Double] = v0(2)
    val v17: Vector[Vector[Double]] = f44(v9)
    val v18: Double = v15(0)
    var v29: Double = v18
    val v19: Vector[Double] = Vector(v29, v18)
    val v26: Double = v19(1)
    val v57: Vector[Double] = Vector(v26, v18, v29)
    val v39: Vector[Vector[Double]] = f51(v57, v17)
    v39
  }
  def f26(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Double] = v0(2)
    val v6: Double = v7(0)
    val v1: Vector[Vector[Double]] = f38(v0)
    val v15: Vector[Vector[Double]] = f38(v0)
    val v4: Double = v7(0)
    var v11: Vector[Vector[Double]] = v0
    val v9: Vector[Double] = v1(1)
    v11 = v0
    v11 = v1
    val v20: Vector[Double] = v15(0)
    val v14: Vector[Vector[Double]] = f43(v0)
    val v12: Vector[Vector[Double]] = f47(v1)
    val v17: Vector[Vector[Double]] = f43(v12)
    val v25: Vector[Double] = v12(2)
    var v13: Vector[Double] = v25
    val v22: Vector[Double] = v12(0)
    val v30: Vector[Double] = v14(1)
    var v24: Double = v6
    var v38: Vector[Double] = v9
    v38 = v38.updated(0, v4)
    val v67: Vector[Vector[Double]] = Vector(v38, v20, v22, v20, v13)
    var v36: Vector[Double] = v38
    v11 = v11.updated(2, v36)
    val v111: Vector[Double] = v67(0)
    v24 = v4
    var v200: Vector[Vector[Double]] = v17
    var v92: Vector[Double] = v111
    val v40: Vector[Vector[Double]] = f38(v11)
    v92 = v92.updated(0, v24)
    val v116: Vector[Double] = v12(0)
    var v66: Vector[Double] = v30
    var v57: Vector[Vector[Double]] = v40
    v92 = v66
    var v120: Vector[Vector[Double]] = v57
    var v112: Vector[Vector[Double]] = v120
    v120 = v120.updated(0, v92)
    v57 = v57.updated(0, v116)
    v112 = v200
    v11 = v11.updated(1, v30)
    v112
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Double): Double = {
    val v5: Vector[Double] = v1(1)
    var v7: Vector[Double] = v5
    val v9: Vector[Double] = Vector(v2)
    val v10: Vector[Vector[Double]] = f26(v0)
    val v16: Vector[Double] = v0(1)
    val v36: Vector[Double] = v10(1)
    val v31: Double = v36(0)
    val v15: Vector[Double] = v1(2)
    v7 = v7.updated(0, v2)
    val v49: Vector[Double] = v1(1)
    var v20: Vector[Double] = v16
    v7 = v7.updated(0, v31)
    val v52: Double = v9(0)
    val v34: Double = v49(0)
    var v19: Vector[Double] = v15
    v20 = v20.updated(0, v52)
    var v38: Vector[Double] = v7
    val v26: Double = f42(v34)
    v20 = v5
    v38 = v38.updated(0, v31)
    v38 = v38.updated(0, v26)
    v7 = v7.updated(0, v34)
    val v40: Double = v19(0)
    v38 = v38.updated(0, v40)
    v38 = v20
    val v140: Double = v38(0)
    v140
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0), Vector(5.0))
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}