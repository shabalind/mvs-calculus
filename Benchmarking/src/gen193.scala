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
  def f83(v0: s1): s1 = {
    val v5: s0 = v0.p0
    var v2: s1 = v0
    v2 = v0
    val v3: s0 = v2.p0
    v2 = v2.copy(p0 = v3)
    var v4: s0 = v5
    val v6: Vector[Vector[Double]] = v4.p1
    val v1: Vector[Double] = v6(0)
    var v7: Vector[Vector[Double]] = v6
    val v11: Vector[Vector[Double]] = v3.p1
    v7 = v7.updated(0, v1)
    var v9: s1 = v0
    v9 = v9.copy(p0 = v4)
    var v15: s0 = v4
    val v19: Vector[Double] = v11(0)
    v4 = v4.copy(p1 = v7)
    val v13: Vector[Vector[Double]] = v4.p0
    var v14: s1 = v0
    val v20: Vector[Vector[Double]] = v15.p0
    val v25: s0 = s0(v20, v7)
    var v37: s0 = v25
    val v16: Vector[Double] = v13(1)
    v7 = v7.updated(0, v16)
    val v21: s0 = v14.p0
    val v23: Vector[Vector[Double]] = v37.p0
    v2 = v2.copy(p0 = v21)
    val v50: Vector[Vector[Double]] = v5.p0
    v15 = v15.copy(p0 = v50)
    val v22: s0 = v2.p0
    val v29: Double = v19(0)
    var v32: Vector[Double] = v19
    v32 = v32.updated(0, v29)
    v15 = v15.copy(p1 = v6)
    v4 = v4.copy(p0 = v23)
    v7 = v7.updated(0, v32)
    val v36: s0 = v9.p0
    v4 = v4.copy(p0 = v23)
    val v85: Vector[s0] = v9.p1
    v2 = v2.copy(p0 = v22)
    val v72: Vector[s0] = v14.p1
    val v69: Vector[Vector[Double]] = v15.p0
    v4 = v5
    var v49: s1 = v9
    val v170: s0 = v49.p0
    val v97: s0 = v14.p0
    val v98: Vector[Vector[Double]] = v36.p0
    var v88: Vector[s0] = v72
    v9 = v9.copy(p0 = v37)
    val v70: s1 = s1(v36, v85)
    v4 = v4.copy(p0 = v69)
    v9 = v49
    v88 = v88.updated(0, v97)
    v2 = v70
    v37 = v37.copy(p0 = v98)
    val v143: s0 = v88(1)
    v2 = v2.copy(p0 = v143)
    var v200: s1 = v70
    v9 = v9.copy(p0 = v170)
    v200
  }
  def f72(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v4
    val v3: Double = v0 - v1
    var v16: Double = v3
    var v9: Double = v16
    v9
  }
  def f71(v0: s0): s0 = {
    val v6: Vector[s0] = Vector(v0)
    var v4: s0 = v0
    val v14: Vector[Vector[Double]] = v0.p0
    val v11: Vector[Double] = v14(1)
    v4 = v4.copy(p0 = v14)
    val v2: Vector[Double] = v14(2)
    val v16: s0 = v6(0)
    val v13: s0 = v6(0)
    var v39: Vector[Vector[Double]] = v14
    v4 = v4.copy(p0 = v39)
    v39 = v39.updated(0, v2)
    val v25: Vector[s0] = Vector(v16, v13, v4)
    val v29: Vector[Vector[Double]] = v0.p1
    var v31: Vector[s0] = v25
    v39 = v39.updated(0, v11)
    v4 = v4.copy(p1 = v29)
    val v47: s0 = v31(0)
    v47
  }
  def f70(v0: s0): s0 = {
    var v7: s0 = v0
    val v6: Vector[s0] = Vector(v0, v7, v7)
    val v3: s0 = v6(2)
    val v14: s0 = f71(v7)
    val v10: s0 = f71(v0)
    val v11: Vector[Vector[Double]] = v14.p0
    val v12: Vector[Vector[Double]] = v10.p1
    val v30: s0 = v6(0)
    val v48: Vector[Vector[Double]] = v30.p0
    val v49: s1 = s1(v3, v6)
    val v38: s1 = f83(v49)
    v7 = v7.copy(p0 = v48)
    val v94: s0 = s0(v11, v12)
    val v72: s1 = f83(v38)
    var v58: s1 = v49
    v7 = v7.copy(p1 = v12)
    val v75: s1 = f83(v38)
    val v201: Vector[Vector[Double]] = v94.p1
    val v60: Vector[s1] = Vector(v75, v58, v75, v72, v72, v58)
    v7 = v7.copy(p1 = v201)
    val v124: s1 = v60(2)
    val v185: s0 = v124.p0
    v185
  }
  def f48(v0: s0): s0 = {
    var v5: s0 = v0
    var v2: s0 = v5
    val v1: Vector[s0] = Vector(v0)
    val v6: s0 = v1(0)
    var v9: Vector[s0] = v1
    val v7: s0 = v1(0)
    val v8: s0 = f70(v0)
    val v3: Vector[Vector[Double]] = v2.p0
    val v18: Vector[Vector[Double]] = v7.p1
    val v10: s0 = f70(v6)
    var v4: Vector[Vector[Double]] = v18
    val v16: Vector[Vector[Double]] = v6.p0
    val v23: s0 = f70(v6)
    v9 = v9.updated(0, v7)
    var v11: Vector[Vector[Double]] = v3
    val v12: Vector[Double] = v11(0)
    v2 = v2.copy(p0 = v3)
    val v15: Vector[Double] = v4(0)
    v4 = v4.updated(0, v12)
    var v19: s0 = v23
    var v17: s0 = v0
    var v21: Vector[Double] = v12
    val v22: Vector[Vector[Double]] = v7.p0
    v5 = v5.copy(p0 = v16)
    val v14: Vector[Vector[Double]] = v19.p0
    val v13: Vector[Vector[Double]] = v6.p0
    val v20: s0 = f70(v0)
    var v31: Vector[Vector[Double]] = v11
    v11 = v11.updated(1, v15)
    var v26: Vector[s0] = v9
    v4 = v4.updated(0, v15)
    v19 = v19.copy(p0 = v11)
    v5 = v5.copy(p1 = v4)
    v4 = v4.updated(0, v21)
    val v39: Vector[Vector[Double]] = v20.p1
    val v27: Vector[Double] = v4(0)
    v5 = v0
    var v33: Vector[s0] = v1
    val v56: Vector[Vector[Double]] = v7.p1
    val v41: Vector[Vector[Double]] = v17.p0
    v31 = v31.updated(1, v21)
    val v32: Vector[Vector[s0]] = Vector(v26, v9, v33, v26, v26, v1)
    val v35: Vector[Vector[Double]] = v0.p0
    var v44: Vector[Double] = v27
    v9 = v9.updated(0, v10)
    val v43: Vector[s0] = v32(1)
    v17 = v17.copy(p0 = v11)
    v2 = v2.copy(p1 = v39)
    val v81: Vector[Vector[Double]] = v8.p0
    var v50: Vector[Double] = v44
    v17 = v17.copy(p0 = v14)
    v17 = v17.copy(p0 = v35)
    v19 = v19.copy(p0 = v81)
    v19 = v2
    val v51: Double = v50(0)
    v19 = v19.copy(p0 = v13)
    val v91: s0 = f70(v19)
    val v117: Double = f72(v51)
    v21 = v21.updated(0, v117)
    val v80: s0 = v43(0)
    var v71: s0 = v80
    v33 = v33.updated(0, v91)
    v19 = v19.copy(p0 = v31)
    val v118: Vector[Vector[Double]] = v19.p1
    v17 = v17.copy(p0 = v31)
    v21 = v21.updated(0, v51)
    val v158: Vector[Double] = v4(0)
    v17 = v17.copy(p0 = v3)
    v71 = v71.copy(p0 = v41)
    v19 = v19.copy(p0 = v14)
    v19 = v19.copy(p0 = v3)
    v71 = v71.copy(p0 = v14)
    val v169: s0 = f70(v5)
    var v131: s0 = v169
    val v184: s0 = f71(v131)
    v11 = v11.updated(0, v158)
    v5 = v5.copy(p1 = v56)
    v4 = v118
    v9 = v9.updated(0, v184)
    v19 = v19.copy(p0 = v22)
    v71
  }
  def f29(v0: s0): s0 = {
    val v1: s0 = f48(v0)
    val v9: s0 = f70(v1)
    val v24: Vector[Vector[Double]] = v9.p0
    val v17: Vector[Vector[Double]] = v0.p1
    val v16: s0 = s0(v24, v17)
    v16
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: Vector[s1], v3: Double): Double = {
    val v13: s0 = f29(v1)
    var v4: Double = v3
    val v5: Vector[Vector[Double]] = v13.p0
    var v12: s0 = v1
    val v11: Vector[Vector[Double]] = v12.p0
    var v10: Vector[Vector[Double]] = v11
    val v23: Vector[Vector[Double]] = v13.p0
    var v40: Vector[Vector[Double]] = v5
    val v33: Vector[Double] = v23(1)
    v12 = v12.copy(p0 = v23)
    v12 = v12.copy(p0 = v11)
    v40 = v40.updated(0, v33)
    var v16: Vector[Vector[Double]] = v10
    val v25: Vector[Double] = v11(2)
    var v41: Vector[Vector[Double]] = v23
    val v47: Double = v25(0)
    v12 = v12.copy(p0 = v40)
    v12 = v12.copy(p0 = v16)
    var v82: Vector[Double] = v25
    var v63: Double = v3
    val v55: Vector[Vector[Double]] = v13.p1
    val v46: Double = v63 * v47
    val v71: Double = v82(0)
    val v70: Vector[Double] = v55(0)
    val v37: Double = v71 * v46
    var v72: Vector[Vector[Double]] = v55
    v12 = v12.copy(p1 = v72)
    v16 = v16.updated(1, v70)
    val v73: Vector[Double] = v55(0)
    v12 = v12.copy(p0 = v41)
    v40 = v40.updated(2, v73)
    val v64: Vector[Double] = v72(0)
    v40 = v40.updated(0, v64)
    val v57: Double = v37 / v4
    var v59: Vector[Double] = v33
    v41 = v41.updated(2, v59)
    v57
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))))
    val v1: s0 = s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))
    val v2: Vector[s1] = Vector(s1(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))
    val v3: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}