import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v3: s0 = v0
    v3 = v3.copy(p0 = v1)
    var v10: Double = v1
    v3 = v3.copy(p0 = v10)
    var v6: s0 = v3
    val v13: Double = v3.p0
    v6 = v6.copy(p0 = v13)
    var v11: Double = v10
    var v27: s0 = v6
    v3 = v3.copy(p0 = v11)
    val v33: Double = v6.p0
    var v16: s0 = v27
    v16 = v16.copy(p0 = v11)
    var v66: s0 = v16
    v66 = v66.copy(p0 = v33)
    val v89: Double = v66.p0
    v27 = v27.copy(p0 = v33)
    v89
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(0.0, Vector(Vector(1.0), Vector(2.0)))
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