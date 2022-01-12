import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Double,
    p1: s1
  )
  @noinline
  def f0(v0: s3, v1: s0, v2: Double): Double = {
    val v13: Vector[Vector[Double]] = v1.p1
    var v12: Double = v2
    val v14: Vector[Double] = v13(0)
    var v23: Vector[Double] = v14
    val v10: Double = v14(0)
    var v28: Double = v12
    val v15: Double = v23(0)
    v23 = v23.updated(0, v12)
    v23 = v23.updated(0, v28)
    v23 = v23.updated(0, v15)
    var v20: Double = v15
    val v51: Double = v23(0)
    var v32: Double = v51
    v23 = v23.updated(0, v10)
    var v75: Double = v32
    v23 = v23.updated(0, v20)
    v75
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(0.0, s1(Vector(s0(Vector(Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0)))), s0(Vector(Vector(5.0)), Vector(Vector(6.0)))))
    val v1: s0 = s0(Vector(Vector(7.0)), Vector(Vector(8.0)))
    val v2: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}