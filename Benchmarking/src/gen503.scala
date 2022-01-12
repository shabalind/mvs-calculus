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
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s2]
  )
  case class s6 (
    p0: s3,
    p1: s2
  )
  def f71(v0: s2): s2 = {
    var v6: s2 = v0
    val v5: Vector[s2] = Vector(v0)
    val v4: Vector[s1] = v0.p0
    val v3: Vector[s1] = v6.p0
    val v9: s3 = s3(v5, v5)
    val v1: s1 = v4(0)
    val v2: Vector[s2] = v9.p0
    val v11: s0 = v1.p0
    val v19: s2 = s2(v4, v11)
    var v8: s0 = v11
    var v23: s2 = v6
    var v25: s3 = v9
    v23 = v23.copy(p0 = v3)
    val v16: Vector[s1] = v23.p0
    val v10: Vector[Vector[Double]] = v11.p1
    v8 = v8.copy(p1 = v10)
    val v21: Vector[s2] = v25.p1
    v23 = v23.copy(p0 = v3)
    v6 = v6.copy(p1 = v8)
    var v41: Vector[s2] = v21
    v25 = v25.copy(p0 = v41)
    v6 = v23
    v41 = v41.updated(0, v6)
    v23 = v23.copy(p0 = v3)
    val v48: s2 = v2(0)
    v41 = v41.updated(0, v19)
    v25 = v25.copy(p1 = v2)
    v41 = v41.updated(0, v0)
    v41 = v41.updated(0, v23)
    v25 = v25.copy(p1 = v41)
    v41 = v41.updated(0, v48)
    var v30: s2 = v6
    v30 = v30.copy(p1 = v11)
    v41 = v41.updated(0, v23)
    v41 = v41.updated(0, v30)
    v41 = v41.updated(0, v6)
    v30 = v30.copy(p0 = v16)
    val v93: s2 = v41(0)
    v93
  }
  def f56(v0: Vector[s1]): Vector[s1] = {
    var v7: Vector[s1] = v0
    var v3: Vector[s1] = v7
    var v4: Vector[s1] = v0
    var v1: Vector[s1] = v3
    val v5: s1 = v7(0)
    var v2: s1 = v5
    var v9: s1 = v5
    val v8: s0 = v5.p0
    val v6: s1 = v7(0)
    val v15: s1 = v4(0)
    var v10: s1 = v6
    val v13: Vector[Vector[Double]] = v8.p1
    val v14: s0 = v6.p0
    val v12: s1 = v0(0)
    val v19: Vector[s0] = Vector(v8, v8)
    val v31: s0 = v19(1)
    var v27: Vector[s0] = v19
    val v25: s0 = v12.p0
    v9 = v9.copy(p0 = v25)
    val v16: s0 = v2.p0
    var v28: Vector[s1] = v4
    val v21: s0 = v15.p0
    v9 = v9.copy(p1 = v21)
    var v35: s1 = v2
    val v23: s0 = v27(1)
    val v46: s1 = v28(0)
    var v32: s1 = v12
    v9 = v9.copy(p0 = v25)
    val v33: Vector[Vector[Double]] = v31.p1
    var v30: Vector[s0] = v27
    val v52: s0 = s0(v33, v33)
    v28 = v28.updated(0, v2)
    v10 = v10.copy(p1 = v23)
    var v76: Vector[s1] = v1
    val v51: s0 = v30(0)
    val v54: s0 = v10.p1
    v7 = v7.updated(0, v10)
    var v37: Vector[s0] = v27
    var v26: s1 = v35
    v76 = v76.updated(0, v46)
    val v122: s0 = v9.p1
    val v60: Vector[Vector[Double]] = v16.p1
    v28 = v28.updated(0, v32)
    var v65: s0 = v54
    v35 = v35.copy(p1 = v31)
    v10 = v10.copy(p1 = v65)
    val v100: s0 = v5.p0
    v2 = v2.copy(p0 = v25)
    var v49: s1 = v9
    val v58: s1 = v3(0)
    var v73: Vector[s0] = v27
    var v41: Vector[s1] = v3
    v30 = v73
    val v90: s2 = s2(v4, v100)
    var v75: Vector[s0] = v37
    val v113: s2 = f71(v90)
    v30 = v30.updated(0, v16)
    v41 = v41.updated(0, v49)
    val v96: s2 = f71(v113)
    v7 = v7.updated(0, v49)
    v3 = v3.updated(0, v58)
    val v173: s0 = v26.p0
    v1 = v1.updated(0, v46)
    v41 = v4
    v3 = v3.updated(0, v10)
    val v253: s2 = f71(v96)
    v32 = v32.copy(p1 = v14)
    v2 = v2.copy(p0 = v14)
    val v69: Vector[Vector[Double]] = v173.p0
    val v125: s0 = s0(v13, v69)
    v32 = v32.copy(p0 = v122)
    v41 = v76
    v1 = v1.updated(0, v35)
    v26 = v26.copy(p1 = v54)
    v65 = v65.copy(p0 = v60)
    v3 = v3.updated(0, v12)
    v30 = v75
    v32 = v32.copy(p1 = v125)
    v10 = v10.copy(p1 = v51)
    val v206: s0 = v253.p1
    val v189: s0 = v75(1)
    var v163: s0 = v31
    v37 = v37.updated(1, v52)
    v10 = v10.copy(p1 = v163)
    v26 = v26.copy(p1 = v189)
    v10 = v10.copy(p0 = v122)
    v26 = v26.copy(p0 = v206)
    v75 = v73
    v41
  }
  def f44(v0: s2): s2 = {
    val v1: s0 = v0.p1
    val v7: Vector[Vector[Double]] = v1.p1
    val v3: Vector[Vector[Double]] = v1.p1
    var v8: Vector[Vector[Double]] = v3
    val v2: Vector[Double] = v3(0)
    val v6: Vector[Double] = v8(0)
    val v10: Vector[Double] = v7(0)
    v8 = v8.updated(0, v10)
    val v9: Vector[s1] = v0.p0
    v8 = v8.updated(0, v6)
    val v17: s2 = f71(v0)
    val v25: s2 = f71(v17)
    var v13: Vector[s1] = v9
    var v19: s2 = v0
    v19 = v19.copy(p0 = v9)
    v8 = v8.updated(0, v6)
    val v16: Vector[s1] = v17.p0
    val v20: Vector[Double] = v3(0)
    v8 = v8.updated(0, v6)
    v8 = v8.updated(0, v2)
    val v45: Vector[s1] = f56(v16)
    v8 = v8.updated(0, v20)
    val v32: s1 = v45(0)
    v19 = v19.copy(p0 = v9)
    v19 = v19.copy(p0 = v9)
    val v42: Vector[s1] = v25.p0
    val v59: s0 = v32.p0
    var v56: s0 = v59
    v56 = v56.copy(p1 = v8)
    v19 = v19.copy(p0 = v42)
    v56 = v56.copy(p0 = v8)
    v19 = v19.copy(p0 = v13)
    v19 = v19.copy(p1 = v1)
    var v140: Vector[Double] = v2
    var v86: s2 = v19
    v86 = v86.copy(p1 = v56)
    v8 = v8.updated(0, v140)
    v56 = v56.copy(p0 = v3)
    v86
  }
  def f27(v0: s6): s6 = {
    var v4: s6 = v0
    val v6: s3 = v0.p0
    val v3: Vector[s6] = Vector(v4, v4, v4, v0, v0)
    val v5: s6 = v3(3)
    val v1: Vector[s2] = v6.p1
    val v2: s2 = v1(0)
    var v9: s3 = v6
    val v12: s2 = f44(v2)
    val v37: s2 = f71(v2)
    var v20: Vector[s2] = v1
    v9 = v9.copy(p1 = v20)
    val v14: s2 = v20(0)
    val v26: s2 = f44(v2)
    val v28: s2 = f44(v26)
    val v73: s2 = v20(0)
    v20 = v20.updated(0, v14)
    v4 = v4.copy(p1 = v73)
    val v32: s2 = v20(0)
    val v23: s2 = f44(v28)
    var v25: s6 = v5
    v20 = v20.updated(0, v37)
    var v18: Vector[s2] = v1
    val v41: s2 = f71(v32)
    v9 = v9.copy(p1 = v18)
    v18 = v18.updated(0, v41)
    v4 = v4.copy(p1 = v23)
    v20 = v20.updated(0, v14)
    var v48: Vector[s6] = v3
    v18 = v18.updated(0, v14)
    v18 = v18.updated(0, v12)
    var v49: Vector[s2] = v1
    v9 = v9.copy(p0 = v49)
    v20 = v20.updated(0, v23)
    v20 = v20.updated(0, v23)
    v9 = v9.copy(p1 = v49)
    val v129: s6 = v48(1)
    val v130: s2 = v18(0)
    v20 = v20.updated(0, v130)
    v48 = v48.updated(0, v25)
    v25 = v25.copy(p0 = v9)
    v129
  }
  def f16(v0: s6, v1: s0): s6 = {
    var v3: s6 = v0
    val v4: s6 = f27(v3)
    val v8: s2 = v4.p1
    v3 = v3.copy(p1 = v8)
    val v2: s2 = v4.p1
    val v5: s2 = v3.p1
    v3 = v3.copy(p1 = v8)
    v3 = v3.copy(p1 = v5)
    v3 = v3.copy(p1 = v2)
    v3 = v3.copy(p1 = v2)
    v3
  }
  def f11(v0: s6, v1: Double, v2: s2): Double = {
    val v6: s0 = v2.p1
    var v4: s0 = v6
    var v8: Double = v1
    val v12: Double = v8 / v8
    var v26: Double = v12
    val v61: Double = v26 * v1
    val v36: Vector[Vector[Double]] = v4.p0
    val v47: Vector[Double] = v36(0)
    val v95: Vector[Vector[Double]] = v6.p0
    val v109: Double = v47(0)
    v4 = v4.copy(p1 = v95)
    val v78: Double = v109 * v61
    v78
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v6: s6 = v0(0)
    val v5: s6 = v0(0)
    val v7: s2 = v6.p1
    val v3: s2 = f71(v7)
    val v10: s3 = v6.p0
    var v19: s3 = v10
    val v4: Vector[s2] = v19.p1
    val v16: Vector[s2] = v10.p0
    var v23: Vector[s6] = v0
    val v12: s3 = s3(v4, v16)
    var v15: Vector[s2] = v16
    val v18: s2 = v15(0)
    val v27: s2 = v6.p1
    var v46: Double = v1
    val v24: s3 = s3(v4, v4)
    val v33: s2 = f71(v27)
    v23 = v23.updated(0, v5)
    val v34: Vector[s2] = v10.p0
    var v58: s6 = v5
    v15 = v15.updated(0, v7)
    val v60: s6 = s6(v24, v33)
    val v42: s0 = v3.p1
    var v44: s0 = v42
    var v41: Vector[s6] = v23
    v58 = v58.copy(p0 = v19)
    v19 = v12
    v19 = v19.copy(p1 = v16)
    v19 = v19.copy(p1 = v34)
    val v89: s6 = v41(0)
    v23 = v23.updated(0, v58)
    val v80: s6 = f16(v89, v44)
    val v76: Double = f11(v80, v46, v27)
    val v109: Double = f11(v60, v76, v18)
    val v98: Vector[Vector[Double]] = v44.p0
    v44 = v44.copy(p0 = v98)
    v109
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s3(Vector(s2(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))), s2(Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), s6(s3(Vector(s2(Vector(s1(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))), Vector(s2(Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))))), s2(Vector(s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), s0(Vector(Vector(34.0)), Vector(Vector(35.0))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}