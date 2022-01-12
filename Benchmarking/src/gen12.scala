import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: s0
  )
  case class s6 (
    p0: Vector[Double],
    p1: Vector[s1]
  )
  def f93(v0: Double): Double = {
    var v1: Double = v0
    var v7: Double = v1
    var v3: Double = v7
    v1 = v7
    var v10: Double = v0
    var v4: Double = v10
    var v12: Double = v4
    var v9: Double = v3
    var v11: Double = v12
    val v28: Vector[Double] = Vector(v9, v11)
    var v32: Vector[Double] = v28
    v32 = v32.updated(1, v9)
    val v73: Double = v32(0)
    v73
  }
  def f90(v0: s0): s0 = {
    var v7: s0 = v0
    var v2: s0 = v7
    val v1: Vector[Vector[Double]] = v0.p0
    v2 = v2.copy(p0 = v1)
    val v21: Vector[Vector[Double]] = v7.p1
    v2 = v2.copy(p1 = v21)
    v2
  }
  def f88(v0: s4): s4 = {
    var v5: s4 = v0
    val v3: s0 = v5.p1
    val v7: s0 = v5.p1
    val v17: s0 = f90(v3)
    val v6: s0 = f90(v7)
    v5 = v5.copy(p1 = v3)
    val v19: s1 = v5.p0
    val v10: s0 = f90(v6)
    val v14: s0 = f90(v6)
    v5 = v5.copy(p1 = v17)
    val v12: s4 = s4(v19, v6)
    val v21: s0 = f90(v14)
    val v13: s1 = v12.p0
    v5 = v5.copy(p0 = v19)
    val v18: s4 = s4(v13, v10)
    v5 = v5.copy(p1 = v21)
    var v41: s4 = v18
    v5 = v41
    v18
  }
  def f79(v0: s6): s6 = {
    val v7: Vector[s1] = v0.p1
    val v4: Vector[Vector[s1]] = Vector(v7, v7)
    val v2: Vector[s1] = v4(0)
    val v5: s1 = v7(1)
    var v11: s1 = v5
    var v6: s6 = v0
    val v3: s1 = v7(1)
    v6 = v6.copy(p1 = v2)
    val v9: Vector[s1] = v6.p1
    val v8: Vector[s1] = v4(1)
    var v12: Vector[s1] = v8
    var v10: Vector[Vector[s1]] = v4
    v6 = v6.copy(p1 = v8)
    val v1: Vector[s1] = v10(0)
    v6 = v6.copy(p1 = v8)
    v6 = v6.copy(p1 = v1)
    val v30: s1 = v1(1)
    val v20: Vector[Vector[s0]] = v11.p0
    val v36: Vector[Vector[s0]] = v5.p0
    v6 = v6.copy(p1 = v1)
    var v22: Vector[Vector[s0]] = v20
    var v17: s1 = v30
    v12 = v12.updated(0, v5)
    val v18: s0 = v5.p1
    var v19: s1 = v17
    val v23: Vector[s0] = v22(0)
    val v24: Vector[s6] = Vector(v6, v0, v6, v0, v6, v0)
    v17 = v17.copy(p1 = v18)
    v11 = v11.copy(p1 = v18)
    val v33: s0 = v23(0)
    var v21: s6 = v0
    var v40: Vector[Vector[s0]] = v20
    val v16: s0 = f90(v33)
    val v28: s6 = v24(0)
    var v44: Vector[s0] = v23
    v11 = v17
    v6 = v28
    val v73: s0 = f90(v33)
    v44 = v44.updated(0, v18)
    v19 = v19.copy(p0 = v36)
    val v35: s4 = s4(v11, v18)
    val v34: s0 = f90(v73)
    v40 = v40.updated(0, v44)
    val v25: Vector[s0] = v36(0)
    val v47: s0 = f90(v33)
    v40 = v40.updated(0, v25)
    val v43: s0 = f90(v16)
    val v50: s0 = f90(v47)
    v21 = v21.copy(p1 = v9)
    val v61: s4 = f88(v35)
    var v75: Vector[s1] = v12
    val v31: s0 = f90(v43)
    var v38: Vector[s0] = v44
    val v55: s0 = v23(0)
    var v37: Vector[s0] = v23
    v75 = v75.updated(0, v3)
    val v48: Vector[Vector[Double]] = v50.p0
    val v81: Vector[s1] = v21.p1
    val v66: Vector[Double] = v6.p0
    val v98: s0 = v25(0)
    v12 = v12.updated(0, v19)
    v10 = v10.updated(0, v75)
    v38 = v38.updated(0, v34)
    val v63: s1 = s1(v40, v18)
    v22 = v22.updated(0, v38)
    val v58: s0 = f90(v47)
    v75 = v75.updated(1, v63)
    val v49: s0 = f90(v58)
    v75 = v75.updated(1, v3)
    val v149: Vector[Double] = v48(0)
    v10 = v10.updated(0, v81)
    v38 = v38.updated(0, v31)
    val v46: Vector[s1] = v4(1)
    val v68: s0 = v19.p1
    v21 = v21.copy(p1 = v2)
    v17 = v17.copy(p0 = v20)
    v38 = v38.updated(0, v49)
    v37 = v37.updated(0, v55)
    v12 = v46
    v21 = v21.copy(p1 = v2)
    v75 = v75.updated(1, v63)
    v19 = v19.copy(p1 = v98)
    val v207: s4 = f88(v61)
    v21 = v21.copy(p1 = v1)
    val v106: s6 = s6(v149, v81)
    v21 = v21.copy(p1 = v81)
    v37 = v37.updated(0, v68)
    v6 = v6.copy(p1 = v8)
    v21 = v21.copy(p0 = v66)
    val v93: s1 = v207.p0
    v22 = v22.updated(0, v37)
    v75 = v75.updated(0, v93)
    v106
  }
  def f70(v0: Vector[s1]): Vector[s1] = {
    var v3: Vector[s1] = v0
    val v1: s1 = v0(0)
    v3 = v3.updated(1, v1)
    v3
  }
  def f42(v0: s6): s6 = {
    val v2: Vector[s1] = v0.p1
    val v3: Vector[Double] = v0.p0
    val v7: s1 = v2(0)
    var v4: s1 = v7
    var v1: s1 = v4
    var v12: s6 = v0
    var v5: Vector[s1] = v2
    val v6: Vector[s1] = v0.p1
    val v11: Double = v3(0)
    val v31: Vector[s1] = f70(v2)
    var v15: Vector[Double] = v3
    val v18: s1 = v6(0)
    v5 = v5.updated(0, v1)
    var v29: Vector[Double] = v3
    v12 = v12.copy(p0 = v15)
    val v17: s6 = f79(v12)
    v12 = v12.copy(p1 = v5)
    val v22: s6 = s6(v29, v2)
    val v44: Vector[Double] = v17.p0
    v15 = v15.updated(0, v11)
    val v23: s0 = v4.p1
    val v30: Vector[s1] = f70(v31)
    val v34: Vector[Vector[Double]] = v23.p1
    var v52: s0 = v23
    v5 = v5.updated(1, v18)
    v52 = v52.copy(p1 = v34)
    v29 = v44
    v12 = v12.copy(p1 = v30)
    v1 = v1.copy(p1 = v52)
    v52 = v52.copy(p1 = v34)
    v52 = v52.copy(p1 = v34)
    v22
  }
  def f41(v0: s1): s1 = {
    v0
  }
  def f35(v0: s1): s1 = {
    val v2: s1 = f41(v0)
    val v8: s1 = f41(v2)
    val v9: s0 = v8.p1
    var v1: s0 = v9
    var v5: s0 = v1
    val v11: s4 = s4(v0, v5)
    val v15: Vector[Vector[Double]] = v9.p1
    var v13: s4 = v11
    val v12: s1 = v13.p0
    var v17: Vector[Vector[Double]] = v15
    var v25: Vector[Vector[Double]] = v15
    val v36: Vector[Double] = v17(0)
    val v14: s1 = f41(v0)
    v25 = v25.updated(1, v36)
    val v20: Vector[Double] = v25(2)
    val v50: s0 = f90(v5)
    v1 = v1.copy(p1 = v15)
    v1 = v9
    var v86: Vector[Vector[Double]] = v17
    v5 = v5.copy(p1 = v17)
    v86 = v86.updated(0, v20)
    val v76: Vector[Vector[Double]] = v50.p0
    var v112: Vector[Vector[Double]] = v76
    v13 = v13.copy(p0 = v14)
    val v152: s1 = f41(v12)
    val v97: s0 = s0(v76, v86)
    v86 = v86.updated(1, v36)
    v1 = v1.copy(p0 = v112)
    val v72: s1 = f41(v152)
    val v343: s1 = f41(v72)
    v13 = v13.copy(p1 = v97)
    v13 = v13.copy(p0 = v2)
    v343
  }
  def f24(v0: s6): s6 = {
    val v6: Vector[s6] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v5: Vector[s1] = v0.p1
    val v7: s6 = v6(4)
    val v2: s1 = v5(1)
    val v8: s1 = f41(v2)
    var v15: Vector[s1] = v5
    val v18: s6 = f42(v7)
    val v36: s1 = f41(v8)
    v15 = v15.updated(0, v36)
    val v60: Vector[Double] = v18.p0
    val v37: s6 = f42(v18)
    var v68: s6 = v37
    v68 = v68.copy(p1 = v15)
    v15 = v15.updated(0, v2)
    v68 = v68.copy(p0 = v60)
    v68
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Vector[s6], v2: Double): Double = {
    val v9: s6 = v1(0)
    val v3: s6 = f79(v9)
    val v4: s6 = f79(v3)
    val v13: Vector[Double] = v9.p0
    var v35: s6 = v3
    v35 = v35.copy(p0 = v13)
    val v42: Vector[s1] = v35.p1
    v35 = v35.copy(p0 = v13)
    val v53: s6 = f24(v4)
    val v45: s1 = v42(0)
    val v33: Vector[s1] = v53.p1
    val v29: s6 = f79(v35)
    val v51: Double = v13(0)
    val v24: s6 = f79(v29)
    var v40: Vector[s1] = v33
    val v52: Double = f93(v51)
    val v32: s1 = f35(v45)
    val v46: Double = v13(0)
    v35 = v35.copy(p0 = v13)
    val v59: Vector[s1] = v9.p1
    var v49: Vector[Double] = v13
    v49 = v49.updated(0, v46)
    v49 = v49.updated(0, v52)
    v35 = v35.copy(p1 = v40)
    var v123: s1 = v45
    v35 = v35.copy(p0 = v49)
    val v100: Vector[Vector[s0]] = v32.p0
    val v79: Vector[Double] = v24.p0
    var v73: Vector[Vector[s0]] = v100
    v35 = v35.copy(p0 = v13)
    v123 = v123.copy(p0 = v73)
    val v194: s0 = v123.p1
    v35 = v35.copy(p1 = v59)
    val v216: s0 = f90(v194)
    val v121: Double = v79(0)
    v40 = v40.updated(0, v123)
    val v291: s0 = f90(v216)
    v123 = v123.copy(p1 = v291)
    v121
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(Vector(0.0), Vector(s1(Vector(Vector(s0(Vector(Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))))), s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)))), s1(Vector(Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))))), s0(Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0))))))), Vector(s6(Vector(17.0), Vector(s1(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0))))), s0(Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)))), s1(Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0))))))))
    val v1: Vector[s6] = Vector(s6(Vector(34.0), Vector(s1(Vector(Vector(s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0))))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)))), s1(Vector(Vector(s0(Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0))))), s0(Vector(Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)))))))
    val v2: Double = 51.0
    val start = nanoTime()
    var result: Double = 51.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}