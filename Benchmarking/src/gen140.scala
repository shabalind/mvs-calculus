import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v6(0)
    var v11: Vector[Vector[Double]] = v6
    val v7: Vector[Double] = v11(1)
    val v3: Double = v7(0)
    v11 = v11.updated(0, v4)
    v11 = v11.updated(0, v4)
    val v16: Double = v7(0)
    val v29: Double = v3 / v16
    val v18: Vector[Double] = Vector(v29)
    val v78: Double = v18(0)
    v78
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: s0 = s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}