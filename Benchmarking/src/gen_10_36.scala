import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Double]
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: s0, v2: Double): Double = {
    val v8: Vector[Vector[Double]] = v1.p1
    val v9: Vector[Double] = v8(0)
    val v3: Double = v9(0)
    val v18: Vector[Vector[Double]] = v1.p1
    val v10: Double = v9(0)
    val v22: Vector[Double] = v18(0)
    val v34: Double = v22(0)
    val v63: Double = v2 * v10
    val v102: Double = v63 - v3
    var v104: Double = v34
    val v145: Double = v102 / v104
    v145
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(4.0, 5.0)), Vector(Vector(s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0))), Vector(10.0, 11.0)))))), Vector(s2(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), Vector(16.0, 17.0)), Vector(Vector(s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0))), Vector(22.0, 23.0))))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))))
    val v1: s0 = s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))
    val v2: Double = 36.0
    val start = nanoTime()
    var result: Double = 36.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}