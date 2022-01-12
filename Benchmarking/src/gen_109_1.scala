import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f4(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = v6(1)
    var v8: s0 = v0
    val v1: Vector[Vector[Double]] = v8.p1
    val v4: Vector[Vector[Double]] = v0.p1
    var v5: Vector[Vector[Double]] = v6
    v8 = v8.copy(p1 = v5)
    val v3: Vector[Vector[Vector[Double]]] = Vector(v1, v1)
    v8 = v8.copy(p1 = v4)
    v5 = v5.updated(1, v2)
    val v7: Vector[Vector[Vector[Double]]] = Vector(v1, v6)
    var v13: Vector[Double] = v2
    val v11: Vector[Vector[Double]] = v8.p0
    val v16: Vector[Vector[Double]] = v8.p0
    val v9: Vector[Vector[Double]] = v0.p1
    v5 = v5.updated(0, v13)
    val v10: Vector[Vector[Double]] = v0.p1
    val v12: Vector[Vector[Double]] = v0.p1
    val v23: Double = v13(0)
    v8 = v8.copy(p0 = v11)
    var v24: Double = v23
    var v22: Vector[Double] = v2
    val v21: Vector[Vector[Double]] = v8.p0
    val v20: Vector[Vector[Double]] = v3(1)
    val v25: Vector[Double] = v16(0)
    val v14: s0 = s0(v11, v9)
    v5 = v5.updated(1, v25)
    var v32: Vector[Vector[Double]] = v16
    val v49: Vector[Double] = v20(0)
    v32 = v32.updated(0, v22)
    var v39: Vector[Double] = v49
    v5 = v5.updated(1, v13)
    var v35: Vector[Vector[Vector[Double]]] = v3
    val v38: Vector[Vector[Double]] = v8.p1
    val v41: Double = v24 * v24
    val v45: Vector[Vector[Double]] = v14.p1
    val v30: s0 = s0(v16, v5)
    val v58: Vector[Double] = v10(1)
    val v57: s0 = s0(v21, v1)
    v8 = v8.copy(p0 = v32)
    v8 = v8.copy(p1 = v4)
    v8 = v8.copy(p1 = v12)
    val v43: Vector[s0] = Vector(v30, v14, v57, v57, v30, v14)
    var v72: Vector[s0] = v43
    v8 = v8.copy(p1 = v4)
    var v33: Vector[Vector[Double]] = v1
    v33 = v33.updated(0, v25)
    var v85: Vector[Vector[Vector[Double]]] = v3
    v8 = v8.copy(p1 = v38)
    val v65: s0 = v72(1)
    val v67: Vector[Vector[Vector[Vector[Double]]]] = Vector(v35, v7)
    v35 = v35.updated(1, v45)
    val v122: Vector[Vector[Double]] = v65.p1
    val v83: Vector[Vector[Vector[Double]]] = v67(1)
    var v75: Vector[Vector[Vector[Double]]] = v85
    v35 = v75
    var v81: s0 = v65
    v39 = v39.updated(0, v24)
    var v103: Vector[Vector[Vector[Double]]] = v83
    val v131: Double = v13(0)
    v33 = v33.updated(1, v39)
    v22 = v22.updated(0, v41)
    v33 = v33.updated(1, v58)
    v22 = v22.updated(0, v131)
    val v272: Vector[Vector[Double]] = v75(1)
    v8 = v8.copy(p1 = v272)
    v81 = v81.copy(p0 = v16)
    v75 = v103
    v81 = v81.copy(p1 = v33)
    v103 = v103.updated(0, v122)
    v81
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v7: Vector[s0] = v0.p1
    val v6: s0 = v7(1)
    val v5: s0 = v7(2)
    val v12: s0 = v7(0)
    var v14: s0 = v5
    val v9: Vector[Vector[Double]] = v6.p1
    v14 = v14.copy(p1 = v9)
    val v16: s0 = f4(v14)
    val v21: Vector[Vector[Double]] = v16.p1
    var v20: s0 = v5
    val v19: Vector[Double] = v21(1)
    v20 = v20.copy(p1 = v21)
    val v38: Vector[Vector[Double]] = v20.p0
    val v41: Vector[Vector[Double]] = v12.p0
    var v55: Vector[Double] = v19
    var v79: Vector[Double] = v55
    v14 = v14.copy(p0 = v41)
    v14 = v14.copy(p0 = v38)
    v20 = v20.copy(p1 = v9)
    val v116: Double = v79(0)
    v20 = v20.copy(p0 = v41)
    v116
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}