import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f19(v0: s0): s0 = {
    var v4: s0 = v0
    var v1: s0 = v4
    val v3: Vector[Vector[Double]] = v1.p1
    val v11: Vector[Vector[Vector[Double]]] = Vector(v3, v3, v3, v3, v3, v3, v3)
    var v8: s0 = v1
    v8 = v8.copy(p1 = v3)
    val v16: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Double]] = v11(5)
    var v2: Vector[Vector[Double]] = v5
    var v12: Vector[Vector[Vector[Double]]] = v11
    val v19: Vector[Vector[Double]] = v1.p0
    var v14: Vector[Vector[Vector[Double]]] = v11
    val v15: Vector[Vector[Double]] = v4.p1
    v14 = v14.updated(5, v3)
    val v13: Vector[Vector[Double]] = v0.p0
    val v28: Vector[Double] = v16(0)
    val v17: Vector[Vector[Double]] = v14(2)
    v12 = v12.updated(3, v2)
    val v39: s0 = s0(v19, v3)
    v14 = v14.updated(1, v2)
    v2 = v15
    var v18: Vector[Double] = v28
    val v30: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v30)
    val v23: Vector[Vector[Double]] = v12(2)
    v2 = v2.updated(0, v18)
    val v21: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p0 = v13)
    v14 = v14.updated(2, v3)
    val v43: Vector[Vector[Double]] = v1.p1
    val v40: s0 = s0(v13, v43)
    var v34: s0 = v8
    v14 = v14.updated(3, v43)
    v1 = v1.copy(p0 = v13)
    val v55: Vector[Vector[Double]] = v40.p1
    v1 = v1.copy(p1 = v17)
    var v141: s0 = v39
    v8 = v8.copy(p1 = v55)
    v4 = v4.copy(p1 = v23)
    v1 = v34
    v1 = v1.copy(p1 = v2)
    v12 = v12.updated(4, v55)
    v141 = v141.copy(p1 = v17)
    v1 = v1.copy(p0 = v16)
    v34 = v34.copy(p0 = v21)
    v8 = v8.copy(p0 = v19)
    v12 = v12.updated(1, v2)
    v8 = v8.copy(p1 = v55)
    v14 = v14.updated(4, v23)
    v34 = v34.copy(p0 = v19)
    v141
  }
  def f16(v0: s0): s0 = {
    var v7: s0 = v0
    val v3: s0 = f19(v7)
    val v2: Vector[Vector[Double]] = v3.p0
    val v9: s0 = f19(v0)
    val v4: s0 = f19(v7)
    val v13: s0 = f19(v7)
    var v6: Vector[Vector[Double]] = v2
    var v15: s0 = v9
    var v11: s0 = v15
    var v10: s0 = v13
    val v17: s0 = f19(v10)
    val v29: s0 = f19(v15)
    val v1: Vector[Vector[Double]] = v29.p1
    v15 = v15.copy(p0 = v2)
    val v18: Vector[Double] = v1(0)
    val v30: Vector[Vector[Double]] = v17.p1
    val v16: Vector[Vector[Double]] = v4.p0
    v6 = v6.updated(0, v18)
    v11 = v11.copy(p1 = v30)
    var v19: s0 = v10
    val v35: Vector[Vector[Double]] = v7.p0
    val v22: s0 = f19(v0)
    val v34: Vector[Vector[Double]] = v0.p1
    v11 = v11.copy(p1 = v30)
    v19 = v19.copy(p1 = v1)
    val v57: Vector[Double] = v6(1)
    v6 = v6.updated(1, v57)
    val v27: Vector[Vector[Double]] = v10.p0
    var v41: Vector[Vector[Double]] = v1
    v10 = v10.copy(p0 = v16)
    val v31: s0 = f19(v0)
    val v61: Vector[Vector[Double]] = v9.p1
    val v42: s0 = f19(v4)
    val v39: s0 = f19(v13)
    val v32: s0 = f19(v31)
    v19 = v19.copy(p1 = v41)
    val v66: Vector[Double] = v35(1)
    v15 = v39
    val v56: s0 = f19(v42)
    val v36: Vector[Vector[Double]] = v32.p0
    var v45: Vector[Vector[Double]] = v27
    v19 = v42
    v11 = v11.copy(p1 = v41)
    v11 = v11.copy(p0 = v2)
    var v86: Vector[Vector[Double]] = v6
    v6 = v6.updated(1, v66)
    v7 = v7.copy(p0 = v6)
    val v117: s0 = f19(v22)
    val v93: s0 = f19(v19)
    v7 = v7.copy(p0 = v36)
    val v94: Vector[Vector[Double]] = v93.p1
    val v96: s0 = f19(v117)
    var v82: Vector[Vector[Double]] = v1
    v19 = v19.copy(p1 = v30)
    val v71: Vector[Vector[Double]] = v11.p0
    v15 = v15.copy(p1 = v82)
    v15 = v15.copy(p0 = v71)
    val v135: Vector[Vector[Double]] = v96.p1
    v10 = v10.copy(p0 = v45)
    v7 = v7.copy(p1 = v82)
    v15 = v15.copy(p0 = v2)
    v7 = v7.copy(p1 = v94)
    v11 = v11.copy(p0 = v2)
    val v223: s0 = f19(v56)
    v10 = v223
    v7 = v7.copy(p1 = v34)
    v15 = v15.copy(p1 = v135)
    v10 = v10.copy(p1 = v61)
    v19 = v19.copy(p0 = v86)
    v19
  }
  def f14(v0: s0, v1: s0): s0 = {
    val v18: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Vector[Double]]] = Vector(v18, v18)
    val v34: s0 = f16(v1)
    val v45: Vector[Vector[Double]] = v14(1)
    val v40: Vector[Vector[Double]] = v34.p1
    val v47: s0 = s0(v45, v40)
    val v49: s0 = f19(v47)
    val v136: s0 = f16(v49)
    v136
  }
  def f10(v0: s0): s0 = {
    var v2: s0 = v0
    var v7: s0 = v2
    val v4: s0 = f14(v0, v7)
    val v5: Vector[Vector[Double]] = v0.p0
    val v11: Vector[Vector[Double]] = v4.p1
    val v15: s0 = s0(v5, v11)
    val v12: s0 = f14(v15, v4)
    val v50: s0 = f16(v4)
    val v60: Vector[Vector[Double]] = v50.p1
    val v91: s0 = f19(v12)
    v2 = v2.copy(p1 = v60)
    v91
  }
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: s0, v3: Double): Double = {
    val v11: s0 = v0(0)
    val v20: s0 = f10(v11)
    val v14: Double = v3 + v3
    val v19: Vector[Vector[Double]] = v20.p1
    val v39: Vector[Double] = v19(0)
    val v128: Double = v39(0)
    val v116: Double = v128 - v14
    v116
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))
    val v1: s0 = s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))
    val v2: s0 = s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))
    val v3: Double = 9.0
    val start = nanoTime()
    var result: Double = 9.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}