import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p1
    var v10: Double = v2
    var v23: Double = v2
    val v9: Vector[Double] = v3(0)
    val v24: Double = v9(0)
    v10 = v24
    val v49: Vector[Double] = Vector(v24, v10, v2, v10, v10)
    var v35: Vector[Double] = v49
    v10 = v24
    val v36: Double = v9(0)
    var v67: Vector[Double] = v35
    var v34: Double = v36
    var v29: Double = v36
    val v55: Double = v29 + v10
    var v44: Double = v34
    v35 = v35.updated(2, v44)
    val v64: Double = v49(3)
    v67 = v67.updated(1, v55)
    v67 = v67.updated(1, v23)
    val v93: Double = v67(2)
    v35 = v35.updated(2, v64)
    v93
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s0 = s0(Vector(Vector(2.0)), Vector(Vector(3.0)))
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