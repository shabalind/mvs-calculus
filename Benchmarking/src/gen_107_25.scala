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
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v3: Vector[Vector[s0]] = v0.p1
    val v5: Vector[s0] = v3(2)
    val v7: s0 = v5(0)
    val v9: Vector[Vector[Double]] = v7.p0
    val v15: Vector[Double] = v9(0)
    val v14: Vector[Double] = v9(0)
    val v24: Double = v15(0)
    val v19: Double = v14(0)
    val v35: Double = v1 / v19
    val v147: Double = v24 + v35
    v147
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}