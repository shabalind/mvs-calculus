import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: Double
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: s0,
    p3: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s4 (
    p0: s0,
    p1: s3
  )
  case class s6 (
    p0: s2,
    p1: s4
  )
  def f11(v0: Vector[s6]): Vector[s6] = {
    val v2: s6 = v0(0)
    var v6: Vector[s6] = v0
    var v4: s6 = v2
    v6 = v6.updated(0, v4)
    val v7: s2 = v2.p0
    v4 = v4.copy(p0 = v7)
    v6 = v6.updated(0, v2)
    val v10: s6 = v0(0)
    val v1: s6 = v6(0)
    v6 = v6.updated(0, v10)
    v6 = v6.updated(0, v1)
    v6
  }
  def f10(v0: s0): s0 = {
    var v3: s0 = v0
    var v7: s0 = v3
    var v5: s0 = v7
    val v2: Vector[Vector[Double]] = v5.p1
    v7 = v7.copy(p1 = v2)
    v7
  }
  def f9(v0: s1): s1 = {
    var v4: s1 = v0
    var v5: s1 = v0
    val v7: Vector[s0] = v0.p1
    val v3: Vector[s0] = v4.p1
    val v1: Vector[Vector[s0]] = Vector(v3, v3, v3, v7, v3, v3, v7)
    val v13: s0 = v5.p0
    val v10: Vector[s0] = v1(6)
    var v16: s0 = v13
    val v15: s0 = f10(v13)
    var v20: s0 = v15
    val v49: Vector[Double] = v16.p0
    val v17: Double = v49(0)
    v5 = v0
    val v19: Vector[Double] = v16.p0
    val v14: Double = v5.p2
    val v40: Vector[Double] = Vector(v17)
    val v22: Vector[s0] = v1(5)
    val v37: Double = v40(0)
    val v23: Double = v49(1)
    var v31: Vector[Double] = v19
    val v24: Vector[Double] = v20.p0
    val v21: Vector[Vector[Double]] = v13.p1
    val v43: s0 = v22(0)
    v4 = v4.copy(p1 = v10)
    val v50: Vector[Vector[Double]] = v15.p1
    val v87: s0 = f10(v15)
    v4 = v4.copy(p2 = v17)
    var v57: Vector[Vector[Double]] = v21
    val v44: Vector[Double] = v50(1)
    val v56: Vector[Double] = v43.p0
    val v41: s0 = s0(v56, v57)
    v57 = v57.updated(0, v44)
    val v39: Double = v37 - v23
    var v77: Double = v17
    var v84: Double = v14
    val v51: Double = v44(0)
    v31 = v31.updated(0, v39)
    val v93: Double = v84 / v51
    val v125: s0 = f10(v41)
    v4 = v4.copy(p2 = v93)
    val v82: s0 = f10(v87)
    val v106: s0 = f10(v125)
    val v121: s0 = f10(v106)
    val v97: Vector[Vector[Double]] = v20.p1
    var v159: Vector[s0] = v7
    v159 = v159.updated(1, v121)
    val v143: Vector[Double] = v97(1)
    v31 = v24
    v57 = v57.updated(1, v143)
    v5 = v5.copy(p2 = v77)
    val v209: s1 = s1(v82, v159, v51)
    v20 = v20.copy(p0 = v31)
    v209
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Double): Double = {
    val v4: Vector[s6] = v0(0)
    val v7: Vector[s6] = v0(1)
    val v16: Vector[s6] = f11(v4)
    val v27: s6 = v7(0)
    val v39: s6 = v16(0)
    val v53: s4 = v39.p1
    val v23: s3 = v53.p1
    val v93: Vector[s0] = v23.p0
    val v70: s2 = v27.p0
    val v38: s0 = v93(2)
    val v83: Vector[Double] = v38.p0
    var v61: Vector[Double] = v83
    val v59: s1 = v70.p1
    val v151: Double = v61(1)
    val v109: s1 = f9(v59)
    val v120: Double = v109.p2
    v61 = v61.updated(1, v120)
    v151
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s2(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0))), s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0)))), s1(s0(Vector(8.0, 9.0), Vector(Vector(10.0), Vector(11.0))), Vector(s0(Vector(12.0, 13.0), Vector(Vector(14.0), Vector(15.0))), s0(Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0)))), 20.0), s0(Vector(21.0, 22.0), Vector(Vector(23.0), Vector(24.0))), s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0)))), s4(s0(Vector(29.0, 30.0), Vector(Vector(31.0), Vector(32.0))), s3(Vector(s0(Vector(33.0, 34.0), Vector(Vector(35.0), Vector(36.0))), s0(Vector(37.0, 38.0), Vector(Vector(39.0), Vector(40.0))), s0(Vector(41.0, 42.0), Vector(Vector(43.0), Vector(44.0)))), s2(Vector(s0(Vector(45.0, 46.0), Vector(Vector(47.0), Vector(48.0))), s0(Vector(49.0, 50.0), Vector(Vector(51.0), Vector(52.0)))), s1(s0(Vector(53.0, 54.0), Vector(Vector(55.0), Vector(56.0))), Vector(s0(Vector(57.0, 58.0), Vector(Vector(59.0), Vector(60.0))), s0(Vector(61.0, 62.0), Vector(Vector(63.0), Vector(64.0)))), 65.0), s0(Vector(66.0, 67.0), Vector(Vector(68.0), Vector(69.0))), s0(Vector(70.0, 71.0), Vector(Vector(72.0), Vector(73.0)))))))), Vector(s6(s2(Vector(s0(Vector(74.0, 75.0), Vector(Vector(76.0), Vector(77.0))), s0(Vector(78.0, 79.0), Vector(Vector(80.0), Vector(81.0)))), s1(s0(Vector(82.0, 83.0), Vector(Vector(84.0), Vector(85.0))), Vector(s0(Vector(86.0, 87.0), Vector(Vector(88.0), Vector(89.0))), s0(Vector(90.0, 91.0), Vector(Vector(92.0), Vector(93.0)))), 94.0), s0(Vector(95.0, 96.0), Vector(Vector(97.0), Vector(98.0))), s0(Vector(99.0, 100.0), Vector(Vector(101.0), Vector(102.0)))), s4(s0(Vector(103.0, 104.0), Vector(Vector(105.0), Vector(106.0))), s3(Vector(s0(Vector(107.0, 108.0), Vector(Vector(109.0), Vector(110.0))), s0(Vector(111.0, 112.0), Vector(Vector(113.0), Vector(114.0))), s0(Vector(115.0, 116.0), Vector(Vector(117.0), Vector(118.0)))), s2(Vector(s0(Vector(119.0, 120.0), Vector(Vector(121.0), Vector(122.0))), s0(Vector(123.0, 124.0), Vector(Vector(125.0), Vector(126.0)))), s1(s0(Vector(127.0, 128.0), Vector(Vector(129.0), Vector(130.0))), Vector(s0(Vector(131.0, 132.0), Vector(Vector(133.0), Vector(134.0))), s0(Vector(135.0, 136.0), Vector(Vector(137.0), Vector(138.0)))), 139.0), s0(Vector(140.0, 141.0), Vector(Vector(142.0), Vector(143.0))), s0(Vector(144.0, 145.0), Vector(Vector(146.0), Vector(147.0)))))))))
    val v1: Double = 148.0
    val start = nanoTime()
    var result: Double = 148.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}