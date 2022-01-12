import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  @noinline
  def f0(v0: Vector[s3], v1: Double): Double = {
    var v4: Double = v1
    var v23: Double = v1
    val v20: Double = v4 / v23
    val v81: Double = v4 + v23
    var v47: Double = v81
    var v77: Double = v4
    var v62: Double = v77
    val v78: Vector[Double] = Vector(v23, v23, v62, v20, v1, v77, v47)
    val v150: Vector[Vector[Double]] = Vector(v78, v78, v78, v78, v78, v78, v78)
    val v142: Vector[Double] = v150(5)
    val v163: Double = v142(0)
    v163
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0), Vector(1.0))), s1(Vector(s0(Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0))))))), s3(s0(Vector(Vector(14.0), Vector(15.0))), s1(Vector(s0(Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)))), s0(Vector(Vector(22.0), Vector(23.0))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0))))))), s3(s0(Vector(Vector(28.0), Vector(29.0))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0))), s0(Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0))), Vector(Vector(s0(Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0))))))))
    val v1: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}