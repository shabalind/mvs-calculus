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
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f46(v0: s0): s0 = {
    var v4: s0 = v0
    val v6: Vector[s0] = Vector(v0, v4)
    var v1: s0 = v4
    v4 = v0
    var v11: s0 = v1
    val v3: Vector[Vector[Double]] = v0.p0
    v11 = v11.copy(p0 = v3)
    val v8: Vector[Vector[Double]] = v11.p1
    val v17: s0 = v6(1)
    val v10: Vector[Vector[Double]] = v17.p1
    var v23: Vector[Vector[Double]] = v8
    var v20: Vector[Vector[Double]] = v23
    v20 = v10
    v4 = v4.copy(p1 = v20)
    v1 = v1.copy(p0 = v3)
    v4 = v4.copy(p1 = v20)
    v4 = v4.copy(p1 = v20)
    var v16: s0 = v11
    v4 = v4.copy(p1 = v10)
    v16
  }
  def f42(v0: s1): s1 = {
    var v4: s1 = v0
    val v7: s0 = v0.p0
    val v2: s0 = f46(v7)
    val v1: s0 = v0.p0
    var v3: s0 = v2
    val v11: s0 = v4.p1
    val v5: s0 = f46(v3)
    val v12: Vector[Vector[Double]] = v11.p1
    v4 = v4.copy(p1 = v1)
    val v15: s1 = s1(v1, v5)
    v3 = v3.copy(p1 = v12)
    v15
  }
  def f40(v0: s0): s0 = {
    val v6: s0 = f46(v0)
    val v13: Vector[Vector[Double]] = v6.p0
    val v25: s0 = f46(v0)
    val v26: s0 = f46(v25)
    var v33: s0 = v25
    v33 = v33.copy(p0 = v13)
    v33 = v26
    val v32: s0 = f46(v33)
    val v51: s0 = f46(v32)
    v51
  }
  def f33(v0: s0): s0 = {
    var v6: s0 = v0
    val v3: Vector[Vector[Double]] = v6.p0
    val v2: Vector[Double] = v3(0)
    var v8: Vector[Double] = v2
    val v4: s0 = f46(v0)
    v6 = v6.copy(p0 = v3)
    val v5: Vector[Vector[Double]] = v0.p0
    val v1: s1 = s1(v4, v6)
    val v13: s0 = v1.p1
    val v14: s0 = f46(v0)
    val v23: Vector[Double] = v3(1)
    var v15: Vector[Vector[Double]] = v5
    val v11: s1 = s1(v4, v14)
    v15 = v15.updated(0, v8)
    val v12: Double = v23(0)
    val v7: Vector[Double] = v3(1)
    val v18: s0 = v11.p0
    val v28: s0 = f46(v14)
    val v16: Vector[Double] = v5(1)
    val v19: s1 = f42(v11)
    var v24: Vector[Vector[Double]] = v3
    val v25: s1 = f42(v1)
    val v32: s0 = v25.p0
    v8 = v7
    v6 = v6.copy(p0 = v5)
    val v43: s0 = f46(v28)
    var v20: Vector[Vector[Double]] = v15
    val v22: s0 = f40(v13)
    val v42: Double = v2(0)
    val v30: Vector[s1] = Vector(v19, v25, v11, v19, v11, v1, v25)
    v20 = v5
    val v33: s0 = f46(v43)
    val v61: Vector[Double] = v24(0)
    v6 = v6.copy(p0 = v5)
    v15 = v15.updated(1, v61)
    var v60: Vector[s1] = v30
    var v35: Vector[Vector[Double]] = v24
    v24 = v24.updated(0, v16)
    val v66: s1 = v60(5)
    val v75: s0 = v11.p1
    v35 = v35.updated(1, v8)
    v35 = v3
    var v41: Vector[Double] = v8
    v6 = v6.copy(p0 = v20)
    val v51: Vector[Vector[Double]] = v22.p1
    val v96: Vector[Vector[Double]] = v0.p0
    val v40: s1 = f42(v66)
    var v101: Vector[Vector[Double]] = v51
    val v65: s0 = v40.p0
    v6 = v6.copy(p0 = v5)
    val v94: s1 = f42(v66)
    val v64: Vector[s0] = Vector(v0, v65)
    var v83: Double = v12
    val v142: Vector[Vector[Double]] = v75.p0
    v24 = v24.updated(1, v41)
    val v58: s0 = v64(1)
    val v73: Vector[Vector[Double]] = v18.p1
    val v123: s1 = f42(v94)
    val v105: s0 = f40(v32)
    v6 = v6.copy(p1 = v101)
    v20 = v20.updated(0, v61)
    var v86: Vector[Double] = v41
    val v133: s0 = v11.p0
    val v89: Vector[Vector[Double]] = v105.p0
    v6 = v6.copy(p0 = v35)
    v6 = v6.copy(p0 = v3)
    val v52: s0 = f40(v133)
    val v137: Vector[Vector[Double]] = v58.p1
    val v108: Vector[Vector[Double]] = v0.p1
    val v144: Double = v12 * v42
    val v208: s1 = f42(v123)
    v6 = v6.copy(p1 = v73)
    v8 = v8.updated(0, v83)
    v6 = v6.copy(p1 = v108)
    val v117: Vector[Vector[Double]] = v52.p0
    v6 = v6.copy(p0 = v96)
    val v155: s0 = v208.p0
    var v69: Vector[Vector[Double]] = v117
    v6 = v6.copy(p0 = v89)
    var v291: s0 = v155
    val v162: Vector[Vector[Double]] = v33.p1
    v291 = v291.copy(p0 = v142)
    v86 = v86.updated(0, v144)
    v291 = v291.copy(p1 = v162)
    v8 = v86
    v291 = v291.copy(p1 = v137)
    v6 = v6.copy(p0 = v69)
    v6 = v6.copy(p0 = v35)
    v291
  }
  def f26(v0: Double): Double = {
    var v6: Double = v0
    var v3: Double = v0
    var v7: Double = v3
    var v5: Double = v0
    var v2: Double = v5
    var v1: Double = v7
    var v8: Double = v5
    v7 = v0
    var v4: Double = v2
    var v18: Double = v8
    val v19: Double = v0 + v3
    var v12: Double = v2
    val v11: Double = v0 - v6
    var v13: Double = v4
    v18 = v0
    v5 = v2
    var v16: Double = v11
    var v25: Double = v1
    var v30: Double = v18
    var v17: Double = v12
    val v46: Double = v30 + v6
    val v9: Vector[Double] = Vector(v25, v5, v17, v46, v16, v17)
    val v23: Vector[Double] = Vector(v30, v25, v19, v11, v13, v6)
    val v22: Double = v23(3)
    var v26: Vector[Double] = v9
    val v29: Double = v26(0)
    v26 = v26.updated(0, v6)
    val v48: Vector[Double] = Vector(v22, v30, v11, v4, v29)
    v26 = v26.updated(2, v5)
    var v39: Vector[Double] = v48
    val v58: Double = v39(1)
    v58
  }
  def f23(v0: s0, v1: s0): s0 = {
    val v5: s0 = f46(v1)
    val v4: Vector[Vector[Double]] = v1.p0
    val v13: Vector[Vector[Double]] = v5.p1
    val v9: Vector[Double] = v4(1)
    val v28: Double = v9(0)
    val v18: Vector[Vector[Double]] = v1.p0
    val v15: Vector[Double] = v13(0)
    var v20: Vector[Double] = v9
    val v12: Vector[Vector[Double]] = v1.p1
    val v65: Double = f26(v28)
    val v24: Double = f26(v65)
    v20 = v20.updated(0, v65)
    v20 = v20.updated(0, v65)
    var v17: Vector[Vector[Double]] = v4
    v17 = v17.updated(1, v20)
    v20 = v20.updated(0, v28)
    v17 = v17.updated(1, v15)
    v20 = v20.updated(0, v24)
    val v26: Double = v9(0)
    val v30: s0 = s0(v17, v12)
    val v27: Vector[Double] = v12(1)
    v17 = v17.updated(0, v27)
    v20 = v20.updated(0, v26)
    var v53: s0 = v30
    var v51: Vector[Vector[Double]] = v18
    v53 = v53.copy(p0 = v51)
    v17 = v18
    v53
  }
  def f21(v0: s2): s2 = {
    v0
  }
  def f20(v0: s2): s2 = {
    var v1: s2 = v0
    v1 = v0
    val v35: Vector[Vector[s0]] = v1.p0
    val v88: s2 = f21(v1)
    v1 = v1.copy(p0 = v35)
    v88
  }
  def f18(v0: s2): s2 = {
    val v5: s2 = f21(v0)
    val v26: s2 = f20(v0)
    val v46: Vector[Vector[s0]] = v5.p0
    val v159: s2 = f21(v26)
    var v112: s2 = v159
    v112 = v112.copy(p0 = v46)
    val v254: s2 = f20(v112)
    v254
  }
  def f9(v0: s2): s2 = {
    v0
  }
  def f6(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0, v0, v0, v0, v0)
    val v7: s1 = s1(v0, v0)
    val v3: s0 = v1(2)
    val v6: s0 = v1(3)
    val v9: s0 = v7.p1
    val v2: Vector[Vector[Double]] = v3.p1
    val v12: Vector[Double] = v2(0)
    var v15: Vector[Vector[Double]] = v2
    v15 = v15.updated(0, v12)
    var v14: s0 = v9
    var v25: Vector[Vector[Double]] = v15
    v14 = v14.copy(p1 = v2)
    val v19: s0 = f23(v14, v14)
    val v28: Vector[Vector[Double]] = v3.p1
    val v22: s0 = f33(v19)
    v14 = v14.copy(p1 = v15)
    v14 = v14.copy(p1 = v25)
    v14 = v14.copy(p1 = v28)
    v14 = v6
    v22
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v5: s2 = v0(0)
    var v7: Vector[s2] = v0
    val v2: s2 = f9(v5)
    v7 = v7.updated(0, v2)
    val v4: s2 = f9(v2)
    val v9: s2 = v7(0)
    val v15: s2 = f9(v2)
    var v8: s2 = v9
    v7 = v7.updated(0, v2)
    val v14: s2 = v7(0)
    val v29: s2 = f18(v4)
    val v17: s2 = f18(v14)
    val v21: s0 = v9.p1
    val v33: s0 = f6(v21)
    v7 = v7.updated(0, v15)
    val v35: s0 = v17.p1
    val v25: s0 = f33(v33)
    val v67: Vector[Vector[Double]] = v35.p1
    var v37: s0 = v25
    var v34: Vector[Vector[Double]] = v67
    v37 = v37.copy(p1 = v34)
    v7 = v7.updated(0, v5)
    val v50: Vector[Double] = v34(0)
    val v48: Double = v50(0)
    val v117: Vector[Vector[Double]] = v37.p1
    v8 = v5
    v7 = v7.updated(0, v8)
    val v87: Vector[Double] = v117(2)
    v7 = v7.updated(0, v29)
    var v151: Double = v48
    v34 = v34.updated(1, v87)
    v151
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}