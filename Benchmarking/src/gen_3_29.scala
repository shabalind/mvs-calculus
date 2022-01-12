import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[Vector[s0]],
    p1: s3
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v3: Vector[Vector[s0]] = v0.p0
    val v15: Vector[s0] = v3(0)
    var v21: Vector[s0] = v15
    val v16: s0 = v21(0)
    v21 = v21.updated(0, v16)
    val v33: s0 = v21(0)
    val v20: s2 = s2(v33, v33)
    val v32: s0 = v20.p1
    val v43: Vector[Vector[Double]] = v32.p0
    val v82: Vector[Double] = v43(0)
    val v71: Double = v82(0)
    v71
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s3(s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))))
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