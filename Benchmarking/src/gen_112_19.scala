import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v7: s2 = v0
    val v4: Vector[Vector[s1]] = v0.p1
    v7 = v7.copy(p1 = v4)
    val v2: s1 = v7.p0
    val v5: Vector[s0] = v2.p0
    val v9: s0 = v5(0)
    v7 = v7.copy(p0 = v2)
    val v25: Vector[Vector[Double]] = v9.p0
    var v40: s0 = v9
    var v33: s0 = v40
    val v46: Vector[Vector[Double]] = v33.p0
    val v100: Vector[Double] = v46(0)
    val v151: Vector[Vector[Double]] = v33.p0
    var v93: Vector[Vector[Double]] = v151
    v40 = v40.copy(p0 = v93)
    v40 = v40.copy(p0 = v25)
    val v77: Double = v100(0)
    v77
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(1.0))))))))
    val v1: Double = 2.0
    val start = nanoTime()
    var result: Double = 2.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}