import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  @noinline
  def f0(v0: s3, v1: s2, v2: s3, v3: Double): Double = {
    val v13: Vector[Double] = Vector(v3)
    val v12: Double = v13(0)
    val v36: s0 = v1.p1
    val v11: Vector[Vector[Double]] = v36.p0
    var v17: Double = v12
    val v16: Double = v13(0)
    val v25: Vector[Double] = v11(0)
    var v35: Vector[Double] = v25
    val v39: Double = v35(0)
    var v100: Double = v17
    val v104: Vector[Double] = Vector(v100, v16)
    var v74: Vector[Double] = v104
    var v151: Vector[Double] = v74
    v151 = v151.updated(0, v39)
    val v407: Double = v151(1)
    v407
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s0(Vector(Vector(0.0)))), Vector(s0(Vector(Vector(1.0))))), s1(s0(Vector(Vector(2.0))), s0(Vector(Vector(3.0)))))
    val v1: s2 = s2(Vector(Vector(s0(Vector(Vector(4.0))))), s0(Vector(Vector(5.0))))
    val v2: s3 = s3(Vector(Vector(s0(Vector(Vector(6.0)))), Vector(s0(Vector(Vector(7.0))))), s1(s0(Vector(Vector(8.0))), s0(Vector(Vector(9.0)))))
    val v3: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}