import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  def f90(v0: s4): s4 = {
    var v1: s4 = v0
    var v8: s4 = v0
    val v13: s1 = v1.p0
    v8 = v8.copy(p0 = v13)
    v8
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v11: s4 = v0(2)
    val v22: s4 = f90(v11)
    val v16: s1 = v22.p1
    val v32: s0 = v16.p1
    val v36: Vector[Vector[Double]] = v32.p0
    val v41: Vector[Double] = v36(0)
    val v190: Double = v41(0)
    v190
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s1(Vector(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0)))), s0(Vector(Vector(2.0)))), s1(Vector(s0(Vector(Vector(3.0))), s0(Vector(Vector(4.0)))), s0(Vector(Vector(5.0))))), s4(s1(Vector(s0(Vector(Vector(6.0))), s0(Vector(Vector(7.0)))), s0(Vector(Vector(8.0)))), s1(Vector(s0(Vector(Vector(9.0))), s0(Vector(Vector(10.0)))), s0(Vector(Vector(11.0))))), s4(s1(Vector(s0(Vector(Vector(12.0))), s0(Vector(Vector(13.0)))), s0(Vector(Vector(14.0)))), s1(Vector(s0(Vector(Vector(15.0))), s0(Vector(Vector(16.0)))), s0(Vector(Vector(17.0))))))
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