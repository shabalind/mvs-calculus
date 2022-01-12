import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Double] = v5(0)
    var v18: Double = v1
    val v12: Double = v7(0)
    val v4: Vector[Vector[Double]] = v0.p1
    val v30: Vector[Double] = v4(1)
    val v20: Double = v30(0)
    val v24: Vector[Double] = Vector(v18, v18, v20)
    var v31: Vector[Double] = v24
    val v45: Double = v7(0)
    val v56: Double = v31(1)
    val v108: Double = v45 * v56
    v18 = v12
    var v140: Double = v108
    v140
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}