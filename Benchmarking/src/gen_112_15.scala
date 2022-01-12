import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Vector[s4], v2: s4, v3: Double): Double = {
    val v4: Vector[s0] = v2.p1
    val v12: s0 = v4(1)
    val v15: Vector[Vector[Double]] = v12.p1
    val v17: Vector[Double] = v15(0)
    val v36: Double = v17(0)
    var v29: Double = v3
    val v60: Double = v29 - v3
    val v51: Vector[Double] = Vector(v36, v3, v60, v3)
    var v215: Vector[Double] = v51
    val v149: Double = v215(1)
    v149
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))
    val v1: Vector[s4] = Vector(s4(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), s4(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))))
    val v2: s4 = s4(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))))
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