import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f55(v0: s0): s0 = {
    var v1: s0 = v0
    val v2: Vector[Vector[Double]] = v1.p1
    v1 = v1.copy(p1 = v2)
    val v8: Vector[Vector[Double]] = v1.p0
    val v4: Vector[Vector[Double]] = v1.p1
    val v21: Vector[Double] = v4(0)
    val v9: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p0 = v8)
    val v15: Vector[Double] = v8(2)
    var v23: Vector[Vector[Double]] = v9
    v23 = v23.updated(0, v21)
    val v24: Vector[Vector[Double]] = v1.p1
    var v32: s0 = v0
    val v20: Vector[Vector[Double]] = v1.p0
    val v25: Vector[Vector[Vector[Double]]] = Vector(v8, v20, v20, v9, v23)
    v32 = v32.copy(p0 = v23)
    val v18: Vector[Vector[Double]] = v1.p0
    v32 = v32.copy(p1 = v2)
    val v28: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p1 = v4)
    var v27: s0 = v32
    v23 = v23.updated(0, v15)
    val v34: Vector[Vector[Double]] = v1.p1
    val v37: Vector[Vector[Double]] = v25(4)
    v27 = v27.copy(p1 = v24)
    var v48: Vector[Vector[Vector[Double]]] = v25
    v48 = v48.updated(2, v18)
    v23 = v20
    v1 = v1.copy(p0 = v28)
    v27 = v27.copy(p1 = v34)
    val v109: Vector[Vector[Double]] = v48(0)
    v1 = v1.copy(p0 = v109)
    v32 = v32.copy(p0 = v37)
    v1 = v27
    var v76: s0 = v0
    v48 = v48.updated(0, v23)
    v76 = v76.copy(p0 = v18)
    v76
  }
  def f37(v0: s0): s0 = {
    var v7: s0 = v0
    val v4: Vector[Vector[Double]] = v7.p1
    var v1: Vector[Vector[Double]] = v4
    val v2: Vector[Double] = v1(0)
    val v3: Vector[Vector[Double]] = v7.p0
    val v6: Vector[Vector[Double]] = v7.p0
    val v5: Vector[Double] = v6(1)
    var v18: Vector[Vector[Double]] = v4
    var v20: s0 = v7
    v18 = v18.updated(0, v5)
    v7 = v7.copy(p1 = v4)
    val v22: s0 = s0(v3, v18)
    val v36: Vector[Vector[Double]] = v20.p0
    var v19: s0 = v0
    val v39: Vector[Vector[Double]] = v19.p1
    val v24: Vector[Double] = v39(0)
    var v52: Vector[Vector[Double]] = v36
    v19 = v19.copy(p0 = v52)
    v18 = v18.updated(0, v2)
    v7 = v7.copy(p1 = v1)
    v1 = v1.updated(0, v24)
    v22
  }
  def f31(v0: s0, v1: s0): s0 = {
    val v6: Vector[s0] = Vector(v0, v1, v0, v0, v1)
    var v5: Vector[s0] = v6
    val v2: s0 = v5(2)
    val v10: Vector[Vector[Double]] = v0.p0
    val v29: Vector[Vector[Double]] = v2.p1
    val v23: s0 = s0(v10, v29)
    v23
  }
  def f21(v0: s0): s0 = {
    val v5: s0 = f55(v0)
    val v6: Vector[Vector[Double]] = v0.p0
    val v3: s0 = f55(v5)
    val v7: Vector[Vector[Double]] = v5.p1
    val v8: s0 = s0(v6, v7)
    val v9: s0 = f37(v3)
    val v25: s0 = f31(v3, v9)
    val v18: s0 = f55(v25)
    val v15: Vector[s0] = Vector(v5, v8, v8, v0, v3, v8, v18)
    val v53: s0 = v15(4)
    val v37: s0 = f37(v53)
    v37
  }
  def f5(v0: s0): s0 = {
    var v8: s0 = v0
    var v16: s0 = v8
    val v12: s0 = f21(v16)
    val v19: Vector[s0] = Vector(v12)
    val v15: s0 = v19(0)
    v15
  }
  def f2(v0: s0): s0 = {
    var v3: s0 = v0
    var v7: s0 = v3
    var v1: s0 = v7
    var v4: s0 = v0
    val v6: Vector[s0] = Vector(v7, v4, v1, v7, v3, v7)
    val v5: s0 = v6(2)
    val v9: s0 = v6(5)
    val v13: Vector[Vector[Double]] = v4.p1
    var v10: s0 = v3
    val v15: s0 = f55(v4)
    v10 = v10.copy(p1 = v13)
    val v8: Vector[Double] = v13(0)
    val v11: Vector[Vector[Double]] = v5.p1
    val v19: s0 = v6(0)
    val v12: Vector[Vector[Double]] = v4.p0
    v4 = v4.copy(p0 = v12)
    val v24: Vector[Double] = v11(0)
    val v18: s0 = f55(v10)
    var v16: Vector[Vector[Double]] = v12
    var v14: Vector[Double] = v24
    v16 = v16.updated(2, v8)
    val v17: s0 = v6(3)
    v10 = v10.copy(p1 = v13)
    val v22: Vector[Vector[Double]] = v10.p1
    v16 = v16.updated(1, v8)
    val v21: Double = v14(0)
    var v40: s0 = v5
    val v25: s0 = f21(v40)
    v16 = v16.updated(2, v14)
    val v47: Vector[Vector[Double]] = v18.p1
    val v35: Vector[Double] = v22(0)
    var v45: Vector[Vector[Double]] = v47
    v40 = v40.copy(p0 = v16)
    val v20: s0 = f55(v19)
    val v29: s0 = f31(v5, v1)
    val v37: Vector[Vector[Double]] = v0.p1
    val v89: Vector[Vector[Double]] = v10.p0
    v45 = v45.updated(0, v35)
    v45 = v45.updated(0, v35)
    v45 = v45.updated(0, v35)
    val v34: s0 = f37(v1)
    val v55: s0 = f5(v19)
    var v79: s0 = v55
    var v57: Double = v21
    v7 = v7.copy(p0 = v89)
    v10 = v10.copy(p1 = v37)
    v79 = v34
    val v62: Vector[Vector[Double]] = v17.p0
    v40 = v40.copy(p1 = v45)
    val v56: Vector[Vector[Double]] = v25.p1
    val v52: Vector[Vector[Double]] = v15.p0
    var v82: Vector[Vector[Double]] = v45
    var v119: Vector[Vector[Double]] = v56
    val v59: s0 = f31(v20, v9)
    val v53: Double = v21 / v57
    v45 = v119
    val v138: s0 = f55(v79)
    val v115: s0 = f31(v138, v59)
    v14 = v14.updated(0, v57)
    val v66: Vector[Double] = Vector(v57, v21, v21, v53, v53)
    val v86: Vector[Vector[Double]] = v29.p0
    v79 = v79.copy(p1 = v11)
    v4 = v4.copy(p1 = v22)
    v40 = v40.copy(p0 = v89)
    v40 = v40.copy(p0 = v86)
    v1 = v1.copy(p1 = v22)
    val v73: Double = v66(4)
    v119 = v119.updated(0, v8)
    v3 = v3.copy(p0 = v62)
    v7 = v7.copy(p0 = v52)
    v14 = v14.updated(0, v73)
    v7 = v7.copy(p1 = v82)
    v115
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v9: s0 = f5(v0)
    val v5: s0 = f37(v0)
    var v8: s0 = v5
    val v6: Vector[Double] = v3(0)
    val v10: s0 = f55(v9)
    v8 = v8.copy(p1 = v3)
    var v15: Vector[Double] = v6
    var v22: Vector[Double] = v15
    v8 = v8.copy(p1 = v3)
    val v29: Double = v22(0)
    val v27: Vector[Vector[Double]] = v8.p0
    val v38: s0 = f2(v10)
    val v52: Vector[Double] = v27(2)
    val v25: Vector[Vector[Double]] = v38.p0
    v8 = v8.copy(p0 = v25)
    v22 = v22.updated(0, v1)
    val v67: Double = v52(0)
    val v73: Double = v29 / v67
    v22 = v22.updated(0, v67)
    v73
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
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