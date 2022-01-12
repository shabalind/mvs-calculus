import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s1],
    p1: s0
  )
  case class s8 (
    p0: s6,
    p1: s2
  )
  case class s11 (
    p0: Vector[Vector[s6]],
    p1: Vector[s8]
  )
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    val v10: Vector[s8] = v0.p1
    val v6: s8 = v10(0)
    var v3: s8 = v6
    val v16: s2 = v3.p1
    var v17: s2 = v16
    val v24: s8 = v10(0)
    v3 = v3.copy(p1 = v17)
    val v14: s6 = v24.p0
    val v25: Vector[s0] = v16.p1
    val v34: s0 = v25(0)
    var v67: s2 = v16
    val v22: Vector[Double] = v34.p0
    v17 = v17.copy(p1 = v25)
    v3 = v3.copy(p0 = v14)
    val v40: Double = v22(0)
    var v110: s2 = v67
    v110 = v110.copy(p1 = v25)
    val v84: Double = v22(1)
    v3 = v3.copy(p1 = v110)
    val v152: Double = v40 / v84
    var v189: Double = v152
    v189
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(Vector(Vector(s6(Vector(s1(Vector(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0))))), s0(Vector(8.0, 9.0), Vector(Vector(10.0), Vector(11.0)))), s1(Vector(Vector(s0(Vector(12.0, 13.0), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0))))), s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0)))), s1(Vector(Vector(s0(Vector(24.0, 25.0), Vector(Vector(26.0), Vector(27.0)))), Vector(s0(Vector(28.0, 29.0), Vector(Vector(30.0), Vector(31.0))))), s0(Vector(32.0, 33.0), Vector(Vector(34.0), Vector(35.0))))), s0(Vector(36.0, 37.0), Vector(Vector(38.0), Vector(39.0))))), Vector(s6(Vector(s1(Vector(Vector(s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0)))), Vector(s0(Vector(44.0, 45.0), Vector(Vector(46.0), Vector(47.0))))), s0(Vector(48.0, 49.0), Vector(Vector(50.0), Vector(51.0)))), s1(Vector(Vector(s0(Vector(52.0, 53.0), Vector(Vector(54.0), Vector(55.0)))), Vector(s0(Vector(56.0, 57.0), Vector(Vector(58.0), Vector(59.0))))), s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0)))), s1(Vector(Vector(s0(Vector(64.0, 65.0), Vector(Vector(66.0), Vector(67.0)))), Vector(s0(Vector(68.0, 69.0), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(72.0, 73.0), Vector(Vector(74.0), Vector(75.0))))), s0(Vector(76.0, 77.0), Vector(Vector(78.0), Vector(79.0)))))), Vector(s8(s6(Vector(s1(Vector(Vector(s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0)))), Vector(s0(Vector(84.0, 85.0), Vector(Vector(86.0), Vector(87.0))))), s0(Vector(88.0, 89.0), Vector(Vector(90.0), Vector(91.0)))), s1(Vector(Vector(s0(Vector(92.0, 93.0), Vector(Vector(94.0), Vector(95.0)))), Vector(s0(Vector(96.0, 97.0), Vector(Vector(98.0), Vector(99.0))))), s0(Vector(100.0, 101.0), Vector(Vector(102.0), Vector(103.0)))), s1(Vector(Vector(s0(Vector(104.0, 105.0), Vector(Vector(106.0), Vector(107.0)))), Vector(s0(Vector(108.0, 109.0), Vector(Vector(110.0), Vector(111.0))))), s0(Vector(112.0, 113.0), Vector(Vector(114.0), Vector(115.0))))), s0(Vector(116.0, 117.0), Vector(Vector(118.0), Vector(119.0)))), s2(s1(Vector(Vector(s0(Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0)))), Vector(s0(Vector(124.0, 125.0), Vector(Vector(126.0), Vector(127.0))))), s0(Vector(128.0, 129.0), Vector(Vector(130.0), Vector(131.0)))), Vector(s0(Vector(132.0, 133.0), Vector(Vector(134.0), Vector(135.0))))))))
    val v1: Double = 136.0
    val start = nanoTime()
    var result: Double = 136.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}