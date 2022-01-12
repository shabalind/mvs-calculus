import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v9: Vector[Double] = Vector(v1, v1, v1, v1)
    val v2: Double = v9(0)
    var v18: Double = v2
    var v16: Vector[Double] = v9
    v16 = v16.updated(1, v1)
    v18 = v2
    val v33: Double = v16(3)
    v16 = v16.updated(0, v18)
    var v32: Double = v33
    v16 = v16.updated(3, v33)
    v18 = v33
    v32
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))))
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