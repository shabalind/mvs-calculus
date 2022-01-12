import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: s0, v3: Vector[s0], v4: Double): Double = {
    val v6: Vector[Vector[Double]] = v2.p1
    val v5: s0 = v3(1)
    val v16: Vector[Vector[Double]] = v5.p0
    val v13: Vector[Double] = v6(0)
    val v17: Vector[Double] = v16(1)
    val v20: Double = v13(0)
    val v32: Double = v17(0)
    val v43: Double = v20 / v32
    val v24: Double = v43 / v43
    val v59: Double = v17(0)
    val v48: Double = v24 + v59
    v48
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: s0 = s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))
    val v4: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}