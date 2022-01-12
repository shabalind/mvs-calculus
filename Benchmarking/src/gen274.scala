import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    var v2: Vector[s4] = v0
    val v5: s4 = v0(0)
    v2 = v2.updated(0, v5)
    val v12: s4 = v2(0)
    val v11: s2 = v12.p1
    v2 = v2.updated(0, v12)
    v2 = v2.updated(0, v5)
    val v45: Vector[s0] = v11.p1
    val v38: s0 = v45(1)
    val v42: Vector[Vector[Double]] = v38.p1
    val v65: Vector[Double] = v42(0)
    val v81: Double = v65(0)
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))), s2(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}