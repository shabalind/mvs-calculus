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
  def f0(v0: Vector[Vector[s4]], v1: Double): Double = {
    val v12: Vector[s4] = v0(0)
    val v10: s4 = v12(0)
    val v15: s1 = v10.p0
    val v20: s0 = v15.p1
    val v28: Vector[Vector[Double]] = v20.p1
    val v29: Vector[Vector[Double]] = v20.p1
    var v34: Vector[Vector[Double]] = v28
    val v49: Vector[Double] = v29(0)
    val v55: Vector[Double] = v34(0)
    val v58: Double = v55(0)
    v34 = v28
    v34 = v34.updated(0, v49)
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}