import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s0,
    p1: s1
  )
  case class s7 (
    p0: Vector[s4],
    p1: s1
  )
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    var v2: Double = v1
    var v3: s7 = v0
    val v11: s1 = v3.p1
    val v21: Double = v1 * v2
    val v14: s0 = v11.p0
    val v17: Vector[Double] = Vector(v2, v21, v2)
    val v23: Double = v17(0)
    val v37: Double = v17(1)
    val v25: Double = v17(2)
    val v34: Double = v14.p0
    val v60: Vector[Vector[Double]] = v14.p1
    val v58: Vector[Double] = v60(0)
    val v46: Double = v58(0)
    val v63: Double = v17(2)
    v2 = v63
    val v78: Vector[Double] = Vector(v23, v25, v37, v46, v1, v34, v37)
    val v87: Double = v78(4)
    v87
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s4(s0(0.0, Vector(Vector(1.0)), Vector(Vector(2.0))), s1(s0(3.0, Vector(Vector(4.0)), Vector(Vector(5.0))), Vector(s0(6.0, Vector(Vector(7.0)), Vector(Vector(8.0))), s0(9.0, Vector(Vector(10.0)), Vector(Vector(11.0)))))), s4(s0(12.0, Vector(Vector(13.0)), Vector(Vector(14.0))), s1(s0(15.0, Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s0(18.0, Vector(Vector(19.0)), Vector(Vector(20.0))), s0(21.0, Vector(Vector(22.0)), Vector(Vector(23.0))))))), s1(s0(24.0, Vector(Vector(25.0)), Vector(Vector(26.0))), Vector(s0(27.0, Vector(Vector(28.0)), Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0)), Vector(Vector(32.0))))))
    val v1: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}