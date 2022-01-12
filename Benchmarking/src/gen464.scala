import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f57(v0: Vector[Double]): Vector[Double] = {
    val v2: Double = v0(0)
    val v5: Double = v0(0)
    val v7: Double = v0(0)
    var v1: Vector[Double] = v0
    v1 = v1.updated(0, v5)
    var v8: Vector[Double] = v0
    val v9: Double = v8(0)
    var v6: Double = v9
    var v4: Double = v5
    v1 = v1.updated(0, v2)
    var v12: Double = v4
    v1 = v1.updated(0, v7)
    val v15: Double = v0(0)
    v8 = v8.updated(0, v15)
    val v19: Double = v1(0)
    var v11: Vector[Double] = v1
    v11 = v1
    v8 = v8.updated(0, v9)
    var v13: Vector[Double] = v1
    v13 = v13.updated(0, v19)
    var v16: Vector[Double] = v8
    v8 = v8.updated(0, v6)
    v1 = v1.updated(0, v15)
    val v22: Double = v11(0)
    val v42: Double = v11(0)
    val v32: Double = v22 / v22
    var v20: Vector[Double] = v13
    var v28: Vector[Double] = v16
    var v35: Vector[Double] = v20
    val v67: Double = v35(0)
    v11 = v11.updated(0, v5)
    var v33: Vector[Double] = v16
    val v72: Double = v20(0)
    v33 = v33.updated(0, v12)
    val v50: Double = v28(0)
    val v69: Double = v1(0)
    v13 = v13.updated(0, v69)
    var v48: Vector[Double] = v8
    v48 = v48.updated(0, v67)
    v1 = v1.updated(0, v50)
    val v38: Double = v28(0)
    val v80: Vector[Vector[Double]] = Vector(v35, v28, v33, v0, v11)
    var v76: Vector[Vector[Double]] = v80
    var v46: Vector[Vector[Double]] = v80
    v46 = v46.updated(2, v11)
    var v47: Vector[Vector[Double]] = v80
    v76 = v76.updated(1, v48)
    v48 = v48.updated(0, v72)
    val v56: Vector[Double] = v47(0)
    v8 = v8.updated(0, v50)
    val v85: Vector[Vector[Vector[Double]]] = Vector(v47, v76, v47)
    var v115: Vector[Vector[Vector[Double]]] = v85
    var v116: Vector[Vector[Vector[Double]]] = v115
    val v81: Vector[Vector[Double]] = v116(2)
    val v70: Double = v56(0)
    val v66: Vector[Double] = v46(1)
    val v68: Vector[Double] = v81(3)
    v46 = v46.updated(2, v33)
    v16 = v16.updated(0, v38)
    v48 = v48.updated(0, v7)
    v33 = v33.updated(0, v5)
    v1 = v1.updated(0, v32)
    v28 = v28.updated(0, v70)
    v11 = v11.updated(0, v42)
    v47 = v47.updated(3, v66)
    v68
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v6: Vector[Vector[s0]] = v0
    val v4: Vector[s0] = v6(0)
    var v7: Vector[s0] = v4
    val v11: Vector[s0] = v6(0)
    val v14: s0 = v7(0)
    v7 = v7.updated(0, v14)
    val v30: s0 = v4(0)
    val v40: Vector[s0] = v0(0)
    v6 = v6.updated(0, v4)
    v6 = v6.updated(0, v7)
    v6 = v6.updated(0, v40)
    val v29: Vector[Vector[Double]] = v30.p1
    v6 = v6.updated(0, v7)
    val v27: Vector[Double] = v29(0)
    val v50: Vector[Double] = f57(v27)
    v6 = v0
    v6 = v6.updated(0, v4)
    v6 = v6.updated(0, v11)
    val v104: Double = v50(0)
    v6 = v6.updated(0, v7)
    v104
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))))
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