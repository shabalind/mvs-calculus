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
    p0: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s2,
    p2: s2
  )
  case class s5 (
    p0: Vector[s0],
    p1: s2
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[Vector[s1]]
  )
  case class s9 (
    p0: s5,
    p1: s4
  )
  @noinline
  def f0(v0: Vector[s9], v1: s1, v2: s7, v3: Double): Double = {
    val v11: s0 = v1.p0
    val v27: Vector[Vector[Double]] = v11.p0
    val v13: Vector[Vector[Double]] = v11.p0
    val v22: Vector[Double] = v27(0)
    val v54: Double = v22(0)
    val v29: Vector[Double] = v13(0)
    val v117: Double = v29(0)
    val v168: Double = v54 + v117
    val v176: Double = v29(0)
    val v152: Double = v168 - v176
    v152
  }
  def benchmark(): Unit = {
    val v0: Vector[s9] = Vector(s9(s5(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))))))), s4(Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))))), s2(Vector(Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))))))), s9(s5(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))))), s4(Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))))), s2(Vector(Vector(s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))))))), s9(s5(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), s2(Vector(Vector(s1(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))))))), s4(Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))))))), s2(Vector(Vector(s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))))))))))
    val v1: s1 = s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))))
    val v2: s7 = s7(Vector(s4(Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0))))), s2(Vector(Vector(s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0))))))), s2(Vector(Vector(s1(s0(Vector(Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0))))))))), Vector(Vector(s1(s0(Vector(Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0))))), Vector(s1(s0(Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0)))))))
    val v3: Double = 70.0
    val start = nanoTime()
    var result: Double = 70.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}