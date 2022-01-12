import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f81(v0: Double): Double = {
    var v3: Double = v0
    var v1: Double = v3
    var v5: Double = v3
    val v2: Double = v1 + v3
    var v8: Double = v0
    var v7: Double = v8
    var v6: Double = v5
    var v12: Double = v6
    var v11: Double = v12
    val v18: Vector[Double] = Vector(v7, v0, v11, v5, v3, v7)
    val v20: Double = v18(2)
    var v39: Vector[Double] = v18
    v39 = v39.updated(5, v20)
    v39 = v39.updated(0, v11)
    v39 = v39.updated(3, v2)
    val v40: Double = v39(5)
    v40
  }
  def f44(v0: Vector[Double], v1: Vector[Double]): Vector[Double] = {
    val v3: Double = v0(0)
    val v9: Double = f81(v3)
    var v13: Double = v9
    var v14: Vector[Double] = v0
    val v28: Double = v14(0)
    var v10: Vector[Double] = v0
    v10 = v10.updated(0, v28)
    v10 = v10.updated(0, v13)
    val v32: Double = v14(0)
    var v26: Vector[Double] = v10
    var v56: Vector[Double] = v26
    val v132: Double = v14(0)
    var v68: Vector[Double] = v56
    v10 = v10.updated(0, v32)
    var v145: Vector[Double] = v68
    v26 = v26.updated(0, v132)
    var v157: Vector[Double] = v10
    v10 = v157
    v145
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    var v6: Double = v3
    val v4: Vector[Double] = v1(0)
    var v13: Vector[Double] = v4
    val v10: Vector[Double] = f44(v4, v4)
    val v9: Double = v13(0)
    v13 = v13.updated(0, v9)
    val v21: Double = v6 * v9
    v13 = v13.updated(0, v6)
    val v34: Double = v10(0)
    val v36: Double = v21 + v34
    v36
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0), Vector(3.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(4.0), Vector(5.0))
    val v3: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}