import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  def f61(v0: s0): s0 = {
    var v2: s0 = v0
    var v1: s0 = v2
    var v5: s0 = v1
    var v15: s0 = v0
    val v13: Vector[Vector[Double]] = v1.p0
    val v10: Double = v5.p1
    v5 = v5.copy(p1 = v10)
    v15 = v15.copy(p0 = v13)
    var v29: Double = v10
    var v24: Vector[Vector[Double]] = v13
    v1 = v1.copy(p0 = v24)
    val v20: Double = v29 / v29
    val v35: Vector[Vector[Double]] = v15.p0
    val v39: s0 = s0(v35, v20)
    v15 = v15.copy(p1 = v10)
    v39
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v7: s0 = v0(0)
    var v3: Vector[s0] = v0
    v3 = v3.updated(0, v7)
    val v5: s0 = v3(0)
    v3 = v3.updated(0, v7)
    v3 = v3.updated(0, v5)
    val v11: s0 = f61(v5)
    val v9: s0 = f61(v11)
    v3 = v3.updated(0, v9)
    val v42: s0 = f61(v9)
    val v58: Double = v42.p1
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), 1.0))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}