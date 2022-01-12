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
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  def f56(v0: s1): s1 = {
    var v7: s1 = v0
    var v1: s1 = v0
    val v2: Vector[s0] = v1.p0
    val v3: s0 = v2(0)
    val v5: Vector[Vector[Double]] = v3.p1
    val v4: Vector[s0] = v7.p0
    v1 = v1.copy(p1 = v3)
    v7 = v0
    val v10: s1 = s1(v4, v3)
    val v12: Vector[Vector[s0]] = Vector(v2, v4, v4, v2, v4, v2, v4)
    var v9: s1 = v10
    var v11: Vector[Vector[s0]] = v12
    val v20: s0 = v10.p1
    v7 = v7.copy(p1 = v20)
    v11 = v11.updated(4, v2)
    var v13: Vector[s0] = v4
    val v27: s0 = v2(0)
    var v26: Vector[Vector[s0]] = v11
    val v35: s1 = s1(v13, v27)
    var v25: s0 = v20
    val v28: Vector[s0] = v9.p0
    v9 = v9.copy(p1 = v25)
    val v44: Vector[s0] = v26(6)
    val v17: s1 = s1(v44, v3)
    var v23: Vector[Vector[Double]] = v5
    v7 = v7.copy(p0 = v28)
    val v41: Vector[s0] = v7.p0
    v1 = v35
    v25 = v25.copy(p1 = v23)
    v26 = v26.updated(0, v44)
    v9 = v9.copy(p0 = v41)
    v11 = v11.updated(6, v4)
    v17
  }
  def f50(v0: s2): s2 = {
    val v8: Vector[s1] = v0.p0
    var v5: s2 = v0
    v5 = v0
    val v16: Vector[s1] = v0.p0
    val v28: Vector[Vector[s1]] = Vector(v16, v8, v8)
    v5 = v5.copy(p0 = v8)
    val v23: Vector[s1] = v28(2)
    v5 = v0
    var v33: s2 = v5
    var v29: s2 = v5
    val v44: Vector[s1] = v29.p0
    var v134: s2 = v33
    var v77: Vector[s1] = v44
    v134 = v134.copy(p0 = v77)
    var v76: s2 = v134
    v76 = v76.copy(p0 = v23)
    v76
  }
  def f49(v0: s2): s2 = {
    var v3: s2 = v0
    var v5: s2 = v3
    val v7: Vector[Vector[s0]] = v3.p1
    val v18: s2 = f50(v5)
    val v20: s2 = f50(v18)
    v3 = v3.copy(p1 = v7)
    v20
  }
  def f41(v0: s2): s2 = {
    val v8: s2 = f49(v0)
    val v9: s2 = f49(v8)
    val v12: s2 = f50(v9)
    val v11: Vector[s1] = v9.p0
    var v19: s2 = v12
    val v23: s2 = f50(v19)
    v19 = v19.copy(p0 = v11)
    val v22: s2 = f49(v23)
    v19 = v19.copy(p0 = v11)
    v22
  }
  def f27(v0: s0): s0 = {
    var v7: s0 = v0
    val v2: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Double] = v2(2)
    val v5: Vector[Vector[Double]] = v7.p1
    var v4: Vector[Vector[Double]] = v2
    v7 = v7.copy(p0 = v2)
    var v1: Vector[Vector[Double]] = v5
    val v3: Vector[Vector[Double]] = v7.p1
    var v8: Vector[Double] = v6
    val v13: Vector[Vector[Double]] = v7.p0
    v4 = v4.updated(2, v6)
    var v9: Vector[Vector[Double]] = v5
    var v11: s0 = v0
    v9 = v9.updated(0, v6)
    var v20: Vector[Vector[Double]] = v2
    v7 = v7.copy(p1 = v3)
    val v22: Vector[Double] = v3(1)
    var v36: Vector[Vector[Double]] = v1
    val v12: Double = v6(0)
    val v42: Vector[Double] = v3(1)
    val v29: Vector[Vector[Double]] = v11.p0
    val v21: Vector[Double] = v1(1)
    val v70: Vector[Vector[Double]] = v7.p0
    val v14: Vector[Vector[Double]] = v0.p1
    val v25: Vector[Double] = v5(1)
    v11 = v7
    val v17: Vector[Vector[Double]] = v0.p1
    val v10: Vector[Vector[Double]] = v11.p0
    val v43: s0 = s0(v70, v36)
    v9 = v9.updated(1, v8)
    v7 = v7.copy(p1 = v36)
    var v16: s0 = v43
    var v24: Vector[Vector[Double]] = v13
    v8 = v8.updated(0, v12)
    v1 = v1.updated(1, v22)
    v11 = v11.copy(p0 = v2)
    val v48: Vector[Vector[Double]] = v16.p1
    v11 = v11.copy(p0 = v4)
    v7 = v7.copy(p1 = v48)
    var v26: Vector[Vector[Double]] = v17
    val v34: Vector[Double] = v14(0)
    v16 = v16.copy(p1 = v3)
    v8 = v8.updated(0, v12)
    v7 = v7.copy(p1 = v36)
    val v51: Vector[Double] = v29(2)
    val v45: Vector[Vector[Double]] = v11.p0
    v1 = v48
    v16 = v16.copy(p1 = v26)
    val v40: Double = v6(0)
    val v28: Vector[Vector[Double]] = Vector(v25, v21)
    val v31: Vector[Vector[Double]] = v43.p1
    val v96: Vector[Double] = v10(0)
    val v27: Vector[Vector[Double]] = v16.p1
    val v46: Vector[Double] = v28(0)
    v11 = v11.copy(p0 = v29)
    v7 = v7.copy(p0 = v20)
    var v50: Vector[Double] = v46
    val v85: Vector[Double] = v4(1)
    var v79: Vector[Vector[Double]] = v29
    v79 = v79.updated(1, v50)
    val v91: Vector[Double] = v31(1)
    var v39: Vector[Vector[Double]] = v45
    v9 = v9.updated(1, v51)
    var v86: Vector[Vector[Double]] = v24
    v11 = v11.copy(p1 = v48)
    v11 = v11.copy(p0 = v39)
    var v100: Vector[Double] = v91
    var v116: Double = v40
    var v77: Vector[Double] = v85
    v11 = v11.copy(p1 = v3)
    v86 = v86.updated(2, v100)
    var v47: Double = v116
    var v117: Vector[Double] = v96
    v1 = v1.updated(1, v42)
    v11 = v11.copy(p1 = v9)
    var v66: Vector[Double] = v34
    var v122: Double = v116
    val v97: Double = v66(0)
    v122 = v116
    v77 = v77.updated(0, v47)
    v117 = v117.updated(0, v116)
    v16 = v16.copy(p1 = v27)
    v11 = v11.copy(p1 = v1)
    var v62: Vector[Vector[Double]] = v2
    v79 = v79.updated(0, v77)
    val v125: Double = v25(0)
    v7 = v7.copy(p0 = v29)
    v9 = v9.updated(1, v117)
    val v69: Vector[Double] = Vector(v122, v125)
    v79 = v79.updated(2, v21)
    val v56: Double = v69(1)
    v77 = v77.updated(0, v97)
    v16 = v16.copy(p0 = v45)
    val v52: Double = v69(0)
    v7 = v7.copy(p0 = v62)
    v62 = v62.updated(0, v25)
    v47 = v52
    val v184: Vector[Vector[Double]] = v16.p1
    var v142: s0 = v7
    v26 = v26.updated(1, v77)
    v4 = v4.updated(1, v85)
    v100 = v100.updated(0, v56)
    val v133: Vector[Vector[Double]] = v142.p0
    val v175: Vector[Double] = v184(1)
    v7 = v7.copy(p0 = v79)
    v39 = v39.updated(2, v175)
    v11 = v11.copy(p0 = v86)
    v11 = v11.copy(p1 = v1)
    v16 = v16.copy(p0 = v133)
    v11
  }
  def f26(v0: s2): s2 = {
    var v5: s2 = v0
    v5 = v0
    val v7: s2 = f49(v5)
    var v8: s2 = v7
    val v4: Vector[s1] = v7.p0
    val v10: s2 = f41(v8)
    v8 = v8.copy(p0 = v4)
    v10
  }
  def f19(v0: s1): s1 = {
    val v7: s1 = f56(v0)
    v7
  }
  def f17(v0: s2): s2 = {
    val v5: Vector[s2] = Vector(v0, v0, v0, v0, v0, v0)
    val v6: s2 = f50(v0)
    val v2: s2 = v5(4)
    val v7: s2 = f41(v2)
    var v8: Vector[s2] = v5
    val v1: s2 = f26(v2)
    var v21: Vector[s2] = v8
    v21 = v21.updated(0, v7)
    v21 = v21.updated(1, v6)
    v21 = v21.updated(0, v7)
    val v45: s2 = v8(5)
    v21 = v21.updated(5, v45)
    val v101: s2 = v21(1)
    v21 = v21.updated(1, v1)
    val v130: s2 = f41(v7)
    v8 = v8.updated(1, v130)
    v101
  }
  def f12(v0: s1, v1: s2): s1 = {
    val v4: Vector[s1] = Vector(v0)
    val v6: s0 = v0.p1
    val v3: s1 = v4(0)
    val v8: s0 = f27(v6)
    val v7: s0 = f27(v6)
    val v5: Vector[Vector[s0]] = v1.p1
    val v9: Vector[s0] = v5(0)
    var v12: Vector[s1] = v4
    val v20: s1 = f19(v0)
    v12 = v12.updated(0, v3)
    val v11: s1 = v12(0)
    v12 = v4
    var v30: Vector[s0] = v9
    var v35: s1 = v11
    val v15: s0 = f27(v7)
    val v18: Vector[s0] = v0.p0
    var v83: Vector[s0] = v30
    val v34: s1 = s1(v18, v15)
    val v25: Vector[s1] = Vector(v34, v35, v35, v20, v0, v0)
    val v22: s1 = s1(v83, v8)
    v83 = v30
    val v41: s1 = f19(v0)
    v12 = v12.updated(0, v11)
    val v69: s1 = v25(5)
    v12 = v12.updated(0, v41)
    v30 = v30.updated(0, v15)
    val v48: s0 = f27(v7)
    v83 = v83.updated(0, v48)
    val v171: s0 = v34.p1
    v35 = v35.copy(p1 = v48)
    v12 = v12.updated(0, v22)
    v83 = v83.updated(0, v171)
    v69
  }
  @noinline
  def f0(v0: s1, v1: s2, v2: Double): Double = {
    val v7: s2 = f17(v1)
    val v11: s2 = f26(v7)
    val v19: s1 = f12(v0, v11)
    val v20: s1 = f12(v19, v7)
    val v34: Vector[s0] = v20.p0
    val v21: s0 = v34(0)
    val v42: Vector[Vector[Double]] = v21.p0
    val v45: Vector[Double] = v42(1)
    var v96: Vector[Double] = v45
    val v74: Double = v45(0)
    val v61: Double = v96(0)
    v96 = v96.updated(0, v74)
    v96 = v96.updated(0, v61)
    v61
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))
    val v1: s2 = s2(Vector(s1(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s1(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))
    val v2: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}