import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f44(v0: s1): s1 = {
    val v2: Vector[s0] = v0.p0
    val v13: s1 = s1(v2, v2)
    val v22: Vector[s0] = v0.p0
    val v86: Vector[s0] = v13.p1
    val v64: s1 = s1(v86, v22)
    var v203: s1 = v64
    v203
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v2: s1 = f44(v0)
    var v3: Double = v1
    val v9: Vector[s0] = v2.p1
    val v4: s0 = v9(1)
    val v29: Vector[Vector[Double]] = v4.p1
    var v22: Vector[Vector[Double]] = v29
    val v28: Vector[Double] = v22(0)
    val v27: Vector[Double] = v22(0)
    val v26: Double = v27(0)
    val v40: Vector[Double] = v22(0)
    v22 = v22.updated(0, v40)
    val v58: Double = v28(0)
    val v48: Double = v58 * v3
    val v81: Double = v1 * v48
    val v89: Double = v26 / v81
    v89
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
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