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
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    var v2: s3 = v0
    var v5: Double = v1
    var v3: s3 = v2
    val v7: Double = v1 - v5
    var v11: Double = v5
    val v6: s0 = v3.p0
    var v21: Double = v11
    val v25: Vector[Vector[Double]] = v6.p1
    val v16: Vector[Double] = v25(1)
    val v81: Double = v7 - v5
    var v62: Vector[Double] = v16
    v11 = v5
    val v44: Double = v16(0)
    v5 = v7
    v62 = v62.updated(0, v21)
    val v99: Double = v44 - v81
    v62 = v62.updated(0, v11)
    var v114: Double = v99
    val v170: Double = v62(0)
    val v187: Double = v170 * v114
    v187
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(Vector(s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))), Vector(s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))))))
    val v1: Double = 28.0
    val start = nanoTime()
    var result: Double = 28.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}