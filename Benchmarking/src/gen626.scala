import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f44(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v4: Vector[Vector[Double]] = v2
    val v17: s0 = s0(v4, v4)
    v17
  }
  def f41(v0: Double, v1: s0): Double = {
    var v3: s0 = v1
    val v5: Vector[Vector[Double]] = v3.p1
    var v2: Vector[Vector[Double]] = v5
    val v4: s0 = f44(v3)
    v3 = v3.copy(p0 = v5)
    val v9: Vector[Double] = v5(1)
    val v6: Vector[Vector[Vector[Double]]] = Vector(v2)
    val v7: s0 = f44(v4)
    val v8: Double = v9(0)
    val v16: Vector[Vector[Double]] = v6(0)
    val v17: Vector[Double] = v16(0)
    val v19: s0 = f44(v1)
    v3 = v3.copy(p0 = v5)
    v2 = v2.updated(2, v17)
    v2 = v2.updated(1, v9)
    val v26: Vector[Vector[Double]] = v7.p0
    v3 = v3.copy(p1 = v16)
    val v36: Double = v17(0)
    val v57: Vector[Vector[Double]] = v19.p1
    var v31: Double = v36
    val v53: Double = v31 / v8
    v3 = v3.copy(p0 = v57)
    v3 = v3.copy(p1 = v26)
    v53
  }
  def f15(v0: s0): s0 = {
    val v9: s0 = f44(v0)
    var v28: s0 = v9
    v28
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: s0 = f44(v0)
    var v8: s0 = v3
    val v2: s0 = f15(v3)
    val v4: Vector[s0] = Vector(v0, v2, v8, v0, v8)
    val v5: s0 = f44(v2)
    val v9: Vector[Vector[Double]] = v5.p0
    var v7: Vector[s0] = v4
    v8 = v8.copy(p1 = v9)
    val v6: Vector[Vector[Double]] = v8.p1
    v8 = v8.copy(p1 = v6)
    var v17: Vector[Vector[Double]] = v6
    val v10: Vector[Double] = v17(0)
    val v12: Vector[Double] = v9(2)
    var v31: Vector[Vector[Double]] = v9
    val v21: Vector[Double] = Vector(v1, v1, v1, v1)
    val v39: Double = v12(0)
    var v19: Vector[Double] = v21
    v8 = v8.copy(p1 = v6)
    val v15: Vector[Vector[Double]] = v2.p1
    val v28: Vector[Double] = v31(1)
    val v50: Vector[Vector[Double]] = v5.p1
    val v33: s0 = v7(2)
    val v59: Double = f41(v39, v5)
    val v20: Double = f41(v59, v33)
    v8 = v8.copy(p1 = v15)
    val v26: Vector[Vector[Double]] = v33.p1
    val v80: Double = v39 * v39
    val v23: Double = v12(0)
    var v55: Vector[Double] = v12
    val v51: Double = v80 + v23
    v7 = v7.updated(2, v5)
    v17 = v17.updated(2, v10)
    var v41: Vector[Double] = v21
    val v49: Double = v28(0)
    val v43: Double = v1 * v1
    v8 = v8.copy(p1 = v50)
    v19 = v19.updated(3, v23)
    var v119: Vector[Double] = v12
    val v64: s0 = v7(4)
    v41 = v41.updated(0, v20)
    v8 = v8.copy(p1 = v26)
    v41 = v41.updated(1, v51)
    v55 = v55.updated(0, v59)
    v41 = v19
    v8 = v8.copy(p1 = v17)
    val v92: s0 = v7(2)
    val v73: Double = v43 + v23
    v7 = v7.updated(1, v64)
    v17 = v17.updated(0, v119)
    val v156: Vector[Vector[Double]] = Vector(v41, v21, v19, v41, v19, v41)
    val v105: Vector[Double] = v156(4)
    val v116: Double = v105(0)
    val v140: Vector[Vector[Double]] = v92.p0
    v55 = v55.updated(0, v49)
    v19 = v19.updated(2, v73)
    v17 = v17.updated(0, v55)
    v8 = v8.copy(p0 = v140)
    v116
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}