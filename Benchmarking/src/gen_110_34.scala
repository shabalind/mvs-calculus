import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v6: s1 = v0(0)
    val v4: s0 = v6.p0
    val v8: Vector[Vector[Double]] = v4.p0
    val v9: Vector[Double] = v8(0)
    val v27: Vector[Double] = v8(1)
    val v33: Double = v9(0)
    var v51: Vector[Double] = v27
    val v50: Double = v51(0)
    val v87: Double = v1 * v33
    v51 = v51.updated(0, v87)
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}