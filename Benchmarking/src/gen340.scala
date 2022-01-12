import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v7: Vector[Vector[Double]] = v1.p1
    val v8: Vector[Vector[Vector[Double]]] = Vector(v7, v7, v7)
    val v4: Vector[Vector[Double]] = v8(0)
    val v6: Vector[Double] = v4(0)
    var v22: Vector[Vector[Double]] = v7
    val v11: Vector[Double] = v22(0)
    var v19: Vector[Double] = v6
    v22 = v7
    val v14: Double = v11(0)
    val v24: Vector[Vector[Double]] = v1.p0
    v19 = v19.updated(0, v14)
    v19 = v19.updated(0, v2)
    val v25: Vector[Double] = v24(1)
    v22 = v22.updated(2, v25)
    val v41: Double = v2 - v14
    v19 = v19.updated(0, v14)
    v19 = v19.updated(0, v2)
    val v80: Double = v2 / v41
    v22 = v22.updated(0, v19)
    v80
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: s0 = s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))
    val v2: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}