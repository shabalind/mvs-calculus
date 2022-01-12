import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s2
  )
  case class s7 (
    p0: s0,
    p1: s4
  )
  case class s8 (
    p0: Vector[s7],
    p1: s5
  )
  def f84(v0: s0): s0 = {
    val v11: Vector[Vector[Double]] = v0.p0
    var v10: s0 = v0
    v10 = v10.copy(p0 = v11)
    v10
  }
  def f77(v0: s0): s0 = {
    var v5: s0 = v0
    v5 = v0
    v5 = v0
    var v8: s0 = v5
    val v6: s0 = f84(v5)
    val v2: s0 = f84(v0)
    val v4: Vector[Vector[Double]] = v5.p0
    var v10: Vector[Vector[Double]] = v4
    val v7: Vector[Vector[Vector[Double]]] = Vector(v4)
    var v3: Vector[Vector[Double]] = v4
    val v9: Vector[Vector[Double]] = v8.p1
    v8 = v8.copy(p1 = v9)
    var v1: Vector[Vector[Double]] = v3
    val v22: s0 = f84(v6)
    val v12: Vector[Vector[Double]] = v0.p1
    val v24: Vector[Double] = v12(0)
    val v28: s0 = f84(v22)
    v5 = v5.copy(p0 = v1)
    val v19: Vector[Double] = v10(0)
    val v38: Vector[Vector[Double]] = v2.p0
    v5 = v5.copy(p0 = v1)
    v5 = v5.copy(p0 = v4)
    val v42: Vector[Double] = v38(0)
    val v16: s0 = f84(v5)
    v5 = v5.copy(p1 = v9)
    val v31: Vector[Vector[Double]] = v16.p1
    v5 = v5.copy(p1 = v12)
    val v30: Vector[Vector[Double]] = v7(0)
    val v37: Vector[Double] = v30(0)
    val v32: Vector[Double] = v4(1)
    val v33: Vector[Vector[Double]] = Vector(v37, v19, v32, v42, v19, v24)
    v5 = v5.copy(p1 = v31)
    var v51: s0 = v28
    val v98: Vector[Vector[Double]] = v6.p1
    v51 = v51.copy(p1 = v98)
    val v66: Vector[Double] = v33(0)
    v51 = v51.copy(p0 = v30)
    v3 = v3.updated(1, v24)
    v8 = v8.copy(p0 = v3)
    v1 = v1.updated(1, v66)
    v51
  }
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s8]], v2: Double): Double = {
    val v7: s0 = f77(v0)
    val v19: Vector[Vector[Double]] = v7.p0
    val v27: Vector[Double] = v19(0)
    val v128: Double = v27(0)
    v128
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Vector[Vector[s8]] = Vector(Vector(s8(Vector(s7(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s4(s2(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s2(s1(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s2(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))))))), s5(Vector(s2(s1(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))), s2(s1(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))))), s2(s1(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), Vector(Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))))), s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))))), Vector(s8(Vector(s7(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))), s4(s2(s1(Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), Vector(Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0)))))), s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)))), Vector(s2(s1(Vector(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0)))), Vector(s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))))), s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)))), s2(s1(Vector(s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0)))), Vector(Vector(s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0)))), Vector(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0)))))), s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))))))), s5(Vector(s2(s1(Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0))), s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0)))), Vector(Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0)))), Vector(s0(Vector(Vector(153.0), Vector(154.0)), Vector(Vector(155.0)))))), s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0)))), s2(s1(Vector(s0(Vector(Vector(159.0), Vector(160.0)), Vector(Vector(161.0))), s0(Vector(Vector(162.0), Vector(163.0)), Vector(Vector(164.0)))), Vector(Vector(s0(Vector(Vector(165.0), Vector(166.0)), Vector(Vector(167.0)))), Vector(s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0)))))), s0(Vector(Vector(171.0), Vector(172.0)), Vector(Vector(173.0))))), s2(s1(Vector(s0(Vector(Vector(174.0), Vector(175.0)), Vector(Vector(176.0))), s0(Vector(Vector(177.0), Vector(178.0)), Vector(Vector(179.0)))), Vector(Vector(s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0)))), Vector(s0(Vector(Vector(183.0), Vector(184.0)), Vector(Vector(185.0)))))), s0(Vector(Vector(186.0), Vector(187.0)), Vector(Vector(188.0))))))))
    val v2: Double = 189.0
    val start = nanoTime()
    var result: Double = 189.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}