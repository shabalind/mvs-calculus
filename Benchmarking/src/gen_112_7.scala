import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s2
  )
  def f45(v0: s2): s2 = {
    val v5: Vector[s0] = v0.p1
    val v7: Vector[Vector[s1]] = v0.p0
    val v6: Vector[s0] = v0.p1
    val v2: s0 = v6(0)
    val v8: Vector[s1] = v7(0)
    var v11: s2 = v0
    var v13: Vector[s0] = v5
    var v10: s2 = v11
    val v17: Vector[Vector[Double]] = v2.p1
    v10 = v0
    var v15: Vector[s0] = v13
    v10 = v10.copy(p1 = v6)
    v10 = v10.copy(p1 = v15)
    var v19: s0 = v2
    val v27: s0 = v13(0)
    var v32: s0 = v27
    val v20: s1 = v8(0)
    val v26: Vector[Vector[Double]] = v27.p0
    val v21: Vector[Vector[s1]] = v0.p0
    v19 = v19.copy(p0 = v26)
    val v47: Vector[Vector[Double]] = v19.p0
    val v60: Vector[Vector[Double]] = v19.p1
    var v44: Vector[Vector[Double]] = v60
    v19 = v19.copy(p1 = v44)
    v13 = v15
    v32 = v32.copy(p0 = v47)
    val v56: s0 = v20.p1
    val v63: Vector[Vector[Double]] = v56.p1
    val v35: Vector[Double] = v17(2)
    v44 = v44.updated(1, v35)
    var v78: s2 = v10
    v10 = v10.copy(p0 = v21)
    v19 = v19.copy(p0 = v47)
    v19 = v19.copy(p1 = v63)
    v11 = v11.copy(p0 = v7)
    v15 = v15.updated(0, v32)
    v32 = v27
    v78
  }
  def f44(v0: Double, v1: s2): Double = {
    val v2: s2 = f45(v1)
    val v3: Vector[Vector[s1]] = v2.p0
    val v14: Vector[s1] = v3(2)
    val v40: s1 = v14(0)
    val v30: s0 = v40.p2
    val v56: Vector[Vector[Double]] = v30.p1
    val v60: Vector[Double] = v56(0)
    var v38: Vector[Double] = v60
    val v46: Double = v38(0)
    v46
  }
  def f41(v0: s2, v1: s1, v2: s0, v3: s1): s2 = {
    val v7: s2 = f45(v0)
    val v4: s2 = f45(v7)
    val v15: s2 = f45(v4)
    var v14: s2 = v15
    var v13: s0 = v2
    val v24: Vector[Vector[s1]] = v7.p0
    val v40: Vector[s0] = v14.p1
    var v37: Vector[s0] = v40
    var v49: Vector[s0] = v37
    v37 = v37.updated(0, v2)
    val v44: s2 = f45(v7)
    var v75: Vector[Vector[s1]] = v24
    v14 = v14.copy(p0 = v75)
    val v73: Vector[Vector[s1]] = v44.p0
    v49 = v49.updated(0, v13)
    var v64: Vector[Vector[s1]] = v73
    val v94: s2 = s2(v75, v49)
    val v116: Vector[s1] = v75(2)
    v64 = v64.updated(2, v116)
    v14 = v7
    v14 = v14.copy(p0 = v64)
    v94
  }
  def f27(v0: s2): s2 = {
    val v7: s2 = f45(v0)
    val v1: Vector[s0] = v0.p1
    val v6: Vector[Vector[s1]] = v7.p0
    val v4: s2 = f45(v7)
    val v11: s2 = f45(v0)
    val v14: Vector[Vector[s1]] = v4.p0
    val v13: s0 = v1(0)
    val v15: Vector[s1] = v6(1)
    val v18: s1 = v15(0)
    val v20: Vector[Vector[s1]] = v11.p0
    val v19: Vector[s1] = v20(0)
    var v40: s2 = v11
    v40 = v40.copy(p0 = v6)
    v40 = v40.copy(p0 = v14)
    val v62: s0 = v1(0)
    var v71: s1 = v18
    val v46: s1 = v19(0)
    v71 = v71.copy(p1 = v62)
    val v48: s2 = f41(v40, v71, v13, v46)
    v48
  }
  def f4(v0: s4): s4 = {
    var v5: s4 = v0
    val v1: s2 = v5.p1
    v5 = v5.copy(p1 = v1)
    v5 = v5.copy(p1 = v1)
    v5 = v5.copy(p1 = v1)
    val v2: s4 = s4(v1, v1)
    v5 = v2
    var v13: s4 = v0
    val v9: s2 = f27(v1)
    v5 = v5.copy(p0 = v1)
    var v11: s2 = v9
    val v19: Vector[s0] = v9.p1
    var v16: s2 = v11
    val v14: s2 = f27(v16)
    v5 = v5.copy(p0 = v14)
    val v47: s2 = f27(v16)
    var v51: s2 = v16
    val v28: s2 = f45(v51)
    val v72: s2 = v13.p1
    v13 = v2
    val v42: s4 = s4(v51, v47)
    v16 = v16.copy(p1 = v19)
    v5 = v5.copy(p0 = v28)
    v5 = v5.copy(p0 = v72)
    v5 = v5.copy(p1 = v72)
    v42
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v2: s2 = v0.p0
    var v5: s4 = v0
    val v11: s2 = f45(v2)
    var v9: s2 = v2
    val v10: Vector[Vector[s1]] = v2.p0
    val v17: Vector[s1] = v10(1)
    val v4: Vector[s0] = v11.p1
    v9 = v9.copy(p0 = v10)
    val v12: Vector[s0] = v11.p1
    val v21: s2 = f45(v9)
    val v15: s1 = v17(0)
    v9 = v9.copy(p0 = v10)
    v9 = v9.copy(p1 = v12)
    val v16: s2 = v5.p1
    val v36: s4 = s4(v16, v11)
    val v31: s2 = s2(v10, v4)
    val v49: s4 = f4(v36)
    v9 = v31
    val v32: s0 = v15.p1
    val v35: s2 = v49.p0
    val v52: Vector[Vector[Double]] = v32.p0
    v5 = v5.copy(p1 = v31)
    v9 = v9.copy(p0 = v10)
    val v93: Vector[Double] = v52(0)
    v5 = v5.copy(p1 = v2)
    val v81: Double = v93(0)
    val v102: Double = f44(v81, v35)
    v5 = v5.copy(p0 = v21)
    v9 = v31
    v102
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))), Vector(s1(Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))), Vector(s1(Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s2(Vector(Vector(s1(Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))), Vector(s1(Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0))), s0(Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0), Vector(129.0))))), Vector(s1(Vector(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0), Vector(144.0)))), s0(Vector(Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0), Vector(154.0)))))), Vector(s0(Vector(Vector(155.0), Vector(156.0)), Vector(Vector(157.0), Vector(158.0), Vector(159.0))))))
    val v1: Double = 160.0
    val start = nanoTime()
    var result: Double = 160.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}