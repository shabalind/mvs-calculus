import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: s0 = v0.p0
    val v3: Vector[Vector[Double]] = v4.p1
    val v11: Vector[Vector[Double]] = v4.p0
    var v10: Vector[Vector[Double]] = v3
    val v22: Vector[Double] = v10(0)
    var v27: Vector[Vector[Double]] = v10
    val v18: Vector[Double] = v11(0)
    val v14: Vector[Double] = v10(0)
    val v36: Vector[Double] = v27(0)
    val v28: Vector[Double] = v10(0)
    val v40: Double = v14(0)
    v10 = v10.updated(0, v28)
    v10 = v10.updated(0, v22)
    val v42: Double = v1 * v40
    val v55: Double = v36(0)
    v27 = v27.updated(0, v18)
    val v99: Double = v42 - v42
    val v88: Double = v99 + v55
    v88
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
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