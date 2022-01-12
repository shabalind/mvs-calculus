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
  def f29(v0: Vector[s1]): Vector[s1] = {
    var v7: Vector[s1] = v0
    v7
  }
  def f23(v0: Vector[s1]): Vector[s1] = {
    val v7: Vector[s1] = f29(v0)
    val v1: s1 = v7(0)
    var v15: Vector[s1] = v7
    v15 = v15.updated(0, v1)
    var v50: Vector[s1] = v15
    v15 = v50
    v15
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v7: Vector[s1] = f23(v0)
    val v2: s1 = v7(0)
    val v8: Vector[s0] = v2.p0
    val v5: s0 = v8(1)
    val v9: Double = v1 / v1
    val v10: Vector[Vector[Double]] = v5.p1
    val v18: Vector[Double] = v10(2)
    val v27: Double = v18(0)
    val v146: Double = v9 + v27
    v146
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}