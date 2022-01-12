import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: s0, v2: s0, v3: Double): Double = {
    val v7: Vector[Vector[Double]] = v2.p0
    val v5: Vector[Vector[Double]] = v2.p1
    var v4: Double = v3
    var v11: Vector[Vector[Double]] = v7
    val v8: Double = v3 + v4
    var v26: Vector[Vector[Double]] = v5
    val v51: Vector[Double] = v26(0)
    val v14: Vector[Double] = v26(0)
    val v17: Double = v51(0)
    val v45: Vector[Vector[Double]] = v0.p1
    val v42: Vector[Double] = v11(1)
    val v49: Double = v51(0)
    v26 = v26.updated(1, v14)
    val v93: Vector[Double] = Vector(v8, v49, v17, v49)
    v26 = v26.updated(2, v14)
    v26 = v26.updated(1, v42)
    v26 = v45
    val v128: Double = v93(1)
    v128
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))
    val v1: s0 = s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))
    val v2: s0 = s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))
    val v3: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}