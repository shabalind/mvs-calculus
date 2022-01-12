import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s3],
    p1: s1
  )
  def f106(v0: s0): s0 = {
    var v6: s0 = v0
    var v1: s0 = v0
    var v3: s0 = v1
    val v8: Vector[Vector[Double]] = v6.p1
    val v12: Vector[Vector[Double]] = v1.p0
    v3 = v3.copy(p0 = v12)
    v1 = v1.copy(p1 = v8)
    val v39: Vector[Vector[Double]] = v3.p1
    var v32: s0 = v3
    v3 = v3.copy(p1 = v39)
    v32
  }
  def f105(v0: s2): s2 = {
    val v1: s1 = v0.p1
    val v8: s0 = v1.p1
    val v4: Vector[s0] = v1.p0
    var v5: s1 = v1
    val v7: Vector[s0] = v5.p0
    v5 = v5.copy(p1 = v8)
    var v18: s2 = v0
    v5 = v1
    v18 = v0
    val v13: Vector[s0] = v1.p0
    val v14: s0 = v7(0)
    v5 = v5.copy(p1 = v14)
    val v24: Vector[s0] = v1.p0
    val v16: s1 = v0.p0
    v5 = v5.copy(p0 = v4)
    val v22: s1 = v18.p0
    v18 = v18.copy(p1 = v16)
    var v44: s1 = v5
    v5 = v5.copy(p0 = v13)
    var v32: s1 = v1
    v32 = v32.copy(p0 = v4)
    var v40: s2 = v0
    v40 = v40.copy(p1 = v44)
    var v30: s2 = v40
    var v29: s1 = v22
    var v59: s1 = v29
    val v57: s2 = s2(v44, v44)
    val v58: Vector[s0] = v32.p0
    val v64: s1 = v18.p1
    v18 = v18.copy(p1 = v1)
    val v63: s1 = v57.p1
    var v94: s2 = v18
    val v73: s1 = v30.p0
    var v100: s2 = v30
    v59 = v59.copy(p0 = v24)
    v18 = v18.copy(p0 = v64)
    v94 = v94.copy(p1 = v1)
    var v143: s2 = v57
    v143 = v143.copy(p0 = v59)
    val v138: Vector[s2] = Vector(v30, v100, v0, v143, v40, v94, v143)
    v29 = v29.copy(p0 = v58)
    v143 = v143.copy(p0 = v63)
    v100 = v100.copy(p1 = v73)
    val v152: s2 = v138(1)
    v152
  }
  def f86(v0: s0): s0 = {
    var v7: s0 = v0
    var v1: s0 = v0
    var v2: s0 = v1
    val v4: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v4)
    v2 = v2.copy(p0 = v4)
    val v8: Vector[Vector[Double]] = v1.p0
    v2 = v2.copy(p0 = v4)
    val v13: Vector[Vector[Double]] = v1.p1
    val v6: s0 = f106(v0)
    val v12: s0 = f106(v7)
    v7 = v7.copy(p1 = v13)
    v1 = v1.copy(p0 = v4)
    v2 = v12
    var v15: Vector[Vector[Double]] = v4
    var v26: Vector[Vector[Double]] = v4
    val v41: s0 = f106(v0)
    var v46: Vector[Vector[Double]] = v15
    v7 = v7.copy(p1 = v13)
    val v62: Vector[Vector[Double]] = v6.p0
    val v23: s0 = f106(v41)
    v46 = v8
    val v35: s0 = f106(v2)
    val v25: s0 = f106(v2)
    val v54: s0 = f106(v35)
    val v100: s0 = f106(v23)
    v2 = v2.copy(p0 = v46)
    val v36: Vector[s0] = Vector(v2, v23, v54, v25, v100)
    v1 = v1.copy(p1 = v13)
    val v34: Vector[Vector[Double]] = v7.p1
    var v85: Vector[s0] = v36
    v7 = v7.copy(p0 = v62)
    v2 = v2.copy(p1 = v34)
    v1 = v1.copy(p0 = v8)
    var v135: Vector[s0] = v85
    val v88: Vector[Vector[Double]] = v0.p0
    var v149: Vector[Vector[Double]] = v88
    var v53: Vector[Vector[Double]] = v26
    v7 = v7.copy(p0 = v149)
    v1 = v1.copy(p0 = v53)
    val v268: s0 = v135(2)
    val v167: s0 = f106(v268)
    v167
  }
  def f72(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p0
    val v2: s0 = v6(0)
    var v5: s0 = v2
    val v8: s0 = v6(0)
    var v3: s1 = v0
    val v10: s0 = v3.p1
    v3 = v3.copy(p1 = v5)
    val v11: s0 = f86(v10)
    v3 = v3.copy(p1 = v2)
    val v9: Vector[Vector[Double]] = v11.p1
    v5 = v5.copy(p1 = v9)
    v3 = v0
    val v16: s0 = f106(v8)
    val v12: s0 = f106(v16)
    val v81: Vector[Vector[Double]] = v16.p0
    v5 = v12
    v5 = v5.copy(p0 = v81)
    v3
  }
  def f67(v0: s0): s0 = {
    val v15: s0 = f86(v0)
    val v34: Vector[Vector[Double]] = v15.p0
    val v22: s0 = f86(v0)
    var v30: s0 = v22
    v30 = v30.copy(p0 = v34)
    v30
  }
  def f61(v0: s1): s1 = {
    var v1: s1 = v0
    var v2: s1 = v1
    val v7: s0 = v1.p1
    v1 = v2
    val v4: s0 = f67(v7)
    val v9: s2 = s2(v1, v1)
    val v21: s1 = v9.p1
    var v14: s1 = v0
    val v15: s2 = s2(v14, v0)
    v1 = v1.copy(p1 = v4)
    val v28: s1 = f72(v1)
    val v22: s0 = v28.p1
    val v20: s1 = v15.p0
    val v42: Vector[s0] = v0.p0
    var v52: Vector[s0] = v42
    v52 = v52.updated(0, v22)
    v1 = v1.copy(p0 = v52)
    var v32: s2 = v15
    v32 = v9
    val v39: s0 = v52(0)
    v2 = v2.copy(p1 = v39)
    val v46: s2 = f105(v32)
    v32 = v32.copy(p0 = v21)
    val v47: s0 = f67(v4)
    v32 = v32.copy(p1 = v28)
    var v54: Vector[s0] = v52
    val v110: s1 = f72(v20)
    val v176: s2 = f105(v46)
    val v113: s0 = f86(v7)
    v54 = v54.updated(0, v113)
    var v58: s0 = v47
    v54 = v54.updated(0, v4)
    val v77: s0 = v54(0)
    val v68: s0 = f67(v77)
    v32 = v32.copy(p1 = v14)
    v54 = v54.updated(0, v58)
    v32 = v32.copy(p1 = v110)
    val v169: s0 = f106(v22)
    v52 = v52.updated(0, v68)
    val v150: s2 = f105(v176)
    val v163: s1 = v150.p0
    v1 = v1.copy(p1 = v169)
    v163
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s4]], v2: Double): Double = {
    val v4: s1 = f72(v0)
    var v7: Double = v2
    val v3: s1 = f61(v4)
    val v8: s0 = v3.p1
    val v20: s0 = f106(v8)
    val v25: Vector[Vector[Double]] = v20.p0
    val v36: Vector[Double] = v25(2)
    val v68: Double = v2 / v7
    val v76: Double = v36(0)
    val v117: Double = v76 - v68
    v117
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(Vector(s3(s2(s1(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))))), s3(s2(s1(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))), Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))), s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))))), Vector(s4(Vector(s3(s2(s1(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), s1(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))))), s3(s2(s1(Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s1(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))))), Vector(Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))))), s1(Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))))))
    val v2: Double = 104.0
    val start = nanoTime()
    var result: Double = 104.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}