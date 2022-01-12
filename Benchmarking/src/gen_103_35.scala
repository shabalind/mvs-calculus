import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  def f7(v0: s1, v1: s0): s1 = {
    v0
  }
  @noinline
  def f0(v0: Vector[s1], v1: Vector[s0], v2: s1, v3: s1, v4: Double): Double = {
    val v6: s0 = v2.p0
    val v7: Double = v4 + v4
    val v16: Double = v7 - v4
    val v14: Double = v16 + v16
    val v27: s1 = f7(v2, v6)
    val v20: s0 = v27.p0
    val v13: Vector[Vector[Double]] = v20.p0
    val v23: Vector[Double] = v13(1)
    val v55: Double = v23(0)
    val v41: Double = v14 + v55
    val v135: Double = v41 * v41
    v135
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))
    val v2: s1 = s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))
    val v3: s1 = s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))
    val v4: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}