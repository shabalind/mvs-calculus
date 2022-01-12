import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[s1]
  )
  case class s7 (
    p0: s4,
    p1: s4
  )
  def f89(v0: s3): s3 = {
    var v1: s3 = v0
    var v3: s3 = v1
    var v7: s3 = v0
    val v2: s2 = v7.p1
    v7 = v7.copy(p1 = v2)
    v1 = v1.copy(p1 = v2)
    v1 = v1.copy(p1 = v2)
    var v19: s3 = v3
    v19
  }
  def f88(v0: s3): s3 = {
    var v4: s3 = v0
    val v5: s3 = f89(v4)
    val v1: s1 = v4.p0
    v4 = v4.copy(p0 = v1)
    var v2: s3 = v5
    val v8: s3 = f89(v0)
    v2 = v8
    v4 = v0
    val v3: s2 = v8.p1
    var v9: s3 = v2
    v9 = v9.copy(p0 = v1)
    val v18: Vector[Vector[s0]] = v3.p1
    v4 = v4.copy(p1 = v3)
    var v21: s2 = v3
    val v16: s3 = f89(v9)
    val v45: Vector[Vector[Vector[s0]]] = Vector(v18, v18, v18, v18, v18)
    v2 = v2.copy(p0 = v1)
    v4 = v4.copy(p0 = v1)
    val v48: Vector[Vector[s0]] = v45(3)
    v9 = v9.copy(p1 = v21)
    v21 = v21.copy(p1 = v48)
    val v156: s3 = f89(v16)
    v9 = v9.copy(p0 = v1)
    v156
  }
  def f87(v0: s2): s2 = {
    var v6: s2 = v0
    val v8: Vector[Vector[s0]] = v6.p1
    var v7: s2 = v0
    v7 = v7.copy(p1 = v8)
    val v2: Vector[s0] = v0.p0
    val v10: Vector[s0] = v7.p0
    val v1: Vector[s0] = v7.p0
    var v14: Vector[Vector[s0]] = v8
    v14 = v14.updated(0, v1)
    v14 = v14.updated(0, v2)
    v7 = v7.copy(p1 = v8)
    val v11: Vector[s0] = v14(0)
    v6 = v6.copy(p0 = v1)
    v14 = v14.updated(0, v10)
    v14 = v14.updated(0, v10)
    var v18: Vector[Vector[s0]] = v8
    val v15: Vector[s0] = v8(0)
    val v20: s2 = s2(v11, v8)
    val v23: Vector[s0] = v0.p0
    var v31: s2 = v6
    val v35: Vector[s0] = v31.p0
    v6 = v6.copy(p1 = v8)
    v18 = v18.updated(0, v15)
    var v28: s2 = v31
    v18 = v18.updated(0, v23)
    v18 = v18.updated(0, v11)
    v28 = v28.copy(p0 = v1)
    v6 = v6.copy(p1 = v14)
    val v51: Vector[s2] = Vector(v6, v28, v7, v7)
    v6 = v6.copy(p0 = v35)
    val v141: Vector[s0] = v20.p0
    var v104: Vector[s2] = v51
    v7 = v7.copy(p0 = v35)
    v14 = v14.updated(0, v1)
    var v106: Vector[s0] = v141
    var v163: Vector[s2] = v104
    v28 = v28.copy(p1 = v18)
    v163 = v163.updated(3, v20)
    v6 = v6.copy(p0 = v11)
    v28 = v28.copy(p0 = v106)
    val v365: s2 = v163(0)
    v365
  }
  def f85(v0: s2): s2 = {
    val v7: Vector[Vector[s0]] = v0.p1
    val v1: Vector[s0] = v0.p0
    val v3: Vector[s0] = v0.p0
    var v9: s2 = v0
    var v5: s2 = v0
    val v6: s2 = f87(v5)
    val v4: s2 = f87(v9)
    v9 = v6
    val v2: s2 = f87(v9)
    val v18: s2 = f87(v2)
    v5 = v5.copy(p0 = v1)
    val v17: s0 = v3(0)
    val v15: s2 = f87(v4)
    val v38: s2 = f87(v18)
    val v43: Vector[s0] = v38.p0
    v9 = v9.copy(p1 = v7)
    var v25: s2 = v38
    val v39: s1 = s1(v7, v17)
    val v50: s2 = f87(v15)
    v25 = v50
    val v124: Vector[Vector[s0]] = v39.p0
    v5 = v5.copy(p1 = v124)
    v25 = v25.copy(p0 = v43)
    v25
  }
  def f84(v0: s4, v1: Double): Double = {
    val v7: Vector[s1] = v0.p1
    val v9: Vector[s1] = v0.p1
    val v5: s1 = v9(0)
    val v6: Vector[s1] = v0.p1
    val v11: Vector[s1] = v0.p1
    val v13: s0 = v5.p1
    var v30: s4 = v0
    val v20: s7 = s7(v0, v30)
    val v27: s1 = v11(0)
    v30 = v30.copy(p1 = v7)
    v30 = v30.copy(p1 = v7)
    v30 = v30.copy(p1 = v6)
    v30 = v30.copy(p1 = v11)
    var v23: s1 = v27
    var v19: s7 = v20
    val v18: Vector[Vector[s0]] = v30.p0
    v30 = v30.copy(p1 = v9)
    val v24: Vector[s0] = v18(2)
    var v42: Vector[Vector[s0]] = v18
    v42 = v18
    val v33: s0 = v24(0)
    v30 = v30.copy(p0 = v42)
    var v21: Vector[s1] = v11
    v19 = v19.copy(p0 = v30)
    var v41: Vector[s1] = v11
    val v22: s0 = v24(0)
    var v29: Vector[s0] = v24
    var v48: s0 = v13
    var v31: Vector[s1] = v21
    var v65: Vector[s0] = v24
    val v34: s4 = v19.p0
    v30 = v30.copy(p1 = v31)
    val v85: s0 = v29(0)
    v41 = v41.updated(0, v23)
    v65 = v65.updated(0, v48)
    v23 = v23.copy(p1 = v33)
    val v57: Vector[Vector[s0]] = v34.p0
    v30 = v30.copy(p1 = v7)
    v23 = v23.copy(p1 = v22)
    val v61: Vector[Double] = v85.p0
    v23 = v23.copy(p1 = v85)
    val v44: s4 = v19.p1
    v19 = v19.copy(p1 = v44)
    var v100: Vector[Vector[s0]] = v42
    var v81: Vector[s1] = v31
    v21 = v21.updated(0, v5)
    v23 = v23.copy(p1 = v22)
    v23 = v23.copy(p1 = v22)
    val v86: s0 = v65(0)
    v48 = v48.copy(p0 = v61)
    val v188: s1 = v41(0)
    val v141: Vector[s0] = v57(1)
    v42 = v42.updated(0, v29)
    v81 = v81.updated(0, v23)
    v30 = v30.copy(p1 = v81)
    v29 = v141
    v100 = v100.updated(2, v65)
    val v121: Vector[Double] = v86.p0
    v41 = v31
    val v110: Vector[s0] = v100(0)
    v42 = v42.updated(0, v110)
    v31 = v31.updated(0, v188)
    val v146: Double = v121(0)
    v146
  }
  def f83(v0: s1): s1 = {
    var v3: s1 = v0
    val v4: s0 = v0.p1
    v3 = v3.copy(p1 = v4)
    val v2: Vector[Vector[s0]] = v3.p0
    var v9: s1 = v3
    val v1: Vector[s1] = Vector(v3, v0, v3, v3, v9, v3)
    var v7: Vector[s1] = v1
    val v8: Vector[Double] = v4.p0
    v7 = v7.updated(2, v3)
    val v15: s0 = v0.p1
    v7 = v7.updated(5, v3)
    val v5: s1 = s1(v2, v15)
    val v17: s1 = v7(0)
    var v20: Vector[Vector[s0]] = v2
    val v32: s1 = s1(v2, v15)
    v9 = v9.copy(p1 = v4)
    var v18: Vector[Vector[s0]] = v20
    var v12: s1 = v0
    val v25: Vector[Vector[s1]] = Vector(v7, v7, v1, v1)
    val v14: s0 = v5.p1
    val v43: s0 = v17.p1
    val v29: Vector[Vector[s0]] = v12.p0
    val v37: Vector[s1] = v25(0)
    v12 = v12.copy(p0 = v18)
    val v35: s0 = v0.p1
    var v54: Vector[Vector[s0]] = v20
    val v23: Vector[Vector[Double]] = v35.p1
    var v22: Vector[Vector[Double]] = v23
    val v46: s0 = v3.p1
    val v112: Vector[s0] = v29(0)
    val v57: Vector[Double] = v46.p0
    v9 = v9.copy(p1 = v43)
    val v68: s1 = v1(2)
    v12 = v12.copy(p0 = v18)
    v12 = v12.copy(p1 = v35)
    v7 = v7.updated(0, v17)
    v12 = v12.copy(p0 = v29)
    v12 = v12.copy(p1 = v4)
    v12 = v12.copy(p0 = v18)
    val v45: s1 = v37(0)
    v12 = v12.copy(p0 = v29)
    var v99: s0 = v46
    v99 = v99.copy(p0 = v8)
    v3 = v3.copy(p1 = v43)
    v9 = v9.copy(p0 = v54)
    v7 = v7.updated(1, v3)
    val v58: Vector[Vector[Double]] = v46.p2
    v3 = v3.copy(p0 = v2)
    val v67: s0 = v68.p1
    v9 = v9.copy(p1 = v67)
    v99 = v99.copy(p2 = v58)
    v3 = v3.copy(p1 = v14)
    val v87: Vector[Vector[s0]] = v17.p0
    v54 = v54.updated(0, v112)
    v9 = v9.copy(p1 = v99)
    v22 = v22.updated(0, v57)
    v12 = v12.copy(p0 = v87)
    v99 = v99.copy(p1 = v22)
    v12 = v12.copy(p1 = v15)
    v7 = v7.updated(2, v32)
    val v52: s2 = s2(v112, v29)
    val v166: s2 = f85(v52)
    val v132: s2 = f85(v166)
    val v148: s2 = f85(v132)
    val v216: s3 = s3(v45, v148)
    val v268: s3 = f88(v216)
    val v133: s3 = f88(v268)
    val v126: s3 = f89(v133)
    val v141: s1 = v126.p0
    v141
  }
  def f64(v0: s7, v1: s7, v2: s4): s7 = {
    var v33: s7 = v0
    var v25: s7 = v33
    var v23: s7 = v1
    val v28: s4 = v23.p0
    val v42: s4 = v25.p1
    v25 = v25.copy(p1 = v42)
    v33 = v33.copy(p0 = v28)
    v25
  }
  def f44(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v3: Vector[s0] = v0(0)
    val v10: Vector[s0] = v0(1)
    val v23: Vector[Vector[s0]] = Vector(v3, v3, v10)
    v23
  }
  def f37(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v4: Vector[Vector[s0]] = f44(v0)
    val v2: Vector[Vector[s0]] = f44(v4)
    val v13: Vector[s0] = v2(2)
    var v30: Vector[Vector[s0]] = v2
    v30 = v30.updated(2, v13)
    v30 = v30.updated(1, v13)
    var v49: Vector[s0] = v13
    val v143: Vector[Vector[s0]] = f44(v30)
    val v136: Vector[Vector[s0]] = f44(v143)
    v30 = v30.updated(0, v49)
    v30 = v30.updated(0, v13)
    v136
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v5: s4 = v0.p0
    val v6: s7 = f64(v0, v0, v5)
    val v3: s7 = f64(v0, v0, v5)
    val v7: s4 = v6.p0
    val v2: Double = v1 - v1
    var v4: s4 = v7
    val v18: s4 = v0.p1
    val v9: s7 = f64(v3, v0, v4)
    val v13: Vector[Vector[s0]] = v5.p0
    val v21: Vector[Vector[s0]] = f44(v13)
    var v10: Double = v1
    val v27: Vector[Vector[s0]] = f37(v21)
    v4 = v4.copy(p0 = v21)
    val v42: Vector[Vector[s0]] = v5.p0
    val v26: Vector[Vector[s0]] = f44(v42)
    val v33: Vector[Vector[s0]] = f37(v21)
    val v45: Vector[Double] = Vector(v1, v10, v1)
    var v41: Vector[Vector[s0]] = v27
    var v65: Vector[Vector[s0]] = v26
    val v23: Double = f84(v18, v10)
    val v37: Double = v45(1)
    val v87: Vector[s0] = v41(2)
    val v32: Double = v2 * v23
    val v83: s4 = v9.p1
    v4 = v4.copy(p0 = v65)
    val v55: s7 = f64(v0, v9, v83)
    val v107: Vector[s1] = v7.p1
    var v96: Vector[s1] = v107
    var v92: Vector[s1] = v96
    val v163: Vector[Vector[s0]] = v5.p0
    var v143: Vector[s1] = v92
    v4 = v4.copy(p0 = v163)
    v10 = v32
    val v91: s1 = v107(0)
    v96 = v96.updated(0, v91)
    v4 = v4.copy(p0 = v33)
    val v90: s1 = f83(v91)
    v92 = v92.updated(0, v90)
    v65 = v65.updated(2, v87)
    v4 = v4.copy(p1 = v143)
    v4 = v4.copy(p1 = v92)
    val v226: s4 = v55.p0
    val v446: Double = f84(v226, v37)
    v446
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s4(Vector(Vector(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), Vector(s1(Vector(Vector(s0(Vector(18.0), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(24.0), Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s4(Vector(Vector(s0(Vector(30.0), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(42.0), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), Vector(s1(Vector(Vector(s0(Vector(48.0), Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))), s0(Vector(54.0), Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}