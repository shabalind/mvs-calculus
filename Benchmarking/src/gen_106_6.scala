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
    p0: s1,
    p1: Vector[s1]
  )
  def f23(v0: s1): s1 = {
    var v3: s1 = v0
    var v6: s1 = v0
    var v4: s1 = v3
    val v8: s0 = v6.p0
    var v2: s1 = v3
    v6 = v3
    val v1: Vector[Vector[Double]] = v8.p0
    val v5: s0 = v6.p0
    v2 = v2.copy(p1 = v8)
    v4 = v4.copy(p0 = v5)
    val v7: s0 = v4.p1
    var v9: s0 = v7
    var v13: s0 = v9
    v2 = v2.copy(p1 = v9)
    v3 = v3.copy(p1 = v8)
    v13 = v13.copy(p1 = v1)
    v4 = v4.copy(p0 = v8)
    v13 = v13.copy(p1 = v1)
    v6 = v6.copy(p0 = v13)
    v2
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v4: s1 = v0.p0
    val v8: s1 = f23(v4)
    val v17: s0 = v8.p1
    val v35: Vector[Vector[Double]] = v17.p1
    val v45: Vector[Double] = v35(1)
    val v98: Double = v45(0)
    v98
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}