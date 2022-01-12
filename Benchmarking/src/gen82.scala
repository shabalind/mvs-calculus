import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s0,
    p2: s1
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s2]
  )
  case class s5 (
    p0: s1,
    p1: Vector[Vector[s3]]
  )
  def f89(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p1
    val v2: s0 = v6(2)
    val v4: Vector[Vector[Double]] = v2.p0
    var v7: s1 = v0
    var v5: Vector[Vector[Double]] = v4
    v5 = v4
    var v3: s0 = v2
    var v9: s0 = v3
    val v8: Vector[Vector[Double]] = v9.p0
    var v15: Vector[s0] = v6
    v7 = v0
    val v28: Vector[s0] = v7.p1
    val v12: s0 = v15(2)
    var v18: s1 = v0
    val v13: Vector[Double] = v5(1)
    v5 = v5.updated(0, v13)
    var v10: Vector[Double] = v13
    var v21: s1 = v0
    v18 = v18.copy(p1 = v6)
    v9 = v9.copy(p0 = v5)
    var v27: Vector[Vector[Double]] = v5
    v5 = v5.updated(0, v10)
    v27 = v27.updated(1, v13)
    val v23: Vector[s0] = v21.p0
    v5 = v5.updated(1, v13)
    val v22: Vector[Vector[Double]] = v2.p0
    val v26: Vector[Vector[Double]] = v12.p0
    v3 = v3.copy(p0 = v4)
    v15 = v28
    v3 = v3.copy(p0 = v8)
    val v33: Vector[Double] = v26(2)
    var v56: Vector[s0] = v23
    val v25: Vector[s0] = v18.p0
    v27 = v27.updated(2, v33)
    val v52: Vector[Vector[Vector[Double]]] = Vector(v26, v26, v4, v4, v27, v22, v27)
    val v49: Vector[s0] = v21.p1
    val v39: Vector[Vector[Double]] = v52(4)
    val v65: s0 = v25(0)
    v21 = v21.copy(p0 = v56)
    v56 = v56.updated(0, v9)
    val v50: s1 = s1(v56, v15)
    var v44: Vector[Vector[Double]] = v39
    v18 = v18.copy(p1 = v15)
    val v75: Vector[Vector[Double]] = v3.p1
    v56 = v56.updated(0, v65)
    v18 = v50
    v7 = v7.copy(p1 = v49)
    val v55: Vector[Double] = v75(0)
    var v163: Vector[s0] = v23
    v27 = v27.updated(2, v55)
    v21 = v21.copy(p0 = v23)
    v21 = v21.copy(p0 = v163)
    var v121: s1 = v50
    v3 = v3.copy(p0 = v44)
    v121
  }
  @noinline
  def f0(v0: s5, v1: s2, v2: Double): Double = {
    val v6: s1 = v0.p0
    val v13: s1 = f89(v6)
    var v23: s2 = v1
    val v10: s0 = v23.p0
    val v18: Vector[Vector[Double]] = v10.p1
    val v25: Vector[Double] = v18(0)
    val v36: Double = v25(0)
    val v24: Double = v25(0)
    val v22: Vector[s1] = Vector(v6)
    v23 = v23.copy(p1 = v10)
    val v83: s1 = v22(0)
    v23 = v23.copy(p2 = v83)
    v23 = v23.copy(p2 = v83)
    v23 = v23.copy(p2 = v13)
    val v283: Double = v36 + v24
    v283
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), Vector(Vector(s3(Vector(Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))))), Vector(s1(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))), Vector(s2(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s1(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))))), Vector(s3(Vector(Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))))), Vector(s1(Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))), Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))))), Vector(s2(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s1(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0)))))))))))
    val v1: s2 = s2(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))), s1(Vector(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0))), s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), Vector(Vector(151.0))))))
    val v2: Double = 152.0
    val start = nanoTime()
    var result: Double = 152.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}