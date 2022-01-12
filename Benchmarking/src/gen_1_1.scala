import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s5 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  case class s6 (
    p0: s2,
    p1: s4
  )
  def f20(v0: Double): Double = {
    var v6: Double = v0
    v6 = v0
    val v2: Vector[Double] = Vector(v0, v6, v0)
    val v3: Double = v2(1)
    var v1: Double = v6
    var v13: Double = v3
    val v9: Double = v6 - v6
    var v11: Vector[Double] = v2
    val v8: Double = v1 + v13
    val v5: Double = v11(1)
    val v4: Double = v2(1)
    var v17: Vector[Double] = v11
    var v23: Vector[Double] = v2
    v11 = v17
    v11 = v11.updated(1, v8)
    val v20: Double = v11(2)
    val v21: Double = v23(0)
    var v31: Vector[Double] = v11
    v11 = v11.updated(1, v21)
    val v28: Double = v31(1)
    val v16: Double = v23(2)
    v23 = v23.updated(2, v5)
    var v26: Vector[Double] = v11
    var v45: Vector[Double] = v23
    var v33: Double = v4
    val v22: Double = v31(1)
    val v32: Double = v45(2)
    v23 = v23.updated(2, v28)
    val v44: Double = v17(1)
    val v46: Double = v26(0)
    v45 = v45.updated(2, v28)
    v11 = v11.updated(1, v44)
    var v40: Vector[Double] = v2
    v40 = v40.updated(1, v22)
    v26 = v26.updated(2, v4)
    v45 = v45.updated(1, v1)
    val v50: Double = v0 / v1
    v45 = v17
    var v39: Vector[Double] = v40
    val v35: Double = v23(0)
    var v64: Double = v0
    v45 = v45.updated(1, v20)
    v6 = v16
    var v103: Double = v64
    var v57: Double = v9
    v45 = v45.updated(2, v35)
    v1 = v33
    var v188: Double = v46
    v26 = v26.updated(0, v50)
    v11 = v11.updated(2, v57)
    v23 = v23.updated(1, v16)
    v23 = v23.updated(0, v188)
    var v86: Vector[Double] = v39
    v39 = v39.updated(0, v103)
    v17 = v86
    v32
  }
  @noinline
  def f0(v0: s6, v1: s5, v2: Double): Double = {
    var v7: Double = v2
    val v16: Double = v7 / v7
    val v14: Double = f20(v16)
    v14
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))))), s1(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), Vector(s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0))), Vector(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))))), s1(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0))), Vector(s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))))))), s4(Vector(s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)))), Vector(s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))))
    val v1: s5 = s5(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0))), Vector(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0))))), s1(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)))))), Vector(s1(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0))), Vector(s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0))))), s1(s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s1(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0))), Vector(s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0))))))))), s2(Vector(s1(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0))), Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0))), s0(Vector(Vector(111.0), Vector(112.0), Vector(113.0))))), s1(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0))), Vector(s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)))))), Vector(s1(s0(Vector(Vector(123.0), Vector(124.0), Vector(125.0))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0))), s0(Vector(Vector(129.0), Vector(130.0), Vector(131.0))))), s1(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0))), Vector(s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0))))), s1(s0(Vector(Vector(141.0), Vector(142.0), Vector(143.0))), Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0))), s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0))))))))
    val v2: Double = 150.0
    val start = nanoTime()
    var result: Double = 150.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}