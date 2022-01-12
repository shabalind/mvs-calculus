import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  def f50(v0: Double): Double = {
    var v5: Double = v0
    v5 = v0
    var v6: Double = v0
    var v1: Double = v5
    var v7: Double = v6
    val v2: Double = v1 / v1
    val v3: Double = v7 * v6
    var v4: Double = v7
    var v10: Double = v2
    val v8: Vector[Double] = Vector(v4)
    val v11: Double = v8(0)
    var v18: Double = v3
    var v14: Vector[Double] = v8
    var v33: Vector[Double] = v14
    v10 = v2
    var v15: Double = v11
    var v19: Double = v10
    var v86: Double = v15
    val v30: Double = v14(0)
    var v23: Double = v3
    v14 = v14.updated(0, v30)
    var v29: Double = v7
    v14 = v14.updated(0, v19)
    var v35: Vector[Double] = v33
    val v55: Double = v14(0)
    v23 = v11
    v33 = v33.updated(0, v30)
    v1 = v29
    v33 = v33.updated(0, v55)
    var v28: Vector[Double] = v8
    var v66: Vector[Double] = v28
    var v20: Double = v18
    val v48: Double = v28(0)
    v14 = v14.updated(0, v30)
    v28 = v28.updated(0, v0)
    v33 = v33.updated(0, v86)
    val v71: Double = v8(0)
    val v70: Vector[Vector[Double]] = Vector(v35, v33, v14, v66, v14)
    v28 = v28.updated(0, v23)
    var v51: Vector[Double] = v66
    var v52: Vector[Vector[Double]] = v70
    var v54: Vector[Vector[Double]] = v52
    v52 = v52.updated(1, v28)
    val v103: Vector[Double] = v54(0)
    v28 = v28.updated(0, v20)
    v51 = v51.updated(0, v48)
    var v154: Vector[Double] = v103
    val v123: Double = v51(0)
    v14 = v14.updated(0, v123)
    val v167: Double = v154(0)
    v14 = v14.updated(0, v71)
    v167
  }
  def f43(v0: s2): s2 = {
    var v1: s2 = v0
    val v7: Vector[s1] = v1.p1
    var v3: s2 = v1
    var v30: s2 = v3
    v1 = v1.copy(p1 = v7)
    v30
  }
  def f29(v0: s2): s2 = {
    val v1: s2 = f43(v0)
    var v4: s2 = v1
    var v2: s2 = v1
    val v3: Vector[s2] = Vector(v4, v1, v0, v2, v1, v0, v1)
    v4 = v0
    val v19: s2 = v3(2)
    val v36: s2 = f43(v19)
    val v35: s2 = f43(v36)
    val v24: s2 = f43(v35)
    v24
  }
  def f14(v0: Double): Double = {
    val v6: Vector[Double] = Vector(v0, v0, v0)
    val v2: Double = v6(0)
    val v1: Double = f50(v2)
    val v5: Double = v6(2)
    var v7: Vector[Double] = v6
    v7 = v7.updated(1, v5)
    val v3: Double = v7(0)
    v7 = v6
    var v10: Vector[Double] = v7
    val v13: Double = v7(2)
    v10 = v10.updated(0, v13)
    val v9: Double = f50(v2)
    val v18: Double = f50(v0)
    val v16: Double = f50(v9)
    val v19: Double = f50(v13)
    v10 = v10.updated(1, v18)
    val v12: Double = f50(v9)
    val v15: Double = f50(v16)
    var v20: Vector[Double] = v6
    var v17: Vector[Double] = v6
    var v27: Double = v13
    var v34: Vector[Double] = v10
    val v40: Double = v15 / v16
    val v29: Double = f50(v15)
    v20 = v20.updated(0, v12)
    v10 = v10.updated(1, v27)
    var v31: Double = v0
    var v30: Vector[Double] = v6
    val v35: Double = f50(v13)
    var v21: Double = v29
    v34 = v34.updated(0, v35)
    val v23: Double = v20(0)
    var v106: Vector[Double] = v17
    v34 = v34.updated(2, v19)
    v10 = v10.updated(0, v3)
    v10 = v7
    val v32: Double = f50(v29)
    var v66: Double = v27
    val v53: Double = v7(0)
    var v57: Vector[Double] = v6
    val v71: Double = v10(0)
    var v62: Double = v21
    val v49: Double = f50(v32)
    val v45: Double = f50(v53)
    v10 = v10.updated(0, v40)
    v20 = v20.updated(2, v1)
    val v83: Double = v20(1)
    var v58: Double = v5
    val v95: Double = f50(v62)
    v30 = v30.updated(0, v66)
    val v81: Double = f50(v49)
    val v82: Double = f50(v31)
    var v143: Vector[Double] = v106
    val v107: Double = f50(v9)
    var v111: Vector[Double] = v143
    v111 = v111.updated(1, v107)
    v111 = v111.updated(2, v95)
    v7 = v7.updated(2, v49)
    var v85: Vector[Double] = v111
    val v139: Double = f50(v35)
    v7 = v7.updated(1, v82)
    v143 = v143.updated(2, v3)
    v17 = v17.updated(2, v23)
    v57 = v57.updated(2, v107)
    val v227: Double = v111(0)
    v106 = v106.updated(2, v227)
    v30 = v30.updated(2, v139)
    v7 = v7.updated(1, v71)
    val v289: Vector[Vector[Double]] = Vector(v34, v20, v6, v30, v85, v57, v106)
    v57 = v57.updated(1, v45)
    val v194: Vector[Double] = v289(3)
    v34 = v34.updated(2, v82)
    val v110: Double = v194(2)
    v57 = v57.updated(0, v58)
    v20 = v20.updated(1, v83)
    v85 = v85.updated(2, v81)
    v110
  }
  @noinline
  def f0(v0: s2, v1: s2, v2: Double): Double = {
    val v5: s2 = f29(v0)
    val v3: s1 = v5.p0
    val v10: s1 = v1.p0
    val v9: s0 = v3.p1
    var v26: s0 = v9
    val v23: Vector[Vector[Double]] = v26.p0
    val v16: Vector[Vector[Double]] = v26.p0
    val v13: Vector[Double] = v16(0)
    v26 = v26.copy(p0 = v23)
    val v32: Vector[Vector[Double]] = v9.p0
    val v22: Vector[Vector[s0]] = v3.p0
    v26 = v26.copy(p0 = v16)
    val v60: Vector[Double] = v32(1)
    val v50: Double = v13(0)
    var v47: Vector[Vector[s0]] = v22
    var v54: Vector[Double] = v60
    v26 = v26.copy(p0 = v16)
    val v166: Double = v54(0)
    val v71: Double = v50 - v166
    val v53: Vector[s0] = v47(0)
    val v93: Vector[Vector[s0]] = v10.p0
    val v112: s0 = v53(0)
    val v78: Vector[s0] = v93(2)
    var v102: Vector[s0] = v78
    var v118: Vector[s0] = v102
    v47 = v47.updated(2, v118)
    val v149: Double = f14(v71)
    v102 = v102.updated(0, v26)
    val v120: Vector[Vector[Double]] = v112.p0
    v26 = v26.copy(p0 = v120)
    v149
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))
    val v1: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0))))), s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0))))))
    val v2: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}