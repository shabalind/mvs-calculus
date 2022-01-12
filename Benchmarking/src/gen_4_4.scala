import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v3: Vector[s1] = v0(0)
    var v5: Double = v1
    var v11: Double = v5
    val v7: s1 = v3(0)
    val v13: Double = v5 - v11
    val v14: s0 = v7.p1
    val v26: Vector[Vector[Double]] = v14.p1
    var v15: s0 = v14
    val v23: Vector[Double] = v15.p0
    val v19: Vector[Vector[Double]] = Vector(v23, v23, v23, v23)
    var v24: Vector[Vector[Double]] = v19
    v15 = v15.copy(p0 = v23)
    val v58: Vector[Double] = v26(0)
    v24 = v24.updated(1, v23)
    v15 = v15.copy(p0 = v23)
    var v46: Vector[Vector[Double]] = v24
    val v44: Double = v58(0)
    val v36: Vector[Double] = v46(0)
    val v83: Double = v5 * v1
    v5 = v44
    v15 = v15.copy(p1 = v26)
    val v53: Double = v36(0)
    v46 = v24
    val v197: Vector[Double] = Vector(v5, v13, v13, v83, v5, v44, v13)
    v15 = v15.copy(p0 = v36)
    val v55: Double = v197(0)
    v15 = v15.copy(p0 = v23)
    val v74: Double = v53 / v55
    v74
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0))), s0(Vector(4.0, 5.0, 6.0), Vector(Vector(7.0))), Vector(Vector(s0(Vector(8.0, 9.0, 10.0), Vector(Vector(11.0)))), Vector(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0))))))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}