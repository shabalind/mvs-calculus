import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f49(v0: s1): s1 = {
    val v3: Vector[s0] = v0.p1
    val v4: s0 = v0.p0
    val v8: Vector[s0] = v0.p1
    val v1: Vector[Vector[Double]] = v4.p0
    var v5: s1 = v0
    val v10: Vector[Double] = v1(0)
    v5 = v5.copy(p1 = v3)
    v5 = v5.copy(p1 = v3)
    val v2: Vector[Vector[s0]] = Vector(v8, v3, v8)
    v5 = v5.copy(p1 = v3)
    var v14: Vector[Vector[Double]] = v1
    val v16: Vector[s0] = v0.p1
    v14 = v14.updated(0, v10)
    val v33: Vector[s0] = v5.p1
    val v43: s0 = s0(v14)
    v14 = v14.updated(0, v10)
    val v20: Vector[s0] = v2(2)
    val v32: s1 = s1(v43, v20)
    v5 = v5.copy(p1 = v8)
    val v48: s0 = v5.p0
    val v44: Vector[Vector[Double]] = v48.p0
    v14 = v44
    val v70: s0 = v16(1)
    v5 = v5.copy(p1 = v33)
    val v74: Vector[s0] = v32.p1
    var v80: s1 = v5
    v80 = v80.copy(p1 = v3)
    v5 = v5.copy(p0 = v70)
    v5 = v5.copy(p1 = v74)
    v80
  }
  def f31(v0: s1, v1: s1): s1 = {
    val v3: s1 = f49(v1)
    val v8: s0 = v1.p0
    var v12: s1 = v3
    v12 = v12.copy(p0 = v8)
    v12
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v3: s1 = v0
    val v2: s1 = f49(v3)
    var v5: s1 = v2
    val v11: s1 = f31(v0, v3)
    val v4: s0 = v11.p0
    val v10: Vector[s0] = v5.p1
    val v15: Vector[Vector[Double]] = v4.p0
    var v29: Vector[Vector[Double]] = v15
    v3 = v3.copy(p1 = v10)
    val v16: Vector[Double] = v29(0)
    var v40: Vector[Vector[Double]] = v15
    v40 = v40.updated(0, v16)
    val v79: Vector[Double] = v40(0)
    v5 = v5.copy(p1 = v10)
    v3 = v3.copy(p0 = v4)
    val v135: Double = v79(0)
    v135
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0))), Vector(s0(Vector(Vector(1.0))), s0(Vector(Vector(2.0)))))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}