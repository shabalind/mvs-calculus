import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v5: Double = v1
    val v8: Vector[s0] = v0(1)
    val v3: s0 = v8(0)
    val v9: Vector[Vector[Double]] = v3.p0
    val v4: Vector[Double] = v9(0)
    v5 = v1
    v5 = v1
    val v27: Double = v5 + v1
    val v53: Double = v4(0)
    var v83: Double = v53
    val v98: Double = v83 / v27
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))))
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