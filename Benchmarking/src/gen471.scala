import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f1(v0: s0): s0 = {
    var v1: s0 = v0
    val v6: Vector[Vector[Double]] = v1.p0
    val v5: Vector[Double] = v6(1)
    var v3: Vector[Vector[Double]] = v6
    val v7: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v1.p1
    val v8: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Vector[Double]] = v0.p0
    val v11: Vector[Vector[Vector[Double]]] = Vector(v8, v4, v8, v8, v4, v8)
    val v24: Vector[Vector[Double]] = v0.p1
    val v14: Vector[Vector[Double]] = v11(5)
    val v23: Vector[Double] = v6(0)
    val v20: Vector[Vector[Double]] = v11(1)
    val v35: Vector[Vector[Double]] = v1.p0
    var v39: Vector[Vector[Double]] = v35
    var v37: Vector[Vector[Double]] = v39
    val v58: s0 = s0(v9, v14)
    v1 = v1.copy(p1 = v24)
    v1 = v1.copy(p1 = v4)
    val v34: Vector[Double] = v9(1)
    var v47: s0 = v0
    val v25: Vector[Vector[Double]] = v58.p1
    val v62: Vector[Vector[Double]] = v0.p0
    val v86: Vector[Vector[Double]] = v47.p0
    v3 = v3.updated(0, v23)
    var v19: Vector[Vector[Double]] = v86
    var v57: s0 = v1
    var v63: s0 = v1
    v1 = v1.copy(p0 = v19)
    v63 = v63.copy(p0 = v6)
    val v32: Vector[Vector[Double]] = v58.p1
    v57 = v57.copy(p0 = v7)
    v37 = v37.updated(0, v34)
    v57 = v57.copy(p0 = v3)
    v1 = v1.copy(p1 = v25)
    val v31: Vector[Vector[Double]] = v11(1)
    val v33: Vector[Vector[Double]] = v63.p1
    val v75: s0 = s0(v39, v14)
    v1 = v1.copy(p0 = v7)
    val v43: Vector[Vector[Double]] = v57.p0
    val v214: Vector[Vector[Double]] = v63.p1
    v63 = v63.copy(p0 = v19)
    v1 = v1.copy(p0 = v62)
    v47 = v47.copy(p1 = v31)
    var v68: s0 = v57
    val v95: Vector[Double] = v32(0)
    val v60: Vector[Vector[Double]] = v1.p1
    v57 = v57.copy(p0 = v6)
    v3 = v3.updated(1, v5)
    v68 = v68.copy(p1 = v214)
    v57 = v75
    v68 = v68.copy(p0 = v43)
    v3 = v3.updated(0, v95)
    v57 = v57.copy(p0 = v37)
    v1 = v1.copy(p1 = v33)
    v57 = v57.copy(p1 = v60)
    v47 = v47.copy(p1 = v20)
    v68 = v68.copy(p1 = v20)
    v68
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v5: s0 = f1(v0)
    val v11: Vector[Vector[Double]] = v5.p0
    val v13: Vector[Vector[Double]] = v5.p0
    var v20: Vector[Vector[Double]] = v11
    val v34: Vector[Double] = v20(0)
    v20 = v13
    val v59: Double = v34(0)
    v59
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}