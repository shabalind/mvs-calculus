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
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s5], v1: s2, v2: Double): Double = {
    val v9: Vector[Vector[s0]] = v1.p0
    val v25: Vector[s0] = v9(0)
    val v35: s0 = v25(0)
    val v63: Vector[Vector[Double]] = v35.p0
    val v62: Vector[Double] = v63(1)
    var v138: Vector[Double] = v62
    val v89: Double = v138(0)
    var v135: Vector[Double] = v62
    val v173: Double = v135(0)
    val v457: Double = v89 / v173
    v457
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))
    val v1: s2 = s2(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}