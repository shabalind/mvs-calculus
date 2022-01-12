import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  def f66(v0: Vector[s0]): Vector[s0] = {
    var v36: Vector[s0] = v0
    v36
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v7: Vector[s0] = v0(1)
    var v4: Double = v1
    var v6: Double = v4
    val v2: Vector[s0] = f66(v7)
    val v9: s0 = v2(0)
    val v10: Vector[Vector[Double]] = v9.p0
    val v22: Vector[Double] = v10(0)
    val v48: Double = v22(0)
    val v34: Double = v48 * v6
    v34
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)))), Vector(s0(Vector(Vector(2.0), Vector(3.0)))))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}