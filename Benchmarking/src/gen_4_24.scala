import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v6: Vector[Vector[s0]] = v0.p0
    val v4: Vector[s0] = v6(0)
    val v3: s0 = v4(0)
    val v8: Vector[Vector[Double]] = v3.p0
    val v11: Vector[Double] = v8(1)
    var v23: Double = v1
    var v44: Vector[Double] = v11
    val v38: Double = v44(0)
    v44 = v44.updated(0, v23)
    var v99: Double = v38
    val v59: Double = v99 * v38
    v59
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))))
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