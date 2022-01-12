import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f21(v0: Vector[s0]): Vector[s0] = {
    v0
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[s0], v2: Double): Double = {
    val v7: Vector[Double] = v0(0)
    var v9: Vector[Double] = v7
    val v3: Double = v2 + v2
    v9 = v9.updated(0, v3)
    val v6: Vector[s0] = f21(v1)
    val v5: s0 = v6(0)
    val v11: Vector[Vector[Double]] = v5.p1
    val v10: Vector[Double] = v11(0)
    val v8: Double = v10(0)
    var v19: Double = v8
    v9 = v9.updated(0, v8)
    val v31: Double = v10(0)
    v9 = v9.updated(0, v8)
    val v59: Double = v9(0)
    val v53: Double = v2 / v19
    v9 = v9.updated(0, v53)
    var v47: Double = v59
    var v55: Double = v31
    var v179: Double = v55
    v9 = v9.updated(0, v179)
    var v127: Double = v47
    val v177: Double = v127 * v47
    v177
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0))))
    val v2: Double = 7.0
    val start = nanoTime()
    var result: Double = 7.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}