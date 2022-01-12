import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v8: Vector[s1] = v0.p1
    val v13: s1 = v8(1)
    val v11: s0 = v13.p1
    val v16: Vector[Vector[Double]] = v11.p1
    val v10: Vector[Double] = v16(1)
    val v20: Vector[Double] = v16(0)
    val v36: Double = v10(0)
    var v29: Vector[Double] = v20
    v29 = v29.updated(0, v36)
    val v50: Double = v29(0)
    v50
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s1(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))))
    val v1: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}