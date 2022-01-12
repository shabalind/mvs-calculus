import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f32(v0: Vector[Double]): Vector[Double] = {
    val v5: Double = v0(0)
    var v1: Double = v5
    var v2: Double = v1
    var v4: Vector[Double] = v0
    var v6: Vector[Double] = v0
    var v7: Double = v1
    val v8: Double = v2 + v7
    v6 = v6.updated(0, v5)
    var v11: Vector[Double] = v0
    var v12: Vector[Double] = v6
    v12 = v12.updated(0, v7)
    v4 = v4.updated(0, v8)
    var v14: Double = v8
    var v13: Vector[Double] = v4
    var v18: Vector[Double] = v12
    val v19: Double = v11(0)
    val v49: Double = v4(0)
    val v16: Double = v6(0)
    val v38: Double = v13(0)
    val v25: Double = v18(0)
    var v53: Double = v14
    val v20: Vector[Vector[Double]] = Vector(v12)
    val v29: Vector[Double] = v20(0)
    val v31: Vector[Double] = v20(0)
    var v30: Vector[Vector[Double]] = v20
    var v60: Vector[Double] = v18
    var v44: Vector[Vector[Double]] = v30
    var v34: Vector[Vector[Double]] = v44
    v18 = v18.updated(0, v38)
    var v58: Vector[Vector[Double]] = v30
    v2 = v19
    var v28: Vector[Vector[Double]] = v58
    v60 = v60.updated(0, v49)
    v30 = v30.updated(0, v4)
    val v50: Vector[Double] = v28(0)
    val v43: Vector[Double] = v44(0)
    v11 = v11.updated(0, v25)
    val v46: Vector[Double] = v34(0)
    var v68: Vector[Vector[Double]] = v34
    var v77: Vector[Double] = v50
    v34 = v34.updated(0, v77)
    val v103: Vector[Double] = v68(0)
    v34 = v34.updated(0, v46)
    v6 = v6.updated(0, v2)
    v60 = v60.updated(0, v49)
    val v112: Vector[Double] = v58(0)
    val v136: Double = v103(0)
    val v41: Double = v112(0)
    v58 = v58.updated(0, v46)
    val v96: Double = v60(0)
    v18 = v18.updated(0, v96)
    v12 = v12.updated(0, v41)
    val v100: Vector[Vector[Double]] = Vector(v46, v12, v31, v6, v29, v11)
    var v80: Vector[Vector[Double]] = v100
    v30 = v30.updated(0, v29)
    v80 = v80.updated(1, v43)
    v80 = v80.updated(4, v13)
    val v94: Vector[Double] = v80(0)
    v12 = v12.updated(0, v16)
    v18 = v18.updated(0, v5)
    v53 = v136
    var v79: Vector[Double] = v46
    v4 = v4.updated(0, v53)
    v79 = v94
    v79
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    val v5: s0 = v0(1)
    val v7: Vector[Vector[Double]] = v5.p0
    val v2: Vector[Double] = v7(0)
    var v8: Vector[Double] = v2
    val v21: Double = v2(0)
    var v11: Double = v21
    var v10: Vector[Double] = v8
    var v13: Double = v11
    v10 = v10.updated(0, v11)
    val v17: Double = v3(1)
    val v28: Vector[Double] = f32(v10)
    v8 = v8.updated(0, v17)
    v8 = v8.updated(0, v11)
    var v58: Double = v1
    val v40: Double = v13 + v58
    v8 = v8.updated(0, v40)
    val v62: Vector[Double] = f32(v28)
    val v55: Double = v62(0)
    v8 = v28
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}