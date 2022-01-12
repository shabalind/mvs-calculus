import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Double] = v7(1)
    var v11: Vector[Vector[Double]] = v7
    v11 = v11.updated(1, v3)
    var v23: Vector[Double] = v3
    val v10: Double = v23(0)
    v23 = v23.updated(0, v10)
    var v24: Vector[Vector[Double]] = v11
    val v15: Vector[Double] = v24(1)
    val v18: Double = v15(0)
    val v28: Double = v18 + v1
    var v25: Vector[Double] = v23
    var v128: Vector[Double] = v25
    val v54: Double = v128(0)
    v25 = v25.updated(0, v1)
    v23 = v23.updated(0, v28)
    v54
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)))
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