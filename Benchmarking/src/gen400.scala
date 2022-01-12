import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Double): Double = {
    var v5: Double = v0
    var v1: Double = v5
    var v7: Double = v1
    var v13: Double = v7
    var v2: Double = v13
    var v9: Double = v5
    var v11: Double = v0
    var v12: Double = v1
    var v14: Double = v9
    var v20: Double = v1
    var v18: Double = v9
    var v32: Double = v12
    var v15: Double = v20
    var v24: Double = v20
    var v21: Double = v24
    var v29: Double = v7
    var v39: Double = v21
    val v26: Vector[Double] = Vector(v21, v15, v29, v18, v14, v11, v39)
    val v31: Double = v26(1)
    var v22: Vector[Double] = v26
    val v57: Double = v22(6)
    var v46: Vector[Double] = v26
    var v36: Double = v2
    v46 = v46.updated(5, v57)
    v1 = v57
    v18 = v31
    val v55: Double = v46(4)
    val v97: Vector[Double] = Vector(v36, v55)
    var v80: Vector[Double] = v97
    var v79: Vector[Double] = v80
    v24 = v32
    var v64: Vector[Double] = v79
    val v76: Double = v22(0)
    val v66: Double = v64(0)
    v5 = v76
    v66
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