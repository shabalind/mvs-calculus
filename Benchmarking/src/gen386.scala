import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v8: s0 = v0.p1
    val v4: Vector[Vector[Double]] = v8.p0
    val v12: Vector[Double] = v4(0)
    var v16: Vector[Vector[Double]] = v4
    v16 = v16.updated(0, v12)
    val v9: Vector[Double] = v16(0)
    v16 = v16.updated(0, v12)
    val v19: Double = v9(0)
    var v18: Double = v19
    var v62: Double = v18
    v62 = v1
    v62
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}