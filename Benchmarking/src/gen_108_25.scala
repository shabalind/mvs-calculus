import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s6 (
    p0: Vector[s3],
    p1: s0
  )
  case class s7 (
    p0: s0,
    p1: Vector[s6]
  )
  case class s12 (
    p0: s3,
    p1: s7
  )
  def f77(v0: s3): s3 = {
    v0
  }
  @noinline
  def f0(v0: s12, v1: Double): Double = {
    val v2: s3 = v0.p0
    val v14: s3 = f77(v2)
    var v80: Double = v1
    val v56: s1 = v14.p1
    val v46: Vector[s0] = v56.p0
    val v62: s0 = v46(1)
    val v49: Vector[Vector[Double]] = v62.p1
    val v116: Vector[Double] = v49(0)
    val v133: Double = v116(0)
    val v211: Double = v80 / v133
    v211
  }
  def benchmark(): Unit = {
    val v0: s12 = s12(s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s1(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))), s7(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s6(Vector(s3(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s1(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))))), s3(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))))))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))))))
    val v1: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}