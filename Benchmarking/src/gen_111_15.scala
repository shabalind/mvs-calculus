import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  def f87(v0: Double): Double = {
    val v4: Double = v0 + v0
    var v1: Double = v4
    val v3: Vector[Double] = Vector(v4, v4, v0, v4, v1)
    val v2: Double = v3(2)
    val v6: Double = v3(0)
    var v10: Double = v6
    var v11: Vector[Double] = v3
    v11 = v11.updated(4, v10)
    v11 = v11.updated(0, v1)
    v11 = v11.updated(2, v2)
    v1 = v4
    val v28: Double = v11(4)
    v28
  }
  @noinline
  def f0(v0: s0, v1: s1, v2: s0, v3: Vector[s0], v4: Double): Double = {
    var v22: Double = v4
    var v32: Double = v4
    val v73: Double = f87(v32)
    val v51: Double = v73 - v32
    v32 = v22
    v51
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))
    val v1: s1 = s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))
    val v2: s0 = s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))
    val v3: Vector[s0] = Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))
    val v4: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}