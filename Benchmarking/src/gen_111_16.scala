import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v3: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    var v7: Vector[Double] = v3
    val v5: Double = v1 - v1
    v7 = v7.updated(2, v1)
    val v9: Double = v7(3)
    var v6: Vector[Double] = v7
    val v13: Double = v5 - v9
    val v15: Double = v13 + v13
    v7 = v7.updated(3, v1)
    v7 = v7.updated(2, v1)
    v7 = v3
    v6 = v6.updated(3, v5)
    var v28: Double = v15
    v6 = v6.updated(2, v5)
    v7 = v6
    v28
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
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