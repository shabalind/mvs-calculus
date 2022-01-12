import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f29(v0: Vector[Double]): Vector[Double] = {
    var v3: Vector[Double] = v0
    val v1: Double = v3(2)
    val v7: Double = v0(0)
    var v4: Vector[Double] = v0
    var v6: Vector[Double] = v3
    var v5: Double = v7
    val v15: Double = v4(0)
    val v14: Double = v6(2)
    var v9: Vector[Double] = v3
    val v12: Double = v6(2)
    v9 = v9.updated(0, v5)
    var v11: Vector[Double] = v0
    val v10: Vector[Double] = Vector(v1, v15, v14, v14, v15, v15, v1)
    v9 = v9.updated(1, v12)
    v11 = v11.updated(1, v14)
    var v13: Vector[Double] = v10
    v9 = v3
    val v23: Double = v13(1)
    var v19: Vector[Double] = v9
    val v22: Double = v9(0)
    val v60: Double = v0(2)
    val v62: Double = v22 + v1
    v19 = v19.updated(0, v22)
    var v86: Vector[Double] = v19
    v86 = v11
    v3 = v3.updated(0, v60)
    v19 = v19.updated(0, v23)
    v5 = v15
    v6 = v6.updated(2, v62)
    v86
  }
  def f22(v0: Vector[Double]): Vector[Double] = {
    val v6: Double = v0(2)
    var v2: Vector[Double] = v0
    v2 = v2.updated(2, v6)
    val v4: Double = v2(0)
    val v5: Double = v0(1)
    val v1: Vector[Double] = f29(v2)
    v2 = v2.updated(0, v5)
    val v9: Vector[Double] = f29(v2)
    val v25: Double = v4 / v4
    val v19: Vector[Vector[Double]] = Vector(v0, v1, v9)
    val v24: Vector[Double] = v19(2)
    var v29: Vector[Double] = v24
    v29 = v29.updated(0, v25)
    v29
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Double], v2: Double): Double = {
    val v13: Double = v1(0)
    val v11: Vector[Double] = f22(v1)
    var v10: Vector[Double] = v1
    v10 = v11
    v10 = v10.updated(2, v13)
    val v18: Double = v11(0)
    v10 = v10.updated(1, v13)
    val v33: Double = v10(0)
    var v23: Double = v33
    var v26: Vector[Double] = v11
    v26 = v26.updated(0, v23)
    var v61: Vector[Double] = v26
    v10 = v10.updated(2, v18)
    val v32: Double = v61(2)
    v32
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
    val v1: Vector[Double] = Vector(3.0, 4.0, 5.0)
    val v2: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}