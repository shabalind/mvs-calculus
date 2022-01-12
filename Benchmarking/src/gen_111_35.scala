import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v3: Vector[s0] = v0(0)
    val v2: s0 = v3(0)
    val v5: Vector[Vector[Double]] = v2.p0
    val v18: Vector[Vector[Double]] = v2.p0
    val v17: s0 = v3(0)
    val v38: Vector[Double] = v18(0)
    val v21: Vector[Double] = v5(1)
    val v20: Vector[Vector[Double]] = v17.p1
    var v39: Vector[Vector[Double]] = v20
    v39 = v39.updated(0, v21)
    val v29: Vector[Double] = v39(0)
    v39 = v39.updated(0, v38)
    val v111: Double = v29(0)
    val v323: Double = v111 + v1
    v323
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))))
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