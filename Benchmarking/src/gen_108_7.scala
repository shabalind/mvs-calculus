import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f93(v0: s0): s0 = {
    val v8: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8, v8, v8)
    val v17: Vector[Vector[Double]] = v6(0)
    var v20: s0 = v0
    v20 = v20.copy(p1 = v17)
    v20 = v0
    v20 = v20.copy(p1 = v17)
    v20
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: s0, v3: s0, v4: Double): Double = {
    val v5: s0 = f93(v3)
    val v12: Vector[Vector[Double]] = v5.p1
    val v13: Vector[Double] = v12(0)
    val v42: Double = v13(0)
    v42
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))
    val v2: s0 = s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))
    val v3: s0 = s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))
    val v4: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}