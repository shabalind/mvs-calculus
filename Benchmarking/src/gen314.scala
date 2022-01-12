import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]],
    p2: s0,
    p3: s0
  )
  case class s3 (
    p0: s0,
    p1: Vector[s0],
    p2: s2,
    p3: s0
  )
  def f64(v0: s3): s3 = {
    val v7: s0 = v0.p0
    var v3: s0 = v7
    var v4: s3 = v0
    val v6: Vector[s0] = v0.p1
    val v1: Vector[Vector[Double]] = v7.p0
    v4 = v4.copy(p3 = v7)
    var v5: Vector[Vector[Double]] = v1
    v3 = v3.copy(p0 = v5)
    val v9: Vector[Double] = v1(0)
    v5 = v5.updated(0, v9)
    val v12: s2 = v4.p2
    v5 = v1
    val v2: Vector[Vector[Double]] = v7.p1
    val v13: s3 = s3(v3, v6, v12, v7)
    v4 = v4.copy(p2 = v12)
    v5 = v5.updated(0, v9)
    v5 = v5.updated(0, v9)
    val v15: s0 = v6(0)
    val v22: Vector[Double] = v2(1)
    val v34: s2 = v0.p2
    val v21: s0 = v34.p2
    v5 = v5.updated(0, v22)
    val v25: Vector[Double] = v5(0)
    val v53: Vector[Vector[Double]] = v15.p1
    var v36: Vector[Vector[Double]] = v53
    v5 = v5.updated(0, v25)
    var v63: Vector[Vector[Double]] = v2
    val v24: Vector[Vector[Double]] = v21.p0
    val v39: Vector[Double] = v24(0)
    v5 = v5.updated(0, v22)
    var v55: Vector[Double] = v25
    v3 = v3.copy(p1 = v63)
    v63 = v63.updated(0, v25)
    val v44: Double = v39(0)
    var v134: Vector[s0] = v6
    v4 = v4.copy(p1 = v134)
    v3 = v3.copy(p0 = v5)
    v63 = v63.updated(2, v55)
    val v116: Vector[Double] = v36(1)
    v5 = v5.updated(0, v116)
    v55 = v55.updated(0, v44)
    v4 = v4.copy(p1 = v6)
    v13
  }
  def f54(v0: s2): s2 = {
    var v8: s2 = v0
    v8
  }
  def f47(v0: s3): s3 = {
    var v3: s3 = v0
    var v8: s3 = v3
    val v5: s3 = f64(v3)
    val v2: s3 = f64(v8)
    val v6: s3 = f64(v2)
    val v9: s0 = v5.p0
    val v7: s3 = f64(v5)
    v8 = v8.copy(p0 = v9)
    var v11: s3 = v7
    val v21: s3 = f64(v11)
    v11 = v11.copy(p3 = v9)
    val v13: Vector[s0] = Vector(v9, v9, v9, v9)
    v8 = v8.copy(p0 = v9)
    v3 = v2
    val v15: s0 = v13(3)
    val v48: s3 = f64(v21)
    v3 = v3.copy(p0 = v15)
    v8 = v21
    val v87: s3 = f64(v5)
    val v35: s0 = v6.p3
    val v61: Vector[s0] = v87.p1
    v8 = v8.copy(p3 = v35)
    v3 = v3.copy(p1 = v61)
    v48
  }
  def f29(v0: s3, v1: s3): s3 = {
    val v2: s0 = v1.p0
    var v7: s3 = v1
    val v4: s3 = f64(v7)
    v7 = v7.copy(p0 = v2)
    val v6: s0 = v7.p3
    v7 = v7.copy(p3 = v6)
    var v49: s3 = v4
    v49
  }
  def f18(v0: s0): s0 = {
    var v1: s0 = v0
    var v7: s0 = v0
    var v4: s0 = v7
    val v5: Vector[Vector[Double]] = v7.p0
    val v2: Vector[Vector[Double]] = v7.p0
    val v6: Vector[Vector[Double]] = v1.p1
    var v8: s0 = v0
    var v14: Vector[Vector[Double]] = v6
    val v3: Vector[Vector[Double]] = v8.p0
    var v20: Vector[Vector[Double]] = v2
    val v15: Vector[Double] = v6(0)
    var v12: s0 = v8
    val v22: Vector[Double] = v14(2)
    var v16: Vector[Vector[Double]] = v6
    v7 = v7.copy(p0 = v2)
    val v46: Vector[Double] = v20(0)
    var v9: s0 = v12
    var v25: Vector[Vector[Double]] = v14
    val v28: Vector[Vector[Double]] = v9.p1
    v9 = v9.copy(p1 = v25)
    val v17: Vector[Double] = v14(2)
    v4 = v4.copy(p1 = v6)
    var v21: s0 = v9
    val v35: Vector[Vector[Double]] = v7.p0
    val v38: Vector[Vector[Double]] = v8.p0
    v4 = v4.copy(p0 = v2)
    var v10: s0 = v8
    val v19: Vector[Vector[Double]] = v9.p1
    val v41: Vector[Double] = v35(0)
    var v39: Vector[Double] = v17
    v16 = v16.updated(1, v41)
    v10 = v4
    var v47: Vector[Vector[Double]] = v38
    var v34: s0 = v21
    v25 = v25.updated(2, v41)
    v4 = v4.copy(p1 = v19)
    val v57: Vector[Vector[Double]] = v21.p0
    val v27: Vector[Double] = v3(0)
    val v69: Vector[Vector[Double]] = v8.p1
    v16 = v16.updated(2, v39)
    v16 = v16.updated(0, v27)
    var v65: Vector[Vector[Double]] = v25
    v8 = v8.copy(p0 = v5)
    v25 = v25.updated(2, v41)
    v34 = v34.copy(p1 = v16)
    v1 = v1.copy(p0 = v47)
    val v95: Vector[Vector[Double]] = v10.p1
    v4 = v4.copy(p0 = v57)
    val v85: Vector[Vector[Double]] = v8.p1
    var v98: Vector[Vector[Double]] = v28
    v7 = v7.copy(p0 = v5)
    val v54: Vector[Vector[Double]] = v34.p1
    v12 = v12.copy(p1 = v85)
    v16 = v16.updated(0, v15)
    v4 = v4.copy(p1 = v54)
    val v121: Vector[Double] = v95(0)
    v14 = v69
    v21 = v21.copy(p1 = v98)
    val v75: Vector[Double] = v38(0)
    v20 = v20.updated(0, v22)
    v14 = v14.updated(0, v27)
    v1 = v1.copy(p1 = v14)
    v14 = v14.updated(1, v121)
    val v133: Vector[Vector[Double]] = v10.p0
    v12 = v12.copy(p1 = v65)
    v47 = v47.updated(0, v75)
    v1 = v1.copy(p0 = v133)
    v12 = v12.copy(p0 = v47)
    v47 = v47.updated(0, v46)
    v34
  }
  def f9(v0: s0): s0 = {
    var v5: s0 = v0
    val v3: Vector[Vector[Double]] = v5.p0
    val v7: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v5.p1
    val v6: s0 = f18(v0)
    var v8: s0 = v6
    val v11: Vector[Vector[Double]] = v8.p0
    v8 = v5
    val v21: Vector[Vector[Double]] = v6.p0
    v8 = v8.copy(p0 = v3)
    val v14: s0 = f18(v8)
    val v20: Vector[Vector[Double]] = v0.p1
    val v34: Vector[Vector[Double]] = v6.p1
    var v15: Vector[Vector[Double]] = v11
    v8 = v8.copy(p1 = v34)
    val v17: Vector[Vector[Double]] = v14.p0
    v5 = v5.copy(p0 = v17)
    v5 = v5.copy(p0 = v11)
    v8 = v8.copy(p1 = v1)
    val v16: Vector[Vector[Double]] = v5.p0
    v5 = v5.copy(p0 = v15)
    var v19: s0 = v0
    val v23: Vector[Vector[Double]] = v6.p0
    v8 = v8.copy(p0 = v16)
    v5 = v5.copy(p1 = v20)
    val v45: Vector[Vector[Double]] = v6.p1
    var v28: Vector[Vector[Double]] = v11
    v19 = v19.copy(p0 = v21)
    val v49: Vector[Vector[Double]] = v19.p1
    val v57: s0 = s0(v15, v49)
    v8 = v8.copy(p1 = v45)
    v8 = v8.copy(p0 = v28)
    v5 = v5.copy(p1 = v1)
    v15 = v23
    v5 = v5.copy(p1 = v7)
    v57
  }
  def f7(v0: s0, v1: s0, v2: s0): s0 = {
    var v8: s0 = v2
    val v12: s0 = f9(v0)
    var v7: s0 = v2
    var v4: s0 = v1
    var v5: s0 = v8
    val v6: s0 = f9(v8)
    val v9: s0 = f9(v0)
    val v3: s0 = f18(v8)
    val v23: s0 = f18(v9)
    val v10: s0 = f9(v7)
    var v13: s0 = v0
    val v18: Vector[s0] = Vector(v2, v5, v13, v0, v3, v12, v8)
    var v17: Vector[s0] = v18
    val v47: Vector[Vector[Double]] = v4.p1
    v17 = v17.updated(1, v10)
    val v22: Vector[Vector[Double]] = v23.p0
    v17 = v17.updated(5, v5)
    v7 = v7.copy(p0 = v22)
    var v36: Vector[s0] = v18
    var v45: Vector[Vector[Double]] = v47
    v17 = v17.updated(0, v10)
    v5 = v5.copy(p0 = v22)
    v7 = v7.copy(p1 = v45)
    var v29: s0 = v1
    val v15: s0 = v36(3)
    val v38: Vector[Vector[Double]] = v23.p1
    val v37: s0 = v36(4)
    val v31: s0 = v17(6)
    v36 = v36.updated(3, v29)
    val v40: Vector[Vector[Double]] = v7.p1
    val v39: Vector[Vector[Double]] = v6.p0
    v5 = v5.copy(p1 = v47)
    val v51: s0 = f9(v8)
    val v48: Vector[Double] = v39(0)
    v7 = v7.copy(p0 = v22)
    val v30: Vector[Vector[Double]] = v37.p0
    val v102: s0 = v36(6)
    v17 = v17.updated(3, v23)
    var v50: s0 = v15
    val v61: Vector[Vector[Double]] = v4.p0
    val v140: Vector[Vector[Double]] = v3.p0
    val v91: s0 = f18(v50)
    val v75: Vector[Vector[Double]] = v51.p1
    v5 = v5.copy(p0 = v30)
    var v126: Vector[Vector[Double]] = v140
    var v77: Vector[Vector[Double]] = v126
    v5 = v5.copy(p0 = v61)
    val v120: Vector[Double] = v77(0)
    v50 = v50.copy(p0 = v39)
    v8 = v8.copy(p0 = v140)
    var v93: Vector[Double] = v120
    var v71: Vector[Vector[Double]] = v22
    v36 = v36.updated(2, v91)
    val v135: Vector[Double] = v75(0)
    val v168: Vector[Double] = v40(1)
    val v55: s0 = f18(v102)
    v45 = v45.updated(1, v48)
    v7 = v7.copy(p0 = v71)
    v29 = v29.copy(p1 = v38)
    val v150: Double = v135(0)
    v4 = v4.copy(p1 = v38)
    v8 = v8.copy(p1 = v47)
    v71 = v71.updated(0, v168)
    v4 = v55
    v93 = v93.updated(0, v150)
    v45 = v45.updated(0, v93)
    v31
  }
  def f5(v0: s3): s3 = {
    var v1: s3 = v0
    val v6: s3 = f47(v1)
    val v5: s3 = f64(v6)
    val v3: s0 = v5.p0
    val v2: Vector[s3] = Vector(v6, v6, v0, v6, v6)
    val v12: Vector[Vector[s3]] = Vector(v2, v2, v2)
    val v10: Vector[s3] = v12(2)
    val v4: s3 = v2(3)
    v1 = v4
    val v18: s3 = v2(2)
    val v14: s3 = f29(v5, v18)
    val v17: Vector[s0] = v4.p1
    var v31: Vector[s0] = v17
    val v27: Vector[s0] = v14.p1
    var v59: Vector[s3] = v10
    var v25: Vector[s3] = v59
    val v45: s0 = v31(1)
    v31 = v31.updated(1, v3)
    val v30: s0 = v31(0)
    val v73: s3 = v25(3)
    val v78: s0 = f9(v3)
    val v84: s2 = v0.p2
    v25 = v25.updated(1, v4)
    val v138: s3 = f64(v73)
    v1 = v138
    val v57: s3 = f29(v18, v138)
    var v69: Vector[s0] = v27
    val v77: s2 = v6.p2
    v1 = v1.copy(p3 = v30)
    val v144: s2 = f54(v84)
    v1 = v1.copy(p1 = v69)
    v1 = v1.copy(p2 = v77)
    v25 = v25.updated(1, v18)
    v1 = v1.copy(p2 = v144)
    v69 = v69.updated(0, v45)
    v1 = v1.copy(p3 = v78)
    val v129: s3 = f64(v57)
    v129
  }
  def f2(v0: s3): s3 = {
    var v7: s3 = v0
    var v1: s3 = v0
    val v6: s3 = f5(v7)
    val v3: Vector[s0] = v1.p1
    var v8: s3 = v6
    val v5: s3 = f47(v8)
    var v15: Vector[s0] = v3
    val v9: s0 = v15(1)
    val v14: s0 = v3(1)
    val v42: s0 = v0.p3
    val v24: s0 = f9(v9)
    val v28: s0 = f7(v42, v24, v14)
    val v34: s0 = f18(v28)
    v1 = v1.copy(p0 = v14)
    v1 = v5
    val v29: s3 = f47(v0)
    var v33: s3 = v29
    val v114: s2 = v5.p2
    v33 = v33.copy(p3 = v28)
    v1 = v1.copy(p2 = v114)
    v7 = v7.copy(p1 = v15)
    v7 = v7.copy(p0 = v34)
    v33
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v3: s3 = v0
    val v4: s3 = f2(v3)
    val v5: s0 = v3.p0
    var v6: s0 = v5
    v3 = v3.copy(p0 = v6)
    var v11: s0 = v6
    val v2: s2 = v4.p2
    val v7: Vector[Vector[Double]] = v6.p1
    val v13: Vector[Vector[Double]] = v6.p1
    var v10: Vector[Vector[Double]] = v7
    var v8: Vector[Vector[Double]] = v10
    v6 = v6.copy(p1 = v13)
    v6 = v6.copy(p1 = v10)
    val v27: Vector[Double] = v8(2)
    v10 = v10.updated(1, v27)
    val v14: s0 = v2.p3
    v10 = v10.updated(0, v27)
    val v38: Vector[Double] = v7(1)
    val v33: Double = v38(0)
    v3 = v3.copy(p3 = v14)
    v3 = v3.copy(p3 = v11)
    val v66: Double = v33 - v1
    v66
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}