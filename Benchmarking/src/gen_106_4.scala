import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s8 (
    p0: s0,
    p1: Vector[s3]
  )
  def f21(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p1
    val v23: s0 = s0(v7, v2)
    v23
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v4: s0 = v0.p0
    var v13: s0 = v4
    val v7: s0 = f21(v4)
    val v5: Vector[Vector[Double]] = v13.p1
    val v10: s0 = f21(v7)
    v13 = v10
    val v15: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v5, v5)
    val v42: Vector[Vector[Double]] = v15(2)
    val v26: Vector[Vector[Double]] = v10.p0
    val v36: Vector[Double] = v42(1)
    v13 = v13.copy(p0 = v26)
    var v19: Vector[Double] = v36
    val v61: Vector[Vector[Double]] = v4.p0
    v13 = v13.copy(p1 = v5)
    v13 = v13.copy(p0 = v61)
    v13 = v13.copy(p1 = v42)
    val v158: Double = v19(0)
    v158
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s3(Vector(Vector(s1(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s3(Vector(Vector(s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))))))
    val v1: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}