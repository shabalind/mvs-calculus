import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v6: s3 = v0(1)
    val v5: s2 = v6.p1
    var v19: Double = v1
    v19 = v1
    val v35: Vector[s0] = v5.p1
    val v57: s0 = v35(1)
    val v37: Vector[Vector[Double]] = v57.p0
    val v46: Vector[Double] = v37(0)
    var v49: Vector[Double] = v46
    val v109: Vector[Vector[Double]] = Vector(v49)
    val v87: Vector[Double] = v109(0)
    v49 = v49.updated(0, v19)
    val v117: Double = v87(0)
    v117
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s2(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), s3(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s2(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))), s3(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s2(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}