import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: Vector[s3],
    p1: s1
  )
  def f108(v0: Double): Double = {
    var v1: Double = v0
    var v2: Double = v1
    var v5: Double = v2
    var v7: Double = v0
    var v10: Double = v0
    var v8: Double = v2
    var v4: Double = v2
    var v6: Double = v4
    var v11: Double = v8
    var v12: Double = v1
    var v13: Double = v10
    var v9: Double = v1
    var v19: Double = v6
    var v18: Double = v19
    var v17: Double = v11
    var v23: Double = v7
    v18 = v0
    var v27: Double = v6
    var v28: Double = v6
    var v61: Double = v7
    v7 = v0
    var v36: Double = v61
    var v16: Double = v0
    var v53: Double = v9
    var v33: Double = v23
    var v46: Double = v27
    var v31: Double = v46
    var v39: Double = v18
    var v40: Double = v5
    var v64: Double = v0
    var v34: Double = v16
    var v50: Double = v17
    var v63: Double = v13
    var v49: Double = v64
    val v41: Double = v61 + v31
    var v48: Double = v41
    var v77: Double = v34
    v19 = v48
    v6 = v39
    v49 = v28
    var v74: Double = v53
    v46 = v31
    var v51: Double = v33
    var v174: Double = v40
    v13 = v5
    val v258: Double = v1 * v50
    val v204: Vector[Double] = Vector(v77, v51, v49, v174, v258)
    val v59: Vector[Vector[Double]] = Vector(v204, v204)
    val v88: Vector[Double] = v59(1)
    var v161: Vector[Vector[Double]] = v59
    var v120: Vector[Vector[Double]] = v161
    v6 = v36
    v120 = v120.updated(1, v88)
    v120 = v120.updated(1, v204)
    var v70: Vector[Vector[Double]] = v120
    var v97: Vector[Vector[Double]] = v161
    val v131: Vector[Double] = v97(0)
    val v114: Vector[Double] = v120(1)
    val v109: Vector[Double] = v70(1)
    v70 = v70.updated(1, v131)
    v161 = v161.updated(1, v88)
    v120 = v120.updated(0, v114)
    v97 = v97.updated(1, v109)
    var v87: Vector[Double] = v204
    v87 = v87.updated(1, v12)
    v87 = v87.updated(4, v63)
    v70 = v70.updated(1, v87)
    v87 = v87.updated(4, v74)
    val v302: Double = v109(2)
    v302
  }
  @noinline
  def f0(v0: s5, v1: s0, v2: s4, v3: Double): Double = {
    val v7: Double = f108(v3)
    val v16: Double = f108(v7)
    var v27: Double = v16
    v27
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(Vector(s3(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s1(s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), s1(s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))))), s3(Vector(s0(Vector(35.0, 36.0), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(s1(s0(Vector(50.0, 51.0), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), s0(Vector(55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s1(s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(65.0, 66.0), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))))), s3(Vector(s0(Vector(70.0, 71.0), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(75.0, 76.0), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0), Vector(84.0)))), Vector(s1(s0(Vector(85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(90.0, 91.0), Vector(Vector(92.0), Vector(93.0), Vector(94.0)))), s1(s0(Vector(95.0, 96.0), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(100.0, 101.0), Vector(Vector(102.0), Vector(103.0), Vector(104.0))))))), s1(s0(Vector(105.0, 106.0), Vector(Vector(107.0), Vector(108.0), Vector(109.0))), s0(Vector(110.0, 111.0), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))))
    val v1: s0 = s0(Vector(115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))
    val v2: s4 = s4(Vector(s1(s0(Vector(120.0, 121.0), Vector(Vector(122.0), Vector(123.0), Vector(124.0))), s0(Vector(125.0, 126.0), Vector(Vector(127.0), Vector(128.0), Vector(129.0))))), Vector(Vector(s1(s0(Vector(130.0, 131.0), Vector(Vector(132.0), Vector(133.0), Vector(134.0))), s0(Vector(135.0, 136.0), Vector(Vector(137.0), Vector(138.0), Vector(139.0))))), Vector(s1(s0(Vector(140.0, 141.0), Vector(Vector(142.0), Vector(143.0), Vector(144.0))), s0(Vector(145.0, 146.0), Vector(Vector(147.0), Vector(148.0), Vector(149.0))))), Vector(s1(s0(Vector(150.0, 151.0), Vector(Vector(152.0), Vector(153.0), Vector(154.0))), s0(Vector(155.0, 156.0), Vector(Vector(157.0), Vector(158.0), Vector(159.0)))))))
    val v3: Double = 160.0
    val start = nanoTime()
    var result: Double = 160.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}