import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[s0],
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: Vector[s1]
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[s0],
    p2: s0,
    p3: s5,
    p4: Vector[s1]
  )
  def f82(v0: Vector[Vector[Double]], v1: s0): s0 = {
    val v4: Vector[Vector[Double]] = v1.p1
    var v11: s0 = v1
    v11 = v11.copy(p0 = v0)
    var v14: s0 = v1
    v14 = v14.copy(p1 = v4)
    val v27: Vector[Vector[Double]] = v1.p1
    val v26: Vector[Vector[Double]] = v11.p1
    v14 = v14.copy(p1 = v27)
    val v31: Vector[Vector[Double]] = v14.p1
    v14 = v14.copy(p1 = v26)
    var v35: s0 = v1
    var v71: Vector[Vector[Double]] = v26
    v11 = v11.copy(p0 = v0)
    var v43: s0 = v35
    v14 = v14.copy(p1 = v71)
    val v68: Vector[Vector[Double]] = v14.p0
    var v54: Vector[Vector[Double]] = v26
    val v56: Vector[s0] = Vector(v14, v11, v35, v35, v35, v43, v35)
    v43 = v43.copy(p1 = v31)
    var v50: Vector[Vector[Double]] = v68
    v43 = v43.copy(p1 = v71)
    var v57: Vector[Vector[Double]] = v54
    v14 = v14.copy(p0 = v50)
    v11 = v11.copy(p1 = v26)
    val v133: s0 = v56(0)
    v14 = v14.copy(p1 = v57)
    v11 = v11.copy(p1 = v4)
    v133
  }
  def f76(v0: s0, v1: s7): s0 = {
    var v8: s7 = v1
    val v24: s0 = v8.p2
    val v10: Vector[Vector[Double]] = v0.p0
    val v18: s0 = f82(v10, v0)
    val v40: s0 = f82(v10, v0)
    val v21: Vector[Vector[Double]] = v18.p0
    v8 = v8.copy(p2 = v24)
    val v36: s5 = v8.p3
    v8 = v1
    v8 = v8.copy(p3 = v36)
    v8 = v8.copy(p2 = v40)
    val v48: Vector[Vector[Double]] = v18.p0
    v8 = v8.copy(p3 = v36)
    val v124: Vector[Vector[Vector[Double]]] = Vector(v21, v10, v48, v21, v21, v21)
    val v91: Vector[Vector[Double]] = v124(0)
    val v88: s0 = f82(v91, v24)
    v88
  }
  def f59(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v4(0)
    val v2: s0 = f82(v4, v0)
    var v7: Vector[Vector[Double]] = v1
    val v6: s0 = f82(v4, v2)
    val v15: Vector[Vector[Double]] = v6.p0
    val v11: Vector[Double] = v1(0)
    v7 = v7.updated(0, v3)
    var v16: Vector[Vector[Double]] = v15
    val v14: s0 = s0(v16, v7)
    v16 = v16.updated(0, v3)
    v7 = v7.updated(1, v11)
    v14
  }
  def f48(v0: s0): s0 = {
    var v5: s0 = v0
    val v6: s0 = f59(v5)
    val v4: Vector[Vector[Double]] = v5.p0
    val v7: s0 = f59(v6)
    var v9: s0 = v6
    v5 = v5.copy(p0 = v4)
    v9 = v7
    var v2: s0 = v7
    val v8: Vector[Double] = v4(0)
    var v10: s0 = v5
    val v1: s0 = f82(v4, v5)
    val v14: Vector[Vector[Double]] = v1.p0
    val v11: s0 = f82(v4, v1)
    val v17: s0 = f59(v5)
    val v12: Vector[Vector[Double]] = v2.p1
    val v21: Vector[Double] = v12(2)
    val v15: Vector[Vector[Double]] = v11.p1
    var v24: s0 = v11
    var v30: Vector[Vector[Double]] = v14
    val v26: Vector[Vector[Double]] = v9.p0
    val v20: s0 = f82(v4, v17)
    val v25: Vector[Vector[Double]] = v24.p1
    val v38: Vector[Double] = v30(0)
    val v28: s0 = s0(v26, v25)
    var v33: Vector[Vector[Double]] = v12
    v2 = v11
    v30 = v30.updated(0, v21)
    val v49: s0 = f82(v30, v28)
    v9 = v9.copy(p0 = v26)
    v33 = v33.updated(1, v8)
    var v48: Vector[Vector[Double]] = v33
    v48 = v12
    v33 = v33.updated(1, v38)
    v2 = v2.copy(p0 = v14)
    val v139: Vector[Vector[Double]] = v10.p1
    val v56: Vector[Vector[Double]] = v20.p0
    val v95: Vector[Vector[Vector[Double]]] = Vector(v30, v4, v56, v26)
    val v178: Vector[Vector[Double]] = v95(3)
    v5 = v5.copy(p0 = v178)
    v5 = v5.copy(p1 = v48)
    v5 = v5.copy(p1 = v15)
    v24 = v24.copy(p1 = v139)
    val v98: Vector[Vector[Double]] = v49.p0
    var v71: s0 = v24
    v71 = v71.copy(p0 = v98)
    v71
  }
  def f31(v0: s7): s7 = {
    var v2: s7 = v0
    v2 = v0
    var v7: s7 = v2
    val v8: s0 = v7.p2
    v2 = v2.copy(p2 = v8)
    v7 = v7.copy(p2 = v8)
    val v3: s0 = f76(v8, v0)
    v2 = v7
    val v9: Vector[Vector[Double]] = v3.p1
    v7 = v7.copy(p2 = v3)
    val v13: s0 = v7.p2
    v7 = v7.copy(p2 = v13)
    v7 = v7.copy(p2 = v8)
    val v6: s0 = f59(v8)
    val v11: s0 = f48(v8)
    var v15: s0 = v3
    v7 = v7.copy(p2 = v15)
    val v32: Vector[Vector[Double]] = v6.p0
    val v17: s0 = f82(v32, v11)
    v7 = v7.copy(p2 = v17)
    v15 = v15.copy(p1 = v9)
    v7
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v2: s7 = f31(v0)
    var v7: Double = v1
    val v6: s0 = v2.p2
    val v11: Vector[Vector[Double]] = v6.p1
    val v3: Vector[Double] = v11(0)
    var v16: Vector[Double] = v3
    v16 = v16.updated(0, v7)
    val v5: Double = v3(0)
    v16 = v16.updated(0, v1)
    v16 = v16.updated(0, v5)
    var v13: Vector[Double] = v16
    v7 = v5
    var v50: Vector[Double] = v13
    val v23: Double = v50(0)
    v13 = v13.updated(0, v23)
    var v53: Double = v7
    v13 = v13.updated(0, v23)
    v50 = v50.updated(0, v5)
    v13 = v13.updated(0, v5)
    val v68: Double = v5 * v23
    v16 = v16.updated(0, v53)
    var v95: Double = v68
    v13 = v13.updated(0, v95)
    v95
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s4(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s1(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))))), s4(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s1(Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), Vector(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))))))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s5(s2(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), Vector(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))), Vector(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0)))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), Vector(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0)))), Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))))), Vector(Vector(s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0)))), Vector(s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0)))), Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))))))))
    val v1: Double = 140.0
    val start = nanoTime()
    var result: Double = 140.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}