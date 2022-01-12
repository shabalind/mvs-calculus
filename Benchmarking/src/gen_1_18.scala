import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: s1
  )
  case class s5 (
    p0: s3,
    p1: s3
  )
  case class s6 (
    p0: s2,
    p1: Vector[s5]
  )
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    var v3: s6 = v0
    val v4: s2 = v3.p0
    val v8: s1 = v4.p1
    val v17: Vector[s0] = v8.p1
    val v55: s0 = v17(0)
    val v31: Vector[Vector[Double]] = v55.p0
    var v52: Vector[Vector[Double]] = v31
    val v36: Vector[Double] = v52(0)
    v52 = v52.updated(0, v36)
    val v89: Vector[Double] = v52(0)
    v52 = v52.updated(0, v89)
    val v155: Double = v89(0)
    v155
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s2(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), s1(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))))), Vector(s5(s3(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))), s3(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), s1(Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0))))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))))))
    val v1: Double = 34.0
    val start = nanoTime()
    var result: Double = 34.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}