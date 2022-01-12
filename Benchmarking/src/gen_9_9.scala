import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: s2,
    p1: s0
  )
  case class s5 (
    p0: s3,
    p1: Vector[s2]
  )
  def f59(v0: Vector[s2], v1: s5): s5 = {
    val v5: Vector[s2] = v1.p1
    val v3: s3 = v1.p0
    val v6: s5 = s5(v3, v5)
    val v2: Vector[Vector[s0]] = v3.p0
    val v7: s2 = v5(2)
    val v13: Vector[s0] = v2(1)
    val v9: Vector[s2] = v6.p1
    var v18: s2 = v7
    val v15: s0 = v13(0)
    val v16: s2 = v9(0)
    val v11: Vector[s2] = v1.p1
    val v21: Vector[Vector[s0]] = v3.p0
    v18 = v18.copy(p0 = v15)
    var v10: Vector[s0] = v13
    v18 = v18.copy(p1 = v15)
    var v28: s3 = v3
    val v25: s2 = v11(1)
    val v24: s0 = v25.p0
    var v22: Vector[s2] = v11
    var v33: s3 = v3
    v22 = v22.updated(2, v18)
    val v68: s0 = v25.p1
    var v47: Vector[Vector[s0]] = v21
    val v51: Vector[s0] = v3.p1
    var v35: Vector[s0] = v51
    v47 = v47.updated(0, v13)
    var v59: s5 = v1
    var v26: s3 = v33
    val v64: s0 = v7.p0
    v33 = v33.copy(p1 = v51)
    v35 = v35.updated(0, v64)
    v35 = v35.updated(0, v24)
    v10 = v10.updated(0, v15)
    val v42: s0 = v16.p0
    val v56: Vector[s0] = v26.p1
    var v58: Vector[s0] = v56
    v59 = v59.copy(p0 = v26)
    v26 = v26.copy(p0 = v47)
    val v67: Vector[Vector[s0]] = v33.p0
    v33 = v33.copy(p1 = v35)
    v59 = v59.copy(p0 = v28)
    val v48: s0 = v58(0)
    v28 = v28.copy(p1 = v35)
    v10 = v10.updated(0, v68)
    val v100: s0 = v18.p0
    v10 = v10.updated(0, v100)
    v59 = v59.copy(p1 = v22)
    v22 = v22.updated(2, v16)
    val v123: Vector[s2] = v59.p1
    v47 = v47.updated(1, v10)
    v35 = v35.updated(2, v42)
    v59 = v59.copy(p1 = v0)
    v35 = v35.updated(1, v48)
    v33 = v33.copy(p0 = v67)
    var v142: Vector[s0] = v51
    v35 = v35.updated(0, v100)
    v26 = v26.copy(p1 = v142)
    val v120: s0 = v7.p0
    v18 = v18.copy(p1 = v120)
    var v180: s5 = v59
    v180 = v180.copy(p1 = v123)
    v180
  }
  def f57(v0: s3): s3 = {
    var v1: s3 = v0
    val v4: Vector[s0] = v1.p1
    val v3: s0 = v4(0)
    val v7: s0 = v4(2)
    val v2: s0 = v4(0)
    val v6: s0 = v4(0)
    var v5: s3 = v1
    val v9: Vector[Vector[Double]] = v3.p0
    var v8: Vector[s0] = v4
    var v13: s0 = v3
    val v12: Vector[Vector[s0]] = v1.p0
    v8 = v8.updated(1, v2)
    v13 = v13.copy(p0 = v9)
    val v29: Vector[s0] = v12(1)
    v5 = v5.copy(p1 = v8)
    val v11: Vector[s0] = v5.p1
    val v10: s3 = s3(v12, v11)
    v5 = v5.copy(p1 = v11)
    v8 = v8.updated(2, v3)
    val v15: Vector[Vector[s0]] = v10.p0
    v1 = v1.copy(p1 = v8)
    var v34: Vector[s0] = v29
    val v17: Vector[s0] = v0.p1
    v1 = v1.copy(p0 = v15)
    var v37: Vector[s0] = v34
    val v23: Vector[s3] = Vector(v1, v0, v1, v0, v1, v0, v5)
    v8 = v8.updated(1, v7)
    val v18: s3 = v23(1)
    val v44: s3 = s3(v15, v11)
    v13 = v13.copy(p0 = v9)
    val v39: Vector[s0] = v15(0)
    val v27: s0 = v37(0)
    v1 = v1.copy(p1 = v4)
    var v28: Vector[s0] = v17
    v1 = v1.copy(p0 = v15)
    val v38: Vector[s0] = v15(1)
    var v43: Vector[Vector[s0]] = v12
    var v47: Vector[s0] = v39
    v43 = v43.updated(1, v38)
    val v94: Vector[s0] = v44.p1
    val v54: Vector[Vector[Double]] = v13.p2
    v34 = v34.updated(0, v13)
    val v46: s3 = v23(4)
    val v60: Vector[Vector[Double]] = v27.p0
    v28 = v28.updated(0, v27)
    v47 = v47.updated(0, v6)
    v43 = v43.updated(1, v34)
    v47 = v47.updated(0, v2)
    v13 = v13.copy(p0 = v60)
    v28 = v28.updated(1, v7)
    v37 = v37.updated(0, v3)
    val v78: Vector[Vector[s0]] = v44.p0
    val v63: Vector[s0] = v1.p1
    v1 = v1.copy(p0 = v78)
    val v71: s0 = v8(2)
    v5 = v5.copy(p1 = v63)
    var v114: s3 = v46
    v34 = v47
    v1 = v1.copy(p0 = v43)
    val v177: Vector[Vector[s0]] = v5.p0
    var v79: Vector[Vector[s0]] = v177
    v5 = v5.copy(p0 = v15)
    val v195: Vector[s0] = v114.p1
    val v110: Vector[s0] = v18.p1
    v13 = v13.copy(p2 = v54)
    val v83: Vector[Vector[s0]] = v10.p0
    v1 = v1.copy(p0 = v83)
    var v163: s3 = v1
    v114 = v114.copy(p0 = v78)
    v163 = v163.copy(p0 = v79)
    var v98: s3 = v163
    v98 = v98.copy(p1 = v195)
    v114 = v114.copy(p0 = v177)
    v98 = v98.copy(p1 = v28)
    v37 = v37.updated(0, v71)
    v8 = v110
    v43 = v43.updated(0, v39)
    v1 = v1.copy(p1 = v94)
    val v89: Vector[Vector[s0]] = v1.p0
    v163 = v163.copy(p0 = v89)
    v98
  }
  def f56(v0: s3): s3 = {
    val v4: Vector[Vector[s0]] = v0.p0
    val v3: Vector[s0] = v0.p1
    val v8: Vector[s0] = v0.p1
    var v24: s3 = v0
    v24 = v24.copy(p1 = v3)
    v24 = v24.copy(p0 = v4)
    val v43: s3 = f57(v24)
    v24 = v0
    val v26: s3 = f57(v43)
    v24 = v24.copy(p0 = v4)
    v24 = v24.copy(p1 = v8)
    v26
  }
  def f55(v0: s3): s3 = {
    val v1: Vector[s0] = v0.p1
    val v2: s3 = f57(v0)
    val v11: s0 = v1(2)
    val v3: Vector[Vector[s0]] = v0.p0
    val v15: Vector[s0] = v2.p1
    val v9: s3 = f57(v2)
    val v16: Vector[s0] = v9.p1
    var v18: Vector[s0] = v16
    var v37: Vector[s0] = v15
    v18 = v37
    v18 = v18.updated(2, v11)
    val v99: s3 = s3(v3, v18)
    v99
  }
  def f50(v0: Double): Double = {
    var v2: Double = v0
    var v6: Double = v0
    var v11: Double = v0
    var v4: Double = v6
    var v1: Double = v11
    var v14: Double = v4
    var v8: Double = v14
    val v18: Vector[Double] = Vector(v8, v11)
    var v17: Double = v14
    var v9: Vector[Double] = v18
    var v22: Double = v8
    v9 = v9.updated(0, v2)
    v9 = v9.updated(0, v17)
    var v15: Vector[Double] = v9
    v9 = v9.updated(0, v22)
    var v39: Double = v1
    v9 = v9.updated(1, v39)
    val v75: Double = v15(0)
    v75
  }
  def f42(v0: s2): s2 = {
    var v8: s2 = v0
    var v2: s2 = v8
    val v1: s0 = v0.p1
    v2 = v2.copy(p0 = v1)
    val v13: Vector[Double] = v1.p1
    val v15: s0 = v0.p1
    v2 = v2.copy(p0 = v1)
    var v23: s2 = v0
    var v56: s0 = v1
    v56 = v56.copy(p1 = v13)
    v8 = v2
    var v28: s2 = v2
    val v42: Vector[Double] = v56.p1
    v23 = v23.copy(p1 = v15)
    val v63: s0 = v28.p0
    v56 = v56.copy(p1 = v42)
    v8 = v23
    val v47: s2 = s2(v56, v63)
    v47
  }
  def f41(v0: Double, v1: s4): Double = {
    var v9: s4 = v1
    val v6: s2 = v9.p0
    val v5: s0 = v6.p1
    val v7: Vector[s4] = Vector(v1)
    val v12: s0 = v6.p0
    v9 = v9.copy(p1 = v5)
    val v13: s0 = v6.p1
    val v14: s4 = v7(0)
    val v18: s0 = v14.p1
    v9 = v9.copy(p1 = v13)
    v9 = v9.copy(p1 = v18)
    val v17: s2 = f42(v6)
    var v27: s2 = v17
    val v15: Vector[Vector[Double]] = v13.p0
    val v30: Vector[Double] = v15(1)
    v9 = v9.copy(p1 = v12)
    val v33: s0 = v27.p0
    val v43: Vector[s0] = Vector(v33, v13, v12, v13, v18, v5, v18)
    val v31: s0 = v43(2)
    v9 = v9.copy(p1 = v31)
    val v67: Double = v30(0)
    v27 = v27.copy(p0 = v31)
    v27 = v27.copy(p0 = v13)
    val v134: Double = f50(v67)
    v134
  }
  def f35(v0: s0): s0 = {
    val v6: s2 = s2(v0, v0)
    val v3: s0 = v6.p0
    var v2: s0 = v0
    var v12: s0 = v0
    val v17: Vector[Double] = v0.p1
    v2 = v2.copy(p1 = v17)
    val v21: Vector[Vector[Double]] = v3.p2
    v12 = v12.copy(p2 = v21)
    val v28: s1 = s1(v12, v2)
    val v37: Vector[Vector[Double]] = v3.p2
    v2 = v2.copy(p2 = v37)
    val v45: s0 = v28.p1
    val v24: s1 = s1(v12, v45)
    val v54: s0 = v24.p1
    v12 = v12.copy(p1 = v17)
    v12 = v12.copy(p2 = v21)
    v54
  }
  def f30(v0: s2): s2 = {
    var v4: s2 = v0
    val v3: Vector[s2] = Vector(v4, v0, v4, v4)
    val v6: s0 = v4.p1
    val v7: s2 = v3(3)
    v4 = v4.copy(p0 = v6)
    var v10: s0 = v6
    val v5: Vector[Vector[Double]] = v6.p0
    val v9: s2 = v3(0)
    val v2: s0 = v7.p1
    v10 = v10.copy(p0 = v5)
    val v13: s2 = f42(v7)
    val v14: s0 = v7.p0
    var v19: Vector[Vector[Double]] = v5
    val v17: s0 = v13.p0
    val v34: Vector[Vector[Double]] = v17.p2
    val v27: s0 = f35(v10)
    var v15: Vector[Vector[Double]] = v34
    val v28: Vector[Double] = v19(2)
    val v40: Vector[Double] = v6.p1
    val v26: s0 = v9.p1
    val v57: s0 = f35(v14)
    v15 = v15.updated(0, v28)
    val v46: Vector[Vector[Double]] = v2.p2
    val v103: Vector[Double] = v26.p1
    v4 = v4.copy(p0 = v27)
    val v54: s2 = f42(v9)
    v4 = v4.copy(p0 = v57)
    val v130: Vector[Double] = v46(0)
    v10 = v10.copy(p2 = v46)
    val v111: s0 = v54.p0
    var v60: Vector[Double] = v40
    v10 = v10.copy(p1 = v60)
    val v75: s0 = s0(v5, v103, v15)
    v4 = v4.copy(p1 = v111)
    v15 = v15.updated(0, v130)
    val v207: s4 = s4(v9, v75)
    val v446: s2 = v207.p0
    v446
  }
  def f26(v0: s5): s5 = {
    val v7: Vector[s2] = v0.p1
    val v5: s5 = f59(v7, v0)
    var v4: Vector[s2] = v7
    val v3: s2 = v7(0)
    val v1: s2 = v7(0)
    var v6: s5 = v5
    v4 = v4.updated(0, v1)
    val v11: Vector[Vector[s2]] = Vector(v7, v7, v7, v7)
    val v10: s2 = f30(v1)
    val v17: Vector[s2] = v11(3)
    v4 = v4.updated(0, v1)
    v6 = v6.copy(p1 = v7)
    v6 = v6.copy(p1 = v4)
    v6 = v6.copy(p1 = v4)
    v4 = v4.updated(1, v1)
    v4 = v17
    v4 = v4.updated(1, v1)
    val v18: s2 = f30(v10)
    var v14: Vector[s2] = v7
    v4 = v4.updated(0, v10)
    v4 = v4.updated(1, v3)
    val v33: Vector[s2] = v0.p1
    val v13: Vector[s2] = v11(2)
    val v42: Vector[s2] = v6.p1
    val v22: s0 = v18.p1
    var v19: s2 = v18
    v19 = v19.copy(p1 = v22)
    var v40: s5 = v6
    v6 = v6.copy(p1 = v14)
    v6 = v6.copy(p1 = v13)
    v4 = v42
    v4 = v4.updated(2, v19)
    val v39: s3 = v40.p0
    val v66: s3 = f55(v39)
    val v97: s3 = f56(v66)
    v40 = v40.copy(p1 = v33)
    val v37: s3 = f57(v66)
    v6 = v6.copy(p0 = v97)
    val v51: s5 = f59(v17, v40)
    v6 = v6.copy(p0 = v37)
    v14 = v14.updated(1, v1)
    v51
  }
  def f21(v0: s3): s3 = {
    val v7: s3 = f56(v0)
    val v4: s3 = f56(v7)
    val v10: Vector[Vector[s0]] = v0.p0
    var v23: s3 = v4
    v23 = v23.copy(p0 = v10)
    val v87: s3 = f56(v23)
    v23 = v23.copy(p0 = v10)
    v87
  }
  @noinline
  def f0(v0: s5, v1: Vector[Vector[s4]], v2: Double): Double = {
    val v4: s5 = f26(v0)
    val v12: s3 = v4.p0
    val v7: Vector[s4] = v1(2)
    val v13: Vector[s4] = v1(0)
    val v10: s3 = f21(v12)
    val v25: Vector[s4] = v1(0)
    var v15: Vector[Vector[s4]] = v1
    v15 = v15.updated(1, v13)
    val v9: Vector[s4] = v15(2)
    v15 = v15.updated(2, v9)
    v15 = v15.updated(2, v7)
    val v30: Vector[s0] = v10.p1
    val v38: s0 = v30(1)
    v15 = v15.updated(1, v25)
    val v59: Vector[Vector[Double]] = v38.p2
    v15 = v15.updated(1, v13)
    val v44: Vector[Double] = v59(0)
    v15 = v15.updated(2, v13)
    val v76: Double = v44(0)
    val v101: s4 = v9(0)
    val v133: Double = f41(v76, v101)
    v133
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s3(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(9.0, 10.0), Vector(Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(15.0, 16.0), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(21.0, 22.0), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0), Vector(Vector(29.0))))), Vector(s2(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(39.0, 40.0), Vector(Vector(41.0)))), s2(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(45.0, 46.0), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(51.0, 52.0), Vector(Vector(53.0)))), s2(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(57.0, 58.0), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0), Vector(Vector(65.0))))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s2(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(69.0, 70.0), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(75.0, 76.0), Vector(Vector(77.0)))), s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(81.0, 82.0), Vector(Vector(83.0))))), Vector(s4(s2(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(87.0, 88.0), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(93.0, 94.0), Vector(Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(99.0, 100.0), Vector(Vector(101.0))))), Vector(s4(s2(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(105.0, 106.0), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(111.0, 112.0), Vector(Vector(113.0)))), s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(117.0, 118.0), Vector(Vector(119.0))))))
    val v2: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}