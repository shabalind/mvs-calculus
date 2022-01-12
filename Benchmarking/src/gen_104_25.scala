import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s1], v1: s0, v2: s1, v3: Double): Double = {
    val v6: s1 = v0(0)
    val v4: Vector[Vector[Double]] = v1.p0
    val v9: Vector[s0] = v6.p1
    val v10: s0 = v9(1)
    val v12: Vector[Vector[Double]] = v10.p0
    val v15: Vector[Double] = v12(1)
    val v78: Vector[Double] = v4(1)
    val v47: Double = v15(0)
    val v23: Double = v78(0)
    val v53: Double = v78(0)
    var v91: Double = v23
    val v75: Vector[Double] = Vector(v23, v23, v47, v53, v23, v47, v91)
    var v96: Vector[Double] = v75
    val v296: Double = v96(0)
    v296
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0))), Vector(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0))))), s1(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))))
    val v1: s0 = s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0)))
    val v2: s1 = s1(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))))
    val v3: Double = 90.0
    val start = nanoTime()
    var result: Double = 90.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}