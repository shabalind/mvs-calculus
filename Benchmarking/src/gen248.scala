import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s7 (
    p0: s3,
    p1: Vector[s3]
  )
  case class s8 (
    p0: s3,
    p1: Vector[Vector[s0]]
  )
  def f57(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    val v3: Vector[s0] = v0(0)
    var v2: Vector[Vector[s0]] = v0
    var v7: Vector[Vector[s0]] = v2
    var v20: Vector[Vector[s0]] = v2
    val v47: Vector[Vector[Vector[s0]]] = Vector(v20, v7, v2)
    var v60: Vector[s0] = v3
    v2 = v2.updated(0, v60)
    val v97: Vector[Vector[s0]] = v47(0)
    var v153: Vector[Vector[s0]] = v97
    v2 = v2.updated(0, v3)
    v153
  }
  def f25(v0: Vector[Vector[s7]]): Vector[Vector[s7]] = {
    var v6: Vector[Vector[s7]] = v0
    val v8: Vector[Vector[Vector[s7]]] = Vector(v0, v6, v0, v0)
    v6 = v0
    val v10: Vector[s7] = v6(0)
    v6 = v6.updated(0, v10)
    var v13: Vector[s7] = v10
    val v3: Vector[s7] = v0(1)
    var v11: Vector[Vector[s7]] = v6
    v11 = v11.updated(0, v3)
    v11 = v11.updated(1, v13)
    val v62: Vector[Vector[s7]] = v8(1)
    v11 = v62
    v11
  }
  def f8(v0: s3): s3 = {
    var v8: s3 = v0
    var v13: s3 = v8
    val v30: Vector[s3] = Vector(v0, v13, v8, v8, v8, v8, v8)
    val v16: Vector[s0] = v13.p0
    v8 = v8.copy(p0 = v16)
    val v88: s3 = v30(3)
    v13 = v0
    v8 = v8.copy(p0 = v16)
    v88
  }
  @noinline
  def f0(v0: s8, v1: Vector[Vector[s7]], v2: Double): Double = {
    val v7: Vector[s7] = v1(0)
    val v6: s3 = v0.p0
    val v4: Vector[Vector[s7]] = f25(v1)
    var v5: s3 = v6
    var v22: s8 = v0
    var v8: s8 = v0
    val v10: Vector[s0] = v5.p0
    v22 = v22.copy(p0 = v6)
    v8 = v22
    val v12: s3 = v8.p0
    val v18: s0 = v10(0)
    v5 = v5.copy(p0 = v10)
    var v15: s0 = v18
    val v21: Vector[s7] = v4(0)
    var v31: Vector[s7] = v7
    v8 = v8.copy(p0 = v5)
    v22 = v22.copy(p0 = v6)
    val v26: Vector[Vector[s0]] = v8.p1
    val v55: Vector[Vector[Double]] = v15.p0
    val v36: Vector[Vector[s0]] = f57(v26)
    val v116: s3 = f8(v12)
    val v45: s7 = v31(0)
    val v85: Vector[s0] = v36(0)
    v31 = v31.updated(0, v45)
    val v54: s3 = v45.p0
    val v51: Vector[s0] = v116.p0
    v5 = v5.copy(p0 = v85)
    val v66: Vector[Vector[s0]] = f57(v26)
    val v86: s7 = v21(0)
    val v100: Vector[Double] = v55(2)
    v5 = v5.copy(p0 = v51)
    v31 = v31.updated(0, v86)
    v22 = v22.copy(p1 = v66)
    v8 = v8.copy(p0 = v54)
    val v186: Double = v100(0)
    v186
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s3(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))))))
    val v1: Vector[Vector[s7]] = Vector(Vector(s7(s3(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), Vector(s3(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))))), s3(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))))), s3(Vector(s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))))))), Vector(s7(s3(Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0))))), Vector(s3(Vector(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0)))), Vector(s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0))), s0(Vector(Vector(135.0), Vector(136.0), Vector(137.0)), Vector(Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0), Vector(144.0))))), s3(Vector(s0(Vector(Vector(145.0), Vector(146.0), Vector(147.0)), Vector(Vector(148.0), Vector(149.0)))), Vector(s0(Vector(Vector(150.0), Vector(151.0), Vector(152.0)), Vector(Vector(153.0), Vector(154.0))), s0(Vector(Vector(155.0), Vector(156.0), Vector(157.0)), Vector(Vector(158.0), Vector(159.0))), s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), Vector(Vector(163.0), Vector(164.0))))), s3(Vector(s0(Vector(Vector(165.0), Vector(166.0), Vector(167.0)), Vector(Vector(168.0), Vector(169.0)))), Vector(s0(Vector(Vector(170.0), Vector(171.0), Vector(172.0)), Vector(Vector(173.0), Vector(174.0))), s0(Vector(Vector(175.0), Vector(176.0), Vector(177.0)), Vector(Vector(178.0), Vector(179.0))), s0(Vector(Vector(180.0), Vector(181.0), Vector(182.0)), Vector(Vector(183.0), Vector(184.0)))))))))
    val v2: Double = 185.0
    val start = nanoTime()
    var result: Double = 185.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}