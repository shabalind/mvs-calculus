import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    val v10: Double = v7(2)
    val v11: Double = v7(4)
    var v9: Double = v11
    var v13: Double = v1
    val v29: Vector[Double] = Vector(v13, v11, v10, v11, v11, v1)
    var v18: Vector[Double] = v29
    val v15: Vector[Vector[Double]] = Vector(v29, v29, v18, v18, v18, v18)
    v18 = v18.updated(4, v9)
    v18 = v18.updated(0, v13)
    v18 = v18.updated(4, v13)
    val v35: Vector[Double] = v15(0)
    var v26: Vector[Double] = v35
    v26 = v35
    val v46: Double = v26(1)
    v46
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}