import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Double
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Double
  )
  case class s9 (
    p0: Vector[s1],
    p1: s2
  )
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v7: Vector[s1] = v0.p0
    val v24: s1 = v7(0)
    val v91: Vector[Vector[s0]] = v24.p0
    val v84: Vector[s0] = v91(0)
    val v104: s0 = v84(0)
    val v49: Vector[Vector[Double]] = v104.p1
    val v97: Vector[Double] = v49(1)
    val v307: Double = v97(0)
    var v122: Double = v307
    val v127: Double = v122 + v1
    v127
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))), 3.0)), s2(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0)))), Vector(s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), 10.0))
    val v1: Double = 11.0
    val start = nanoTime()
    var result: Double = 11.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}