import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f24(v0: Double): Double = {
    val v6: Double = v0 / v0
    var v7: Double = v0
    var v1: Double = v7
    var v4: Double = v1
    var v13: Double = v0
    var v9: Double = v4
    var v3: Double = v9
    val v15: Double = v13 * v13
    val v10: Vector[Double] = Vector(v1, v9, v15, v3)
    var v30: Double = v6
    var v22: Vector[Double] = v10
    var v14: Vector[Double] = v22
    val v28: Double = v22(0)
    var v46: Double = v28
    v22 = v22.updated(1, v1)
    v22 = v22.updated(1, v4)
    v14 = v14.updated(0, v46)
    v3 = v6
    v22 = v22.updated(3, v30)
    var v23: Vector[Double] = v14
    var v51: Vector[Double] = v23
    v51 = v51.updated(1, v28)
    val v41: Double = v51(1)
    v41
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v3: Double = f24(v1)
    var v5: Double = v3
    v5 = v3
    val v38: Double = f24(v5)
    v38
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
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