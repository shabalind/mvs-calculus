import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: Double
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s7 (
    p0: s4,
    p1: s3
  )
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v5: s3 = s3(v1)
    var v12: Double = v1
    val v13: Double = v5.p0
    var v14: Double = v12
    var v30: s3 = v5
    val v40: Double = v30.p0
    val v32: Double = v1 - v14
    v30 = v30.copy(p0 = v13)
    val v45: Double = v12 / v12
    val v31: Double = v40 / v12
    v30 = v30.copy(p0 = v32)
    val v99: Vector[Double] = Vector(v31, v32, v32, v45)
    v30 = v30.copy(p0 = v45)
    val v128: Double = v99(0)
    v128
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s4(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s3(16.0)), s7(s4(s0(Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0))), s0(Vector(Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0))))), s3(33.0)), s7(s4(s0(Vector(Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0))), Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))), s3(50.0)))
    val v1: Double = 51.0
    val start = nanoTime()
    var result: Double = 51.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}