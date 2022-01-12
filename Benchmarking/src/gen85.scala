import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v2: Double = v1
    var v3: Double = v1
    v3 = v2
    var v22: Double = v3
    val v31: Double = v1 / v1
    val v30: Double = v31 * v31
    var v27: Double = v31
    val v37: Double = v22 * v30
    val v178: Vector[Double] = Vector(v1, v3, v2, v31, v37, v37, v27)
    val v81: Double = v178(1)
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))
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