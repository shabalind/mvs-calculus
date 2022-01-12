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
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s2]
  )
  case class s4 (
    p0: Vector[s3],
    p1: s3
  )
  case class s5 (
    p0: s4,
    p1: Vector[Vector[s2]]
  )
  def f96(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v7
    var v8: Double = v6
    var v1: Double = v7
    var v5: Double = v6
    val v2: Vector[Double] = Vector(v6, v5)
    v8 = v1
    var v3: Double = v7
    var v11: Vector[Double] = v2
    val v13: Double = v11(1)
    v8 = v3
    v11 = v11.updated(0, v8)
    v11 = v11.updated(0, v13)
    val v16: Double = v11(1)
    v16
  }
  def f10(v0: Double): Double = {
    var v4: Double = v0
    val v6: Double = f96(v4)
    val v3: Double = f96(v4)
    val v2: Double = f96(v4)
    var v5: Double = v3
    val v9: Double = f96(v5)
    var v10: Double = v6
    var v11: Double = v0
    val v1: Double = v2 + v4
    val v13: Double = f96(v6)
    val v17: Double = f96(v0)
    val v8: Double = f96(v17)
    var v7: Double = v1
    val v15: Double = f96(v1)
    val v22: Double = f96(v11)
    var v12: Double = v6
    val v36: Double = v0 / v9
    val v25: Double = f96(v6)
    val v30: Double = v15 / v8
    var v29: Double = v12
    var v14: Double = v4
    val v20: Double = f96(v10)
    val v31: Double = f96(v13)
    var v26: Double = v29
    val v52: Double = f96(v25)
    val v50: Double = v52 * v20
    val v43: Double = v50 / v2
    val v73: Double = f96(v50)
    var v27: Double = v31
    val v46: Double = f96(v9)
    val v34: Vector[Double] = Vector(v46, v13, v7, v73, v30)
    val v59: Double = v34(4)
    var v62: Vector[Double] = v34
    v62 = v62.updated(2, v59)
    v62 = v62.updated(3, v8)
    var v49: Double = v22
    val v40: Double = f96(v49)
    v62 = v62.updated(3, v73)
    val v56: Double = f96(v40)
    val v60: Double = v62(2)
    val v71: Double = f96(v31)
    var v51: Vector[Double] = v34
    v62 = v62.updated(0, v71)
    v62 = v62.updated(1, v3)
    val v81: Double = v62(1)
    val v67: Double = v34(0)
    v62 = v62.updated(1, v14)
    val v82: Double = v51(2)
    var v111: Vector[Double] = v51
    v51 = v51.updated(2, v36)
    v51 = v51.updated(3, v31)
    var v115: Vector[Double] = v111
    val v96: Double = f96(v60)
    var v45: Vector[Double] = v115
    val v120: Double = f96(v5)
    v111 = v111.updated(2, v82)
    v45 = v34
    v45 = v45.updated(4, v14)
    val v174: Double = f96(v120)
    v45 = v45.updated(0, v50)
    val v86: Double = v45(2)
    v62 = v62.updated(2, v81)
    v62 = v62.updated(3, v27)
    v115 = v115.updated(1, v174)
    v62 = v62.updated(4, v26)
    v51 = v51.updated(0, v43)
    v45 = v45.updated(0, v96)
    v115 = v115.updated(2, v67)
    v4 = v3
    val v119: Double = f96(v86)
    v111 = v111.updated(3, v2)
    v111 = v111.updated(1, v56)
    v45 = v45.updated(4, v120)
    v119
  }
  @noinline
  def f0(v0: Vector[s5], v1: Double): Double = {
    var v7: Double = v1
    v7 = v1
    val v2: Double = v7 * v1
    val v31: Double = f96(v2)
    var v37: Double = v31
    var v66: Double = v2
    val v95: Double = v66 - v1
    val v92: Double = v95 + v7
    val v61: Double = f10(v92)
    val v154: Double = v61 * v37
    v154
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s4(Vector(s3(Vector(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))))))), s3(Vector(s2(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), Vector(Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))))), s3(Vector(s2(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(Vector(s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))))))), s3(Vector(s2(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), Vector(Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))))))), Vector(Vector(s2(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(Vector(s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))))))), s5(s4(Vector(s3(Vector(s2(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), Vector(Vector(s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))))))), s3(Vector(s2(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), Vector(Vector(s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))))), s3(Vector(s2(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), Vector(Vector(s1(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))))))), s3(Vector(s2(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(Vector(s1(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))))))), Vector(Vector(s2(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(Vector(s1(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}