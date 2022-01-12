import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0]
  )
  case class s3 (
    p0: Vector[s1]
  )
  case class s5 (
    p0: Vector[s1],
    p1: s0
  )
  case class s6 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s9 (
    p0: s5,
    p1: Vector[s6]
  )
  case class s12 (
    p0: s5,
    p1: Vector[s3]
  )
  def f112(v0: Double): Double = {
    var v2: Double = v0
    var v4: Double = v0
    val v7: Double = v2 + v2
    var v8: Double = v7
    var v1: Double = v4
    var v3: Double = v4
    val v10: Double = v2 + v1
    var v9: Double = v3
    var v15: Double = v7
    var v17: Double = v0
    var v13: Double = v17
    val v14: Double = v9 * v0
    var v18: Double = v4
    var v20: Double = v18
    val v24: Vector[Double] = Vector(v9, v1, v13, v4, v14)
    var v42: Vector[Double] = v24
    var v26: Vector[Double] = v24
    v42 = v42.updated(3, v1)
    v42 = v42.updated(1, v10)
    var v33: Double = v8
    v26 = v26.updated(0, v17)
    v42 = v42.updated(0, v2)
    v8 = v15
    v42 = v42.updated(3, v9)
    val v44: Vector[Vector[Double]] = Vector(v42, v24, v42, v26)
    val v139: Vector[Double] = v44(0)
    v42 = v42.updated(3, v14)
    var v48: Vector[Vector[Double]] = v44
    var v67: Vector[Vector[Double]] = v48
    var v87: Vector[Vector[Double]] = v67
    val v45: Vector[Double] = v87(1)
    v26 = v26.updated(4, v20)
    var v62: Vector[Double] = v139
    v42 = v42.updated(0, v0)
    val v76: Vector[Vector[Double]] = Vector(v45, v62)
    val v147: Vector[Double] = v76(0)
    val v137: Double = v147(0)
    v42 = v42.updated(1, v33)
    v137
  }
  def f20(v0: Double): Double = {
    val v7: Double = f112(v0)
    var v3: Double = v7
    val v5: Double = v3 - v7
    var v1: Double = v5
    val v10: Double = f112(v0)
    val v6: Double = f112(v5)
    val v2: Double = f112(v10)
    var v11: Double = v6
    var v9: Double = v2
    var v8: Double = v6
    val v16: Vector[Double] = Vector(v0, v11, v7)
    val v12: Double = f112(v2)
    val v26: Double = f112(v9)
    val v20: Double = v16(1)
    var v21: Vector[Double] = v16
    var v17: Double = v5
    val v19: Double = v21(0)
    v21 = v21.updated(1, v8)
    v21 = v21.updated(1, v17)
    val v51: Double = v19 / v3
    v21 = v21.updated(1, v26)
    v21 = v21.updated(0, v1)
    val v35: Double = f112(v12)
    v21 = v21.updated(2, v20)
    v9 = v35
    v51
  }
  @noinline
  def f0(v0: Vector[s9], v1: Vector[Vector[s12]], v2: Double): Double = {
    val v7: Double = f112(v2)
    val v6: Double = f112(v7)
    val v18: Double = f20(v7)
    val v20: Vector[Double] = Vector(v18)
    val v42: Double = v20(0)
    val v115: Double = v6 - v42
    val v189: Double = f112(v115)
    v189
  }
  def benchmark(): Unit = {
    val v0: Vector[s9] = Vector(s9(s5(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s6(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))), s6(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))))), s6(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), Vector(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)))))))), s9(s5(Vector(s1(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0))))), s1(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))))), s1(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0)))))), s0(Vector(Vector(50.0)), Vector(Vector(51.0)))), Vector(s6(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), Vector(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0)))))), s6(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), Vector(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0)))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0)))))), s6(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0))), s0(Vector(Vector(70.0)), Vector(Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0)))))))), s9(s5(Vector(s1(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0))))), s1(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0))))), s1(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0))), s0(Vector(Vector(86.0)), Vector(Vector(87.0)))))), s0(Vector(Vector(88.0)), Vector(Vector(89.0)))), Vector(s6(Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0)))), Vector(Vector(s0(Vector(Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0)))))), s6(Vector(s0(Vector(Vector(98.0)), Vector(Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0)))), Vector(Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0)))), Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0)))))), s6(Vector(s0(Vector(Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0)))), Vector(Vector(s0(Vector(Vector(110.0)), Vector(Vector(111.0)))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0)))))))))
    val v1: Vector[Vector[s12]] = Vector(Vector(s12(s5(Vector(s1(Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0))))), s1(Vector(s0(Vector(Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0))))), s1(Vector(s0(Vector(Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0)))))), s0(Vector(Vector(126.0)), Vector(Vector(127.0)))), Vector(s3(Vector(s1(Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0))), s0(Vector(Vector(130.0)), Vector(Vector(131.0))))), s1(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0)), Vector(Vector(135.0))))), s1(Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0))), s0(Vector(Vector(138.0)), Vector(Vector(139.0)))))))))), Vector(s12(s5(Vector(s1(Vector(s0(Vector(Vector(140.0)), Vector(Vector(141.0))), s0(Vector(Vector(142.0)), Vector(Vector(143.0))))), s1(Vector(s0(Vector(Vector(144.0)), Vector(Vector(145.0))), s0(Vector(Vector(146.0)), Vector(Vector(147.0))))), s1(Vector(s0(Vector(Vector(148.0)), Vector(Vector(149.0))), s0(Vector(Vector(150.0)), Vector(Vector(151.0)))))), s0(Vector(Vector(152.0)), Vector(Vector(153.0)))), Vector(s3(Vector(s1(Vector(s0(Vector(Vector(154.0)), Vector(Vector(155.0))), s0(Vector(Vector(156.0)), Vector(Vector(157.0))))), s1(Vector(s0(Vector(Vector(158.0)), Vector(Vector(159.0))), s0(Vector(Vector(160.0)), Vector(Vector(161.0))))), s1(Vector(s0(Vector(Vector(162.0)), Vector(Vector(163.0))), s0(Vector(Vector(164.0)), Vector(Vector(165.0)))))))))))
    val v2: Double = 166.0
    val start = nanoTime()
    var result: Double = 166.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}