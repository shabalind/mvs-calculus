import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  def f66(v0: Double): Double = {
    var v5: Double = v0
    var v6: Double = v0
    var v7: Double = v6
    var v3: Double = v0
    var v9: Double = v0
    var v13: Double = v3
    var v8: Double = v9
    val v15: Double = v7 * v6
    var v4: Double = v15
    v5 = v4
    val v50: Vector[Double] = Vector(v5)
    var v53: Double = v0
    var v23: Double = v13
    v13 = v8
    val v34: Double = v50(0)
    val v28: Vector[Double] = Vector(v34, v7, v34, v23)
    v53 = v5
    var v64: Vector[Double] = v28
    v6 = v53
    val v74: Double = v64(1)
    val v86: Double = v28(1)
    v64 = v64.updated(3, v0)
    val v51: Vector[Double] = Vector(v86, v74)
    val v26: Double = v51(0)
    var v56: Vector[Double] = v51
    var v90: Vector[Double] = v56
    var v92: Vector[Double] = v90
    v92 = v92.updated(0, v3)
    var v93: Vector[Double] = v92
    v92 = v92.updated(1, v7)
    v93 = v51
    var v147: Double = v26
    v93 = v93.updated(0, v147)
    val v229: Double = v93(1)
    v229
  }
  def f11(v0: Double): Double = {
    var v5: Double = v0
    var v2: Double = v0
    var v6: Double = v2
    var v4: Double = v5
    val v8: Double = f66(v0)
    val v1: Double = f66(v8)
    var v7: Double = v6
    val v3: Double = f66(v0)
    val v10: Double = f66(v3)
    var v18: Double = v7
    val v12: Double = f66(v6)
    var v22: Double = v12
    val v14: Vector[Double] = Vector(v22, v0, v7, v7, v12, v22)
    var v17: Vector[Double] = v14
    var v28: Double = v18
    val v29: Double = v17(2)
    val v42: Double = f66(v28)
    val v25: Double = f66(v2)
    v5 = v10
    var v30: Vector[Double] = v17
    var v21: Double = v8
    val v36: Double = v17(5)
    val v39: Double = v17(2)
    v30 = v30.updated(2, v29)
    v17 = v17.updated(5, v42)
    var v49: Double = v28
    val v117: Double = v30(0)
    val v101: Double = f66(v21)
    val v40: Double = f66(v25)
    val v54: Double = f66(v101)
    val v71: Vector[Double] = Vector(v4, v3, v1, v54, v39, v36, v7)
    var v64: Vector[Double] = v71
    val v152: Double = f66(v54)
    v64 = v64.updated(6, v117)
    v17 = v17.updated(2, v22)
    val v111: Double = v64(2)
    v30 = v30.updated(2, v152)
    val v157: Double = v40 / v111
    v5 = v49
    v157
  }
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: Double): Double = {
    val v3: s0 = v0.p0
    val v6: Vector[Vector[Double]] = v3.p0
    val v11: Double = f11(v2)
    val v37: Double = f11(v2)
    val v18: Vector[Double] = v6(0)
    var v33: Vector[Double] = v18
    val v9: Double = f66(v37)
    v33 = v33.updated(0, v11)
    val v26: Double = f11(v9)
    val v54: Double = f11(v26)
    val v49: Double = f66(v37)
    val v32: Double = v9 * v54
    val v122: Double = f66(v32)
    val v86: Double = v33(0)
    val v127: Double = f66(v49)
    val v149: Double = v86 * v122
    v33 = v33.updated(0, v127)
    v149
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s2(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s2(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))
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