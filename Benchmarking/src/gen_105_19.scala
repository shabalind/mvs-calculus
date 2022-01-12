import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s2], v2: Vector[s2], v3: Double): Double = {
    var v6: Vector[s4] = v0
    val v13: s4 = v6(0)
    val v20: Vector[s1] = v13.p0
    val v9: s1 = v20(0)
    val v17: s0 = v9.p1
    v6 = v6.updated(0, v13)
    var v33: s0 = v17
    val v41: Vector[Vector[Double]] = v33.p0
    val v31: Vector[Double] = v41(2)
    val v57: Vector[Vector[Double]] = v17.p0
    v33 = v33.copy(p0 = v57)
    v33 = v33.copy(p0 = v41)
    val v245: Double = v31(0)
    v245
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s1(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)))))), s2(s1(Vector(s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))))
    val v2: Vector[s2] = Vector(s2(s1(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)))))), s2(s1(Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)))), Vector(s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)))))))
    val v3: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}