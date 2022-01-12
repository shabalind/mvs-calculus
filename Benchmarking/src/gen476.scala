import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s0]], v2: Double): Double = {
    var v6: Double = v2
    val v9: Double = v2 + v6
    var v5: Double = v2
    v6 = v5
    v6 = v9
    v5 = v2
    val v7: Vector[Double] = Vector(v6, v2, v2, v5, v5)
    var v16: Vector[Double] = v7
    v16 = v16.updated(4, v9)
    v16 = v16.updated(4, v5)
    var v44: Double = v5
    v16 = v16.updated(2, v44)
    v16 = v16.updated(0, v5)
    var v48: Vector[Double] = v16
    v48 = v48.updated(3, v2)
    val v72: Double = v48(3)
    v72
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))
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