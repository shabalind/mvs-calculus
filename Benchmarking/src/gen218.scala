import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f27(v0: s0): s0 = {
    val v5: Vector[s0] = Vector(v0, v0, v0, v0, v0)
    val v3: s0 = v5(4)
    var v2: s0 = v3
    val v1: s0 = v5(0)
    val v10: Vector[Vector[Double]] = v1.p1
    v2 = v2.copy(p1 = v10)
    var v9: Vector[Vector[Double]] = v10
    v2 = v2.copy(p1 = v9)
    v2
  }
  def f26(v0: s0, v1: s0): s0 = {
    val v3: s0 = f27(v1)
    val v4: Vector[Vector[Double]] = v1.p1
    val v7: Vector[Double] = v4(1)
    var v6: Vector[Vector[Double]] = v4
    val v5: s0 = f27(v3)
    v6 = v6.updated(1, v7)
    var v17: s0 = v5
    v17 = v17.copy(p1 = v4)
    val v25: Vector[Vector[Double]] = v5.p1
    var v16: Vector[Vector[Double]] = v6
    v17 = v17.copy(p1 = v16)
    val v73: s0 = f27(v17)
    v17 = v17.copy(p1 = v25)
    v73
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v4: s0 = v0(0)
    val v3: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v4.p1
    val v9: Vector[Vector[Double]] = v3.p1
    val v13: s0 = v0(0)
    val v11: s0 = f26(v13, v4)
    val v23: Vector[Vector[Double]] = v11.p1
    var v19: Vector[Vector[Double]] = v23
    val v30: Vector[Vector[Double]] = v3.p0
    var v35: Vector[Vector[Double]] = v23
    v35 = v6
    v19 = v35
    val v21: Vector[Double] = v30(0)
    v19 = v19.updated(0, v21)
    v19 = v19.updated(0, v21)
    v19 = v19.updated(0, v21)
    val v86: Vector[Double] = v19(1)
    v35 = v9
    val v54: Vector[Double] = v6(1)
    val v53: Double = v21(0)
    val v66: Double = v86(0)
    val v87: Double = v53 * v66
    var v62: Vector[Double] = v54
    v19 = v19.updated(1, v62)
    v87
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))
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