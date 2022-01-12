import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f84(v0: Double): Double = {
    var v1: Double = v0
    var v2: Double = v1
    var v4: Double = v2
    var v7: Double = v1
    var v3: Double = v0
    var v13: Double = v7
    var v11: Double = v1
    var v8: Double = v0
    var v6: Double = v13
    var v10: Double = v7
    val v17: Vector[Double] = Vector(v13, v4, v10, v3, v10)
    var v25: Vector[Double] = v17
    var v26: Double = v0
    v25 = v25.updated(4, v6)
    var v21: Vector[Double] = v17
    v25 = v25.updated(1, v8)
    val v27: Double = v21(0)
    v25 = v25.updated(2, v11)
    var v71: Vector[Double] = v25
    v25 = v25.updated(4, v26)
    var v30: Vector[Double] = v71
    var v70: Double = v26
    val v34: Double = v30(3)
    v21 = v21.updated(2, v70)
    v71 = v71.updated(3, v27)
    v71 = v71.updated(0, v27)
    v25 = v25.updated(2, v70)
    v30 = v30.updated(2, v7)
    v21 = v21.updated(2, v1)
    v21 = v21.updated(1, v27)
    v34
  }
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v6: Double = v1
    val v2: Double = f84(v1)
    val v5: Double = v0(0)
    val v3: Double = v2 * v6
    val v9: Double = v0(0)
    val v7: Double = f84(v1)
    val v16: Double = f84(v7)
    var v11: Double = v5
    val v22: Double = v0(0)
    val v18: Double = f84(v22)
    val v10: Double = f84(v9)
    val v51: Double = v0(0)
    val v24: Double = v0(0)
    var v23: Vector[Double] = v0
    v23 = v23.updated(0, v24)
    val v15: Vector[Double] = Vector(v18, v10, v6, v18, v16, v11)
    v23 = v23.updated(0, v51)
    val v26: Double = v15(3)
    val v25: Double = f84(v7)
    var v34: Vector[Double] = v23
    v34 = v34.updated(0, v10)
    var v65: Vector[Double] = v23
    var v81: Vector[Double] = v65
    v81 = v65
    v81 = v34
    v23 = v0
    v65 = v65.updated(0, v26)
    val v121: Double = v81(0)
    val v100: Double = f84(v25)
    v81 = v65
    var v114: Double = v100
    v34 = v34.updated(0, v3)
    v34 = v34.updated(0, v114)
    v121
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