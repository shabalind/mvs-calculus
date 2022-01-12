import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  def f55(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p2
    val v6: Vector[Vector[Double]] = v0.p0
    val v15: Vector[Vector[Double]] = v0.p4
    var v8: s0 = v0
    v8 = v8.copy(p2 = v15)
    val v5: Vector[Vector[Double]] = v8.p0
    v8 = v8.copy(p2 = v5)
    v8 = v8.copy(p4 = v4)
    val v12: Vector[Vector[Double]] = v8.p3
    val v21: Vector[Vector[Double]] = v0.p3
    v8 = v8.copy(p1 = v12)
    v8 = v8.copy(p2 = v6)
    v8 = v8.copy(p2 = v15)
    val v24: Vector[Vector[Double]] = v8.p3
    var v25: Vector[Vector[Double]] = v21
    val v29: Vector[Vector[Double]] = v8.p4
    v8 = v8.copy(p1 = v25)
    val v23: Vector[Vector[Double]] = v8.p2
    val v38: Vector[Vector[Double]] = v0.p4
    val v56: s0 = s0(v4, v12, v23, v24, v29)
    v8 = v8.copy(p2 = v38)
    val v73: Vector[Double] = v5(2)
    v25 = v25.updated(0, v73)
    v56
  }
  def f52(v0: s0, v1: Vector[Vector[s0]]): s0 = {
    val v2: Vector[Vector[Double]] = v0.p2
    val v3: s0 = f55(v0)
    val v7: s0 = f55(v3)
    var v8: s0 = v3
    val v16: Vector[Vector[Double]] = v7.p2
    val v9: s0 = f55(v7)
    v8 = v8.copy(p0 = v2)
    var v11: Vector[Vector[Double]] = v2
    v8 = v8.copy(p0 = v16)
    val v30: s0 = f55(v8)
    val v15: Vector[Vector[Double]] = v30.p3
    val v18: s0 = f55(v9)
    var v12: Vector[Vector[Double]] = v15
    val v17: Vector[Vector[Double]] = v9.p2
    v8 = v8.copy(p4 = v16)
    val v29: Vector[Double] = v16(1)
    val v19: Vector[Vector[Double]] = v3.p0
    v8 = v8.copy(p1 = v15)
    var v20: Vector[Vector[Double]] = v16
    val v36: s0 = f55(v18)
    val v22: Vector[Vector[Double]] = v36.p1
    val v67: s0 = f55(v18)
    val v35: Vector[Vector[Double]] = v30.p2
    v8 = v8.copy(p2 = v20)
    var v26: Vector[Vector[Double]] = v12
    var v40: Vector[Vector[Double]] = v35
    val v38: s0 = f55(v67)
    v40 = v40.updated(1, v29)
    v40 = v40.updated(1, v29)
    val v41: s0 = s0(v19, v22, v40, v26, v17)
    v8 = v8.copy(p0 = v20)
    var v34: s0 = v41
    v8 = v38
    v34 = v34.copy(p0 = v2)
    var v91: s0 = v34
    val v96: Vector[Double] = v40(0)
    v11 = v11.updated(2, v96)
    v91 = v91.copy(p0 = v11)
    v91
  }
  def f40(v0: s0, v1: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p3
    var v5: s0 = v1
    val v2: s0 = f55(v5)
    v5 = v5.copy(p3 = v3)
    val v7: Vector[Vector[Double]] = v1.p3
    val v21: Vector[Vector[Vector[Double]]] = Vector(v3, v7, v3, v7, v3, v7)
    val v12: Vector[Vector[Double]] = v5.p1
    val v10: Vector[Vector[Double]] = v5.p4
    val v14: Vector[Vector[Double]] = v5.p4
    v5 = v5.copy(p3 = v12)
    val v16: s0 = f55(v2)
    val v24: Vector[Vector[Double]] = v21(2)
    v5 = v5.copy(p0 = v14)
    v5 = v5.copy(p2 = v10)
    v5 = v16
    v5 = v5.copy(p1 = v24)
    v5 = v5.copy(p1 = v7)
    var v139: s0 = v16
    v139
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v2: Vector[s0] = v0(0)
    val v7: s0 = v2(0)
    val v6: s0 = f52(v7, v0)
    val v13: s0 = f40(v7, v6)
    val v14: Vector[Vector[Double]] = v13.p2
    val v19: Vector[Double] = v14(0)
    var v23: Vector[Double] = v19
    val v54: Double = v23(0)
    v54
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)))))
    val v1: Double = 11.0
    val start = nanoTime()
    var result: Double = 11.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}