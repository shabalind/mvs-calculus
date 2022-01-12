import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: s1, v2: Double): Double = {
    val v4: Vector[s1] = v0.p0
    val v9: s1 = v4(0)
    val v6: s1 = v4(1)
    val v23: s0 = v9.p0
    var v20: s1 = v6
    v20 = v20.copy(p1 = v23)
    v20 = v20.copy(p0 = v23)
    val v34: s0 = v20.p1
    val v65: Vector[Vector[Double]] = v34.p0
    val v60: Vector[Double] = v65(0)
    val v22: Double = v60(0)
    val v48: s0 = s0(v65, v22)
    val v89: Double = v48.p1
    v89
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0)), 1.0), s0(Vector(Vector(2.0)), 3.0)), s1(s0(Vector(Vector(4.0)), 5.0), s0(Vector(Vector(6.0)), 7.0)), s1(s0(Vector(Vector(8.0)), 9.0), s0(Vector(Vector(10.0)), 11.0))), Vector(s1(s0(Vector(Vector(12.0)), 13.0), s0(Vector(Vector(14.0)), 15.0)), s1(s0(Vector(Vector(16.0)), 17.0), s0(Vector(Vector(18.0)), 19.0)), s1(s0(Vector(Vector(20.0)), 21.0), s0(Vector(Vector(22.0)), 23.0))))
    val v1: s1 = s1(s0(Vector(Vector(24.0)), 25.0), s0(Vector(Vector(26.0)), 27.0))
    val v2: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}