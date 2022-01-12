import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v3: Vector[s0] = v0.p0
    val v21: s0 = v3(0)
    val v13: Vector[Vector[Double]] = v21.p1
    val v17: Vector[Double] = v13(0)
    var v30: Double = v1
    val v51: Double = v17(0)
    val v96: Vector[Double] = v13(0)
    var v75: Vector[Double] = v96
    v75 = v75.updated(0, v30)
    val v116: Double = v75(0)
    v75 = v75.updated(0, v51)
    var v162: Double = v116
    v162
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}