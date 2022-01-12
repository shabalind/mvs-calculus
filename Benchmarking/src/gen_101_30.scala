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
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v6: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    var v5: Vector[Double] = v6
    v5 = v5.updated(4, v1)
    var v10: Vector[Double] = v6
    var v13: Double = v1
    v13 = v1
    v10 = v10.updated(1, v13)
    val v44: Double = v5(4)
    v5 = v10
    var v45: Double = v1
    v10 = v10.updated(2, v45)
    v44
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}