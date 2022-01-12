import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  def f76(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p2
    val v4: Vector[Double] = v6(0)
    var v2: s0 = v0
    val v5: Vector[Double] = v6(0)
    v2 = v0
    v2 = v0
    var v8: Vector[Vector[Double]] = v6
    val v14: Vector[Vector[Double]] = v0.p0
    val v13: Vector[Vector[Double]] = v0.p3
    val v10: Vector[Double] = v1(0)
    v2 = v0
    v8 = v8.updated(0, v4)
    v8 = v8.updated(0, v4)
    v2 = v0
    v2 = v2.copy(p0 = v14)
    val v22: Vector[Vector[Double]] = v0.p1
    v8 = v8.updated(0, v10)
    val v19: Vector[Vector[Double]] = v0.p3
    v8 = v8.updated(0, v5)
    var v28: Vector[Vector[Double]] = v8
    var v31: Vector[Vector[Double]] = v19
    v2 = v2.copy(p0 = v14)
    val v34: Vector[Vector[Double]] = v2.p3
    v2 = v2.copy(p2 = v19)
    var v32: s0 = v0
    v31 = v31.updated(0, v5)
    val v38: Vector[Vector[Double]] = v0.p1
    v32 = v32.copy(p3 = v34)
    var v20: s0 = v0
    val v27: Vector[Vector[Double]] = v20.p0
    v2 = v2.copy(p2 = v13)
    var v110: Vector[Double] = v4
    v32 = v32.copy(p2 = v31)
    val v49: Vector[Vector[Double]] = v32.p1
    var v42: Vector[Vector[Double]] = v6
    val v37: s0 = s0(v27, v49, v28, v28)
    v20 = v20.copy(p3 = v42)
    v20 = v20.copy(p1 = v22)
    val v52: Vector[Vector[Double]] = v20.p0
    var v71: Vector[Vector[Double]] = v38
    v20 = v20.copy(p1 = v71)
    v2 = v2.copy(p0 = v52)
    v42 = v42.updated(0, v110)
    v37
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v2: Vector[s0] = v0(0)
    val v9: s0 = v2(0)
    var v29: s0 = v9
    val v19: Vector[Vector[Double]] = v29.p0
    val v25: s0 = f76(v29)
    val v23: Vector[Vector[Double]] = v25.p2
    var v65: Vector[Vector[Double]] = v23
    val v28: Vector[Vector[Double]] = v9.p1
    val v17: Vector[Vector[Double]] = v29.p0
    v29 = v29.copy(p2 = v65)
    val v37: Vector[Vector[Double]] = v25.p3
    val v46: Vector[Double] = v17(0)
    v29 = v29.copy(p1 = v28)
    v29 = v29.copy(p1 = v28)
    v29 = v29.copy(p1 = v28)
    v29 = v29.copy(p3 = v37)
    var v58: Vector[Double] = v46
    val v66: Double = v46(0)
    v29 = v29.copy(p0 = v19)
    v65 = v65.updated(0, v58)
    v66
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0)))))
    val v1: Double = 7.0
    val start = nanoTime()
    var result: Double = 7.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}