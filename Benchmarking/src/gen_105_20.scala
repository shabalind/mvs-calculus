import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f59(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v0
    var v18: Double = v4
    var v21: Double = v1
    val v40: Vector[Double] = Vector(v18)
    var v22: Vector[Double] = v40
    var v33: Vector[Double] = v22
    v22 = v22.updated(0, v21)
    val v39: Double = v33(0)
    v39
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v5: Double = v1
    v5 = v1
    v5 = v1
    val v16: Double = f59(v5)
    var v35: Double = v16
    val v54: Double = v35 - v35
    v35 = v16
    v5 = v35
    val v140: Double = v54 - v1
    v140
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))))
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