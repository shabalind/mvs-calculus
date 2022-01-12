import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Double,
    p1: Vector[s1]
  )
  case class s9 (
    p0: Vector[Vector[s6]],
    p1: Vector[s0]
  )
  case class s11 (
    p0: s0,
    p1: s9
  )
  @noinline
  def f0(v0: Vector[s11], v1: Double): Double = {
    var v7: Vector[s11] = v0
    val v6: s11 = v7(0)
    var v8: s11 = v6
    val v10: s9 = v8.p1
    v7 = v7.updated(0, v6)
    var v9: Vector[s11] = v0
    var v2: s9 = v10
    val v12: s0 = v6.p0
    val v21: s11 = v0(0)
    val v11: s0 = v6.p0
    v7 = v7.updated(1, v21)
    val v16: Vector[Vector[Double]] = v12.p1
    var v33: Vector[s11] = v0
    var v19: Vector[s11] = v33
    var v25: Vector[s11] = v0
    val v27: Vector[Vector[s6]] = v10.p0
    v2 = v2.copy(p0 = v27)
    val v20: Vector[Double] = v16(1)
    val v38: s11 = v33(1)
    var v51: s0 = v12
    val v48: s11 = s11(v11, v10)
    val v26: s9 = v6.p1
    var v36: s11 = v48
    v2 = v2.copy(p0 = v27)
    v36 = v36.copy(p1 = v10)
    v36 = v36.copy(p0 = v12)
    val v39: s11 = v19(1)
    val v30: Vector[Vector[Double]] = v51.p1
    v8 = v8.copy(p1 = v26)
    v8 = v8.copy(p1 = v10)
    val v43: s9 = v48.p1
    var v32: s0 = v51
    v7 = v7.updated(1, v36)
    val v42: Vector[Vector[Double]] = v51.p0
    v7 = v7.updated(0, v38)
    val v65: Vector[s0] = v26.p1
    val v35: s9 = s9(v27, v65)
    var v34: s0 = v32
    var v61: s11 = v48
    v34 = v34.copy(p0 = v42)
    v34 = v34.copy(p1 = v30)
    v2 = v2.copy(p0 = v27)
    val v28: Vector[Vector[s6]] = v43.p0
    val v58: s0 = v6.p0
    v2 = v2.copy(p1 = v65)
    val v81: s11 = v33(0)
    var v40: Vector[Vector[Double]] = v30
    var v73: s11 = v81
    var v70: s0 = v51
    v36 = v36.copy(p0 = v70)
    val v63: s0 = v65(1)
    var v80: Vector[Vector[Double]] = v40
    val v93: s11 = v33(0)
    v36 = v36.copy(p1 = v2)
    val v31: Vector[s6] = v28(2)
    v25 = v9
    v61 = v61.copy(p1 = v35)
    val v74: Vector[Vector[Double]] = v34.p1
    val v52: s0 = v73.p0
    val v62: Vector[Vector[Double]] = v58.p1
    v34 = v34.copy(p1 = v80)
    val v90: Vector[s0] = Vector(v63, v70, v12, v34, v52)
    var v69: Vector[s0] = v65
    val v86: s6 = v31(0)
    v40 = v40.updated(0, v20)
    val v99: s0 = v39.p0
    v51 = v51.copy(p0 = v42)
    v32 = v32.copy(p1 = v74)
    v9 = v9.updated(0, v61)
    v19 = v19.updated(1, v93)
    val v123: s0 = v90(1)
    var v68: Vector[s0] = v69
    v36 = v36.copy(p0 = v99)
    v8 = v8.copy(p0 = v51)
    v51 = v51.copy(p1 = v74)
    v70 = v70.copy(p1 = v30)
    val v180: s11 = v25(0)
    v8 = v8.copy(p0 = v123)
    v2 = v2.copy(p1 = v68)
    val v157: Double = v86.p0
    v7 = v7.updated(1, v180)
    v80 = v62
    v157
  }
  def benchmark(): Unit = {
    val v0: Vector[s11] = Vector(s11(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s9(Vector(Vector(s6(5.0, Vector(s1(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0))), Vector(s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))))))), Vector(s6(26.0, Vector(s1(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0))), s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0)))))))), Vector(s6(47.0, Vector(s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0))), Vector(s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0))), s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))))))))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0), Vector(72.0))), s0(Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))))), s11(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0))), s9(Vector(Vector(s6(83.0, Vector(s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0))), Vector(s0(Vector(Vector(89.0), Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0))), s0(Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0))), s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)))))))), Vector(s6(104.0, Vector(s1(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))))))), Vector(s6(125.0, Vector(s1(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0))), Vector(s0(Vector(Vector(131.0), Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0))), s0(Vector(Vector(141.0), Vector(142.0), Vector(143.0)), Vector(Vector(144.0), Vector(145.0))))))))), Vector(s0(Vector(Vector(146.0), Vector(147.0), Vector(148.0)), Vector(Vector(149.0), Vector(150.0))), s0(Vector(Vector(151.0), Vector(152.0), Vector(153.0)), Vector(Vector(154.0), Vector(155.0)))))))
    val v1: Double = 156.0
    val start = nanoTime()
    var result: Double = 156.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}