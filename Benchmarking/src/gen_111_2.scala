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
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  case class s7 (
    p0: s3,
    p1: Vector[Vector[s1]]
  )
  def f59(v0: Double): Double = {
    var v2: Double = v0
    v2 = v0
    var v11: Double = v2
    var v12: Double = v11
    v12
  }
  @noinline
  def f0(v0: s7, v1: Vector[s2], v2: Double): Double = {
    val v6: Double = f59(v2)
    var v20: Double = v6
    var v17: Double = v6
    val v40: Double = f59(v6)
    val v39: Double = f59(v20)
    val v45: Double = v39 - v40
    val v52: Double = v40 - v45
    val v86: Double = v17 - v52
    v86
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s3(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s1(Vector(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))))
    val v1: Vector[s2] = Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s1(Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s1(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))
    val v2: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}