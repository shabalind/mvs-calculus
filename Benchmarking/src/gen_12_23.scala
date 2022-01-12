import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s2], v1: s1, v2: Vector[s1], v3: Double): Double = {
    val v4: s2 = v0(1)
    val v9: s1 = v2(2)
    var v20: s1 = v9
    val v33: s0 = v20.p1
    v20 = v20.copy(p1 = v33)
    val v10: Vector[s0] = v4.p0
    val v22: Vector[Vector[Double]] = v33.p1
    val v26: Vector[Double] = v22(0)
    v20 = v20.copy(p0 = v10)
    val v29: Double = v26(0)
    val v46: s1 = v2(2)
    val v97: s0 = v46.p1
    v20 = v20.copy(p1 = v97)
    v29
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s1(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))), s2(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), Vector(s1(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s1(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), s0(Vector(Vector(42.0)), Vector(Vector(43.0)))))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), s0(Vector(Vector(48.0)), Vector(Vector(49.0))))
    val v2: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), s1(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), s1(Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0)))), s0(Vector(Vector(66.0)), Vector(Vector(67.0)))))
    val v3: Double = 68.0
    val start = nanoTime()
    var result: Double = 68.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}