import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v8: Vector[Vector[s0]] = v0
    val v5: Vector[s0] = v0(2)
    v8 = v8.updated(1, v5)
    val v7: Vector[s0] = v8(2)
    v8 = v0
    v8 = v8.updated(2, v5)
    val v3: s0 = v7(0)
    val v6: Vector[Vector[Double]] = v3.p1
    val v9: Vector[Vector[Double]] = v3.p0
    val v12: Vector[Double] = v6(0)
    v8 = v8.updated(0, v7)
    val v11: Vector[s0] = v8(0)
    var v10: Vector[Double] = v12
    v10 = v10.updated(0, v1)
    val v36: Vector[s0] = v8(1)
    v8 = v8.updated(1, v11)
    v10 = v10.updated(0, v1)
    v8 = v8.updated(2, v36)
    v10 = v10.updated(0, v1)
    val v18: Double = v10(0)
    val v39: Vector[Double] = v9(1)
    v10 = v10.updated(0, v18)
    val v48: Double = v39(0)
    val v44: Double = v18 - v48
    val v54: Vector[s0] = v0(1)
    v8 = v8.updated(2, v54)
    v10 = v10.updated(0, v1)
    v44
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))
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