import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[Double]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Double): Double = {
    val v3: Vector[s2] = v0(0)
    val v5: s2 = v3(0)
    val v10: s0 = v5.p1
    val v2: Vector[Vector[Double]] = v10.p0
    var v18: Vector[Vector[Double]] = v2
    val v25: Vector[Double] = v18(0)
    val v35: Double = v25(0)
    v18 = v18.updated(1, v25)
    val v43: Double = v25(0)
    val v100: Double = v43 + v35
    val v92: Double = v35 + v100
    v92
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(Vector(0.0)), s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0))))), Vector(s2(s1(Vector(Vector(11.0)), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)), Vector(Vector(16.0)))), s0(Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0))))))
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