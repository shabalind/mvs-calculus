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
  def f96(v0: Double): Double = {
    val v3: Double = v0 - v0
    var v4: Double = v0
    var v7: Double = v3
    var v2: Double = v0
    var v8: Double = v0
    var v5: Double = v7
    var v21: Double = v4
    val v12: Vector[Double] = Vector(v2, v21, v8, v5)
    var v17: Vector[Double] = v12
    v4 = v8
    val v23: Double = v17(3)
    v17 = v17.updated(2, v8)
    v23
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v3: Double = f96(v1)
    var v4: Double = v3
    var v10: Double = v4
    val v42: Double = v3 + v4
    val v22: Vector[Double] = Vector(v1, v42, v10)
    val v59: Double = v22(2)
    v59
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), Vector(s1(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}