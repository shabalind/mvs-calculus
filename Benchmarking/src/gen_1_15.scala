import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    val v6: Double = v0(0)
    var v8: Vector[Double] = v0
    val v9: Double = v0(0)
    val v3: Double = v0(0)
    val v4: Double = v0(0)
    val v27: Double = v0(0)
    var v11: Double = v4
    var v10: Vector[Double] = v0
    v11 = v4
    v10 = v10.updated(0, v9)
    v10 = v10.updated(0, v6)
    v8 = v8.updated(0, v4)
    v8 = v8.updated(0, v9)
    v8 = v8.updated(0, v11)
    val v12: Double = v8(0)
    var v14: Vector[Double] = v8
    v11 = v27
    val v36: Double = v14(0)
    val v28: Double = v8(0)
    val v38: Vector[Double] = Vector(v3, v27, v36, v28, v27, v9, v4)
    var v29: Vector[Double] = v38
    v10 = v10.updated(0, v36)
    var v24: Double = v28
    var v55: Vector[Double] = v29
    var v75: Vector[Double] = v29
    v29 = v29.updated(6, v12)
    v29 = v29.updated(0, v27)
    val v100: Double = v10(0)
    var v37: Vector[Double] = v55
    v29 = v29.updated(5, v27)
    v55 = v55.updated(2, v100)
    var v88: Vector[Double] = v75
    val v96: Double = v37(0)
    val v127: Double = v37(1)
    var v69: Vector[Double] = v88
    val v65: Double = v69(3)
    v8 = v8.updated(0, v24)
    v69 = v69.updated(5, v127)
    v88 = v88.updated(5, v127)
    v75 = v75.updated(6, v96)
    v65
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