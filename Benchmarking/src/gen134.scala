import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s4 (
    p0: s3,
    p1: s2
  )
  @noinline
  def f0(v0: s1, v1: s0, v2: Vector[Vector[s4]], v3: s0, v4: Double): Double = {
    val v7: Vector[Vector[Double]] = v3.p0
    val v24: Vector[Vector[Double]] = v3.p0
    var v40: s0 = v1
    v40 = v40.copy(p0 = v24)
    v40 = v40.copy(p0 = v7)
    val v38: Vector[Vector[Double]] = v40.p1
    v40 = v40.copy(p1 = v38)
    val v124: Vector[Double] = v38(0)
    val v189: Double = v124(0)
    v40 = v40.copy(p1 = v38)
    v189
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))
    val v1: s0 = s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))
    val v2: Vector[Vector[s4]] = Vector(Vector(s4(s3(s2(s1(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))))), Vector(s1(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))))))), s2(s1(Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))), Vector(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))))), Vector(s1(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0))))))))), s2(s1(Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))), s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0)))))), Vector(s1(Vector(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))), s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0)))), Vector(s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)))))))))))
    val v3: s0 = s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))
    val v4: Double = 132.0
    val start = nanoTime()
    var result: Double = 132.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}