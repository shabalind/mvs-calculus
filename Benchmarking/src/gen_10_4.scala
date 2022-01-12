import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f25(v0: Vector[Double]): Vector[Double] = {
    val v5: Double = v0(1)
    val v6: Vector[Vector[Double]] = Vector(v0, v0)
    var v7: Vector[Vector[Double]] = v6
    v7 = v7.updated(0, v0)
    var v2: Vector[Vector[Double]] = v7
    var v3: Double = v5
    val v1: Vector[Double] = v7(1)
    var v8: Vector[Double] = v0
    v2 = v2.updated(1, v1)
    v2 = v6
    v2 = v2.updated(0, v1)
    val v34: Vector[Vector[Double]] = Vector(v0, v1, v0, v1, v1)
    val v10: Vector[Double] = v34(3)
    val v14: Vector[Double] = v34(3)
    val v12: Vector[Double] = v2(1)
    var v20: Vector[Vector[Double]] = v6
    v20 = v20.updated(0, v8)
    val v16: Vector[Vector[Vector[Double]]] = Vector(v34, v34, v34, v34, v34)
    var v24: Vector[Double] = v14
    val v23: Vector[Vector[Double]] = v16(2)
    var v29: Vector[Vector[Double]] = v6
    var v25: Vector[Double] = v12
    var v26: Vector[Double] = v10
    v2 = v2.updated(1, v24)
    var v33: Double = v3
    var v37: Vector[Double] = v1
    v37 = v24
    val v71: Vector[Double] = v23(2)
    val v32: Double = v24(2)
    val v68: Vector[Vector[Double]] = Vector(v12, v37, v25, v1, v0, v71, v71)
    v20 = v20.updated(0, v26)
    val v91: Double = v33 + v32
    v2 = v29
    v24 = v24.updated(2, v33)
    v8 = v8.updated(2, v91)
    var v62: Vector[Vector[Double]] = v68
    v29 = v20
    var v98: Vector[Vector[Double]] = v29
    val v83: Vector[Double] = v62(4)
    v20 = v98
    v83
  }
  def f6(v0: Double): Double = {
    var v6: Double = v0
    var v4: Double = v6
    var v7: Double = v4
    var v2: Double = v0
    val v1: Vector[Double] = Vector(v0, v7, v4, v0)
    val v18: Vector[Vector[Double]] = Vector(v1, v1, v1, v1, v1)
    var v5: Vector[Vector[Double]] = v18
    v2 = v6
    val v3: Vector[Vector[Double]] = Vector(v1, v1, v1, v1, v1, v1)
    val v8: Vector[Vector[Vector[Double]]] = Vector(v18, v18, v18, v18, v5, v5, v5)
    var v11: Vector[Vector[Vector[Double]]] = v8
    v5 = v5.updated(2, v1)
    v5 = v5.updated(2, v1)
    var v12: Vector[Vector[Vector[Double]]] = v11
    var v15: Vector[Vector[Double]] = v5
    v15 = v15.updated(0, v1)
    var v17: Vector[Vector[Double]] = v15
    val v19: Vector[Vector[Double]] = Vector(v1, v1, v1, v1, v1, v1, v1)
    val v21: Vector[Double] = v3(3)
    val v24: Vector[Double] = v5(4)
    v11 = v11.updated(2, v18)
    val v27: Vector[Double] = v18(4)
    val v10: Vector[Vector[Double]] = v12(0)
    val v22: Vector[Double] = v19(2)
    val v29: Vector[Double] = v3(4)
    v12 = v12.updated(2, v17)
    var v39: Vector[Double] = v27
    var v48: Vector[Double] = v24
    val v41: Double = v21(1)
    var v30: Vector[Double] = v27
    var v71: Vector[Vector[Double]] = v3
    val v50: Double = v21(0)
    val v66: Vector[Double] = v71(3)
    val v49: Vector[Double] = v17(4)
    v48 = v48.updated(3, v50)
    val v40: Double = v30(2)
    var v38: Vector[Vector[Double]] = v19
    var v84: Vector[Vector[Double]] = v3
    var v56: Vector[Vector[Double]] = v84
    val v147: Vector[Double] = v10(1)
    v71 = v71.updated(2, v147)
    v12 = v12.updated(0, v5)
    v15 = v15.updated(0, v48)
    var v52: Vector[Vector[Double]] = v38
    var v59: Vector[Vector[Double]] = v52
    val v130: Vector[Double] = v84(0)
    v56 = v56.updated(1, v48)
    val v113: Double = v41 * v2
    v38 = v38.updated(3, v1)
    v84 = v84.updated(1, v66)
    v39 = v39.updated(2, v113)
    v39 = v39.updated(0, v40)
    var v105: Vector[Vector[Double]] = v56
    val v46: Vector[Double] = v71(1)
    v15 = v15.updated(1, v22)
    v52 = v52.updated(1, v29)
    var v206: Vector[Vector[Double]] = v59
    var v184: Vector[Vector[Double]] = v105
    v17 = v17.updated(1, v39)
    v71 = v71.updated(3, v30)
    val v148: Vector[Double] = v206(5)
    v56 = v56.updated(4, v46)
    v105 = v105.updated(5, v130)
    v17 = v17.updated(3, v148)
    v71 = v71.updated(1, v66)
    val v188: Double = v147(2)
    val v229: Vector[Double] = v105(0)
    v105 = v184
    v38 = v38.updated(5, v1)
    v17 = v17.updated(0, v229)
    var v154: Vector[Double] = v49
    v48 = v154
    v188
  }
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v5: Double = v1
    val v9: Vector[Double] = f25(v0)
    val v8: Double = f6(v5)
    var v3: Double = v8
    val v12: Double = v9(2)
    val v10: Double = f6(v3)
    var v30: Vector[Double] = v0
    val v11: Double = v9(2)
    var v17: Vector[Double] = v30
    val v14: Double = v0(1)
    val v16: Double = v0(0)
    val v24: Double = v11 + v12
    var v27: Vector[Double] = v17
    v27 = v27.updated(1, v10)
    var v33: Double = v11
    val v18: Double = f6(v16)
    v3 = v33
    v30 = v30.updated(1, v11)
    v30 = v30.updated(2, v18)
    val v54: Double = v27(2)
    v27 = v27.updated(1, v24)
    v27 = v27.updated(2, v5)
    v30 = v30.updated(2, v14)
    v30 = v30.updated(1, v3)
    v54
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0, 2.0)
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