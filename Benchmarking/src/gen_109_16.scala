import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f40(v0: Double): Double = {
    var v2: Double = v0
    var v8: Double = v2
    var v7: Double = v2
    var v3: Double = v8
    val v15: Vector[Double] = Vector(v0, v3)
    var v13: Vector[Double] = v15
    v13 = v13.updated(1, v7)
    v13 = v13.updated(1, v2)
    var v14: Vector[Double] = v13
    var v11: Vector[Double] = v15
    var v20: Vector[Double] = v14
    val v37: Double = v11(0)
    val v66: Double = v20(1)
    v13 = v13.updated(1, v37)
    v66
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v8: Double = v1
    val v6: Double = v1 + v1
    var v3: Double = v6
    var v21: Double = v1
    val v93: Double = f40(v21)
    val v43: Double = f40(v8)
    var v100: Double = v93
    val v44: Vector[Double] = Vector(v6, v93, v1, v100, v3, v43)
    var v276: Double = v6
    v8 = v276
    var v138: Vector[Double] = v44
    v3 = v6
    val v118: Double = v138(4)
    v118
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Double = 3.0
    val start = nanoTime()
    var result: Double = 3.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}