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
    p0: s0
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: s2
  )
  case class s8 (
    p0: Vector[Vector[s5]],
    p1: s3
  )
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    var v8: Double = v1
    val v9: s3 = v0.p1
    val v20: s2 = v9.p0
    var v16: Double = v8
    val v33: s0 = v20.p0
    val v53: Vector[Vector[Double]] = v33.p1
    val v26: Vector[Double] = v53(0)
    val v64: Double = v26(0)
    val v101: Vector[Double] = v53(0)
    var v92: Vector[Double] = v101
    v92 = v92.updated(0, v64)
    v92 = v92.updated(0, v16)
    v92 = v101
    val v67: Double = v92(0)
    val v165: Double = v67 * v67
    v92 = v92.updated(0, v64)
    v165
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(Vector(Vector(s5(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s2(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))))), s3(s2(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))
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