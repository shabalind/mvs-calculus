import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f10(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v15: Vector[Double] = v0(0)
    var v9: Vector[Double] = v15
    var v34: Vector[Vector[Double]] = v0
    var v10: Vector[Vector[Double]] = v34
    v10 = v10.updated(0, v9)
    v10
  }
  def f9(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v0
    var v1: Vector[Vector[Double]] = v3
    val v2: Vector[Double] = v0(0)
    var v7: Vector[Vector[Double]] = v1
    v1 = v1.updated(0, v2)
    v7
  }
  def f8(v0: Double): Double = {
    var v4: Double = v0
    var v3: Double = v0
    var v2: Double = v3
    val v6: Vector[Double] = Vector(v4, v3, v4, v3)
    val v9: Double = v6(0)
    var v10: Vector[Double] = v6
    var v11: Vector[Double] = v10
    v10 = v10.updated(0, v2)
    var v12: Vector[Double] = v10
    var v14: Double = v9
    var v30: Vector[Double] = v12
    var v41: Vector[Double] = v30
    v10 = v10.updated(3, v14)
    val v35: Double = v11(3)
    val v74: Double = v41(1)
    var v70: Double = v74
    v10 = v10.updated(3, v4)
    val v75: Double = v11(2)
    val v89: Double = v35 + v70
    var v77: Double = v75
    v10 = v10.updated(2, v77)
    v89
  }
  def f7(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Vector[Double]] = f10(v1)
    val v43: Vector[Vector[Double]] = f10(v7)
    val v56: Vector[Vector[Double]] = f10(v43)
    v56
  }
  def f6(v0: Vector[Vector[Double]], v1: Vector[Double], v2: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v8: Vector[Double] = v2(0)
    val v6: Vector[Vector[Double]] = f9(v2)
    val v4: Vector[Vector[Double]] = f9(v6)
    val v7: Vector[Vector[Double]] = f9(v4)
    var v11: Vector[Double] = v8
    val v3: Double = v1(0)
    var v13: Double = v3
    var v29: Double = v13
    val v16: Double = f8(v13)
    val v10: Double = f8(v16)
    val v18: Double = v11(0)
    var v23: Vector[Vector[Double]] = v7
    v11 = v11.updated(0, v29)
    var v22: Vector[Double] = v1
    val v33: Vector[Vector[Double]] = f9(v23)
    var v34: Vector[Double] = v22
    v23 = v23.updated(1, v34)
    v34 = v34.updated(0, v18)
    val v24: Double = f8(v10)
    v34 = v34.updated(0, v13)
    v11 = v11.updated(0, v24)
    v33
  }
  def f5(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Vector[Vector[Double]], v5: Vector[Vector[Double]], v6: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v8: Vector[Vector[Double]] = v3
    val v7: Vector[Double] = v3(1)
    var v15: Vector[Vector[Double]] = v2
    val v11: Vector[Double] = v4(1)
    v8 = v8.updated(0, v7)
    val v12: Vector[Vector[Double]] = f7(v2, v6, v8)
    var v19: Vector[Double] = v11
    v8 = v8.updated(1, v19)
    val v16: Vector[Double] = v2(0)
    var v30: Vector[Double] = v7
    val v20: Vector[Vector[Double]] = f10(v2)
    var v14: Vector[Double] = v16
    v15 = v15.updated(0, v7)
    v15 = v15.updated(0, v7)
    val v26: Vector[Double] = v12(0)
    v15 = v15.updated(0, v26)
    var v39: Vector[Vector[Double]] = v1
    val v17: Vector[Double] = v15(0)
    val v42: Double = v14(0)
    val v21: Double = f8(v42)
    val v28: Vector[Double] = v39(1)
    val v23: Vector[Double] = v20(0)
    v30 = v30.updated(0, v21)
    var v25: Vector[Vector[Double]] = v39
    val v33: Vector[Vector[Double]] = f7(v6, v2, v0)
    val v31: Double = v16(0)
    v8 = v8.updated(0, v23)
    var v48: Vector[Vector[Double]] = v6
    var v37: Vector[Vector[Double]] = v25
    val v29: Vector[Double] = v5(0)
    var v82: Vector[Vector[Double]] = v2
    val v60: Vector[Double] = v12(0)
    val v43: Double = f8(v31)
    val v46: Vector[Double] = v37(2)
    v82 = v82.updated(0, v46)
    v15 = v15.updated(0, v23)
    var v34: Vector[Double] = v14
    val v100: Double = v42 + v43
    val v50: Vector[Double] = v82(0)
    val v96: Vector[Double] = v6(0)
    val v138: Vector[Vector[Double]] = Vector(v60, v23, v29, v50)
    v37 = v37.updated(1, v96)
    v82 = v82.updated(0, v28)
    val v122: Vector[Double] = v48(0)
    v14 = v7
    var v102: Vector[Vector[Double]] = v138
    v15 = v15.updated(0, v30)
    val v105: Vector[Double] = v33(0)
    v14 = v105
    v25 = v25.updated(0, v122)
    val v280: Vector[Double] = v102(1)
    val v194: Double = f8(v100)
    v19 = v19.updated(0, v194)
    v39 = v39.updated(2, v17)
    v102 = v102.updated(3, v34)
    v37 = v37.updated(1, v7)
    val v198: Vector[Vector[Double]] = Vector(v96, v280)
    v198
  }
  def f4(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Vector[Vector[Double]]] = Vector(v1, v0)
    val v4: Vector[Vector[Double]] = v6(0)
    val v3: Vector[Double] = v4(0)
    var v5: Vector[Vector[Double]] = v4
    var v8: Vector[Double] = v3
    var v11: Vector[Double] = v8
    v5 = v4
    v5 = v5.updated(0, v11)
    val v16: Double = v8(0)
    v11 = v11.updated(0, v16)
    val v39: Double = f8(v16)
    v8 = v8.updated(0, v39)
    v5 = v5.updated(0, v8)
    v5
  }
  def f3(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v3: Vector[Vector[Double]] = f10(v0)
    val v6: Vector[Vector[Double]] = f10(v0)
    var v8: Vector[Vector[Double]] = v2
    val v7: Vector[Vector[Double]] = f5(v2, v1, v3, v8, v2, v2, v6)
    val v16: Vector[Vector[Double]] = f5(v7, v1, v6, v2, v8, v2, v0)
    val v11: Vector[Vector[Double]] = f4(v1, v1)
    val v18: Vector[Vector[Double]] = f9(v16)
    var v44: Vector[Vector[Double]] = v11
    val v64: Vector[Vector[Double]] = f9(v18)
    val v60: Vector[Double] = v64(0)
    val v71: Vector[Vector[Double]] = f4(v44, v1)
    val v54: Vector[Vector[Double]] = f4(v1, v71)
    var v57: Vector[Double] = v60
    v44 = v44.updated(1, v57)
    val v155: Vector[Vector[Double]] = f4(v11, v71)
    val v229: Vector[Vector[Double]] = f4(v155, v11)
    val v373: Vector[Vector[Vector[Double]]] = Vector(v155, v71, v54, v44, v229)
    var v106: Vector[Vector[Vector[Double]]] = v373
    v44 = v44.updated(1, v57)
    val v172: Vector[Vector[Double]] = v106(3)
    v172
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Vector[Vector[Double]], v4: Double): Double = {
    val v5: Double = f8(v4)
    val v6: Vector[Double] = v1(0)
    val v8: Double = v6(0)
    val v9: Vector[Double] = v3(0)
    var v7: Vector[Vector[Double]] = v0
    val v16: Vector[Double] = Vector(v5)
    val v11: Vector[Vector[Double]] = f7(v3, v3, v1)
    val v30: Vector[Vector[Double]] = f10(v11)
    val v12: Vector[Double] = v1(1)
    var v10: Vector[Double] = v6
    val v15: Vector[Vector[Double]] = f4(v7, v0)
    v7 = v7.updated(0, v10)
    val v17: Vector[Vector[Double]] = f6(v15, v6, v1)
    var v21: Vector[Vector[Double]] = v11
    v21 = v21.updated(0, v12)
    val v18: Vector[Double] = v17(1)
    val v13: Vector[Vector[Double]] = f3(v11, v2, v17)
    val v25: Vector[Double] = v2(0)
    val v35: Vector[Vector[Double]] = f9(v17)
    v10 = v10.updated(0, v8)
    v21 = v21.updated(0, v12)
    var v27: Vector[Vector[Double]] = v3
    v21 = v21.updated(0, v16)
    val v29: Double = v25(0)
    var v26: Vector[Vector[Double]] = v7
    val v50: Vector[Vector[Double]] = f9(v1)
    v26 = v2
    var v52: Vector[Vector[Double]] = v30
    var v70: Double = v8
    var v41: Vector[Vector[Double]] = v21
    val v53: Vector[Double] = v30(0)
    v52 = v52.updated(0, v9)
    v26 = v2
    var v51: Double = v29
    var v45: Vector[Vector[Double]] = v13
    var v40: Vector[Vector[Double]] = v1
    v41 = v41.updated(0, v16)
    v10 = v10.updated(0, v70)
    var v47: Vector[Vector[Double]] = v21
    v7 = v26
    val v34: Vector[Vector[Double]] = f6(v45, v25, v40)
    var v49: Vector[Vector[Double]] = v27
    var v85: Vector[Vector[Double]] = v34
    val v102: Vector[Double] = v47(0)
    var v80: Vector[Vector[Double]] = v0
    v41 = v41.updated(0, v9)
    var v39: Vector[Double] = v18
    val v68: Vector[Vector[Double]] = f6(v7, v6, v17)
    val v56: Double = v39(0)
    var v82: Vector[Vector[Double]] = v85
    var v55: Vector[Double] = v53
    val v100: Vector[Vector[Double]] = f9(v85)
    v55 = v55.updated(0, v51)
    v10 = v10.updated(0, v56)
    v45 = v45.updated(2, v55)
    val v241: Vector[Vector[Double]] = f7(v52, v21, v82)
    v40 = v40.updated(0, v10)
    v82 = v82.updated(0, v102)
    var v95: Vector[Vector[Double]] = v50
    val v149: Vector[Vector[Double]] = f5(v95, v80, v241, v17, v35, v100, v41)
    val v123: Vector[Double] = v30(0)
    val v159: Vector[Vector[Double]] = f7(v21, v49, v149)
    val v93: Vector[Double] = v159(0)
    v49 = v49.updated(0, v10)
    v80 = v80.updated(1, v18)
    val v171: Double = v93(0)
    v49 = v49.updated(0, v123)
    val v254: Vector[Double] = v68(0)
    v82 = v82.updated(1, v25)
    v10 = v10.updated(0, v8)
    v27 = v27.updated(0, v254)
    v171
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(5.0), Vector(6.0), Vector(7.0))
    val v3: Vector[Vector[Double]] = Vector(Vector(8.0))
    val v4: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}