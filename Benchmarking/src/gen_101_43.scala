import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f101(v0: s1): s1 = {
    var v7: s1 = v0
    val v3: Vector[s0] = v7.p0
    var v6: s1 = v0
    val v12: Vector[s0] = v0.p1
    v6 = v6.copy(p1 = v12)
    v7 = v6
    val v33: Vector[s0] = v0.p0
    val v63: s1 = s1(v33, v3)
    v63
  }
  def f39(v0: s0, v1: Double): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v25: s0 = s0(v4)
    v25
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v7: Vector[s1] = v0
    val v5: s1 = v7(2)
    val v3: s1 = f101(v5)
    val v18: s1 = v0(0)
    v7 = v7.updated(0, v3)
    val v11: Vector[s0] = v3.p1
    var v14: Double = v1
    val v21: Double = v14 * v1
    val v19: s0 = v11(0)
    val v27: s0 = f39(v19, v14)
    val v24: s0 = f39(v27, v21)
    val v13: Vector[Vector[Double]] = v19.p0
    val v37: Vector[Double] = v13(0)
    val v53: Double = v37(0)
    v7 = v7.updated(2, v3)
    v7 = v7.updated(2, v18)
    var v67: Double = v53
    val v109: Vector[Vector[Double]] = v24.p0
    val v183: Vector[Double] = v109(0)
    var v131: Vector[Double] = v183
    val v123: Double = v131(0)
    v131 = v131.updated(0, v67)
    v123
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0))), s0(Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0))), s0(Vector(Vector(3.0))))), s1(Vector(s0(Vector(Vector(4.0))), s0(Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0))), s0(Vector(Vector(7.0))))), s1(Vector(s0(Vector(Vector(8.0))), s0(Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0))), s0(Vector(Vector(11.0))))))
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