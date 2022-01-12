import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Vector[s0], v3: Vector[s0], v4: Double): Double = {
    var v11: s0 = v0
    val v10: s0 = v2(0)
    val v5: s0 = v3(1)
    val v21: Vector[Vector[Double]] = v11.p0
    val v29: Vector[Vector[Double]] = v10.p0
    val v45: Vector[Vector[Double]] = v5.p1
    var v55: Vector[Vector[Double]] = v21
    val v63: Vector[Double] = v21(1)
    v11 = v11.copy(p1 = v45)
    v11 = v11.copy(p0 = v55)
    val v44: Double = v63(0)
    v11 = v11.copy(p0 = v29)
    v44
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: s0 = s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))
    val v4: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}