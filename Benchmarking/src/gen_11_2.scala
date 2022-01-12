import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f41(v0: Double, v1: Vector[Double]): Vector[Double] = {
    var v3: Double = v0
    var v20: Vector[Double] = v1
    v3 = v0
    v20 = v20.updated(0, v3)
    v20
  }
  @noinline
  def f0(v0: Vector[Double], v1: Vector[s0], v2: Double): Double = {
    val v3: s0 = v1(0)
    val v7: Vector[Vector[Double]] = v3.p0
    val v5: Double = v0(1)
    val v18: Vector[Double] = v7(0)
    val v16: Vector[Double] = f41(v5, v18)
    val v73: Double = v16(0)
    v73
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0, 1.0, 2.0)
    val v1: Vector[s0] = Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0))))
    val v2: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}