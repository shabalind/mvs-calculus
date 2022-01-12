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
    p0: Vector[s0],
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s3, v1: s0, v2: Double): Double = {
    val v6: Vector[Vector[Double]] = v1.p1
    val v11: Vector[Double] = v6(0)
    val v27: Double = v11(0)
    var v17: Vector[Double] = v11
    v17 = v17.updated(0, v2)
    val v32: Double = v11(0)
    val v33: Double = v27 * v32
    v17 = v17.updated(0, v2)
    v17 = v17.updated(0, v32)
    val v96: Double = v2 * v33
    val v51: Double = v17(0)
    v17 = v17.updated(0, v32)
    val v139: Double = v96 * v51
    v139
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))))
    val v1: s0 = s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))
    val v2: Double = 27.0
    val start = nanoTime()
    var result: Double = 27.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}