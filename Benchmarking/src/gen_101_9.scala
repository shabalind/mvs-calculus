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
    p0: s1
  )
  @noinline
  def f0(v0: s2, v1: s0, v2: Vector[Vector[s0]], v3: Double): Double = {
    val v7: Vector[Vector[Double]] = v1.p1
    val v10: Vector[Vector[Double]] = v1.p0
    val v20: Double = v3 / v3
    val v11: Vector[Double] = v10(0)
    val v18: Vector[Double] = v7(0)
    val v37: Double = v18(0)
    var v55: Vector[Double] = v11
    var v40: Vector[Double] = v55
    v55 = v55.updated(0, v3)
    val v81: Double = v40(0)
    val v56: Double = v81 * v37
    v55 = v55.updated(0, v81)
    v40 = v40.updated(0, v20)
    v55 = v40
    v56
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))))
    val v1: s0 = s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))
    val v2: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v3: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}