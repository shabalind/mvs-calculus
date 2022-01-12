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
  case class s5 (
    p0: s0,
    p1: s1
  )
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v2: Vector[Double] = Vector(v1, v1)
    val v4: Double = v2(1)
    val v9: Double = v1 + v4
    var v13: Vector[Double] = v2
    val v21: Double = v13(0)
    val v18: Double = v2(0)
    v13 = v13.updated(0, v18)
    v13 = v13.updated(1, v4)
    var v31: Double = v21
    v13 = v13.updated(0, v4)
    v13 = v13.updated(1, v4)
    v13 = v13.updated(0, v18)
    var v77: Double = v4
    v13 = v13.updated(0, v77)
    val v83: Double = v31 / v9
    v83
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}