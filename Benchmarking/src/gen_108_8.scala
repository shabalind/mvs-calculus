import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2,
    p2: s2
  )
  case class s5 (
    p0: Double,
    p1: s3
  )
  case class s6 (
    p0: s3,
    p1: s0,
    p2: Vector[s3],
    p3: Vector[s0],
    p4: Vector[s3]
  )
  case class s8 (
    p0: Vector[s0],
    p1: Double
  )
  case class s10 (
    p0: s1,
    p1: s3
  )
  case class s12 (
    p0: Vector[s8],
    p1: Vector[s6]
  )
  def f25(v0: s1): s1 = {
    var v7: s1 = v0
    val v5: s0 = v0.p1
    v7 = v7.copy(p1 = v5)
    val v40: s0 = v0.p1
    val v17: s0 = v7.p0
    var v21: s1 = v7
    val v30: s0 = v7.p1
    v7 = v7.copy(p0 = v5)
    v7 = v7.copy(p1 = v17)
    val v68: s1 = s1(v17, v40)
    var v67: s1 = v68
    var v81: s1 = v67
    val v119: s0 = v0.p0
    val v64: s0 = v67.p1
    var v60: s1 = v21
    v67 = v67.copy(p1 = v30)
    v67 = v67.copy(p0 = v64)
    v81 = v81.copy(p1 = v119)
    v60 = v81
    v60
  }
  def f24(v0: s6, v1: s3): s3 = {
    var v7: s3 = v1
    val v2: Vector[s1] = v7.p0
    var v14: s3 = v7
    v7 = v14
    v14 = v14.copy(p0 = v2)
    v7 = v7.copy(p0 = v2)
    v14 = v14.copy(p0 = v2)
    val v20: s1 = v2(0)
    val v24: s2 = v14.p2
    v7 = v7.copy(p1 = v24)
    v7 = v7.copy(p1 = v24)
    v7 = v1
    val v38: s1 = f25(v20)
    var v39: Vector[s1] = v2
    val v82: s3 = s3(v39, v24, v24)
    v39 = v39.updated(0, v38)
    v7 = v7.copy(p0 = v2)
    v82
  }
  def f15(v0: s6): s6 = {
    v0
  }
  def f14(v0: s3): s3 = {
    val v2: s2 = v0.p2
    val v3: s0 = v2.p1
    val v5: Vector[s0] = v2.p0
    var v6: s3 = v0
    val v1: Vector[s0] = v2.p0
    val v7: s0 = v5(0)
    val v8: s0 = v1(0)
    val v9: s0 = v5(0)
    v6 = v6.copy(p2 = v2)
    var v27: Vector[s0] = v1
    val v13: s0 = v27(0)
    var v18: s0 = v13
    val v36: s0 = v2.p1
    var v30: s2 = v2
    val v21: s2 = v0.p1
    v30 = v30.copy(p0 = v1)
    val v10: s0 = v5(0)
    v27 = v27.updated(0, v13)
    val v41: s0 = v1(0)
    v27 = v27.updated(0, v7)
    var v12: s2 = v30
    v12 = v12.copy(p1 = v13)
    v18 = v10
    v30 = v30.copy(p1 = v10)
    var v24: s3 = v6
    val v28: s0 = v27(0)
    var v17: s0 = v18
    var v55: Vector[s0] = v5
    val v44: s0 = v5(0)
    v24 = v24.copy(p1 = v2)
    var v76: Vector[s0] = v27
    v76 = v76.updated(0, v10)
    v55 = v55.updated(0, v28)
    var v98: Vector[s0] = v76
    val v48: s0 = v98(0)
    v76 = v76.updated(0, v41)
    val v38: Vector[Vector[Double]] = v17.p0
    v27 = v27.updated(0, v44)
    val v80: Vector[s0] = Vector(v17, v17)
    v98 = v98.updated(0, v28)
    val v40: Vector[Double] = v38(0)
    val v39: Double = v40(0)
    v18 = v28
    v27 = v27.updated(0, v36)
    v24 = v24.copy(p2 = v21)
    v18 = v8
    v18 = v18.copy(p0 = v38)
    var v32: s2 = v12
    val v29: s0 = v80(0)
    val v51: Double = v48.p1
    val v54: Double = v39 / v51
    v27 = v55
    v6 = v6.copy(p2 = v32)
    v98 = v98.updated(0, v29)
    v18 = v18.copy(p1 = v54)
    v30 = v30.copy(p0 = v76)
    val v99: s2 = v24.p1
    v55 = v55.updated(0, v9)
    v98 = v98.updated(0, v3)
    v18 = v18.copy(p0 = v38)
    val v74: Vector[Vector[Double]] = v9.p0
    v30 = v30.copy(p0 = v27)
    v98 = v98.updated(0, v18)
    val v68: s5 = s5(v54, v24)
    var v71: s5 = v68
    val v90: s0 = v80(1)
    v17 = v17.copy(p0 = v74)
    v55 = v55.updated(0, v10)
    v6 = v6.copy(p2 = v99)
    v24 = v24.copy(p1 = v2)
    val v119: s3 = v71.p1
    v76 = v76.updated(0, v90)
    v119
  }
  def f13(v0: Vector[s6], v1: Vector[Vector[s10]], v2: s0): s0 = {
    val v3: Vector[Vector[Double]] = v2.p0
    val v10: s6 = v0(0)
    val v9: s6 = f15(v10)
    val v12: s3 = v9.p0
    var v13: s3 = v12
    val v18: s3 = f24(v10, v13)
    val v19: Vector[Double] = v3(0)
    val v11: s2 = v13.p2
    val v16: Vector[s1] = v12.p0
    val v21: s6 = f15(v10)
    val v32: s1 = v16(0)
    val v44: Double = v19(0)
    val v53: Vector[s2] = Vector(v11, v11, v11, v11, v11, v11)
    v13 = v13.copy(p1 = v11)
    var v33: s1 = v32
    val v28: s3 = f14(v18)
    var v27: s2 = v11
    val v34: s2 = v53(1)
    val v61: s2 = v53(1)
    val v56: s0 = v33.p0
    v27 = v27.copy(p1 = v56)
    val v78: Vector[Vector[Double]] = v56.p0
    val v48: Vector[s0] = v27.p0
    v13 = v13.copy(p1 = v34)
    val v96: Vector[s1] = v28.p0
    v13 = v13.copy(p2 = v34)
    val v91: s0 = v21.p1
    v33 = v33.copy(p0 = v91)
    val v86: s0 = v48(0)
    var v88: s0 = v56
    v88 = v88.copy(p0 = v78)
    v27 = v27.copy(p0 = v48)
    v13 = v13.copy(p2 = v61)
    v88 = v88.copy(p1 = v44)
    v33 = v33.copy(p1 = v88)
    v13 = v13.copy(p0 = v96)
    v86
  }
  def f7(v0: s0): s0 = {
    val v4: Double = v0.p1
    val v5: Double = v4 * v4
    var v7: Double = v4
    val v6: s1 = s1(v0, v0)
    val v1: s1 = f25(v6)
    val v8: s0 = v1.p0
    var v13: Double = v5
    val v2: s1 = f25(v6)
    val v14: s0 = v2.p1
    val v36: Vector[Double] = Vector(v4, v13, v7, v4, v4, v7)
    var v16: Vector[Double] = v36
    val v21: Double = v16(5)
    v16 = v16.updated(0, v5)
    var v40: Double = v4
    v16 = v16.updated(3, v5)
    val v24: Double = v16(3)
    var v26: Double = v40
    var v30: Double = v24
    var v27: Vector[Double] = v16
    var v35: s0 = v8
    v27 = v27.updated(0, v26)
    val v32: Double = v27(1)
    v16 = v16.updated(3, v7)
    val v50: Double = v14.p1
    v35 = v35.copy(p1 = v30)
    v27 = v27.updated(1, v32)
    v35 = v35.copy(p1 = v32)
    v35 = v35.copy(p1 = v21)
    v35 = v35.copy(p1 = v50)
    v35
  }
  @noinline
  def f0(v0: Vector[Vector[s10]], v1: s1, v2: s5, v3: s12, v4: Vector[Vector[s1]], v5: Double): Double = {
    val v11: Vector[s1] = v4(0)
    val v9: s1 = f25(v1)
    val v8: Vector[s6] = v3.p1
    val v21: s0 = v9.p0
    val v15: s0 = f13(v8, v0, v21)
    val v29: s0 = f7(v15)
    val v20: s1 = v11(0)
    val v39: Double = v29.p1
    val v37: s0 = v20.p0
    val v88: Double = v37.p1
    val v54: Double = v39 * v88
    v54
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s10]] = Vector(Vector(s10(s1(s0(Vector(Vector(0.0)), 1.0), s0(Vector(Vector(2.0)), 3.0)), s3(Vector(s1(s0(Vector(Vector(4.0)), 5.0), s0(Vector(Vector(6.0)), 7.0))), s2(Vector(s0(Vector(Vector(8.0)), 9.0)), s0(Vector(Vector(10.0)), 11.0)), s2(Vector(s0(Vector(Vector(12.0)), 13.0)), s0(Vector(Vector(14.0)), 15.0))))))
    val v1: s1 = s1(s0(Vector(Vector(16.0)), 17.0), s0(Vector(Vector(18.0)), 19.0))
    val v2: s5 = s5(20.0, s3(Vector(s1(s0(Vector(Vector(21.0)), 22.0), s0(Vector(Vector(23.0)), 24.0))), s2(Vector(s0(Vector(Vector(25.0)), 26.0)), s0(Vector(Vector(27.0)), 28.0)), s2(Vector(s0(Vector(Vector(29.0)), 30.0)), s0(Vector(Vector(31.0)), 32.0))))
    val v3: s12 = s12(Vector(s8(Vector(s0(Vector(Vector(33.0)), 34.0)), 35.0), s8(Vector(s0(Vector(Vector(36.0)), 37.0)), 38.0)), Vector(s6(s3(Vector(s1(s0(Vector(Vector(39.0)), 40.0), s0(Vector(Vector(41.0)), 42.0))), s2(Vector(s0(Vector(Vector(43.0)), 44.0)), s0(Vector(Vector(45.0)), 46.0)), s2(Vector(s0(Vector(Vector(47.0)), 48.0)), s0(Vector(Vector(49.0)), 50.0))), s0(Vector(Vector(51.0)), 52.0), Vector(s3(Vector(s1(s0(Vector(Vector(53.0)), 54.0), s0(Vector(Vector(55.0)), 56.0))), s2(Vector(s0(Vector(Vector(57.0)), 58.0)), s0(Vector(Vector(59.0)), 60.0)), s2(Vector(s0(Vector(Vector(61.0)), 62.0)), s0(Vector(Vector(63.0)), 64.0))), s3(Vector(s1(s0(Vector(Vector(65.0)), 66.0), s0(Vector(Vector(67.0)), 68.0))), s2(Vector(s0(Vector(Vector(69.0)), 70.0)), s0(Vector(Vector(71.0)), 72.0)), s2(Vector(s0(Vector(Vector(73.0)), 74.0)), s0(Vector(Vector(75.0)), 76.0)))), Vector(s0(Vector(Vector(77.0)), 78.0), s0(Vector(Vector(79.0)), 80.0)), Vector(s3(Vector(s1(s0(Vector(Vector(81.0)), 82.0), s0(Vector(Vector(83.0)), 84.0))), s2(Vector(s0(Vector(Vector(85.0)), 86.0)), s0(Vector(Vector(87.0)), 88.0)), s2(Vector(s0(Vector(Vector(89.0)), 90.0)), s0(Vector(Vector(91.0)), 92.0))), s3(Vector(s1(s0(Vector(Vector(93.0)), 94.0), s0(Vector(Vector(95.0)), 96.0))), s2(Vector(s0(Vector(Vector(97.0)), 98.0)), s0(Vector(Vector(99.0)), 100.0)), s2(Vector(s0(Vector(Vector(101.0)), 102.0)), s0(Vector(Vector(103.0)), 104.0))), s3(Vector(s1(s0(Vector(Vector(105.0)), 106.0), s0(Vector(Vector(107.0)), 108.0))), s2(Vector(s0(Vector(Vector(109.0)), 110.0)), s0(Vector(Vector(111.0)), 112.0)), s2(Vector(s0(Vector(Vector(113.0)), 114.0)), s0(Vector(Vector(115.0)), 116.0))))), s6(s3(Vector(s1(s0(Vector(Vector(117.0)), 118.0), s0(Vector(Vector(119.0)), 120.0))), s2(Vector(s0(Vector(Vector(121.0)), 122.0)), s0(Vector(Vector(123.0)), 124.0)), s2(Vector(s0(Vector(Vector(125.0)), 126.0)), s0(Vector(Vector(127.0)), 128.0))), s0(Vector(Vector(129.0)), 130.0), Vector(s3(Vector(s1(s0(Vector(Vector(131.0)), 132.0), s0(Vector(Vector(133.0)), 134.0))), s2(Vector(s0(Vector(Vector(135.0)), 136.0)), s0(Vector(Vector(137.0)), 138.0)), s2(Vector(s0(Vector(Vector(139.0)), 140.0)), s0(Vector(Vector(141.0)), 142.0))), s3(Vector(s1(s0(Vector(Vector(143.0)), 144.0), s0(Vector(Vector(145.0)), 146.0))), s2(Vector(s0(Vector(Vector(147.0)), 148.0)), s0(Vector(Vector(149.0)), 150.0)), s2(Vector(s0(Vector(Vector(151.0)), 152.0)), s0(Vector(Vector(153.0)), 154.0)))), Vector(s0(Vector(Vector(155.0)), 156.0), s0(Vector(Vector(157.0)), 158.0)), Vector(s3(Vector(s1(s0(Vector(Vector(159.0)), 160.0), s0(Vector(Vector(161.0)), 162.0))), s2(Vector(s0(Vector(Vector(163.0)), 164.0)), s0(Vector(Vector(165.0)), 166.0)), s2(Vector(s0(Vector(Vector(167.0)), 168.0)), s0(Vector(Vector(169.0)), 170.0))), s3(Vector(s1(s0(Vector(Vector(171.0)), 172.0), s0(Vector(Vector(173.0)), 174.0))), s2(Vector(s0(Vector(Vector(175.0)), 176.0)), s0(Vector(Vector(177.0)), 178.0)), s2(Vector(s0(Vector(Vector(179.0)), 180.0)), s0(Vector(Vector(181.0)), 182.0))), s3(Vector(s1(s0(Vector(Vector(183.0)), 184.0), s0(Vector(Vector(185.0)), 186.0))), s2(Vector(s0(Vector(Vector(187.0)), 188.0)), s0(Vector(Vector(189.0)), 190.0)), s2(Vector(s0(Vector(Vector(191.0)), 192.0)), s0(Vector(Vector(193.0)), 194.0)))))))
    val v4: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(195.0)), 196.0), s0(Vector(Vector(197.0)), 198.0))), Vector(s1(s0(Vector(Vector(199.0)), 200.0), s0(Vector(Vector(201.0)), 202.0))), Vector(s1(s0(Vector(Vector(203.0)), 204.0), s0(Vector(Vector(205.0)), 206.0))))
    val v5: Double = 207.0
    val start = nanoTime()
    var result: Double = 207.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}