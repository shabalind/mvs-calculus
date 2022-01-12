import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v7: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v7.p1
    val v3: Vector[Double] = v6(1)
    val v11: Vector[Vector[Double]] = Vector(v3, v3, v3, v3, v3, v3)
    val v52: Vector[Double] = v11(2)
    var v20: Vector[Vector[Double]] = v11
    var v51: Vector[Double] = v52
    var v50: Vector[Double] = v3
    val v140: Vector[Double] = v20(0)
    v20 = v20.updated(1, v50)
    val v68: Double = v140(0)
    val v67: Double = v51(0)
    val v304: Double = v68 / v67
    v304
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))
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