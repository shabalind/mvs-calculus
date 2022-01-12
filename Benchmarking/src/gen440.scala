import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  def f15(v0: Vector[s0]): Vector[s0] = {
    var v2: Vector[s0] = v0
    val v5: s0 = v2(0)
    var v10: Vector[s0] = v2
    val v6: Vector[Vector[Double]] = v5.p1
    var v14: Vector[Vector[Double]] = v6
    val v11: s0 = v10(1)
    val v20: Vector[Double] = v5.p0
    var v12: Vector[Double] = v20
    var v25: s0 = v11
    v2 = v2.updated(1, v5)
    var v18: Vector[s0] = v10
    val v31: Vector[Double] = v14(0)
    v14 = v14.updated(0, v12)
    val v22: Vector[Double] = v5.p0
    val v13: Vector[Vector[Double]] = v11.p1
    v18 = v18.updated(0, v25)
    v25 = v25.copy(p0 = v31)
    val v42: Vector[Vector[Double]] = v25.p1
    v14 = v14.updated(0, v22)
    v25 = v25.copy(p1 = v6)
    v25 = v25.copy(p1 = v13)
    v25 = v25.copy(p0 = v22)
    v25 = v25.copy(p1 = v42)
    var v53: Vector[s0] = v18
    v25 = v25.copy(p0 = v22)
    v53
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Vector[s0], v3: Double): Double = {
    var v7: Vector[s0] = v1
    val v13: s0 = v0(1)
    v7 = v7.updated(0, v13)
    val v8: Vector[s0] = f15(v7)
    val v4: s0 = v7(1)
    val v21: Vector[s0] = f15(v8)
    val v14: s0 = v21(1)
    val v18: Vector[Double] = v14.p0
    v7 = v1
    val v32: Vector[Double] = v4.p0
    val v55: Double = v32(0)
    val v37: Double = v18(0)
    val v94: Double = v37 * v55
    v94
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(0.0), Vector(Vector(1.0))), s0(Vector(2.0), Vector(Vector(3.0))), s0(Vector(4.0), Vector(Vector(5.0))))
    val v1: Vector[s0] = Vector(s0(Vector(6.0), Vector(Vector(7.0))), s0(Vector(8.0), Vector(Vector(9.0))))
    val v2: Vector[s0] = Vector(s0(Vector(10.0), Vector(Vector(11.0))), s0(Vector(12.0), Vector(Vector(13.0))), s0(Vector(14.0), Vector(Vector(15.0))))
    val v3: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}