import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: s0, v2: s1, v3: s0, v4: Double): Double = {
    var v18: Double = v4
    v18 = v4
    val v12: Vector[Double] = Vector(v4, v18, v4, v18)
    val v17: Double = v12(2)
    var v34: Double = v18
    val v90: Double = v12(0)
    var v63: Vector[Double] = v12
    v63 = v63.updated(0, v90)
    var v155: Vector[Double] = v63
    val v183: Double = v155(3)
    v63 = v63.updated(1, v34)
    val v192: Double = v183 / v17
    v192
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: s0 = s0(Vector(Vector(6.0)), Vector(Vector(7.0)))
    val v2: s1 = s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))
    val v3: s0 = s0(Vector(Vector(14.0)), Vector(Vector(15.0)))
    val v4: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}