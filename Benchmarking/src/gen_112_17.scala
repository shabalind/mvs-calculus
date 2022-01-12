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
  case class s3 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: s3, v1: Vector[s0], v2: Double): Double = {
    val v7: s0 = v1(0)
    val v5: Vector[Vector[Double]] = v7.p0
    var v3: Vector[Vector[Double]] = v5
    val v50: Vector[Double] = v5(0)
    v3 = v3.updated(1, v50)
    v3 = v3.updated(1, v50)
    v3 = v3.updated(2, v50)
    val v49: Vector[Double] = v3(0)
    val v46: Double = v49(0)
    val v95: Double = v46 * v46
    v95
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))
    val v2: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}