import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0],
    p2: s0,
    p3: s1,
    p4: s0
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s2]]
  )
  case class s5 (
    p0: Vector[s3],
    p1: s3
  )
  def f80(v0: s5): s5 = {
    val v4: s3 = v0.p1
    var v5: s5 = v0
    v5 = v5.copy(p1 = v4)
    var v16: s5 = v5
    v16
  }
  def f66(v0: Double): Double = {
    var v7: Double = v0
    v7 = v0
    var v5: Double = v7
    var v6: Double = v0
    v6 = v5
    v5 = v7
    var v4: Double = v0
    val v1: Double = v0 - v4
    var v9: Double = v6
    var v3: Double = v5
    var v15: Double = v0
    var v22: Double = v1
    var v21: Double = v3
    val v39: Vector[Double] = Vector(v7, v5, v5, v22, v3, v5, v21)
    var v20: Double = v15
    val v11: Double = v39(4)
    var v50: Vector[Double] = v39
    var v80: Vector[Double] = v50
    v50 = v50.updated(3, v20)
    val v26: Double = v80(5)
    val v31: Double = v80(4)
    v80 = v80.updated(2, v11)
    val v54: Double = v26 - v21
    var v64: Double = v54
    v80 = v80.updated(4, v11)
    var v75: Vector[Double] = v39
    v80 = v80.updated(4, v31)
    v50 = v75
    v80 = v80.updated(5, v3)
    v50 = v50.updated(1, v9)
    v80 = v80.updated(4, v3)
    v50 = v50.updated(0, v6)
    v64
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v8: s5 = v0(1)
    val v7: Vector[s3] = v8.p0
    val v18: s5 = f80(v8)
    val v12: s3 = v18.p1
    val v19: Vector[Vector[s2]] = v12.p1
    var v32: s3 = v12
    val v30: s0 = v32.p0
    v32 = v32.copy(p1 = v19)
    val v41: Double = f66(v1)
    val v51: Vector[Vector[Double]] = v30.p1
    val v33: Vector[Vector[s2]] = v32.p1
    val v29: Vector[Double] = v51(0)
    v32 = v32.copy(p0 = v30)
    val v37: s3 = v7(1)
    var v27: Vector[Double] = v29
    v32 = v32.copy(p1 = v33)
    v27 = v27.updated(0, v41)
    val v82: Vector[Vector[s2]] = v37.p1
    v32 = v32.copy(p1 = v82)
    val v167: Double = v27(0)
    v167
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s3(s0(0.0, Vector(Vector(1.0))), Vector(Vector(s2(s1(Vector(s0(2.0, Vector(Vector(3.0))), s0(4.0, Vector(Vector(5.0))), s0(6.0, Vector(Vector(7.0)))), Vector(s0(8.0, Vector(Vector(9.0))))), Vector(s0(10.0, Vector(Vector(11.0))), s0(12.0, Vector(Vector(13.0)))), s0(14.0, Vector(Vector(15.0))), s1(Vector(s0(16.0, Vector(Vector(17.0))), s0(18.0, Vector(Vector(19.0))), s0(20.0, Vector(Vector(21.0)))), Vector(s0(22.0, Vector(Vector(23.0))))), s0(24.0, Vector(Vector(25.0))))))), s3(s0(26.0, Vector(Vector(27.0))), Vector(Vector(s2(s1(Vector(s0(28.0, Vector(Vector(29.0))), s0(30.0, Vector(Vector(31.0))), s0(32.0, Vector(Vector(33.0)))), Vector(s0(34.0, Vector(Vector(35.0))))), Vector(s0(36.0, Vector(Vector(37.0))), s0(38.0, Vector(Vector(39.0)))), s0(40.0, Vector(Vector(41.0))), s1(Vector(s0(42.0, Vector(Vector(43.0))), s0(44.0, Vector(Vector(45.0))), s0(46.0, Vector(Vector(47.0)))), Vector(s0(48.0, Vector(Vector(49.0))))), s0(50.0, Vector(Vector(51.0)))))))), s3(s0(52.0, Vector(Vector(53.0))), Vector(Vector(s2(s1(Vector(s0(54.0, Vector(Vector(55.0))), s0(56.0, Vector(Vector(57.0))), s0(58.0, Vector(Vector(59.0)))), Vector(s0(60.0, Vector(Vector(61.0))))), Vector(s0(62.0, Vector(Vector(63.0))), s0(64.0, Vector(Vector(65.0)))), s0(66.0, Vector(Vector(67.0))), s1(Vector(s0(68.0, Vector(Vector(69.0))), s0(70.0, Vector(Vector(71.0))), s0(72.0, Vector(Vector(73.0)))), Vector(s0(74.0, Vector(Vector(75.0))))), s0(76.0, Vector(Vector(77.0)))))))), s5(Vector(s3(s0(78.0, Vector(Vector(79.0))), Vector(Vector(s2(s1(Vector(s0(80.0, Vector(Vector(81.0))), s0(82.0, Vector(Vector(83.0))), s0(84.0, Vector(Vector(85.0)))), Vector(s0(86.0, Vector(Vector(87.0))))), Vector(s0(88.0, Vector(Vector(89.0))), s0(90.0, Vector(Vector(91.0)))), s0(92.0, Vector(Vector(93.0))), s1(Vector(s0(94.0, Vector(Vector(95.0))), s0(96.0, Vector(Vector(97.0))), s0(98.0, Vector(Vector(99.0)))), Vector(s0(100.0, Vector(Vector(101.0))))), s0(102.0, Vector(Vector(103.0))))))), s3(s0(104.0, Vector(Vector(105.0))), Vector(Vector(s2(s1(Vector(s0(106.0, Vector(Vector(107.0))), s0(108.0, Vector(Vector(109.0))), s0(110.0, Vector(Vector(111.0)))), Vector(s0(112.0, Vector(Vector(113.0))))), Vector(s0(114.0, Vector(Vector(115.0))), s0(116.0, Vector(Vector(117.0)))), s0(118.0, Vector(Vector(119.0))), s1(Vector(s0(120.0, Vector(Vector(121.0))), s0(122.0, Vector(Vector(123.0))), s0(124.0, Vector(Vector(125.0)))), Vector(s0(126.0, Vector(Vector(127.0))))), s0(128.0, Vector(Vector(129.0)))))))), s3(s0(130.0, Vector(Vector(131.0))), Vector(Vector(s2(s1(Vector(s0(132.0, Vector(Vector(133.0))), s0(134.0, Vector(Vector(135.0))), s0(136.0, Vector(Vector(137.0)))), Vector(s0(138.0, Vector(Vector(139.0))))), Vector(s0(140.0, Vector(Vector(141.0))), s0(142.0, Vector(Vector(143.0)))), s0(144.0, Vector(Vector(145.0))), s1(Vector(s0(146.0, Vector(Vector(147.0))), s0(148.0, Vector(Vector(149.0))), s0(150.0, Vector(Vector(151.0)))), Vector(s0(152.0, Vector(Vector(153.0))))), s0(154.0, Vector(Vector(155.0)))))))))
    val v1: Double = 156.0
    val start = nanoTime()
    var result: Double = 156.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}