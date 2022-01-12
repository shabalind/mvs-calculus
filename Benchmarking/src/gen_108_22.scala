import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f29(v0: s1): s1 = {
    var v7: s1 = v0
    var v1: s1 = v7
    var v5: s1 = v1
    val v2: s0 = v0.p1
    val v3: s0 = v5.p1
    var v6: s0 = v3
    val v10: Vector[Vector[Double]] = v2.p0
    v1 = v1.copy(p1 = v6)
    var v12: s0 = v3
    var v16: s0 = v12
    val v20: Vector[Vector[Double]] = v3.p1
    val v28: Vector[Vector[Double]] = v6.p1
    var v21: s1 = v7
    val v22: s1 = s1(v12, v16)
    val v52: Vector[Vector[Double]] = v2.p1
    v5 = v5.copy(p0 = v2)
    val v31: s0 = v21.p1
    val v44: s0 = v0.p0
    val v37: Vector[Double] = v52(0)
    val v43: s0 = v22.p0
    var v23: Vector[Vector[Double]] = v10
    val v30: Vector[Vector[Double]] = v31.p0
    v23 = v23.updated(0, v37)
    val v46: s0 = s0(v30, v20)
    v21 = v21.copy(p0 = v46)
    var v32: s1 = v22
    val v51: Vector[Vector[Double]] = v44.p1
    val v72: s0 = v0.p0
    v21 = v21.copy(p0 = v6)
    v32 = v32.copy(p1 = v31)
    var v115: s0 = v46
    val v45: Vector[Vector[Double]] = v31.p1
    v7 = v7.copy(p0 = v6)
    val v129: Vector[Vector[Double]] = v43.p1
    val v79: Vector[Vector[Vector[Double]]] = Vector(v20, v28, v51, v129, v52, v45, v129)
    v6 = v115
    v12 = v12.copy(p1 = v52)
    val v65: Vector[Vector[Double]] = v79(0)
    v6 = v6.copy(p0 = v23)
    v115 = v115.copy(p1 = v65)
    v12 = v16
    v5 = v5.copy(p1 = v72)
    v5 = v5.copy(p0 = v43)
    v32
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v7: s1 = f29(v0)
    val v3: s0 = v7.p0
    val v4: Vector[Double] = Vector(v1, v1, v1, v1)
    val v2: Double = v4(1)
    val v6: Vector[Vector[Double]] = v3.p1
    val v16: Vector[Double] = v6(1)
    var v74: Vector[Double] = v16
    v74 = v74.updated(0, v2)
    val v143: Double = v74(0)
    v143
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}