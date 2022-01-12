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
    p2: Vector[s0],
    p3: Vector[s0],
    p4: s0
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: Vector[s3]
  )
  def f31(v0: s4): s4 = {
    var v4: s4 = v0
    v4
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v2: s4 = v0(0)
    val v8: s4 = f31(v2)
    val v3: Vector[Vector[s1]] = v8.p0
    val v16: Vector[s1] = v3(0)
    val v58: s1 = v16(0)
    val v54: s0 = v58.p1
    val v55: Vector[Vector[Double]] = v54.p1
    val v37: Vector[Double] = v55(0)
    val v59: Double = v37(0)
    v59
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))), Vector(s3(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), Vector(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), s0(Vector(Vector(32.0)), Vector(Vector(33.0)))))))))
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