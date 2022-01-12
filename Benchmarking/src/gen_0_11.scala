import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: s2
  )
  case class s7 (
    p0: s1,
    p1: s3
  )
  case class s11 (
    p0: Double,
    p1: s3
  )
  def f89(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p1
    val v2: Vector[s0] = v0.p0
    var v8: Vector[s0] = v2
    val v4: Vector[s0] = v0.p0
    val v13: s0 = v6(2)
    val v12: Vector[Vector[Double]] = v13.p0
    val v7: Vector[Vector[Double]] = v13.p0
    val v9: Vector[Vector[Double]] = v13.p0
    val v14: Vector[Vector[Double]] = v13.p1
    var v20: s0 = v13
    val v15: Vector[Vector[Double]] = v20.p0
    var v19: Vector[Vector[Double]] = v14
    v20 = v20.copy(p1 = v14)
    val v37: Vector[Vector[Double]] = v13.p0
    var v48: s1 = v0
    v8 = v8.updated(1, v20)
    v8 = v6
    val v60: Vector[s0] = v0.p1
    val v38: Vector[Vector[Vector[Double]]] = Vector(v37, v15, v9, v7, v37)
    v8 = v4
    v48 = v48.copy(p0 = v60)
    val v26: Vector[Vector[Double]] = v38(3)
    val v42: Vector[Vector[Double]] = v20.p0
    v20 = v20.copy(p0 = v42)
    val v67: s0 = s0(v12, v19)
    v48 = v48.copy(p1 = v8)
    v48 = v48.copy(p1 = v8)
    v8 = v8.updated(1, v67)
    v20 = v20.copy(p0 = v26)
    v48
  }
  def f68(v0: s7): s7 = {
    v0
  }
  def f61(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Double] = v4(2)
    val v2: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Vector[Double]]] = Vector(v4, v4, v4)
    val v7: Vector[Vector[Double]] = v8(1)
    val v3: Vector[Double] = v4(0)
    val v9: Vector[Vector[Double]] = v0.p0
    val v13: Vector[Vector[Double]] = v0.p0
    var v6: Vector[Vector[Double]] = v2
    var v16: Vector[Vector[Vector[Double]]] = v8
    val v14: s0 = s0(v4, v2)
    val v15: Vector[Double] = v13(2)
    var v18: Vector[Vector[Double]] = v6
    var v19: Vector[Vector[Double]] = v6
    val v28: Vector[Vector[Double]] = v0.p1
    var v17: Vector[Vector[Double]] = v4
    val v23: s0 = s0(v9, v2)
    val v51: Vector[Double] = v28(0)
    val v30: Vector[Vector[Double]] = v14.p0
    val v48: Vector[Vector[Double]] = v23.p1
    v17 = v17.updated(0, v1)
    v16 = v16.updated(2, v13)
    v18 = v19
    val v47: Vector[Double] = v48(0)
    val v74: Vector[Vector[Double]] = v14.p1
    v17 = v17.updated(2, v1)
    v17 = v17.updated(2, v47)
    val v50: s0 = s0(v30, v6)
    v19 = v19.updated(0, v51)
    v17 = v17.updated(2, v3)
    var v27: Vector[Vector[Double]] = v74
    val v39: Vector[Vector[Double]] = v23.p0
    val v42: Vector[Vector[Double]] = v50.p0
    v17 = v7
    var v33: s0 = v14
    val v60: Vector[Double] = v6(0)
    v33 = v33.copy(p0 = v9)
    v33 = v33.copy(p1 = v6)
    v33 = v33.copy(p1 = v18)
    val v32: Vector[Vector[Double]] = v33.p0
    val v72: Vector[Double] = v32(1)
    v16 = v16.updated(0, v17)
    v16 = v16.updated(1, v39)
    v33 = v33.copy(p0 = v42)
    v19 = v19.updated(0, v3)
    v27 = v27.updated(0, v60)
    v19 = v19.updated(0, v1)
    v19 = v19.updated(0, v72)
    val v91: Vector[Vector[Double]] = v16(2)
    v16 = v16.updated(1, v9)
    v18 = v18.updated(0, v15)
    v33 = v33.copy(p1 = v74)
    v33 = v33.copy(p0 = v17)
    v17 = v17.updated(1, v1)
    val v258: s0 = s0(v32, v27)
    v17 = v91
    v258
  }
  def f27(v0: s1, v1: s7): s7 = {
    val v6: s1 = v1.p0
    val v4: s7 = f68(v1)
    val v7: s1 = v1.p0
    val v9: s7 = f68(v4)
    var v2: s7 = v4
    var v12: s1 = v7
    val v11: s1 = f89(v12)
    val v14: Vector[s0] = v6.p0
    v12 = v12.copy(p0 = v14)
    val v10: s1 = f89(v11)
    val v16: s0 = v14(2)
    val v22: s0 = f61(v16)
    var v17: s1 = v10
    val v27: s0 = v14(2)
    v12 = v12.copy(p1 = v14)
    val v20: s0 = v14(0)
    var v18: s0 = v16
    val v13: s0 = v14(1)
    val v26: s1 = v2.p0
    var v28: Vector[s0] = v14
    val v43: s0 = f61(v18)
    val v50: s0 = f61(v43)
    val v19: Vector[Vector[Double]] = v43.p1
    val v71: s0 = v28(1)
    var v29: s0 = v50
    var v30: s7 = v2
    v28 = v28.updated(1, v50)
    val v35: s3 = v1.p1
    v29 = v29.copy(p1 = v19)
    v28 = v28.updated(1, v13)
    v17 = v17.copy(p1 = v14)
    v28 = v28.updated(0, v18)
    var v48: s3 = v35
    v17 = v17.copy(p1 = v28)
    val v102: s3 = v2.p1
    v30 = v30.copy(p0 = v17)
    var v32: s0 = v71
    v28 = v28.updated(1, v29)
    v28 = v28.updated(0, v43)
    v32 = v32.copy(p1 = v19)
    v28 = v28.updated(0, v22)
    v28 = v28.updated(0, v20)
    v30 = v30.copy(p1 = v48)
    v28 = v28.updated(0, v16)
    v18 = v18.copy(p1 = v19)
    v28 = v28.updated(1, v27)
    v28 = v28.updated(2, v20)
    v12 = v12.copy(p1 = v14)
    v28 = v28.updated(2, v32)
    val v91: Vector[s0] = v26.p1
    v17 = v17.copy(p0 = v28)
    v17 = v17.copy(p1 = v14)
    v30 = v30.copy(p0 = v17)
    v17 = v17.copy(p1 = v91)
    v2 = v2.copy(p1 = v102)
    v30 = v9
    v30
  }
  def f12(v0: Double, v1: s11): s11 = {
    val v7: Double = v1.p0
    var v6: s11 = v1
    v6 = v6.copy(p0 = v0)
    v6 = v6.copy(p0 = v0)
    v6 = v6.copy(p0 = v7)
    val v4: s3 = v6.p1
    v6 = v6.copy(p1 = v4)
    val v3: Vector[Double] = Vector(v0, v0, v0, v0)
    v6 = v1
    val v11: Double = v3(2)
    val v26: Double = v3(2)
    var v16: s11 = v6
    v16 = v16.copy(p0 = v11)
    v6 = v6.copy(p0 = v26)
    val v85: s11 = s11(v0, v4)
    var v61: s3 = v4
    v16 = v85
    v6 = v6.copy(p0 = v7)
    v6 = v6.copy(p0 = v7)
    v16 = v16.copy(p1 = v61)
    v16
  }
  @noinline
  def f0(v0: s1, v1: Vector[s7], v2: Double): Double = {
    val v4: s7 = v1(0)
    val v6: Double = v2 + v2
    val v11: s7 = f68(v4)
    var v12: s1 = v0
    val v29: s7 = f27(v12, v11)
    val v25: s3 = v29.p1
    val v36: s11 = s11(v6, v25)
    val v43: s11 = f12(v6, v36)
    val v39: Double = v43.p0
    val v45: Double = v39 + v2
    val v35: Double = v45 + v39
    v35
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))
    val v1: Vector[s7] = Vector(s7(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), s3(s2(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), s2(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))))), s7(s1(Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), s3(s2(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))), s2(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))))), s7(s1(Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))), Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))), s3(s2(s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0))), Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0))))), s2(s0(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(139.0))), Vector(s0(Vector(Vector(140.0), Vector(141.0), Vector(142.0)), Vector(Vector(143.0))))))))
    val v2: Double = 144.0
    val start = nanoTime()
    var result: Double = 144.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}