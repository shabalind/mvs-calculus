import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s12 (
    p0: s3,
    p1: Vector[Vector[s3]]
  )
  @noinline
  def f0(v0: s12, v1: Double): Double = {
    var v6: Double = v1
    val v15: Double = v1 + v1
    val v16: Vector[Vector[s3]] = v0.p1
    val v38: Vector[s3] = v16(0)
    val v28: s3 = v38(0)
    v6 = v15
    val v37: s0 = v28.p0
    val v84: Vector[Vector[Double]] = v37.p0
    val v75: Vector[Double] = v84(0)
    val v117: Double = v75(0)
    val v137: Double = v6 - v117
    v137
  }
  def benchmark(): Unit = {
    val v0: s12 = s12(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s3(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s3(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), Vector(s3(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}