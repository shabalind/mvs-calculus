import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v3: s1 = v0.p0
    val v6: Vector[s0] = v3.p0
    val v16: s0 = v6(0)
    val v20: Vector[Vector[Double]] = v16.p0
    val v27: s0 = v3.p1
    val v23: Vector[Double] = v20(0)
    val v50: Vector[Vector[Double]] = v27.p0
    val v33: Double = v23(0)
    var v56: Vector[Double] = v23
    var v41: Vector[Double] = v56
    v56 = v56.updated(0, v33)
    val v130: Vector[Double] = v50(0)
    v41 = v130
    val v82: Double = v23(0)
    v41 = v41.updated(0, v82)
    val v278: Double = v41(0)
    v278
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(Vector(s0(Vector(Vector(0.0)))), s0(Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0))), s0(Vector(Vector(3.0))), s0(Vector(Vector(4.0)))))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}