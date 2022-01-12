import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0
  )
  @noinline
  def f0(v0: s3, v1: s3, v2: Double): Double = {
    val v12: s0 = v1.p0
    val v3: Vector[Vector[Double]] = v12.p0
    val v15: s0 = v1.p0
    val v35: Vector[Vector[Double]] = v15.p0
    val v17: Vector[Double] = v35(0)
    val v21: Double = v17(0)
    val v72: Double = v17(0)
    val v32: Double = v21 / v72
    val v54: Vector[Double] = v3(1)
    val v71: Double = v54(0)
    val v177: Double = v71 - v32
    v177
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))))
    val v1: s3 = s3(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))
    val v2: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}