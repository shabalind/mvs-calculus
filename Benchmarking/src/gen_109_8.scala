import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s1,
    p1: s3
  )
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v4: s1 = v0.p0
    var v2: Double = v1
    val v10: s0 = v4.p1
    val v48: s0 = v4.p1
    val v22: Vector[Vector[Double]] = v48.p0
    val v16: Vector[Vector[Double]] = v10.p0
    val v36: Vector[Double] = v16(0)
    val v47: Vector[Double] = v22(0)
    var v54: Vector[Double] = v36
    v54 = v54.updated(0, v2)
    v54 = v47
    val v142: Double = v54(0)
    v142
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s3(s2(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))), Vector(s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}