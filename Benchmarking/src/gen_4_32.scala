import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  case class s6 (
    p0: Vector[s0],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v9: s6 = v0(0)
    val v3: s1 = v9.p1
    val v4: Double = v1 * v1
    val v5: s6 = v0(0)
    val v6: s0 = v3.p2
    val v10: Vector[Vector[Double]] = v6.p0
    val v11: s1 = v5.p1
    val v16: Vector[Double] = v10(0)
    val v49: s0 = v11.p2
    val v24: Vector[Vector[Double]] = v49.p1
    val v32: Double = v1 + v4
    val v60: Double = v16(0)
    val v45: Vector[Double] = v24(1)
    val v97: Double = v45(0)
    val v81: Double = v60 + v32
    val v100: Double = v97 - v81
    v100
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}