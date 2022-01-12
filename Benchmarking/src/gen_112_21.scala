import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  def f36(v0: s0, v1: s0): s0 = {
    var v6: s0 = v0
    var v3: s0 = v6
    val v8: Vector[Vector[Double]] = v1.p0
    v3 = v3.copy(p0 = v8)
    v3
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v6: s0 = v0.p0
    val v3: s0 = f36(v6, v6)
    val v2: Vector[s0] = Vector(v3, v3, v6, v3)
    val v9: s0 = v2(3)
    val v8: s0 = v0.p0
    val v5: Vector[Vector[Double]] = v9.p2
    var v18: s0 = v8
    v18 = v18.copy(p2 = v5)
    val v14: s0 = v2(3)
    val v22: Vector[Vector[Double]] = v18.p0
    v18 = v18.copy(p0 = v5)
    val v60: Vector[Vector[Double]] = v14.p1
    val v90: s0 = s0(v22, v60, v22)
    val v49: s0 = f36(v90, v6)
    val v107: Vector[Vector[Double]] = v49.p2
    var v58: Vector[Vector[Double]] = v107
    val v101: Vector[Double] = v58(0)
    val v171: Double = v101(0)
    v171
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0))), s1(s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)))))
    val v1: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}