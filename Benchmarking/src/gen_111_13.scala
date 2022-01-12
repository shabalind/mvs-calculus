import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f2(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v4
    var v3: Double = v6
    var v5: Double = v4
    var v7: Double = v3
    var v1: Double = v5
    var v12: Double = v7
    val v17: Double = v6 / v4
    var v21: Double = v1
    var v8: Double = v12
    val v18: Vector[Double] = Vector(v3, v12, v21)
    val v56: Vector[Vector[Double]] = Vector(v18, v18, v18)
    var v24: Vector[Vector[Double]] = v56
    val v31: Vector[Double] = Vector(v3, v5, v8, v5)
    v24 = v24.updated(0, v18)
    val v73: Vector[Double] = v24(2)
    val v33: Vector[Double] = v24(0)
    var v37: Vector[Vector[Double]] = v24
    var v50: Double = v7
    v37 = v37.updated(0, v18)
    var v32: Vector[Vector[Double]] = v37
    var v59: Vector[Vector[Double]] = v32
    v24 = v24.updated(2, v33)
    var v55: Vector[Double] = v73
    v59 = v59.updated(2, v33)
    v32 = v32.updated(1, v18)
    v24 = v24.updated(0, v73)
    val v36: Double = v55(0)
    var v41: Vector[Double] = v18
    var v48: Vector[Double] = v18
    var v83: Vector[Vector[Double]] = v59
    v37 = v37.updated(2, v33)
    v48 = v48.updated(0, v36)
    v83 = v83.updated(1, v48)
    var v53: Vector[Double] = v31
    v41 = v41.updated(0, v50)
    v55 = v55.updated(1, v17)
    val v51: Double = v53(3)
    v55 = v55.updated(0, v51)
    val v172: Vector[Double] = v59(0)
    v24 = v24.updated(0, v33)
    val v64: Vector[Double] = v83(1)
    var v86: Vector[Vector[Double]] = v56
    v59 = v59.updated(2, v41)
    v55 = v172
    val v85: Double = v64(2)
    val v82: Vector[Double] = v86(2)
    v83 = v83.updated(0, v82)
    v83 = v83.updated(0, v82)
    v85
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v5: Double = v3 * v3
    val v20: Double = f2(v5)
    val v17: Double = f2(v5)
    var v52: Double = v17
    val v28: Double = v52 * v5
    v52 = v20
    val v150: Double = f2(v28)
    v150
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0), Vector(5.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(6.0), Vector(7.0))
    val v3: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}