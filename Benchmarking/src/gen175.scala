import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f12(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v0
    var v23: Double = v2
    var v15: Double = v1
    var v17: Double = v15
    var v16: Double = v0
    var v22: Double = v17
    var v19: Double = v16
    v19 = v22
    var v24: Double = v23
    v15 = v24
    var v51: Double = v19
    var v40: Double = v51
    v40
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v4: Double = v1 + v1
    val v3: Double = f12(v1)
    val v2: Double = f12(v4)
    val v12: Double = v2 / v3
    var v14: Double = v3
    var v16: Double = v4
    var v23: Double = v14
    val v29: Double = v2 - v16
    v14 = v12
    var v261: Double = v29
    val v253: Double = v261 * v23
    v253
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))))
    val v1: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}