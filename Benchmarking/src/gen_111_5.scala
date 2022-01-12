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
  def f54(v0: s1): s1 = {
    val v7: s0 = v0.p1
    val v2: s0 = v0.p1
    val v6: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0)
    val v9: s1 = s1(v2, v2)
    var v10: Vector[s1] = v6
    val v1: s1 = s1(v7, v7)
    val v24: s0 = v9.p0
    v10 = v10.updated(2, v1)
    val v21: s1 = s1(v24, v24)
    var v18: Vector[s1] = v10
    val v16: s1 = v18(2)
    val v39: s0 = v16.p0
    var v35: s1 = v9
    v35 = v35.copy(p0 = v39)
    v10 = v10.updated(5, v21)
    v35
  }
  def f39(v0: s1): s1 = {
    val v4: s1 = f54(v0)
    val v2: s0 = v4.p0
    val v3: s1 = s1(v2, v2)
    val v12: s0 = v3.p1
    val v9: s1 = s1(v12, v2)
    v9
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: s1 = f39(v0)
    val v3: s0 = v4.p1
    val v5: Vector[Vector[Double]] = v3.p1
    val v7: Vector[Double] = v5(0)
    val v13: Double = v7(0)
    var v36: Double = v1
    val v38: Vector[Double] = Vector(v13, v36, v13, v1, v1, v36, v13)
    val v62: Double = v38(2)
    var v86: Double = v62
    v86
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}