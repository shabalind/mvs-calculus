import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2
  )
  @noinline
  def f0(v0: s3, v1: Vector[s1], v2: Double): Double = {
    val v4: Vector[s1] = v0.p0
    val v15: s1 = v4(1)
    val v6: s0 = v15.p0
    val v12: Vector[Vector[Double]] = v6.p1
    val v36: Vector[Double] = v12(0)
    val v80: Double = v36(0)
    val v34: Double = v80 + v2
    var v74: Double = v34
    val v100: Double = v80 * v34
    val v90: Double = v74 * v100
    val v105: Vector[Double] = Vector(v90, v90)
    val v174: Double = v105(1)
    v174
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s2(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), s1(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))))
    val v2: Double = 33.0
    val start = nanoTime()
    var result: Double = 33.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}