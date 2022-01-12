import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0
  )
  case class s3 (
    p0: s0,
    p1: s0,
    p2: s1,
    p3: s0
  )
  def f50(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v0
    var v2: Double = v6
    v3 = v0
    var v1: Double = v3
    var v11: Double = v1
    val v23: Vector[Double] = Vector(v0, v0, v11)
    val v21: Vector[Vector[Double]] = Vector(v23, v23, v23, v23)
    var v80: Vector[Vector[Double]] = v21
    v80 = v80.updated(1, v23)
    val v60: Vector[Double] = v80(2)
    var v39: Vector[Double] = v60
    v39 = v39.updated(0, v2)
    val v37: Double = v39(2)
    v37
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v3: Double = f50(v1)
    val v21: Double = v1 + v3
    val v47: Vector[Double] = Vector(v1, v3, v3, v21, v1)
    val v59: Double = v47(4)
    v59
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))
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