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
  case class s7 (
    p0: s1
  )
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v15: s7 = v0(0)
    val v10: s1 = v15.p0
    val v36: Vector[Vector[s0]] = v10.p1
    val v31: Double = v1 + v1
    val v26: Vector[s0] = v36(0)
    val v53: s0 = v26(0)
    val v74: Vector[Vector[Double]] = v53.p0
    val v92: Vector[Double] = v74(0)
    val v103: Double = v31 + v1
    var v55: Vector[Double] = v92
    var v88: Vector[Double] = v55
    v55 = v55.updated(0, v103)
    val v217: Double = v88(0)
    v55 = v55.updated(0, v31)
    v217
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))))), s7(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}