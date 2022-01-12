import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f108(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v6: Vector[Vector[Double]] = v0
    var v4: Vector[Vector[Double]] = v0
    val v3: Vector[Double] = v6(0)
    v6 = v0
    var v2: Vector[Double] = v3
    val v5: Vector[Double] = v0(1)
    var v7: Vector[Double] = v5
    v6 = v6.updated(0, v2)
    v4 = v4.updated(0, v3)
    val v1: Double = v3(0)
    v7 = v7.updated(0, v1)
    val v12: Double = v5(0)
    v2 = v3
    val v9: Double = v3(0)
    var v15: Double = v9
    v6 = v6.updated(0, v7)
    var v32: Vector[Vector[Double]] = v4
    v2 = v2.updated(0, v9)
    var v34: Vector[Vector[Double]] = v32
    val v13: Vector[Double] = v0(1)
    var v11: Double = v1
    v32 = v32.updated(1, v13)
    var v42: Vector[Double] = v13
    v34 = v4
    v32 = v32.updated(1, v13)
    v6 = v6.updated(0, v42)
    v4 = v4.updated(1, v2)
    v42 = v42.updated(0, v15)
    v42 = v42.updated(0, v12)
    v2 = v2.updated(0, v11)
    v34
  }
  def f96(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v0(0)
    val v7: Vector[Vector[Double]] = f108(v0)
    var v3: Vector[Double] = v2
    var v11: Vector[Double] = v3
    val v4: Vector[Double] = v7(1)
    v3 = v2
    var v6: Vector[Vector[Double]] = v0
    val v1: Vector[Vector[Double]] = f108(v0)
    val v9: Vector[Vector[Double]] = f108(v6)
    var v12: Vector[Double] = v4
    var v8: Vector[Vector[Double]] = v1
    val v15: Vector[Vector[Double]] = f108(v9)
    val v17: Vector[Vector[Double]] = Vector(v12, v12, v3, v11, v3, v11)
    var v18: Vector[Vector[Double]] = v8
    var v28: Vector[Double] = v4
    v6 = v6.updated(1, v2)
    v18 = v7
    val v22: Vector[Double] = v18(1)
    val v32: Double = v22(0)
    val v44: Double = v32 + v32
    var v26: Vector[Vector[Double]] = v17
    v28 = v28.updated(0, v32)
    val v78: Vector[Double] = v26(5)
    v3 = v3.updated(0, v44)
    val v121: Double = v22(0)
    var v114: Vector[Vector[Double]] = v15
    v114 = v114.updated(1, v78)
    val v138: Vector[Vector[Double]] = f108(v114)
    v12 = v12.updated(0, v32)
    v18 = v18.updated(0, v28)
    v11 = v11.updated(0, v121)
    val v133: Vector[Vector[Double]] = f108(v138)
    v133
  }
  def f90(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v6: Vector[Double] = v0(0)
    var v1: Vector[Vector[Double]] = v0
    val v2: Vector[Double] = v0(1)
    v1 = v0
    val v5: Vector[Vector[Vector[Double]]] = Vector(v1, v0)
    v1 = v1.updated(1, v6)
    val v4: Vector[Double] = v0(0)
    var v7: Vector[Double] = v6
    val v8: Vector[Vector[Double]] = f96(v1)
    v1 = v1.updated(1, v2)
    var v10: Vector[Vector[Double]] = v8
    v10 = v10.updated(1, v4)
    v10 = v10.updated(1, v7)
    var v17: Vector[Vector[Vector[Double]]] = v5
    val v16: Vector[Vector[Double]] = v17(1)
    var v23: Vector[Double] = v7
    v1 = v1.updated(1, v4)
    v1 = v1.updated(1, v23)
    v10 = v16
    val v42: Double = v6(0)
    v1 = v1.updated(0, v7)
    v7 = v7.updated(0, v42)
    v10
  }
  def f78(v0: Vector[Vector[Double]], v1: Double, v2: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v8: Vector[Double] = v0(1)
    var v12: Double = v1
    var v3: Vector[Vector[Double]] = v0
    var v15: Vector[Double] = v8
    var v20: Vector[Vector[Double]] = v3
    v20 = v20.updated(1, v15)
    val v21: Vector[Double] = v0(0)
    v15 = v15.updated(0, v12)
    val v26: Double = v21(0)
    v15 = v15.updated(0, v26)
    v15 = v15.updated(0, v26)
    v20
  }
  def f73(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v1: Vector[Vector[Vector[Double]]] = Vector(v0, v0, v0, v0, v0, v0)
    val v6: Vector[Double] = v0(0)
    val v4: Vector[Vector[Double]] = f90(v0)
    val v5: Double = v6(0)
    var v3: Vector[Vector[Vector[Double]]] = v1
    var v2: Vector[Vector[Double]] = v4
    var v8: Vector[Vector[Double]] = v4
    val v7: Vector[Double] = v2(1)
    var v16: Double = v5
    val v9: Vector[Vector[Double]] = f108(v8)
    val v18: Double = v7(0)
    val v12: Vector[Vector[Double]] = f78(v0, v5, v9)
    val v35: Vector[Vector[Double]] = f90(v12)
    val v20: Vector[Vector[Double]] = f78(v9, v16, v9)
    val v29: Vector[Double] = v0(0)
    val v45: Vector[Double] = v20(0)
    val v24: Vector[Vector[Double]] = v3(2)
    val v34: Double = v18 * v18
    val v50: Vector[Double] = v20(1)
    v8 = v8.updated(1, v50)
    var v39: Vector[Vector[Double]] = v24
    val v26: Vector[Vector[Double]] = f90(v35)
    v3 = v3.updated(3, v26)
    val v27: Vector[Vector[Double]] = f90(v12)
    v39 = v39.updated(0, v29)
    v8 = v8.updated(0, v45)
    val v52: Vector[Vector[Double]] = f108(v39)
    v2 = v2.updated(0, v29)
    val v62: Vector[Vector[Double]] = f78(v39, v34, v20)
    val v61: Vector[Vector[Double]] = f96(v62)
    val v98: Vector[Double] = v61(0)
    val v42: Vector[Vector[Vector[Double]]] = Vector(v52)
    val v89: Vector[Vector[Double]] = f90(v27)
    var v48: Vector[Vector[Vector[Double]]] = v3
    v39 = v39.updated(1, v7)
    var v162: Vector[Vector[Vector[Double]]] = v42
    var v54: Vector[Double] = v98
    v8 = v8.updated(0, v54)
    v3 = v48
    var v38: Vector[Vector[Vector[Double]]] = v162
    var v84: Vector[Double] = v7
    val v164: Vector[Vector[Double]] = v38(0)
    var v212: Vector[Vector[Double]] = v164
    v38 = v38.updated(0, v212)
    var v85: Vector[Vector[Vector[Double]]] = v42
    v54 = v84
    v3 = v3.updated(0, v89)
    var v123: Vector[Vector[Vector[Double]]] = v38
    val v95: Vector[Vector[Vector[Vector[Double]]]] = Vector(v38, v85, v162, v42, v85, v85, v123)
    val v152: Vector[Vector[Vector[Double]]] = v95(6)
    val v334: Vector[Vector[Double]] = v152(0)
    v334
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v5: Vector[Vector[Double]] = f73(v0)
    val v6: Vector[Double] = v5(0)
    val v2: Vector[Double] = v5(1)
    val v7: Vector[Vector[Double]] = Vector(v6, v2, v6)
    var v11: Double = v1
    val v8: Vector[Double] = v7(2)
    val v10: Vector[Double] = v0(0)
    val v64: Double = v8(0)
    val v150: Double = v10(0)
    val v114: Vector[Double] = Vector(v64, v150, v1, v11)
    var v223: Vector[Double] = v114
    val v235: Double = v223(0)
    v235
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