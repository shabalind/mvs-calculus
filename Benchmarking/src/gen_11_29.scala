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
  @noinline
  def f0(v0: s1, v1: Vector[s0], v2: Double): Double = {
    val v6: s0 = v1(0)
    val v3: Vector[Vector[Double]] = v6.p1
    val v9: Vector[Double] = v3(0)
    val v11: Double = v2 - v2
    val v47: Double = v9(0)
    val v30: Vector[Double] = v3(0)
    val v70: Double = v30(0)
    var v68: Double = v47
    val v96: Vector[Double] = Vector(v70, v11, v47, v47, v11, v47, v68)
    val v133: Double = v96(6)
    v133
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}