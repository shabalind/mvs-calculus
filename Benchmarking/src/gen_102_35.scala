import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Double
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: s0
  )
  @noinline
  def f0(v0: Vector[s0], v1: s2, v2: Vector[s0], v3: Double): Double = {
    val v5: Vector[s0] = v1.p0
    val v14: s0 = v5(0)
    val v20: s0 = v5(0)
    val v29: Vector[Vector[Double]] = v20.p1
    val v31: Vector[Double] = v29(1)
    val v52: Double = v31(0)
    val v53: Vector[Vector[Double]] = v14.p0
    val v77: Vector[Double] = v53(0)
    val v239: Double = v77(0)
    val v259: Double = v52 / v239
    v259
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), 16.0), s0(Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0))), s0(Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))))
    val v3: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}