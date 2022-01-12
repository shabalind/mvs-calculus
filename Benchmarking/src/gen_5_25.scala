import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  case class s5 (
    p0: s2,
    p1: s2
  )
  case class s8 (
    p0: s4,
    p1: Vector[Vector[s4]]
  )
  @noinline
  def f0(v0: Vector[s8], v1: s5, v2: s5, v3: Double): Double = {
    val v11: s8 = v0(0)
    val v14: Vector[Vector[s4]] = v11.p1
    val v13: Vector[s4] = v14(0)
    var v23: Double = v3
    val v26: s4 = v13(0)
    var v19: s4 = v26
    val v36: Vector[s4] = v14(0)
    v19 = v26
    val v37: Double = v3 / v23
    val v52: s0 = v19.p1
    var v41: s0 = v52
    val v111: s4 = v36(0)
    v41 = v41.copy(p0 = v37)
    v19 = v19.copy(p1 = v52)
    val v200: Vector[Vector[Double]] = v41.p1
    val v80: s0 = v111.p1
    val v58: Vector[Double] = v200(0)
    v19 = v19.copy(p1 = v80)
    val v181: Double = v58(0)
    v181
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s4(Vector(s1(s0(0.0, Vector(Vector(1.0), Vector(2.0)))), s1(s0(3.0, Vector(Vector(4.0), Vector(5.0))))), s0(6.0, Vector(Vector(7.0), Vector(8.0)))), Vector(Vector(s4(Vector(s1(s0(9.0, Vector(Vector(10.0), Vector(11.0)))), s1(s0(12.0, Vector(Vector(13.0), Vector(14.0))))), s0(15.0, Vector(Vector(16.0), Vector(17.0))))))))
    val v1: s5 = s5(s2(Vector(s0(18.0, Vector(Vector(19.0), Vector(20.0))), s0(21.0, Vector(Vector(22.0), Vector(23.0))), s0(24.0, Vector(Vector(25.0), Vector(26.0)))), Vector(Vector(s0(27.0, Vector(Vector(28.0), Vector(29.0)))))), s2(Vector(s0(30.0, Vector(Vector(31.0), Vector(32.0))), s0(33.0, Vector(Vector(34.0), Vector(35.0))), s0(36.0, Vector(Vector(37.0), Vector(38.0)))), Vector(Vector(s0(39.0, Vector(Vector(40.0), Vector(41.0)))))))
    val v2: s5 = s5(s2(Vector(s0(42.0, Vector(Vector(43.0), Vector(44.0))), s0(45.0, Vector(Vector(46.0), Vector(47.0))), s0(48.0, Vector(Vector(49.0), Vector(50.0)))), Vector(Vector(s0(51.0, Vector(Vector(52.0), Vector(53.0)))))), s2(Vector(s0(54.0, Vector(Vector(55.0), Vector(56.0))), s0(57.0, Vector(Vector(58.0), Vector(59.0))), s0(60.0, Vector(Vector(61.0), Vector(62.0)))), Vector(Vector(s0(63.0, Vector(Vector(64.0), Vector(65.0)))))))
    val v3: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}