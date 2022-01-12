import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f44(v0: Vector[Double]): Vector[Double] = {
    var v5: Vector[Double] = v0
    var v6: Vector[Double] = v0
    val v2: Vector[Vector[Double]] = Vector(v5)
    val v1: Vector[Double] = v2(0)
    var v3: Vector[Double] = v6
    var v13: Vector[Vector[Double]] = v2
    v13 = v13.updated(0, v5)
    v13 = v13.updated(0, v1)
    v13 = v13.updated(0, v1)
    v13 = v13.updated(0, v3)
    val v23: Vector[Double] = v2(0)
    var v16: Vector[Double] = v3
    v13 = v13.updated(0, v23)
    val v21: Double = v16(0)
    val v12: Vector[Double] = v13(0)
    v6 = v6.updated(0, v21)
    v12
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v6: Double = v2 / v2
    val v8: s0 = v1(0)
    val v10: s0 = v1(1)
    val v44: Vector[Vector[Double]] = v8.p1
    val v58: Vector[Double] = v44(0)
    var v52: Double = v6
    val v62: Vector[Vector[Double]] = v10.p1
    val v66: Vector[Double] = v62(0)
    val v107: Double = v66(0)
    val v57: Vector[Double] = f44(v58)
    val v65: Double = v52 - v107
    val v100: Double = v57(0)
    val v138: Double = v100 / v65
    v138
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}