import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s5 (
    p0: Vector[s2],
    p1: Vector[Vector[s3]]
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Vector[s5], v2: Double): Double = {
    val v3: Vector[s3] = v0(1)
    val v6: s3 = v3(0)
    val v16: s0 = v6.p1
    val v11: s0 = v6.p1
    val v21: Vector[Vector[Double]] = v11.p1
    var v36: Vector[Vector[Double]] = v21
    val v25: Vector[Double] = v36(0)
    val v30: Vector[Vector[Double]] = v16.p1
    v36 = v36.updated(0, v25)
    val v49: Vector[Double] = v36(0)
    v36 = v36.updated(0, v49)
    val v33: Double = v49(0)
    var v59: Double = v33
    val v56: Vector[Double] = v30(0)
    val v73: Double = v25(0)
    v36 = v36.updated(0, v56)
    val v110: Double = v73 * v59
    val v157: Double = v73 + v110
    v157
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s3(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))))
    val v1: Vector[s5] = Vector(s5(Vector(s2(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0))))))), Vector(Vector(s3(s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))))), Vector(s3(s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0))))))), s5(Vector(s2(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), Vector(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))))))), Vector(Vector(s3(s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))))), Vector(s3(s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), s0(Vector(Vector(58.0)), Vector(Vector(59.0))))))))
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