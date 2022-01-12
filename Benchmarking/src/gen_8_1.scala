import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1
  )
  case class s4 (
    p0: s2,
    p1: Vector[s0]
  )
  case class s5 (
    p0: s2,
    p1: Vector[s4]
  )
  def f122(v0: s0, v1: s2): s2 = {
    val v17: s1 = v1.p0
    val v33: s2 = s2(v17)
    val v26: s1 = v33.p0
    var v51: s2 = v33
    val v103: Vector[s2] = Vector(v51, v33, v33)
    val v167: s2 = v103(0)
    v51 = v51.copy(p0 = v26)
    v167
  }
  def f115(v0: s1, v1: s4): s1 = {
    val v6: s2 = v1.p0
    var v3: s2 = v6
    v3 = v3.copy(p0 = v0)
    val v32: s1 = v3.p0
    v32
  }
  def f103(v0: s4, v1: s4): s4 = {
    var v3: s4 = v1
    val v8: Vector[s0] = v3.p1
    var v11: s4 = v1
    val v5: s0 = v8(0)
    var v7: s0 = v5
    val v6: s0 = v8(0)
    v3 = v3.copy(p1 = v8)
    var v12: Vector[s0] = v8
    v3 = v3.copy(p1 = v12)
    v12 = v12.updated(0, v7)
    val v10: s0 = v12(0)
    val v4: s0 = v12(0)
    var v9: s4 = v3
    val v14: s0 = v12(0)
    val v2: s2 = v1.p0
    val v21: s0 = v8(0)
    val v25: s2 = v3.p0
    v12 = v12.updated(0, v4)
    v9 = v9.copy(p0 = v25)
    v9 = v9.copy(p0 = v2)
    v12 = v12.updated(0, v10)
    v12 = v12.updated(0, v14)
    val v26: s0 = v12(0)
    val v15: s1 = v25.p0
    val v18: s2 = f122(v5, v25)
    val v30: s1 = f115(v15, v0)
    val v23: Vector[Double] = v7.p1
    val v16: s2 = s2(v15)
    v12 = v12.updated(0, v7)
    val v24: Vector[Vector[Double]] = v6.p0
    var v20: s1 = v30
    v11 = v0
    val v75: s0 = v20.p1
    v12 = v12.updated(0, v6)
    var v28: Vector[s0] = v12
    val v48: Double = v23(1)
    var v35: s1 = v30
    val v47: Vector[Vector[Double]] = v14.p0
    val v57: Vector[s0] = v35.p0
    val v40: s1 = v16.p0
    var v29: s2 = v16
    v20 = v20.copy(p0 = v57)
    v3 = v9
    val v38: s1 = f115(v40, v1)
    v35 = v35.copy(p1 = v6)
    v20 = v20.copy(p1 = v5)
    val v44: s1 = f115(v38, v11)
    val v65: Vector[Double] = v24(0)
    v28 = v28.updated(0, v5)
    val v33: Vector[Double] = v21.p1
    v29 = v29.copy(p0 = v44)
    var v98: s0 = v7
    val v46: Vector[Vector[Double]] = v5.p0
    val v37: Vector[s0] = v1.p1
    v29 = v29.copy(p0 = v30)
    v28 = v37
    var v85: Vector[Vector[Double]] = v46
    var v41: Vector[Double] = v33
    v35 = v35.copy(p0 = v57)
    var v108: s2 = v29
    v12 = v12.updated(0, v75)
    val v160: s0 = v12(0)
    val v89: s1 = f115(v35, v0)
    v12 = v28
    v85 = v85.updated(0, v65)
    v9 = v9.copy(p0 = v25)
    v3 = v3.copy(p0 = v18)
    val v45: Vector[Double] = v47(0)
    v85 = v85.updated(0, v65)
    v28 = v28.updated(0, v26)
    v85 = v85.updated(0, v45)
    v41 = v41.updated(1, v48)
    v12 = v12.updated(0, v160)
    v85 = v46
    val v74: s4 = s4(v108, v28)
    v3 = v3.copy(p0 = v16)
    v20 = v20.copy(p0 = v57)
    val v113: Vector[Double] = v85(0)
    v29 = v29.copy(p0 = v89)
    val v182: Double = v113(0)
    v41 = v41.updated(1, v182)
    v7 = v7.copy(p1 = v41)
    v7 = v98
    v11 = v11.copy(p1 = v8)
    v74
  }
  def f99(v0: Double): Double = {
    var v8: Double = v0
    var v4: Double = v0
    var v3: Double = v4
    var v1: Double = v3
    val v2: Vector[Double] = Vector(v0, v1, v1, v3)
    var v9: Vector[Double] = v2
    v9 = v9.updated(1, v8)
    val v7: Vector[Vector[Double]] = Vector(v9, v2, v2, v9, v9)
    v9 = v9.updated(0, v3)
    var v15: Vector[Vector[Double]] = v7
    val v23: Vector[Double] = v15(3)
    var v12: Vector[Double] = v23
    v12 = v12.updated(1, v3)
    val v22: Double = v12(0)
    v22
  }
  def f95(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    var v4: s0 = v0
    val v7: Vector[Double] = v4.p1
    val v9: Vector[Double] = v1(0)
    var v8: Vector[Vector[Double]] = v1
    val v11: Double = v9(0)
    var v14: Double = v11
    var v13: s0 = v4
    v8 = v8.updated(0, v9)
    val v20: Vector[Double] = v8(0)
    val v19: Vector[Double] = v0.p1
    var v21: Vector[Vector[Double]] = v8
    val v25: Vector[Double] = v4.p1
    val v36: Vector[Vector[Double]] = v0.p0
    var v15: Vector[Double] = v20
    val v17: Vector[Double] = v4.p1
    v4 = v4.copy(p0 = v36)
    val v43: Vector[Double] = v13.p1
    val v55: Double = f99(v14)
    val v30: Vector[Double] = v13.p1
    val v26: s0 = s0(v36, v7)
    v13 = v13.copy(p1 = v19)
    v13 = v13.copy(p1 = v17)
    val v93: Vector[Vector[Double]] = v0.p0
    var v52: Vector[Vector[Double]] = v93
    var v31: s0 = v13
    v52 = v52.updated(0, v15)
    val v23: Double = f99(v55)
    val v76: Vector[Double] = v36(0)
    val v58: Vector[Vector[Double]] = v31.p0
    v52 = v52.updated(0, v20)
    val v40: Vector[Vector[Double]] = v26.p0
    v21 = v52
    v8 = v8.updated(0, v9)
    v8 = v8.updated(0, v76)
    val v92: Vector[Double] = v31.p1
    v31 = v31.copy(p1 = v92)
    var v83: Double = v23
    v13 = v13.copy(p1 = v17)
    val v53: Vector[Vector[Vector[Double]]] = Vector(v93, v52, v21, v58, v36, v21, v40)
    v13 = v13.copy(p0 = v1)
    v15 = v15.updated(0, v83)
    v13 = v13.copy(p0 = v52)
    v4 = v4.copy(p0 = v1)
    v13 = v13.copy(p1 = v30)
    v13 = v13.copy(p1 = v43)
    val v85: Vector[Vector[Double]] = v53(4)
    v31 = v31.copy(p0 = v1)
    val v78: Vector[Vector[Double]] = v13.p0
    v4 = v4.copy(p0 = v85)
    var v97: s0 = v13
    v97 = v97.copy(p1 = v25)
    v97 = v97.copy(p0 = v78)
    v31 = v31.copy(p0 = v93)
    v97
  }
  def f93(v0: Vector[s0]): Vector[s0] = {
    val v5: s0 = v0(0)
    val v3: s0 = f95(v5)
    val v2: Vector[Vector[s0]] = Vector(v0)
    val v17: s0 = v0(0)
    val v9: Vector[Vector[Double]] = v17.p0
    val v11: s0 = f95(v3)
    val v6: s0 = v0(0)
    val v7: s0 = v0(0)
    var v12: Vector[s0] = v0
    val v10: Vector[Double] = v3.p1
    val v20: Vector[Vector[Double]] = v5.p0
    var v15: s0 = v11
    val v25: Vector[s0] = v2(0)
    val v16: Vector[Double] = v11.p1
    val v21: Vector[s0] = v2(0)
    val v33: s0 = f95(v17)
    v12 = v12.updated(0, v5)
    val v32: s0 = f95(v17)
    val v29: s0 = s0(v9, v16)
    val v24: s0 = s0(v20, v10)
    v12 = v12.updated(0, v15)
    v12 = v12.updated(0, v33)
    val v31: Vector[Double] = v20(0)
    val v50: Vector[s0] = v2(0)
    val v43: Vector[Vector[s0]] = Vector(v12, v21, v50, v25)
    v15 = v15.copy(p0 = v9)
    var v63: Vector[s0] = v25
    val v36: Vector[Vector[Double]] = v24.p0
    var v80: Vector[Double] = v31
    v12 = v63
    v15 = v15.copy(p0 = v20)
    v63 = v63.updated(0, v29)
    var v49: Vector[Vector[Double]] = v36
    v49 = v49.updated(0, v80)
    val v62: s0 = f95(v24)
    val v45: Vector[Vector[Double]] = v29.p0
    v15 = v15.copy(p0 = v9)
    val v40: Vector[Vector[Double]] = v32.p0
    v49 = v49.updated(0, v31)
    v15 = v15.copy(p0 = v49)
    v15 = v15.copy(p0 = v49)
    var v101: s0 = v6
    val v124: s0 = f95(v7)
    val v151: Vector[s0] = v43(0)
    v12 = v12.updated(0, v62)
    val v289: Vector[Vector[Double]] = v101.p0
    v15 = v15.copy(p0 = v40)
    v101 = v101.copy(p0 = v49)
    v15 = v15.copy(p0 = v45)
    v15 = v15.copy(p0 = v289)
    val v129: s0 = f95(v124)
    v63 = v63.updated(0, v129)
    v151
  }
  def f91(v0: Vector[s0]): Vector[s0] = {
    val v8: Vector[s0] = f93(v0)
    val v17: Vector[s0] = f93(v8)
    val v40: Vector[s0] = f93(v17)
    var v41: Vector[s0] = v40
    v41
  }
  def f85(v0: s2): s2 = {
    val v4: s1 = v0.p0
    var v1: s2 = v0
    v1 = v1.copy(p0 = v4)
    var v42: s2 = v1
    v1 = v42
    v1
  }
  def f70(v0: s2): s2 = {
    val v2: s2 = f85(v0)
    val v10: s2 = f85(v2)
    var v32: s2 = v10
    v32
  }
  def f66(v0: Vector[s0]): Vector[s0] = {
    val v5: Vector[s0] = f91(v0)
    val v4: s0 = v5(0)
    var v7: Vector[s0] = v5
    val v2: s0 = v7(0)
    v7 = v7.updated(0, v2)
    val v6: s0 = v0(0)
    v7 = v7.updated(0, v6)
    var v9: Vector[s0] = v7
    val v12: Vector[Double] = v4.p1
    val v18: s0 = f95(v6)
    val v23: s0 = f95(v18)
    val v30: Vector[Vector[Double]] = v6.p0
    var v33: Vector[s0] = v5
    var v27: s0 = v23
    var v21: Vector[Vector[Double]] = v30
    val v17: Vector[Vector[Double]] = v2.p0
    val v40: Vector[Vector[Double]] = v27.p0
    var v25: Vector[s0] = v33
    var v28: s0 = v27
    val v49: Vector[Double] = v23.p1
    v27 = v27.copy(p1 = v12)
    v27 = v27.copy(p1 = v12)
    val v19: Vector[Double] = v17(0)
    v25 = v9
    v27 = v27.copy(p0 = v40)
    v33 = v33.updated(0, v28)
    v28 = v28.copy(p1 = v49)
    val v50: Vector[Vector[Double]] = v2.p0
    v33 = v33.updated(0, v2)
    v27 = v27.copy(p0 = v17)
    v9 = v9.updated(0, v23)
    v28 = v28.copy(p0 = v21)
    v27 = v27.copy(p0 = v50)
    var v103: Vector[Vector[Double]] = v21
    v103 = v103.updated(0, v19)
    v27 = v27.copy(p0 = v103)
    v9 = v9.updated(0, v28)
    v25
  }
  def f18(v0: s4): s4 = {
    val v4: s4 = f103(v0, v0)
    var v5: s4 = v4
    var v2: s4 = v0
    val v7: s2 = v5.p0
    v2 = v2.copy(p0 = v7)
    v5 = v5.copy(p0 = v7)
    var v22: s4 = v0
    var v17: s2 = v7
    val v24: s2 = v0.p0
    val v10: s2 = v22.p0
    v22 = v22.copy(p0 = v10)
    v5 = v5.copy(p0 = v10)
    v2 = v2.copy(p0 = v17)
    var v27: s2 = v17
    val v26: s1 = v24.p0
    val v16: s2 = f70(v7)
    var v25: s4 = v0
    v25 = v25.copy(p0 = v27)
    val v72: Vector[s0] = v4.p1
    v27 = v17
    val v46: s4 = s4(v17, v72)
    v25 = v2
    val v55: Vector[s4] = Vector(v5, v25, v46, v0)
    val v98: Vector[s0] = f66(v72)
    v25 = v25.copy(p1 = v72)
    v17 = v17.copy(p0 = v26)
    val v89: s4 = v55(0)
    v2 = v2.copy(p0 = v16)
    v2 = v2.copy(p1 = v98)
    v89
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v7: Vector[s4] = v0.p1
    val v3: s4 = v7(0)
    val v17: s4 = f18(v3)
    val v25: Vector[s0] = v17.p1
    val v20: s0 = v25(0)
    val v41: Vector[Double] = v20.p1
    val v122: Double = f99(v1)
    val v104: Double = v41(0)
    val v264: Double = v122 + v104
    v264
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s2(s1(Vector(s0(Vector(Vector(0.0)), Vector(1.0, 2.0)), s0(Vector(Vector(3.0)), Vector(4.0, 5.0)), s0(Vector(Vector(6.0)), Vector(7.0, 8.0))), s0(Vector(Vector(9.0)), Vector(10.0, 11.0)))), Vector(s4(s2(s1(Vector(s0(Vector(Vector(12.0)), Vector(13.0, 14.0)), s0(Vector(Vector(15.0)), Vector(16.0, 17.0)), s0(Vector(Vector(18.0)), Vector(19.0, 20.0))), s0(Vector(Vector(21.0)), Vector(22.0, 23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(25.0, 26.0)))), s4(s2(s1(Vector(s0(Vector(Vector(27.0)), Vector(28.0, 29.0)), s0(Vector(Vector(30.0)), Vector(31.0, 32.0)), s0(Vector(Vector(33.0)), Vector(34.0, 35.0))), s0(Vector(Vector(36.0)), Vector(37.0, 38.0)))), Vector(s0(Vector(Vector(39.0)), Vector(40.0, 41.0))))))
    val v1: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}