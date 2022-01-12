import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v3: s0 = v0(0)
    val v6: Vector[Vector[Double]] = v3.p0
    val v11: Vector[Double] = v6(0)
    val v5: Double = v2 - v2
    val v15: Double = v11(0)
    val v8: Vector[Double] = v6(0)
    val v20: Double = v5 + v2
    var v28: Vector[Double] = v11
    var v33: Vector[Double] = v28
    val v30: Double = v8(0)
    var v49: Vector[Double] = v33
    v33 = v33.updated(0, v15)
    v49 = v49.updated(0, v15)
    v49 = v49.updated(0, v15)
    val v39: Double = v5 + v30
    var v70: Double = v20
    val v66: Double = v8(0)
    v28 = v28.updated(0, v66)
    v28 = v28.updated(0, v5)
    v28 = v28.updated(0, v70)
    v33 = v33.updated(0, v39)
    val v106: Double = v49(0)
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))
    val v1: s0 = s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))
    val v2: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}