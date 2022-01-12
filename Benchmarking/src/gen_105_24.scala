import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f57(v0: s0, v1: s0, v2: Double): s0 = {
    val v4: Vector[Vector[Double]] = v1.p1
    var v5: s0 = v0
    var v13: Vector[Vector[Double]] = v4
    val v30: Vector[Vector[Double]] = v1.p1
    val v19: Vector[Vector[Double]] = v0.p0
    var v33: Vector[Vector[Double]] = v30
    val v21: Vector[Double] = v13(0)
    v5 = v5.copy(p0 = v19)
    v5 = v5.copy(p1 = v33)
    val v50: Vector[Vector[Double]] = v1.p1
    var v53: s0 = v5
    v33 = v33.updated(0, v21)
    v5 = v5.copy(p1 = v50)
    v53
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v13: Vector[s0] = v0(1)
    val v21: s0 = v13(0)
    val v19: s0 = v13(0)
    val v16: s0 = f57(v19, v21, v1)
    val v26: Vector[Vector[Double]] = v16.p0
    var v57: Vector[Vector[Double]] = v26
    val v40: Vector[Double] = v57(1)
    val v108: Double = v40(0)
    v108
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}