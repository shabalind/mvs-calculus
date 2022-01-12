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
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v2: Vector[s0] = v0.p0
    val v4: Vector[s0] = v0.p0
    val v5: s0 = v2(1)
    val v10: s0 = v4(0)
    val v12: Vector[Vector[Double]] = v5.p0
    val v30: Vector[Vector[Double]] = v10.p1
    var v18: Vector[Vector[Double]] = v12
    val v19: Vector[Double] = v30(0)
    v18 = v18.updated(0, v19)
    val v48: Vector[Double] = v18(1)
    val v79: Double = v48(0)
    v79
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))
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