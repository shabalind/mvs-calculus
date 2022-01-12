import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: s0
  )
  def f39(v0: s1, v1: s0): s0 = {
    var v3: s0 = v1
    val v6: Vector[Vector[Double]] = v3.p0
    val v4: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p0 = v6)
    v3 = v1
    val v30: Vector[Vector[Double]] = v1.p1
    v3 = v3.copy(p0 = v4)
    val v11: Vector[Vector[s0]] = v0.p1
    val v22: Vector[s0] = v11(0)
    val v21: s0 = v22(0)
    val v23: Vector[Vector[Double]] = v21.p0
    v3 = v3.copy(p0 = v30)
    val v20: Vector[Vector[Double]] = v3.p1
    var v60: s0 = v21
    v60 = v60.copy(p1 = v23)
    v60 = v60.copy(p0 = v20)
    v60
  }
  def f27(v0: s1, v1: s1): s1 = {
    val v7: Vector[Vector[s0]] = v1.p1
    val v2: Vector[s0] = v7(0)
    var v18: Vector[Vector[s0]] = v7
    var v12: Vector[Vector[s0]] = v18
    v18 = v18.updated(0, v2)
    val v13: Vector[s0] = v18(0)
    var v30: s1 = v1
    val v22: s0 = v13(0)
    v30 = v30.copy(p2 = v22)
    v30 = v30.copy(p1 = v12)
    v30
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v7: s1 = f27(v0, v0)
    val v2: Vector[Vector[s0]] = v7.p1
    val v5: Vector[s0] = v2(0)
    val v9: Double = v1 - v1
    var v10: Double = v1
    val v18: Vector[Double] = Vector(v10, v10, v10, v1, v9)
    val v20: s0 = v0.p2
    val v19: s0 = v5(0)
    val v25: Vector[Vector[Double]] = v19.p0
    val v22: s0 = f39(v7, v20)
    val v53: Vector[Vector[Double]] = v22.p0
    val v73: Double = v18(3)
    var v83: Vector[Vector[Double]] = v25
    val v52: Vector[Double] = v83(2)
    val v150: Double = v73 + v1
    val v147: Double = v52(0)
    v83 = v83.updated(2, v52)
    v83 = v83.updated(0, v52)
    val v141: Vector[Double] = v53(1)
    val v151: Double = v141(0)
    val v131: Double = v151 * v9
    val v164: Vector[Double] = Vector(v131, v150, v131, v147, v9, v131, v10)
    val v145: Double = v164(1)
    v145
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}