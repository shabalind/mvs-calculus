import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v2: s0 = v0(0)
    val v14: s0 = v0(0)
    val v12: Vector[Vector[Double]] = v14.p0
    val v24: Vector[Double] = v12(0)
    val v19: Vector[Double] = v12(0)
    val v26: Vector[Vector[Double]] = v2.p0
    val v22: Vector[Double] = v26(0)
    val v200: Vector[Double] = v12(0)
    var v108: Vector[Double] = v22
    val v257: Vector[Vector[Double]] = Vector(v200, v108, v19)
    var v148: Vector[Vector[Double]] = v257
    var v58: Vector[Vector[Double]] = v148
    var v204: Vector[Vector[Double]] = v58
    val v265: Vector[Double] = v204(2)
    val v216: Double = v265(0)
    v204 = v204.updated(0, v108)
    v204 = v204.updated(0, v24)
    v216
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0))))
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}