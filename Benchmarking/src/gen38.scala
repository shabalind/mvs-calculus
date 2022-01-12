import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Double],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[Double]
  )
  case class s3 (
    p0: s1,
    p1: s2
  )
  def f59(v0: s3): s3 = {
    var v4: s3 = v0
    var v6: s3 = v0
    val v1: s2 = v6.p1
    var v3: s2 = v1
    val v7: s1 = v3.p0
    v6 = v4
    v3 = v3.copy(p0 = v7)
    var v8: s2 = v1
    v3 = v3.copy(p0 = v7)
    val v11: Vector[Double] = v1.p1
    var v18: s3 = v0
    v8 = v8.copy(p1 = v11)
    v6 = v6.copy(p0 = v7)
    v3 = v3.copy(p1 = v11)
    var v15: s2 = v8
    val v17: s1 = v15.p0
    v3 = v3.copy(p0 = v7)
    v6 = v6.copy(p0 = v17)
    v15 = v15.copy(p0 = v17)
    val v28: Vector[Double] = v8.p1
    v18 = v18.copy(p0 = v17)
    v8 = v8.copy(p1 = v28)
    v15 = v15.copy(p1 = v11)
    v8 = v3
    val v26: s2 = v0.p1
    val v38: s2 = v6.p1
    v18 = v18.copy(p0 = v7)
    v18 = v18.copy(p0 = v17)
    val v56: s1 = v1.p0
    v4 = v4.copy(p1 = v38)
    v4 = v4.copy(p1 = v3)
    v6 = v6.copy(p0 = v17)
    v3 = v3.copy(p0 = v7)
    v4 = v4.copy(p1 = v26)
    var v145: s3 = v18
    v6 = v6.copy(p0 = v56)
    v6 = v6.copy(p1 = v3)
    v145
  }
  def f48(v0: s0): s0 = {
    var v3: s0 = v0
    val v4: Vector[Double] = v0.p2
    val v1: Double = v4(0)
    val v2: Vector[Double] = v0.p2
    val v7: Double = v2(0)
    var v6: Vector[Double] = v4
    var v13: Vector[Double] = v6
    val v5: Vector[Double] = v0.p2
    val v10: Vector[Vector[Double]] = v3.p3
    var v11: Double = v1
    val v8: Double = v2(2)
    var v9: Vector[Vector[Double]] = v10
    val v17: Vector[Vector[Double]] = v0.p0
    val v15: Vector[Double] = v10(0)
    v3 = v3.copy(p3 = v9)
    val v30: Vector[Double] = v9(0)
    v13 = v13.updated(2, v1)
    val v25: Vector[Double] = v10(0)
    val v14: s0 = s0(v17, v17, v5, v10)
    v13 = v13.updated(2, v8)
    var v22: Vector[Vector[Double]] = v17
    val v20: Double = v13(2)
    v3 = v3.copy(p2 = v5)
    v22 = v22.updated(0, v25)
    val v18: Vector[Double] = v22(0)
    v6 = v6.updated(0, v20)
    v3 = v3.copy(p3 = v9)
    var v38: Double = v7
    val v21: Vector[Vector[Double]] = v14.p0
    v3 = v3.copy(p1 = v21)
    val v12: Vector[Double] = v14.p2
    v9 = v9.updated(0, v15)
    v3 = v3.copy(p2 = v12)
    val v61: Vector[Vector[Double]] = v0.p0
    val v36: Vector[Vector[Double]] = v14.p3
    v3 = v3.copy(p1 = v17)
    v6 = v6.updated(0, v11)
    val v55: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p0 = v21)
    var v42: Vector[Double] = v5
    v3 = v3.copy(p1 = v17)
    v13 = v13.updated(1, v38)
    v6 = v6.updated(1, v8)
    v3 = v3.copy(p3 = v36)
    val v47: Vector[Double] = v22(0)
    v22 = v22.updated(1, v47)
    v22 = v22.updated(1, v47)
    v42 = v42.updated(1, v20)
    v22 = v55
    val v43: Vector[Vector[Double]] = v3.p3
    val v161: s0 = s0(v21, v61, v42, v43)
    v9 = v9.updated(0, v30)
    v3 = v3.copy(p3 = v10)
    v22 = v22.updated(0, v15)
    v9 = v9.updated(0, v18)
    v161
  }
  def f40(v0: s1): s1 = {
    v0
  }
  def f26(v0: s3): s3 = {
    val v3: Vector[s3] = Vector(v0, v0)
    val v8: s1 = v0.p0
    val v4: s3 = f59(v0)
    var v10: s1 = v8
    var v7: s3 = v4
    val v1: s3 = f59(v7)
    v7 = v7.copy(p0 = v10)
    var v5: Vector[s3] = v3
    val v9: s3 = v5(1)
    val v14: Vector[s0] = v10.p1
    v10 = v10.copy(p1 = v14)
    v5 = v5.updated(0, v9)
    val v18: s3 = f59(v9)
    var v11: s1 = v10
    val v17: Vector[s0] = v11.p1
    val v35: s3 = f59(v0)
    val v13: s3 = v5(0)
    var v28: Vector[s3] = v5
    val v53: s0 = v17(1)
    val v70: s3 = v5(0)
    v28 = v28.updated(1, v18)
    val v40: s2 = v1.p1
    v28 = v28.updated(0, v7)
    val v34: s3 = f59(v35)
    v28 = v28.updated(1, v0)
    val v77: s3 = v28(1)
    v10 = v10.copy(p0 = v53)
    val v54: s0 = f48(v53)
    v11 = v11.copy(p0 = v54)
    v7 = v7.copy(p1 = v40)
    var v56: Vector[s3] = v3
    val v81: s3 = f59(v13)
    v56 = v56.updated(1, v81)
    val v143: s3 = f59(v77)
    val v144: s2 = v34.p1
    v56 = v56.updated(0, v70)
    val v227: s3 = v56(0)
    v28 = v28.updated(1, v227)
    v7 = v7.copy(p1 = v144)
    v5 = v5.updated(1, v0)
    v143
  }
  def f1(v0: s3): s3 = {
    val v8: s3 = f26(v0)
    val v2: s2 = v0.p1
    val v4: s2 = v8.p1
    var v5: s2 = v2
    val v3: s3 = f26(v8)
    var v13: s3 = v3
    v13 = v13.copy(p1 = v2)
    v13 = v13.copy(p1 = v5)
    v13 = v13.copy(p1 = v5)
    val v16: s1 = v4.p0
    var v23: s1 = v16
    v5 = v5.copy(p0 = v16)
    var v25: s1 = v23
    v5 = v5.copy(p0 = v25)
    val v30: Vector[s0] = v16.p1
    v5 = v5.copy(p0 = v23)
    val v39: s1 = f40(v25)
    val v54: s3 = f26(v13)
    val v63: s3 = f26(v54)
    v25 = v25.copy(p1 = v30)
    val v99: s1 = f40(v39)
    v13 = v13.copy(p0 = v99)
    val v118: s3 = f26(v63)
    v118
  }
  @noinline
  def f0(v0: s3, v1: Vector[s1], v2: Double): Double = {
    val v5: s1 = v1(1)
    val v12: s1 = v1(0)
    var v9: s3 = v0
    val v4: s1 = v1(0)
    val v7: s1 = v1(1)
    v9 = v9.copy(p0 = v5)
    var v16: Vector[s1] = v1
    val v11: s1 = v16(0)
    val v22: s3 = f26(v9)
    v9 = v9.copy(p0 = v7)
    val v25: Vector[s0] = v7.p1
    v16 = v16.updated(1, v12)
    val v21: s1 = v22.p0
    val v28: s1 = v16(1)
    val v15: s0 = v25(0)
    v9 = v9.copy(p0 = v12)
    val v19: s0 = f48(v15)
    val v33: s1 = s1(v15, v25)
    v16 = v16.updated(0, v21)
    v9 = v9.copy(p0 = v33)
    val v49: s3 = f1(v9)
    v9 = v9.copy(p0 = v11)
    v9 = v9.copy(p0 = v21)
    v16 = v16.updated(1, v28)
    val v44: s2 = v49.p1
    var v65: Double = v2
    val v54: Vector[Vector[Double]] = v19.p1
    val v71: Vector[Double] = v54(0)
    val v164: Vector[Double] = v44.p1
    val v52: Double = v71(0)
    val v66: Double = v52 - v65
    val v92: Double = v164(0)
    val v220: Double = v92 - v66
    v16 = v16.updated(0, v4)
    v220
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(4.0, 5.0, 6.0), Vector(Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(12.0, 13.0, 14.0), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(20.0, 21.0, 22.0), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)), Vector(28.0, 29.0, 30.0), Vector(Vector(31.0))))), s2(s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)), Vector(36.0, 37.0, 38.0), Vector(Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)), Vector(44.0, 45.0, 46.0), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)), Vector(52.0, 53.0, 54.0), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)), Vector(60.0, 61.0, 62.0), Vector(Vector(63.0))))), Vector(64.0, 65.0, 66.0)))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)), Vector(71.0, 72.0, 73.0), Vector(Vector(74.0))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(79.0, 80.0, 81.0), Vector(Vector(82.0))), s0(Vector(Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0)), Vector(87.0, 88.0, 89.0), Vector(Vector(90.0))), s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)), Vector(95.0, 96.0, 97.0), Vector(Vector(98.0))))), s1(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(103.0, 104.0, 105.0), Vector(Vector(106.0))), Vector(s0(Vector(Vector(107.0), Vector(108.0)), Vector(Vector(109.0), Vector(110.0)), Vector(111.0, 112.0, 113.0), Vector(Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0)), Vector(119.0, 120.0, 121.0), Vector(Vector(122.0))), s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)), Vector(127.0, 128.0, 129.0), Vector(Vector(130.0))))))
    val v2: Double = 131.0
    val start = nanoTime()
    var result: Double = 131.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}