import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[s3],
    p1: s3
  )
  case class s6 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: s6, v2: Double): Double = {
    val v3: Vector[Vector[s0]] = v1.p1
    val v41: Vector[s0] = v3(0)
    val v21: s0 = v41(0)
    val v18: Vector[Vector[Double]] = v21.p0
    val v145: Vector[Double] = v18(0)
    var v98: Vector[Vector[Double]] = v18
    v98 = v98.updated(0, v145)
    val v57: Vector[Double] = v98(0)
    v98 = v98.updated(0, v145)
    val v120: Double = v57(0)
    v120
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(Vector(s3(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s1(Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))), s3(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), s1(Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), s0(Vector(Vector(34.0)), Vector(Vector(35.0))))), s1(Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0))))), s0(Vector(Vector(40.0)), Vector(Vector(41.0))))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))))))))
    val v1: s6 = s6(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s1(Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))))), s0(Vector(Vector(58.0)), Vector(Vector(59.0))))), s1(Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0))))), s0(Vector(Vector(64.0)), Vector(Vector(65.0))))), Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0))))))
    val v2: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}