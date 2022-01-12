import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s4 (
    p0: s0,
    p1: s0
  )
  def f105(v0: s4): s4 = {
    val v7: s0 = v0.p1
    var v6: s0 = v7
    var v21: s4 = v0
    v21 = v21.copy(p1 = v6)
    v21
  }
  def f72(v0: s0): s0 = {
    val v1: Vector[Double] = v0.p1
    val v5: Vector[Double] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Double] = v6(1)
    val v8: Vector[Double] = v0.p1
    val v4: Double = v5(1)
    var v7: Vector[Vector[Double]] = v6
    val v10: Double = v8(1)
    var v12: Vector[Vector[Double]] = v6
    var v13: Vector[Double] = v2
    val v9: Double = v2(0)
    val v11: Vector[Vector[Double]] = v0.p0
    var v15: Vector[Double] = v1
    var v19: Vector[Double] = v8
    val v34: Vector[s0] = Vector(v0, v0)
    val v14: Vector[Double] = v7(0)
    val v21: Vector[Double] = v0.p1
    v13 = v13.updated(0, v4)
    val v24: s0 = v34(1)
    val v17: Double = v13(0)
    v15 = v15.updated(1, v10)
    val v41: Vector[Vector[Double]] = v0.p0
    val v25: s0 = v34(1)
    var v36: Double = v10
    val v45: Vector[Vector[Double]] = v24.p0
    v15 = v15.updated(1, v17)
    val v35: Vector[Double] = v11(2)
    var v73: Vector[s0] = v34
    val v60: Double = v2(0)
    var v37: s0 = v25
    var v51: Vector[Vector[Double]] = v45
    val v44: s0 = v73(0)
    v15 = v15.updated(1, v17)
    var v66: Vector[Double] = v35
    v73 = v34
    var v136: s0 = v37
    v136 = v136.copy(p0 = v11)
    v15 = v15.updated(1, v4)
    v37 = v37.copy(p0 = v51)
    v19 = v19.updated(1, v36)
    v136 = v136.copy(p1 = v15)
    var v47: Vector[Double] = v2
    v12 = v12.updated(2, v14)
    var v99: Vector[Double] = v14
    val v86: Vector[Double] = v44.p1
    v37 = v37.copy(p0 = v51)
    val v104: Vector[Vector[Double]] = Vector(v19, v21, v19, v15, v21)
    v66 = v66.updated(0, v9)
    v37 = v37.copy(p1 = v86)
    val v174: Vector[Vector[Double]] = Vector(v14, v2, v66, v47, v2, v99, v14)
    val v133: Vector[Double] = v174(4)
    v136 = v136.copy(p0 = v41)
    val v124: Vector[Double] = v104(3)
    v37 = v37.copy(p1 = v124)
    v7 = v7.updated(1, v133)
    v37 = v37.copy(p0 = v12)
    val v134: Vector[Double] = v11(2)
    v12 = v12.updated(0, v134)
    v13 = v13.updated(0, v60)
    v136
  }
  def f63(v0: s0): s0 = {
    val v1: s0 = f72(v0)
    val v4: s0 = f72(v0)
    val v9: s0 = f72(v0)
    val v20: s0 = f72(v1)
    val v42: s0 = f72(v20)
    val v25: s4 = s4(v1, v9)
    val v54: s4 = f105(v25)
    var v73: s4 = v54
    val v134: s4 = f105(v73)
    var v81: s4 = v73
    v81 = v81.copy(p1 = v9)
    val v60: s0 = v134.p1
    v73 = v73.copy(p0 = v60)
    v81 = v81.copy(p1 = v60)
    val v103: s0 = v81.p1
    v73 = v73.copy(p0 = v42)
    v81 = v81.copy(p1 = v4)
    v103
  }
  def f14(v0: Double): Double = {
    var v1: Double = v0
    var v4: Double = v0
    var v6: Double = v0
    var v14: Double = v6
    val v9: Double = v1 * v4
    var v19: Double = v0
    var v10: Double = v6
    var v12: Double = v6
    val v17: Vector[Double] = Vector(v14, v9)
    v14 = v6
    val v21: Double = v17(1)
    val v13: Vector[Double] = Vector(v4, v12)
    val v72: Double = v17(1)
    val v27: Double = v13(0)
    val v67: Vector[Vector[Double]] = Vector(v17, v13)
    var v36: Vector[Double] = v13
    var v41: Vector[Vector[Double]] = v67
    v6 = v27
    v36 = v36.updated(1, v72)
    var v77: Vector[Double] = v13
    val v59: Vector[Vector[Double]] = Vector(v77, v13, v17, v36, v13, v36)
    val v45: Vector[Vector[Double]] = Vector(v36, v13, v13)
    var v51: Vector[Double] = v17
    v41 = v41.updated(1, v51)
    var v66: Vector[Vector[Double]] = v41
    v77 = v77.updated(0, v27)
    v51 = v51.updated(0, v21)
    v66 = v66.updated(1, v77)
    v77 = v77.updated(1, v6)
    v77 = v13
    v66 = v66.updated(1, v77)
    v66 = v66.updated(1, v17)
    var v58: Vector[Vector[Double]] = v59
    val v149: Vector[Double] = v58(0)
    var v78: Vector[Vector[Double]] = v45
    var v39: Vector[Vector[Double]] = v67
    val v64: Vector[Double] = v78(0)
    val v126: Double = v149(0)
    v4 = v10
    v36 = v36.updated(0, v19)
    v41 = v39
    val v115: Vector[Double] = v66(1)
    v51 = v51.updated(1, v4)
    var v91: Vector[Double] = v115
    v41 = v41.updated(0, v64)
    v39 = v39.updated(1, v91)
    v41 = v41.updated(0, v64)
    v58 = v58.updated(3, v91)
    v126
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: s0 = f72(v0)
    val v5: Vector[Double] = v3.p1
    val v7: Vector[Vector[Double]] = v0.p0
    val v6: Double = f14(v1)
    val v2: Vector[Double] = v7(2)
    val v9: Double = v6 - v1
    val v10: Double = v5(1)
    val v4: s0 = f63(v0)
    val v11: Vector[Vector[Double]] = v4.p0
    var v17: Vector[Double] = v2
    var v21: Vector[Double] = v17
    v21 = v17
    v21 = v21.updated(0, v10)
    val v27: Double = f14(v9)
    val v18: Double = v2(0)
    var v29: Vector[Vector[Double]] = v11
    v29 = v29.updated(2, v21)
    v21 = v21.updated(0, v27)
    v17 = v17.updated(0, v18)
    val v41: Double = v21(0)
    val v55: Vector[Double] = v29(2)
    val v124: Double = v55(0)
    v21 = v21.updated(0, v124)
    v41
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}