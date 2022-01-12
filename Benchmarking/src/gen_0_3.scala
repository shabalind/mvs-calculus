import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v8: s1 = v0.p0
    val v2: s0 = v8.p2
    val v6: Vector[Vector[Double]] = v2.p0
    var v4: Vector[Vector[Double]] = v6
    val v9: Vector[Double] = v4(0)
    val v14: Vector[Double] = v4(0)
    v4 = v4.updated(0, v14)
    val v21: Double = v14(0)
    v4 = v4.updated(0, v9)
    val v23: Double = v14(0)
    var v19: Double = v23
    v4 = v4.updated(0, v9)
    val v69: Double = v1 * v23
    val v68: Double = v19 - v69
    v4 = v4.updated(0, v14)
    val v71: Vector[Double] = Vector(v69, v68, v21)
    var v144: Vector[Double] = v71
    val v280: Double = v144(0)
    v280
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0))), s0(Vector(Vector(2.0)))), Vector(Vector(s0(Vector(Vector(3.0))))), s0(Vector(Vector(4.0)))), Vector(s0(Vector(Vector(5.0)))))
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