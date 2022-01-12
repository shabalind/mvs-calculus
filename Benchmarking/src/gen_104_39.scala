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
  def f65(v0: Double): Double = {
    var v3: Double = v0
    var v2: Double = v3
    var v1: Double = v2
    var v4: Double = v1
    var v8: Double = v4
    var v9: Double = v1
    var v6: Double = v2
    val v21: Double = v9 / v8
    v9 = v6
    v21
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v3: Double = v1 / v1
    var v4: Double = v1
    val v2: Double = v1 + v4
    val v13: Double = f65(v2)
    var v86: Double = v2
    val v108: Vector[Double] = Vector(v13, v86, v3, v3, v3, v4, v2)
    val v134: Double = v108(1)
    v134
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}