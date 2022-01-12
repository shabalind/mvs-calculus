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
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s2
  )
  case class s4 (
    p0: s3,
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: s1
  )
  case class s7 (
    p0: s5,
    p1: s5
  )
  case class s8 (
    p0: s4,
    p1: s7
  )
  def f48(v0: s8): s8 = {
    v0
  }
  def f47(v0: Double, v1: s8): Double = {
    var v31: Double = v0
    v31
  }
  def f37(v0: s7): s7 = {
    var v2: s7 = v0
    var v4: s7 = v2
    val v8: s5 = v2.p0
    v4 = v4.copy(p0 = v8)
    val v6: Vector[s5] = Vector(v8, v8, v8, v8, v8)
    v2 = v2.copy(p0 = v8)
    v4 = v4.copy(p0 = v8)
    var v3: s7 = v4
    val v11: s5 = v6(4)
    v3 = v3.copy(p0 = v11)
    v3
  }
  def f12(v0: s8, v1: s8): s8 = {
    val v6: s8 = f48(v1)
    val v4: s7 = v1.p1
    val v8: s7 = f37(v4)
    val v9: s8 = f48(v6)
    val v11: s8 = f48(v9)
    val v14: s8 = f48(v11)
    var v17: s8 = v11
    v17 = v17.copy(p1 = v8)
    val v40: s7 = v0.p1
    v17 = v14
    v17 = v17.copy(p1 = v40)
    v17
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v5: s8 = f12(v0, v0)
    val v8: Double = f47(v1, v5)
    val v13: Double = f47(v1, v5)
    val v19: Double = v13 * v13
    var v17: Double = v8
    val v52: Double = v19 - v17
    v52
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s4(s3(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))))), s2(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), s2(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))))))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), s7(s5(s1(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))), s1(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))), s5(s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))))), s1(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))))))))
    val v1: Double = 110.0
    val start = nanoTime()
    var result: Double = 110.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}