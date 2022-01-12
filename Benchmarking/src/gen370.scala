import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s0]], v2: Double): Double = {
    var v4: s0 = v0
    val v6: Vector[s0] = v1(0)
    val v7: s0 = v6(0)
    val v8: Vector[Vector[Double]] = v4.p3
    val v5: Vector[Vector[Double]] = v7.p2
    v4 = v4.copy(p3 = v8)
    val v9: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p3 = v8)
    val v12: Vector[Vector[Double]] = v0.p2
    v4 = v4.copy(p2 = v12)
    v4 = v4.copy(p2 = v5)
    val v29: Vector[Vector[Double]] = v4.p2
    v4 = v4.copy(p3 = v9)
    val v64: Vector[Double] = v29(0)
    val v58: Double = v64(0)
    v58
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}