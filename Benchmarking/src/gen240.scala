import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Double], v3: Double): Double = {
    var v6: Vector[Double] = v2
    v6 = v6.updated(0, v3)
    v6 = v6.updated(1, v3)
    val v5: Double = v2(1)
    v6 = v6.updated(0, v3)
    var v7: Vector[Double] = v6
    val v13: Vector[Double] = v1(2)
    v7 = v7.updated(0, v3)
    val v4: Double = v5 / v5
    v6 = v6.updated(0, v4)
    val v14: Vector[Double] = v0(0)
    var v39: Vector[Double] = v13
    val v21: Double = v39(0)
    var v26: Double = v3
    var v19: Double = v21
    val v33: Double = v2(0)
    v39 = v39.updated(0, v26)
    var v24: Double = v33
    v39 = v39.updated(0, v5)
    var v44: Vector[Double] = v39
    v7 = v7.updated(0, v19)
    var v31: Vector[Double] = v2
    val v59: Double = v2(1)
    v44 = v39
    v39 = v39.updated(0, v24)
    var v42: Double = v59
    val v77: Double = v21 / v21
    var v65: Vector[Double] = v7
    val v100: Vector[Vector[Double]] = Vector(v65, v31, v7, v6, v7, v7)
    val v120: Vector[Double] = v100(5)
    v44 = v44.updated(0, v5)
    val v78: Double = v120(0)
    v65 = v65.updated(2, v77)
    v7 = v7.updated(0, v24)
    var v119: Vector[Double] = v2
    val v143: Double = v119(2)
    val v79: Double = v14(0)
    v119 = v119.updated(0, v79)
    val v103: Double = v44(0)
    v31 = v31.updated(2, v143)
    var v301: Vector[Double] = v7
    v44 = v44.updated(0, v26)
    v65 = v65.updated(2, v103)
    v7 = v301
    var v177: Double = v78
    v301 = v301.updated(2, v42)
    v177
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0), Vector(3.0))
    val v2: Vector[Double] = Vector(4.0, 5.0, 6.0)
    val v3: Double = 7.0
    val start = nanoTime()
    var result: Double = 7.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}