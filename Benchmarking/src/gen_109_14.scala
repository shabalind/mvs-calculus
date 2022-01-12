import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f3(v0: Vector[s0]): Vector[s0] = {
    val v4: Vector[Vector[s0]] = Vector(v0, v0, v0, v0, v0, v0)
    var v18: Vector[Vector[s0]] = v4
    val v40: Vector[s0] = v18(2)
    val v43: Vector[s0] = v18(1)
    v18 = v18.updated(4, v43)
    v18 = v18.updated(3, v0)
    v18 = v18.updated(2, v40)
    var v48: Vector[s0] = v43
    v48
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v2: Vector[s0] = f3(v0)
    val v4: s0 = v2(0)
    val v6: s0 = v0(0)
    val v13: Vector[Vector[Double]] = v4.p1
    val v33: Vector[Double] = v13(0)
    val v14: Double = v33(0)
    val v43: Vector[Vector[Double]] = v6.p1
    val v26: Vector[Double] = v43(1)
    val v23: Double = v26(0)
    var v73: Double = v14
    v73 = v23
    v73
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}