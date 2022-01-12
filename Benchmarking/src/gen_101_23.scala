import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v5: s1 = v0.p1
    val v2: s0 = v5.p0
    var v7: s2 = v0
    val v9: Vector[s1] = v7.p0
    var v11: s1 = v5
    val v8: s1 = v9(2)
    val v29: s1 = v9(1)
    val v12: Vector[Vector[Double]] = v2.p4
    var v15: s1 = v29
    val v30: Vector[Vector[s0]] = v8.p1
    val v16: Vector[s0] = v30(1)
    val v18: s0 = v16(0)
    val v22: Vector[Vector[s0]] = v29.p1
    val v28: Vector[s0] = v30(2)
    val v24: Vector[Vector[Double]] = v18.p3
    val v35: s0 = v16(0)
    val v19: s0 = v11.p0
    val v41: s0 = v5.p0
    val v42: Vector[Vector[Double]] = v35.p2
    val v23: Vector[Vector[s0]] = v29.p1
    var v67: s0 = v19
    v11 = v15
    val v75: Vector[Vector[Double]] = v67.p2
    v67 = v67.copy(p4 = v12)
    val v34: s1 = v9(0)
    v15 = v15.copy(p1 = v23)
    val v48: s0 = s0(v42, v75, v75, v24, v12)
    val v60: Vector[Vector[Double]] = v48.p1
    var v111: Vector[Vector[s0]] = v23
    v111 = v111.updated(2, v16)
    val v32: Vector[Double] = v60(0)
    v111 = v111.updated(1, v28)
    v11 = v11.copy(p0 = v48)
    val v69: Vector[Vector[Vector[s0]]] = Vector(v30, v22, v30, v23, v111)
    v15 = v15.copy(p1 = v30)
    v15 = v15.copy(p0 = v48)
    val v114: Vector[Vector[s0]] = v69(0)
    val v103: Vector[Vector[s0]] = v5.p1
    v11 = v11.copy(p1 = v103)
    v111 = v111.updated(2, v28)
    v11 = v11.copy(p1 = v30)
    val v93: Vector[Vector[s0]] = v34.p1
    val v149: Double = v32(0)
    v11 = v11.copy(p1 = v22)
    v15 = v15.copy(p1 = v93)
    v67 = v41
    v15 = v15.copy(p1 = v114)
    v149
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0))), Vector(Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))))), s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))))), s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0)), Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0)), Vector(Vector(109.0)))), Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))))), s1(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0))), Vector(Vector(s0(Vector(Vector(130.0), Vector(131.0)), Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0)), Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0)))), Vector(s0(Vector(Vector(140.0), Vector(141.0)), Vector(Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0)), Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0)))), Vector(s0(Vector(Vector(150.0), Vector(151.0)), Vector(Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)), Vector(Vector(156.0), Vector(157.0), Vector(158.0)), Vector(Vector(159.0)))))))
    val v1: Double = 160.0
    val start = nanoTime()
    var result: Double = 160.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}