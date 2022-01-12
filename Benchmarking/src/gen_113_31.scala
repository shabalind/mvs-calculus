import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v3: Double = v1
    val v6: Vector[s0] = v0.p1
    val v5: Vector[Double] = Vector(v1, v1, v3, v1, v3)
    val v9: s0 = v6(2)
    val v17: Double = v5(1)
    val v16: Vector[Vector[Double]] = v9.p1
    val v29: Vector[Double] = v16(0)
    val v25: Double = v29(0)
    val v49: Double = v17 - v25
    var v54: Double = v49
    v54
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}