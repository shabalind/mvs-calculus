import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s0]]
  )
  def f29(v0: Vector[s1]): Vector[s1] = {
    v0
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(1)
    val v3: Vector[Vector[s1]] = v7.p0
    val v2: Vector[s1] = v3(2)
    val v4: Vector[s1] = f29(v2)
    val v31: s1 = v4(0)
    val v73: Vector[s0] = v31.p0
    val v48: s0 = v73(2)
    val v44: Vector[Double] = v48.p1
    val v39: Double = v44(0)
    v39
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(1.0)), s0(Vector(Vector(2.0)), Vector(3.0)), s0(Vector(Vector(4.0)), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(7.0)))), Vector(s1(Vector(s0(Vector(Vector(8.0)), Vector(9.0)), s0(Vector(Vector(10.0)), Vector(11.0)), s0(Vector(Vector(12.0)), Vector(13.0))), s0(Vector(Vector(14.0)), Vector(15.0)))), Vector(s1(Vector(s0(Vector(Vector(16.0)), Vector(17.0)), s0(Vector(Vector(18.0)), Vector(19.0)), s0(Vector(Vector(20.0)), Vector(21.0))), s0(Vector(Vector(22.0)), Vector(23.0))))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(25.0))))), s2(Vector(Vector(s1(Vector(s0(Vector(Vector(26.0)), Vector(27.0)), s0(Vector(Vector(28.0)), Vector(29.0)), s0(Vector(Vector(30.0)), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(33.0)))), Vector(s1(Vector(s0(Vector(Vector(34.0)), Vector(35.0)), s0(Vector(Vector(36.0)), Vector(37.0)), s0(Vector(Vector(38.0)), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(41.0)))), Vector(s1(Vector(s0(Vector(Vector(42.0)), Vector(43.0)), s0(Vector(Vector(44.0)), Vector(45.0)), s0(Vector(Vector(46.0)), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(49.0))))), Vector(Vector(s0(Vector(Vector(50.0)), Vector(51.0))))))
    val v1: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}