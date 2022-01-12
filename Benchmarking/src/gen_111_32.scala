import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    val v4: Vector[s2] = v0(0)
    val v7: s2 = v4(0)
    val v13: s0 = v7.p0
    val v35: Vector[Vector[Double]] = v13.p0
    val v30: Vector[Double] = v35(0)
    val v32: Double = v1 - v1
    var v29: Vector[Double] = v30
    v29 = v29.updated(0, v32)
    val v47: Double = v29(0)
    var v55: Double = v47
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))))
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