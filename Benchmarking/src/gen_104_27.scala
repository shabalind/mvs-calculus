import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s5 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s7 (
    p0: Vector[s1],
    p1: s5
  )
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v2: Vector[s1] = v0.p0
    val v6: s1 = v2(0)
    val v8: Vector[Vector[s0]] = v6.p0
    val v11: Vector[s0] = v8(0)
    val v12: s0 = v11(0)
    val v14: Vector[Vector[Double]] = v12.p0
    val v59: Vector[Double] = v14(0)
    var v53: Vector[Double] = v59
    val v62: Double = v53(0)
    val v67: Double = v1 - v62
    val v56: Double = v67 + v67
    v56
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), s5(Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))), s1(Vector(Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))), s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))))
    val v1: Double = 55.0
    val start = nanoTime()
    var result: Double = 55.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}