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
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v9: s2 = v0(0)
    val v10: s0 = v9.p1
    val v8: Vector[Vector[Double]] = v10.p0
    val v2: Vector[Double] = v8(1)
    val v40: Vector[Vector[Double]] = v10.p0
    val v21: Double = v2(0)
    val v104: Vector[Double] = v40(1)
    var v60: Double = v21
    val v72: Double = v104(0)
    val v124: Double = v60 * v72
    v124
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))
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