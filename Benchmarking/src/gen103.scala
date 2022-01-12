import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double,
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s4 (
    p0: s2,
    p1: Vector[s1]
  )
  def f27(v0: s0): s0 = {
    val v6: Double = v0.p1
    val v2: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Double] = v2(1)
    var v3: Vector[Vector[Double]] = v2
    var v8: s0 = v0
    val v4: Vector[Vector[Double]] = v8.p0
    val v11: Double = v1(0)
    var v7: s0 = v0
    var v16: Vector[Vector[Double]] = v2
    v7 = v7.copy(p0 = v16)
    var v13: Vector[Double] = v1
    v7 = v8
    val v30: Vector[Double] = v2(1)
    var v15: Vector[Double] = v13
    v15 = v30
    var v23: Double = v11
    v13 = v13.updated(0, v23)
    var v19: s0 = v8
    v13 = v13.updated(0, v23)
    val v9: Vector[Double] = v3(0)
    v15 = v15.updated(0, v23)
    val v12: Double = v7.p1
    v3 = v3.updated(1, v1)
    v7 = v7.copy(p0 = v16)
    v3 = v3.updated(1, v1)
    val v21: Vector[Vector[Double]] = v0.p2
    val v14: Vector[Vector[Double]] = v7.p0
    var v33: Double = v23
    var v17: s0 = v8
    v8 = v8.copy(p1 = v33)
    var v18: Vector[Vector[Double]] = v14
    val v22: Vector[Double] = v16(0)
    var v37: Vector[Vector[Double]] = v21
    var v20: Vector[Vector[Double]] = v16
    var v42: Vector[Vector[Double]] = v21
    v19 = v19.copy(p2 = v37)
    var v45: Double = v6
    v7 = v7.copy(p2 = v21)
    val v31: Vector[Double] = v21(1)
    val v25: s0 = s0(v18, v12, v42)
    v15 = v15.updated(0, v45)
    v8 = v8.copy(p0 = v4)
    val v60: Vector[Vector[Double]] = v7.p0
    val v58: Vector[Vector[Double]] = v17.p2
    val v74: Double = v8.p1
    var v39: Vector[Vector[Double]] = v58
    val v72: Vector[Double] = v39(2)
    v20 = v20.updated(1, v9)
    var v57: Vector[Vector[Double]] = v16
    val v64: Vector[Double] = v42(2)
    val v48: s1 = s1(v19, v25)
    v20 = v20.updated(0, v15)
    v19 = v19.copy(p1 = v33)
    v19 = v19.copy(p0 = v2)
    v37 = v37.updated(2, v64)
    var v55: s1 = v48
    v16 = v16.updated(1, v22)
    v55 = v48
    var v56: Vector[Vector[Double]] = v57
    var v101: Double = v74
    v7 = v7.copy(p2 = v39)
    v13 = v13.updated(0, v6)
    val v79: s0 = v55.p1
    v13 = v13.updated(0, v12)
    v17 = v17.copy(p0 = v60)
    v55 = v55.copy(p1 = v25)
    val v89: s0 = v55.p1
    v18 = v18.updated(1, v22)
    v39 = v39.updated(0, v15)
    var v238: Vector[Double] = v31
    v57 = v57.updated(1, v22)
    v13 = v13.updated(0, v101)
    v8 = v8.copy(p1 = v23)
    v39 = v39.updated(0, v72)
    v7 = v7.copy(p0 = v60)
    v57 = v20
    v55 = v55.copy(p0 = v89)
    v18 = v56
    v20 = v20.updated(0, v30)
    v42 = v42.updated(2, v238)
    v18 = v18.updated(0, v1)
    v238 = v238.updated(0, v74)
    v79
  }
  def f22(v0: s0): s0 = {
    val v5: Double = v0.p1
    var v1: s0 = v0
    val v2: Vector[Vector[Double]] = v1.p0
    val v8: s0 = f27(v0)
    v1 = v1.copy(p0 = v2)
    val v6: s0 = f27(v1)
    var v7: Vector[Vector[Double]] = v2
    val v10: Double = v0.p1
    val v3: Vector[Vector[Double]] = v1.p2
    val v11: s0 = f27(v6)
    v1 = v1.copy(p0 = v2)
    val v14: Vector[Double] = v7(1)
    v1 = v1.copy(p2 = v3)
    var v13: Vector[Vector[Double]] = v7
    val v18: s0 = f27(v1)
    v1 = v1.copy(p2 = v3)
    v1 = v1.copy(p2 = v3)
    val v21: Vector[Double] = v2(0)
    val v15: Vector[Vector[Double]] = v11.p0
    val v20: s0 = f27(v11)
    v1 = v8
    v7 = v7.updated(1, v14)
    v13 = v13.updated(0, v14)
    v13 = v13.updated(1, v14)
    val v36: Vector[Double] = v3(0)
    val v26: s0 = f27(v8)
    val v23: Double = v10 * v5
    val v35: Vector[Vector[Double]] = v11.p2
    val v24: Vector[Vector[Vector[Double]]] = Vector(v15, v7, v13)
    val v29: Double = v21(0)
    val v60: Vector[Vector[Double]] = v26.p0
    val v70: Vector[Vector[Double]] = v24(0)
    v7 = v7.updated(0, v36)
    v7 = v7.updated(1, v36)
    val v50: s0 = f27(v18)
    v1 = v1.copy(p0 = v60)
    v1 = v1.copy(p1 = v29)
    v1 = v1.copy(p0 = v60)
    v1 = v1.copy(p0 = v70)
    v1 = v1.copy(p1 = v23)
    v1 = v1.copy(p2 = v35)
    val v51: Double = v50.p1
    val v96: Vector[Double] = v15(1)
    v1 = v1.copy(p0 = v60)
    v13 = v13.updated(0, v96)
    v1 = v1.copy(p1 = v51)
    v20
  }
  def f4(v0: Vector[s1], v1: s1): s1 = {
    val v7: s1 = v0(1)
    var v3: Vector[s1] = v0
    val v6: s1 = v3(0)
    var v14: s1 = v6
    val v9: s0 = v14.p0
    val v5: s1 = v0(0)
    val v10: s0 = v7.p1
    var v12: s0 = v10
    val v15: Vector[Vector[Double]] = v9.p0
    val v13: s0 = f27(v10)
    val v21: Vector[Vector[Double]] = v9.p0
    val v25: s1 = v3(0)
    val v20: s0 = v25.p1
    val v29: Vector[Vector[Double]] = v12.p2
    v14 = v14.copy(p0 = v12)
    v12 = v12.copy(p2 = v29)
    val v31: Double = v9.p1
    val v58: s0 = v7.p0
    val v64: Vector[Vector[Double]] = v12.p2
    val v39: Double = v31 + v31
    val v46: s0 = s0(v21, v31, v64)
    v14 = v14.copy(p1 = v13)
    val v114: s1 = s1(v46, v20)
    v14 = v14.copy(p0 = v58)
    v12 = v12.copy(p1 = v39)
    v14 = v5
    v12 = v12.copy(p0 = v15)
    v114
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    val v9: Vector[s1] = v0.p1
    val v3: s1 = v9(1)
    val v2: s1 = f4(v9, v3)
    val v5: s1 = f4(v9, v2)
    var v10: Double = v1
    val v8: s0 = v5.p1
    var v14: s0 = v8
    v14 = v14.copy(p1 = v1)
    val v36: s0 = f22(v14)
    var v20: Double = v10
    val v45: Vector[Vector[Double]] = v36.p0
    var v47: Vector[Vector[Double]] = v45
    v14 = v14.copy(p1 = v20)
    val v90: Vector[Double] = v47(1)
    v14 = v14.copy(p1 = v20)
    val v91: Double = v90(0)
    val v147: Double = v91 / v91
    v147
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), 2.0, Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), 8.0, Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0)), 14.0, Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s1(s0(Vector(Vector(18.0), Vector(19.0)), 20.0, Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), 26.0, Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0)), 32.0, Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), 38.0, Vector(Vector(39.0), Vector(40.0), Vector(41.0))))))
    val v1: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}