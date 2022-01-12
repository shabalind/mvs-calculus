import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v2: s0 = v0.p0
    val v3: Vector[Vector[Double]] = v2.p0
    val v5: Vector[Double] = v3(0)
    val v7: Vector[Vector[Double]] = v2.p0
    val v10: Vector[Vector[Double]] = v2.p0
    val v15: Vector[Double] = v7(0)
    val v9: Vector[Double] = v10(0)
    val v14: Vector[Vector[Double]] = Vector(v9, v5, v5, v15, v15)
    val v58: Vector[Double] = v14(2)
    val v51: Double = v58(0)
    v51
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0))), Vector(Vector(s0(Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0))))))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}