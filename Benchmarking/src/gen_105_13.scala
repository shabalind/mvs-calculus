import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v4: Double = v1
    var v6: Vector[s1] = v0
    val v7: s1 = v0(0)
    val v3: s1 = v6(0)
    val v2: s0 = v3.p1
    val v15: Vector[Vector[Double]] = v2.p0
    val v36: Double = v4 + v1
    v6 = v6.updated(0, v7)
    v6 = v6.updated(0, v3)
    val v35: Vector[Double] = v15(0)
    v6 = v6.updated(0, v7)
    val v43: Vector[Double] = Vector(v1, v1, v36, v36, v4)
    v6 = v6.updated(0, v7)
    val v29: Double = v35(0)
    val v41: Double = v43(4)
    val v50: Vector[Double] = Vector(v29, v29, v1, v41, v36)
    var v69: Vector[Double] = v50
    val v82: Double = v69(3)
    v82
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}