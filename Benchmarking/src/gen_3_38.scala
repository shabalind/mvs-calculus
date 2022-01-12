import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f80(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v0
    var v4: Double = v0
    val v5: Double = v4 - v2
    var v7: Double = v1
    var v13: Double = v2
    var v8: Double = v7
    v13 = v5
    var v52: Double = v2
    val v34: Double = v8 - v13
    v2 = v52
    v34
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Double = f80(v1)
    var v3: Double = v7
    v3 = v1
    v3 = v1
    val v179: Double = f80(v3)
    v179
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}