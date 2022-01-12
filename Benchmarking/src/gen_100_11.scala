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
  def f123(v0: s1): s1 = {
    val v8: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v6: s1 = v8(5)
    val v2: s1 = v8(1)
    var v24: Vector[s1] = v8
    v24 = v24.updated(5, v2)
    val v14: s1 = v24(0)
    v24 = v24.updated(3, v6)
    v14
  }
  def f114(v0: s1, v1: s1): s1 = {
    var v6: s1 = v1
    val v4: s1 = f123(v6)
    val v3: s0 = v4.p0
    v6 = v6.copy(p1 = v3)
    v6 = v6.copy(p1 = v3)
    var v58: s1 = v4
    var v123: s1 = v58
    val v141: s1 = f123(v123)
    v141
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v6: s1 = f114(v0, v0)
    val v4: s0 = v6.p1
    val v13: Vector[Vector[Double]] = v4.p0
    val v30: Vector[Double] = v13(0)
    val v75: Double = v30(0)
    v75
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))
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