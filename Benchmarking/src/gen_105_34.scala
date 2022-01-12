import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s2]], v2: Vector[s0], v3: Double): Double = {
    val v8: s0 = v2(0)
    val v6: Vector[Vector[Double]] = v8.p0
    var v11: Vector[Vector[Double]] = v6
    val v15: Vector[Double] = v11(1)
    val v29: Vector[Double] = v6(1)
    v11 = v11.updated(2, v29)
    val v34: Vector[Double] = v11(0)
    val v81: Double = v34(0)
    val v109: Double = v81 + v81
    v11 = v11.updated(1, v15)
    v109
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), Vector(s2(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))
    val v3: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}