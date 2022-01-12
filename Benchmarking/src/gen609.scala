import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f17(v0: s0): s0 = {
    var v5: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p1
    val v10: Vector[Vector[Double]] = v0.p1
    val v9: Vector[s0] = Vector(v5, v0)
    v5 = v5.copy(p1 = v10)
    val v8: Double = v5.p0
    val v13: s0 = v9(1)
    v5 = v13
    v5 = v5.copy(p1 = v10)
    v5 = v13
    v5 = v5.copy(p0 = v8)
    v5 = v5.copy(p1 = v2)
    v5
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v5: s0 = v0.p1
    var v7: s0 = v5
    val v9: s0 = f17(v5)
    val v12: Double = v9.p0
    val v18: Vector[Vector[Double]] = v7.p1
    val v16: Vector[Double] = v18(0)
    val v13: Double = v16(0)
    var v48: Double = v12
    var v34: Double = v13
    val v84: Vector[Vector[Double]] = v9.p1
    v7 = v7.copy(p1 = v84)
    v7 = v7.copy(p0 = v48)
    v34
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(0.0, Vector(Vector(1.0)))), s0(2.0, Vector(Vector(3.0))))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}