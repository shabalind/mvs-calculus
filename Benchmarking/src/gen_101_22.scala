import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: Vector[s1]
  )
  def f94(v0: s1): s1 = {
    val v6: s0 = v0.p1
    var v5: s0 = v6
    val v2: s3 = s3(v0, v5)
    val v24: s1 = v2.p0
    v24
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v2: s1 = v0.p0
    val v4: s1 = f94(v2)
    val v5: s1 = f94(v4)
    val v3: Vector[s0] = v5.p0
    val v22: s0 = v3(0)
    val v42: Vector[Vector[Double]] = v22.p1
    val v122: Vector[Double] = v42(0)
    val v90: Double = v122(0)
    v90
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(Vector(s0(0.0, Vector(Vector(1.0)))), s0(2.0, Vector(Vector(3.0)))), Vector(s1(Vector(s0(4.0, Vector(Vector(5.0)))), s0(6.0, Vector(Vector(7.0))))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}