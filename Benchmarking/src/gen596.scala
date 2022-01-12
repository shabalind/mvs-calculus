import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  def f89(v0: s1): s1 = {
    val v1: s0 = v0.p0
    var v6: s0 = v1
    var v5: s1 = v0
    val v3: s0 = v5.p0
    val v10: Vector[Vector[Double]] = v3.p0
    v6 = v6.copy(p1 = v10)
    v6 = v6.copy(p0 = v10)
    val v14: s0 = v0.p0
    v5 = v5.copy(p1 = v14)
    var v21: s1 = v0
    val v33: s0 = v21.p1
    var v146: s0 = v6
    val v68: s1 = s1(v33, v146)
    v68
  }
  def f84(v0: s3, v1: Vector[s2]): Vector[s2] = {
    val v2: s2 = v1(0)
    var v3: s2 = v2
    var v9: Vector[s2] = v1
    val v15: Vector[Vector[s0]] = v2.p1
    var v12: Vector[s2] = v9
    val v17: Vector[Vector[s0]] = v2.p1
    val v14: Vector[s2] = v0.p1
    var v21: Vector[s2] = v12
    var v24: Vector[s2] = v21
    v24 = v24.updated(0, v2)
    val v26: s2 = v14(0)
    v12 = v24
    v3 = v3.copy(p1 = v15)
    v12 = v12.updated(1, v26)
    v3 = v3.copy(p1 = v17)
    v21 = v1
    v9 = v9.updated(0, v3)
    v12
  }
  def f80(v0: s1): s1 = {
    val v2: s0 = v0.p1
    var v1: s0 = v2
    var v3: s0 = v2
    val v5: Vector[Vector[Double]] = v1.p2
    var v8: s1 = v0
    var v7: Vector[Vector[Double]] = v5
    val v6: Vector[Double] = v7(0)
    v7 = v7.updated(0, v6)
    val v11: s1 = f89(v8)
    val v10: s1 = s1(v2, v3)
    var v15: s1 = v11
    val v18: s1 = f89(v8)
    val v14: Vector[Vector[Double]] = v1.p1
    val v13: s0 = v18.p0
    val v22: s1 = f89(v10)
    var v27: s1 = v22
    val v24: s0 = v8.p1
    v3 = v3.copy(p1 = v14)
    val v36: Vector[Vector[Double]] = v24.p1
    v3 = v3.copy(p2 = v7)
    val v21: s0 = v11.p1
    val v26: s1 = f89(v0)
    v8 = v8.copy(p0 = v3)
    val v49: s1 = f89(v27)
    val v61: s0 = v26.p0
    val v56: Vector[Vector[Double]] = v13.p1
    val v176: s0 = v15.p0
    v15 = v15.copy(p0 = v1)
    val v64: s1 = f89(v49)
    val v77: s1 = f89(v11)
    v27 = v27.copy(p1 = v1)
    v15 = v77
    val v60: Vector[Double] = v7(0)
    v3 = v3.copy(p0 = v36)
    v27 = v27.copy(p1 = v21)
    v7 = v7.updated(0, v60)
    v8 = v8.copy(p1 = v61)
    v3 = v3.copy(p1 = v56)
    v27 = v27.copy(p1 = v176)
    v64
  }
  def f75(v0: s3): s3 = {
    var v2: s3 = v0
    val v29: Vector[s1] = v0.p0
    v2 = v2.copy(p0 = v29)
    var v47: s3 = v2
    v47
  }
  def f73(v0: s1): s1 = {
    var v7: s1 = v0
    val v5: s1 = f80(v7)
    val v6: s1 = f80(v7)
    val v9: s0 = v5.p1
    val v2: s1 = f80(v0)
    val v10: s0 = v6.p0
    val v12: s1 = f80(v2)
    val v8: s0 = v0.p0
    val v27: s1 = f89(v12)
    val v25: Vector[Vector[Double]] = v9.p3
    var v18: Vector[Vector[Double]] = v25
    v7 = v7.copy(p0 = v8)
    val v31: Vector[Double] = v18(0)
    val v52: s1 = f89(v27)
    val v103: Vector[Double] = v25(0)
    val v29: Vector[Vector[Double]] = v8.p2
    val v23: Double = v103(0)
    var v58: Vector[Double] = v31
    val v28: Vector[Double] = v18(1)
    val v21: Vector[Double] = v29(0)
    v18 = v18.updated(1, v58)
    val v44: Vector[Double] = v25(0)
    v58 = v58.updated(0, v23)
    var v50: s0 = v8
    val v32: Double = v28(0)
    v7 = v7.copy(p0 = v50)
    var v61: Vector[Vector[Double]] = v25
    v58 = v58.updated(0, v23)
    v58 = v58.updated(0, v32)
    val v53: Vector[Double] = v29(0)
    val v35: s0 = v5.p1
    var v36: Vector[Vector[Double]] = v61
    var v49: Vector[Vector[Double]] = v29
    val v34: Vector[Double] = v25(1)
    val v39: Vector[Double] = Vector(v23, v32, v32, v23, v23, v23)
    var v65: Vector[Double] = v39
    var v56: Double = v23
    v50 = v50.copy(p2 = v29)
    var v74: Vector[Double] = v39
    v18 = v18.updated(1, v44)
    v49 = v49.updated(0, v28)
    v7 = v7.copy(p0 = v9)
    v18 = v18.updated(1, v31)
    v49 = v49.updated(0, v53)
    val v59: s0 = v52.p0
    var v84: s0 = v59
    val v87: Vector[Vector[Double]] = v9.p3
    val v193: Double = v74(2)
    v50 = v50.copy(p2 = v49)
    v49 = v49.updated(0, v21)
    val v90: s1 = s1(v84, v9)
    v50 = v50.copy(p3 = v87)
    v84 = v84.copy(p3 = v25)
    val v166: Vector[Vector[Double]] = v50.p1
    v65 = v65.updated(0, v193)
    val v121: Double = v65(0)
    val v141: Vector[Double] = v166(1)
    val v85: Double = v65(4)
    v74 = v74.updated(1, v56)
    val v62: Double = v141(0)
    v7 = v7.copy(p0 = v10)
    val v106: Vector[Vector[Double]] = v35.p1
    v84 = v84.copy(p1 = v106)
    var v97: Double = v121
    v84 = v84.copy(p3 = v36)
    v58 = v34
    v58 = v58.updated(0, v97)
    v74 = v74.updated(1, v62)
    v58 = v58.updated(0, v85)
    v90
  }
  def f72(v0: s1, v1: s3): s1 = {
    var v5: s3 = v1
    val v2: Vector[s1] = v5.p0
    v5 = v5.copy(p0 = v2)
    v5 = v5.copy(p0 = v2)
    val v4: Vector[s1] = v5.p0
    val v33: s1 = v2(1)
    val v32: s3 = f75(v5)
    val v89: Vector[s2] = v32.p1
    val v24: s2 = v89(1)
    var v20: Vector[s2] = v89
    v20 = v20.updated(1, v24)
    val v44: Vector[s2] = f84(v5, v20)
    v5 = v5.copy(p1 = v44)
    var v42: s2 = v24
    v20 = v20.updated(0, v42)
    val v74: s1 = f89(v33)
    val v176: s1 = f73(v74)
    v5 = v5.copy(p0 = v4)
    v176
  }
  def f46(v0: s1): s1 = {
    val v7: s1 = f73(v0)
    val v4: s0 = v7.p1
    val v9: s1 = s1(v4, v4)
    val v20: s1 = f89(v9)
    val v41: s1 = f89(v20)
    val v40: s1 = f89(v41)
    val v82: s1 = f80(v40)
    var v122: s1 = v82
    v122
  }
  def f44(v0: Vector[s1]): Vector[s1] = {
    var v2: Vector[s1] = v0
    val v1: s1 = v0(1)
    v2 = v2.updated(0, v1)
    val v6: s0 = v1.p0
    var v3: s1 = v1
    val v5: s1 = v0(0)
    val v4: s1 = v2(1)
    val v10: s1 = f46(v3)
    v2 = v2.updated(1, v4)
    v3 = v3.copy(p1 = v6)
    v2 = v2.updated(1, v3)
    v3 = v3.copy(p1 = v6)
    var v11: Vector[s1] = v2
    val v25: s0 = v4.p1
    val v19: s1 = f73(v5)
    val v22: s1 = f89(v10)
    v3 = v3.copy(p0 = v25)
    val v68: s1 = f46(v5)
    v11 = v11.updated(1, v3)
    v2 = v2.updated(1, v22)
    val v50: s1 = v0(1)
    v2 = v2.updated(0, v50)
    v3 = v3.copy(p1 = v6)
    val v39: s0 = v68.p0
    v3 = v3.copy(p1 = v6)
    v2 = v2.updated(1, v19)
    var v47: Vector[s1] = v11
    v3 = v3.copy(p0 = v25)
    v3 = v3.copy(p0 = v39)
    v3 = v3.copy(p0 = v25)
    v11 = v2
    val v42: s1 = v2(1)
    v2 = v2.updated(1, v42)
    v3 = v3.copy(p0 = v6)
    v47
  }
  def f20(v0: Vector[s1], v1: s0, v2: s1): Vector[s1] = {
    var v19: Vector[s1] = v0
    v19
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v5: s3 = v0
    val v3: Vector[s2] = v0.p1
    val v9: Vector[s2] = v5.p1
    var v6: s3 = v5
    v5 = v5.copy(p1 = v3)
    val v2: s3 = f75(v0)
    val v11: Vector[s1] = v5.p0
    val v12: s1 = v11(0)
    v5 = v5.copy(p1 = v9)
    val v15: Vector[s1] = v6.p0
    val v16: s1 = v15(1)
    val v18: s1 = f72(v16, v6)
    val v23: s0 = v12.p1
    v6 = v2
    val v20: s1 = f72(v16, v2)
    val v44: Vector[s1] = v5.p0
    val v71: Vector[s1] = f44(v11)
    val v33: Vector[s1] = f20(v11, v23, v20)
    var v67: Vector[s1] = v44
    val v30: Vector[Vector[Double]] = v23.p3
    v67 = v67.updated(0, v12)
    v67 = v67.updated(0, v16)
    v5 = v5.copy(p0 = v67)
    v67 = v67.updated(1, v20)
    v67 = v67.updated(1, v18)
    val v73: Vector[Double] = v30(0)
    val v92: Double = v73(0)
    v67 = v67.updated(1, v16)
    v5 = v5.copy(p0 = v33)
    v5 = v5.copy(p0 = v71)
    val v98: s1 = f80(v18)
    v67 = v67.updated(0, v98)
    var v83: Double = v92
    v83
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), Vector(s2(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))))), s2(s1(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))), Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))))))
    val v1: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}