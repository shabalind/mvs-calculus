import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Double],
    p2: s0,
    p3: s0
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v4: s1 = v0.p1
    val v14: s0 = v4.p0
    val v12: Vector[Vector[Double]] = v14.p1
    val v11: Vector[Double] = v12(1)
    val v29: Vector[Vector[Double]] = Vector(v11, v11, v11, v11, v11, v11, v11)
    val v81: Vector[Vector[Vector[Double]]] = Vector(v29, v29, v29, v29, v29, v29, v29)
    val v110: Vector[Vector[Double]] = v81(4)
    val v39: Vector[Double] = v110(6)
    val v132: Double = v39(0)
    var v211: Double = v132
    v211
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(5.0), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0))), s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), Vector(21.0), s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))))
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