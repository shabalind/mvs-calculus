import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s1,
    p1: s0
  )
  case class s5 (
    p0: s3,
    p1: s1
  )
  case class s10 (
    p0: Vector[s0],
    p1: Vector[Vector[s5]],
    p2: s4
  )
  @noinline
  def f0(v0: Vector[Vector[s10]], v1: Double): Double = {
    var v4: Vector[Vector[s10]] = v0
    val v2: Vector[s10] = v4(0)
    var v9: Vector[Vector[s10]] = v0
    v9 = v9.updated(1, v2)
    val v21: Vector[s10] = v0(0)
    val v30: Vector[s10] = v9(1)
    val v41: s10 = v30(0)
    val v69: Vector[s0] = v41.p0
    val v25: Vector[s10] = v0(1)
    val v35: s0 = v69(2)
    val v32: Vector[s10] = v9(0)
    v9 = v9.updated(1, v25)
    val v64: Vector[Vector[Double]] = v35.p0
    v9 = v9.updated(0, v2)
    v9 = v9.updated(0, v21)
    val v78: Vector[Double] = v64(1)
    val v111: Double = v78(0)
    v4 = v4.updated(1, v32)
    v111
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s10]] = Vector(Vector(s10(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(Vector(s5(s3(s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))), s4(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))))), Vector(s10(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(Vector(s5(s3(s1(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))))), s1(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0))))))), s4(s1(Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0))), s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0)))), s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))))))
    val v1: Double = 102.0
    val start = nanoTime()
    var result: Double = 102.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}