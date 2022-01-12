import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  @noinline
  def f0(v0: Vector[Double], v1: Double): Double = {
    var v3: Double = v1
    var v7: Double = v3
    var v2: Double = v1
    var v4: Vector[Double] = v0
    var v9: Vector[Double] = v0
    v9 = v9.updated(0, v2)
    val v6: Double = v9(0)
    v4 = v4.updated(0, v6)
    var v5: Double = v7
    v9 = v9.updated(0, v3)
    var v11: Vector[Double] = v9
    var v8: Double = v5
    var v14: Vector[Double] = v0
    v4 = v4.updated(0, v1)
    var v20: Vector[Double] = v4
    val v10: Double = v20(0)
    v14 = v9
    v7 = v5
    val v13: Double = v4(0)
    val v34: Double = v0(0)
    var v15: Double = v3
    val v17: Double = v11(0)
    v9 = v9.updated(0, v2)
    var v18: Vector[Double] = v4
    val v12: Double = v14(0)
    v14 = v14.updated(0, v1)
    val v31: Double = v13 + v17
    val v23: Double = v0(0)
    v11 = v11.updated(0, v8)
    var v24: Double = v31
    v11 = v11.updated(0, v3)
    v18 = v18.updated(0, v34)
    v14 = v14.updated(0, v23)
    val v32: Double = v18(0)
    v18 = v18.updated(0, v8)
    v4 = v4.updated(0, v15)
    v9 = v9.updated(0, v34)
    var v124: Double = v8
    v14 = v14.updated(0, v24)
    val v58: Vector[Double] = Vector(v31, v124, v10)
    v124 = v12
    val v56: Double = v11(0)
    var v44: Vector[Double] = v58
    v8 = v32
    v44 = v44.updated(0, v5)
    var v59: Vector[Double] = v44
    v15 = v56
    val v106: Double = v59(2)
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0)
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}