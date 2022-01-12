import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: s2,
    p1: s1
  )
  case class s6 (
    p0: s4,
    p1: s0
  )
  def f12(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    var v5: s0 = v0
    var v16: Vector[Vector[Double]] = v2
    v5 = v5.copy(p1 = v16)
    v5
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v6: s6 = v0(0)
    val v2: s0 = v6.p1
    val v3: s0 = f12(v2)
    val v7: Vector[Vector[Double]] = v3.p1
    val v14: Vector[Double] = v7(1)
    val v35: Double = v14(0)
    v35
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s4(s2(Vector(s1(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(4.0), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))))), s0(Vector(8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s1(s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), Vector(Vector(s0(Vector(16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))), s0(Vector(20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}