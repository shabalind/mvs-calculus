import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v5: Double = v1
    val v6: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Double] = v0.p1
    val v7: Vector[Double] = v0.p1
    val v30: Vector[Double] = v6(0)
    val v13: Double = v30(0)
    val v17: Double = v8(2)
    val v31: Double = v7(2)
    val v16: Vector[Double] = Vector(v5, v17, v31, v17, v13)
    var v33: Vector[Double] = v16
    val v58: Vector[Vector[Double]] = Vector(v33, v16)
    var v44: Vector[Vector[Double]] = v58
    val v170: Vector[Double] = v44(0)
    val v158: Double = v170(3)
    v158
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(2.0, 3.0, 4.0))
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