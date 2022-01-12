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
  case class s5 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s9 (
    p0: s1
  )
  case class s11 (
    p0: s9,
    p1: s9
  )
  def f86(v0: s9, v1: Double): Double = {
    var v5: s9 = v0
    val v3: s1 = v5.p0
    var v9: s9 = v5
    val v8: s0 = v3.p1
    var v14: s9 = v0
    var v7: s0 = v8
    var v4: s0 = v7
    var v12: s1 = v3
    val v11: Vector[s0] = v3.p0
    v5 = v5.copy(p0 = v12)
    var v18: s9 = v9
    val v40: s11 = s11(v9, v14)
    v5 = v9
    val v27: Vector[Vector[Double]] = v7.p1
    val v15: Vector[Vector[Double]] = v7.p0
    v12 = v12.copy(p0 = v11)
    v7 = v7.copy(p0 = v15)
    var v16: Double = v1
    v4 = v4.copy(p0 = v15)
    v7 = v7.copy(p0 = v15)
    val v25: s1 = v18.p0
    val v48: Vector[Double] = v15(0)
    v9 = v9.copy(p0 = v3)
    v4 = v4.copy(p1 = v27)
    v4 = v4.copy(p0 = v15)
    v7 = v7.copy(p0 = v15)
    v14 = v14.copy(p0 = v3)
    val v110: Vector[Vector[Double]] = v4.p0
    v7 = v7.copy(p0 = v110)
    val v49: Double = v48(0)
    v9 = v9.copy(p0 = v25)
    val v56: s9 = v40.p1
    v9 = v9.copy(p0 = v12)
    v12 = v12.copy(p1 = v7)
    v18 = v56
    v9 = v9.copy(p0 = v12)
    val v60: Double = v16 - v49
    v60
  }
  def f74(v0: s9): s9 = {
    var v7: s9 = v0
    var v2: s9 = v7
    var v5: s9 = v2
    var v136: s9 = v5
    v136
  }
  def f73(v0: s5): s5 = {
    var v8: s5 = v0
    var v7: s5 = v0
    val v3: Vector[Vector[s0]] = v0.p1
    v8 = v8.copy(p1 = v3)
    v8 = v8.copy(p1 = v3)
    val v1: Vector[Vector[s0]] = v0.p1
    val v5: Vector[s1] = v8.p0
    var v13: Vector[Vector[s0]] = v1
    var v2: Vector[s1] = v5
    val v4: Vector[s1] = v0.p0
    var v11: s5 = v7
    v7 = v7.copy(p1 = v13)
    v11 = v11.copy(p1 = v1)
    val v12: Vector[Vector[s0]] = v7.p1
    var v9: Vector[Vector[s0]] = v12
    var v14: s5 = v11
    val v10: Vector[s1] = v8.p0
    var v17: Vector[s1] = v2
    val v49: s1 = v4(1)
    val v23: Vector[s0] = v1(1)
    v2 = v2.updated(0, v49)
    val v18: s0 = v23(0)
    var v33: s0 = v18
    var v25: s5 = v8
    val v21: Vector[s0] = v3(2)
    var v22: Vector[s0] = v23
    val v30: Vector[s0] = v3(1)
    v14 = v14.copy(p1 = v3)
    v14 = v14.copy(p0 = v17)
    var v20: Vector[s1] = v4
    v22 = v22.updated(0, v33)
    v2 = v2.updated(2, v49)
    v2 = v20
    val v59: Vector[s0] = v1(2)
    v2 = v2.updated(2, v49)
    v11 = v0
    val v52: s1 = v5(0)
    v14 = v14.copy(p1 = v13)
    val v28: s0 = v23(0)
    val v53: Vector[Vector[Double]] = v33.p0
    val v103: Vector[Vector[Double]] = v28.p1
    v13 = v13.updated(1, v30)
    var v73: Vector[Vector[Double]] = v53
    v7 = v14
    val v87: s1 = v2(1)
    val v50: s0 = v21(0)
    var v38: Vector[Vector[s0]] = v12
    v20 = v20.updated(2, v87)
    v38 = v38.updated(0, v30)
    v25 = v25.copy(p1 = v9)
    var v47: Vector[s1] = v2
    val v84: s1 = v4(0)
    v47 = v47.updated(1, v87)
    v2 = v2.updated(0, v87)
    val v65: s1 = v47(1)
    val v85: Vector[Vector[s0]] = v7.p1
    var v97: s1 = v52
    v97 = v97.copy(p1 = v50)
    v20 = v20.updated(1, v65)
    v33 = v33.copy(p1 = v103)
    v11 = v11.copy(p1 = v85)
    v9 = v9.updated(2, v22)
    val v113: Vector[Vector[s0]] = v11.p1
    var v115: s1 = v97
    v33 = v33.copy(p0 = v73)
    v11 = v11.copy(p1 = v38)
    v38 = v38.updated(2, v59)
    v2 = v2.updated(2, v115)
    v38 = v38.updated(1, v21)
    v8 = v8.copy(p1 = v113)
    v2 = v2.updated(0, v84)
    v7 = v7.copy(p0 = v17)
    v14 = v14.copy(p0 = v10)
    v11 = v11.copy(p0 = v20)
    v25 = v25.copy(p1 = v9)
    v25
  }
  def f69(v0: s0, v1: s0): s0 = {
    val v8: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8, v8, v8, v8)
    var v9: s0 = v0
    val v2: Vector[Vector[Double]] = v9.p0
    v9 = v9.copy(p0 = v2)
    v9 = v9.copy(p0 = v2)
    v9 = v9.copy(p0 = v2)
    val v20: Vector[Vector[Double]] = v0.p1
    v9 = v9.copy(p1 = v20)
    val v38: Vector[Vector[Double]] = v0.p0
    val v28: Vector[Vector[Double]] = v9.p0
    var v70: s0 = v9
    val v36: Vector[Vector[Double]] = v5(6)
    v9 = v9.copy(p0 = v2)
    v70 = v70.copy(p0 = v2)
    v9 = v9.copy(p1 = v20)
    v9 = v9.copy(p1 = v8)
    v9 = v9.copy(p0 = v38)
    v70 = v70.copy(p0 = v38)
    var v121: s0 = v70
    val v78: Vector[s0] = Vector(v121, v9, v0, v70)
    val v52: Vector[Vector[Double]] = v9.p1
    val v46: Vector[Vector[Double]] = v9.p0
    v70 = v0
    v9 = v9.copy(p1 = v52)
    v121 = v121.copy(p0 = v46)
    v70 = v70.copy(p0 = v28)
    v70 = v70.copy(p1 = v36)
    val v119: s0 = v78(2)
    v119
  }
  def f60(v0: s1): s1 = {
    var v7: s1 = v0
    var v2: s1 = v0
    var v3: s1 = v2
    var v5: s1 = v7
    val v10: Vector[s0] = v0.p0
    val v9: s9 = s9(v0)
    val v14: s0 = v10(0)
    val v12: s0 = f69(v14, v14)
    var v8: Vector[s0] = v10
    v8 = v8.updated(0, v12)
    var v40: s9 = v9
    var v21: s0 = v12
    val v30: Vector[s9] = Vector(v9, v40)
    v8 = v8.updated(0, v21)
    val v36: s9 = v30(0)
    val v31: s9 = f74(v40)
    val v43: s1 = v31.p0
    val v32: s9 = v30(1)
    val v55: s11 = s11(v36, v32)
    var v54: s9 = v31
    v54 = v54.copy(p0 = v5)
    val v64: s1 = v54.p0
    v40 = v40.copy(p0 = v43)
    var v103: s11 = v55
    v103 = v103.copy(p0 = v40)
    v5 = v5.copy(p0 = v10)
    val v81: s9 = v103.p1
    v7 = v7.copy(p0 = v8)
    v40 = v40.copy(p0 = v3)
    val v169: s1 = v81.p0
    val v131: s1 = v54.p0
    v40 = v40.copy(p0 = v64)
    v40 = v40.copy(p0 = v131)
    v169
  }
  def f47(v0: s11): s11 = {
    val v2: s9 = v0.p1
    val v7: s9 = f74(v2)
    val v5: s11 = s11(v2, v2)
    val v3: s9 = v5.p0
    var v12: s9 = v3
    val v4: s9 = f74(v7)
    var v13: s9 = v12
    var v9: s11 = v0
    v9 = v9.copy(p0 = v7)
    v9 = v9.copy(p0 = v3)
    val v18: s9 = f74(v13)
    val v20: s1 = v18.p0
    val v36: s9 = f74(v13)
    v9 = v9.copy(p1 = v4)
    v9 = v9.copy(p1 = v36)
    v9 = v9.copy(p1 = v3)
    v13 = v13.copy(p0 = v20)
    v9
  }
  def f16(v0: s5): s5 = {
    val v7: s5 = f73(v0)
    var v1: s5 = v0
    val v4: Vector[s1] = v1.p0
    v1 = v1.copy(p0 = v4)
    val v2: Vector[Vector[s0]] = v0.p1
    var v11: s5 = v7
    v11 = v11.copy(p0 = v4)
    v1 = v1.copy(p1 = v2)
    val v5: Vector[s1] = v0.p0
    var v14: s5 = v11
    v14 = v14.copy(p0 = v5)
    v11 = v0
    v14 = v14.copy(p1 = v2)
    v14
  }
  def f11(v0: s5): s5 = {
    var v6: s5 = v0
    val v4: Vector[Vector[s0]] = v0.p1
    var v3: Vector[Vector[s0]] = v4
    val v2: Vector[s0] = v4(2)
    v6 = v6.copy(p1 = v4)
    val v13: Vector[s0] = v3(1)
    v3 = v3.updated(2, v13)
    val v7: Vector[Vector[s0]] = v0.p1
    v3 = v7
    var v9: s5 = v6
    val v10: Vector[s1] = v0.p0
    v6 = v6.copy(p1 = v4)
    v9 = v9.copy(p0 = v10)
    val v26: Vector[s0] = v4(1)
    v3 = v3.updated(2, v26)
    v3 = v3.updated(2, v13)
    v9 = v9.copy(p1 = v3)
    v3 = v3.updated(1, v2)
    v9
  }
  def f5(v0: s11): s11 = {
    val v3: s11 = f47(v0)
    val v6: s9 = v3.p0
    var v1: s9 = v6
    val v2: s9 = v3.p1
    val v5: s9 = v0.p0
    val v9: s9 = f74(v2)
    val v4: s9 = f74(v9)
    val v21: s9 = f74(v1)
    val v52: s1 = v5.p0
    val v33: s1 = f60(v52)
    val v63: s1 = v4.p0
    var v27: s9 = v21
    val v70: Vector[s9] = Vector(v2, v1, v27)
    val v43: s9 = v70(1)
    v27 = v27.copy(p0 = v33)
    val v55: s1 = f60(v63)
    v27 = v27.copy(p0 = v33)
    val v179: s9 = v70(2)
    v1 = v1.copy(p0 = v55)
    val v86: s11 = s11(v43, v179)
    v86
  }
  @noinline
  def f0(v0: s5, v1: s0, v2: Double): Double = {
    val v6: s5 = f11(v0)
    val v7: s5 = f16(v6)
    val v8: Vector[s1] = v7.p0
    val v4: s0 = f69(v1, v1)
    val v11: s0 = f69(v1, v4)
    val v12: Vector[Vector[Double]] = v11.p0
    val v14: s1 = v8(1)
    val v39: s1 = f60(v14)
    val v47: s9 = s9(v39)
    val v57: s1 = v47.p0
    val v71: s9 = f74(v47)
    val v49: Vector[Double] = v12(0)
    var v107: s9 = v71
    val v175: Double = v49(0)
    val v116: s11 = s11(v107, v47)
    val v172: s11 = f5(v116)
    val v292: s9 = v172.p0
    val v65: Double = f86(v292, v175)
    v107 = v107.copy(p0 = v57)
    v65
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))
    val v1: s0 = s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}