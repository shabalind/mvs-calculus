import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v5: Vector[s1] = v0(0)
    val v6: s1 = v5(0)
    val v10: s0 = v6.p1
    val v11: s1 = v5(0)
    val v9: s0 = v11.p0
    val v20: Vector[Vector[Double]] = v10.p3
    val v15: Vector[Double] = v20(1)
    val v31: Vector[Vector[Double]] = v9.p5
    var v36: Vector[Vector[Double]] = v31
    v36 = v36.updated(0, v15)
    val v41: Vector[Double] = v36(0)
    v36 = v36.updated(0, v15)
    val v134: Double = v41(0)
    v134
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}