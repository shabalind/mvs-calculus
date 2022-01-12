import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: s0, v3: Double): Double = {
    var v5: s0 = v2
    val v4: Vector[Double] = v5.p0
    val v9: Vector[Double] = v1.p0
    val v7: Double = v4(0)
    val v13: Vector[Double] = v1.p0
    val v6: Double = v3 - v7
    val v11: Double = v13(0)
    var v12: Vector[Double] = v4
    val v34: Double = v4(0)
    var v21: Vector[Double] = v4
    var v15: Double = v6
    v12 = v12.updated(0, v34)
    v21 = v21.updated(0, v11)
    v5 = v5.copy(p0 = v9)
    v21 = v21.updated(0, v11)
    val v28: Double = v12(0)
    v21 = v21.updated(0, v28)
    v5 = v5.copy(p0 = v12)
    val v29: Double = v21(0)
    val v57: Double = v15 / v29
    v12 = v12.updated(0, v11)
    v5 = v5.copy(p0 = v12)
    v57
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0))
    val v1: s0 = s0(Vector(1.0))
    val v2: s0 = s0(Vector(2.0))
    val v3: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}