import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f3(v0: s0): s0 = {
    var v5: s0 = v0
    val v4: Vector[Vector[Double]] = v0.p0
    v5 = v5.copy(p0 = v4)
    val v1: Vector[Vector[Double]] = v5.p1
    var v2: s0 = v0
    val v17: Vector[Vector[Double]] = v0.p0
    val v34: Vector[Vector[Double]] = v5.p1
    val v14: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v1)
    v2 = v2.copy(p0 = v17)
    val v30: Vector[Vector[Double]] = v0.p1
    v5 = v5.copy(p1 = v14)
    v2 = v2.copy(p1 = v30)
    v2 = v2.copy(p1 = v1)
    v5 = v5.copy(p1 = v34)
    v5 = v5.copy(p1 = v30)
    val v54: Vector[s0] = Vector(v5, v2)
    v2 = v2.copy(p0 = v4)
    val v97: s0 = v54(0)
    v97
  }
  @noinline
  def f0(v0: s2, v1: s4, v2: Double): Double = {
    val v9: Vector[s0] = v1.p0
    val v4: s0 = v9(2)
    val v10: s0 = f3(v4)
    val v16: Vector[Vector[Double]] = v10.p1
    val v28: Vector[Double] = v16(1)
    val v58: Double = v28(0)
    val v56: Double = v28(0)
    val v64: Double = v56 * v58
    val v137: Double = v64 / v64
    v137
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s1(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), s1(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))))))
    val v1: s4 = s4(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))))
    val v2: Double = 57.0
    val start = nanoTime()
    var result: Double = 57.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}