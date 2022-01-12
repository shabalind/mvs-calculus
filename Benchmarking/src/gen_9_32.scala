import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s1, v1: s1, v2: Double): Double = {
    val v11: Vector[Vector[s0]] = v1.p1
    val v15: Vector[s0] = v11(1)
    val v3: s0 = v15(0)
    val v10: s0 = v15(0)
    val v19: Vector[Vector[Double]] = v10.p0
    val v34: Vector[Double] = v19(1)
    val v29: Double = v34(0)
    val v33: Double = v3.p1
    var v39: Double = v29
    val v75: Double = v33 - v39
    v75
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), 2.0), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), 5.0)), Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0)), Vector(s0(Vector(Vector(9.0), Vector(10.0)), 11.0))))
    val v1: s1 = s1(s0(Vector(Vector(12.0), Vector(13.0)), 14.0), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0)), Vector(s0(Vector(Vector(18.0), Vector(19.0)), 20.0)), Vector(s0(Vector(Vector(21.0), Vector(22.0)), 23.0))))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}