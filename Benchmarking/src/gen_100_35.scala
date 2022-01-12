import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s5 (
    p0: Vector[s0]
  )
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v4: Vector[s0] = v0.p0
    val v7: Vector[s0] = v0.p0
    val v6: s0 = v4(0)
    val v24: s0 = v7(1)
    val v19: Vector[Vector[Double]] = v24.p0
    val v14: Vector[Vector[Double]] = v6.p0
    val v30: Vector[Double] = v19(0)
    var v51: Vector[Vector[Double]] = v14
    val v60: Vector[Double] = v51(0)
    v51 = v51.updated(0, v30)
    val v81: Double = v60(0)
    v81
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}