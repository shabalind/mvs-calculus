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
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s7 (
    p0: Vector[s0],
    p1: s1
  )
  def f34(v0: Double, v1: Vector[Vector[s7]]): Double = {
    var v7: Double = v0
    v7
  }
  @noinline
  def f0(v0: Vector[s7], v1: s3, v2: Double): Double = {
    val v10: s7 = v0(0)
    val v7: Vector[s0] = v10.p0
    val v29: Double = v2 / v2
    var v43: Double = v29
    var v32: Vector[s7] = v0
    val v33: s0 = v7(0)
    val v45: Vector[Vector[Double]] = v33.p0
    val v52: Vector[Double] = v45(1)
    val v39: Vector[Vector[s7]] = Vector(v32)
    var v74: Vector[Vector[s7]] = v39
    val v101: Double = v52(0)
    var v182: Vector[Vector[s7]] = v74
    val v150: Double = f34(v43, v182)
    val v158: Double = v101 / v150
    v158
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))))
    val v1: s3 = s3(s2(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))), s2(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
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