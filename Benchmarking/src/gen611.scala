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
  def f110(v0: s1): s1 = {
    val v7: s0 = v0.p0
    var v2: s0 = v7
    val v1: Vector[s0] = v0.p1
    val v6: Vector[s1] = Vector(v0, v0, v0)
    val v4: s1 = s1(v2, v1)
    var v3: Vector[s1] = v6
    val v9: Vector[Vector[Double]] = v7.p0
    val v15: s1 = v6(2)
    v2 = v2.copy(p0 = v9)
    val v22: s0 = v15.p0
    v3 = v3.updated(0, v15)
    v3 = v3.updated(0, v4)
    val v48: Vector[Vector[Double]] = v22.p0
    v2 = v2.copy(p0 = v48)
    val v32: s1 = v3(0)
    var v58: Vector[s1] = v6
    v58 = v58.updated(0, v32)
    val v47: s1 = v58(0)
    var v86: s1 = v47
    v86
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v6: Vector[s1] = v0(0)
    var v8: Double = v1
    val v10: s1 = v6(0)
    val v12: s1 = f110(v10)
    val v11: s0 = v12.p0
    val v25: Vector[Vector[Double]] = v11.p0
    val v20: Vector[Double] = v25(1)
    var v35: Vector[Double] = v20
    var v30: Vector[Vector[Double]] = v25
    v35 = v35.updated(0, v8)
    v30 = v30.updated(0, v35)
    v30 = v30.updated(0, v35)
    v35 = v35.updated(0, v1)
    val v90: Vector[Double] = v30(0)
    v35 = v35.updated(0, v8)
    val v106: Double = v90(0)
    v106
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))))
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