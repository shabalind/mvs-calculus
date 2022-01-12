import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Double
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    var v7: Double = v1
    val v5: Vector[Double] = Vector(v1, v7, v1, v1)
    var v8: Double = v1
    val v11: Double = v5(0)
    val v45: s2 = v0(0)
    val v40: Vector[Vector[Double]] = Vector(v5, v5, v5)
    val v48: Double = v45.p1
    v7 = v11
    val v81: Double = v48 / v8
    v7 = v81
    val v114: Vector[Double] = v40(2)
    val v124: Double = v114(0)
    v124
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), 15.0))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}