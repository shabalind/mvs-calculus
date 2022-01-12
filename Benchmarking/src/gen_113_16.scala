import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Vector[s1], v2: Double): Double = {
    val v5: s1 = v1(0)
    val v9: Vector[s0] = v5.p1
    val v10: s0 = v9(0)
    var v4: Double = v2
    val v11: Vector[Vector[Double]] = v10.p1
    var v8: Vector[Vector[Double]] = v11
    var v12: Vector[Vector[Double]] = v8
    val v13: Vector[Double] = v12(0)
    val v35: Double = v13(0)
    val v34: Vector[Vector[Double]] = v10.p1
    v8 = v34
    val v53: Double = v35 - v4
    v53
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}