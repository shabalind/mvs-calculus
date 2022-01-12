import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v6: Double = v1
    val v9: s1 = v0(2)
    val v4: Vector[s0] = v9.p1
    val v58: s0 = v4(1)
    val v21: Vector[Vector[Double]] = v58.p0
    val v47: Vector[Double] = v21(0)
    val v25: Double = v6 + v6
    val v55: Double = v47(0)
    var v26: Vector[Double] = v47
    v26 = v26.updated(0, v25)
    v26 = v26.updated(0, v55)
    v26 = v47
    val v102: Double = v26(0)
    v102
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s1(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s1(Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)), Vector(Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)), Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))))
    val v1: Double = 54.0
    val start = nanoTime()
    var result: Double = 54.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}