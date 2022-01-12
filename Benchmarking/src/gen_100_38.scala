import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v7: s0 = v0.p1
    val v9: Vector[Vector[Double]] = v7.p0
    var v8: Vector[Vector[Double]] = v9
    val v12: Vector[Double] = v9(1)
    val v32: Vector[Double] = v8(1)
    val v13: Double = v12(0)
    v8 = v8.updated(1, v32)
    val v48: Double = v32(0)
    var v54: Double = v13
    val v274: Double = v54 - v48
    v274
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}