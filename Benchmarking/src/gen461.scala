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
    p0: Vector[s0],
    p1: Vector[Vector[s1]],
    p2: s1,
    p3: Vector[s1]
  )
  def f80(v0: Vector[s2]): Vector[s2] = {
    val v6: s2 = v0(1)
    var v20: Vector[s2] = v0
    var v16: Vector[s2] = v20
    v20 = v20.updated(1, v6)
    v16
  }
  def f79(v0: s2): s2 = {
    val v5: Vector[Vector[s1]] = v0.p1
    var v4: s2 = v0
    val v3: Vector[Vector[s1]] = v0.p1
    var v1: s2 = v0
    val v7: Vector[s1] = v3(0)
    var v8: Vector[s1] = v7
    v1 = v1.copy(p1 = v3)
    val v6: s1 = v8(0)
    v4 = v4.copy(p2 = v6)
    v1 = v1.copy(p2 = v6)
    v8 = v8.updated(0, v6)
    val v30: Vector[s1] = v1.p3
    v1 = v1.copy(p1 = v5)
    v1 = v1.copy(p3 = v30)
    val v22: s1 = v30(1)
    v8 = v8.updated(0, v22)
    v4
  }
  def f72(v0: s2): s2 = {
    val v4: Vector[s2] = Vector(v0, v0)
    val v6: s2 = f79(v0)
    var v1: Vector[s2] = v4
    val v2: Vector[s2] = f80(v1)
    var v3: s2 = v0
    var v7: s2 = v6
    v7 = v6
    var v9: Vector[s2] = v2
    val v8: Vector[Vector[s1]] = v0.p1
    val v20: Vector[s2] = f80(v9)
    val v22: Vector[s1] = v0.p3
    var v10: Vector[s1] = v22
    val v14: Vector[s2] = f80(v2)
    val v13: Vector[s1] = v8(0)
    v1 = v1.updated(1, v3)
    v9 = v20
    val v72: s2 = v14(1)
    val v57: s1 = v22(1)
    val v37: s1 = v13(0)
    val v51: s2 = f79(v0)
    val v21: s2 = v9(0)
    v1 = v1.updated(1, v7)
    v10 = v10.updated(0, v57)
    v7 = v7.copy(p3 = v10)
    v7 = v7.copy(p2 = v37)
    val v82: Vector[s0] = v72.p0
    v3 = v3.copy(p3 = v10)
    v1 = v1.updated(1, v51)
    v3 = v3.copy(p1 = v8)
    v7 = v7.copy(p0 = v82)
    val v122: s2 = f79(v21)
    v9 = v9.updated(0, v72)
    v1 = v1.updated(1, v7)
    v122
  }
  def f70(v0: s0): s0 = {
    var v4: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v4.p0
    var v5: Vector[Vector[Double]] = v1
    val v8: Vector[Vector[Double]] = v0.p1
    v4 = v4.copy(p0 = v1)
    val v7: Vector[Double] = v2(1)
    val v6: s0 = s0(v8, v5)
    val v3: Vector[Vector[Double]] = v4.p1
    v5 = v5.updated(1, v7)
    val v29: Vector[Vector[Double]] = v0.p0
    var v9: Vector[Vector[Double]] = v2
    val v13: Vector[Vector[Double]] = v6.p1
    val v16: Vector[Double] = v5(0)
    val v19: Vector[Vector[Double]] = v0.p0
    val v25: Vector[Vector[Double]] = v4.p0
    val v15: Double = v7(0)
    v9 = v9.updated(1, v16)
    v5 = v5.updated(1, v7)
    var v21: s0 = v6
    v21 = v21.copy(p1 = v9)
    val v14: Vector[Vector[Double]] = v4.p0
    val v43: Vector[Vector[Double]] = v6.p1
    var v35: s0 = v6
    val v22: Vector[Vector[Double]] = v6.p0
    val v24: Vector[Vector[Vector[Double]]] = Vector(v29, v25, v1, v29, v1, v8)
    var v56: Vector[Vector[Vector[Double]]] = v24
    val v30: Vector[Vector[Double]] = v56(3)
    val v18: Vector[Vector[Double]] = v35.p1
    val v49: Vector[Vector[Vector[Vector[Double]]]] = Vector(v56, v56, v24, v56)
    var v45: Vector[Double] = v16
    v9 = v9.updated(0, v45)
    v56 = v56.updated(3, v14)
    v56 = v56.updated(1, v22)
    val v46: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p0 = v18)
    var v44: Vector[Vector[Double]] = v8
    v9 = v9.updated(1, v7)
    v45 = v45.updated(0, v15)
    v21 = v21.copy(p0 = v30)
    val v41: Vector[Vector[Vector[Double]]] = v49(2)
    v35 = v35.copy(p1 = v18)
    var v33: Vector[Vector[Vector[Double]]] = v24
    var v51: Vector[Vector[Vector[Vector[Double]]]] = v49
    v4 = v4.copy(p0 = v19)
    val v40: Vector[Vector[Double]] = v6.p0
    val v32: Vector[Vector[Double]] = v35.p0
    v33 = v41
    val v76: Vector[Vector[Vector[Double]]] = v51(3)
    v4 = v4.copy(p0 = v32)
    v4 = v4.copy(p1 = v46)
    v4 = v4.copy(p0 = v40)
    v35 = v35.copy(p1 = v14)
    v21 = v21.copy(p0 = v18)
    v35 = v35.copy(p1 = v44)
    v9 = v9.updated(0, v45)
    v45 = v45.updated(0, v15)
    val v55: s0 = s0(v25, v3)
    v4 = v4.copy(p1 = v43)
    v33 = v33.updated(4, v13)
    val v102: Vector[Vector[Double]] = v0.p1
    val v65: Vector[Vector[Double]] = v76(2)
    var v94: Vector[Vector[Vector[Double]]] = v33
    val v143: Vector[Vector[Double]] = v21.p0
    val v210: s0 = s0(v143, v65)
    v4 = v4.copy(p1 = v102)
    v35 = v55
    v51 = v51.updated(2, v94)
    v210
  }
  def f69(v0: s1): s1 = {
    val v7: Vector[s0] = v0.p1
    val v2: s0 = v7(0)
    val v3: Vector[s0] = Vector(v2, v2, v2, v2, v2)
    val v5: Vector[s0] = v0.p1
    val v12: s0 = v3(1)
    val v50: s1 = s1(v12, v5)
    val v142: Vector[s1] = Vector(v50)
    var v96: Vector[s1] = v142
    val v136: s1 = v96(0)
    v136
  }
  def f49(v0: s2, v1: s0, v2: s0): s0 = {
    val v3: s0 = f70(v1)
    val v4: Vector[s0] = v0.p0
    var v6: s0 = v2
    val v13: Vector[Vector[Double]] = v6.p0
    var v7: Vector[s0] = v4
    val v11: s0 = v7(0)
    val v9: Vector[s0] = v0.p0
    var v29: s0 = v3
    val v14: s0 = v9(0)
    v7 = v7.updated(0, v6)
    var v12: Vector[Vector[Double]] = v13
    v29 = v29.copy(p0 = v12)
    val v28: Vector[Vector[Double]] = v3.p1
    val v36: Vector[Vector[Double]] = v14.p0
    val v21: s0 = f70(v11)
    val v57: Vector[Vector[Double]] = v21.p1
    val v19: s0 = v4(0)
    v29 = v29.copy(p1 = v57)
    var v47: s0 = v29
    var v49: Vector[Vector[Double]] = v28
    val v30: s0 = v9(0)
    v29 = v29.copy(p1 = v13)
    var v120: Vector[Vector[Double]] = v49
    v29 = v29.copy(p0 = v120)
    val v81: Vector[Vector[Double]] = v30.p1
    v29 = v29.copy(p1 = v57)
    v47 = v47.copy(p1 = v81)
    var v53: Vector[Vector[Double]] = v120
    v47 = v30
    v47 = v47.copy(p1 = v36)
    v7 = v7.updated(0, v19)
    val v84: Vector[Double] = v120(1)
    v29 = v29.copy(p1 = v53)
    v29 = v29.copy(p0 = v81)
    val v80: Vector[Vector[Double]] = v1.p1
    v29 = v29.copy(p1 = v80)
    v29 = v29.copy(p0 = v57)
    var v104: Vector[Double] = v84
    v120 = v120.updated(0, v84)
    v49 = v49.updated(0, v104)
    v47
  }
  def f46(v0: s2): s2 = {
    val v7: Vector[Vector[s1]] = v0.p1
    val v5: Vector[s0] = v0.p0
    val v2: Vector[s0] = v0.p0
    val v8: Vector[s1] = v0.p3
    val v4: s1 = v8(0)
    val v14: s1 = f69(v4)
    var v10: Vector[s1] = v8
    val v11: s2 = f72(v0)
    val v26: s1 = v10(0)
    v10 = v10.updated(1, v26)
    val v30: Vector[s1] = v7(0)
    val v18: s1 = f69(v26)
    var v16: s2 = v0
    val v17: s2 = f72(v16)
    v16 = v16.copy(p1 = v7)
    v16 = v16.copy(p2 = v18)
    val v24: s1 = v30(0)
    val v21: s0 = v14.p0
    val v23: Vector[s1] = v17.p3
    v10 = v10.updated(0, v4)
    v16 = v16.copy(p2 = v24)
    val v29: Vector[s0] = v11.p0
    val v44: s2 = f79(v17)
    v10 = v10.updated(0, v24)
    v16 = v16.copy(p0 = v29)
    var v36: Vector[s0] = v2
    val v35: s0 = v5(0)
    val v34: s0 = f49(v0, v21, v35)
    v16 = v16.copy(p0 = v2)
    v16 = v16.copy(p0 = v36)
    v16 = v16.copy(p3 = v10)
    v36 = v36.updated(0, v34)
    val v146: s2 = f72(v44)
    v16 = v16.copy(p3 = v10)
    v16 = v16.copy(p1 = v7)
    v16 = v16.copy(p3 = v23)
    v146
  }
  @noinline
  def f0(v0: s1, v1: Vector[s2], v2: Double): Double = {
    val v5: s0 = v0.p0
    var v4: Vector[s2] = v1
    val v9: s2 = v1(2)
    val v7: s2 = f46(v9)
    val v13: s2 = v4(2)
    var v11: s0 = v5
    val v19: s2 = v1(1)
    v4 = v4.updated(1, v13)
    val v15: s1 = v13.p2
    val v40: Vector[Vector[Double]] = v11.p0
    v11 = v11.copy(p1 = v40)
    val v10: Vector[Double] = v40(1)
    v11 = v11.copy(p1 = v40)
    val v26: Double = v10(0)
    v11 = v11.copy(p0 = v40)
    val v29: Vector[Vector[Double]] = v5.p0
    v4 = v4.updated(0, v19)
    v11 = v11.copy(p0 = v40)
    v4 = v4.updated(1, v13)
    v4 = v4.updated(2, v7)
    val v30: s0 = v15.p0
    val v148: Vector[Vector[Double]] = v30.p1
    v11 = v11.copy(p1 = v40)
    v11 = v11.copy(p0 = v29)
    v11 = v11.copy(p1 = v148)
    v11 = v11.copy(p0 = v148)
    v26
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))))), Vector(s1(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))))), s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))))), s2(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))), Vector(Vector(s1(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))))))), s1(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), Vector(s1(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0))), Vector(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))))), s1(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0))))))), s2(Vector(s0(Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))), Vector(Vector(s1(s0(Vector(Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), Vector(s0(Vector(Vector(160.0), Vector(161.0)), Vector(Vector(162.0), Vector(163.0))), s0(Vector(Vector(164.0), Vector(165.0)), Vector(Vector(166.0), Vector(167.0))), s0(Vector(Vector(168.0), Vector(169.0)), Vector(Vector(170.0), Vector(171.0))))))), s1(s0(Vector(Vector(172.0), Vector(173.0)), Vector(Vector(174.0), Vector(175.0))), Vector(s0(Vector(Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0)), Vector(Vector(182.0), Vector(183.0))), s0(Vector(Vector(184.0), Vector(185.0)), Vector(Vector(186.0), Vector(187.0))))), Vector(s1(s0(Vector(Vector(188.0), Vector(189.0)), Vector(Vector(190.0), Vector(191.0))), Vector(s0(Vector(Vector(192.0), Vector(193.0)), Vector(Vector(194.0), Vector(195.0))), s0(Vector(Vector(196.0), Vector(197.0)), Vector(Vector(198.0), Vector(199.0))), s0(Vector(Vector(200.0), Vector(201.0)), Vector(Vector(202.0), Vector(203.0))))), s1(s0(Vector(Vector(204.0), Vector(205.0)), Vector(Vector(206.0), Vector(207.0))), Vector(s0(Vector(Vector(208.0), Vector(209.0)), Vector(Vector(210.0), Vector(211.0))), s0(Vector(Vector(212.0), Vector(213.0)), Vector(Vector(214.0), Vector(215.0))), s0(Vector(Vector(216.0), Vector(217.0)), Vector(Vector(218.0), Vector(219.0))))))))
    val v2: Double = 220.0
    val start = nanoTime()
    var result: Double = 220.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}