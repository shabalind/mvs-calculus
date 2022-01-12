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
  def f15(v0: Double): Double = {
    var v4: Double = v0
    var v6: Double = v0
    var v2: Double = v4
    val v3: Double = v6 * v2
    var v1: Double = v3
    var v12: Double = v1
    var v16: Double = v12
    v16
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v7: Double = f15(v1)
    val v13: Double = v1 + v7
    var v36: Double = v13
    v36
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))), Vector(s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))))
    val v1: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}