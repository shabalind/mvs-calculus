import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: s0,
    p2: s0,
    p3: Double,
    p4: Vector[s0]
  )
  def f121(v0: s0): s0 = {
    var v1: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v1.p0
    val v2: Vector[Vector[Double]] = v1.p1
    var v8: Vector[Vector[Double]] = v3
    val v9: Vector[Vector[Double]] = v1.p0
    val v4: Vector[Double] = v7(1)
    val v6: Vector[Double] = v2(1)
    var v11: Vector[Vector[Double]] = v7
    val v5: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p1 = v2)
    v1 = v1.copy(p0 = v8)
    var v14: Vector[Double] = v4
    v8 = v11
    v1 = v1.copy(p0 = v7)
    var v12: Vector[Double] = v6
    v1 = v0
    v1 = v1.copy(p0 = v3)
    val v10: Vector[Vector[Double]] = v0.p1
    val v28: Double = v14(0)
    var v13: s0 = v0
    val v37: Double = v14(0)
    val v15: Vector[Double] = Vector(v28, v37, v37, v37, v28, v28, v37)
    v8 = v8.updated(1, v14)
    v12 = v12.updated(0, v37)
    var v25: s0 = v0
    val v23: Vector[Vector[Double]] = v0.p0
    val v34: Vector[Double] = v7(0)
    val v26: Double = v12(0)
    v25 = v25.copy(p1 = v3)
    val v18: Vector[Vector[Double]] = v25.p0
    val v16: Double = v6(0)
    val v44: Vector[Vector[Double]] = v25.p1
    val v29: Vector[Vector[Double]] = v0.p1
    v14 = v14.updated(0, v37)
    val v19: Vector[Double] = v8(1)
    val v30: Vector[Vector[Double]] = v1.p1
    val v21: s1 = s1(v1)
    val v52: Double = v15(2)
    val v40: Vector[Double] = Vector(v37, v52, v28, v28, v52, v26)
    val v36: s0 = s0(v2, v44)
    v14 = v14.updated(0, v52)
    val v27: Vector[Double] = v30(0)
    v25 = v25.copy(p1 = v2)
    var v32: Vector[Double] = v34
    var v50: Vector[Vector[Double]] = v29
    v13 = v13.copy(p1 = v44)
    v11 = v11.updated(1, v32)
    val v68: s0 = v21.p0
    var v101: s1 = v21
    val v47: Double = v40(3)
    v8 = v8.updated(1, v14)
    v25 = v25.copy(p0 = v10)
    val v48: Double = v14(0)
    val v96: Vector[Vector[Vector[Double]]] = Vector(v2, v2, v30, v23)
    val v33: Vector[Double] = v9(0)
    var v85: Double = v48
    var v65: Vector[Double] = v34
    v50 = v50.updated(1, v19)
    val v88: Vector[Vector[Double]] = v25.p1
    v13 = v13.copy(p0 = v18)
    val v93: Double = v27(0)
    val v70: s0 = v101.p0
    val v106: Vector[Double] = v88(1)
    v13 = v68
    v101 = v101.copy(p0 = v13)
    var v99: Vector[Vector[Vector[Double]]] = v96
    v12 = v12.updated(0, v85)
    v50 = v50.updated(1, v65)
    var v139: s0 = v0
    v139 = v139.copy(p0 = v50)
    v13 = v13.copy(p1 = v23)
    v11 = v11.updated(1, v106)
    val v92: Vector[Vector[Double]] = v139.p1
    v11 = v11.updated(1, v4)
    v8 = v8.updated(0, v19)
    val v61: Vector[Double] = v92(0)
    v11 = v11.updated(1, v14)
    v32 = v61
    v1 = v1.copy(p0 = v30)
    val v118: Vector[Vector[Double]] = v68.p0
    v85 = v16
    v1 = v1.copy(p1 = v30)
    v25 = v25.copy(p0 = v8)
    v25 = v25.copy(p0 = v118)
    v101 = v101.copy(p0 = v36)
    v8 = v8.updated(1, v27)
    v32 = v32.updated(0, v47)
    val v135: Vector[Vector[Double]] = v99(3)
    v14 = v14.updated(0, v93)
    v1 = v1.copy(p1 = v5)
    v65 = v65.updated(0, v28)
    v12 = v12.updated(0, v47)
    v139 = v139.copy(p0 = v135)
    v11 = v11.updated(0, v33)
    v70
  }
  def f117(v0: s1): s1 = {
    val v1: s0 = v0.p0
    val v2: s1 = s1(v1)
    var v12: s1 = v2
    val v8: s0 = v12.p0
    var v21: s1 = v2
    var v9: s1 = v21
    v9 = v12
    v9 = v9.copy(p0 = v8)
    v9
  }
  def f113(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v2(0)
    val v5: Vector[Double] = v6(1)
    val v3: s0 = f121(v0)
    val v4: s0 = s0(v2, v6)
    var v11: Vector[Vector[Double]] = v6
    val v7: Vector[Vector[Double]] = v3.p0
    v11 = v11.updated(0, v1)
    val v15: Vector[Vector[Double]] = v4.p1
    val v35: s0 = f121(v3)
    val v31: s0 = f121(v4)
    val v28: Vector[Vector[Double]] = v4.p1
    val v17: Vector[Double] = v11(0)
    v11 = v11.updated(1, v17)
    v11 = v11.updated(1, v17)
    val v68: Vector[Vector[Double]] = v31.p0
    var v60: s0 = v35
    v60 = v60.copy(p0 = v11)
    v60 = v60.copy(p0 = v28)
    v11 = v15
    v11 = v11.updated(0, v17)
    val v96: Vector[Double] = v68(0)
    v60 = v60.copy(p1 = v7)
    v11 = v11.updated(0, v96)
    v11 = v11.updated(0, v5)
    v60
  }
  def f107(v0: s0): s0 = {
    var v1: s0 = v0
    val v7: Vector[Vector[Double]] = v1.p0
    var v5: Vector[Vector[Double]] = v7
    val v2: Vector[Vector[Double]] = v1.p0
    val v4: Vector[Double] = v7(1)
    val v3: Vector[Double] = v5(1)
    val v10: s0 = f121(v1)
    v1 = v0
    val v6: Vector[Vector[Double]] = v0.p1
    v1 = v1.copy(p0 = v6)
    val v9: Vector[Vector[Double]] = Vector(v3, v4)
    val v8: Double = v3(0)
    val v13: s0 = f121(v10)
    var v15: Vector[Vector[Double]] = v6
    val v36: Double = v3(0)
    val v16: Double = v4(0)
    v5 = v5.updated(1, v4)
    v5 = v5.updated(0, v4)
    val v30: Vector[Double] = v5(1)
    v15 = v15.updated(0, v4)
    val v18: s0 = s0(v2, v7)
    val v14: Vector[Vector[Double]] = v10.p1
    val v24: s0 = f113(v13)
    val v21: Vector[Double] = v9(1)
    val v34: Vector[Vector[Double]] = v0.p1
    v5 = v5.updated(0, v30)
    var v17: Vector[Double] = v30
    var v26: Vector[Double] = v21
    var v25: s0 = v10
    var v33: Vector[Vector[Double]] = v6
    v15 = v15.updated(1, v3)
    var v56: s0 = v18
    v1 = v1.copy(p1 = v9)
    val v28: Vector[Vector[Double]] = v13.p0
    v15 = v15.updated(0, v26)
    val v27: Vector[Vector[Double]] = v24.p1
    var v22: s0 = v56
    val v31: s0 = f113(v25)
    var v47: Vector[Double] = v17
    var v48: Vector[Double] = v47
    var v90: Vector[Vector[Double]] = v7
    val v39: s0 = f121(v24)
    var v84: Vector[Vector[Double]] = v34
    v90 = v90.updated(0, v48)
    v84 = v28
    v47 = v47.updated(0, v8)
    var v35: Vector[Double] = v4
    v90 = v90.updated(1, v26)
    var v29: Vector[Double] = v4
    v25 = v25.copy(p0 = v5)
    v25 = v25.copy(p1 = v90)
    val v37: Vector[Double] = v84(1)
    v90 = v90.updated(0, v47)
    val v32: Double = v3(0)
    v25 = v25.copy(p1 = v84)
    v84 = v84.updated(0, v48)
    val v78: Vector[Vector[Double]] = v39.p0
    val v54: Vector[s0] = Vector(v22, v22, v31, v39, v13)
    v35 = v17
    v56 = v56.copy(p0 = v90)
    val v89: Double = v48(0)
    var v50: Double = v16
    val v145: Vector[Double] = v9(1)
    val v59: Double = v32 - v89
    val v57: s0 = v54(2)
    var v53: Vector[Vector[Double]] = v33
    v47 = v37
    val v100: Double = v145(0)
    v26 = v35
    v56 = v56.copy(p0 = v53)
    v5 = v5.updated(1, v48)
    var v58: Vector[Vector[Double]] = v27
    v90 = v90.updated(1, v145)
    v1 = v1.copy(p1 = v5)
    v84 = v84.updated(1, v30)
    var v124: s0 = v57
    val v108: Vector[Vector[Double]] = v56.p1
    val v95: Vector[Double] = v7(1)
    v22 = v22.copy(p1 = v58)
    v53 = v53.updated(1, v95)
    v22 = v22.copy(p0 = v14)
    var v102: Vector[Vector[Double]] = v108
    v53 = v53.updated(0, v47)
    v124 = v124.copy(p1 = v15)
    var v109: Vector[Double] = v3
    var v65: Vector[Vector[Double]] = v78
    v56 = v56.copy(p1 = v84)
    val v135: s0 = f113(v124)
    v26 = v26.updated(0, v36)
    v102 = v102.updated(1, v109)
    v33 = v65
    v29 = v29.updated(0, v50)
    v29 = v29.updated(0, v59)
    v17 = v17.updated(0, v100)
    v124 = v124.copy(p0 = v102)
    v90 = v90.updated(1, v29)
    v135
  }
  def f100(v0: s1): s1 = {
    val v12: s0 = v0.p0
    val v13: s0 = v0.p0
    val v38: Vector[Vector[Double]] = v12.p0
    val v29: Vector[Vector[Double]] = v13.p1
    val v39: s0 = s0(v38, v29)
    val v46: s0 = f113(v39)
    val v138: s1 = s1(v46)
    v138
  }
  def f96(v0: s0): s0 = {
    val v4: s0 = f121(v0)
    val v6: Vector[Vector[Double]] = v4.p0
    val v11: s0 = s0(v6, v6)
    var v1: s0 = v4
    val v5: s1 = s1(v1)
    val v13: s1 = f117(v5)
    val v22: s1 = f100(v13)
    var v14: s1 = v22
    val v16: s0 = v14.p0
    v14 = v14.copy(p0 = v11)
    v16
  }
  def f46(v0: s0): s0 = {
    var v1: s0 = v0
    v1 = v0
    val v3: Vector[Vector[Double]] = v1.p0
    val v7: s0 = f121(v0)
    var v6: s0 = v1
    val v4: Vector[Vector[Double]] = v7.p1
    val v5: s0 = s0(v3, v3)
    val v2: s0 = f96(v0)
    val v8: Vector[Vector[Double]] = v0.p0
    v6 = v7
    val v9: s0 = f121(v0)
    v1 = v1.copy(p0 = v3)
    val v13: s0 = f96(v7)
    v6 = v6.copy(p0 = v4)
    v6 = v6.copy(p1 = v3)
    var v14: s0 = v5
    val v22: Vector[Vector[Vector[Double]]] = Vector(v3, v8)
    v6 = v5
    val v71: s0 = f113(v9)
    var v27: s0 = v14
    val v17: Vector[Vector[Double]] = v13.p1
    v6 = v6.copy(p0 = v17)
    val v54: s0 = f121(v7)
    val v34: Vector[Vector[Double]] = v22(0)
    val v46: s0 = f113(v6)
    val v59: s0 = f121(v46)
    v14 = v14.copy(p0 = v34)
    val v49: s0 = f107(v27)
    val v73: Vector[s0] = Vector(v49, v59, v71, v2, v54, v9, v7)
    v6 = v6.copy(p0 = v34)
    var v233: Vector[s0] = v73
    val v392: s0 = v233(2)
    v392
  }
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v2: s3 = v0(0)
    val v6: s3 = v0(0)
    val v3: Vector[s3] = Vector(v2, v6, v2, v2, v2, v2)
    val v8: s3 = v3(3)
    val v24: s0 = v8.p2
    var v10: Double = v1
    var v15: Double = v1
    val v14: s0 = f46(v24)
    val v26: Vector[Vector[Double]] = v14.p0
    var v87: Vector[Vector[Double]] = v26
    val v38: Vector[Double] = v87(0)
    val v46: Double = v10 * v15
    var v97: Double = v46
    var v53: Vector[Double] = v38
    v87 = v87.updated(0, v38)
    v53 = v53.updated(0, v97)
    val v173: Double = v53(0)
    v53 = v53.updated(0, v15)
    var v71: Double = v173
    v71
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), s1(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s2(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), 32.0, Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0))), s0(Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0))))))
    val v1: Double = 41.0
    val start = nanoTime()
    var result: Double = 41.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}