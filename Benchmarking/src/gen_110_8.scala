import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f1(v0: Double): Double = {
    var v5: Double = v0
    var v3: Double = v5
    var v6: Double = v3
    val v9: Double = v6 * v0
    var v1: Double = v3
    var v16: Double = v6
    val v2: Double = v5 + v6
    var v8: Double = v9
    val v21: Vector[Double] = Vector(v9, v1, v2)
    val v11: Double = v21(2)
    var v17: Vector[Double] = v21
    var v12: Double = v11
    val v15: Double = v21(1)
    var v22: Double = v6
    v8 = v9
    v17 = v17.updated(0, v22)
    val v43: Double = v21(0)
    var v18: Vector[Double] = v21
    var v28: Vector[Double] = v18
    var v37: Double = v1
    var v42: Vector[Double] = v28
    val v32: Double = v42(1)
    val v35: Double = v18(1)
    var v56: Vector[Double] = v17
    v28 = v28.updated(2, v35)
    var v23: Vector[Double] = v21
    v42 = v42.updated(0, v15)
    v18 = v18.updated(0, v37)
    val v38: Vector[Vector[Double]] = Vector(v56, v17, v17, v42, v28, v42)
    val v34: Vector[Double] = v38(1)
    v28 = v28.updated(2, v1)
    var v48: Double = v8
    v42 = v42.updated(2, v2)
    val v40: Double = v34(1)
    v28 = v28.updated(0, v12)
    v28 = v28.updated(0, v16)
    val v67: Double = v23(0)
    v42 = v42.updated(0, v32)
    val v110: Vector[Double] = Vector(v35, v40, v15, v48, v67, v67, v48)
    v18 = v18.updated(1, v43)
    var v83: Vector[Double] = v110
    val v73: Double = v83(0)
    v42 = v42.updated(2, v40)
    v56 = v56.updated(1, v67)
    v73
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    var v3: Double = v1
    var v2: Vector[Vector[Double]] = v0
    val v9: Vector[Double] = v2(0)
    val v7: Double = v9(0)
    val v11: Vector[Double] = v0(2)
    var v20: Double = v3
    var v6: Double = v7
    v2 = v2.updated(0, v11)
    val v18: Double = v9(0)
    v2 = v2.updated(1, v9)
    var v28: Vector[Double] = v9
    val v29: Double = v28(0)
    val v16: Double = f1(v20)
    v28 = v28.updated(0, v3)
    v2 = v2.updated(1, v9)
    v28 = v28.updated(0, v6)
    v28 = v28.updated(0, v18)
    val v78: Double = v29 / v16
    v78
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0), Vector(2.0))
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