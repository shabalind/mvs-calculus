import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v4: Double = v1
    var v15: Double = v4
    val v5: Vector[s0] = v0(1)
    val v9: s0 = v5(0)
    val v24: Double = v15 * v4
    val v17: Vector[Vector[Double]] = v9.p0
    val v21: Vector[Double] = v17(0)
    var v25: Vector[Double] = v21
    v25 = v25.updated(0, v24)
    val v87: Double = v25(0)
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}