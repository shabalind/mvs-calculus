import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f12(v0: s0, v1: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    var v9: s0 = v0
    var v3: Vector[Vector[Double]] = v6
    var v8: s0 = v0
    val v4: Vector[Double] = v3(0)
    val v12: Vector[Double] = v6(0)
    var v11: Vector[Vector[Double]] = v3
    val v13: Vector[Vector[Double]] = v0.p1
    val v19: Vector[Vector[Double]] = v0.p0
    val v29: Double = v4(0)
    var v18: s0 = v8
    var v23: Vector[Double] = v12
    val v35: Vector[Vector[Double]] = v9.p1
    v23 = v23.updated(0, v29)
    v18 = v18.copy(p1 = v11)
    v18 = v18.copy(p1 = v13)
    v18 = v18.copy(p1 = v35)
    val v26: Vector[Vector[Double]] = v1.p0
    val v20: Vector[Vector[Double]] = v0.p1
    v18 = v18.copy(p0 = v26)
    v8 = v8.copy(p1 = v20)
    v8 = v8.copy(p1 = v6)
    v8 = v8.copy(p1 = v13)
    v11 = v11.updated(0, v23)
    v23 = v23.updated(0, v29)
    val v71: Vector[Vector[Double]] = v18.p1
    var v78: Vector[Vector[Double]] = v20
    v9 = v9.copy(p1 = v78)
    v8 = v8.copy(p1 = v71)
    v9 = v9.copy(p0 = v19)
    v18
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v3: Double = v1
    val v8: s0 = f12(v0, v0)
    val v6: Vector[Vector[Double]] = v8.p0
    val v20: Vector[Double] = Vector(v3, v3, v1, v1)
    val v29: Double = v20(0)
    var v18: Vector[Double] = v20
    var v21: Vector[Double] = v18
    v18 = v21
    val v26: Vector[Double] = v6(1)
    val v52: Double = v26(0)
    v18 = v21
    v18 = v18.updated(3, v29)
    val v27: Double = v18(0)
    v18 = v18.updated(2, v52)
    var v90: Double = v1
    var v66: Vector[Double] = v21
    val v88: Double = v18(1)
    val v59: Double = v90 / v1
    v3 = v88
    v66 = v66.updated(1, v27)
    v66 = v66.updated(1, v59)
    v21 = v21.updated(2, v3)
    v21 = v21.updated(0, v52)
    v66 = v21
    val v332: Double = v66(2)
    v332
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}