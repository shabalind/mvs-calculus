import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v10: Vector[Vector[Double]] = v1.p1
    val v21: Vector[Double] = v10(1)
    val v42: Double = v21(0)
    var v18: Vector[Double] = v21
    val v41: Double = v18(0)
    val v48: Double = v41 - v42
    var v103: Vector[Double] = v21
    var v64: Double = v48
    val v100: Double = v103(0)
    v103 = v103.updated(0, v41)
    val v133: Double = v100 - v64
    v133
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: s0 = s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}