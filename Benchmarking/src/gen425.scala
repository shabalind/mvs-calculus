import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s2 (
    p0: s0
  )
  case class s6 (
    p0: s2,
    p1: s0
  )
  def f68(v0: s2, v1: s0): s2 = {
    val v6: s0 = v0.p0
    val v7: Vector[Vector[Double]] = v1.p1
    val v3: Vector[Vector[Double]] = v1.p1
    var v8: s0 = v6
    var v4: Vector[Vector[Double]] = v3
    val v16: Vector[Double] = v4(1)
    v8 = v8.copy(p1 = v7)
    val v10: s0 = v0.p0
    var v23: Vector[Double] = v16
    v8 = v1
    val v14: Vector[s2] = Vector(v0, v0, v0, v0, v0)
    var v9: s0 = v8
    v4 = v4.updated(2, v16)
    val v13: s2 = v14(2)
    val v11: Vector[Vector[Double]] = v1.p0
    val v22: s0 = v0.p0
    v4 = v4.updated(1, v23)
    val v20: Vector[Double] = v7(2)
    v4 = v4.updated(0, v16)
    v8 = v8.copy(p1 = v4)
    v8 = v8.copy(p0 = v11)
    val v21: Vector[Double] = v3(0)
    val v49: s6 = s6(v13, v9)
    v23 = v16
    var v25: s0 = v6
    val v29: Double = v23(0)
    val v30: s2 = v49.p0
    val v48: Vector[Vector[Vector[Double]]] = Vector(v11, v11, v11, v11)
    val v38: Double = v29 + v29
    v23 = v23.updated(0, v38)
    val v24: Vector[s6] = Vector(v49, v49, v49, v49, v49, v49)
    val v39: s0 = v49.p1
    v23 = v23.updated(0, v38)
    v8 = v8.copy(p0 = v11)
    var v69: Vector[Vector[Vector[Double]]] = v48
    val v33: Vector[Vector[s6]] = Vector(v24, v24, v24, v24, v24, v24)
    v23 = v23.updated(0, v29)
    val v51: Vector[Vector[Double]] = v9.p0
    v25 = v25.copy(p0 = v51)
    var v60: s0 = v22
    val v37: s0 = v30.p0
    v23 = v23.updated(0, v38)
    val v52: Vector[Vector[Double]] = v60.p1
    var v42: Double = v29
    var v56: Vector[Vector[Vector[Double]]] = v69
    v9 = v9.copy(p1 = v52)
    v23 = v23.updated(0, v42)
    v60 = v60.copy(p1 = v7)
    var v73: Vector[Vector[Double]] = v51
    var v57: Vector[Vector[Double]] = v11
    v25 = v25.copy(p1 = v4)
    var v53: Double = v29
    val v103: Vector[Vector[Double]] = v10.p0
    val v59: Vector[s6] = v33(4)
    v60 = v60.copy(p1 = v3)
    var v98: Vector[Double] = v20
    v57 = v57.updated(0, v98)
    val v81: s6 = v59(2)
    val v85: Vector[Vector[Double]] = v25.p0
    v8 = v8.copy(p0 = v85)
    var v54: Vector[Double] = v20
    var v117: Vector[Vector[Vector[Double]]] = v56
    v57 = v57.updated(0, v21)
    v54 = v54.updated(0, v53)
    v60 = v39
    v9 = v9.copy(p0 = v103)
    v73 = v73.updated(0, v54)
    val v116: Vector[Vector[Double]] = v117(1)
    v25 = v25.copy(p0 = v51)
    var v176: s6 = v81
    var v170: s6 = v176
    v9 = v9.copy(p0 = v57)
    v60 = v60.copy(p1 = v52)
    v176 = v176.copy(p1 = v37)
    v60 = v60.copy(p0 = v116)
    v9 = v9.copy(p0 = v73)
    v98 = v98.updated(0, v42)
    val v133: s2 = v170.p0
    v133
  }
  def f49(v0: s0, v1: s2): s0 = {
    val v2: s0 = v1.p0
    val v3: s0 = v1.p0
    val v7: Vector[Vector[Double]] = v2.p1
    var v8: s0 = v3
    val v5: Vector[Double] = v7(1)
    val v9: Double = v5(0)
    v8 = v8.copy(p1 = v7)
    val v4: s2 = f68(v1, v3)
    val v11: s2 = f68(v4, v3)
    val v6: Double = v5(0)
    val v10: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Vector[Double]] = Vector(v5, v5, v5, v5, v5, v5)
    val v18: s2 = f68(v11, v2)
    v8 = v8.copy(p0 = v10)
    v8 = v8.copy(p1 = v7)
    v8 = v8.copy(p0 = v10)
    val v19: Vector[Vector[Double]] = v3.p1
    v8 = v0
    v8 = v8.copy(p0 = v10)
    val v20: s0 = v4.p0
    var v14: Double = v6
    v14 = v9
    val v28: s2 = f68(v1, v3)
    v8 = v8.copy(p0 = v10)
    val v21: Vector[Double] = v12(5)
    var v41: Vector[Double] = v21
    val v50: Vector[Vector[Double]] = v3.p0
    v41 = v41.updated(0, v14)
    val v42: Double = v9 / v14
    var v26: Vector[Vector[Double]] = v10
    var v62: Vector[Double] = v41
    val v30: s0 = v18.p0
    var v46: Double = v6
    v62 = v62.updated(0, v9)
    val v22: Vector[Vector[Double]] = v20.p1
    val v86: s0 = v28.p0
    var v48: Vector[Vector[Double]] = v26
    v48 = v48.updated(0, v62)
    var v38: Double = v9
    v8 = v8.copy(p0 = v26)
    var v37: s0 = v30
    val v75: Vector[Double] = v12(1)
    val v34: Double = v9 / v46
    v37 = v37.copy(p0 = v48)
    var v71: Double = v9
    val v49: s2 = f68(v18, v86)
    val v45: Vector[s0] = Vector(v8, v2, v37, v2, v0)
    val v65: Double = v21(0)
    v8 = v8.copy(p0 = v50)
    val v78: s2 = f68(v1, v8)
    val v53: Double = v38 / v34
    var v79: Vector[s0] = v45
    val v58: s0 = v79(0)
    var v52: s2 = v78
    val v150: Vector[Double] = v10(0)
    v62 = v62.updated(0, v42)
    v62 = v150
    v52 = v52.copy(p0 = v30)
    val v133: s0 = v49.p0
    var v187: Vector[Vector[Double]] = v19
    v8 = v8.copy(p1 = v187)
    val v72: Vector[Double] = v22(2)
    v41 = v41.updated(0, v65)
    v52 = v52.copy(p0 = v3)
    v52 = v52.copy(p0 = v58)
    v62 = v62.updated(0, v53)
    v26 = v26.updated(0, v75)
    var v85: s0 = v133
    val v124: s0 = v52.p0
    v79 = v79.updated(0, v3)
    v37 = v85
    v41 = v72
    v41 = v41.updated(0, v71)
    v8 = v8.copy(p0 = v10)
    v85 = v85.copy(p0 = v48)
    var v103: s0 = v124
    v103
  }
  def f36(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v4
    var v2: s0 = v0
    val v5: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v2.p0
    val v9: Vector[Double] = v7(0)
    var v3: s0 = v0
    v2 = v2.copy(p0 = v5)
    var v14: Vector[Vector[Double]] = v4
    val v1: Vector[Double] = v6(0)
    var v15: Vector[Vector[Double]] = v7
    var v11: s0 = v2
    val v24: Vector[Vector[Double]] = v0.p0
    val v13: Vector[Vector[Double]] = v0.p1
    val v16: Vector[s0] = Vector(v3, v11, v2, v2, v3)
    v14 = v14.updated(0, v1)
    v11 = v11.copy(p0 = v24)
    val v12: Vector[Vector[Double]] = v3.p1
    val v17: Vector[Double] = v13(1)
    v3 = v3.copy(p1 = v13)
    v2 = v2.copy(p0 = v15)
    val v55: Vector[Vector[Double]] = v2.p1
    v15 = v15.updated(0, v17)
    v11 = v11.copy(p0 = v14)
    val v66: Vector[Vector[Double]] = v11.p1
    v2 = v2.copy(p1 = v66)
    v2 = v2.copy(p1 = v55)
    v3 = v3.copy(p1 = v12)
    val v91: Vector[Vector[Double]] = v0.p0
    v14 = v14.updated(0, v9)
    v2 = v2.copy(p1 = v12)
    v3 = v3.copy(p1 = v55)
    v2 = v2.copy(p0 = v91)
    val v77: s0 = v16(3)
    v77
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v6: s0 = v0.p0
    val v5: s0 = v0.p0
    val v4: s0 = f49(v6, v0)
    val v2: s2 = f68(v0, v5)
    var v7: s0 = v6
    val v11: s0 = v0.p0
    val v12: Vector[Vector[Double]] = v5.p1
    val v9: s0 = f49(v4, v2)
    val v10: s0 = f36(v7)
    var v8: Vector[Vector[Double]] = v12
    val v36: Vector[Vector[Double]] = v11.p0
    v7 = v7.copy(p0 = v36)
    val v26: s0 = f36(v9)
    val v15: Vector[Double] = v12(0)
    val v16: s0 = v0.p0
    v8 = v8.updated(0, v15)
    v8 = v8.updated(1, v15)
    v7 = v7.copy(p1 = v8)
    val v20: Vector[Vector[Double]] = v16.p0
    val v42: Vector[Vector[Double]] = v6.p0
    v8 = v8.updated(1, v15)
    v8 = v8.updated(2, v15)
    val v57: Vector[Vector[Double]] = v9.p0
    val v30: Vector[Vector[Vector[Double]]] = Vector(v57, v42)
    v7 = v7.copy(p1 = v12)
    val v62: Vector[Vector[Double]] = v30(0)
    val v96: Vector[Double] = v62(0)
    val v39: s1 = s1(v10, v96)
    v8 = v12
    v7 = v7.copy(p0 = v20)
    val v70: Vector[Vector[Double]] = v26.p1
    val v76: Vector[Double] = v39.p1
    val v144: Double = v76(0)
    v7 = v7.copy(p0 = v42)
    v8 = v70
    v7 = v7.copy(p1 = v8)
    v144
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}