import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    val v5: s3 = v0(1)
    val v9: s2 = v5.p0
    val v8: Vector[s0] = v9.p1
    val v12: s0 = v8(1)
    val v7: Vector[Vector[Double]] = v12.p0
    val v15: Double = v1 / v1
    val v27: Vector[Double] = v7(1)
    val v18: Double = v27(0)
    val v35: Double = v15 / v18
    val v47: Double = v15 - v35
    v47
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s2(s0(Vector(Vector(0.0), Vector(1.0))), Vector(s0(Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0))))), s1(Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0))))), Vector(s0(Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)))))), s3(s2(s0(Vector(Vector(20.0), Vector(21.0))), Vector(s0(Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0))))), s1(Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0))))), Vector(s0(Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0))), s0(Vector(Vector(38.0), Vector(39.0)))))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}