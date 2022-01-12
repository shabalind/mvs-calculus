import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f50(v0: s0): s0 = {
    var v7: s0 = v0
    var v3: s0 = v0
    var v2: s0 = v0
    v3 = v7
    val v8: Vector[Vector[Double]] = v3.p1
    v2 = v2.copy(p1 = v8)
    val v4: Vector[Double] = v8(0)
    v2 = v7
    var v6: Vector[Vector[Double]] = v8
    v2 = v2.copy(p1 = v8)
    v6 = v6.updated(0, v4)
    var v14: Vector[Vector[Double]] = v6
    v3 = v3.copy(p1 = v6)
    val v12: Vector[Vector[Double]] = v0.p0
    var v15: Vector[Vector[Double]] = v12
    v2 = v2.copy(p0 = v12)
    v15 = v15.updated(0, v4)
    v2 = v2.copy(p0 = v12)
    val v13: s0 = s0(v15, v14)
    var v11: Vector[Vector[Double]] = v14
    val v24: Vector[Vector[Vector[Double]]] = Vector(v11, v14, v14, v6, v8)
    val v43: Vector[Double] = v6(0)
    v3 = v3.copy(p1 = v6)
    var v19: Vector[Vector[Vector[Double]]] = v24
    v7 = v7.copy(p0 = v15)
    var v23: Vector[Vector[Double]] = v15
    val v26: Vector[Vector[Double]] = v2.p1
    var v47: Vector[Vector[Double]] = v8
    v2 = v2.copy(p1 = v26)
    val v32: Vector[Vector[Double]] = v0.p0
    val v65: Vector[Vector[Double]] = v19(2)
    v7 = v7.copy(p0 = v32)
    val v28: Vector[Vector[Double]] = v7.p0
    var v48: s0 = v0
    v2 = v2.copy(p1 = v8)
    var v80: s0 = v2
    v2 = v2.copy(p0 = v28)
    val v70: s0 = s0(v23, v65)
    val v150: Vector[s0] = Vector(v13, v48, v70, v80, v0, v7)
    val v83: Vector[Vector[Double]] = v0.p0
    v2 = v2.copy(p1 = v8)
    v6 = v6.updated(0, v4)
    v48 = v48.copy(p1 = v14)
    v7 = v7.copy(p1 = v47)
    v7 = v7.copy(p0 = v83)
    var v100: Vector[Double] = v43
    val v85: s0 = v150(2)
    v6 = v6.updated(0, v100)
    v7 = v7.copy(p1 = v8)
    v11 = v11.updated(0, v43)
    val v69: Vector[Vector[Double]] = v2.p1
    val v145: Vector[Vector[Double]] = v48.p0
    v3 = v3.copy(p1 = v69)
    v80 = v80.copy(p0 = v145)
    v85
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v4: s1 = v0(1)
    val v3: s0 = v4.p0
    val v8: s0 = f50(v3)
    val v17: s0 = f50(v8)
    val v18: Vector[Vector[Double]] = v17.p0
    val v27: Vector[Double] = v18(1)
    val v30: Double = v27(0)
    val v96: Double = v27(0)
    val v58: Double = v96 - v30
    var v132: Double = v58
    v132
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}