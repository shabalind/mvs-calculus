import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: Vector[s0],
    p3: s0,
    p4: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f43(v0: s1): s1 = {
    val v7: Vector[s0] = v0.p2
    val v6: s0 = v0.p3
    var v5: Vector[s0] = v7
    var v16: s1 = v0
    var v13: Vector[s0] = v7
    val v10: Vector[Vector[Double]] = v6.p0
    val v18: s0 = v13(0)
    v13 = v13.updated(0, v18)
    v5 = v5.updated(0, v18)
    v16 = v16.copy(p4 = v18)
    v16 = v16.copy(p4 = v18)
    v5 = v5.updated(0, v6)
    var v17: s1 = v16
    v16 = v16.copy(p4 = v6)
    val v36: Vector[Vector[Double]] = v18.p0
    var v27: Vector[s0] = v7
    val v40: Vector[Vector[s0]] = v17.p1
    val v88: s0 = v5(0)
    val v57: s0 = v7(0)
    val v37: Vector[Vector[Double]] = v18.p0
    v13 = v13.updated(0, v57)
    val v44: s0 = v17.p3
    var v38: Vector[Vector[s0]] = v40
    v17 = v17.copy(p2 = v13)
    val v54: Vector[s0] = v38(0)
    v17 = v17.copy(p4 = v44)
    v5 = v5.updated(0, v57)
    v13 = v13.updated(0, v44)
    var v39: Vector[Vector[s0]] = v38
    var v75: s0 = v88
    v16 = v16.copy(p0 = v88)
    v39 = v39.updated(1, v54)
    var v31: s0 = v44
    v31 = v31.copy(p0 = v10)
    v31 = v31.copy(p0 = v37)
    v75 = v75.copy(p0 = v36)
    val v74: s0 = v13(0)
    val v66: Vector[Vector[Double]] = v6.p0
    val v131: s0 = v5(0)
    v13 = v13.updated(0, v75)
    val v71: s1 = s1(v88, v39, v5, v31, v74)
    v31 = v31.copy(p0 = v66)
    v13 = v13.updated(0, v131)
    v38 = v38.updated(1, v27)
    v17 = v17.copy(p2 = v54)
    v17 = v16
    v71
  }
  def f41(v0: s1): s1 = {
    val v1: s0 = v0.p4
    val v2: Vector[s0] = v0.p2
    var v4: s1 = v0
    v4 = v4.copy(p0 = v1)
    var v8: s0 = v1
    v4 = v4.copy(p3 = v8)
    v4 = v4.copy(p0 = v8)
    val v11: s0 = v2(0)
    v8 = v11
    val v17: s1 = f43(v4)
    v17
  }
  def f35(v0: s1): s1 = {
    val v6: s1 = f43(v0)
    val v1: s1 = f41(v0)
    val v8: s1 = f41(v0)
    val v7: s1 = f41(v0)
    val v9: s1 = f41(v8)
    val v15: s1 = f43(v8)
    val v26: s1 = f43(v9)
    val v31: s1 = f43(v9)
    val v19: s1 = f41(v26)
    val v96: s1 = f41(v19)
    val v22: Vector[s1] = Vector(v0, v96, v31, v6, v7, v15, v1)
    val v63: s1 = v22(3)
    v63
  }
  def f31(v0: s0): s0 = {
    var v5: s0 = v0
    var v7: s0 = v5
    val v4: Vector[Vector[Double]] = v7.p0
    val v2: Vector[Vector[Double]] = v5.p0
    v7 = v7.copy(p0 = v2)
    v5 = v5.copy(p0 = v2)
    v5 = v5.copy(p0 = v2)
    v7 = v7.copy(p0 = v4)
    val v14: Vector[Vector[Double]] = v5.p0
    var v11: s0 = v7
    v5 = v5.copy(p0 = v2)
    v11 = v11.copy(p0 = v14)
    val v22: Vector[Vector[Double]] = v11.p0
    var v17: s0 = v11
    v7 = v7.copy(p0 = v14)
    v17 = v17.copy(p0 = v22)
    v17
  }
  def f30(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(0)
    val v7: Vector[Vector[Double]] = v4.p0
    val v1: Vector[Vector[Double]] = v4.p0
    val v6: Vector[Vector[Double]] = v4.p0
    val v3: Vector[Vector[Double]] = v4.p0
    val v20: Vector[Vector[Double]] = v4.p0
    val v11: s0 = f31(v4)
    val v16: Vector[Vector[Double]] = v11.p0
    var v22: s0 = v11
    v22 = v4
    val v18: s0 = f31(v4)
    v22 = v22.copy(p0 = v3)
    v22 = v22.copy(p0 = v6)
    val v25: s0 = v0(0)
    v22 = v22.copy(p0 = v1)
    v22 = v22.copy(p0 = v16)
    val v15: s0 = f31(v25)
    val v36: Vector[Vector[Double]] = v22.p0
    v22 = v22.copy(p0 = v20)
    val v27: s0 = v0(0)
    val v39: Vector[Vector[Double]] = v22.p0
    val v35: Vector[Vector[Double]] = v25.p0
    v22 = v22.copy(p0 = v7)
    val v50: s0 = f31(v15)
    v22 = v22.copy(p0 = v6)
    val v38: s0 = f31(v50)
    val v47: Vector[Vector[Double]] = v38.p0
    v22 = v18
    v22 = v22.copy(p0 = v47)
    val v49: s0 = f31(v27)
    val v61: s0 = f31(v49)
    v22 = v22.copy(p0 = v1)
    var v135: s0 = v61
    var v183: Vector[Vector[Double]] = v36
    v135 = v135.copy(p0 = v39)
    v22 = v22.copy(p0 = v183)
    var v62: Vector[s0] = v0
    v135 = v135.copy(p0 = v35)
    var v283: Vector[s0] = v62
    v62 = v62.updated(0, v135)
    v283
  }
  def f26(v0: s1): s1 = {
    val v5: s0 = v0.p4
    var v8: s1 = v0
    val v1: Vector[s0] = v8.p2
    val v6: s0 = f31(v5)
    var v4: s1 = v0
    val v2: Vector[s0] = f30(v1)
    v4 = v4.copy(p3 = v6)
    val v7: s0 = v1(0)
    v8 = v8.copy(p0 = v5)
    val v19: s1 = f43(v0)
    val v45: Vector[s1] = Vector(v19, v19, v8, v0, v0, v8, v8)
    v4 = v4.copy(p0 = v5)
    val v30: s0 = v2(0)
    v8 = v8.copy(p4 = v30)
    var v29: Vector[s1] = v45
    v8 = v8.copy(p4 = v7)
    val v17: s1 = f41(v4)
    val v42: s1 = f41(v17)
    v4 = v4.copy(p0 = v5)
    v29 = v29.updated(2, v42)
    v29 = v45
    val v68: s1 = v29(0)
    val v52: s1 = f43(v68)
    v52
  }
  def f18(v0: s0): s0 = {
    var v7: s0 = v0
    val v1: Vector[Vector[Double]] = v0.p0
    v7 = v7.copy(p0 = v1)
    val v6: s0 = f31(v0)
    v7 = v6
    val v17: Vector[Vector[Double]] = v6.p0
    v7 = v7.copy(p0 = v17)
    v7
  }
  def f8(v0: s1): s1 = {
    val v6: s1 = f26(v0)
    val v3: s0 = v6.p0
    val v8: s1 = f35(v6)
    var v52: s1 = v8
    v52 = v52.copy(p0 = v3)
    var v104: s1 = v52
    val v124: s1 = f35(v104)
    v124
  }
  def f7(v0: s1): s1 = {
    val v6: Vector[Vector[s0]] = v0.p1
    val v7: Vector[s0] = v6(0)
    val v2: s0 = v0.p0
    val v5: s0 = f18(v2)
    val v3: s1 = s1(v5, v6, v7, v5, v5)
    val v11: Vector[s0] = v0.p2
    val v25: s1 = f35(v3)
    var v23: s1 = v25
    v23 = v23.copy(p3 = v2)
    val v41: s1 = f26(v23)
    val v50: s1 = f8(v23)
    val v74: s0 = v7(0)
    v23 = v23.copy(p2 = v11)
    v23 = v23.copy(p0 = v74)
    val v52: Vector[s1] = Vector(v41, v23, v50, v25)
    val v117: s1 = v52(3)
    v117
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s1, v2: s1, v3: Double): Double = {
    val v9: s1 = f7(v2)
    val v12: s0 = v9.p3
    val v5: Vector[Vector[Double]] = v12.p0
    var v15: Vector[Vector[Double]] = v5
    val v23: Vector[Double] = v15(1)
    v15 = v15.updated(0, v23)
    var v20: Vector[Double] = v23
    v15 = v15.updated(0, v20)
    val v74: Double = v20(0)
    v74
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0))), s0(Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)))))), Vector(s2(Vector(s0(Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0))), s0(Vector(Vector(14.0), Vector(15.0)))))))
    val v1: s1 = s1(s0(Vector(Vector(16.0), Vector(17.0))), Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0))))), Vector(s0(Vector(Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0))))
    val v2: s1 = s1(s0(Vector(Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0))))), Vector(s0(Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0))), s0(Vector(Vector(38.0), Vector(39.0))))
    val v3: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}