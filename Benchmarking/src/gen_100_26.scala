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
  case class s5 (
    p0: s0,
    p1: s1
  )
  def f62(v0: Double): Double = {
    var v1: Double = v0
    var v4: Double = v1
    var v10: Double = v1
    var v15: Double = v4
    var v20: Double = v10
    var v11: Double = v0
    var v12: Double = v11
    val v30: Vector[Double] = Vector(v20, v12, v15)
    v4 = v0
    val v21: Double = v30(1)
    v21
  }
  @noinline
  def f0(v0: Vector[s0], v1: s5, v2: Double): Double = {
    var v5: Double = v2
    val v13: Double = v5 - v2
    var v8: Double = v5
    v5 = v8
    val v41: Double = v13 * v8
    val v81: Double = v41 + v8
    val v143: Double = f62(v81)
    v5 = v81
    v143
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))))
    val v1: s5 = s5(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s1(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}