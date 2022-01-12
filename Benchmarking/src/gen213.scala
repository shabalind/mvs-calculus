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
  case class s2 (
    p0: s1,
    p1: Vector[Double]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  case class s6 (
    p0: s1,
    p1: s3
  )
  @noinline
  def f0(v0: s0, v1: Vector[s2], v2: s6, v3: Double): Double = {
    val v4: Vector[Double] = Vector(v3)
    val v8: Double = v4(0)
    val v13: Vector[Vector[Double]] = v0.p0
    val v26: Vector[Vector[Double]] = v0.p1
    val v22: Vector[Double] = v26(1)
    val v19: Double = v22(0)
    val v59: Double = v19 - v19
    val v32: Vector[Double] = v13(0)
    val v52: Double = v59 * v3
    val v34: Double = v32(0)
    var v39: Double = v19
    val v61: Vector[Double] = Vector(v3, v34, v8, v39, v8, v52)
    val v196: Double = v61(0)
    v196
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: Vector[s2] = Vector(s2(s1(Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(12.0, 13.0, 14.0)), s2(s1(Vector(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(24.0, 25.0, 26.0)), s2(s1(Vector(Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(36.0, 37.0, 38.0)))
    val v2: s6 = s6(s1(Vector(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s3(Vector(s1(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))), s1(Vector(Vector(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), s1(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))))
    val v3: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}