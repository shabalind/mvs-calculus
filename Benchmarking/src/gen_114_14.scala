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
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s2],
    p1: Vector[s2]
  )
  def f63(v0: s2): s2 = {
    val v5: Vector[s0] = v0.p0
    var v30: Vector[s0] = v5
    var v56: s2 = v0
    val v28: Vector[s0] = v0.p0
    v56 = v56.copy(p0 = v30)
    v56 = v56.copy(p0 = v28)
    var v84: s2 = v56
    val v68: Vector[s1] = v84.p1
    var v113: s2 = v56
    v113 = v113.copy(p1 = v68)
    v113
  }
  def f60(v0: s2): s2 = {
    val v7: s2 = f63(v0)
    val v2: Vector[s1] = v0.p1
    val v5: Vector[s1] = v7.p1
    val v6: Vector[Vector[s1]] = Vector(v2, v5, v5, v2, v5, v2)
    val v4: s2 = f63(v0)
    val v11: s2 = f63(v4)
    var v8: Vector[Vector[s1]] = v6
    var v9: s2 = v4
    val v3: Vector[s1] = v11.p1
    val v13: Vector[s1] = v7.p1
    val v10: Vector[s1] = v4.p1
    v8 = v8.updated(0, v3)
    val v12: s1 = v3(1)
    val v15: s0 = v12.p1
    var v43: Vector[s1] = v10
    v8 = v8.updated(4, v5)
    val v14: s2 = f63(v0)
    val v22: Vector[s1] = v8(4)
    val v24: s1 = v13(1)
    var v25: Vector[s1] = v3
    val v42: Vector[s1] = v6(4)
    v9 = v9.copy(p1 = v43)
    v8 = v6
    val v61: s2 = f63(v0)
    v8 = v8.updated(3, v13)
    v25 = v2
    v8 = v8.updated(2, v22)
    var v37: s2 = v7
    var v36: s1 = v12
    v9 = v9.copy(p1 = v42)
    val v53: s2 = f63(v61)
    var v67: s1 = v36
    v43 = v43.updated(1, v12)
    var v31: s2 = v37
    v36 = v36.copy(p0 = v15)
    val v32: Vector[s1] = v8(5)
    v8 = v8.updated(0, v32)
    v25 = v25.updated(1, v24)
    val v30: Vector[s0] = v37.p0
    v37 = v37.copy(p1 = v32)
    v25 = v25.updated(1, v67)
    val v45: s2 = f63(v9)
    v31 = v31.copy(p0 = v30)
    v25 = v25.updated(1, v12)
    v25 = v25.updated(0, v67)
    val v108: s2 = f63(v31)
    val v121: s2 = f63(v45)
    val v131: Vector[s2] = Vector(v7, v11, v53, v121, v108, v14)
    val v103: s2 = v131(4)
    v9 = v9.copy(p1 = v25)
    v103
  }
  def f45(v0: s1): s1 = {
    var v7: s1 = v0
    var v21: s1 = v7
    v21
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s2], v2: Double): Double = {
    var v7: Vector[s2] = v1
    val v6: s2 = v7(2)
    val v15: s2 = f60(v6)
    val v57: Vector[s1] = v15.p1
    val v46: s1 = v57(0)
    val v67: s1 = f45(v46)
    val v147: s0 = v67.p1
    val v102: Vector[Vector[Double]] = v147.p0
    val v41: Vector[Double] = v102(0)
    var v314: Vector[Double] = v41
    val v132: Double = v314(0)
    v132
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s1(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))), s2(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))))), Vector(s2(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), s1(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s1(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))))), s2(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0)))), Vector(s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0)))), s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))))), s2(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), Vector(s1(s0(Vector(Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), s1(s0(Vector(Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0)))), s1(s0(Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0)))))))), s4(Vector(s2(Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0)))), Vector(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0))), s0(Vector(Vector(74.0)), Vector(Vector(75.0)))), s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0)))), s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0)))))), s2(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0)))), Vector(s1(s0(Vector(Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0)))), s1(s0(Vector(Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0)))), s1(s0(Vector(Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0))))))), Vector(s2(Vector(s0(Vector(Vector(98.0)), Vector(Vector(99.0)))), Vector(s1(s0(Vector(Vector(100.0)), Vector(Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0)))), s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0))), s0(Vector(Vector(106.0)), Vector(Vector(107.0)))), s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0))), s0(Vector(Vector(110.0)), Vector(Vector(111.0)))))), s2(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0)))), Vector(s1(s0(Vector(Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0)))), s1(s0(Vector(Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0)))), s1(s0(Vector(Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0)))))), s2(Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0)))), Vector(s1(s0(Vector(Vector(128.0)), Vector(Vector(129.0))), s0(Vector(Vector(130.0)), Vector(Vector(131.0)))), s1(s0(Vector(Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0)), Vector(Vector(135.0)))), s1(s0(Vector(Vector(136.0)), Vector(Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0)))))))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0)))), Vector(s1(s0(Vector(Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0)), Vector(Vector(145.0)))), s1(s0(Vector(Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0)), Vector(Vector(149.0)))), s1(s0(Vector(Vector(150.0)), Vector(Vector(151.0))), s0(Vector(Vector(152.0)), Vector(Vector(153.0)))))), s2(Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0)))), Vector(s1(s0(Vector(Vector(156.0)), Vector(Vector(157.0))), s0(Vector(Vector(158.0)), Vector(Vector(159.0)))), s1(s0(Vector(Vector(160.0)), Vector(Vector(161.0))), s0(Vector(Vector(162.0)), Vector(Vector(163.0)))), s1(s0(Vector(Vector(164.0)), Vector(Vector(165.0))), s0(Vector(Vector(166.0)), Vector(Vector(167.0)))))), s2(Vector(s0(Vector(Vector(168.0)), Vector(Vector(169.0)))), Vector(s1(s0(Vector(Vector(170.0)), Vector(Vector(171.0))), s0(Vector(Vector(172.0)), Vector(Vector(173.0)))), s1(s0(Vector(Vector(174.0)), Vector(Vector(175.0))), s0(Vector(Vector(176.0)), Vector(Vector(177.0)))), s1(s0(Vector(Vector(178.0)), Vector(Vector(179.0))), s0(Vector(Vector(180.0)), Vector(Vector(181.0)))))))
    val v2: Double = 182.0
    val start = nanoTime()
    var result: Double = 182.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}