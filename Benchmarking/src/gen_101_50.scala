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
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s3,
    p1: s1
  )
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v2: s1 = v0.p1
    val v5: Vector[s0] = v2.p1
    val v16: s0 = v5(0)
    val v22: Vector[Vector[Double]] = v16.p1
    val v18: Vector[Double] = v22(0)
    val v23: s0 = v5(0)
    val v42: Vector[Double] = v22(0)
    val v31: Vector[Vector[Double]] = v23.p1
    val v47: Vector[Double] = v31(0)
    val v28: Vector[Vector[Double]] = Vector(v42, v42, v18, v47, v18, v18, v42)
    val v123: Vector[Double] = v28(5)
    var v60: Vector[Double] = v123
    v60 = v60.updated(0, v1)
    val v285: Double = v60(0)
    v285
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), Vector(s1(Vector(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), s1(Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))))))), s1(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))))
    val v1: Double = 26.0
    val start = nanoTime()
    var result: Double = 26.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}