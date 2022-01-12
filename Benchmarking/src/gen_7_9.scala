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
  case class s5 (
    p0: s1,
    p1: s1
  )
  def f120(v0: s1): s1 = {
    val v7: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0)
    val v5: s1 = v7(4)
    val v1: s1 = v7(0)
    val v13: s0 = v5.p1
    val v33: s1 = s1(v13, v13)
    val v38: s5 = s5(v33, v1)
    val v71: s1 = v38.p0
    v71
  }
  def f46(v0: s1): s1 = {
    var v7: s1 = v0
    var v4: s1 = v7
    val v3: s1 = f120(v4)
    var v1: s1 = v3
    v1
  }
  def f25(v0: Vector[Vector[s1]]): Vector[Vector[s1]] = {
    var v3: Vector[Vector[s1]] = v0
    val v6: Vector[s1] = v0(0)
    v3 = v0
    var v2: Vector[s1] = v6
    val v4: s1 = v6(0)
    v3 = v3.updated(0, v2)
    val v7: s0 = v4.p0
    val v9: s1 = s1(v7, v7)
    val v1: Vector[s1] = v3(0)
    val v13: s1 = f46(v9)
    v2 = v2.updated(0, v13)
    v2 = v2.updated(0, v4)
    v3 = v3.updated(0, v1)
    var v20: Vector[Vector[s1]] = v0
    v20 = v20.updated(1, v1)
    v2 = v2.updated(0, v4)
    v20
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v3: Vector[Vector[s1]] = f25(v0)
    val v5: Vector[s1] = v3(0)
    val v12: s1 = v5(0)
    val v20: s0 = v12.p0
    val v29: Vector[Vector[Double]] = v20.p0
    val v31: Vector[Vector[Double]] = v20.p1
    val v27: Vector[Double] = v31(0)
    val v47: Double = v27(0)
    val v62: Vector[Double] = v29(0)
    var v55: Vector[Vector[Double]] = v31
    val v78: Double = v1 / v47
    val v149: Vector[Double] = v55(1)
    val v46: Double = v149(0)
    v55 = v31
    v55 = v55.updated(1, v62)
    var v102: Double = v46
    val v83: Double = v102 + v102
    val v93: Double = v78 - v83
    v93
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))))
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