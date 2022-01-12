import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v0.p2
    val v9: Vector[Double] = v4(0)
    val v24: Vector[Vector[Double]] = v0.p2
    val v10: Vector[Double] = v6(1)
    val v21: Double = v9(0)
    val v23: Double = v10(0)
    val v42: Vector[Double] = v24(1)
    val v59: Double = v42(0)
    val v34: Vector[Double] = Vector(v21, v2, v21, v23, v59)
    val v37: Double = v34(3)
    v37
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v2: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}