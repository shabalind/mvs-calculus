import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s2], v1: s2, v2: Double): Double = {
    val v8: s2 = v0(1)
    val v7: Vector[s0] = v8.p1
    val v12: Double = v2 + v2
    val v49: s0 = v7(0)
    val v25: Vector[Vector[Double]] = v49.p1
    val v48: Vector[Double] = v25(0)
    var v106: Double = v12
    var v194: Vector[Double] = v48
    val v64: Double = v194(0)
    val v142: Double = v64 / v106
    var v91: Double = v106
    v194 = v194.updated(0, v142)
    val v304: Vector[Double] = Vector(v12, v106, v91, v2, v142)
    val v81: Double = v304(4)
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), s2(Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))
    val v1: s2 = s2(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))
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