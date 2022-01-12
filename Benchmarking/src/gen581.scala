import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s7 (
    p0: s1,
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: s0, v1: s7, v2: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v3(0)
    var v8: Vector[Vector[Double]] = v3
    v8 = v8.updated(0, v4)
    v8 = v3
    v8 = v8.updated(0, v4)
    val v18: Vector[Double] = v8(0)
    v8 = v3
    val v34: Double = v18(0)
    var v56: Double = v34
    var v99: Double = v56
    v99
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: s7 = s7(s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s2(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))))
    val v2: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}