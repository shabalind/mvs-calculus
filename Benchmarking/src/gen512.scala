import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  case class s5 (
    p0: Vector[s4],
    p1: s4
  )
  case class s9 (
    p0: s5,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s9, v1: Double): Double = {
    val v7: Vector[Double] = Vector(v1, v1, v1, v1, v1)
    val v8: Double = v7(3)
    var v16: Vector[Double] = v7
    val v21: Double = v7(2)
    val v25: Double = v16(3)
    val v15: Double = v25 * v21
    val v17: Double = v25 / v25
    var v79: Double = v8
    v16 = v16.updated(4, v15)
    v16 = v16.updated(2, v21)
    v16 = v16.updated(1, v79)
    v17
  }
  def benchmark(): Unit = {
    val v0: s9 = s9(s5(Vector(s4(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))), s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s4(Vector(s1(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), s1(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), Vector(s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))))
    val v1: Double = 22.0
    val start = nanoTime()
    var result: Double = 22.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}