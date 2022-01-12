import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f5(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    v0
  }
  def f4(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v2: Vector[Double] = v0(0)
    var v1: Vector[Double] = v2
    val v3: Vector[Double] = v0(0)
    var v28: Vector[Vector[Double]] = v0
    var v24: Vector[Vector[Double]] = v0
    var v21: Vector[Vector[Double]] = v24
    var v23: Vector[Vector[Double]] = v24
    v21 = v21.updated(0, v1)
    var v32: Vector[Double] = v3
    val v39: Vector[Vector[Vector[Double]]] = Vector(v23, v24, v21, v21, v28, v28)
    v21 = v21.updated(0, v32)
    val v57: Vector[Vector[Double]] = v39(3)
    v57
  }
  def f3(v0: Double, v1: Vector[Vector[Double]], v2: Vector[Vector[Double]]): Double = {
    val v4: Vector[Double] = v2(0)
    var v23: Vector[Double] = v4
    v23 = v23.updated(0, v0)
    val v16: Double = v4(0)
    var v20: Double = v16
    val v46: Double = v0 + v20
    var v42: Double = v0
    val v24: Double = v4(0)
    val v102: Vector[Double] = Vector(v20, v46, v42)
    val v83: Double = v102(2)
    val v107: Double = v23(0)
    val v179: Double = v83 * v24
    v20 = v107
    v179
  }
  def f2(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v10: Vector[Vector[Double]] = f5(v0)
    val v30: Vector[Vector[Double]] = f5(v10)
    val v25: Vector[Vector[Double]] = f5(v30)
    var v38: Vector[Vector[Double]] = v25
    val v43: Vector[Vector[Double]] = f5(v38)
    val v114: Vector[Vector[Vector[Double]]] = Vector(v43)
    var v45: Vector[Vector[Vector[Double]]] = v114
    val v62: Vector[Vector[Double]] = v45(0)
    val v145: Vector[Vector[Double]] = f5(v62)
    v145
  }
  def f1(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v8: Vector[Vector[Double]] = f4(v2)
    val v4: Vector[Double] = v1(2)
    val v7: Vector[Vector[Double]] = f5(v0)
    var v5: Vector[Vector[Double]] = v1
    val v10: Vector[Vector[Double]] = f2(v7)
    val v18: Vector[Double] = v10(1)
    val v13: Vector[Vector[Double]] = f5(v10)
    val v30: Vector[Double] = v8(0)
    val v16: Vector[Double] = v13(0)
    v5 = v5.updated(2, v4)
    var v21: Vector[Vector[Double]] = v1
    v21 = v21.updated(0, v16)
    val v53: Vector[Double] = v7(0)
    v21 = v21.updated(0, v4)
    v21 = v21.updated(1, v30)
    val v28: Vector[Vector[Vector[Double]]] = Vector(v21, v5)
    v21 = v21.updated(2, v53)
    val v37: Vector[Vector[Double]] = v28(0)
    val v79: Vector[Double] = v37(0)
    var v62: Vector[Vector[Double]] = v2
    v62 = v62.updated(0, v18)
    var v111: Vector[Vector[Double]] = v62
    val v57: Vector[Vector[Double]] = v28(0)
    val v76: Vector[Double] = v57(1)
    v62 = v62.updated(0, v79)
    v5 = v5.updated(1, v76)
    v111
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Vector[Vector[Double]], v2: Vector[Vector[Double]], v3: Double): Double = {
    val v7: Double = v3 / v3
    var v6: Vector[Vector[Double]] = v1
    val v9: Vector[Vector[Double]] = f1(v0, v2, v1)
    val v10: Double = f3(v7, v0, v1)
    val v15: Vector[Double] = v9(0)
    val v11: Vector[Vector[Double]] = f4(v6)
    v6 = v6.updated(0, v15)
    val v8: Double = f3(v10, v0, v6)
    val v12: Vector[Vector[Double]] = f5(v0)
    val v35: Double = v8 - v7
    val v38: Double = f3(v35, v12, v11)
    v38
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Vector[Vector[Double]] = Vector(Vector(2.0))
    val v2: Vector[Vector[Double]] = Vector(Vector(3.0), Vector(4.0), Vector(5.0))
    val v3: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}