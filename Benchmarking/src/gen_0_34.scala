import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s1]], v2: Double): Double = {
    var v5: Double = v2
    var v8: Double = v2
    var v50: Double = v5
    val v24: Double = v5 / v50
    v8 = v5
    v5 = v50
    var v51: Double = v8
    v51 = v50
    val v121: Double = v24 / v50
    v5 = v121
    val v133: Double = v121 - v51
    v133
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))))))
    val v2: Double = 100.0
    val start = nanoTime()
    var result: Double = 100.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}