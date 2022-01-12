import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s0,
    p1: s0,
    p2: Vector[s0],
    p3: s0,
    p4: s1,
    p5: s1,
    p6: s0
  )
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s0]], v2: Vector[s0], v3: Vector[Vector[s0]], v4: s1, v5: Double): Double = {
    val v11: s0 = v0.p1
    val v8: Vector[s0] = v3(0)
    val v26: s0 = v8(0)
    val v56: Double = v11.p1
    var v35: s0 = v26
    v35 = v35.copy(p1 = v56)
    val v24: Vector[Vector[Double]] = v35.p0
    v35 = v35.copy(p0 = v24)
    v35 = v35.copy(p0 = v24)
    val v27: Vector[Double] = v24(0)
    val v46: Double = v27(0)
    v35 = v35.copy(p0 = v24)
    v46
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0)), 2.0), s0(Vector(Vector(3.0), Vector(4.0)), 5.0), Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0)), s0(Vector(Vector(9.0), Vector(10.0)), 11.0), s1(s0(Vector(Vector(12.0), Vector(13.0)), 14.0), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0)), Vector(s0(Vector(Vector(18.0), Vector(19.0)), 20.0)), Vector(s0(Vector(Vector(21.0), Vector(22.0)), 23.0)))), s1(s0(Vector(Vector(24.0), Vector(25.0)), 26.0), Vector(Vector(s0(Vector(Vector(27.0), Vector(28.0)), 29.0)), Vector(s0(Vector(Vector(30.0), Vector(31.0)), 32.0)), Vector(s0(Vector(Vector(33.0), Vector(34.0)), 35.0)))), s0(Vector(Vector(36.0), Vector(37.0)), 38.0))
    val v1: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), 41.0)), Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0)))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(45.0), Vector(46.0)), 47.0), s0(Vector(Vector(48.0), Vector(49.0)), 50.0), s0(Vector(Vector(51.0), Vector(52.0)), 53.0))
    val v3: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), 56.0)), Vector(s0(Vector(Vector(57.0), Vector(58.0)), 59.0)), Vector(s0(Vector(Vector(60.0), Vector(61.0)), 62.0)))
    val v4: s1 = s1(s0(Vector(Vector(63.0), Vector(64.0)), 65.0), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), 68.0)), Vector(s0(Vector(Vector(69.0), Vector(70.0)), 71.0)), Vector(s0(Vector(Vector(72.0), Vector(73.0)), 74.0))))
    val v5: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}