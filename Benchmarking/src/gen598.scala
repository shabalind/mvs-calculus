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
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Double]
  )
  def f106(v0: Vector[s3]): Vector[s3] = {
    val v6: s3 = v0(2)
    var v7: Vector[s3] = v0
    v7 = v7.updated(0, v6)
    var v10: Vector[s3] = v7
    v7 = v7.updated(1, v6)
    v10
  }
  def f105(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v7(0)
    val v6: Vector[Double] = v7(0)
    val v2: Vector[Vector[Double]] = v0.p1
    val v9: s0 = s0(v5, v7)
    val v1: Double = v6(0)
    var v12: Vector[Vector[Double]] = v2
    val v11: Vector[Vector[Double]] = v0.p0
    val v10: Vector[Vector[Double]] = v9.p0
    val v8: Vector[Double] = v2(0)
    v12 = v12.updated(0, v4)
    v12 = v12.updated(0, v4)
    v12 = v12.updated(0, v8)
    var v31: Double = v1
    val v28: Vector[Double] = v10(1)
    var v25: s0 = v9
    var v15: s0 = v0
    var v16: Vector[Double] = v8
    v12 = v12.updated(0, v6)
    var v19: Double = v31
    val v32: Vector[Double] = v7(0)
    val v20: Vector[Double] = v11(0)
    val v24: Vector[Vector[Double]] = v15.p1
    var v41: Vector[Double] = v20
    val v46: Vector[Vector[Double]] = v0.p1
    val v65: s0 = s0(v11, v46)
    var v40: Vector[Vector[Double]] = v46
    v41 = v41.updated(0, v1)
    v25 = v25.copy(p1 = v24)
    val v47: Vector[Vector[Double]] = v9.p1
    v15 = v15.copy(p1 = v7)
    v40 = v40.updated(0, v41)
    val v23: Vector[Vector[Double]] = v0.p1
    val v44: Vector[Vector[Double]] = v25.p0
    v25 = v25.copy(p1 = v47)
    v16 = v16.updated(0, v19)
    val v45: Vector[Vector[Double]] = v65.p1
    var v35: Vector[Double] = v16
    val v74: Vector[Vector[Double]] = v65.p1
    v41 = v41.updated(0, v19)
    val v56: Vector[Double] = v40(0)
    v25 = v25.copy(p1 = v12)
    v15 = v15.copy(p1 = v45)
    v15 = v15.copy(p1 = v23)
    v12 = v12.updated(0, v56)
    v25 = v25.copy(p1 = v74)
    v25 = v25.copy(p1 = v74)
    v12 = v12.updated(0, v32)
    v15 = v15.copy(p0 = v44)
    v12 = v12.updated(0, v35)
    v12 = v12.updated(0, v28)
    v25
  }
  def f103(v0: s3): s3 = {
    val v6: Vector[Double] = v0.p1
    var v7: Vector[Double] = v6
    val v4: Vector[s3] = Vector(v0, v0, v0)
    var v1: s3 = v0
    val v3: Double = v6(1)
    v1 = v1.copy(p1 = v6)
    v7 = v7.updated(1, v3)
    var v11: Vector[s3] = v4
    val v12: Vector[s3] = f106(v11)
    val v8: Double = v7(1)
    var v42: s3 = v1
    v42 = v42.copy(p1 = v6)
    v11 = v11.updated(1, v1)
    v7 = v7.updated(0, v8)
    v11 = v11.updated(2, v42)
    val v14: Vector[Double] = v42.p1
    v42 = v42.copy(p1 = v14)
    val v31: s3 = v12(2)
    v1 = v1.copy(p1 = v7)
    v7 = v7.updated(0, v8)
    v31
  }
  def f101(v0: s1, v1: s3): s1 = {
    var v7: s1 = v0
    val v9: s0 = v7.p1
    v7 = v7.copy(p1 = v9)
    val v11: Vector[s0] = v7.p0
    v7 = v7.copy(p0 = v11)
    val v22: Vector[s0] = v7.p0
    v7 = v7.copy(p0 = v22)
    v7 = v7.copy(p0 = v22)
    var v54: s1 = v0
    val v48: Vector[s0] = v0.p0
    v54 = v54.copy(p0 = v22)
    v54 = v54.copy(p0 = v48)
    v54
  }
  def f98(v0: s3, v1: s1): s3 = {
    val v7: s3 = f103(v0)
    var v4: s3 = v0
    val v5: Vector[s2] = v7.p0
    val v14: Vector[s2] = v7.p0
    val v17: s3 = f103(v4)
    v4 = v4.copy(p0 = v5)
    val v8: s3 = f103(v17)
    val v27: Vector[Double] = v8.p1
    val v19: s3 = s3(v14, v27)
    val v50: s3 = f103(v17)
    v4 = v50
    v19
  }
  def f59(v0: s0, v1: s3): s3 = {
    val v10: Vector[Double] = v1.p1
    val v11: s3 = f103(v1)
    val v17: Vector[s2] = v11.p0
    var v25: Vector[s2] = v17
    val v48: s3 = s3(v25, v10)
    v48
  }
  def f58(v0: s3): s3 = {
    var v2: s3 = v0
    val v4: s3 = f103(v0)
    val v13: s3 = f103(v0)
    val v1: s3 = f103(v2)
    val v5: Vector[Double] = v1.p1
    v2 = v2.copy(p1 = v5)
    v2 = v2.copy(p1 = v5)
    val v7: Vector[Double] = v13.p1
    val v15: s3 = f103(v2)
    v2 = v2.copy(p1 = v7)
    val v18: Vector[s2] = v4.p0
    val v19: s3 = f103(v15)
    var v22: Vector[s2] = v18
    val v49: s2 = v22(0)
    var v54: s2 = v49
    val v71: Vector[s2] = v0.p0
    val v43: s1 = v54.p1
    var v40: s1 = v43
    val v58: s1 = f101(v40, v19)
    v2 = v2.copy(p0 = v71)
    var v33: s1 = v58
    val v57: s3 = f98(v2, v33)
    v57
  }
  def f19(v0: s3): s3 = {
    val v5: s3 = f58(v0)
    val v6: Vector[s2] = v0.p0
    val v3: Vector[Double] = v5.p1
    val v1: s2 = v6(0)
    var v11: Vector[s2] = v6
    var v12: Vector[s2] = v6
    val v28: s3 = f58(v0)
    val v25: s1 = v1.p1
    var v19: s2 = v1
    v11 = v11.updated(0, v1)
    val v10: s1 = v19.p1
    val v24: s3 = s3(v11, v3)
    val v18: s1 = v19.p1
    val v13: s2 = v12(0)
    v19 = v19.copy(p1 = v18)
    v19 = v19.copy(p1 = v25)
    v12 = v12.updated(0, v13)
    var v26: s1 = v18
    var v42: s1 = v25
    val v41: s3 = f98(v24, v26)
    val v71: s1 = v19.p1
    v42 = v71
    val v31: s0 = v10.p1
    v26 = v26.copy(p1 = v31)
    val v30: s0 = v42.p1
    var v72: s0 = v30
    val v52: s2 = v12(0)
    val v81: s1 = f101(v42, v41)
    val v55: Vector[s2] = Vector(v52, v13, v19, v13, v19, v13, v13)
    v42 = v42.copy(p1 = v72)
    v19 = v19.copy(p1 = v81)
    val v37: s3 = f98(v28, v18)
    val v114: s0 = f105(v72)
    val v124: s2 = v55(3)
    val v62: s2 = v12(0)
    val v121: s0 = v81.p1
    val v95: s3 = f59(v121, v37)
    v26 = v26.copy(p1 = v30)
    v11 = v11.updated(0, v62)
    v12 = v12.updated(0, v13)
    val v79: Vector[Vector[Double]] = v114.p1
    v72 = v72.copy(p1 = v79)
    v11 = v11.updated(0, v124)
    v72 = v121
    v95
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v7: s3 = f103(v0)
    val v4: s3 = f19(v7)
    val v5: s3 = f103(v4)
    val v23: Vector[Double] = v5.p1
    val v68: Double = v23(0)
    v68
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))))), s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))), Vector(18.0, 19.0))
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