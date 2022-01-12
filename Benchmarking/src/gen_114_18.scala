import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  def f35(v0: s0): s0 = {
    var v8: s0 = v0
    var v6: s0 = v8
    v6
  }
  def f30(v0: Double, v1: s0, v2: Vector[s1]): Double = {
    val v4: s0 = f35(v1)
    val v9: Vector[Vector[Double]] = v4.p1
    val v57: Vector[Double] = v9(1)
    var v62: Vector[Double] = v57
    val v136: Double = v62(0)
    v136
  }
  def f26(v0: s0, v1: s0, v2: s1, v3: s2): s0 = {
    val v8: s0 = f35(v1)
    var v10: s1 = v2
    val v7: s0 = f35(v0)
    val v5: s0 = f35(v1)
    val v13: Vector[Vector[s0]] = v10.p1
    v10 = v10.copy(p1 = v13)
    val v12: s0 = f35(v7)
    val v9: s0 = f35(v5)
    val v15: Vector[s0] = v13(0)
    var v11: Vector[s0] = v15
    val v14: s0 = f35(v1)
    var v17: s1 = v2
    var v22: s0 = v1
    val v20: Vector[Vector[Double]] = v5.p0
    val v49: Vector[s0] = v13(0)
    v22 = v22.copy(p0 = v20)
    val v21: s0 = f35(v14)
    var v26: s1 = v17
    var v42: Vector[s0] = v15
    v10 = v10.copy(p0 = v8)
    val v36: Vector[s0] = v13(0)
    val v29: Vector[Vector[Double]] = v12.p1
    val v30: Vector[Vector[Double]] = v0.p0
    v11 = v11.updated(0, v21)
    v42 = v42.updated(0, v9)
    val v33: s0 = f35(v7)
    v42 = v42.updated(0, v1)
    var v44: Vector[Vector[s0]] = v13
    var v48: Vector[s0] = v36
    v10 = v10.copy(p1 = v13)
    val v37: s0 = v26.p0
    v17 = v17.copy(p1 = v13)
    val v28: Vector[Vector[s0]] = v10.p1
    val v60: s0 = v2.p0
    val v53: Vector[Vector[s0]] = v17.p1
    v44 = v44.updated(0, v11)
    val v47: s0 = f35(v12)
    v42 = v42.updated(0, v22)
    var v55: Vector[Vector[Double]] = v29
    v42 = v42.updated(0, v60)
    var v45: s0 = v37
    v44 = v53
    val v97: s0 = v17.p0
    v26 = v26.copy(p1 = v28)
    val v65: Vector[Vector[Double]] = v12.p0
    v44 = v44.updated(0, v42)
    v45 = v45.copy(p0 = v30)
    val v143: s0 = s0(v65, v55)
    v48 = v48.updated(0, v12)
    v11 = v11.updated(0, v14)
    val v56: s0 = f35(v21)
    v42 = v42.updated(0, v7)
    val v118: Vector[Vector[Double]] = v7.p1
    v44 = v44.updated(0, v49)
    var v133: Vector[Vector[Double]] = v118
    val v76: Vector[s0] = Vector(v143, v97, v37, v8, v45, v56)
    v11 = v11.updated(0, v33)
    val v68: s0 = v76(2)
    v22 = v22.copy(p1 = v55)
    v44 = v44.updated(0, v48)
    v17 = v17.copy(p0 = v47)
    v10 = v10.copy(p1 = v44)
    v45 = v45.copy(p1 = v133)
    val v153: Vector[Vector[Double]] = v0.p1
    v45 = v45.copy(p1 = v153)
    v68
  }
  def f17(v0: s2): s2 = {
    val v9: s1 = v0.p1
    val v4: s0 = v9.p0
    val v7: s0 = f26(v4, v4, v9, v0)
    val v5: Vector[Vector[s0]] = v9.p1
    val v13: Vector[s0] = v5(0)
    val v8: Vector[s0] = v5(0)
    val v10: s0 = v9.p0
    var v24: Vector[s0] = v8
    var v26: Vector[Vector[s0]] = v5
    var v25: Vector[Vector[s0]] = v26
    val v52: Vector[Vector[s1]] = v0.p0
    v24 = v24.updated(0, v7)
    v24 = v24.updated(0, v10)
    v26 = v25
    var v40: s1 = v9
    v25 = v25.updated(0, v13)
    v40 = v40.copy(p1 = v26)
    v25 = v25.updated(0, v24)
    var v69: s2 = v0
    v69 = v69.copy(p0 = v52)
    v69 = v69.copy(p1 = v40)
    v69
  }
  def f11(v0: s2): s2 = {
    val v3: s2 = f17(v0)
    val v2: s2 = f17(v3)
    v2
  }
  def f6(v0: s0): s0 = {
    val v7: s0 = f35(v0)
    var v1: s0 = v7
    var v2: s0 = v1
    val v5: Vector[Vector[Double]] = v7.p1
    val v6: s0 = f35(v1)
    val v4: s0 = f35(v2)
    var v9: Vector[Vector[Double]] = v5
    val v11: Vector[Double] = v9(0)
    val v13: Vector[Vector[Double]] = v6.p0
    v2 = v2.copy(p0 = v13)
    val v10: Vector[Vector[Double]] = v2.p1
    v1 = v1.copy(p1 = v9)
    val v12: Vector[Vector[Vector[Double]]] = Vector(v9, v9, v5, v5, v5, v10, v10)
    v2 = v2.copy(p1 = v5)
    val v34: Vector[Vector[Double]] = v0.p0
    val v32: Vector[Vector[Double]] = v12(0)
    val v20: Vector[Double] = v34(1)
    val v27: Vector[Vector[Double]] = v2.p0
    v1 = v1.copy(p0 = v27)
    v2 = v2.copy(p1 = v32)
    v9 = v9.updated(1, v11)
    v9 = v9.updated(0, v20)
    v9 = v9.updated(1, v11)
    val v41: s0 = f35(v4)
    v2 = v2.copy(p1 = v32)
    val v59: Vector[Vector[Double]] = v12(0)
    v2 = v2.copy(p0 = v34)
    val v64: Vector[Double] = v9(0)
    v9 = v9.updated(1, v64)
    v2 = v2.copy(p1 = v5)
    v1 = v2
    v1 = v1.copy(p1 = v59)
    val v142: s0 = f35(v41)
    v142
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v5: s2 = v0
    var v2: s2 = v0
    val v4: s2 = f11(v5)
    val v8: s1 = v5.p1
    val v6: s2 = f17(v0)
    val v13: s0 = v8.p0
    var v9: s2 = v2
    val v11: Vector[Vector[s0]] = v8.p1
    val v3: s1 = v6.p1
    v2 = v5
    val v12: Vector[s0] = v11(0)
    v2 = v2.copy(p1 = v3)
    val v16: Double = v1 + v1
    v2 = v2.copy(p1 = v3)
    val v18: s0 = v12(0)
    val v26: Vector[Vector[s1]] = v9.p0
    val v17: s2 = f11(v9)
    val v20: Vector[s1] = v26(0)
    var v25: s0 = v13
    val v19: Double = v1 - v16
    val v28: s0 = f26(v13, v25, v3, v17)
    val v32: s0 = v8.p0
    val v27: Double = v1 / v19
    val v46: s0 = f6(v13)
    val v33: s0 = v12(0)
    val v31: Vector[Vector[Double]] = v32.p0
    val v64: s0 = f26(v33, v18, v8, v5)
    v25 = v25.copy(p0 = v31)
    val v42: Vector[Vector[s1]] = v4.p0
    val v84: Vector[s1] = v42(0)
    v2 = v2.copy(p0 = v26)
    val v61: s1 = v84(0)
    var v69: Vector[Vector[s1]] = v42
    val v113: Double = f30(v1, v28, v20)
    val v83: Double = v113 * v27
    val v63: Vector[s1] = v69(0)
    v9 = v9.copy(p1 = v61)
    v69 = v69.updated(0, v63)
    val v94: s0 = f26(v64, v46, v8, v6)
    val v75: Double = f30(v83, v94, v63)
    v75
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))))))), s1(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))))
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