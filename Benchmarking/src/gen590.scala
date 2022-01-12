import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s1,
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[s2],
    p1: s0
  )
  def f60(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    var v4: Double = v6
    var v3: Double = v6
    v3 = v6
    val v21: Double = v4 - v6
    var v7: Double = v4
    val v5: Vector[Double] = Vector(v4)
    var v17: Vector[Double] = v5
    var v16: Vector[Double] = v5
    v17 = v5
    var v10: Double = v7
    val v19: Double = v17(0)
    val v11: Vector[Vector[Double]] = Vector(v16, v5, v16, v17)
    val v18: Double = v5(0)
    v17 = v17.updated(0, v3)
    v17 = v17.updated(0, v21)
    var v45: Vector[Vector[Double]] = v11
    v17 = v17.updated(0, v7)
    v17 = v17.updated(0, v6)
    v7 = v19
    v16 = v16.updated(0, v19)
    val v41: Vector[Double] = v45(3)
    v45 = v45.updated(1, v17)
    var v24: Double = v10
    var v32: Vector[Vector[Double]] = v45
    var v28: Vector[Double] = v5
    val v38: Vector[Double] = v45(0)
    var v26: Vector[Vector[Double]] = v32
    val v39: Double = v16(0)
    v17 = v17.updated(0, v4)
    var v30: Vector[Vector[Double]] = v26
    v26 = v26.updated(2, v38)
    v16 = v16.updated(0, v4)
    val v31: Double = v18 / v1
    v17 = v28
    val v27: Double = v31 + v24
    v17 = v17.updated(0, v18)
    v6 = v24
    var v40: Vector[Double] = v41
    val v81: Vector[Double] = v30(2)
    v4 = v27
    v28 = v28.updated(0, v39)
    v32 = v32.updated(1, v40)
    val v90: Double = v81(0)
    v90
  }
  def f18(v0: Double): Double = {
    val v5: Double = f60(v0)
    var v1: Double = v0
    var v2: Double = v5
    v1 = v5
    val v3: Double = v5 + v5
    var v4: Double = v2
    val v8: Double = f60(v4)
    val v11: Vector[Double] = Vector(v2, v5, v8, v1, v4, v3)
    val v9: Double = v11(5)
    val v13: Double = f60(v9)
    var v32: Vector[Double] = v11
    v32 = v32.updated(0, v13)
    val v39: Vector[Vector[Double]] = Vector(v32, v11, v32, v32, v11, v11)
    var v33: Vector[Vector[Double]] = v39
    val v43: Vector[Double] = v39(1)
    var v38: Vector[Vector[Double]] = v33
    val v125: Vector[Double] = v38(2)
    var v57: Vector[Double] = v125
    val v124: Double = v57(1)
    v32 = v43
    v57 = v11
    val v130: Double = f60(v124)
    v130
  }
  @noinline
  def f0(v0: Vector[s5], v1: Vector[s5], v2: s1, v3: s5, v4: s4, v5: Vector[s0], v6: Vector[s0], v7: Double): Double = {
    val v12: s0 = v6(1)
    val v9: Vector[Vector[Double]] = v12.p1
    val v10: Vector[Double] = v9(1)
    val v57: Double = v10(0)
    val v134: Double = f18(v57)
    var v180: Double = v134
    v180
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(Vector(s2(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s5(Vector(s2(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))
    val v1: Vector[s5] = Vector(s5(Vector(s2(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s5(Vector(s2(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s5(Vector(s2(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))), s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))))
    val v2: s1 = s1(Vector(Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))
    val v3: s5 = s5(Vector(s2(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0))), Vector(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))), s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0))))
    val v4: s4 = s4(s1(Vector(Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))), Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))), s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)))), Vector(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0))))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0))))))
    val v5: Vector[s0] = Vector(s0(Vector(Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0))))
    val v6: Vector[s0] = Vector(s0(Vector(Vector(123.0)), Vector(Vector(124.0), Vector(125.0))), s0(Vector(Vector(126.0)), Vector(Vector(127.0), Vector(128.0))))
    val v7: Double = 129.0
    val start = nanoTime()
    var result: Double = 129.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}