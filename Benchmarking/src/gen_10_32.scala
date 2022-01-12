import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v2: Vector[s1] = v0(0)
    val v4: s1 = v2(0)
    val v7: Vector[Vector[s0]] = v4.p0
    val v17: Double = v1 + v1
    val v13: Vector[s0] = v7(0)
    val v19: Double = v1 / v17
    val v30: s0 = v13(0)
    val v18: Vector[Vector[Double]] = v30.p1
    val v66: Vector[Double] = v18(1)
    val v24: Double = v66(0)
    val v73: Vector[Double] = Vector(v17, v24, v24, v19, v1)
    val v163: Double = v73(2)
    v163
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}