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
  def f0(v0: Vector[Vector[s1]], v1: Vector[Vector[s0]], v2: Double): Double = {
    var v8: Vector[Vector[s0]] = v1
    val v4: Vector[s0] = v8(1)
    val v6: s0 = v4(0)
    val v17: Vector[s0] = v8(0)
    val v12: Vector[Vector[Double]] = v6.p0
    val v5: Vector[s0] = v1(1)
    val v14: Vector[Double] = v12(0)
    v8 = v8.updated(0, v5)
    v8 = v8.updated(1, v17)
    val v34: Double = v14(0)
    v8 = v8.updated(1, v5)
    v34
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))
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