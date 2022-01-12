import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s8 (
    p0: Vector[s1],
    p1: Vector[s2]
  )
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    var v4: Double = v1
    var v6: Double = v4
    var v3: Double = v4
    v6 = v3
    var v25: Double = v3
    var v31: Double = v3
    v31 = v25
    val v23: Double = v25 * v31
    v25 = v4
    v3 = v4
    val v35: Vector[Double] = Vector(v25, v25, v6, v31)
    val v55: Double = v35(3)
    val v38: Double = v55 - v25
    v6 = v23
    v38
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))), Vector(s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s2(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))
    val v1: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}