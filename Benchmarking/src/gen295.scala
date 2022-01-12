import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  @noinline
  def f0(v0: s3, v1: Vector[s2], v2: Double): Double = {
    val v24: s0 = v0.p0
    val v19: Vector[Vector[Double]] = v24.p1
    var v30: Double = v2
    val v42: Vector[Double] = v19(0)
    var v47: Vector[Vector[Double]] = v19
    val v72: Vector[Double] = v47(0)
    var v21: Vector[Double] = v72
    v21 = v21.updated(0, v30)
    v47 = v47.updated(0, v42)
    val v45: Vector[Double] = v19(0)
    v47 = v47.updated(0, v21)
    val v55: Double = v72(0)
    val v78: Double = v45(0)
    val v135: Double = v2 * v55
    val v63: Double = v135 - v78
    v63
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s2(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s2(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s2(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}