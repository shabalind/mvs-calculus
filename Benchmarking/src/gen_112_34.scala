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
  case class s2 (
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v3: s0 = v0.p1
    val v7: Vector[Vector[Double]] = v3.p0
    val v2: Vector[Vector[Double]] = v3.p1
    val v13: Vector[Double] = v2(0)
    val v16: Vector[Double] = v7(0)
    val v48: Double = v13(0)
    val v35: Double = v16(0)
    var v25: Double = v35
    val v31: Double = v48 / v25
    val v103: Double = v31 - v35
    v103
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}