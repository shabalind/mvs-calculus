import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f2(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v3: Vector[Vector[Double]] = v0
    val v6: Vector[Double] = v0(2)
    v3 = v3.updated(1, v6)
    val v2: Vector[Double] = v3(0)
    v3 = v3.updated(1, v2)
    v3 = v3.updated(1, v6)
    v3 = v0
    v3 = v0
    v3 = v3.updated(1, v2)
    val v4: Double = v2(0)
    val v11: Vector[Double] = v3(2)
    val v9: Double = v11(0)
    var v15: Vector[Vector[Double]] = v3
    var v13: Vector[Vector[Double]] = v15
    val v16: Vector[Double] = v15(0)
    var v27: Double = v9
    v13 = v3
    v13 = v13.updated(2, v11)
    v13 = v13.updated(0, v16)
    val v32: Vector[Double] = Vector(v4)
    val v19: Vector[Double] = v0(2)
    var v57: Vector[Double] = v11
    v15 = v15.updated(2, v57)
    v13 = v0
    v15 = v15.updated(2, v32)
    val v23: Vector[Double] = v15(0)
    v57 = v57.updated(0, v27)
    v13 = v13.updated(2, v23)
    v13 = v13.updated(0, v19)
    v13
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    var v7: Vector[Vector[Double]] = v0
    val v4: Vector[Double] = v2(0)
    v7 = v7.updated(2, v4)
    val v5: Vector[Double] = v2(0)
    val v22: Double = v5(0)
    val v35: Double = v22 * v22
    val v29: Vector[Double] = v0(0)
    val v71: Vector[Vector[Double]] = f2(v7)
    v7 = v7.updated(1, v29)
    val v30: Vector[Double] = v71(0)
    val v37: Double = v30(0)
    v7 = v7.updated(1, v29)
    val v66: Vector[Double] = Vector(v35, v35, v37, v37)
    var v78: Vector[Double] = v66
    val v91: Double = v78(1)
    v91
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