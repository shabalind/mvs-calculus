import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f58(v0: s1, v1: Vector[s0]): s1 = {
    val v5: Vector[Vector[s0]] = Vector(v1, v1, v1, v1)
    val v4: Vector[s0] = v5(0)
    val v10: s0 = v1(1)
    val v9: Vector[Vector[s0]] = Vector(v1, v4)
    val v21: s0 = v4(2)
    val v46: Vector[s0] = v9(0)
    val v12: Vector[Vector[Double]] = v10.p0
    var v39: Vector[Vector[Double]] = v12
    val v14: Vector[Vector[Double]] = v21.p1
    var v30: Vector[Vector[Double]] = v39
    val v18: Vector[s0] = v0.p1
    var v34: Vector[s0] = v18
    val v32: Vector[s0] = v0.p1
    var v61: Vector[Vector[Double]] = v14
    var v31: s1 = v0
    val v40: Vector[Double] = v39(0)
    v31 = v31.copy(p0 = v46)
    val v29: Vector[Double] = v30(0)
    val v76: s0 = v34(0)
    val v63: Vector[Vector[Double]] = v76.p0
    val v83: s0 = s0(v63, v61)
    var v51: Vector[s0] = v32
    v61 = v61.updated(0, v29)
    val v170: Vector[s0] = v0.p1
    v39 = v39.updated(0, v40)
    v30 = v30.updated(0, v29)
    v31 = v31.copy(p1 = v170)
    val v94: Vector[s0] = v31.p1
    v31 = v31.copy(p0 = v4)
    var v65: s1 = v31
    v51 = v51.updated(1, v83)
    v65 = v65.copy(p1 = v51)
    v65 = v65.copy(p1 = v51)
    v65 = v65.copy(p1 = v94)
    v31 = v31.copy(p1 = v32)
    v65
  }
  def f55(v0: s1): s1 = {
    v0
  }
  def f47(v0: s1, v1: s0): s1 = {
    var v11: s1 = v0
    var v12: s1 = v11
    v12
  }
  def f43(v0: s1, v1: s1): s1 = {
    val v6: Vector[s0] = v1.p0
    val v9: s1 = f58(v0, v6)
    val v22: s1 = f55(v9)
    val v59: s1 = f55(v22)
    val v24: Vector[s0] = v59.p0
    val v146: s1 = f58(v9, v24)
    val v101: s1 = f55(v146)
    v101
  }
  def f35(v0: s1, v1: s1): s1 = {
    var v6: s1 = v0
    val v7: Vector[s0] = v1.p0
    val v5: Vector[s0] = v6.p1
    v6 = v6.copy(p0 = v7)
    val v4: s0 = v7(0)
    var v11: s0 = v4
    var v8: Vector[s0] = v7
    val v18: Vector[s0] = v6.p0
    val v17: Vector[Vector[Double]] = v4.p1
    val v15: Vector[Vector[Double]] = v4.p1
    var v21: Vector[Vector[Double]] = v17
    val v10: s0 = v7(0)
    var v16: s0 = v10
    val v12: s0 = s0(v17, v15)
    v11 = v11.copy(p0 = v15)
    v6 = v6.copy(p0 = v7)
    val v14: s0 = v18(0)
    v8 = v8.updated(2, v10)
    v8 = v8.updated(0, v12)
    var v34: Vector[Vector[Double]] = v15
    v8 = v8.updated(0, v10)
    val v23: Vector[Double] = v17(0)
    val v52: s1 = s1(v8, v5)
    v11 = v11.copy(p1 = v34)
    v11 = v11.copy(p1 = v21)
    val v19: s1 = f43(v0, v6)
    v21 = v21.updated(0, v23)
    val v25: Vector[Vector[Double]] = v11.p1
    v8 = v8.updated(1, v12)
    v11 = v11.copy(p1 = v21)
    var v22: Vector[Vector[Double]] = v25
    val v42: Vector[Vector[Double]] = v16.p0
    val v35: Vector[s0] = v19.p0
    val v69: s0 = s0(v42, v21)
    v22 = v22.updated(0, v23)
    val v68: Vector[Double] = v17(0)
    val v50: s1 = f47(v52, v4)
    v8 = v35
    val v54: s1 = f47(v0, v69)
    v21 = v21.updated(0, v68)
    v16 = v16.copy(p1 = v22)
    v16 = v16.copy(p1 = v34)
    v11 = v14
    val v66: s1 = f43(v50, v54)
    v8 = v8.updated(1, v69)
    v66
  }
  def f12(v0: s1): s1 = {
    val v6: s1 = f35(v0, v0)
    val v2: Vector[s0] = v6.p1
    val v5: s1 = f55(v0)
    val v8: s1 = f43(v6, v5)
    val v41: Vector[s0] = v5.p0
    val v32: s1 = f43(v8, v5)
    val v56: s1 = f35(v0, v32)
    var v126: s1 = v56
    v126 = v126.copy(p1 = v2)
    v126 = v126.copy(p0 = v41)
    val v64: s1 = f55(v126)
    v64
  }
  @noinline
  def f0(v0: s0, v1: Vector[s1], v2: Double): Double = {
    val v6: s1 = v1(1)
    val v9: s1 = f12(v6)
    val v8: Vector[s0] = v9.p0
    val v28: s0 = v8(0)
    val v24: Vector[Vector[Double]] = v28.p0
    val v16: Vector[Double] = v24(0)
    val v23: Double = v16(0)
    v23
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0)))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))))), s1(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}