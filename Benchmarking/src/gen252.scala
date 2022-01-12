import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v0
    v6 = v3
    var v1: Double = v0
    v3 = v0
    var v7: Double = v3
    val v4: Vector[Double] = Vector(v1, v3, v3, v6)
    v3 = v7
    val v5: Double = v4(2)
    val v8: Double = v4(3)
    val v17: Double = v4(3)
    val v11: Double = v4(3)
    val v15: Double = v4(2)
    val v13: Double = v4(0)
    var v12: Double = v15
    val v14: Double = v4(0)
    var v38: Vector[Double] = v4
    val v22: Double = v4(3)
    val v31: Vector[Vector[Double]] = Vector(v38, v4, v38, v38, v38, v4)
    v38 = v38.updated(0, v14)
    v38 = v38.updated(1, v7)
    var v19: Vector[Double] = v38
    var v34: Vector[Vector[Double]] = v31
    val v28: Vector[Double] = v34(1)
    val v39: Vector[Double] = v31(1)
    val v35: Vector[Double] = v34(1)
    var v68: Vector[Vector[Double]] = v34
    val v26: Vector[Double] = v68(0)
    val v84: Double = v19(3)
    v34 = v34.updated(1, v35)
    val v47: Double = v28(0)
    val v30: Vector[Double] = v31(5)
    val v33: Double = v26(0)
    val v60: Double = v35(3)
    val v101: Double = v35(2)
    v1 = v60
    var v77: Double = v17
    v38 = v38.updated(1, v84)
    v34 = v34.updated(4, v30)
    val v41: Vector[Double] = Vector(v7, v12, v1, v77, v22, v13, v11)
    val v75: Double = v26(0)
    var v71: Vector[Double] = v41
    var v138: Vector[Double] = v71
    v138 = v138.updated(4, v5)
    val v108: Double = v41(6)
    var v162: Double = v33
    v34 = v34.updated(5, v39)
    v34 = v34.updated(0, v28)
    var v63: Vector[Double] = v138
    val v131: Double = v63(0)
    v71 = v71.updated(1, v108)
    v63 = v63.updated(4, v101)
    v138 = v63
    v19 = v19.updated(2, v47)
    v71 = v71.updated(4, v75)
    v162 = v14
    v19 = v19.updated(0, v8)
    v19 = v19.updated(1, v162)
    v131
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