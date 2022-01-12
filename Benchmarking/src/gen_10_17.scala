import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v3: s0 = v0.p1
    val v6: Vector[Vector[Double]] = v3.p1
    var v7: Double = v1
    val v15: Vector[Double] = v6(0)
    var v2: Vector[Double] = v15
    v2 = v2.updated(0, v7)
    v2 = v2.updated(0, v1)
    val v10: s0 = v0.p1
    val v20: Double = v15(0)
    v2 = v2.updated(0, v1)
    var v105: Double = v20
    val v38: Vector[Vector[Double]] = v10.p0
    val v53: Double = v2(0)
    var v104: Double = v53
    val v67: Vector[Double] = v38(0)
    v104 = v105
    v105 = v104
    v2 = v67
    v104
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}