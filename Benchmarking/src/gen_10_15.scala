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
    val v2: s0 = v0.p0
    val v3: Vector[Vector[Double]] = v2.p0
    var v6: Vector[Vector[Double]] = v3
    val v5: Vector[Double] = v6(0)
    val v7: Vector[Double] = Vector(v1, v1, v1, v1, v1, v1, v1)
    var v4: Vector[Double] = v5
    var v19: Vector[Double] = v7
    val v48: Double = v19(2)
    val v20: Double = v4(0)
    val v30: Double = v20 * v48
    v30
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
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