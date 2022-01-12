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
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v4: Vector[s1] = v0(0)
    val v3: s1 = v4(0)
    val v6: Vector[s0] = v3.p0
    val v28: s0 = v6(0)
    val v19: Vector[Vector[Double]] = v28.p0
    val v29: Vector[Double] = v19(1)
    var v40: Vector[Double] = v29
    val v45: Double = v29(0)
    v40 = v40.updated(0, v45)
    val v36: Double = v40(0)
    v40 = v40.updated(0, v36)
    v40 = v40.updated(0, v36)
    val v208: Double = v1 + v36
    v208
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}