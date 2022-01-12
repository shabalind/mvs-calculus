import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: s2
  )
  case class s6 (
    p0: s0,
    p1: s2
  )
  case class s11 (
    p0: s2,
    p1: s2
  )
  def f21(v0: s3): s3 = {
    val v5: s2 = v0.p1
    var v6: s2 = v5
    val v4: s1 = v6.p1
    val v2: s2 = s2(v4, v4)
    val v7: Vector[Vector[s0]] = v4.p2
    v6 = v5
    v6 = v6.copy(p0 = v4)
    v6 = v6.copy(p1 = v4)
    val v9: Vector[s0] = v7(0)
    val v12: s11 = s11(v5, v2)
    v6 = v6.copy(p0 = v4)
    val v16: s0 = v9(0)
    v6 = v6.copy(p0 = v4)
    val v11: s2 = v0.p1
    v6 = v6.copy(p1 = v4)
    val v21: Vector[s0] = Vector(v16, v16, v16)
    v6 = v6.copy(p1 = v4)
    v6 = v6.copy(p1 = v4)
    var v15: s3 = v0
    val v19: s1 = v2.p1
    v15 = v15.copy(p1 = v11)
    v6 = v6.copy(p0 = v19)
    val v30: s2 = v12.p1
    val v28: s0 = v21(0)
    val v35: s1 = v30.p0
    v15 = v15.copy(p1 = v6)
    val v53: s0 = v21(2)
    v15 = v15.copy(p1 = v6)
    v6 = v6.copy(p0 = v19)
    var v41: s3 = v15
    v41 = v41.copy(p0 = v53)
    v15 = v15.copy(p1 = v11)
    val v58: s0 = v21(1)
    v6 = v6.copy(p1 = v35)
    v41 = v41.copy(p0 = v28)
    var v82: s3 = v41
    v41 = v41.copy(p0 = v58)
    v82 = v82.copy(p0 = v16)
    v82
  }
  @noinline
  def f0(v0: Vector[s6], v1: Vector[Vector[s3]], v2: Double): Double = {
    val v5: Vector[s3] = v1(2)
    val v4: s3 = v5(0)
    val v3: s3 = f21(v4)
    val v8: s0 = v3.p0
    val v14: Vector[Vector[Double]] = v8.p0
    val v20: Vector[Double] = v14(0)
    var v23: Vector[Double] = v20
    val v24: Double = v23(0)
    v24
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s2(s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s2(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))))), s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0))))), Vector(Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))))), Vector(s3(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), s2(s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))))), s1(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))), Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)))), Vector(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))))))))), Vector(s3(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))), s2(s1(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))), Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))), Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)))), Vector(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0)))))), s1(s0(Vector(Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0))), Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))))), Vector(Vector(s0(Vector(Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0))))))))))
    val v2: Double = 144.0
    val start = nanoTime()
    var result: Double = 144.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}