import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1],
    p2: Vector[s1],
    p3: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s3,
    p1: s0
  )
  case class s5 (
    p0: Vector[s2],
    p1: s2
  )
  case class s8 (
    p0: s3,
    p1: Vector[s1]
  )
  def f22(v0: s2): s2 = {
    var v1: s2 = v0
    var v5: s2 = v1
    var v11: s2 = v5
    v11 = v0
    v11
  }
  def f18(v0: Vector[s2]): Vector[s2] = {
    val v7: s2 = v0(1)
    val v5: s2 = f22(v7)
    var v8: s2 = v5
    val v10: s2 = f22(v8)
    val v9: Vector[s1] = v10.p0
    v8 = v8.copy(p0 = v9)
    val v11: s2 = f22(v10)
    v8 = v8.copy(p0 = v9)
    v8 = v8.copy(p0 = v9)
    val v62: s5 = s5(v0, v11)
    val v71: Vector[s2] = v62.p0
    v71
  }
  @noinline
  def f0(v0: s3, v1: Vector[s2], v2: Vector[s4], v3: Double): Double = {
    val v9: Vector[s2] = f18(v1)
    var v8: Vector[s2] = v9
    var v7: Double = v3
    val v17: Double = v7 + v3
    var v13: s3 = v0
    val v14: s2 = v8(0)
    val v22: Vector[s1] = v14.p2
    val v16: s1 = v22(0)
    val v28: Vector[s1] = v14.p1
    v8 = v8.updated(1, v14)
    v13 = v13.copy(p0 = v16)
    val v19: s8 = s8(v0, v28)
    var v15: Vector[s1] = v28
    v13 = v13.copy(p0 = v16)
    val v64: s8 = s8(v13, v15)
    val v59: s1 = v0.p0
    val v48: s3 = v19.p0
    v15 = v15.updated(0, v59)
    val v54: Vector[s1] = v64.p1
    val v82: Vector[s1] = Vector(v16, v59, v59, v16, v16, v59)
    v13 = v48
    val v119: s1 = v82(5)
    var v90: Vector[s1] = v54
    v13 = v13.copy(p0 = v119)
    val v176: Double = v7 * v17
    val v130: s1 = v90(0)
    val v213: Double = v130.p0
    v13 = v13.copy(p0 = v59)
    var v98: Double = v213
    val v171: Vector[Double] = Vector(v213, v17, v98, v98, v176, v213, v98)
    val v301: Double = v171(4)
    v90 = v90.updated(0, v119)
    v301
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(0.0, s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(s1(11.0, s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)))), s1(17.0, s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0))))), Vector(s1(23.0, s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0))))), Vector(s1(29.0, s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s2(Vector(s1(45.0, s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), s1(51.0, s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), Vector(s1(57.0, s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), Vector(s1(63.0, s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), Vector(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0))), s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0))))), s2(Vector(s1(79.0, s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))), s1(85.0, s0(Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0))))), Vector(s1(91.0, s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0))))), Vector(s1(97.0, s0(Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0))))), Vector(s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0))))))
    val v2: Vector[s4] = Vector(s4(s3(s1(113.0, s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0)))), Vector(s0(Vector(Vector(119.0), Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0))))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0)))), s4(s3(s1(129.0, s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0)))))
    val v3: Double = 145.0
    val start = nanoTime()
    var result: Double = 145.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}