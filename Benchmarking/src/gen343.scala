import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f50(v0: Double): Double = {
    var v1: Double = v0
    var v5: Double = v0
    var v6: Double = v1
    var v8: Double = v6
    var v11: Double = v8
    var v12: Double = v5
    v5 = v11
    val v17: Vector[Double] = Vector(v11, v12)
    var v20: Vector[Double] = v17
    val v22: Vector[Vector[Double]] = Vector(v20, v17, v20)
    val v51: Vector[Double] = v22(0)
    v20 = v20.updated(0, v12)
    val v26: Double = v51(1)
    v26
  }
  def f47(v0: Double): Double = {
    val v1: Double = f50(v0)
    val v2: Double = f50(v1)
    val v4: Double = f50(v1)
    var v9: Double = v1
    var v7: Double = v0
    val v8: Double = f50(v4)
    val v5: Double = f50(v4)
    val v6: Double = f50(v5)
    var v10: Double = v0
    val v15: Double = f50(v6)
    val v20: Double = v2 / v2
    val v19: Double = f50(v9)
    val v25: Double = f50(v8)
    val v23: Vector[Double] = Vector(v7, v20, v25)
    var v29: Vector[Double] = v23
    var v40: Vector[Double] = v29
    var v28: Vector[Double] = v40
    v29 = v29.updated(1, v2)
    val v46: Double = f50(v19)
    var v26: Vector[Double] = v28
    val v39: Double = v26(2)
    var v32: Double = v39
    val v41: Double = f50(v10)
    v29 = v28
    v40 = v40.updated(1, v46)
    v40 = v23
    v40 = v40.updated(0, v41)
    v28 = v28.updated(1, v15)
    v32
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Double] = v3(0)
    val v9: Double = v7(0)
    var v12: Vector[Double] = v7
    val v11: Vector[Vector[Double]] = v0.p0
    val v16: Double = v1 / v9
    val v19: Vector[Double] = v11(0)
    val v21: Double = v12(0)
    val v52: Double = v19(0)
    val v59: Double = f47(v9)
    val v53: Double = v12(0)
    var v142: Double = v16
    var v39: Double = v142
    val v31: Double = f50(v21)
    v12 = v12.updated(0, v31)
    var v180: Double = v53
    v12 = v12.updated(0, v39)
    val v97: Double = v12(0)
    var v297: Double = v180
    var v192: Double = v16
    val v102: Vector[Double] = Vector(v59, v52, v53, v142, v97, v297, v192)
    val v194: Double = v102(4)
    v194
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