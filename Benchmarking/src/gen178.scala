import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f11(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v0.p0
    val v8: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Vector[Vector[Double]]] = Vector(v6, v8, v7, v7, v8, v7, v7)
    var v1: Vector[Vector[Vector[Double]]] = v5
    var v11: Vector[Vector[Vector[Double]]] = v5
    val v12: Vector[Vector[Double]] = v11(3)
    val v25: Vector[Vector[Double]] = v0.p1
    val v17: Vector[Vector[Double]] = v0.p0
    var v32: s0 = v0
    v32 = v32.copy(p1 = v17)
    var v26: Vector[Vector[Vector[Double]]] = v5
    v11 = v11.updated(6, v25)
    var v72: Vector[Vector[Vector[Double]]] = v1
    v72 = v72.updated(5, v8)
    v32 = v32.copy(p1 = v8)
    v32 = v32.copy(p1 = v7)
    val v24: Vector[Vector[Double]] = v32.p1
    val v29: Vector[Vector[Double]] = v32.p1
    v32 = v32.copy(p1 = v17)
    val v27: Vector[Vector[Double]] = v0.p0
    val v34: s0 = s0(v29, v25)
    v32 = v32.copy(p1 = v12)
    val v68: s0 = s0(v29, v27)
    v32 = v32.copy(p1 = v24)
    v1 = v1.updated(1, v17)
    v1 = v26
    val v36: Vector[s0] = Vector(v68, v34, v32, v32)
    val v51: Vector[Vector[Double]] = v0.p1
    v1 = v1.updated(4, v8)
    v32 = v32.copy(p1 = v51)
    val v95: Vector[Vector[Double]] = v26(1)
    v26 = v26.updated(3, v29)
    v1 = v1.updated(0, v25)
    val v54: s0 = v36(1)
    v11 = v72
    v32 = v32.copy(p0 = v95)
    v54
  }
  def f8(v0: s4): s4 = {
    var v6: s4 = v0
    val v7: Vector[Vector[s0]] = v0.p0
    v6 = v0
    var v5: Vector[Vector[s0]] = v7
    v6 = v0
    val v4: Vector[s0] = v0.p1
    v6 = v6.copy(p0 = v5)
    val v2: Vector[Vector[s0]] = v0.p0
    val v1: Vector[s0] = v0.p1
    v6 = v6.copy(p1 = v4)
    v5 = v5.updated(0, v1)
    val v9: Vector[Vector[s0]] = v0.p0
    v6 = v6.copy(p1 = v1)
    var v8: s4 = v6
    val v13: s0 = v1(0)
    val v10: s0 = v4(0)
    var v11: Vector[s0] = v4
    val v22: s0 = f11(v10)
    val v14: s0 = f11(v22)
    var v24: s4 = v0
    v6 = v6.copy(p1 = v1)
    val v19: Vector[Vector[s0]] = v0.p0
    var v29: Vector[s0] = v1
    var v17: Vector[Vector[s0]] = v2
    v17 = v17.updated(1, v11)
    val v25: Vector[Vector[s0]] = v0.p0
    val v31: Vector[Vector[s0]] = v24.p0
    val v42: s0 = f11(v13)
    v6 = v6.copy(p0 = v5)
    val v18: s0 = f11(v42)
    v29 = v29.updated(0, v14)
    v24 = v24.copy(p1 = v4)
    val v32: Vector[s0] = v9(0)
    val v40: Vector[s0] = v19(0)
    val v34: s0 = f11(v13)
    val v38: Vector[s0] = v17(1)
    v24 = v24.copy(p1 = v38)
    v11 = v11.updated(0, v18)
    val v45: s2 = s2(v32, v11)
    v24 = v24.copy(p0 = v5)
    val v111: Vector[s0] = v19(1)
    v24 = v24.copy(p0 = v19)
    var v92: s4 = v8
    v6 = v6.copy(p0 = v2)
    val v54: Vector[s4] = Vector(v6)
    v24 = v24.copy(p1 = v111)
    v92 = v92.copy(p1 = v4)
    v6 = v6.copy(p1 = v4)
    v8 = v8.copy(p1 = v38)
    v92 = v92.copy(p0 = v25)
    var v112: Vector[s4] = v54
    v112 = v112.updated(0, v24)
    v24 = v24.copy(p1 = v40)
    v11 = v11.updated(0, v34)
    val v129: s4 = v112(0)
    v92 = v92.copy(p0 = v31)
    var v86: s2 = v45
    val v293: Vector[s0] = v2(1)
    v8 = v8.copy(p1 = v29)
    val v176: Vector[s0] = v86.p0
    v17 = v17.updated(0, v293)
    v5 = v5.updated(1, v29)
    val v189: Vector[s0] = v92.p1
    v17 = v17.updated(1, v176)
    v6 = v6.copy(p1 = v189)
    v129
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v4: s4 = v0(1)
    val v14: s4 = f8(v4)
    val v27: Vector[s0] = v14.p1
    val v30: s0 = v27(0)
    val v29: Vector[Vector[Double]] = v30.p1
    val v20: s0 = s0(v29, v29)
    val v28: s0 = f11(v20)
    val v75: Vector[Vector[Double]] = v28.p1
    val v278: Vector[Double] = v75(0)
    val v139: Double = v278(0)
    v139
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s4(Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))))))
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