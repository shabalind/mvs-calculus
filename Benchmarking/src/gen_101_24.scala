import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  def f95(v0: Double): Double = {
    var v7: Double = v0
    var v9: Double = v0
    var v1: Double = v0
    var v6: Double = v0
    var v3: Double = v7
    var v2: Double = v1
    var v13: Double = v2
    val v15: Vector[Double] = Vector(v0, v13, v9, v7, v0, v6, v9)
    var v21: Vector[Double] = v15
    val v17: Double = v21(1)
    v21 = v21.updated(4, v2)
    var v12: Double = v3
    val v45: Double = v15(0)
    var v19: Double = v17
    v21 = v21.updated(2, v45)
    v21 = v21.updated(3, v1)
    var v24: Vector[Double] = v15
    val v35: Double = v24(3)
    val v50: Double = v24(5)
    v24 = v24.updated(3, v45)
    val v60: Vector[Double] = Vector(v12)
    v24 = v24.updated(6, v50)
    var v70: Vector[Double] = v60
    v24 = v24.updated(2, v19)
    v70 = v60
    v70 = v70.updated(0, v35)
    v70 = v70.updated(0, v3)
    val v53: Double = v70(0)
    v70 = v70.updated(0, v45)
    v53
  }
  def f46(v0: Double): Double = {
    var v7: Double = v0
    var v2: Double = v7
    var v1: Double = v0
    var v6: Double = v1
    val v3: Double = f95(v0)
    var v8: Double = v3
    var v5: Double = v0
    var v9: Double = v8
    val v12: Double = f95(v6)
    val v20: Double = f95(v1)
    var v10: Double = v2
    val v18: Vector[Double] = Vector(v1, v3, v8, v7, v5)
    val v15: Double = v18(4)
    val v28: Double = f95(v15)
    var v24: Double = v12
    var v22: Vector[Double] = v18
    val v16: Double = f95(v10)
    v22 = v22.updated(2, v24)
    val v17: Double = f95(v20)
    val v37: Double = v22(0)
    v22 = v22.updated(0, v7)
    val v19: Double = v18(0)
    v22 = v22.updated(4, v19)
    v2 = v0
    v22 = v22.updated(3, v16)
    val v33: Double = f95(v28)
    val v31: Double = v18(3)
    v22 = v22.updated(3, v37)
    v22 = v22.updated(4, v17)
    val v43: Double = v18(2)
    val v59: Double = v22(0)
    v7 = v17
    val v57: Double = v18(4)
    val v102: Double = v18(2)
    var v50: Vector[Double] = v18
    val v143: Double = f95(v59)
    val v83: Double = f95(v143)
    v22 = v22.updated(4, v7)
    v22 = v22.updated(3, v83)
    val v97: Double = f95(v102)
    v50 = v50.updated(1, v33)
    v10 = v143
    v22 = v22.updated(3, v43)
    v2 = v97
    v50 = v50.updated(0, v59)
    v50 = v50.updated(3, v31)
    val v150: Double = v50(0)
    val v158: Double = f95(v57)
    val v175: Double = v158 - v150
    v22 = v22.updated(2, v9)
    v175
  }
  def f29(v0: Double): Double = {
    val v5: Double = f46(v0)
    var v2: Double = v0
    val v7: Double = f46(v5)
    var v3: Double = v0
    var v10: Double = v7
    val v19: Double = f95(v2)
    val v26: Double = f46(v2)
    val v16: Double = f46(v19)
    val v28: Double = v3 * v19
    var v23: Double = v3
    v3 = v5
    var v32: Double = v26
    val v46: Vector[Double] = Vector(v28, v23, v16, v32, v10)
    val v80: Double = v46(3)
    val v117: Double = f95(v80)
    v117
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    var v10: Vector[Vector[s2]] = v0
    var v5: Double = v1
    val v8: Double = f29(v5)
    var v18: Vector[Vector[s2]] = v10
    v10 = v0
    val v3: Vector[s2] = v18(1)
    val v14: s2 = v3(0)
    val v12: s0 = v14.p0
    var v16: s0 = v12
    v18 = v18.updated(1, v3)
    val v36: Vector[Vector[Double]] = v16.p1
    v18 = v18.updated(1, v3)
    var v26: Vector[Vector[Double]] = v36
    val v20: Vector[Vector[Double]] = v12.p1
    val v22: Vector[Double] = v26(0)
    var v56: Vector[Double] = v22
    v18 = v18.updated(0, v3)
    val v54: Double = f29(v8)
    val v35: Vector[Vector[Double]] = v12.p1
    v56 = v56.updated(0, v54)
    v16 = v16.copy(p1 = v20)
    val v77: Vector[s2] = v0(1)
    v18 = v18.updated(0, v77)
    val v64: Double = v56(0)
    v16 = v16.copy(p1 = v35)
    v64
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s1(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))), Vector(s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}