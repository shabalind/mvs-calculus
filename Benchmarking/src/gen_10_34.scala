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
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v4: Double = v1 * v1
    val v11: Double = v1 * v4
    var v10: Double = v1
    var v12: Double = v10
    v12 = v11
    var v27: Double = v4
    var v28: Double = v27
    val v36: Double = v12 + v28
    val v60: Double = v36 - v1
    var v128: Double = v60
    v128
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))))))
    val v1: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}