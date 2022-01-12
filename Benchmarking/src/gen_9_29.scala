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
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: s3,
    p1: s0
  )
  case class s5 (
    p0: Vector[s0],
    p1: s4
  )
  @noinline
  def f0(v0: Vector[Vector[s5]], v1: Double): Double = {
    val v6: Vector[s5] = v0(0)
    val v5: s5 = v6(0)
    val v7: Vector[s0] = v5.p0
    val v17: s0 = v7(2)
    var v11: s0 = v17
    val v34: Vector[Vector[Double]] = v11.p2
    val v75: Vector[Vector[Double]] = v11.p0
    val v36: Vector[Double] = v75(2)
    val v69: Double = v36(0)
    v11 = v11.copy(p2 = v34)
    var v133: Vector[Vector[Double]] = v75
    v11 = v11.copy(p0 = v133)
    v69
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s5]] = Vector(Vector(s5(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s4(s3(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))), s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))))), Vector(s5(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), s4(s3(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0))), s1(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0)))))))
    val v1: Double = 112.0
    val start = nanoTime()
    var result: Double = 112.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}