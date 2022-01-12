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
    p0: s0,
    p1: s0
  )
  def f12(v0: Double, v1: s1): s1 = {
    val v7: s0 = v1.p1
    var v3: s0 = v7
    val v2: s0 = v1.p1
    var v5: s0 = v7
    val v9: s0 = v1.p1
    val v4: Vector[Vector[Double]] = v3.p0
    var v10: s0 = v5
    val v11: Vector[Vector[Double]] = v2.p1
    val v23: Vector[s0] = v1.p0
    val v46: Vector[Vector[Double]] = v5.p1
    val v16: s0 = s0(v4, v11)
    val v13: Vector[s0] = Vector(v7, v10, v10)
    v5 = v5.copy(p0 = v46)
    var v12: Vector[s0] = v13
    val v19: Vector[Vector[Double]] = v5.p0
    v12 = v13
    v3 = v3.copy(p0 = v4)
    v5 = v5.copy(p1 = v46)
    var v36: s1 = v1
    val v17: Vector[Vector[Double]] = v9.p0
    val v18: s0 = v36.p1
    val v26: s0 = v36.p1
    val v42: s0 = v23(0)
    val v52: s0 = v23(0)
    v5 = v5.copy(p1 = v46)
    val v59: s0 = v23(0)
    val v48: Vector[s0] = v36.p0
    var v43: Vector[s0] = v12
    val v27: s0 = v12(1)
    var v22: Vector[s0] = v43
    val v57: Vector[s0] = Vector(v2, v9)
    v36 = v36.copy(p1 = v9)
    v12 = v12.updated(1, v27)
    var v56: Vector[s0] = v43
    v56 = v56.updated(2, v7)
    v56 = v56.updated(1, v42)
    v22 = v22.updated(1, v16)
    var v69: s1 = v36
    val v30: s0 = v23(0)
    val v29: Vector[s0] = v69.p0
    val v39: Vector[s0] = v1.p0
    v22 = v22.updated(2, v42)
    var v38: Vector[s0] = v57
    val v98: s0 = v56(2)
    v43 = v22
    var v77: s1 = v36
    val v49: s0 = v39(0)
    val v47: Vector[s0] = v77.p0
    v69 = v69.copy(p0 = v39)
    v22 = v22.updated(0, v18)
    val v64: s0 = v38(0)
    val v85: Vector[Vector[Double]] = v49.p1
    v5 = v5.copy(p0 = v17)
    val v113: Vector[Vector[Double]] = v64.p1
    var v72: s0 = v9
    val v60: Vector[Vector[Double]] = v3.p0
    val v53: s2 = s2(v2, v18)
    v77 = v77.copy(p0 = v47)
    v22 = v22.updated(1, v18)
    val v99: s0 = v53.p1
    v5 = v5.copy(p1 = v60)
    v12 = v12.updated(0, v52)
    v36 = v36.copy(p1 = v49)
    val v76: Vector[Vector[s0]] = Vector(v47, v48, v39, v29)
    v12 = v12.updated(0, v59)
    v3 = v3.copy(p0 = v19)
    val v123: Vector[Vector[Double]] = v30.p0
    v77 = v77.copy(p1 = v72)
    v12 = v12.updated(2, v26)
    val v295: s0 = v23(0)
    v72 = v72.copy(p0 = v113)
    val v182: Vector[s0] = v76(2)
    v69 = v69.copy(p1 = v98)
    v22 = v13
    v10 = v10.copy(p0 = v123)
    val v283: s1 = s1(v182, v98)
    var v148: Vector[s0] = v29
    v3 = v3.copy(p0 = v85)
    v36 = v36.copy(p1 = v99)
    v38 = v38.updated(0, v295)
    v36 = v36.copy(p0 = v148)
    v283
  }
  def f7(v0: s1, v1: s0, v2: s1): s0 = {
    val v8: Vector[Vector[Double]] = v1.p1
    val v4: Vector[Double] = v8(1)
    val v7: Double = v4(0)
    val v9: Vector[Vector[Double]] = v1.p0
    var v14: s1 = v2
    val v23: Vector[Double] = v9(1)
    val v18: Vector[s0] = v14.p0
    v14 = v14.copy(p1 = v1)
    v14 = v14.copy(p1 = v1)
    val v20: Double = v7 - v7
    v14 = v14.copy(p0 = v18)
    val v33: Double = v4(0)
    val v17: Double = v23(0)
    val v22: s1 = f12(v20, v14)
    v14 = v14.copy(p1 = v1)
    val v30: s1 = f12(v17, v0)
    val v25: s1 = f12(v33, v30)
    val v26: s1 = f12(v33, v25)
    val v34: Vector[s0] = v26.p0
    val v104: Vector[s0] = v26.p0
    var v59: s1 = v22
    val v35: Vector[s0] = v59.p0
    val v84: s0 = v18(0)
    var v129: s0 = v84
    val v79: s0 = v35(0)
    var v95: Vector[s0] = v34
    v59 = v59.copy(p0 = v104)
    v14 = v14.copy(p0 = v35)
    v14 = v14.copy(p1 = v84)
    v14 = v14.copy(p0 = v95)
    v95 = v95.updated(0, v129)
    v79
  }
  @noinline
  def f0(v0: Vector[s0], v1: s2, v2: s0, v3: Vector[s1], v4: Double): Double = {
    val v10: s1 = s1(v0, v2)
    var v9: Vector[s0] = v0
    val v5: Vector[s0] = v10.p0
    val v7: s0 = v1.p0
    var v6: Double = v4
    var v8: s0 = v2
    var v13: s1 = v10
    val v11: Vector[s0] = v10.p0
    val v15: s0 = v10.p1
    v13 = v13.copy(p0 = v11)
    var v12: s1 = v10
    v13 = v13.copy(p1 = v2)
    val v14: s1 = s1(v9, v2)
    val v17: s0 = v9(0)
    val v35: s1 = f12(v4, v12)
    v9 = v9.updated(0, v15)
    val v19: Vector[Vector[Double]] = v8.p1
    val v28: Vector[s0] = v13.p0
    val v46: s0 = f7(v12, v17, v14)
    val v23: Vector[Double] = v19(1)
    val v30: s0 = f7(v35, v7, v13)
    v8 = v8.copy(p1 = v19)
    v12 = v12.copy(p0 = v5)
    v8 = v8.copy(p1 = v19)
    val v44: Double = v23(0)
    val v54: Vector[Vector[Double]] = v46.p1
    v13 = v13.copy(p0 = v28)
    var v109: Vector[Double] = v23
    val v110: Vector[Double] = v54(0)
    var v97: Vector[Double] = v109
    v13 = v12
    v109 = v109.updated(0, v44)
    val v127: Double = v97(0)
    val v120: Double = v44 - v6
    v9 = v9.updated(0, v30)
    v109 = v110
    v97 = v97.updated(0, v6)
    val v294: Double = v127 * v120
    v294
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))
    val v1: s2 = s2(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v2: s0 = s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))
    val v3: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))
    val v4: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}