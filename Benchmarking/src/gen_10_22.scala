import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v4: Vector[Double] = v1(0)
    var v12: Vector[Double] = v4
    val v8: Double = v4(0)
    val v14: Vector[Double] = v1(0)
    v12 = v12.updated(0, v3)
    var v15: Vector[Double] = v14
    val v9: Vector[Double] = v0(0)
    var v23: Vector[Double] = v9
    var v21: Double = v8
    val v51: Vector[Double] = v1(0)
    val v43: Double = v15(0)
    val v62: Double = v12(0)
    v12 = v23
    val v47: Double = v12(0)
    val v65: Vector[Double] = Vector(v8, v47, v43, v3, v62)
    val v79: Double = v51(0)
    var v172: Vector[Double] = v65
    v172 = v172.updated(0, v47)
    var v180: Vector[Double] = v172
    val v135: Double = v180(1)
    var v124: Double = v21
    v15 = v15.updated(0, v79)
    var v81: Double = v135
    v180 = v180.updated(0, v124)
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v3: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}