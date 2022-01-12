import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Double,
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    val v8: Vector[s0] = v1.p0
    val v6: s0 = v8(0)
    var v26: Double = v2
    val v31: Vector[Vector[Double]] = v6.p1
    val v41: Vector[Double] = v31(1)
    val v25: Double = v41(0)
    val v90: Double = v26 / v26
    val v83: Double = v90 * v90
    val v177: Double = v83 + v25
    var v398: Double = v177
    v398
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), 5.0, Vector(Vector(6.0), Vector(7.0), Vector(8.0))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), 14.0, Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), 23.0, Vector(Vector(24.0), Vector(25.0), Vector(26.0)))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)), 32.0, Vector(Vector(33.0), Vector(34.0), Vector(35.0))))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}