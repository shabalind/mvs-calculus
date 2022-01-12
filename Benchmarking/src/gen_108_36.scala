import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s1,
    p1: s3
  )
  @noinline
  def f0(v0: s4, v1: s1, v2: Double): Double = {
    val v5: Vector[s0] = v1.p0
    val v10: s0 = v5(1)
    val v25: Vector[Vector[Double]] = v10.p1
    val v17: Vector[Double] = v25(1)
    val v26: Double = v17(0)
    val v20: Vector[Double] = v25(1)
    val v33: Double = v2 + v26
    val v50: Double = v20(0)
    var v63: Double = v50
    val v171: Double = v63 / v33
    v171
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), s3(Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))))
    val v2: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}