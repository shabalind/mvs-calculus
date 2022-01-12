import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s3
  )
  case class s6 (
    p0: s4,
    p1: s3
  )
  def f21(v0: Double): Double = {
    var v3: Double = v0
    var v1: Double = v3
    var v2: Double = v1
    var v5: Double = v0
    val v10: Double = v5 - v2
    v10
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v5: Double = f21(v1)
    val v8: Double = f21(v5)
    val v10: s4 = v0.p0
    var v9: s4 = v10
    val v19: Vector[s1] = v9.p0
    val v15: s1 = v19(0)
    var v46: Double = v8
    val v20: s0 = v15.p0
    val v16: Vector[Vector[Double]] = v20.p0
    val v89: Vector[Double] = v16(1)
    var v58: Vector[Double] = v89
    val v176: Double = v58(0)
    v58 = v58.updated(0, v46)
    v176
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s4(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), s3(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))))), s3(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(Vector(s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))))))))
    val v1: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}