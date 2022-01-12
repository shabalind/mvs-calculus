import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[Double]
  )
  case class s4 (
    p0: Vector[s0],
    p1: Vector[s3]
  )
  case class s5 (
    p0: s3,
    p1: s2
  )
  case class s6 (
    p0: s3,
    p1: s2
  )
  case class s7 (
    p0: Vector[s6],
    p1: Vector[Vector[s3]]
  )
  case class s10 (
    p0: s4,
    p1: Vector[s1]
  )
  def f12(v0: Vector[s3]): Vector[s3] = {
    var v2: Vector[s3] = v0
    v2
  }
  def f11(v0: s4, v1: s2): s4 = {
    val v4: Vector[s0] = v0.p0
    val v11: s0 = v4(0)
    val v7: s0 = v4(0)
    val v15: s0 = v4(0)
    var v13: Vector[s0] = v4
    v13 = v4
    var v29: Vector[s0] = v4
    val v16: Vector[s3] = v0.p1
    val v34: Vector[s0] = v1.p0
    v13 = v13.updated(1, v7)
    v13 = v13.updated(0, v11)
    val v58: s0 = v34(0)
    v29 = v29.updated(1, v58)
    v29 = v29.updated(0, v15)
    val v78: s0 = v34(0)
    v29 = v29.updated(1, v78)
    val v41: Vector[s3] = f12(v16)
    var v82: s4 = v0
    var v62: s0 = v58
    val v59: s4 = s4(v29, v41)
    val v100: Vector[Vector[Double]] = v62.p1
    v29 = v29.updated(1, v62)
    val v123: Vector[s0] = v59.p0
    v82 = v82.copy(p0 = v13)
    v82 = v82.copy(p0 = v123)
    v62 = v62.copy(p1 = v100)
    v82
  }
  def f7(v0: s3): s3 = {
    val v5: Vector[Double] = v0.p1
    val v1: Vector[Double] = v0.p1
    var v3: s3 = v0
    val v7: Vector[Double] = v3.p1
    val v8: Vector[Double] = v3.p1
    val v10: s1 = v0.p0
    var v9: s1 = v10
    val v6: Vector[Double] = v0.p1
    var v16: s3 = v3
    val v13: Vector[Vector[s0]] = v9.p0
    v3 = v3.copy(p0 = v10)
    val v20: s1 = v16.p0
    val v17: Vector[s0] = v13(1)
    val v22: s0 = v17(0)
    var v35: Vector[Vector[s0]] = v13
    var v25: s1 = v9
    val v24: Vector[Vector[Double]] = v22.p1
    v9 = v9.copy(p0 = v13)
    v16 = v16.copy(p1 = v6)
    val v30: Vector[s0] = v35(0)
    v25 = v25.copy(p0 = v35)
    val v29: s3 = s3(v25, v1)
    var v69: s3 = v3
    var v43: Vector[Vector[Double]] = v24
    var v44: s0 = v22
    val v33: Vector[Double] = v29.p1
    val v34: Vector[s0] = v13(1)
    val v27: Vector[Vector[s0]] = v25.p0
    val v54: Vector[Vector[s0]] = v20.p1
    val v39: Vector[Vector[Double]] = Vector(v33, v7, v6, v8, v1)
    val v56: s2 = s2(v30, v44)
    v25 = v25.copy(p1 = v54)
    val v47: Vector[Double] = v39(1)
    v3 = v3.copy(p0 = v25)
    val v81: Vector[s0] = v27(0)
    var v37: Vector[Vector[Double]] = v39
    val v107: Vector[Double] = v37(1)
    v25 = v25.copy(p1 = v54)
    var v60: s0 = v22
    val v32: s6 = s6(v69, v56)
    var v75: Vector[Vector[s0]] = v27
    val v48: s2 = v32.p1
    val v65: Vector[s0] = v54(1)
    v35 = v35.updated(2, v65)
    v9 = v9.copy(p1 = v54)
    v37 = v37.updated(3, v47)
    var v71: s2 = v48
    v69 = v69.copy(p1 = v107)
    val v101: Vector[Vector[Vector[s0]]] = Vector(v75)
    v75 = v75.updated(0, v65)
    v44 = v44.copy(p1 = v43)
    val v82: Vector[Vector[s0]] = v101(0)
    val v120: Vector[Vector[Double]] = v60.p1
    v16 = v16.copy(p1 = v5)
    v69 = v69.copy(p1 = v5)
    v25 = v25.copy(p0 = v82)
    v71 = v71.copy(p0 = v30)
    val v317: s5 = s5(v69, v71)
    v75 = v75.updated(1, v34)
    v75 = v75.updated(2, v81)
    val v176: s3 = v317.p0
    v44 = v44.copy(p1 = v120)
    v176
  }
  def f6(v0: s2): s2 = {
    var v8: s2 = v0
    v8 = v0
    val v1: Vector[s0] = v0.p0
    val v3: s0 = v1(0)
    val v7: s0 = v1(0)
    val v10: Vector[s0] = v8.p0
    val v5: s0 = v10(0)
    val v6: Vector[Vector[Double]] = v7.p0
    val v30: Vector[s0] = v0.p0
    var v9: Vector[s0] = v30
    v9 = v9.updated(0, v3)
    var v13: s0 = v3
    val v16: Vector[Vector[Double]] = v5.p0
    var v11: Vector[s0] = v9
    val v14: s2 = s2(v9, v5)
    val v29: s0 = v11(0)
    val v12: s0 = v10(0)
    v11 = v11.updated(0, v12)
    val v34: Vector[Vector[Double]] = v12.p0
    val v18: s0 = v30(0)
    var v60: s0 = v13
    v9 = v9.updated(0, v60)
    var v38: s0 = v60
    v9 = v9.updated(0, v60)
    v13 = v13.copy(p0 = v6)
    val v44: Vector[Vector[Double]] = v12.p1
    v11 = v11.updated(0, v18)
    val v35: Vector[Vector[Double]] = v13.p0
    val v40: Vector[Double] = v34(1)
    val v26: Vector[Vector[Double]] = v29.p1
    var v46: Vector[Vector[Double]] = v26
    val v69: s0 = v14.p1
    v38 = v38.copy(p1 = v46)
    v9 = v9.updated(0, v38)
    var v86: s0 = v69
    v86 = v86.copy(p0 = v6)
    v9 = v9.updated(0, v86)
    v13 = v13.copy(p1 = v26)
    val v74: Vector[Vector[Double]] = v60.p0
    v13 = v13.copy(p0 = v35)
    v13 = v13.copy(p0 = v16)
    v13 = v13.copy(p0 = v74)
    v46 = v46.updated(0, v40)
    v13 = v13.copy(p1 = v44)
    v14
  }
  def f3(v0: s7): s7 = {
    var v7: s7 = v0
    var v5: s7 = v7
    val v2: Vector[s6] = v5.p0
    val v3: Vector[Vector[s3]] = v7.p1
    var v1: s7 = v7
    var v6: s7 = v7
    val v10: Vector[s3] = v3(0)
    var v33: Vector[Vector[s3]] = v3
    val v31: Vector[s6] = v6.p0
    v5 = v1
    v33 = v33.updated(0, v10)
    var v19: s7 = v6
    val v17: Vector[s3] = v33(0)
    v7 = v7.copy(p1 = v33)
    var v30: Vector[Vector[s3]] = v33
    v33 = v33.updated(0, v17)
    v19 = v19.copy(p1 = v30)
    v6 = v6.copy(p1 = v30)
    val v35: Vector[s3] = f12(v10)
    var v27: Vector[s6] = v2
    v33 = v33.updated(0, v35)
    v1 = v5
    v33 = v33.updated(0, v35)
    val v89: s6 = v27(0)
    v27 = v27.updated(0, v89)
    var v82: Vector[s6] = v27
    v30 = v30.updated(0, v35)
    v5 = v0
    v33 = v33.updated(0, v17)
    v27 = v31
    val v79: Vector[s7] = Vector(v19, v5, v1, v6)
    v19 = v19.copy(p0 = v82)
    val v56: s7 = v79(1)
    v56
  }
  @noinline
  def f0(v0: s2, v1: s7, v2: s10, v3: Double): Double = {
    var v4: Double = v3
    var v8: s10 = v2
    val v7: s2 = f6(v0)
    val v9: s4 = v8.p0
    val v6: s7 = f3(v1)
    var v13: s4 = v9
    val v14: s2 = f6(v0)
    val v17: s7 = f3(v6)
    var v15: s4 = v13
    val v18: Vector[Vector[s3]] = v17.p1
    val v21: Vector[s1] = v2.p1
    val v28: Vector[s3] = v18(0)
    val v29: Vector[s0] = v0.p0
    v8 = v2
    var v19: Vector[s0] = v29
    val v20: Vector[s3] = v18(0)
    val v16: Vector[s3] = f12(v28)
    var v25: Vector[s3] = v20
    val v42: Double = v4 * v4
    val v39: s4 = f11(v9, v14)
    val v51: s4 = f11(v13, v14)
    var v33: Double = v4
    v8 = v8.copy(p0 = v51)
    val v30: Vector[s0] = v7.p0
    val v41: s0 = v19(0)
    val v26: s10 = s10(v15, v21)
    val v22: s4 = v26.p0
    var v68: s4 = v39
    val v48: Vector[s0] = v22.p0
    val v43: Vector[s3] = v68.p1
    v15 = v15.copy(p1 = v16)
    val v53: s3 = v25(0)
    val v36: Vector[Vector[Double]] = v41.p1
    val v32: s3 = v20(0)
    var v54: s0 = v41
    val v34: Vector[Double] = v36(0)
    v13 = v13.copy(p1 = v43)
    var v58: Vector[Vector[Double]] = v36
    val v50: s3 = f7(v32)
    v58 = v58.updated(0, v34)
    v25 = v25.updated(0, v50)
    val v114: Vector[Vector[Double]] = v54.p0
    v13 = v13.copy(p0 = v48)
    val v86: Double = v42 * v33
    v25 = v25.updated(0, v53)
    var v52: Vector[s3] = v43
    v68 = v68.copy(p1 = v28)
    var v128: Vector[Double] = v34
    val v98: s3 = v52(0)
    v52 = v52.updated(0, v53)
    val v63: s0 = v30(0)
    var v120: Vector[Vector[Double]] = v58
    v15 = v15.copy(p0 = v48)
    v68 = v15
    var v118: Double = v86
    v68 = v68.copy(p0 = v48)
    var v97: Vector[Vector[Double]] = v114
    v15 = v15.copy(p0 = v48)
    v19 = v19.updated(0, v63)
    var v99: Vector[Double] = v128
    val v158: s0 = v29(0)
    v19 = v19.updated(0, v158)
    val v168: Vector[s0] = v15.p0
    v52 = v52.updated(0, v32)
    v52 = v52.updated(0, v98)
    val v136: Double = v99(0)
    val v153: s0 = v168(1)
    var v196: Double = v42
    val v293: Double = v118 - v196
    var v152: Vector[Vector[Double]] = v97
    val v124: Vector[s0] = v68.p0
    v19 = v19.updated(0, v153)
    v128 = v128.updated(0, v293)
    val v173: Vector[Double] = v152(1)
    v15 = v15.copy(p1 = v52)
    v54 = v54.copy(p1 = v120)
    v99 = v173
    v68 = v68.copy(p0 = v124)
    v136
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: s7 = s7(Vector(s6(s3(s1(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))), Vector(21.0, 22.0)), s2(Vector(s0(Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0)))), s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0))))), s6(s3(s1(Vector(Vector(s0(Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0))))), Vector(Vector(s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0)))), Vector(s0(Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))))), Vector(44.0, 45.0)), s2(Vector(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0)))), s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))), Vector(Vector(s3(s1(Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0))))), Vector(Vector(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)))))), Vector(67.0, 68.0)))))
    val v2: s10 = s10(s4(Vector(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))), Vector(s3(s1(Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)))), Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)))))), Vector(90.0, 91.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0)))), Vector(s0(Vector(Vector(98.0), Vector(99.0)), Vector(Vector(100.0))))), Vector(Vector(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))), Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0))))))))
    val v3: Double = 107.0
    val start = nanoTime()
    var result: Double = 107.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}