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
  case class s2 (
    p0: s1,
    p1: s1,
    p2: s1
  )
  def f46(v0: s0): s0 = {
    var v3: s0 = v0
    var v2: s0 = v3
    val v11: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v2
    val v5: Vector[Vector[Double]] = v3.p1
    val v10: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p1 = v11)
    val v15: Vector[Vector[Double]] = v6.p1
    val v9: Vector[Vector[Double]] = v0.p0
    val v27: Vector[Vector[Double]] = v0.p0
    v3 = v3.copy(p0 = v27)
    val v28: Vector[Double] = v9(0)
    v2 = v2.copy(p0 = v9)
    val v12: Vector[Vector[Double]] = v6.p0
    v3 = v3.copy(p1 = v15)
    v6 = v6.copy(p0 = v9)
    var v16: Vector[Vector[Double]] = v12
    v6 = v6.copy(p1 = v15)
    val v20: Vector[Double] = v16(0)
    v16 = v16.updated(0, v28)
    val v34: Vector[Vector[Double]] = v2.p1
    v16 = v16.updated(0, v20)
    val v19: Vector[Vector[Double]] = v3.p0
    v6 = v6.copy(p1 = v5)
    val v21: s0 = s0(v19, v10)
    v2 = v2.copy(p0 = v16)
    v6 = v6.copy(p1 = v34)
    v6 = v2
    v3 = v3.copy(p0 = v16)
    v21
  }
  def f30(v0: s0): s0 = {
    val v1: s1 = s1(v0, v0)
    val v5: s0 = f46(v0)
    var v6: s1 = v1
    val v3: s0 = f46(v0)
    var v7: s1 = v6
    v7 = v7.copy(p1 = v5)
    var v4: s1 = v6
    var v2: s1 = v6
    val v15: s0 = v7.p1
    v2 = v4
    val v21: s0 = v2.p0
    v6 = v6.copy(p1 = v15)
    v6 = v2
    v7 = v7.copy(p0 = v21)
    val v63: s0 = v6.p0
    val v18: s0 = f46(v63)
    val v40: s2 = s2(v2, v4, v1)
    v2 = v2.copy(p1 = v18)
    val v39: s1 = v40.p0
    val v214: s0 = v6.p1
    v6 = v6.copy(p1 = v214)
    v6 = v6.copy(p0 = v214)
    v4 = v4.copy(p0 = v3)
    val v122: s0 = v39.p1
    v122
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v6: s0 = v0(1)
    val v4: s0 = f30(v6)
    val v5: Vector[Vector[Double]] = v4.p0
    val v23: Vector[Double] = v5(0)
    val v54: Double = v23(0)
    var v27: Double = v54
    val v55: Double = v54 + v27
    v55
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}