import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s5 (
    p0: s4,
    p1: s1
  )
  def f57(v0: Double): Double = {
    val v6: Vector[Double] = Vector(v0, v0, v0, v0, v0, v0)
    var v1: Vector[Double] = v6
    val v9: Double = v6(4)
    v1 = v1.updated(4, v9)
    val v4: Double = v1(5)
    var v2: Double = v4
    v1 = v1.updated(3, v2)
    var v3: Double = v0
    v1 = v1.updated(4, v3)
    var v13: Vector[Double] = v6
    v13 = v13.updated(2, v2)
    var v5: Vector[Double] = v13
    v5 = v5.updated(5, v4)
    val v11: Double = v6(1)
    val v7: Double = v6(3)
    val v16: Double = v6(5)
    var v25: Double = v9
    var v23: Vector[Double] = v6
    v1 = v1.updated(5, v25)
    v23 = v23.updated(5, v7)
    var v21: Double = v16
    var v27: Vector[Double] = v1
    var v17: Vector[Double] = v5
    val v19: Double = v13(0)
    v5 = v5.updated(1, v3)
    var v37: Vector[Double] = v27
    val v22: Double = v37(4)
    val v46: Double = v17(4)
    val v50: Double = v6(5)
    var v43: Double = v50
    v13 = v13.updated(4, v22)
    var v26: Double = v21
    var v24: Vector[Double] = v23
    var v29: Vector[Double] = v5
    val v52: Double = v13(2)
    v5 = v5.updated(2, v43)
    val v70: Double = v24(3)
    var v41: Double = v21
    var v55: Double = v22
    v24 = v27
    var v61: Double = v55
    v37 = v37.updated(1, v21)
    val v33: Double = v29(1)
    var v59: Vector[Double] = v29
    var v42: Vector[Double] = v1
    v42 = v42.updated(3, v0)
    v37 = v37.updated(2, v4)
    val v32: Vector[Vector[Double]] = Vector(v42, v17, v27)
    var v77: Vector[Vector[Double]] = v32
    v5 = v5.updated(4, v21)
    val v68: Vector[Vector[Vector[Double]]] = Vector(v77, v32, v77, v77, v77, v32)
    v23 = v23.updated(1, v16)
    val v80: Vector[Double] = v77(1)
    v13 = v13.updated(3, v11)
    var v86: Vector[Double] = v42
    val v89: Vector[Vector[Double]] = v68(0)
    v77 = v89
    v29 = v29.updated(2, v3)
    v29 = v29.updated(0, v26)
    v5 = v5.updated(0, v0)
    v24 = v24.updated(4, v61)
    v5 = v5.updated(4, v19)
    v17 = v17.updated(5, v50)
    val v62: Double = v80(3)
    var v157: Vector[Double] = v86
    v27 = v27.updated(1, v46)
    v17 = v17.updated(5, v50)
    v23 = v59
    v42 = v42.updated(3, v70)
    val v159: Vector[Double] = Vector(v41, v50)
    val v91: Double = v159(0)
    v157 = v42
    var v174: Vector[Double] = v159
    val v127: Double = v52 * v33
    v174 = v174.updated(0, v11)
    v23 = v23.updated(0, v91)
    v17 = v17.updated(4, v127)
    v1 = v1.updated(3, v46)
    val v253: Double = v174(1)
    v13 = v13.updated(1, v21)
    v13 = v13.updated(5, v253)
    v77 = v77.updated(0, v157)
    v62
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    val v8: Double = f57(v1)
    val v64: Double = f57(v1)
    val v59: Double = v8 - v64
    v59
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s4(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))))), s1(Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), s1(Vector(Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))))))), s1(Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))))), Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))), s0(Vector(Vector(138.0), Vector(139.0), Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0))), s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), Vector(Vector(147.0), Vector(148.0), Vector(149.0)))))))
    val v1: Double = 150.0
    val start = nanoTime()
    var result: Double = 150.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}