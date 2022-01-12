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
  @noinline
  def f0(v0: Vector[s1], v1: s0, v2: Double): Double = {
    val v4: s1 = v0(0)
    val v8: Vector[Vector[Double]] = v1.p0
    val v12: s0 = v4.p0
    val v14: Vector[Vector[Double]] = v12.p0
    val v19: Vector[Double] = v14(1)
    var v39: Vector[Double] = v19
    var v38: Vector[Vector[Double]] = v8
    v38 = v38.updated(1, v39)
    val v165: Vector[Double] = v38(0)
    val v113: Double = v165(0)
    v113
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))))
    val v1: s0 = s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))
    val v2: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}