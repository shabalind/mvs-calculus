import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v5: s1 = v0(0)
    val v10: s0 = v5.p0
    val v26: Vector[s0] = v5.p1
    val v2: s0 = v26(1)
    val v8: Vector[Double] = v2.p3
    val v9: Double = v8(1)
    val v36: Vector[Vector[Double]] = v10.p0
    val v76: Vector[Double] = v36(1)
    val v144: Double = v76(0)
    val v93: Double = v144 / v9
    v93
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0)), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(28.0, 29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(38.0, 39.0)), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(48.0, 49.0)), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(58.0, 59.0)))))
    val v1: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}