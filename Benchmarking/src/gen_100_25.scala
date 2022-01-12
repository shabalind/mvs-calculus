import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Vector[Vector[s0]], v2: s1, v3: Double): Double = {
    val v8: Vector[s0] = v1(1)
    val v9: s0 = v8(0)
    val v15: Vector[Double] = Vector(v3, v3, v3, v3)
    val v13: Vector[Vector[Double]] = v9.p1
    val v40: Vector[Double] = v13(1)
    val v49: Double = v40(0)
    var v60: Vector[Double] = v40
    val v86: Double = v15(0)
    val v137: Double = v3 + v49
    val v100: Vector[Double] = Vector(v3, v86)
    v60 = v60.updated(0, v137)
    val v253: Double = v60(0)
    val v118: Double = v100(0)
    val v179: Double = v118 / v253
    v179
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))
    val v2: s1 = s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))
    val v3: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}