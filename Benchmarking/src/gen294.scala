import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f25(v0: s0, v1: Vector[s0], v2: s0): Vector[s0] = {
    val v10: s0 = v1(0)
    var v5: Vector[s0] = v1
    v5 = v5.updated(2, v2)
    var v13: Vector[s0] = v5
    v5 = v5.updated(1, v10)
    var v140: Vector[s0] = v13
    val v111: Vector[Vector[s0]] = Vector(v140)
    var v120: Vector[Vector[s0]] = v111
    val v184: Vector[s0] = v120(0)
    v184
  }
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: s0, v3: Double): Double = {
    val v24: Vector[s0] = f25(v1, v0, v1)
    val v16: s0 = v24(2)
    val v73: Vector[Vector[Double]] = v16.p0
    val v61: Vector[Double] = v73(0)
    val v46: Double = v61(0)
    var v129: Double = v46
    v129
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: s0 = s0(Vector(Vector(6.0)), Vector(Vector(7.0)))
    val v2: s0 = s0(Vector(Vector(8.0)), Vector(Vector(9.0)))
    val v3: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}