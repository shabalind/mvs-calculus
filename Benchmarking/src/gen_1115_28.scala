import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  case class s4 (
    p0: Vector[s3],
    p1: s3
  )
  case class s5 (
    p0: Vector[Vector[s2]]
  )
  def f68(v0: Double): Double = {
    var v3: Double = v0
    var v6: Double = v3
    val v1: Double = v3 * v6
    var v4: Double = v3
    var v2: Double = v6
    var v13: Double = v0
    var v11: Double = v2
    var v8: Double = v13
    var v9: Double = v8
    var v15: Double = v6
    var v12: Double = v9
    var v21: Double = v8
    var v18: Double = v8
    val v23: Double = v13 + v15
    var v16: Double = v21
    var v36: Double = v13
    val v22: Vector[Double] = Vector(v8, v8, v36, v16, v12, v4)
    var v31: Vector[Double] = v22
    var v35: Vector[Double] = v31
    var v51: Vector[Double] = v31
    v31 = v31.updated(2, v11)
    v51 = v51.updated(1, v23)
    var v91: Double = v18
    v51 = v51.updated(3, v1)
    var v96: Vector[Double] = v51
    val v42: Double = v96(0)
    val v48: Double = v51(4)
    var v90: Vector[Double] = v96
    val v66: Double = v51(3)
    v35 = v35.updated(0, v4)
    v31 = v31.updated(1, v6)
    v4 = v15
    v96 = v96.updated(1, v91)
    v35 = v35.updated(0, v48)
    val v70: Double = v35(3)
    var v76: Double = v66
    v51 = v51.updated(3, v76)
    v12 = v70
    v90 = v90.updated(4, v42)
    val v151: Double = v90(1)
    v151
  }
  @noinline
  def f0(v0: Vector[s5], v1: Vector[s1], v2: Vector[s4], v3: Double): Double = {
    var v5: Double = v3
    val v4: Double = f68(v5)
    val v11: Double = f68(v5)
    val v15: Double = v4 / v11
    var v20: Double = v3
    v5 = v20
    v15
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))))), s5(Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), Vector(s2(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), Vector(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))))), s1(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))))))
    val v2: Vector[s4] = Vector(s4(Vector(s3(s1(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))), Vector(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))))), s2(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))))), s3(s1(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))), Vector(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))))), s2(Vector(Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))))), s4(Vector(s3(s1(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0)))), Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))))), s2(Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))))), s3(s1(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0))), Vector(Vector(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)))), Vector(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))))), s2(Vector(Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0)))))), s4(Vector(s3(s1(s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0))), Vector(Vector(s0(Vector(Vector(126.0), Vector(127.0)), Vector(Vector(128.0)))), Vector(s0(Vector(Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))), s2(Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0))))), s0(Vector(Vector(135.0), Vector(136.0)), Vector(Vector(137.0)))))), s3(s1(s0(Vector(Vector(138.0), Vector(139.0)), Vector(Vector(140.0))), Vector(Vector(s0(Vector(Vector(141.0), Vector(142.0)), Vector(Vector(143.0)))), Vector(s0(Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0)))))), s2(Vector(Vector(s0(Vector(Vector(147.0), Vector(148.0)), Vector(Vector(149.0))))), s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0)))))))
    val v3: Double = 153.0
    val start = nanoTime()
    var result: Double = 153.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}