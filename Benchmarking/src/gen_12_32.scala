import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v6: s0 = v0(0)
    val v4: Vector[Vector[Double]] = v6.p2
    val v7: Vector[Vector[Double]] = v1.p0
    val v13: Vector[Double] = v4(1)
    val v14: Double = v13(0)
    val v21: Vector[Double] = v7(0)
    var v16: Double = v14
    val v28: Double = v21(0)
    val v34: Double = v28 * v14
    val v207: Vector[Double] = Vector(v28, v34, v2, v16, v34, v16)
    val v91: Double = v207(1)
    v91
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))
    val v2: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}