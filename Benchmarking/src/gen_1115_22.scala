import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  @noinline
  def f0(v0: s0, v1: s2, v2: s2, v3: Double): Double = {
    val v6: s0 = v1.p1
    val v9: Vector[Vector[Double]] = v6.p1
    val v5: Vector[Vector[Double]] = v6.p0
    val v12: Vector[Double] = v5(0)
    val v41: Vector[Double] = v9(0)
    val v29: Double = v41(0)
    var v49: Vector[Double] = v12
    v49 = v49.updated(0, v3)
    var v27: Vector[Double] = v49
    v49 = v49.updated(0, v29)
    val v145: Double = v27(0)
    v49 = v49.updated(0, v3)
    v145
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: s2 = s2(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))
    val v2: s2 = s2(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))
    val v3: Double = 14.0
    val start = nanoTime()
    var result: Double = 14.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}