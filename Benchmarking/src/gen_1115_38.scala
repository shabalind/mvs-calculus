import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f101(v0: s0): s0 = {
    var v2: s0 = v0
    v2
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[Double], v2: s0, v3: s0, v4: Double): Double = {
    val v7: s0 = v0(0)
    val v8: Double = v4 / v4
    val v11: s0 = f101(v2)
    val v12: Double = v8 * v4
    val v20: Vector[Vector[Double]] = v11.p1
    val v21: Vector[Vector[Double]] = v7.p0
    val v41: Double = v1(1)
    var v30: Vector[Vector[Double]] = v20
    val v27: Vector[Double] = v30(0)
    val v25: Vector[Double] = v30(0)
    val v26: Double = v27(0)
    val v47: Vector[Double] = v21(1)
    val v53: Double = v47(0)
    val v115: Double = v12 * v41
    v30 = v30.updated(0, v25)
    var v78: Vector[Double] = v1
    v30 = v30.updated(0, v27)
    val v79: Double = v78(1)
    val v90: Vector[Double] = Vector(v26, v53, v53, v115, v41, v115, v79)
    val v127: Double = v90(2)
    v127
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))
    val v1: Vector[Double] = Vector(3.0, 4.0)
    val v2: s0 = s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))
    val v3: s0 = s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)))
    val v4: Double = 11.0
    val start = nanoTime()
    var result: Double = 11.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}