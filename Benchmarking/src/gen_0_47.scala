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
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s2]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s3
  )
  case class s8 (
    p0: Vector[s0],
    p1: Vector[s4]
  )
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    val v8: s8 = v0(1)
    val v15: Vector[s0] = v8.p0
    val v82: s0 = v15(0)
    var v59: s0 = v82
    val v73: Vector[Vector[Double]] = v59.p1
    v59 = v59.copy(p1 = v73)
    var v63: Vector[Vector[Double]] = v73
    val v105: Vector[Double] = v73(0)
    v63 = v63.updated(1, v105)
    val v107: Vector[Double] = v63(0)
    v63 = v63.updated(1, v105)
    var v74: Vector[Double] = v105
    v63 = v63.updated(0, v74)
    val v173: Double = v107(0)
    v173
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s4(Vector(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s3(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), Vector(s2(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))))))))), s8(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s4(Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))), Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s3(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), Vector(s2(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))), s1(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))))))))), s8(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), Vector(s4(Vector(Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))))), s3(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))), Vector(s2(Vector(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), s1(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))))))))))))
    val v1: Double = 99.0
    val start = nanoTime()
    var result: Double = 99.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}