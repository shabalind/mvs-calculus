import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  case class s6 (
    p0: Vector[Vector[s4]],
    p1: s0
  )
  def f8(v0: s6): s6 = {
    val v5: Vector[Vector[s4]] = v0.p0
    val v3: Vector[s4] = v5(0)
    val v7: s4 = v3(0)
    val v18: s2 = v7.p1
    val v54: s0 = v18.p1
    val v87: s6 = s6(v5, v54)
    v87
  }
  def f1(v0: s6): s6 = {
    val v3: s6 = f8(v0)
    var v2: s6 = v3
    val v6: s0 = v2.p1
    var v4: s0 = v6
    var v13: s6 = v0
    val v9: s0 = v3.p1
    var v8: s0 = v9
    var v12: s6 = v13
    v12 = v12.copy(p1 = v8)
    v12 = v12.copy(p1 = v4)
    v12
  }
  @noinline
  def f0(v0: s0, v1: s6, v2: Double): Double = {
    val v5: Vector[Double] = Vector(v2, v2, v2, v2, v2)
    val v8: Double = v5(3)
    var v4: s0 = v0
    val v17: Vector[Double] = v4.p1
    val v19: Double = v17(0)
    val v18: Vector[Double] = v4.p1
    val v33: Double = v8 + v19
    val v30: Double = v18(0)
    val v37: s6 = f1(v1)
    val v22: s0 = v37.p1
    val v32: Vector[Vector[Double]] = v22.p0
    val v34: Vector[Double] = v32(2)
    val v49: Double = v34(0)
    val v86: Vector[Double] = Vector(v33, v49, v2, v2, v30)
    val v95: Double = v86(1)
    v95
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0), Vector(Vector(5.0)))
    val v1: s6 = s6(Vector(Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0, 16.0), Vector(Vector(17.0))))), Vector(s2(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(21.0, 22.0), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0), Vector(Vector(29.0))))), Vector(s2(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0), Vector(Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0, 40.0), Vector(Vector(41.0)))))), s2(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(45.0, 46.0), Vector(Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0, 52.0), Vector(Vector(53.0)))))), Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(57.0, 58.0), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0), Vector(Vector(65.0))))), Vector(s2(Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(69.0, 70.0), Vector(Vector(71.0)))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(75.0, 76.0), Vector(Vector(77.0))))), Vector(s2(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(81.0, 82.0), Vector(Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(87.0, 88.0), Vector(Vector(89.0)))))), s2(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0), Vector(Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(99.0, 100.0), Vector(Vector(101.0))))))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(105.0, 106.0), Vector(Vector(107.0))))
    val v2: Double = 108.0
    val start = nanoTime()
    var result: Double = 108.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}