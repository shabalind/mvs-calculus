import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  def f85(v0: Double): Double = {
    var v5: Double = v0
    val v1: Vector[Double] = Vector(v0, v5)
    val v6: Double = v1(0)
    val v7: Double = v1(1)
    val v10: Double = v1(0)
    val v14: Double = v1(1)
    val v9: Double = v1(0)
    val v12: Vector[Double] = Vector(v6, v5)
    val v34: Double = v12(1)
    val v18: Vector[Double] = Vector(v14, v0, v10, v0, v6, v34)
    var v28: Vector[Double] = v18
    v28 = v28.updated(2, v7)
    val v19: Double = v28(4)
    var v38: Vector[Double] = v28
    val v42: Double = v38(2)
    v38 = v38.updated(1, v19)
    v5 = v9
    v42
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    var v3: Double = v1
    v3 = v1
    val v2: Double = f85(v1)
    val v5: Double = f85(v1)
    v3 = v5
    var v14: Double = v3
    val v28: Double = v2 / v14
    v28
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)), Vector(Vector(6.0)), Vector(Vector(7.0)))), s2(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0)))))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}