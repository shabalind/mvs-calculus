import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f46(v0: Double): Double = {
    var v1: Double = v0
    v1 = v0
    var v3: Double = v0
    var v5: Double = v0
    var v8: Double = v1
    var v2: Double = v3
    var v7: Double = v2
    val v6: Vector[Double] = Vector(v1, v3, v7)
    val v9: Double = v6(1)
    var v17: Double = v3
    val v15: Double = v17 + v8
    val v18: Vector[Double] = Vector(v9, v8, v1, v8, v5)
    val v26: Double = v18(4)
    var v24: Vector[Double] = v18
    v24 = v24.updated(0, v7)
    val v52: Double = v6(1)
    v24 = v24.updated(3, v52)
    v24 = v24.updated(4, v26)
    v24 = v24.updated(2, v1)
    v24 = v24.updated(4, v15)
    var v38: Vector[Double] = v18
    v38 = v24
    var v75: Vector[Double] = v38
    val v81: Double = v75(2)
    v81
  }
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v6: Vector[Double] = v0
    v6 = v6.updated(0, v1)
    val v5: Double = v6(0)
    val v9: Double = f46(v5)
    val v7: Double = v0(0)
    val v2: Double = v0(0)
    val v14: Double = v6(0)
    var v11: Vector[Double] = v6
    val v22: Double = f46(v14)
    var v26: Vector[Double] = v11
    val v20: Double = f46(v7)
    var v18: Vector[Double] = v11
    val v25: Double = v26(0)
    val v32: Double = v26(0)
    v11 = v11.updated(0, v14)
    var v31: Vector[Double] = v0
    v18 = v18.updated(0, v25)
    var v43: Vector[Double] = v18
    val v19: Double = v31(0)
    val v41: Double = f46(v5)
    var v56: Vector[Double] = v43
    val v51: Double = f46(v22)
    var v28: Vector[Double] = v6
    v11 = v11.updated(0, v41)
    v28 = v28.updated(0, v2)
    v6 = v6.updated(0, v22)
    var v33: Vector[Double] = v56
    val v44: Double = f46(v19)
    v11 = v11.updated(0, v20)
    v56 = v56.updated(0, v25)
    val v34: Vector[Vector[Double]] = Vector(v33, v18)
    val v108: Vector[Vector[Vector[Double]]] = Vector(v34, v34, v34)
    var v63: Vector[Double] = v0
    v11 = v63
    val v86: Vector[Vector[Double]] = v108(0)
    var v79: Vector[Vector[Double]] = v86
    v6 = v6.updated(0, v51)
    val v113: Vector[Double] = v79(0)
    val v66: Double = v113(0)
    val v128: Double = f46(v32)
    val v176: Double = f46(v44)
    var v88: Vector[Double] = v63
    v18 = v18.updated(0, v1)
    val v127: Double = f46(v66)
    v18 = v88
    val v102: Double = f46(v176)
    v88 = v88.updated(0, v102)
    v18 = v18.updated(0, v128)
    v63 = v63.updated(0, v9)
    v11 = v28
    v127
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0)
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}