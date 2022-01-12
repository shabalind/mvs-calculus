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
  def f0(v0: s1, v1: Double): Double = {
    var v18: Double = v1
    val v17: Vector[Double] = Vector(v1, v18, v1, v1)
    var v28: Vector[Double] = v17
    val v34: Double = v28(2)
    val v31: Double = v17(2)
    v28 = v28.updated(3, v31)
    var v57: Double = v34
    val v29: Double = v28(3)
    val v103: Double = v28(2)
    val v54: Double = v31 - v103
    v28 = v28.updated(1, v54)
    val v84: Double = v57 - v29
    v84
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}