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
    p0: s1
  )
  case class s3 (
    p0: s2,
    p1: s2,
    p2: s0
  )
  case class s8 (
    p0: s3,
    p1: Vector[s1]
  )
  def f14(v0: s8): s8 = {
    var v1: s8 = v0
    var v3: s8 = v0
    val v7: Vector[s1] = v3.p1
    v1 = v1.copy(p1 = v7)
    val v15: Vector[s1] = v0.p1
    v1 = v1.copy(p1 = v15)
    val v118: s3 = v1.p0
    v3 = v3.copy(p0 = v118)
    v3 = v0
    v1
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v4: s8 = f14(v0)
    val v7: Vector[s1] = v4.p1
    val v12: s1 = v7(0)
    val v18: s0 = v12.p1
    val v10: Vector[Vector[Double]] = v18.p1
    val v16: Vector[Double] = v10(0)
    val v27: Double = v16(0)
    val v19: Double = v16(0)
    val v31: Double = v16(0)
    val v39: Double = v27 + v19
    val v49: Double = v39 * v31
    v49
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s3(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s2(s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))))
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