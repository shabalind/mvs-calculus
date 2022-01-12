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
    p0: Vector[s1],
    p1: s0
  )
  def f62(v0: Vector[s2]): Vector[s2] = {
    v0
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    var v5: Double = v1
    val v2: Vector[Double] = Vector(v1, v5, v1, v5)
    val v10: Double = v2(0)
    var v8: Double = v10
    val v17: Vector[s2] = v0(0)
    val v28: Vector[s2] = f62(v17)
    val v14: s2 = v28(0)
    val v16: s0 = v14.p1
    val v29: Vector[Vector[Double]] = v16.p1
    val v40: Vector[Double] = v29(0)
    val v107: Double = v40(0)
    val v94: Double = v8 / v107
    v94
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}