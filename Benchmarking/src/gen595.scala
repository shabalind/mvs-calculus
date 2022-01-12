import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  def f66(v0: Double): Double = {
    val v3: Vector[Double] = Vector(v0, v0, v0, v0, v0, v0)
    val v2: Vector[Double] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v4: Vector[Double] = v3
    var v1: Double = v0
    val v7: Double = v2(6)
    val v11: Double = v7 * v7
    val v13: Double = v2(6)
    val v6: Vector[Double] = Vector(v11, v13, v1, v11)
    var v9: Vector[Double] = v6
    var v19: Vector[Double] = v2
    var v22: Vector[Double] = v4
    var v20: Vector[Double] = v19
    var v29: Vector[Double] = v6
    val v24: Double = v20(4)
    var v21: Double = v1
    val v28: Double = v0 - v24
    val v56: Double = v29(2)
    val v14: Double = v19(2)
    var v34: Vector[Double] = v29
    val v67: Double = v20(6)
    var v47: Double = v7
    var v37: Vector[Double] = v6
    val v61: Double = v3(2)
    v19 = v19.updated(1, v47)
    val v31: Double = v20(3)
    val v43: Vector[Vector[Double]] = Vector(v3, v22)
    val v69: Double = v20(1)
    v4 = v4.updated(1, v61)
    var v40: Vector[Double] = v9
    v1 = v67
    var v46: Vector[Double] = v29
    v34 = v34.updated(2, v28)
    v9 = v9.updated(0, v1)
    var v53: Vector[Double] = v19
    v20 = v20.updated(0, v14)
    var v42: Vector[Double] = v2
    v40 = v46
    val v106: Double = v2(2)
    var v64: Vector[Double] = v42
    var v118: Vector[Double] = v64
    var v60: Vector[Vector[Double]] = v43
    v64 = v64.updated(4, v21)
    v60 = v60.updated(0, v22)
    var v63: Vector[Double] = v118
    v63 = v63.updated(3, v106)
    v42 = v42.updated(5, v7)
    val v128: Vector[Double] = v60(1)
    v22 = v22.updated(4, v106)
    v4 = v4.updated(5, v56)
    v34 = v37
    v4 = v4.updated(5, v69)
    v34 = v34.updated(3, v13)
    val v77: Double = v128(0)
    var v171: Vector[Double] = v34
    val v135: Double = v63(2)
    val v121: Double = v19(1)
    v20 = v118
    v19 = v19.updated(1, v121)
    v53 = v53.updated(5, v135)
    v171 = v171.updated(1, v77)
    val v80: Double = v53(6)
    v34 = v40
    v37 = v37.updated(1, v31)
    val v152: Double = v171(0)
    v42 = v42.updated(6, v80)
    v152
  }
  def f7(v0: Vector[Double]): Vector[Double] = {
    val v4: Double = v0(0)
    var v6: Vector[Double] = v0
    v6 = v0
    v6 = v6.updated(0, v4)
    v6 = v6.updated(0, v4)
    val v2: Double = f66(v4)
    v6 = v6.updated(0, v2)
    var v1: Vector[Double] = v0
    val v7: Double = f66(v4)
    val v3: Double = v6(0)
    v1 = v1.updated(0, v3)
    val v11: Double = f66(v7)
    v1 = v1.updated(0, v11)
    val v9: Double = v0(0)
    v6 = v1
    v6 = v6.updated(0, v2)
    val v13: Double = v1(0)
    v1 = v0
    v1 = v1.updated(0, v11)
    v6 = v6.updated(0, v11)
    val v15: Double = f66(v13)
    var v18: Double = v9
    v1 = v1.updated(0, v18)
    v1 = v1.updated(0, v13)
    v6 = v6.updated(0, v9)
    var v60: Vector[Double] = v1
    v6 = v6.updated(0, v15)
    v60
  }
  @noinline
  def f0(v0: Vector[Vector[Double]], v1: Double): Double = {
    val v2: Vector[Double] = v0(1)
    val v3: Vector[Double] = f7(v2)
    var v11: Vector[Double] = v3
    val v12: Double = v11(0)
    v12
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[Double]] = Vector(Vector(0.0), Vector(1.0))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}