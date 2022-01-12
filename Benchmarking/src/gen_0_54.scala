import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  case class s6 (
    p0: s3,
    p1: Vector[s0]
  )
  case class s7 (
    p0: s0,
    p1: Vector[s6],
    p2: Vector[Vector[s3]],
    p3: s2
  )
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v3: Vector[s6] = v0.p1
    val v4: s6 = v3(0)
    var v9: s6 = v4
    val v28: Vector[s0] = v9.p1
    val v14: s0 = v0.p0
    val v54: s0 = v28(1)
    val v56: Vector[Vector[Double]] = v14.p1
    val v46: Vector[Double] = v56(0)
    val v148: Vector[Vector[Double]] = v54.p0
    val v93: Vector[Double] = v148(2)
    val v110: Vector[Vector[Double]] = Vector(v46, v93, v93, v93)
    var v147: Vector[Vector[Double]] = v110
    val v197: Vector[Double] = v147(2)
    val v143: Double = v197(0)
    v143
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s6(s3(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s2(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(Vector(s3(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s2(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))), Vector(s3(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s2(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))))), s2(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))))
    val v1: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}