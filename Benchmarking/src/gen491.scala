import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f11(v0: s0, v1: s0): s0 = {
    val v3: Vector[s0] = Vector(v1, v0, v1, v0, v1, v1, v0)
    var v2: s0 = v0
    var v5: Vector[s0] = v3
    v5 = v5.updated(5, v1)
    val v6: Vector[Vector[Double]] = v0.p0
    val v15: Vector[Vector[Vector[Double]]] = Vector(v6, v6, v6, v6)
    val v11: Vector[Vector[Double]] = v15(0)
    val v7: s0 = v5(1)
    var v10: Vector[Vector[Double]] = v6
    val v12: Vector[Vector[Double]] = v1.p0
    val v8: Vector[Vector[Double]] = v7.p0
    v2 = v2.copy(p0 = v12)
    var v9: Vector[Vector[Double]] = v8
    var v25: Vector[Vector[Double]] = v9
    val v14: Vector[Vector[Double]] = v7.p1
    val v20: Vector[Double] = v14(0)
    v2 = v2.copy(p1 = v14)
    val v19: s0 = v5(3)
    v5 = v5.updated(6, v7)
    val v47: Vector[Vector[Double]] = v15(1)
    val v17: Vector[Double] = v25(2)
    val v37: Double = v17(0)
    val v22: s0 = s0(v10, v14)
    v25 = v11
    v2 = v2.copy(p0 = v47)
    val v35: Vector[Double] = v14(0)
    var v64: Vector[Double] = v17
    v64 = v64.updated(0, v37)
    val v34: Vector[Vector[Double]] = v22.p0
    v2 = v0
    val v41: Vector[Vector[Double]] = v15(3)
    val v44: Vector[Vector[Double]] = v19.p1
    v25 = v25.updated(2, v35)
    v2 = v2.copy(p0 = v10)
    v5 = v5.updated(5, v2)
    v2 = v2.copy(p1 = v14)
    val v69: Vector[Vector[Double]] = v7.p0
    val v61: Vector[Double] = v69(0)
    val v117: Vector[Vector[Double]] = v2.p1
    v10 = v10.updated(0, v61)
    v5 = v5.updated(5, v2)
    v2 = v2.copy(p1 = v117)
    v10 = v10.updated(0, v64)
    v2 = v2.copy(p0 = v41)
    val v145: Vector[Vector[Double]] = v7.p0
    v2 = v2.copy(p0 = v145)
    v10 = v8
    val v167: s0 = s0(v34, v44)
    v25 = v25.updated(0, v20)
    v167
  }
  @noinline
  def f0(v0: s0, v1: s0, v2: s0, v3: Double): Double = {
    val v9: s0 = f11(v1, v2)
    val v4: Vector[Vector[Double]] = v9.p1
    var v5: Double = v3
    val v11: Vector[Double] = v4(0)
    var v27: Vector[Double] = v11
    val v15: Double = v27(0)
    v27 = v27.updated(0, v5)
    v15
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: s0 = s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))
    val v2: s0 = s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))
    val v3: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}