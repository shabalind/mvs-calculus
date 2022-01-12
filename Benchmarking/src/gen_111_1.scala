import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    val v5: Vector[s0] = v1.p1
    val v4: s0 = v5(0)
    var v8: Double = v2
    val v10: Vector[Vector[Double]] = v4.p1
    var v23: Double = v8
    var v16: Double = v23
    val v28: Vector[Double] = v10(0)
    val v18: Double = v28(0)
    var v25: Double = v2
    v25 = v23
    val v93: Double = v16 / v25
    val v144: Double = v93 + v18
    v144
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))
    val v1: s1 = s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))))
    val v2: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}