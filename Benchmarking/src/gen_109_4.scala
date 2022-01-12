import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f13(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v3: Vector[Vector[Double]] = v0.p0
    val v5: Vector[Double] = v3(0)
    val v9: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Vector[Double]] = v0.p1
    var v8: s0 = v0
    val v4: Double = v5(0)
    var v1: s0 = v8
    val v2: Vector[Double] = v3(1)
    val v11: Vector[Double] = v3(1)
    var v12: Vector[Double] = v2
    v12 = v12.updated(0, v4)
    v12 = v12.updated(0, v4)
    val v14: Double = v5(0)
    v8 = v1
    v12 = v2
    var v19: Vector[Vector[Double]] = v6
    val v30: Vector[Vector[Double]] = v0.p1
    var v20: s0 = v8
    v20 = v20.copy(p1 = v19)
    v8 = v8.copy(p1 = v30)
    v19 = v19.updated(1, v11)
    var v28: Vector[Vector[Double]] = v3
    v1 = v1.copy(p0 = v19)
    var v50: Vector[Double] = v12
    v1 = v8
    val v29: Vector[Vector[Double]] = v20.p1
    var v23: s0 = v8
    v19 = v29
    v23 = v23.copy(p1 = v7)
    v8 = v8.copy(p0 = v19)
    val v48: Vector[Double] = v19(1)
    var v36: Vector[Double] = v50
    val v38: Vector[Vector[Double]] = v20.p1
    var v21: Vector[Vector[Double]] = v7
    var v26: s0 = v0
    v1 = v1.copy(p0 = v30)
    val v58: Vector[Vector[Double]] = v23.p0
    v12 = v12.updated(0, v14)
    v20 = v20.copy(p0 = v21)
    val v35: Double = v36(0)
    val v66: Vector[Vector[Double]] = v26.p0
    v23 = v23.copy(p1 = v19)
    var v45: Double = v35
    var v59: Double = v45
    v26 = v26.copy(p0 = v28)
    v12 = v12.updated(0, v59)
    var v54: Vector[Double] = v48
    v20 = v20.copy(p0 = v66)
    var v56: s0 = v23
    v26 = v26.copy(p1 = v9)
    v28 = v28.updated(1, v12)
    v19 = v19.updated(1, v54)
    v20 = v20.copy(p1 = v58)
    v23 = v23.copy(p0 = v19)
    v1 = v1.copy(p0 = v38)
    v20 = v20.copy(p0 = v38)
    v26 = v26.copy(p1 = v9)
    v56
  }
  @noinline
  def f0(v0: s0, v1: Vector[Vector[Double]], v2: Double): Double = {
    var v5: s0 = v0
    val v6: Vector[Vector[Double]] = v0.p0
    val v29: s0 = f13(v5)
    val v25: Vector[Vector[Double]] = v29.p1
    var v15: s0 = v29
    val v24: Vector[Vector[Double]] = v15.p1
    val v21: Double = v2 * v2
    v15 = v15.copy(p1 = v6)
    val v76: Vector[Double] = v24(0)
    v15 = v15.copy(p0 = v25)
    val v41: Double = v76(0)
    v15 = v15.copy(p0 = v6)
    val v38: Double = v21 - v41
    v38
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Vector[Vector[Double]] = Vector(Vector(4.0))
    val v2: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}