import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f17(v0: Double): Double = {
    var v2: Double = v0
    var v6: Double = v2
    v2 = v6
    val v1: Double = v6 * v6
    var v4: Double = v1
    var v3: Double = v4
    var v21: Double = v3
    v21
  }
  @noinline
  def f0(v0: Double): Double = {
    var v7: Double = v0
    var v1: Double = v0
    var v5: Double = v7
    var v10: Double = v5
    var v9: Double = v1
    v5 = v10
    var v23: Double = v1
    val v30: Double = f17(v23)
    val v15: Double = f17(v9)
    val v73: Vector[Double] = Vector(v5, v10)
    v1 = v10
    var v107: Vector[Double] = v73
    v107 = v107.updated(0, v15)
    var v172: Double = v30
    var v93: Vector[Double] = v107
    val v79: Double = v93(0)
    v10 = v30
    v93 = v93.updated(1, v172)
    v79
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