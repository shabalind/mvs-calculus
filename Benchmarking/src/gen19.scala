import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v6: Vector[Vector[Double]] = v1.p0
    val v3: Vector[Vector[Double]] = v1.p0
    val v9: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v6(0)
    var v8: Double = v2
    val v18: Vector[Double] = v9(1)
    val v12: Vector[Double] = v3(0)
    var v19: Double = v2
    val v17: Double = v12(0)
    var v28: Double = v8
    v8 = v2
    val v25: Double = v19 * v2
    val v41: Double = v25 + v25
    val v29: Double = v18(0)
    val v38: Double = v4(0)
    val v45: Vector[Double] = Vector(v28, v41, v17, v38, v28, v29, v41)
    var v51: Vector[Double] = v45
    val v59: Vector[Vector[Double]] = Vector(v51, v51, v45, v45, v45)
    val v90: Vector[Double] = v59(1)
    val v116: Double = v90(4)
    v116
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))
    val v1: s0 = s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}