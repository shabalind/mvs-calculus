import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Vector[s0], v3: Double): Double = {
    val v5: s0 = v2(1)
    val v7: Vector[Vector[Double]] = v5.p0
    val v6: Vector[Double] = v7(0)
    val v18: s0 = v2(1)
    val v17: Vector[Vector[Double]] = v18.p0
    val v15: Vector[Double] = v17(0)
    val v23: Double = v15(0)
    var v24: Vector[Double] = v6
    v24 = v24.updated(0, v23)
    val v68: Double = v24(0)
    v68
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: s0 = s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v3: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}