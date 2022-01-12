import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f45(v0: Double): Double = {
    var v8: Double = v0
    var v5: Double = v8
    var v2: Double = v0
    var v12: Double = v5
    var v9: Double = v12
    var v7: Double = v9
    val v38: Vector[Double] = Vector(v7, v2)
    var v31: Vector[Double] = v38
    val v34: Double = v31(0)
    v34
  }
  @noinline
  def f0(v0: Vector[Double], v1: Double, v2: Double): Double = {
    val v7: Double = v0(1)
    val v6: Double = f45(v1)
    var v8: Vector[Double] = v0
    v8 = v8.updated(1, v6)
    val v4: Double = f45(v7)
    v8 = v0
    var v10: Vector[Double] = v0
    var v5: Double = v2
    v8 = v8.updated(2, v2)
    val v3: Double = v0(1)
    v10 = v10.updated(1, v3)
    val v16: Double = v10(2)
    var v12: Vector[Double] = v10
    v10 = v10.updated(1, v7)
    val v22: Double = v0(0)
    val v23: Double = v0(2)
    v8 = v8.updated(0, v16)
    val v21: Double = f45(v4)
    val v41: Double = f45(v23)
    v12 = v12.updated(0, v23)
    val v36: Double = f45(v22)
    val v31: Double = f45(v41)
    v8 = v8.updated(0, v21)
    v8 = v8.updated(2, v4)
    var v43: Vector[Double] = v12
    val v28: Double = v10(0)
    var v19: Double = v31
    val v95: Double = f45(v5)
    val v60: Double = f45(v36)
    val v27: Double = f45(v41)
    v10 = v10.updated(0, v19)
    var v83: Double = v28
    var v105: Vector[Double] = v8
    val v44: Double = v105(1)
    val v58: Double = f45(v60)
    v105 = v105.updated(0, v83)
    v105 = v43
    val v141: Double = f45(v58)
    v10 = v10.updated(1, v27)
    v12 = v12.updated(0, v141)
    v12 = v12.updated(0, v4)
    v8 = v8.updated(0, v95)
    val v176: Double = f45(v44)
    v176
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0, 2.0)
    val v1: Double = 3.0
    val v2: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}