import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v2: s0 = v0(1)
    val v12: Vector[Vector[Double]] = v2.p1
    val v16: Vector[Vector[Double]] = v2.p0
    val v43: s0 = v0(1)
    var v20: s0 = v2
    val v54: Vector[Vector[Double]] = v2.p0
    val v34: Vector[Vector[Double]] = v2.p1
    v20 = v20.copy(p0 = v16)
    v20 = v20.copy(p1 = v12)
    val v40: Vector[Vector[Double]] = v20.p1
    v20 = v20.copy(p1 = v34)
    var v48: Vector[Vector[Double]] = v40
    v20 = v20.copy(p0 = v54)
    val v30: Vector[Vector[Double]] = v43.p1
    v20 = v20.copy(p1 = v30)
    val v64: Vector[Vector[Double]] = v43.p1
    val v42: Vector[Vector[Double]] = v20.p1
    v20 = v20.copy(p1 = v42)
    val v83: Vector[Double] = v48(0)
    v20 = v20.copy(p0 = v16)
    v20 = v20.copy(p1 = v64)
    val v88: Double = v83(0)
    v20 = v20.copy(p1 = v48)
    v88
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}