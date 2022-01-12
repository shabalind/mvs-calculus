import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  def f21(v0: s0): s0 = {
    var v7: s0 = v0
    val v5: Vector[Vector[Double]] = v7.p2
    v7 = v7.copy(p0 = v5)
    var v4: Vector[Vector[Double]] = v5
    val v8: Vector[Double] = v4(1)
    v4 = v4.updated(0, v8)
    v7 = v7.copy(p2 = v4)
    val v3: Double = v8(0)
    val v9: Vector[Vector[Double]] = v7.p0
    val v1: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Double] = Vector(v3)
    var v6: Double = v3
    val v10: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v4)
    val v13: Double = v2(0)
    v7 = v0
    val v11: Vector[Vector[Double]] = v0.p2
    var v12: Vector[Double] = v2
    val v18: Vector[Vector[Double]] = v7.p1
    val v20: Vector[Vector[Double]] = v0.p1
    v4 = v4.updated(1, v2)
    var v25: Double = v13
    val v19: Vector[Double] = v18(0)
    val v14: s0 = s0(v10, v1, v10)
    v4 = v4.updated(1, v12)
    var v17: Double = v6
    v4 = v4.updated(1, v19)
    val v16: Vector[Vector[Double]] = v14.p2
    v7 = v7.copy(p2 = v9)
    v4 = v4.updated(0, v19)
    v12 = v12.updated(0, v17)
    v7 = v7.copy(p0 = v11)
    val v45: Vector[Vector[Double]] = v14.p1
    var v39: s0 = v14
    val v32: Vector[Vector[Double]] = v0.p1
    val v47: Vector[Vector[Double]] = v39.p0
    v12 = v12.updated(0, v25)
    v39 = v39.copy(p1 = v18)
    v39 = v39.copy(p0 = v16)
    val v54: s0 = s0(v4, v45, v47)
    v4 = v4.updated(1, v2)
    val v51: Double = v8(0)
    v7 = v7.copy(p1 = v32)
    v39 = v39.copy(p0 = v5)
    v39 = v39.copy(p1 = v20)
    v12 = v12.updated(0, v51)
    v54
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v5: s0 = f21(v0)
    val v8: Vector[Vector[Double]] = v5.p0
    val v3: Vector[Double] = v8(0)
    val v31: Double = v3(0)
    var v139: Double = v31
    v139
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)))
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