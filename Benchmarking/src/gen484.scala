import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0
  )
  case class s5 (
    p0: s2,
    p1: s2
  )
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v2: s2 = v0.p1
    val v3: s0 = v2.p0
    var v4: s0 = v3
    var v6: s0 = v4
    val v8: s0 = v2.p0
    val v27: Vector[Vector[Double]] = v3.p0
    val v16: s0 = v2.p0
    val v20: s2 = s2(v4)
    val v22: Vector[Double] = v27(0)
    val v23: Vector[Vector[Double]] = v16.p0
    val v26: s0 = v2.p0
    var v24: s2 = v20
    var v40: s0 = v16
    val v21: Vector[Double] = v23(0)
    val v71: Vector[Vector[Double]] = v6.p0
    val v37: Vector[Double] = v71(0)
    val v43: Vector[Vector[Double]] = Vector(v21, v37, v22)
    val v72: Vector[Vector[Double]] = v16.p1
    val v45: Vector[Vector[Double]] = v40.p0
    v6 = v6.copy(p1 = v72)
    var v55: Vector[Vector[Double]] = v72
    v4 = v4.copy(p0 = v27)
    val v50: s0 = v24.p0
    val v78: Vector[Vector[Double]] = v8.p0
    v6 = v50
    v4 = v4.copy(p0 = v45)
    val v34: Vector[Double] = v43(2)
    var v97: s0 = v26
    var v112: Vector[Vector[Double]] = v72
    v97 = v97.copy(p0 = v78)
    var v53: s0 = v97
    v4 = v4.copy(p1 = v112)
    v24 = v24.copy(p0 = v53)
    v24 = v24.copy(p0 = v16)
    val v107: Double = v34(0)
    v4 = v4.copy(p1 = v55)
    v6 = v6.copy(p1 = v55)
    v107
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), s2(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))))
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