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
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s2, v1: s1, v2: s1, v3: Double): Double = {
    var v5: Double = v3
    val v9: s0 = v2.p0
    val v4: Vector[Vector[Double]] = v9.p1
    val v10: Vector[Double] = v4(0)
    var v31: Vector[Double] = v10
    v31 = v10
    v31 = v31.updated(0, v3)
    v31 = v31.updated(0, v5)
    val v40: Double = v31(0)
    var v78: Double = v40
    val v200: Double = v40 * v78
    v200
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))))
    val v1: s1 = s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)), Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))))
    val v2: s1 = s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))))
    val v3: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}