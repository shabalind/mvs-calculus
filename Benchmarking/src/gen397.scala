import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: Vector[s0]
  )
  case class s5 (
    p0: s3,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s5, v2: Double): Double = {
    var v8: Double = v2
    val v3: s0 = v1.p1
    val v10: Vector[Vector[Double]] = v3.p0
    val v11: Vector[Double] = v10(1)
    var v4: Double = v8
    val v17: Double = v11(0)
    val v13: Vector[Double] = v10(1)
    val v14: Double = v4 * v17
    val v25: Double = v13(0)
    var v41: Double = v14
    val v62: Vector[Double] = v10(2)
    var v68: Vector[Double] = v62
    v8 = v41
    var v61: Double = v25
    v68 = v68.updated(0, v61)
    v68 = v68.updated(0, v14)
    val v77: Double = v68(0)
    v77
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))))
    val v1: s5 = s5(s3(Vector(Vector(s2(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))))), Vector(s2(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))))), Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))))
    val v2: Double = 55.0
    val start = nanoTime()
    var result: Double = 55.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}