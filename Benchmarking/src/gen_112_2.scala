import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f12(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v0
    var v4: Vector[Vector[Double]] = v3
    var v2: Vector[Vector[Double]] = v3
    var v7: Vector[Vector[Double]] = v0
    var v6: Vector[Vector[Double]] = v4
    var v10: Vector[Vector[Double]] = v6
    var v1: Vector[Vector[Double]] = v0
    val v9: Vector[Double] = v10(0)
    val v12: Vector[Double] = v3(1)
    var v5: Vector[Vector[Double]] = v4
    val v8: Vector[Double] = v1(0)
    var v13: Vector[Double] = v8
    val v11: Double = v13(0)
    var v25: Vector[Double] = v9
    val v23: Double = v8(0)
    var v27: Vector[Vector[Double]] = v5
    v5 = v5.updated(1, v9)
    val v30: Vector[Double] = v3(1)
    v25 = v25.updated(0, v23)
    var v29: Vector[Double] = v30
    var v14: Vector[Double] = v30
    val v28: Vector[Double] = v0(0)
    v5 = v2
    v5 = v5.updated(1, v8)
    var v24: Double = v23
    var v21: Vector[Vector[Double]] = v1
    var v50: Vector[Vector[Double]] = v7
    v27 = v27.updated(0, v30)
    val v15: Vector[Double] = Vector(v11)
    var v22: Double = v11
    v1 = v1.updated(1, v30)
    val v59: Vector[Double] = v0(0)
    v14 = v28
    val v41: Vector[Double] = v27(0)
    val v36: Vector[Double] = v27(1)
    v13 = v13.updated(0, v24)
    val v20: Vector[Double] = v10(0)
    val v37: Double = v14(0)
    val v48: Vector[Double] = v1(0)
    v29 = v13
    val v75: Vector[Double] = v50(1)
    v2 = v2.updated(0, v75)
    var v32: Vector[Double] = v25
    var v63: Vector[Double] = v12
    val v49: Vector[Double] = v7(1)
    val v60: Double = v28(0)
    val v52: Vector[Double] = v10(1)
    var v72: Vector[Double] = v13
    val v40: Double = v72(0)
    v32 = v32.updated(0, v11)
    val v61: Vector[Double] = v5(0)
    v63 = v63.updated(0, v40)
    val v68: Double = v36(0)
    v27 = v27.updated(1, v48)
    var v95: Double = v23
    var v89: Double = v37
    var v123: Vector[Vector[Double]] = v21
    var v55: Vector[Vector[Double]] = v123
    var v57: Vector[Double] = v59
    v1 = v1.updated(1, v48)
    val v47: Double = v20(0)
    val v73: Vector[Double] = v3(0)
    val v85: Vector[Double] = v55(1)
    v21 = v21.updated(0, v32)
    v6 = v6.updated(1, v63)
    v57 = v57.updated(0, v95)
    v32 = v32.updated(0, v60)
    v14 = v41
    v89 = v95
    val v76: Double = v57(0)
    v4 = v4.updated(1, v59)
    v6 = v6.updated(1, v61)
    v57 = v57.updated(0, v22)
    v21 = v21.updated(0, v29)
    v55 = v0
    v4 = v4.updated(0, v52)
    v7 = v7.updated(1, v13)
    v13 = v13.updated(0, v47)
    v4 = v4.updated(1, v52)
    v32 = v32.updated(0, v89)
    v25 = v85
    v13 = v13.updated(0, v76)
    v21 = v21.updated(0, v15)
    v14 = v14.updated(0, v68)
    v5 = v5.updated(0, v15)
    v21 = v21.updated(0, v49)
    v1 = v1.updated(0, v73)
    v27 = v123
    v27
  }
  def f1(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v4: Vector[Vector[Double]] = v0
    val v5: Vector[Vector[Double]] = f12(v1)
    var v8: Vector[Vector[Double]] = v0
    val v7: Vector[Vector[Double]] = f12(v4)
    var v3: Vector[Vector[Double]] = v8
    val v17: Vector[Vector[Double]] = f12(v5)
    val v2: Vector[Double] = v3(0)
    var v9: Vector[Vector[Double]] = v8
    var v13: Vector[Double] = v2
    val v19: Vector[Vector[Double]] = f12(v9)
    var v10: Vector[Double] = v13
    var v12: Vector[Vector[Double]] = v19
    val v21: Vector[Double] = v7(0)
    val v14: Vector[Vector[Double]] = f12(v4)
    v4 = v4.updated(1, v10)
    val v38: Vector[Vector[Double]] = f12(v4)
    val v16: Vector[Vector[Double]] = f12(v17)
    val v28: Vector[Vector[Vector[Double]]] = Vector(v12, v5, v0, v14, v5, v0, v16)
    var v47: Vector[Double] = v13
    val v30: Double = v13(0)
    v3 = v38
    v3 = v3.updated(0, v2)
    val v27: Vector[Vector[Double]] = v28(5)
    v8 = v8.updated(0, v47)
    val v46: Double = v10(0)
    v3 = v3.updated(0, v13)
    val v44: Double = v46 * v30
    var v40: Vector[Double] = v47
    val v62: Vector[Vector[Vector[Double]]] = Vector(v27, v19, v9)
    val v95: Vector[Vector[Double]] = v28(0)
    val v74: Vector[Double] = v95(0)
    v47 = v47.updated(0, v44)
    var v73: Vector[Vector[Vector[Double]]] = v62
    v3 = v3.updated(1, v21)
    v9 = v9.updated(0, v74)
    var v111: Vector[Vector[Vector[Double]]] = v73
    val v113: Vector[Vector[Double]] = v111(2)
    v8 = v8.updated(0, v13)
    v4 = v4.updated(1, v40)
    v113
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v6: Vector[Vector[Double]] = f12(v0)
    val v2: Vector[Double] = v0(1)
    val v9: Vector[Double] = v0(0)
    val v8: Vector[Vector[Double]] = f12(v6)
    val v3: Double = v9(0)
    val v5: Vector[Double] = v6(0)
    val v11: Double = v2(0)
    var v7: Vector[Vector[Double]] = v8
    v7 = v7.updated(1, v5)
    val v16: Double = v5(0)
    val v15: Vector[Double] = v0(1)
    val v13: Vector[Vector[Double]] = f1(v8, v7)
    v7 = v6
    val v18: Double = v15(0)
    val v21: Vector[Vector[Double]] = f1(v8, v7)
    v7 = v7.updated(0, v2)
    val v31: Vector[Double] = v13(1)
    val v24: Vector[Double] = v21(0)
    val v47: Double = v31(0)
    val v55: Double = v18 + v16
    var v66: Double = v3
    val v36: Double = v24(0)
    val v100: Vector[Double] = Vector(v1, v11, v1, v36, v55, v55)
    var v38: Double = v66
    var v255: Vector[Double] = v100
    var v99: Vector[Double] = v255
    var v214: Vector[Double] = v255
    v214 = v99
    val v181: Double = v214(0)
    val v134: Double = v181 + v47
    v99 = v99.updated(3, v38)
    v134
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
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