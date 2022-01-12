import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Double
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[s1],
    p1: s3
  )
  def f4(v0: Double, v1: s3): Double = {
    val v5: Vector[s0] = v1.p0
    val v7: s0 = v5(1)
    val v2: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Double] = v2(1)
    val v22: Double = v11(0)
    v22
  }
  @noinline
  def f0(v0: s5, v1: Double): Double = {
    val v2: s3 = v0.p1
    val v14: Double = f4(v1, v2)
    val v17: Double = f4(v14, v2)
    val v15: Double = f4(v17, v2)
    val v19: Double = f4(v15, v2)
    v19
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), 4.0)), s3(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0))), s0(Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)))), Vector(s0(Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))))
    val v1: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}