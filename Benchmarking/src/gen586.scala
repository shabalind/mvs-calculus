import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Vector[s0], v2: s0, v3: Double): Double = {
    val v4: Vector[Vector[Double]] = v2.p0
    val v8: Vector[Double] = v4(0)
    var v13: Double = v3
    val v7: Double = v13 * v13
    val v21: Double = v8(0)
    var v24: Double = v7
    v13 = v7
    v24 = v21
    var v205: Double = v24
    val v136: Double = v205 / v21
    v136
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v2: s0 = s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))
    val v3: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}