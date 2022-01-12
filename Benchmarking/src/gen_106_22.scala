import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s6 (
    p0: s0,
    p1: s0
  )
  case class s8 (
    p0: Vector[s6],
    p1: Vector[Vector[s6]]
  )
  def f13(v0: Double): Double = {
    var v3: Double = v0
    var v4: Double = v0
    v3 = v4
    val v6: Vector[Double] = Vector(v0, v0, v0, v3, v3, v0, v0)
    var v7: Vector[Double] = v6
    var v2: Vector[Double] = v7
    val v38: Double = v2(5)
    v38
  }
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    var v6: Double = v1
    val v22: Double = f13(v6)
    val v28: Double = v22 - v1
    v28
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(s6(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))), Vector(Vector(s6(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s6(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))))), s8(Vector(s6(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), Vector(Vector(s6(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(s6(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))), s8(Vector(s6(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))), Vector(Vector(s6(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), Vector(s6(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))))))
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