import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f40(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(2)
    val v7: Double = v0(2)
    val v3: Double = v0(2)
    var v5: Vector[Double] = v0
    var v14: Vector[Double] = v5
    v5 = v5.updated(0, v3)
    v5 = v5.updated(1, v3)
    var v17: Double = v7
    v5 = v5.updated(2, v17)
    v14 = v14.updated(2, v6)
    var v50: Vector[Double] = v14
    v50
  }
  @noinline
  def f0(v0: Double): Double = {
    var v6: Double = v0
    var v2: Double = v6
    var v4: Double = v0
    var v7: Double = v2
    var v3: Double = v7
    var v1: Double = v7
    var v13: Double = v4
    var v11: Double = v7
    val v9: Double = v11 * v6
    var v10: Double = v7
    var v14: Double = v4
    var v18: Double = v3
    val v17: Double = v14 + v2
    val v25: Vector[Double] = Vector(v0, v11, v13)
    val v19: Vector[Double] = f40(v25)
    var v16: Vector[Double] = v19
    val v38: Vector[Double] = f40(v19)
    val v12: Double = v2 * v9
    v4 = v18
    v16 = v16.updated(0, v12)
    val v24: Double = v16(1)
    v4 = v0
    val v20: Vector[Double] = f40(v38)
    val v44: Vector[Double] = f40(v38)
    var v57: Vector[Double] = v20
    val v40: Vector[Double] = f40(v38)
    val v51: Vector[Double] = f40(v57)
    v14 = v7
    val v34: Vector[Double] = f40(v44)
    v57 = v57.updated(2, v1)
    val v31: Vector[Double] = f40(v51)
    val v93: Vector[Double] = f40(v31)
    var v64: Double = v24
    v57 = v57.updated(2, v17)
    val v84: Double = v93(1)
    var v69: Double = v11
    v64 = v11
    val v98: Double = v34(2)
    val v97: Double = v40(0)
    val v151: Vector[Double] = Vector(v13, v84, v69, v97, v10, v64)
    v16 = v38
    var v178: Vector[Double] = v151
    v13 = v11
    val v122: Double = v178(3)
    v16 = v16.updated(1, v98)
    v122
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