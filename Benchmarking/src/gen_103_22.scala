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
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v4: Vector[s1] = v0
    var v5: Vector[s1] = v0
    val v11: s1 = v5(1)
    val v13: s0 = v11.p1
    val v12: Vector[Vector[Double]] = v13.p0
    val v16: s1 = v0(0)
    val v31: Vector[Double] = v12(0)
    var v33: Vector[Double] = v31
    v5 = v5.updated(1, v16)
    val v83: Double = v33(0)
    v5 = v4
    v83
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s1(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}