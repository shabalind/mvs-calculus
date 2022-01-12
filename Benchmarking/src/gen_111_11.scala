import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s2 (
    p0: Double
  )
  def f48(v0: s2): s2 = {
    var v3: s2 = v0
    var v5: s2 = v0
    var v6: s2 = v5
    var v13: s2 = v3
    val v11: Double = v6.p0
    v13 = v13.copy(p0 = v11)
    v5 = v5.copy(p0 = v11)
    var v7: s2 = v13
    var v26: s2 = v7
    v26
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v7: s2 = f48(v0)
    val v5: Double = v0.p0
    var v12: s2 = v0
    var v6: Double = v1
    v12 = v12.copy(p0 = v5)
    var v10: Double = v6
    v12 = v12.copy(p0 = v1)
    val v27: Double = v0.p0
    v10 = v27
    v12 = v12.copy(p0 = v10)
    val v51: Double = v7.p0
    v12 = v12.copy(p0 = v51)
    val v61: s2 = f48(v12)
    v12 = v12.copy(p0 = v51)
    val v166: Double = v61.p0
    v166
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(0.0)
    val v1: Double = 1.0
    val start = nanoTime()
    var result: Double = 1.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}