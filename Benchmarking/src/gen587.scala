import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f16(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v3: Vector[Double] = v0(1)
    var v2: Vector[Vector[Double]] = v0
    v2 = v2.updated(0, v3)
    val v8: Vector[Double] = v2(1)
    v2 = v2.updated(0, v8)
    var v15: Vector[Vector[Double]] = v2
    var v23: Vector[Vector[Double]] = v15
    val v29: Vector[Double] = v15(0)
    v2 = v15
    var v38: Vector[Vector[Double]] = v23
    v38 = v38.updated(1, v29)
    v38
  }
  def f14(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v5: Vector[Vector[Double]] = f16(v0)
    val v7: Vector[Vector[Double]] = f16(v0)
    var v9: Vector[Vector[Double]] = v7
    var v3: Vector[Vector[Double]] = v5
    val v11: Vector[Double] = v9(1)
    val v6: Vector[Vector[Double]] = f16(v3)
    val v8: Vector[Double] = v0(1)
    val v1: Vector[Vector[Double]] = Vector(v11, v11, v11, v8, v11)
    var v25: Vector[Vector[Double]] = v6
    var v17: Vector[Vector[Double]] = v1
    v17 = v17.updated(3, v8)
    var v14: Vector[Double] = v11
    var v38: Vector[Vector[Double]] = v25
    val v32: Vector[Double] = v17(2)
    val v69: Vector[Vector[Double]] = f16(v38)
    v17 = v17.updated(2, v14)
    v38 = v38.updated(1, v32)
    v69
  }
  @noinline
  def f0(v0: Double, v1: Vector[Vector[Double]]): Double = {
    val v7: Vector[Double] = v1(1)
    var v9: Double = v0
    var v5: Vector[Double] = v7
    var v8: Double = v9
    v5 = v5.updated(0, v0)
    val v11: Vector[Vector[Double]] = f14(v1)
    v8 = v9
    v5 = v5.updated(0, v0)
    val v24: Double = v5(0)
    val v17: Vector[Double] = v11(0)
    val v12: Double = v17(0)
    val v34: Vector[Double] = Vector(v12, v24, v8, v24, v9)
    val v80: Double = v34(4)
    var v42: Vector[Double] = v34
    var v86: Vector[Double] = v34
    var v52: Vector[Double] = v86
    val v121: Vector[Vector[Double]] = Vector(v52, v52, v52, v42)
    val v254: Double = v34(1)
    val v122: Vector[Double] = v121(3)
    v5 = v5.updated(0, v80)
    v86 = v86.updated(3, v254)
    val v139: Double = v122(2)
    v5 = v5.updated(0, v80)
    v139
  }
  def benchmark(): Unit = {
    val v0: Double = 0.0
    val v1: Vector[Vector[Double]] = Vector(Vector(1.0), Vector(2.0))
    val start = nanoTime()
    var result: Double = [[1.0], [2.0]]
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}