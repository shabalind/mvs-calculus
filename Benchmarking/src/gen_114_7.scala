import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v5: s3 = v0
    val v4: s0 = v5.p1
    val v2: Vector[Vector[Double]] = v4.p0
    v5 = v5.copy(p1 = v4)
    val v3: s0 = v5.p0
    v5 = v5.copy(p1 = v4)
    val v9: Vector[Double] = v2(2)
    v5 = v5.copy(p1 = v3)
    v5 = v0
    v5 = v5.copy(p1 = v3)
    val v20: Double = v9(0)
    v20
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))))
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