import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[Vector[s2]],
    p1: Vector[Double]
  )
  case class s11 (
    p0: s5,
    p1: Vector[Vector[s2]]
  )
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    val v5: s5 = v0.p0
    val v8: Vector[Double] = v5.p1
    val v10: s5 = v0.p0
    val v27: Vector[Vector[s2]] = v10.p0
    val v19: s5 = s5(v27, v8)
    val v14: Double = v8(0)
    val v15: Vector[Double] = v19.p1
    val v37: Double = v15(0)
    val v38: Double = v37 + v14
    val v93: Double = v37 + v38
    val v72: Double = v37 * v93
    v72
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(s5(Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))))))))), Vector(52.0)), Vector(Vector(s2(Vector(s0(Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))), Vector(s1(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0))), Vector(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0), Vector(72.0))))), s1(s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0))), Vector(s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0))))), s1(s0(Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0))), s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))))))
    val v1: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}