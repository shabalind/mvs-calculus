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
  def f21(v0: s1): s1 = {
    val v3: s0 = v0.p1
    var v13: s1 = v0
    var v2: s0 = v3
    val v12: Vector[s0] = v13.p0
    v13 = v13.copy(p0 = v12)
    val v62: s1 = s1(v12, v2)
    var v28: s1 = v62
    v28
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: s1 = f21(v0)
    val v7: Vector[s0] = v4.p0
    val v14: s0 = v7(1)
    var v10: Double = v1
    val v16: s0 = v7(1)
    val v51: Vector[Vector[Double]] = v16.p0
    val v63: Vector[Vector[Double]] = v14.p0
    val v48: Vector[Double] = Vector(v1, v1, v10, v10)
    val v73: Vector[Double] = v63(1)
    var v69: Vector[Double] = v48
    val v62: Vector[Double] = v51(0)
    val v50: Double = v73(0)
    v69 = v69.updated(3, v50)
    val v86: Double = v62(0)
    val v163: Double = v69(2)
    v69 = v69.updated(0, v86)
    v163
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}