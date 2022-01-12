import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s3
  )
  case class s5 (
    p0: Vector[s3]
  )
  case class s6 (
    p0: Vector[s4],
    p1: s5
  )
  def f25(v0: Vector[s0]): Vector[s0] = {
    var v20: Vector[s0] = v0
    val v30: s0 = v20(0)
    var v72: Vector[s0] = v20
    v72 = v72.updated(1, v30)
    var v188: Vector[s0] = v72
    v188
  }
  def f19(v0: s0): s0 = {
    val v5: Double = v0.p1
    val v2: Vector[Vector[Double]] = v0.p0
    var v11: s0 = v0
    val v14: Vector[Vector[Double]] = v11.p0
    v11 = v11.copy(p0 = v14)
    v11 = v11.copy(p0 = v2)
    val v92: s0 = s0(v14, v5)
    v92
  }
  def f12(v0: s0): s0 = {
    val v4: Vector[s0] = Vector(v0, v0)
    val v1: Double = v0.p1
    val v2: Double = v1 / v1
    val v6: s0 = v4(0)
    val v3: Double = v6.p1
    val v7: Double = v1 + v2
    val v8: s0 = v4(1)
    var v9: Vector[s0] = v4
    val v10: Vector[Vector[Double]] = v8.p0
    val v13: Vector[Vector[Double]] = v6.p0
    val v11: Vector[Double] = v10(1)
    val v14: Vector[s0] = f25(v9)
    var v5: Vector[Double] = v11
    v9 = v14
    var v19: s0 = v8
    v19 = v19.copy(p0 = v13)
    val v49: Double = v6.p1
    val v29: Double = v5(0)
    val v31: Vector[Double] = v13(0)
    v19 = v19.copy(p1 = v29)
    v19 = v19.copy(p1 = v49)
    var v16: s0 = v0
    v9 = v9.updated(1, v16)
    val v50: s0 = f19(v0)
    v9 = v9.updated(1, v50)
    v16 = v16.copy(p0 = v13)
    val v23: Vector[Vector[Double]] = v8.p0
    var v33: Vector[Double] = v31
    v19 = v19.copy(p1 = v7)
    v33 = v33.updated(0, v3)
    val v27: Double = v5(0)
    val v35: Vector[Double] = v10(0)
    var v43: Vector[s0] = v4
    val v39: Vector[Vector[Double]] = Vector(v11, v11, v33, v33, v33, v5)
    var v48: Vector[Vector[Double]] = v13
    val v46: s0 = s0(v48, v1)
    var v26: Vector[Vector[Double]] = v23
    val v51: Vector[Double] = v39(1)
    val v80: s0 = s0(v48, v27)
    val v65: s0 = f19(v80)
    val v85: Double = v6.p1
    val v56: s0 = f19(v19)
    val v41: Vector[Vector[Double]] = v65.p0
    v16 = v16.copy(p1 = v29)
    val v58: s0 = v9(1)
    var v73: Vector[s0] = v43
    v16 = v16.copy(p0 = v10)
    val v70: s0 = v4(0)
    v73 = v73.updated(1, v58)
    v5 = v5.updated(0, v2)
    v33 = v33.updated(0, v85)
    v9 = v9.updated(0, v46)
    val v97: Double = v70.p1
    v16 = v16.copy(p0 = v26)
    val v83: s0 = f19(v80)
    v43 = v43.updated(0, v83)
    val v118: Vector[Vector[Double]] = v56.p0
    v16 = v16.copy(p1 = v97)
    v73 = v73.updated(0, v65)
    v48 = v48.updated(0, v51)
    val v145: Double = v35(0)
    v16 = v16.copy(p0 = v41)
    val v91: s0 = f19(v70)
    v33 = v33.updated(0, v145)
    v19 = v91
    val v194: s0 = v73(1)
    v16 = v16.copy(p0 = v118)
    v194
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Vector[s6], v2: Vector[s0], v3: s4, v4: Double): Double = {
    val v7: s6 = v1(0)
    val v13: s5 = v7.p1
    val v24: Vector[s3] = v13.p0
    val v32: s3 = v24(0)
    val v40: s0 = v32.p1
    val v49: s0 = f12(v40)
    val v58: s0 = f12(v49)
    val v77: Double = v58.p1
    v77
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), 3.0)), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), 7.0))), Vector(Vector(s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), 11.0), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), 15.0)))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), 19.0)), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), 23.0))), Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), 27.0), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), 31.0)))))))), Vector(s2(Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), 35.0)), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), 39.0))), Vector(Vector(s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), 43.0), Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), 47.0)))))))))
    val v1: Vector[s6] = Vector(s6(Vector(s4(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), 51.0))), s3(s2(Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), 55.0)), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), 59.0))), Vector(Vector(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), 63.0), Vector(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), 67.0))))))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), 71.0))), s4(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), 75.0))), s3(s2(Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), 79.0)), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), 83.0))), Vector(Vector(s1(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), 87.0), Vector(Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), 91.0))))))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), 95.0))), s4(Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), 99.0))), s3(s2(Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), 103.0)), Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), 107.0))), Vector(Vector(s1(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), 111.0), Vector(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), 115.0))))))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), 119.0)))), s5(Vector(s3(s2(Vector(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), 123.0)), Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), 127.0))), Vector(Vector(s1(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), 131.0), Vector(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), 135.0))))))), s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), 139.0))))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), 143.0))
    val v3: s4 = s4(Vector(Vector(s0(Vector(Vector(144.0), Vector(145.0), Vector(146.0)), 147.0))), s3(s2(Vector(Vector(s0(Vector(Vector(148.0), Vector(149.0), Vector(150.0)), 151.0)), Vector(s0(Vector(Vector(152.0), Vector(153.0), Vector(154.0)), 155.0))), Vector(Vector(s1(s0(Vector(Vector(156.0), Vector(157.0), Vector(158.0)), 159.0), Vector(Vector(s0(Vector(Vector(160.0), Vector(161.0), Vector(162.0)), 163.0))))))), s0(Vector(Vector(164.0), Vector(165.0), Vector(166.0)), 167.0)))
    val v4: Double = 168.0
    val start = nanoTime()
    var result: Double = 168.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}