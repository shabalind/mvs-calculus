import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v4: Double = v1
    var v15: Double = v1
    val v12: Double = v1 * v1
    var v46: Double = v1
    var v32: Double = v4
    var v36: Double = v32
    val v165: Double = v46 / v12
    var v113: Double = v165
    val v141: Double = v46 - v36
    val v81: Double = v141 / v15
    val v105: Double = v113 + v81
    v105
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s1(Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))
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