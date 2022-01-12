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
    p0: Vector[s0],
    p1: s1,
    p2: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s2],
    p1: s1,
    p2: s2,
    p3: s1,
    p4: s1,
    p5: Vector[s1],
    p6: Vector[s0],
    p7: s0
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: Vector[Vector[s2]]
  )
  case class s5 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s6 (
    p0: s1,
    p1: s4
  )
  case class s8 (
    p0: s5,
    p1: Vector[Vector[s5]],
    p2: s3,
    p3: s1,
    p4: Vector[s1]
  )
  def f10(v0: Double): Double = {
    val v4: Double = v0 / v0
    val v5: Double = v0 / v0
    var v1: Double = v5
    var v10: Double = v4
    var v2: Double = v4
    var v12: Double = v10
    var v11: Double = v10
    var v8: Double = v4
    var v13: Double = v12
    var v15: Double = v11
    val v21: Vector[Double] = Vector(v8, v10, v8)
    var v14: Vector[Double] = v21
    v14 = v14.updated(0, v15)
    val v27: Double = v21(0)
    var v24: Vector[Double] = v21
    var v18: Vector[Double] = v24
    var v33: Vector[Double] = v18
    v2 = v8
    val v29: Double = v24(1)
    v33 = v33.updated(1, v11)
    val v19: Double = v33(0)
    val v51: Double = v18(0)
    val v26: Double = v18(0)
    var v45: Vector[Double] = v33
    val v43: Double = v0 - v0
    v24 = v24.updated(0, v4)
    var v72: Double = v2
    var v76: Vector[Double] = v14
    v76 = v76.updated(2, v13)
    var v54: Double = v4
    var v32: Vector[Double] = v18
    val v94: Double = v45(2)
    v24 = v24.updated(1, v51)
    val v81: Double = v32(1)
    var v41: Vector[Double] = v45
    val v42: Double = v32(2)
    v76 = v76.updated(1, v27)
    v76 = v76.updated(2, v1)
    val v47: Double = v76(0)
    v12 = v43
    var v65: Vector[Double] = v41
    var v101: Vector[Double] = v14
    var v38: Double = v81
    val v60: Double = v32(2)
    var v40: Vector[Double] = v65
    val v56: Double = v45(1)
    val v109: Double = v76(2)
    v15 = v94
    v14 = v101
    var v196: Double = v19
    v12 = v109
    val v86: Double = v56 - v29
    v45 = v45.updated(2, v72)
    val v78: Double = v86 + v26
    v41 = v41.updated(0, v196)
    v41 = v41.updated(0, v42)
    v13 = v5
    v10 = v54
    val v130: Double = v40(1)
    v33 = v33.updated(2, v130)
    v11 = v29
    v32 = v18
    v101 = v101.updated(1, v60)
    v41 = v41.updated(0, v47)
    v45 = v45.updated(1, v94)
    v65 = v65.updated(2, v38)
    v78
  }
  @noinline
  def f0(v0: s8, v1: s6, v2: Double): Double = {
    var v11: Double = v2
    var v15: Double = v11
    val v53: Double = f10(v15)
    v53
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s5(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))), Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), Vector(Vector(s5(Vector(Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))))), s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), Vector(s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))), s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0))), s0(Vector(Vector(34.0)), Vector(Vector(35.0)))))), Vector(s5(Vector(Vector(s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0))), s0(Vector(Vector(38.0)), Vector(Vector(39.0))))), Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0)))))), s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0))), s0(Vector(Vector(46.0)), Vector(Vector(47.0))))))), s3(Vector(s2(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), Vector(Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0))))))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0))), s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), s2(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), s1(s0(Vector(Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), Vector(Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0)))))), s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0)))), s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0))), s0(Vector(Vector(82.0)), Vector(Vector(83.0)))), Vector(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0))), s0(Vector(Vector(86.0)), Vector(Vector(87.0))))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0)))), s0(Vector(Vector(90.0)), Vector(Vector(91.0)))), s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0))), s0(Vector(Vector(94.0)), Vector(Vector(95.0)))), Vector(s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0))), s0(Vector(Vector(98.0)), Vector(Vector(99.0)))), s1(s0(Vector(Vector(100.0)), Vector(Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0))))))
    val v1: s6 = s6(s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0))), s0(Vector(Vector(106.0)), Vector(Vector(107.0)))), s4(Vector(Vector(s2(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0))), s0(Vector(Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0)))), s1(s0(Vector(Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0)))), Vector(Vector(s0(Vector(Vector(118.0)), Vector(Vector(119.0)))))))), Vector(Vector(s2(Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0))), s0(Vector(Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0)), Vector(Vector(125.0)))), s1(s0(Vector(Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0)))), Vector(Vector(s0(Vector(Vector(130.0)), Vector(Vector(131.0))))))), Vector(s2(Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0))), s0(Vector(Vector(134.0)), Vector(Vector(135.0))), s0(Vector(Vector(136.0)), Vector(Vector(137.0)))), s1(s0(Vector(Vector(138.0)), Vector(Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0)))), Vector(Vector(s0(Vector(Vector(142.0)), Vector(Vector(143.0))))))))))
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