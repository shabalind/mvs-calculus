import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
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
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  def f67(v0: Vector[s3]): Vector[s3] = {
    val v7: Vector[Vector[s3]] = Vector(v0, v0, v0, v0)
    val v1: Vector[s3] = v7(0)
    val v6: s3 = v1(1)
    var v9: Vector[s3] = v0
    v9 = v9.updated(0, v6)
    v9 = v9.updated(0, v6)
    v9
  }
  @noinline
  def f0(v0: Vector[s3], v1: Vector[s2], v2: Double): Double = {
    val v7: Vector[s3] = f67(v0)
    val v8: s3 = v7(0)
    val v14: Vector[s1] = v8.p0
    val v13: s1 = v14(0)
    val v34: s0 = v13.p1
    val v21: Vector[Vector[Double]] = v34.p0
    val v93: Vector[Double] = v21(1)
    val v80: Double = v93(0)
    v80
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0))), s0(Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0))))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0)))))), s3(Vector(s1(s0(Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0))))), Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)))))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(20.0), Vector(21.0))), Vector(Vector(s0(Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0)))))), s2(s0(Vector(Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)))), Vector(s0(Vector(Vector(34.0), Vector(35.0)))))), s2(s0(Vector(Vector(36.0), Vector(37.0))), Vector(Vector(s0(Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0)))))))
    val v2: Double = 44.0
    val start = nanoTime()
    var result: Double = 44.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}