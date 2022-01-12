import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f103(v0: Double): Double = {
    var v3: Double = v0
    var v4: Double = v0
    val v5: Double = v3 + v4
    val v9: Vector[Double] = Vector(v0, v0)
    var v2: Vector[Double] = v9
    val v11: Double = v9(1)
    val v13: Double = v9(0)
    v2 = v2.updated(1, v11)
    v2 = v2.updated(0, v13)
    var v14: Vector[Double] = v2
    v14 = v14.updated(1, v5)
    v14 = v14.updated(0, v11)
    v14 = v14.updated(1, v13)
    var v18: Vector[Double] = v14
    val v53: Double = v18(0)
    v53
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v2: Vector[Double] = v0(1)
    val v4: Double = v1 - v1
    val v3: Double = v4 + v4
    val v11: Double = v2(0)
    val v7: Double = f103(v11)
    var v13: Vector[Double] = v2
    val v16: Vector[Double] = v0(1)
    v13 = v13.updated(0, v4)
    v13 = v13.updated(0, v3)
    var v18: Vector[Double] = v13
    v13 = v13.updated(0, v7)
    val v26: Double = v16(0)
    v13 = v18
    var v47: Vector[Double] = v13
    v47 = v47.updated(0, v26)
    val v108: Double = v47(0)
    v108
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}