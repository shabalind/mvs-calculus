import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Double],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s0
  )
  def f79(v0: s0): s0 = {
    var v5: s0 = v0
    val v3: Vector[Vector[Double]] = v0.p4
    val v8: Vector[Vector[Double]] = v5.p1
    val v4: s1 = s1(v0, v5)
    val v6: s1 = s1(v5, v5)
    v5 = v5.copy(p1 = v8)
    val v11: Vector[Vector[Double]] = v0.p2
    val v1: Vector[Double] = v11(0)
    val v7: Vector[Vector[Double]] = Vector(v1, v1, v1, v1)
    val v9: Vector[Vector[Double]] = v0.p1
    var v15: Vector[Double] = v1
    val v10: Vector[Vector[Double]] = v0.p4
    v5 = v5.copy(p4 = v10)
    v15 = v1
    val v17: Vector[Vector[Double]] = v5.p1
    val v2: s0 = v4.p1
    var v14: Vector[Vector[Double]] = v3
    v5 = v5.copy(p4 = v17)
    v14 = v14.updated(0, v1)
    val v20: Vector[Vector[Double]] = v5.p4
    val v25: s0 = v4.p0
    val v23: Vector[Double] = v9(0)
    var v12: Vector[Double] = v1
    val v24: s1 = s1(v5, v2)
    var v18: s1 = v24
    v14 = v14.updated(0, v12)
    val v16: Vector[Double] = v17(0)
    val v13: Double = v16(0)
    val v30: Vector[Double] = v7(3)
    v15 = v15.updated(0, v13)
    v14 = v10
    v14 = v14.updated(0, v12)
    val v26: Double = v30(0)
    var v60: Vector[Vector[Double]] = v20
    val v35: s0 = v18.p1
    val v27: s0 = v24.p0
    val v32: Vector[Vector[Double]] = v35.p4
    v60 = v60.updated(0, v23)
    v18 = v18.copy(p0 = v27)
    val v56: Double = v15(0)
    var v28: Vector[Vector[Double]] = v3
    val v48: Vector[Double] = v11(0)
    v60 = v60.updated(0, v12)
    v5 = v5.copy(p1 = v60)
    val v72: Vector[Vector[Double]] = v25.p0
    var v79: Double = v26
    v79 = v26
    val v74: Vector[Double] = v25.p3
    v5 = v5.copy(p3 = v74)
    val v84: Double = v15(0)
    var v54: Double = v13
    var v57: Vector[Double] = v23
    v5 = v5.copy(p1 = v28)
    var v73: Double = v84
    v14 = v14.updated(0, v57)
    var v98: Vector[Double] = v74
    val v85: Double = v74(0)
    v12 = v12.updated(0, v79)
    v14 = v14.updated(0, v23)
    val v43: s0 = s0(v11, v32, v72, v98, v20)
    var v137: Vector[Double] = v74
    val v40: Vector[Vector[Double]] = v43.p2
    v28 = v28.updated(0, v57)
    v57 = v57.updated(0, v56)
    v137 = v137.updated(0, v85)
    val v81: s0 = v6.p1
    v137 = v137.updated(0, v73)
    v98 = v98.updated(1, v54)
    v18 = v18.copy(p0 = v81)
    val v179: s0 = s0(v40, v14, v40, v137, v9)
    v28 = v28.updated(0, v48)
    v137 = v137.updated(0, v56)
    v5 = v5.copy(p0 = v11)
    v98 = v98.updated(0, v73)
    v15 = v15.updated(0, v56)
    v57 = v57.updated(0, v54)
    v179
  }
  def f73(v0: Vector[s0]): Vector[s0] = {
    var v3: Vector[s0] = v0
    var v1: Vector[s0] = v3
    val v6: s0 = v1(1)
    var v8: s0 = v6
    val v4: s0 = f79(v6)
    val v2: Vector[Vector[Double]] = v8.p0
    val v10: s0 = f79(v4)
    val v18: s0 = f79(v4)
    var v9: Vector[Vector[Double]] = v2
    var v13: Vector[s0] = v0
    val v12: Vector[Vector[Double]] = v10.p1
    val v20: Vector[Vector[Double]] = v6.p0
    val v35: s0 = f79(v10)
    v8 = v8.copy(p2 = v20)
    v1 = v1.updated(2, v35)
    v13 = v13.updated(2, v18)
    val v44: s0 = f79(v6)
    v8 = v8.copy(p1 = v12)
    v8 = v8.copy(p1 = v12)
    val v16: Vector[Double] = v12(0)
    v8 = v6
    var v29: Vector[Vector[Double]] = v2
    var v39: s0 = v8
    val v31: Vector[Vector[Double]] = v10.p2
    v29 = v29.updated(0, v16)
    v3 = v13
    val v51: s0 = f79(v44)
    v39 = v39.copy(p0 = v20)
    var v24: s0 = v39
    val v37: s0 = f79(v24)
    val v47: Vector[Vector[Double]] = v51.p1
    v24 = v24.copy(p4 = v47)
    v39 = v39.copy(p2 = v9)
    v39 = v39.copy(p1 = v47)
    v24 = v24.copy(p1 = v12)
    val v59: s0 = f79(v37)
    v39 = v39.copy(p0 = v29)
    v3 = v3.updated(1, v59)
    v39 = v39.copy(p0 = v31)
    v13
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v7: s2 = v0(1)
    val v2: Vector[s0] = v7.p0
    val v4: Vector[s0] = f73(v2)
    val v6: s0 = v4(1)
    val v3: s1 = s1(v6, v6)
    val v14: s0 = v3.p0
    val v33: Vector[Vector[Double]] = v14.p0
    val v9: Vector[Double] = v33(1)
    var v23: Vector[Double] = v9
    val v12: Double = v23(0)
    v12
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(7.0, 8.0), Vector(Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(17.0, 18.0), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(27.0, 28.0), Vector(Vector(29.0)))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(37.0, 38.0), Vector(Vector(39.0)))), s2(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)), Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(47.0, 48.0), Vector(Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0)), Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(57.0, 58.0), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(67.0, 68.0), Vector(Vector(69.0)))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(77.0, 78.0), Vector(Vector(79.0)))), s2(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(87.0, 88.0), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(97.0, 98.0), Vector(Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)), Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(107.0, 108.0), Vector(Vector(109.0)))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0)), Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(117.0, 118.0), Vector(Vector(119.0)))))
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