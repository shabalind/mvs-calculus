import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f18(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v0.p0
    val v15: Vector[Vector[Double]] = v0.p1
    val v18: Vector[Vector[Double]] = v0.p1
    val v23: Vector[Vector[Double]] = v0.p1
    var v26: s0 = v0
    v26 = v26.copy(p1 = v23)
    val v29: Vector[Vector[Double]] = v0.p1
    val v36: Vector[Vector[Double]] = v0.p0
    val v49: Vector[Vector[Double]] = v0.p0
    v26 = v26.copy(p1 = v5)
    var v41: s0 = v26
    var v22: Vector[Vector[Double]] = v15
    v41 = v41.copy(p0 = v18)
    val v40: Vector[Double] = v7(0)
    v41 = v41.copy(p0 = v23)
    val v52: Vector[Vector[Double]] = v41.p1
    var v38: s0 = v0
    v41 = v41.copy(p1 = v36)
    v26 = v26.copy(p1 = v22)
    val v48: Vector[Vector[Double]] = v0.p0
    val v63: Vector[s0] = Vector(v38, v41, v26, v0, v38, v26, v41)
    v26 = v26.copy(p1 = v48)
    val v119: Vector[Vector[Double]] = v41.p0
    val v66: s0 = v63(1)
    v26 = v26.copy(p0 = v119)
    var v126: Vector[Vector[Double]] = v52
    v26 = v26.copy(p0 = v29)
    v38 = v38.copy(p0 = v5)
    v38 = v38.copy(p0 = v126)
    v22 = v22.updated(1, v40)
    v41 = v41.copy(p0 = v49)
    v66
  }
  def f14(v0: s0, v1: s0): s0 = {
    var v7: s0 = v0
    val v2: s0 = f18(v7)
    val v13: s0 = f18(v7)
    var v5: s0 = v2
    val v6: Vector[Vector[Double]] = v1.p0
    v5 = v5.copy(p1 = v6)
    v5 = v5.copy(p1 = v6)
    v5 = v5.copy(p0 = v6)
    val v36: Vector[Vector[Double]] = v13.p1
    v5 = v5.copy(p1 = v36)
    val v40: s0 = f18(v5)
    v40
  }
  def f5(v0: Vector[s0], v1: s0): s0 = {
    val v5: Vector[Vector[Double]] = v1.p0
    val v8: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v5, v5)
    val v4: s0 = v0(0)
    val v7: s0 = f18(v1)
    val v2: Vector[Vector[Double]] = v4.p0
    val v3: Vector[Vector[Double]] = v8(3)
    val v11: s0 = f14(v1, v4)
    val v10: s0 = s0(v3, v2)
    var v20: Vector[s0] = v0
    v20 = v20.updated(1, v1)
    val v38: s0 = v20(0)
    v20 = v20.updated(1, v7)
    val v73: s0 = f14(v10, v38)
    val v92: s0 = f18(v73)
    val v45: s0 = f14(v11, v92)
    v45
  }
  def f3(v0: s0): s0 = {
    val v5: s0 = f18(v0)
    val v2: s0 = f14(v0, v5)
    var v6: s0 = v5
    var v4: s0 = v6
    val v8: Vector[s0] = Vector(v2, v5)
    val v10: s0 = v8(0)
    var v12: s0 = v10
    val v3: s0 = v8(0)
    val v9: Vector[s0] = Vector(v6, v6, v2, v3)
    val v7: s0 = v8(0)
    var v13: s0 = v10
    var v21: Vector[s0] = v9
    var v14: Vector[s0] = v8
    var v27: Vector[s0] = v8
    val v22: Vector[Vector[Double]] = v0.p0
    val v11: s0 = v27(0)
    val v18: s0 = f14(v6, v6)
    val v20: s0 = f5(v27, v11)
    val v19: s0 = f5(v14, v18)
    val v17: Vector[Vector[Double]] = v4.p1
    v27 = v27.updated(1, v12)
    val v26: Vector[Vector[Double]] = v0.p0
    val v16: s0 = f14(v4, v5)
    v27 = v27.updated(1, v16)
    val v50: Vector[Vector[Double]] = v7.p0
    val v71: s0 = v21(2)
    v14 = v14.updated(1, v16)
    val v46: s0 = f5(v14, v20)
    v27 = v27.updated(1, v5)
    v4 = v4.copy(p1 = v26)
    val v30: s0 = f14(v12, v71)
    v21 = v21.updated(3, v4)
    val v54: s0 = f14(v10, v20)
    val v58: s0 = f18(v30)
    v14 = v14.updated(0, v2)
    val v51: Vector[Vector[Double]] = v58.p1
    v4 = v4.copy(p0 = v22)
    v4 = v4.copy(p0 = v50)
    v6 = v6.copy(p1 = v51)
    val v44: Vector[Vector[Double]] = v46.p1
    v12 = v12.copy(p1 = v51)
    v13 = v13.copy(p0 = v17)
    val v105: Vector[Vector[Double]] = v19.p0
    v6 = v18
    var v92: Vector[Vector[Double]] = v44
    v12 = v12.copy(p1 = v92)
    v21 = v21.updated(3, v13)
    val v108: s0 = f14(v54, v30)
    v6 = v6.copy(p1 = v105)
    v108
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: Double): Double = {
    val v5: s0 = f14(v1, v0)
    val v7: Vector[Vector[Double]] = v5.p0
    val v4: Vector[Vector[Double]] = v1.p0
    val v15: s0 = f3(v5)
    var v12: s0 = v1
    val v14: Vector[Vector[Double]] = v1.p0
    val v19: Vector[Vector[Double]] = v15.p1
    val v18: s0 = f3(v12)
    val v23: Vector[Vector[Double]] = v18.p0
    val v17: Vector[Double] = v23(0)
    v12 = v12.copy(p0 = v14)
    v12 = v12.copy(p1 = v19)
    v12 = v12.copy(p0 = v7)
    val v91: Double = v17(0)
    v12 = v12.copy(p0 = v4)
    v91
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: s0 = s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}