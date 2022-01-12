import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: Vector[Double],
    p1: Vector[s2]
  )
  def f78(v0: s4): s4 = {
    var v1: s4 = v0
    val v5: Vector[Double] = v0.p0
    v1 = v1.copy(p0 = v5)
    val v9: Vector[s2] = v1.p1
    val v2: Vector[s4] = Vector(v1)
    val v13: s4 = v2(0)
    v1 = v1.copy(p1 = v9)
    v13
  }
  @noinline
  def f0(v0: s4, v1: Vector[s3], v2: Double): Double = {
    val v6: s4 = f78(v0)
    val v17: s4 = f78(v6)
    val v16: Vector[Double] = v17.p0
    val v25: Double = v16(2)
    val v50: Double = v16(2)
    val v60: Double = v50 * v25
    val v101: Double = v60 * v25
    var v87: Double = v101
    var v103: Double = v87
    v103
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(0.0, 1.0, 2.0), Vector(s2(s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s2(s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))
    val v1: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), s3(s1(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))
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