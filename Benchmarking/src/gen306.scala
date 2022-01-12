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
  case class s3 (
    p0: s0,
    p1: s1
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: Double): Double = {
    val v7: Vector[s3] = v0(0)
    val v3: s3 = v7(0)
    val v14: s1 = v3.p1
    var v41: s1 = v14
    val v68: s0 = v41.p1
    v41 = v41.copy(p1 = v68)
    v41 = v14
    var v54: s0 = v68
    var v48: s0 = v54
    val v77: Vector[Vector[Double]] = v48.p1
    v54 = v68
    val v69: Vector[Double] = v77(0)
    val v78: Double = v69(0)
    v78
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s1(Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), Vector(s3(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s1(Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))), Vector(s3(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s1(Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}