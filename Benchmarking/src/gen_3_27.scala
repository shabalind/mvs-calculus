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
    p0: Vector[Vector[s1]],
    p1: Vector[s1]
  )
  case class s3 (
    p0: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s2]], v2: Vector[Vector[s3]], v3: Double): Double = {
    val v7: Vector[s3] = v2(0)
    val v4: Vector[s0] = v0.p0
    val v9: s0 = v4(1)
    val v10: s3 = v7(0)
    var v11: s0 = v9
    val v29: Vector[Vector[Double]] = v11.p0
    val v21: Vector[s0] = v10.p0
    val v32: Vector[Double] = v29(0)
    v11 = v11.copy(p1 = v29)
    val v24: s0 = v21(0)
    val v26: s0 = v21(0)
    v11 = v11.copy(p0 = v29)
    val v71: Vector[Vector[Double]] = v24.p1
    val v60: Vector[Vector[Double]] = v26.p0
    v11 = v11.copy(p0 = v29)
    v11 = v11.copy(p1 = v60)
    v11 = v11.copy(p0 = v71)
    val v52: Double = v32(0)
    val v115: Double = v3 + v52
    v115
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))))
    val v1: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))))))), Vector(s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))))), Vector(s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))), s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))))), s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), Vector(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))))))))), Vector(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0))))))), Vector(s1(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))), s0(Vector(Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), Vector(Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0)))))))), Vector(s1(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), Vector(Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0)))))), s1(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0))), s0(Vector(Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0)))), Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0)))))), s1(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0)))), Vector(Vector(s0(Vector(Vector(86.0)), Vector(Vector(87.0))))))))), Vector(s2(Vector(Vector(s1(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0)))), Vector(Vector(s0(Vector(Vector(94.0)), Vector(Vector(95.0))))))), Vector(s1(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0))), s0(Vector(Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0)))), Vector(Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0)))))))), Vector(s1(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0))), s0(Vector(Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0)))), Vector(Vector(s0(Vector(Vector(110.0)), Vector(Vector(111.0)))))), s1(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0))), s0(Vector(Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0)))), Vector(Vector(s0(Vector(Vector(118.0)), Vector(Vector(119.0)))))), s1(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0))), s0(Vector(Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0)))), Vector(Vector(s0(Vector(Vector(126.0)), Vector(Vector(127.0))))))))))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0)))))))
    val v3: Double = 130.0
    val start = nanoTime()
    var result: Double = 130.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}