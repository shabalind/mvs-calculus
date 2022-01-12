import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v11: Vector[s0] = v0.p1
    val v7: s0 = v11(0)
    val v5: Vector[Vector[Double]] = v7.p0
    val v10: Vector[Vector[Double]] = v7.p1
    val v12: Vector[Double] = v5(1)
    val v15: Vector[Double] = v5(1)
    val v16: Double = v15(0)
    var v27: Vector[Vector[Double]] = v10
    v27 = v27.updated(1, v15)
    val v45: Double = v1 / v1
    val v41: Vector[Double] = v27(0)
    val v74: Double = v41(0)
    v27 = v27.updated(0, v12)
    val v161: Double = v16 - v74
    val v67: Double = v45 * v161
    v67
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}