import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f72(v0: Vector[Double]): Vector[Double] = {
    var v1: Vector[Double] = v0
    var v7: Vector[Double] = v0
    var v8: Vector[Double] = v7
    val v3: Double = v8(0)
    val v9: Double = v8(0)
    val v4: Double = v3 + v3
    val v10: Double = v7(0)
    val v11: Double = v1(0)
    val v17: Double = v8(0)
    var v12: Double = v9
    v8 = v8.updated(0, v12)
    v1 = v1.updated(0, v12)
    val v6: Vector[Double] = Vector(v4, v3, v4, v12, v17, v3, v10)
    var v18: Vector[Double] = v6
    val v13: Double = v18(4)
    var v25: Vector[Double] = v7
    var v21: Vector[Double] = v25
    var v32: Vector[Double] = v21
    v21 = v21.updated(0, v13)
    v18 = v18.updated(0, v4)
    v18 = v18.updated(2, v11)
    v8 = v8.updated(0, v11)
    var v119: Vector[Double] = v32
    var v201: Vector[Double] = v119
    v7 = v7.updated(0, v11)
    v201
  }
  @noinline
  def f0(v0: Double): Double = {
    var v5: Double = v0
    val v7: Vector[Double] = Vector(v5, v0)
    var v4: Double = v0
    val v2: Double = v7(1)
    var v6: Vector[Double] = v7
    val v8: Double = v6(1)
    var v10: Vector[Double] = v7
    val v1: Double = v6(1)
    val v21: Double = v6(1)
    v6 = v6.updated(0, v5)
    v10 = v10.updated(0, v21)
    val v15: Double = v7(0)
    val v14: Double = v5 - v1
    var v12: Vector[Double] = v10
    v6 = v6.updated(0, v5)
    var v17: Vector[Double] = v7
    val v24: Double = v12(0)
    var v28: Vector[Double] = v17
    v17 = v7
    var v18: Vector[Double] = v17
    var v31: Vector[Double] = v10
    v6 = v6.updated(1, v5)
    var v27: Double = v15
    v10 = v10.updated(0, v2)
    var v39: Double = v5
    val v35: Double = v10(1)
    v10 = v10.updated(0, v21)
    var v22: Vector[Double] = v6
    var v79: Vector[Double] = v22
    var v29: Vector[Double] = v12
    v29 = v29.updated(1, v24)
    val v43: Double = v29(1)
    v79 = v79.updated(0, v4)
    var v46: Double = v27
    var v26: Double = v27
    val v60: Double = v31(1)
    v18 = v18.updated(0, v14)
    v27 = v46
    val v41: Double = v12(1)
    var v38: Vector[Double] = v79
    val v66: Double = v29(1)
    v79 = v79.updated(1, v60)
    var v56: Vector[Double] = v17
    val v82: Vector[Vector[Double]] = Vector(v18, v29, v17, v28, v56, v38, v18)
    v31 = v31.updated(1, v41)
    var v76: Vector[Double] = v29
    v17 = v17.updated(1, v43)
    var v25: Vector[Vector[Double]] = v82
    v22 = v22.updated(0, v39)
    var v50: Double = v26
    var v45: Vector[Vector[Double]] = v25
    val v69: Vector[Double] = v45(0)
    val v159: Double = v69(1)
    val v163: Vector[Double] = Vector(v159)
    val v129: Vector[Double] = f72(v163)
    val v166: Double = v129(0)
    v17 = v17.updated(1, v50)
    v25 = v25.updated(5, v76)
    v76 = v76.updated(1, v66)
    v12 = v12.updated(0, v8)
    v38 = v38.updated(0, v35)
    v166
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val start = nanoTime()
    var result: Double = 0.0
    (1 to 1000).foreach { _ =>
      result = f0(v0)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}