import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v3: Double = v1
    val v8: Double = v1 * v3
    var v4: Double = v8
    var v2: Double = v4
    v4 = v3
    val v14: Vector[Double] = Vector(v4, v4, v2, v8, v4, v2, v1)
    var v24: Vector[Double] = v14
    v24 = v14
    v24 = v24.updated(4, v2)
    val v42: Double = v24(5)
    var v51: Vector[Double] = v24
    val v76: Double = v51(1)
    v51 = v51.updated(3, v42)
    v76
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(1.0)), s0(Vector(Vector(2.0)), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(5.0)), s0(Vector(Vector(6.0)), Vector(7.0))))
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