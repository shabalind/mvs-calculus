import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v9: Vector[Vector[Double]] = v0.p0
    var v5: Double = v2
    val v4: Vector[Double] = v9(0)
    var v32: Double = v5
    val v25: Double = v2 / v32
    val v37: Double = v4(0)
    var v20: Vector[Double] = v4
    v20 = v4
    v32 = v37
    v20 = v20.updated(0, v25)
    var v54: Vector[Double] = v20
    val v56: Double = v54(0)
    v54 = v54.updated(0, v25)
    var v129: Double = v56
    v129
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}