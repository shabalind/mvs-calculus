import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f31(v0: Vector[s0]): Vector[s0] = {
    val v2: s0 = v0(2)
    var v1: Vector[s0] = v0
    v1 = v1.updated(2, v2)
    val v28: s0 = v1(1)
    v1 = v1.updated(0, v28)
    val v7: Vector[Vector[s0]] = Vector(v1, v0, v0)
    val v30: Vector[s0] = v7(2)
    v30
  }
  def f20(v0: s0): s0 = {
    var v7: s0 = v0
    var v3: s0 = v7
    var v4: s0 = v7
    val v8: Vector[s0] = Vector(v3)
    val v2: s0 = v8(0)
    val v5: s0 = v8(0)
    val v6: s0 = v8(0)
    v7 = v5
    val v1: Vector[Vector[Double]] = v4.p1
    var v17: Vector[Vector[Double]] = v1
    v3 = v3.copy(p1 = v17)
    var v9: Vector[Vector[Double]] = v17
    val v13: s0 = v8(0)
    val v15: Vector[Double] = v1(0)
    v17 = v17.updated(2, v15)
    var v10: Vector[Double] = v15
    val v24: Vector[Vector[Double]] = v3.p0
    v9 = v9.updated(0, v10)
    v4 = v13
    val v29: Vector[s0] = Vector(v5, v4, v13, v2, v4, v0, v3)
    val v28: Vector[Double] = v24(0)
    val v41: Vector[Vector[Double]] = v6.p1
    v4 = v4.copy(p1 = v41)
    var v20: s0 = v3
    v20 = v20.copy(p1 = v9)
    val v42: Vector[Vector[Double]] = v20.p0
    v7 = v7.copy(p0 = v42)
    val v70: s0 = v29(1)
    v3 = v3.copy(p1 = v1)
    v3 = v3.copy(p0 = v24)
    v9 = v9.updated(2, v28)
    v4 = v4.copy(p0 = v42)
    v20 = v20.copy(p1 = v9)
    val v53: Vector[Vector[Double]] = v70.p1
    val v55: s0 = s0(v24, v53)
    v55
  }
  def f18(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v7: s0 = f20(v0)
    var v2: Vector[Vector[Double]] = v3
    var v5: Vector[Vector[Double]] = v2
    var v1: s0 = v7
    val v6: s0 = f20(v1)
    v1 = v1.copy(p0 = v3)
    var v10: s0 = v6
    val v8: Vector[Vector[Double]] = v1.p1
    v10 = v10.copy(p1 = v8)
    val v11: s0 = f20(v0)
    var v18: Vector[Vector[Double]] = v8
    val v40: s0 = f20(v11)
    var v22: Vector[Vector[Double]] = v5
    v10 = v1
    v10 = v10.copy(p0 = v22)
    v1 = v1.copy(p0 = v2)
    val v20: Vector[Vector[Double]] = v7.p1
    v1 = v1.copy(p1 = v20)
    var v34: Vector[Vector[Double]] = v20
    val v21: Vector[Vector[Double]] = v10.p0
    val v45: s0 = f20(v1)
    val v50: Vector[Vector[Double]] = v45.p1
    val v36: s0 = s0(v22, v18)
    var v53: Vector[Vector[Double]] = v22
    val v48: s0 = f20(v40)
    var v31: s0 = v1
    var v49: Vector[Vector[Double]] = v34
    val v58: Vector[s0] = Vector(v40, v7, v31, v48, v36)
    val v57: s0 = v58(0)
    val v64: Vector[Double] = v5(0)
    v18 = v18.updated(1, v64)
    val v47: Vector[Double] = v21(0)
    v10 = v10.copy(p1 = v34)
    val v26: Vector[Vector[Double]] = v31.p0
    val v59: Vector[Double] = v21(0)
    val v70: s0 = v58(1)
    val v83: Vector[Double] = v34(1)
    val v62: Vector[Vector[Double]] = v57.p0
    val v87: Vector[Double] = v53(0)
    v31 = v31.copy(p1 = v49)
    val v86: Vector[Vector[Double]] = v11.p1
    var v120: Vector[Vector[Double]] = v21
    v31 = v31.copy(p1 = v86)
    v18 = v18.updated(0, v87)
    val v78: s0 = s0(v26, v50)
    v2 = v2.updated(0, v64)
    v31 = v31.copy(p1 = v34)
    var v255: s0 = v78
    v31 = v31.copy(p0 = v120)
    v18 = v18.updated(0, v47)
    val v149: Vector[Vector[Double]] = v70.p1
    v49 = v149
    v255 = v255.copy(p1 = v50)
    v5 = v53
    v255 = v255.copy(p0 = v62)
    v22 = v22.updated(0, v59)
    v5 = v62
    v53 = v53.updated(0, v83)
    val v214: s0 = f20(v255)
    v214
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    var v7: Vector[s0] = v0
    val v5: s0 = v0(0)
    val v4: s0 = v7(2)
    val v9: Vector[s0] = f31(v7)
    val v2: s0 = v7(2)
    val v13: Vector[Vector[Double]] = v4.p0
    val v3: s0 = f18(v2)
    val v11: s0 = v9(1)
    val v12: s0 = v0(0)
    val v10: Vector[Vector[Double]] = v4.p1
    val v23: s0 = f18(v3)
    v7 = v7.updated(2, v5)
    val v17: Vector[Double] = v10(2)
    val v29: Vector[Double] = v13(0)
    var v33: Vector[Double] = v17
    val v14: Vector[Vector[Double]] = v12.p0
    v7 = v7.updated(2, v23)
    var v21: Vector[Vector[Double]] = v10
    val v34: Vector[Double] = v13(0)
    val v42: s0 = s0(v14, v21)
    val v52: s0 = f18(v42)
    val v57: Double = v34(0)
    v21 = v21.updated(1, v17)
    val v127: s0 = f20(v52)
    val v111: Double = v29(0)
    val v61: Double = v111 * v57
    v7 = v7.updated(0, v127)
    v7 = v7.updated(0, v11)
    v21 = v21.updated(2, v33)
    v61
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}