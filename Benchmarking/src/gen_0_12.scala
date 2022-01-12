import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0,
    p2: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(0)
    val v2: Vector[Double] = Vector(v1, v1, v1)
    val v37: s1 = v7.p0
    val v49: Double = v2(2)
    val v16: s0 = v37.p0
    val v22: Vector[Vector[Double]] = v16.p1
    val v60: Vector[Double] = v22(1)
    var v69: Double = v49
    var v23: Vector[Double] = v60
    val v97: Double = v23(0)
    v23 = v23.updated(0, v69)
    v97
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}