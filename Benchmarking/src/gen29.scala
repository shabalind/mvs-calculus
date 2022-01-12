import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v5: s0 = v0(0)
    var v3: Double = v1
    v3 = v1
    val v9: Vector[Vector[Double]] = v5.p1
    val v14: Vector[Double] = v9(1)
    val v25: Vector[Double] = v9(0)
    var v8: Vector[Vector[Double]] = v9
    v8 = v8.updated(0, v14)
    var v30: Vector[Double] = v25
    val v24: Vector[Vector[Double]] = v5.p0
    v8 = v8.updated(0, v25)
    val v27: Vector[Double] = v8(1)
    val v35: Double = v30(0)
    val v42: Vector[Double] = v24(0)
    v30 = v42
    val v36: Vector[Vector[Double]] = Vector(v30, v27, v27, v14, v42, v14)
    val v29: Double = v27(0)
    var v72: Vector[Vector[Double]] = v36
    val v63: Vector[Double] = v36(5)
    val v48: Vector[Double] = v72(1)
    v8 = v8.updated(0, v48)
    val v178: Vector[Double] = Vector(v3, v35, v29)
    v72 = v72.updated(5, v63)
    var v96: Vector[Double] = v178
    val v64: Double = v96(1)
    v64
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}