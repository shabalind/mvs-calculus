import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s0
  )
  case class s5 (
    p0: s4,
    p1: Vector[s1]
  )
  case class s8 (
    p0: Vector[Vector[s1]],
    p1: s3
  )
  def f6(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    var v8: s0 = v0
    val v9: Vector[Vector[Double]] = v8.p1
    val v14: s2 = s2(v8, v8)
    val v19: s0 = v14.p0
    v8 = v8.copy(p0 = v9)
    var v24: Vector[Vector[Double]] = v9
    v8 = v8.copy(p0 = v9)
    val v18: Vector[Double] = v24(2)
    var v10: s0 = v19
    var v23: Vector[Vector[Double]] = v6
    var v31: s0 = v10
    v31 = v31.copy(p0 = v23)
    v23 = v23.updated(1, v18)
    v10 = v10.copy(p1 = v23)
    val v96: Vector[Double] = v24(2)
    v23 = v23.updated(1, v96)
    v31
  }
  @noinline
  def f0(v0: Vector[s8], v1: Vector[s5], v2: s0, v3: Double): Double = {
    val v8: s8 = v0(1)
    val v9: Double = v3 - v3
    val v7: s3 = v8.p1
    val v10: s0 = f6(v2)
    val v23: Vector[Vector[Double]] = v10.p0
    val v17: Vector[Double] = v23(1)
    val v53: s1 = v7.p0
    var v24: s1 = v53
    v24 = v24.copy(p0 = v9)
    val v50: s1 = v7.p0
    v24 = v24.copy(p0 = v3)
    v24 = v24.copy(p0 = v3)
    val v72: Double = v17(0)
    v24 = v24.copy(p0 = v9)
    v24 = v50
    val v97: Double = v24.p0
    v24 = v24.copy(p0 = v72)
    v97
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(Vector(s1(0.0, Vector(Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0))))))), Vector(s1(7.0, Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))))))), Vector(s1(14.0, Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)))))))), s3(s1(21.0, Vector(Vector(s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))), Vector(s1(28.0, Vector(Vector(s0(Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))))), s1(35.0, Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))))), s8(Vector(Vector(s1(42.0, Vector(Vector(s0(Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0))))))), Vector(s1(49.0, Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))))))), Vector(s1(56.0, Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0)))))))), s3(s1(63.0, Vector(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))))), Vector(s1(70.0, Vector(Vector(s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)))))), s1(77.0, Vector(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))))), s8(Vector(Vector(s1(84.0, Vector(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0))))))), Vector(s1(91.0, Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0), Vector(97.0))))))), Vector(s1(98.0, Vector(Vector(s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0)))))))), s3(s1(105.0, Vector(Vector(s0(Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))))), Vector(s1(112.0, Vector(Vector(s0(Vector(Vector(113.0), Vector(114.0), Vector(115.0)), Vector(Vector(116.0), Vector(117.0), Vector(118.0)))))), s1(119.0, Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0))))))))))
    val v1: Vector[s5] = Vector(s5(s4(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s1(132.0, Vector(Vector(s0(Vector(Vector(133.0), Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)))))))))
    val v2: s0 = s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))
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