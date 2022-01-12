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
    p1: Vector[Vector[s1]],
    p2: Vector[s0]
  )
  case class s11 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  def f85(v0: s2): s2 = {
    var v4: s2 = v0
    val v3: s0 = v0.p0
    var v7: s0 = v3
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p0 = v7)
    v4 = v0
    v4 = v0
    val v9: Vector[Vector[Double]] = v7.p0
    var v1: s0 = v7
    var v2: s2 = v0
    val v6: Vector[Double] = v9(0)
    var v18: Vector[Double] = v6
    v4 = v4.copy(p0 = v1)
    val v35: Vector[Vector[Double]] = Vector(v6)
    val v19: Vector[Vector[Double]] = v1.p1
    var v27: Vector[Vector[Double]] = v19
    val v16: Vector[Double] = v35(0)
    val v24: Double = v16(0)
    val v44: Vector[Double] = v19(0)
    v2 = v2.copy(p0 = v7)
    val v20: Vector[Vector[s1]] = v2.p1
    v27 = v27.updated(0, v18)
    var v41: Vector[Vector[s1]] = v20
    val v23: Vector[s0] = v4.p2
    var v105: s2 = v2
    v105 = v105.copy(p2 = v23)
    v2 = v2.copy(p2 = v23)
    var v70: s0 = v1
    val v28: Vector[Vector[Double]] = v70.p0
    v1 = v1.copy(p1 = v27)
    v2 = v2.copy(p1 = v41)
    val v66: s0 = v23(0)
    v27 = v27.updated(0, v44)
    v18 = v18.updated(0, v24)
    val v67: Vector[Vector[s1]] = v2.p1
    v27 = v27.updated(0, v44)
    v7 = v7.copy(p0 = v28)
    v2 = v2.copy(p1 = v67)
    v2 = v2.copy(p0 = v66)
    v105
  }
  def f79(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p1
    var v8: s1 = v0
    v8 = v8.copy(p1 = v6)
    val v7: s0 = v8.p0
    val v3: Vector[Vector[Double]] = v7.p0
    var v1: s0 = v7
    v1 = v1.copy(p0 = v3)
    val v13: Vector[Vector[Double]] = v1.p0
    var v2: Vector[Vector[Double]] = v13
    v2 = v3
    var v12: Vector[s0] = v6
    v12 = v12.updated(2, v7)
    val v14: Vector[Double] = v13(0)
    val v10: s0 = v12(1)
    var v18: Vector[s0] = v6
    var v20: s1 = v8
    var v36: Vector[Double] = v14
    val v21: s0 = v18(1)
    val v17: Vector[s0] = v20.p1
    val v26: s0 = v6(1)
    v8 = v8.copy(p0 = v1)
    v20 = v20.copy(p1 = v18)
    v1 = v1.copy(p0 = v2)
    val v31: s1 = s1(v21, v17)
    val v46: Double = v36(0)
    v18 = v18.updated(1, v26)
    v2 = v2.updated(1, v36)
    v8 = v8.copy(p0 = v10)
    val v43: Double = v46 - v46
    var v32: s1 = v31
    val v84: Double = v46 * v43
    v32 = v32.copy(p0 = v21)
    v36 = v36.updated(0, v84)
    v32
  }
  def f68(v0: s2, v1: s1): s1 = {
    val v4: Vector[Vector[s1]] = v0.p1
    var v7: s2 = v0
    val v22: s2 = f85(v7)
    var v8: s2 = v0
    v8 = v8.copy(p1 = v4)
    val v26: s0 = v8.p0
    v8 = v8.copy(p1 = v4)
    val v28: Vector[Vector[Double]] = v26.p1
    var v54: s0 = v26
    val v38: Vector[Vector[Double]] = v54.p0
    val v84: Vector[s0] = v1.p1
    val v69: s1 = s1(v54, v84)
    v8 = v22
    v54 = v54.copy(p1 = v28)
    val v98: Vector[Vector[Double]] = v26.p1
    v54 = v54.copy(p0 = v38)
    v54 = v54.copy(p0 = v38)
    v54 = v54.copy(p1 = v98)
    v69
  }
  def f21(v0: s2): s2 = {
    val v1: Vector[s0] = v0.p2
    val v6: s0 = v1(0)
    val v4: s0 = v1(0)
    val v19: s2 = f85(v0)
    val v9: Vector[s0] = v19.p2
    val v18: s2 = f85(v19)
    val v13: s2 = f85(v19)
    var v14: s2 = v19
    val v30: Vector[s0] = v19.p2
    val v15: Vector[s0] = v18.p2
    v14 = v14.copy(p2 = v1)
    val v51: s2 = f85(v14)
    val v16: s0 = v9(0)
    v14 = v14.copy(p2 = v1)
    v14 = v14.copy(p0 = v4)
    v14 = v14.copy(p0 = v6)
    v14 = v14.copy(p2 = v1)
    val v27: Vector[s0] = v19.p2
    v14 = v14.copy(p0 = v4)
    v14 = v14.copy(p0 = v4)
    val v44: Vector[Vector[s1]] = v13.p1
    v14 = v14.copy(p0 = v6)
    v14 = v18
    var v76: Vector[Vector[s1]] = v44
    val v38: s11 = s11(v14, v76)
    val v58: s2 = f85(v51)
    val v42: s0 = v27(0)
    var v50: s2 = v58
    v50 = v50.copy(p2 = v15)
    v14 = v14.copy(p0 = v42)
    v14 = v14.copy(p0 = v16)
    val v177: Vector[Vector[s1]] = v38.p1
    v50 = v50.copy(p1 = v177)
    v50 = v50.copy(p2 = v30)
    v50
  }
  def f16(v0: s11, v1: Vector[s1]): Vector[s1] = {
    val v8: Vector[Vector[s1]] = v0.p1
    var v72: Vector[Vector[s1]] = v8
    val v156: Vector[s1] = v72(0)
    v156
  }
  def f14(v0: s2, v1: s1, v2: s11): s1 = {
    var v4: s2 = v0
    var v7: s1 = v1
    var v3: s1 = v7
    var v9: s2 = v0
    val v16: s2 = f85(v4)
    val v18: s0 = v3.p0
    v4 = v4.copy(p0 = v18)
    val v12: s2 = v2.p0
    val v20: s2 = f21(v9)
    val v43: s1 = f68(v20, v3)
    val v112: s1 = f68(v12, v43)
    val v106: s1 = f68(v16, v112)
    v106
  }
  def f6(v0: s2, v1: s11): s11 = {
    var v2: s11 = v1
    v2 = v2.copy(p0 = v0)
    val v3: s2 = f21(v0)
    var v6: s2 = v0
    val v7: Vector[Vector[s1]] = v1.p1
    val v5: Vector[s1] = v7(0)
    var v18: s11 = v2
    v6 = v6.copy(p1 = v7)
    v6 = v6.copy(p1 = v7)
    val v4: Vector[s1] = v7(0)
    val v8: Vector[Vector[s1]] = v1.p1
    var v9: s11 = v18
    val v12: s1 = v4(0)
    val v15: Vector[s1] = v7(0)
    val v14: Vector[s1] = v8(0)
    v2 = v2.copy(p0 = v0)
    val v11: s2 = f21(v6)
    val v20: s1 = f68(v11, v12)
    val v25: s1 = f14(v0, v20, v9)
    var v13: Vector[Vector[s1]] = v7
    val v34: s1 = f79(v25)
    v18 = v18.copy(p1 = v13)
    val v31: s11 = s11(v3, v7)
    val v35: s0 = v34.p0
    val v41: Vector[s1] = f16(v31, v15)
    var v27: s0 = v35
    val v36: Vector[s0] = v25.p1
    v13 = v13.updated(0, v5)
    v6 = v6.copy(p0 = v27)
    v2 = v2.copy(p0 = v3)
    v13 = v13.updated(0, v14)
    val v102: s2 = f85(v0)
    val v49: s0 = v36(2)
    val v51: s2 = v1.p0
    v2 = v18
    var v40: s2 = v102
    v13 = v13.updated(0, v41)
    val v78: s0 = v36(0)
    v40 = v40.copy(p0 = v78)
    val v131: s2 = f85(v11)
    val v67: Vector[s2] = Vector(v51, v102, v3, v131, v40, v6, v51)
    val v62: s2 = v67(6)
    val v128: s11 = s11(v62, v13)
    val v91: s2 = v1.p0
    val v227: s2 = f21(v91)
    val v266: s2 = v67(1)
    v18 = v18.copy(p0 = v227)
    val v155: Vector[Vector[Double]] = v49.p1
    v27 = v27.copy(p1 = v155)
    v9 = v9.copy(p0 = v266)
    v128
  }
  @noinline
  def f0(v0: Vector[s11], v1: Double): Double = {
    var v4: Vector[s11] = v0
    val v2: s11 = v0(2)
    val v11: s11 = v4(0)
    v4 = v4.updated(2, v2)
    val v13: s11 = v4(2)
    val v15: s2 = v11.p0
    val v23: s11 = f6(v15, v2)
    val v24: s2 = f85(v15)
    v4 = v4.updated(1, v23)
    val v43: s11 = v4(0)
    val v42: s0 = v24.p0
    v4 = v4.updated(0, v13)
    v4 = v4.updated(2, v13)
    val v35: Vector[Vector[Double]] = v42.p1
    val v73: Vector[Double] = v35(0)
    val v103: Double = v73(0)
    v4 = v4.updated(1, v43)
    v103
  }
  def benchmark(): Unit = {
    val v0: Vector[s11] = Vector(s11(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(Vector(s1(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))))))), s11(s2(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), Vector(Vector(s1(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))), Vector(Vector(s1(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))))))), s11(s2(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), Vector(Vector(s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))))))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))), Vector(Vector(s1(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}