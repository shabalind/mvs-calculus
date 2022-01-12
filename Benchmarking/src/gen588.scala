import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
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
    p0: Vector[Vector[s1]],
    p1: s1
  )
  def f103(v0: s1): s1 = {
    var v7: s1 = v0
    val v4: s0 = v0.p0
    var v5: s0 = v4
    var v2: s0 = v4
    var v3: s1 = v7
    val v9: Vector[Vector[Double]] = v2.p0
    var v6: s0 = v4
    val v1: s0 = v3.p0
    val v12: Vector[Double] = v9(0)
    val v8: s0 = v3.p1
    val v16: Vector[s1] = Vector(v7, v0, v3, v7, v7, v7, v0)
    v5 = v5.copy(p0 = v9)
    val v11: s1 = v16(5)
    var v26: Vector[s1] = v16
    val v24: s0 = v7.p1
    v26 = v26.updated(0, v11)
    val v23: Vector[Double] = v9(0)
    val v17: Vector[Vector[Double]] = v8.p0
    v26 = v26.updated(5, v0)
    val v22: s1 = s1(v5, v4)
    val v29: Vector[Vector[s1]] = Vector(v26)
    val v56: s1 = v16(2)
    val v32: Vector[Vector[Double]] = v4.p0
    var v25: Vector[Vector[s1]] = v29
    val v42: s0 = v7.p0
    v6 = v6.copy(p0 = v17)
    val v34: Vector[Vector[Double]] = v4.p1
    v6 = v6.copy(p0 = v9)
    v26 = v26.updated(1, v3)
    v6 = v6.copy(p0 = v17)
    val v31: Vector[s1] = v25(0)
    var v50: s1 = v22
    var v45: s1 = v0
    var v73: Vector[Vector[Double]] = v32
    val v60: s1 = s1(v5, v6)
    v26 = v26.updated(3, v60)
    v2 = v2.copy(p0 = v9)
    v7 = v11
    val v52: Vector[s1] = v25(0)
    var v92: Vector[s1] = v31
    v26 = v26.updated(2, v0)
    val v41: s0 = v11.p0
    val v65: s0 = v50.p0
    v7 = v7.copy(p0 = v65)
    v25 = v25.updated(0, v92)
    v92 = v92.updated(2, v11)
    v5 = v5.copy(p0 = v73)
    var v113: s1 = v56
    var v140: Vector[Vector[Double]] = v34
    val v78: Vector[s1] = v29(0)
    v6 = v6.copy(p1 = v140)
    v92 = v92.updated(5, v113)
    v45 = v45.copy(p1 = v42)
    val v151: s0 = v45.p0
    v50 = v50.copy(p0 = v6)
    v73 = v73.updated(0, v23)
    v25 = v25.updated(0, v78)
    v140 = v140.updated(2, v12)
    v7 = v7.copy(p0 = v1)
    v45 = v45.copy(p0 = v4)
    v50 = v50.copy(p1 = v41)
    v3 = v3.copy(p0 = v24)
    v3 = v3.copy(p0 = v151)
    val v108: s1 = v52(4)
    v108
  }
  def f80(v0: s4): s4 = {
    var v2: s4 = v0
    val v4: Vector[Vector[s1]] = v0.p0
    val v11: s1 = v0.p1
    val v37: s1 = f103(v11)
    v2 = v0
    v2 = v2.copy(p0 = v4)
    var v133: s4 = v2
    val v121: Vector[Vector[s1]] = v133.p0
    val v210: s4 = s4(v121, v37)
    v210
  }
  def f73(v0: s4): s4 = {
    var v9: s4 = v0
    val v34: Vector[Vector[s1]] = v9.p0
    val v48: s4 = f80(v9)
    v9 = v9.copy(p0 = v34)
    v48
  }
  @noinline
  def f0(v0: s4, v1: Vector[Vector[s3]], v2: Double): Double = {
    val v16: s4 = f73(v0)
    val v17: s1 = v16.p1
    val v24: s0 = v17.p1
    val v54: Vector[Vector[Double]] = v24.p1
    val v31: Vector[Double] = v54(1)
    var v170: Vector[Double] = v31
    var v152: Vector[Double] = v170
    val v145: Double = v152(0)
    v145
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(s2(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))))), s2(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))))), Vector(s3(s2(s1(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), s1(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))), s2(s1(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0)))), Vector(s1(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))), s1(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))), s1(s0(Vector(Vector(144.0)), Vector(Vector(145.0), Vector(146.0), Vector(147.0))), s0(Vector(Vector(148.0)), Vector(Vector(149.0), Vector(150.0), Vector(151.0)))))))))
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