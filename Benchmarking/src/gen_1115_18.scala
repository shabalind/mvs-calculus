import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f43(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v0.p1
    var v16: s0 = v0
    val v35: Vector[Vector[Double]] = v16.p1
    v16 = v16.copy(p0 = v4)
    val v14: Vector[Vector[Double]] = v0.p0
    var v24: s0 = v0
    v16 = v16.copy(p1 = v9)
    val v33: Vector[Vector[Double]] = v24.p0
    v24 = v24.copy(p1 = v35)
    v24 = v24.copy(p1 = v9)
    val v54: Vector[Vector[Double]] = v24.p0
    v24 = v24.copy(p0 = v14)
    v24 = v24.copy(p0 = v54)
    v24 = v24.copy(p0 = v33)
    val v95: Vector[Vector[Double]] = v24.p0
    v16 = v16.copy(p0 = v95)
    v24
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v7: s1 = v0(0)
    val v5: s0 = v7.p1
    val v2: s0 = f43(v5)
    val v10: Vector[Vector[Double]] = v2.p1
    var v13: Double = v1
    var v12: Double = v13
    val v31: Vector[Double] = v10(0)
    val v27: Double = v31(0)
    val v32: Vector[Double] = v10(0)
    var v16: Double = v13
    val v59: Double = v32(0)
    val v61: Vector[Double] = Vector(v59, v16, v1, v12, v27, v59)
    val v94: Double = v61(4)
    v94
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))))
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