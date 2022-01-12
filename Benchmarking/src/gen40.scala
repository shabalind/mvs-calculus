import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  def f67(v0: s2): s2 = {
    val v5: s1 = v0.p0
    val v2: Vector[s2] = Vector(v0, v0, v0, v0, v0, v0)
    val v7: Vector[s0] = v5.p1
    val v4: s0 = v7(0)
    val v8: s0 = v5.p0
    var v1: s1 = v5
    var v3: Vector[s0] = v7
    val v11: s0 = v3(0)
    v3 = v3.updated(0, v8)
    var v10: Vector[s2] = v2
    var v17: s0 = v4
    v3 = v3.updated(0, v17)
    v1 = v1.copy(p0 = v11)
    val v19: s1 = v0.p1
    val v23: s2 = v10(1)
    val v27: s2 = s2(v19, v1)
    v10 = v10.updated(1, v27)
    v23
  }
  def f62(v0: s2): s2 = {
    var v4: s2 = v0
    var v7: s2 = v0
    var v9: s2 = v0
    var v11: s2 = v7
    val v2: s2 = f67(v4)
    var v6: s2 = v7
    var v3: s2 = v9
    val v13: s2 = f67(v0)
    var v5: s2 = v11
    val v23: s1 = v13.p0
    val v15: s2 = f67(v6)
    v11 = v11.copy(p0 = v23)
    var v1: s1 = v23
    val v21: s1 = v15.p0
    val v38: s2 = f67(v6)
    v3 = v3.copy(p1 = v21)
    v6 = v6.copy(p0 = v1)
    v6 = v3
    val v44: s1 = v5.p0
    val v91: s2 = f67(v2)
    val v112: s1 = v91.p1
    val v110: s1 = v91.p0
    val v249: Vector[s2] = Vector(v38)
    val v82: Vector[s0] = v112.p1
    val v114: s1 = v0.p1
    val v102: Vector[Vector[s2]] = Vector(v249, v249, v249, v249, v249, v249)
    val v68: Vector[s1] = Vector(v44, v114, v44)
    val v85: s1 = v68(1)
    val v106: s1 = v91.p1
    v9 = v9.copy(p0 = v110)
    val v59: Vector[s2] = v102(3)
    v11 = v11.copy(p0 = v21)
    v1 = v1.copy(p1 = v82)
    v11 = v11.copy(p1 = v85)
    v3 = v3.copy(p1 = v44)
    val v201: s2 = v59(0)
    val v126: s2 = f67(v201)
    v11 = v11.copy(p0 = v106)
    v126
  }
  def f52(v0: s0): s0 = {
    v0
  }
  def f48(v0: s1): s1 = {
    val v4: Vector[s1] = Vector(v0, v0)
    val v1: s0 = v0.p0
    val v2: s0 = f52(v1)
    val v8: Vector[Vector[s1]] = Vector(v4, v4, v4)
    val v6: s0 = f52(v2)
    var v24: Vector[Vector[s1]] = v8
    val v19: Vector[s1] = v24(2)
    val v14: Vector[s1] = v8(2)
    val v43: Vector[s0] = v0.p1
    var v39: s1 = v0
    var v26: s1 = v39
    v39 = v39.copy(p0 = v6)
    v24 = v24.updated(1, v14)
    var v61: Vector[s1] = v19
    val v76: s1 = v61(0)
    val v38: s1 = v61(0)
    v39 = v39.copy(p1 = v43)
    var v62: Vector[s0] = v43
    v39 = v39.copy(p1 = v62)
    v26 = v26.copy(p1 = v43)
    val v247: s0 = v39.p0
    v39 = v39.copy(p0 = v247)
    v61 = v61.updated(0, v26)
    v61 = v61.updated(0, v76)
    v38
  }
  def f47(v0: s2): s2 = {
    val v8: s1 = v0.p1
    val v4: s1 = f48(v8)
    var v5: s1 = v4
    var v9: s2 = v0
    var v6: s2 = v9
    v9 = v9.copy(p1 = v5)
    val v12: s2 = f67(v6)
    v6 = v6.copy(p0 = v5)
    v12
  }
  def f45(v0: s1): s1 = {
    var v2: s1 = v0
    var v4: s1 = v2
    var v5: s1 = v4
    v5
  }
  def f40(v0: s1, v1: s2): s1 = {
    val v2: Vector[s0] = v0.p1
    val v9: s0 = v2(0)
    var v16: Vector[s0] = v2
    v16 = v16.updated(0, v9)
    val v20: s1 = s1(v9, v16)
    val v51: s1 = f45(v20)
    v51
  }
  def f27(v0: s2): s2 = {
    var v3: s2 = v0
    v3 = v0
    var v6: s2 = v0
    var v5: s2 = v3
    var v2: s2 = v3
    val v9: s1 = v6.p1
    v3 = v3.copy(p0 = v9)
    val v7: s2 = f67(v5)
    v6 = v6.copy(p1 = v9)
    val v15: s1 = v6.p0
    v2 = v2.copy(p1 = v9)
    var v4: s2 = v0
    var v10: s2 = v0
    val v8: s1 = v5.p0
    var v17: s1 = v9
    v6 = v5
    v5 = v5.copy(p1 = v17)
    val v28: s1 = f40(v8, v5)
    val v21: s1 = v4.p1
    var v18: s2 = v7
    var v30: s2 = v2
    val v19: s1 = f48(v8)
    val v37: s1 = f40(v19, v30)
    val v27: s1 = f48(v28)
    v5 = v7
    val v51: s1 = f40(v9, v10)
    val v59: s1 = f48(v27)
    val v34: s1 = f40(v51, v18)
    v2 = v2.copy(p0 = v59)
    v4 = v4.copy(p1 = v17)
    v2 = v2.copy(p1 = v17)
    val v87: s1 = f48(v19)
    var v35: s2 = v10
    v3 = v3.copy(p1 = v87)
    v2 = v2.copy(p0 = v21)
    val v54: s1 = f48(v17)
    v6 = v6.copy(p0 = v51)
    v18 = v18.copy(p0 = v17)
    v10 = v10.copy(p1 = v15)
    v5 = v5.copy(p0 = v21)
    val v109: s1 = f48(v54)
    v2 = v3
    v4 = v4.copy(p1 = v17)
    v35 = v35.copy(p0 = v34)
    v18 = v18.copy(p0 = v27)
    v35 = v35.copy(p1 = v17)
    v30 = v30.copy(p0 = v51)
    val v205: s1 = f48(v109)
    v6 = v6.copy(p0 = v37)
    v2 = v2.copy(p0 = v205)
    v35
  }
  def f21(v0: s2): s2 = {
    var v7: s2 = v0
    val v6: s2 = f27(v0)
    val v2: s1 = v0.p0
    val v13: s2 = f47(v7)
    var v1: s1 = v2
    val v5: s1 = v13.p0
    val v12: s0 = v2.p0
    val v15: s0 = v1.p0
    val v10: s0 = f52(v15)
    val v23: s2 = f67(v7)
    var v32: s0 = v12
    v32 = v12
    v32 = v15
    var v14: s1 = v5
    val v11: s2 = f27(v6)
    v32 = v10
    val v17: Vector[s0] = v14.p1
    val v46: s1 = s1(v15, v17)
    var v31: s1 = v14
    v31 = v5
    v7 = v7.copy(p1 = v46)
    val v27: s2 = f62(v0)
    v31 = v31.copy(p0 = v32)
    val v26: s2 = f67(v27)
    v7 = v7.copy(p0 = v31)
    var v71: s0 = v15
    var v48: s2 = v26
    val v70: Vector[s2] = Vector(v6, v11, v48, v23)
    val v68: s2 = v70(3)
    v14 = v14.copy(p1 = v17)
    var v95: s2 = v68
    v95 = v95.copy(p1 = v5)
    v31 = v31.copy(p0 = v71)
    v95
  }
  def f10(v0: s1): s1 = {
    val v1: s1 = f45(v0)
    val v2: s1 = f45(v0)
    var v6: s1 = v0
    val v7: s1 = f45(v1)
    var v3: s1 = v2
    val v19: s0 = v7.p0
    var v12: s1 = v3
    v3 = v6
    val v43: s0 = v0.p0
    v6 = v6.copy(p0 = v19)
    v12 = v12.copy(p0 = v43)
    v12
  }
  def f5(v0: s1): s1 = {
    val v4: Vector[s0] = v0.p1
    val v5: s2 = s2(v0, v0)
    val v3: s2 = f21(v5)
    val v13: s1 = v5.p1
    val v30: s1 = v3.p0
    val v14: s2 = f62(v5)
    val v23: s2 = s2(v0, v13)
    val v19: s2 = f62(v23)
    val v26: Vector[s0] = v0.p1
    val v17: s0 = v26(0)
    val v38: s2 = f67(v23)
    val v87: s1 = v5.p1
    var v27: s2 = v19
    val v33: s2 = f21(v14)
    v27 = v27.copy(p1 = v30)
    var v50: s1 = v87
    val v59: s1 = v33.p0
    val v61: s1 = f45(v50)
    v50 = v50.copy(p1 = v4)
    val v46: s1 = f40(v50, v38)
    v27 = v27.copy(p1 = v61)
    val v83: s1 = v14.p0
    val v116: s1 = f40(v83, v3)
    v27 = v27.copy(p0 = v46)
    v50 = v50.copy(p0 = v17)
    val v45: s1 = f40(v59, v27)
    v27 = v27.copy(p1 = v116)
    val v101: s1 = v19.p0
    v50 = v101
    v45
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v5: s0 = v0.p0
    val v4: s1 = f5(v0)
    var v7: s0 = v5
    val v10: Vector[Vector[Double]] = v7.p0
    val v9: Vector[Double] = v10(0)
    val v6: Vector[Vector[Double]] = v5.p0
    val v20: Double = v9(0)
    val v11: s1 = f10(v4)
    var v12: s0 = v7
    var v27: Vector[Vector[Double]] = v10
    val v15: Vector[Double] = v27(0)
    v7 = v7.copy(p0 = v27)
    v7 = v7.copy(p0 = v10)
    v27 = v6
    val v22: Double = v15(0)
    v27 = v27.updated(0, v15)
    var v16: Double = v20
    val v35: Double = v15(0)
    val v23: s1 = f10(v11)
    val v26: Vector[Double] = Vector(v35, v35, v22, v22, v16, v35)
    val v30: Vector[Double] = v10(0)
    val v24: Vector[Vector[Double]] = v12.p1
    val v95: Double = v30(0)
    val v46: Vector[Double] = v27(0)
    v27 = v27.updated(0, v46)
    val v59: Vector[Double] = v24(1)
    val v84: Double = v15(0)
    val v66: Double = v26(4)
    val v176: s0 = v23.p0
    val v141: Vector[Vector[Double]] = v176.p1
    v12 = v12.copy(p1 = v141)
    v12 = v12.copy(p1 = v141)
    v16 = v84
    v27 = v27.updated(0, v59)
    v16 = v95
    v66
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}