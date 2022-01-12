import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s3 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  case class s4 (
    p0: s1,
    p1: Vector[s0]
  )
  def f5(v0: s4): s4 = {
    val v4: Vector[s0] = v0.p1
    var v7: s4 = v0
    var v2: Vector[s0] = v4
    val v1: s0 = v2(0)
    val v9: s0 = v2(0)
    v7 = v7.copy(p1 = v2)
    val v3: Vector[Vector[Double]] = v1.p0
    v7 = v7.copy(p1 = v2)
    var v11: s0 = v1
    val v13: s0 = v2(0)
    v7 = v7.copy(p1 = v2)
    val v6: Vector[Vector[Double]] = v11.p0
    val v10: Double = v9.p1
    val v18: Vector[Double] = v6(1)
    val v24: Vector[Double] = v6(0)
    var v16: s0 = v11
    val v21: Double = v24(0)
    val v15: Double = v10 + v10
    v11 = v11.copy(p1 = v10)
    val v23: Vector[Vector[Double]] = v16.p0
    var v27: s0 = v13
    val v14: Vector[Double] = v3(0)
    v27 = v27.copy(p0 = v3)
    var v42: s4 = v0
    v2 = v2.updated(0, v11)
    var v20: s4 = v42
    val v22: s1 = v0.p0
    val v32: s1 = v7.p0
    var v53: Vector[Vector[Double]] = v3
    val v28: s1 = v7.p0
    val v85: s0 = v4(0)
    var v31: Vector[Vector[Double]] = v23
    val v30: Vector[Vector[s0]] = v22.p0
    v31 = v31.updated(0, v18)
    v16 = v16.copy(p0 = v53)
    val v25: Double = v14(0)
    var v59: s4 = v7
    v42 = v42.copy(p0 = v28)
    var v92: Vector[Double] = v18
    var v50: Vector[Vector[Double]] = v23
    val v54: Vector[s0] = v30(0)
    v20 = v0
    val v83: s1 = v20.p0
    v59 = v59.copy(p0 = v32)
    val v52: s0 = v28.p1
    val v58: Vector[Vector[Double]] = v85.p0
    v7 = v7.copy(p0 = v83)
    var v72: s1 = v28
    val v97: Vector[s0] = Vector(v85, v27, v27, v85)
    val v45: s0 = v97(2)
    v50 = v31
    v92 = v92.updated(0, v15)
    val v113: Double = v21 - v25
    v59 = v59.copy(p1 = v54)
    val v44: Vector[s0] = v30(0)
    v72 = v72.copy(p1 = v45)
    val v73: Double = v52.p1
    val v74: s0 = v44(0)
    val v108: Vector[Vector[s0]] = v72.p0
    v50 = v50.updated(0, v24)
    val v105: s1 = s1(v108, v11)
    val v185: Vector[Double] = v23(0)
    v11 = v11.copy(p1 = v73)
    v27 = v16
    v53 = v53.updated(1, v185)
    val v84: Vector[Double] = v58(1)
    v20 = v20.copy(p0 = v105)
    val v143: s0 = v72.p1
    v16 = v16.copy(p1 = v113)
    v27 = v27.copy(p0 = v50)
    v31 = v31.updated(0, v92)
    v50 = v50.updated(1, v92)
    v72 = v72.copy(p1 = v74)
    v2 = v2.updated(0, v143)
    v72 = v72.copy(p1 = v85)
    v50 = v50.updated(1, v84)
    v59
  }
  def f4(v0: Vector[s2], v1: s4): s4 = {
    val v3: s4 = f5(v1)
    var v4: s4 = v3
    var v8: s4 = v4
    val v2: s2 = v0(0)
    val v10: s4 = f5(v8)
    val v16: s4 = f5(v10)
    val v27: Vector[s0] = v16.p1
    var v37: Vector[s0] = v27
    val v28: s1 = v2.p1
    val v56: Vector[s0] = v16.p1
    v4 = v4.copy(p1 = v37)
    v4 = v4.copy(p1 = v27)
    v4 = v4.copy(p0 = v28)
    var v122: s4 = v4
    v8 = v8.copy(p1 = v37)
    v122 = v122.copy(p1 = v56)
    v8 = v8.copy(p1 = v37)
    v122
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s3]], v2: Vector[s4], v3: Double): Double = {
    var v6: Double = v3
    var v8: Double = v3
    var v7: Vector[s4] = v2
    v7 = v2
    val v16: Vector[Vector[s2]] = v0.p0
    val v26: Vector[s2] = v16(0)
    var v15: Vector[s4] = v7
    val v59: s4 = v7(2)
    var v25: Vector[s4] = v2
    val v24: s4 = f4(v26, v59)
    v25 = v25.updated(0, v24)
    val v35: Vector[s0] = v24.p1
    v7 = v15
    val v49: s0 = v35(0)
    val v85: Double = v49.p1
    v7 = v25
    val v188: Double = v8 * v85
    val v54: Double = v188 / v6
    v15 = v15.updated(0, v59)
    v54
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), 2.0))), s0(Vector(Vector(3.0), Vector(4.0)), 5.0)), s1(Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), 8.0))), s0(Vector(Vector(9.0), Vector(10.0)), 11.0))), s1(Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), 14.0))), s0(Vector(Vector(15.0), Vector(16.0)), 17.0)))), Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)), 20.0))), s0(Vector(Vector(21.0), Vector(22.0)), 23.0)), s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), 26.0))), s0(Vector(Vector(27.0), Vector(28.0)), 29.0))), s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), 32.0))), s0(Vector(Vector(33.0), Vector(34.0)), 35.0))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), 38.0))), s0(Vector(Vector(39.0), Vector(40.0)), 41.0)), s1(Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0))), s0(Vector(Vector(45.0), Vector(46.0)), 47.0))), s1(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), 50.0))), s0(Vector(Vector(51.0), Vector(52.0)), 53.0))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), 56.0))), s0(Vector(Vector(57.0), Vector(58.0)), 59.0)), s1(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), 62.0))), s0(Vector(Vector(63.0), Vector(64.0)), 65.0))), s1(Vector(Vector(s0(Vector(Vector(66.0), Vector(67.0)), 68.0))), s0(Vector(Vector(69.0), Vector(70.0)), 71.0)))), Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), 74.0))), s0(Vector(Vector(75.0), Vector(76.0)), 77.0)), s1(Vector(Vector(s0(Vector(Vector(78.0), Vector(79.0)), 80.0))), s0(Vector(Vector(81.0), Vector(82.0)), 83.0))), s1(Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), 86.0))), s0(Vector(Vector(87.0), Vector(88.0)), 89.0))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(90.0), Vector(91.0)), 92.0))), s0(Vector(Vector(93.0), Vector(94.0)), 95.0)), s1(Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), 98.0))), s0(Vector(Vector(99.0), Vector(100.0)), 101.0))), s1(Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0)), 104.0))), s0(Vector(Vector(105.0), Vector(106.0)), 107.0))))))
    val v2: Vector[s4] = Vector(s4(s1(Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0)), 110.0))), s0(Vector(Vector(111.0), Vector(112.0)), 113.0)), Vector(s0(Vector(Vector(114.0), Vector(115.0)), 116.0))), s4(s1(Vector(Vector(s0(Vector(Vector(117.0), Vector(118.0)), 119.0))), s0(Vector(Vector(120.0), Vector(121.0)), 122.0)), Vector(s0(Vector(Vector(123.0), Vector(124.0)), 125.0))), s4(s1(Vector(Vector(s0(Vector(Vector(126.0), Vector(127.0)), 128.0))), s0(Vector(Vector(129.0), Vector(130.0)), 131.0)), Vector(s0(Vector(Vector(132.0), Vector(133.0)), 134.0))))
    val v3: Double = 135.0
    val start = nanoTime()
    var result: Double = 135.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}