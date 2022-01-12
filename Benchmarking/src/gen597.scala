import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f15(v0: s0): s0 = {
    val v4: Vector[s0] = Vector(v0, v0, v0, v0, v0)
    val v1: Vector[s0] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v6: s0 = v4(1)
    var v19: Vector[s0] = v1
    val v23: s0 = v19(0)
    v19 = v19.updated(4, v6)
    var v61: s0 = v23
    v61
  }
  @noinline
  def f0(v0: s0, v1: s1, v2: Double): Double = {
    val v9: s0 = f15(v0)
    val v13: Vector[Vector[Double]] = v9.p0
    val v57: Vector[Double] = v13(1)
    val v87: Double = v57(0)
    v87
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: s1 = s1(Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}