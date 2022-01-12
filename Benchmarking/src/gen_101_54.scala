import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  def f29(v0: s0): s0 = {
    v0
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v4: s0 = v0(2)
    val v7: s0 = f29(v4)
    val v5: s0 = v0(1)
    val v12: Vector[Vector[Double]] = v7.p1
    val v8: Vector[Double] = v12(2)
    val v11: Double = v8(0)
    val v26: Double = v8(0)
    var v50: s0 = v5
    val v36: Vector[Vector[Double]] = v50.p1
    val v24: Vector[Vector[Double]] = v7.p1
    var v27: Vector[Double] = v8
    val v43: s0 = f29(v50)
    val v25: Double = v27(0)
    val v37: Double = v43.p0
    v27 = v27.updated(0, v11)
    v50 = v50.copy(p1 = v24)
    val v38: Double = v27(0)
    v50 = v50.copy(p0 = v25)
    val v112: Vector[Vector[Double]] = v43.p1
    v27 = v27.updated(0, v26)
    v50 = v50.copy(p1 = v36)
    v50 = v50.copy(p0 = v38)
    v50 = v50.copy(p1 = v112)
    v37
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(0.0, Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(4.0, Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(8.0, Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
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