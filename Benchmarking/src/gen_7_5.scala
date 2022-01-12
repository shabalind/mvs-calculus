import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f11(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v7: Vector[Vector[Vector[Double]]] = Vector(v0, v0, v0, v0, v0)
    val v1: Vector[Vector[Double]] = v7(2)
    val v5: Vector[Double] = v0(1)
    val v4: Double = v5(0)
    val v8: Vector[Double] = v1(0)
    val v6: Vector[Vector[Double]] = v7(2)
    var v3: Vector[Vector[Double]] = v0
    v3 = v3.updated(1, v8)
    var v20: Vector[Vector[Vector[Double]]] = v7
    var v15: Vector[Vector[Double]] = v1
    v3 = v3.updated(0, v8)
    var v13: Double = v4
    var v10: Vector[Vector[Double]] = v3
    val v18: Vector[Vector[Double]] = v20(0)
    val v29: Vector[Double] = v15(1)
    var v23: Vector[Double] = v8
    var v24: Vector[Double] = v29
    v20 = v20.updated(3, v1)
    v20 = v20.updated(3, v18)
    v3 = v3.updated(0, v23)
    v20 = v20.updated(1, v18)
    v15 = v15.updated(0, v24)
    v15 = v15.updated(1, v29)
    v24 = v24.updated(0, v13)
    val v25: Vector[Vector[Double]] = v20(0)
    val v43: Vector[Double] = v25(0)
    v3 = v3.updated(1, v23)
    v3 = v3.updated(1, v43)
    val v64: Vector[Vector[Double]] = Vector(v23, v43, v5)
    v3 = v3.updated(0, v24)
    var v59: Vector[Vector[Double]] = v0
    var v39: Vector[Vector[Double]] = v64
    var v136: Vector[Vector[Double]] = v64
    var v47: Double = v4
    v10 = v10.updated(1, v5)
    val v88: s0 = s0(v39, v6)
    var v61: s0 = v88
    val v105: Vector[Vector[Double]] = v61.p0
    v61 = v61.copy(p0 = v136)
    v136 = v136.updated(0, v23)
    val v110: Vector[Vector[Double]] = v61.p0
    v24 = v24.updated(0, v47)
    val v96: s0 = s0(v110, v10)
    val v98: Vector[Double] = v59(1)
    v136 = v136.updated(1, v29)
    v61 = v61.copy(p0 = v105)
    v61 = v61.copy(p0 = v136)
    v39 = v39.updated(2, v5)
    val v58: Vector[Vector[Double]] = v88.p0
    var v86: Vector[Vector[Double]] = v136
    v61 = v61.copy(p0 = v39)
    val v171: Vector[Vector[Vector[Double]]] = Vector(v58)
    v61 = v61.copy(p0 = v39)
    v39 = v136
    val v135: Vector[Double] = v59(1)
    val v196: Vector[Vector[Double]] = v171(0)
    v61 = v61.copy(p0 = v86)
    v59 = v59.updated(0, v98)
    v61 = v61.copy(p0 = v196)
    val v152: Vector[Vector[Double]] = v96.p1
    v39 = v39.updated(1, v135)
    v152
  }
  def f10(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Vector[Double]] = v0.p0
    val v9: s0 = s0(v7, v3)
    v9
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v5: Vector[Vector[s0]] = v0
    val v7: Vector[s0] = v5(2)
    val v4: s0 = v7(0)
    val v3: Vector[Vector[Double]] = v4.p1
    val v11: s0 = f10(v4)
    val v10: Vector[s0] = v0(0)
    val v12: Vector[Vector[Double]] = f11(v3)
    val v24: Vector[Vector[Double]] = v11.p0
    val v19: Vector[Vector[Double]] = f11(v12)
    val v21: Vector[Double] = v24(0)
    var v31: Vector[Vector[Double]] = v12
    v5 = v5.updated(1, v10)
    val v14: Vector[Vector[Double]] = f11(v31)
    val v50: Vector[Double] = v19(1)
    v31 = v31.updated(1, v50)
    val v27: Vector[Double] = v14(0)
    v31 = v31.updated(0, v27)
    v31 = v31.updated(0, v21)
    v31 = v31.updated(1, v50)
    val v175: Double = v27(0)
    v175
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}