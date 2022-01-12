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
    val v10: Vector[Vector[Double]] = v1.p0
    var v13: Vector[Vector[Double]] = v10
    val v6: Vector[Double] = v10(0)
    var v30: Vector[Vector[Double]] = v10
    v13 = v13.updated(0, v6)
    val v12: Vector[Double] = v10(0)
    v30 = v30.updated(0, v12)
    val v17: Vector[Double] = v13(0)
    v13 = v13.updated(0, v17)
    v13 = v13.updated(0, v17)
    val v38: Vector[Double] = v30(0)
    v30 = v30.updated(0, v6)
    val v53: Double = v38(0)
    v30 = v30.updated(0, v17)
    v53
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v1: s0 = s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))
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