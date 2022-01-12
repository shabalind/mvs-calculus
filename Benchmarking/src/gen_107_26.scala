import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v6: Vector[s0] = v0(0)
    val v15: s0 = v6(0)
    val v5: Vector[Vector[Double]] = v15.p1
    val v16: Vector[Double] = v5(2)
    val v13: Vector[Vector[Double]] = v15.p1
    var v33: Vector[Vector[Double]] = v13
    v33 = v33.updated(2, v16)
    v33 = v33.updated(0, v16)
    val v86: Vector[Double] = v33(2)
    val v58: Double = v86(0)
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
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