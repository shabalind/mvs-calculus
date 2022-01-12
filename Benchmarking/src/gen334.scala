import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v2: s0 = v0
    val v5: Double = v1 - v1
    val v4: Vector[Vector[Double]] = v2.p1
    v2 = v2.copy(p1 = v4)
    val v7: Vector[Double] = v4(0)
    var v6: Double = v1
    var v12: Double = v1
    var v13: Double = v6
    var v25: Double = v6
    var v32: Double = v5
    var v19: Double = v32
    val v47: Vector[Double] = Vector(v32, v25, v19, v25, v12, v13)
    val v56: Double = v7(0)
    val v28: Double = v47(4)
    v13 = v56
    v28
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
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