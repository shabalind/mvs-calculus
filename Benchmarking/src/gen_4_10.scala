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
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    var v7: Double = v2
    val v3: s0 = v0(0)
    val v8: Vector[Vector[Double]] = v3.p1
    val v14: Vector[Double] = v8(2)
    v7 = v2
    val v15: Double = v14(0)
    val v25: s0 = v1.p0
    var v23: Vector[Double] = v14
    var v17: Vector[Double] = v23
    val v40: Double = v14(0)
    val v32: Vector[Vector[Double]] = v25.p0
    val v31: Vector[Double] = v32(0)
    v23 = v31
    v17 = v17.updated(0, v2)
    v23 = v23.updated(0, v15)
    v23 = v23.updated(0, v7)
    val v109: Double = v17(0)
    v23 = v23.updated(0, v40)
    val v139: Double = v7 + v109
    v139
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: s1 = s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}