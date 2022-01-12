import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v8: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Double] = v8(0)
    val v10: Double = v1 * v1
    var v16: Vector[Double] = v14
    v16 = v16.updated(0, v1)
    val v17: Double = v16(0)
    val v38: Double = v14(0)
    v16 = v16.updated(0, v38)
    val v122: Double = v10 * v17
    val v91: Double = v1 + v122
    v91
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0)))
    val v1: Double = 11.0
    val start = nanoTime()
    var result: Double = 11.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}