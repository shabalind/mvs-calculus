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
    p0: Vector[Vector[s0]],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v6: Double = v1
    val v5: Double = v6 + v1
    v6 = v1
    val v21: Double = v5 - v5
    val v24: Vector[Double] = Vector(v1, v1, v21, v6, v5, v1)
    val v30: Double = v24(5)
    var v56: Vector[Double] = v24
    v56 = v56.updated(5, v1)
    v56 = v56.updated(0, v30)
    val v58: Double = v56(0)
    v58
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), Vector(s1(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s1(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}