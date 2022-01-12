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
    p0: Vector[s0],
    p1: s1,
    p2: s0,
    p3: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s2]]
  )
  def f19(v0: s0): s0 = {
    v0
  }
  def f16(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(0)
    val v6: Vector[Vector[Vector[Double]]] = Vector(v0, v0)
    val v9: Vector[Double] = v0(1)
    var v5: Vector[Double] = v4
    var v1: Vector[Vector[Vector[Double]]] = v6
    var v3: Vector[Double] = v5
    var v8: Vector[Vector[Double]] = v0
    var v2: Vector[Vector[Vector[Double]]] = v1
    val v7: Vector[Vector[Double]] = v2(1)
    val v11: Vector[Vector[Vector[Vector[Double]]]] = Vector(v2, v6, v6, v2, v6)
    v8 = v8.updated(0, v3)
    var v14: Vector[Vector[Vector[Vector[Double]]]] = v11
    var v30: Vector[Vector[Vector[Vector[Double]]]] = v11
    var v13: Vector[Double] = v9
    v30 = v30.updated(4, v2)
    v1 = v1.updated(1, v8)
    val v18: Vector[Vector[Vector[Double]]] = v14(4)
    val v19: Vector[Double] = v8(1)
    val v15: Vector[Vector[Vector[Double]]] = v30(2)
    v2 = v2.updated(0, v7)
    var v23: Vector[Vector[Double]] = v8
    val v10: Vector[Double] = v23(0)
    var v24: Vector[Vector[Double]] = v8
    var v81: Vector[Vector[Double]] = v7
    val v21: Vector[Vector[Double]] = v18(1)
    val v35: Double = v3(0)
    v81 = v81.updated(1, v10)
    v13 = v13.updated(0, v35)
    v8 = v7
    v14 = v14.updated(4, v15)
    var v61: Vector[Vector[Vector[Double]]] = v2
    var v58: Vector[Double] = v3
    val v32: Vector[Vector[Double]] = v1(1)
    v81 = v81.updated(1, v13)
    v61 = v61.updated(0, v24)
    v23 = v81
    val v29: Double = v3(0)
    v3 = v3.updated(0, v35)
    val v85: Vector[Vector[Vector[Double]]] = v30(3)
    v5 = v5.updated(0, v35)
    val v38: Vector[Double] = v81(0)
    v3 = v3.updated(0, v29)
    var v33: Vector[Double] = v58
    v58 = v58.updated(0, v35)
    val v51: Vector[Vector[Vector[Double]]] = Vector(v81, v21, v32, v8, v21)
    var v69: Double = v35
    v33 = v33.updated(0, v29)
    val v98: Vector[Vector[Double]] = v51(3)
    var v87: Vector[Vector[Vector[Double]]] = v51
    v30 = v30.updated(0, v61)
    val v39: Vector[Vector[Double]] = v85(0)
    v8 = v8.updated(0, v13)
    val v111: Double = v29 + v35
    val v158: Vector[Vector[Vector[Double]]] = Vector(v23, v8)
    val v103: Vector[Vector[Vector[Vector[Double]]]] = Vector(v87)
    val v94: Vector[Vector[Vector[Double]]] = v103(0)
    var v170: Double = v111
    v87 = v87.updated(1, v8)
    v8 = v8.updated(1, v33)
    v14 = v14.updated(0, v158)
    v8 = v8.updated(0, v38)
    val v102: Vector[Vector[Double]] = v94(4)
    v2 = v2.updated(0, v39)
    v1 = v1.updated(0, v98)
    v13 = v3
    v8 = v8.updated(1, v19)
    v3 = v3.updated(0, v170)
    v3 = v3.updated(0, v69)
    v102
  }
  def f9(v0: s1): s1 = {
    val v4: s0 = v0.p1
    var v7: s1 = v0
    var v6: s1 = v7
    val v34: s0 = f19(v4)
    val v22: s0 = f19(v34)
    val v35: s0 = f19(v34)
    val v26: s0 = v6.p1
    var v32: s1 = v7
    v7 = v7.copy(p1 = v22)
    v32 = v32.copy(p1 = v26)
    v7 = v7.copy(p1 = v35)
    v32
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: s1 = v0.p0
    val v7: s1 = v0.p0
    val v6: s0 = v5.p1
    var v4: s0 = v6
    var v2: s3 = v0
    val v3: s0 = f19(v4)
    val v11: Vector[Vector[Double]] = v3.p0
    v2 = v2.copy(p0 = v7)
    var v18: Vector[Vector[Double]] = v11
    var v8: Double = v1
    val v10: Double = v8 / v1
    val v14: Vector[Double] = v18(1)
    v18 = v18.updated(1, v14)
    var v12: Vector[Double] = v14
    val v24: s1 = v2.p0
    val v15: s1 = f9(v24)
    val v32: Vector[Vector[Double]] = f16(v18)
    v2 = v2.copy(p0 = v7)
    v12 = v12.updated(0, v10)
    v12 = v12.updated(0, v1)
    v12 = v12.updated(0, v8)
    var v26: s1 = v24
    val v42: Double = v12(0)
    val v29: s1 = f9(v26)
    v12 = v12.updated(0, v42)
    val v22: Vector[Double] = v11(0)
    v18 = v18.updated(1, v22)
    var v54: Vector[Double] = v12
    val v40: Vector[Vector[s2]] = v2.p1
    val v51: Double = v12(0)
    v2 = v2.copy(p1 = v40)
    v18 = v18.updated(0, v54)
    val v41: s0 = v29.p1
    val v101: Double = v22(0)
    v54 = v54.updated(0, v10)
    v2 = v2.copy(p0 = v15)
    val v91: Double = v101 + v51
    v54 = v54.updated(0, v10)
    v4 = v41
    v4 = v4.copy(p0 = v32)
    v91
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(Vector(s2(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))))))), Vector(s2(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), s1(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))), Vector(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)))))))), Vector(s2(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), s1(Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))), s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))), Vector(Vector(s1(Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0)))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), Vector(s1(Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0))), s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)))), s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0))))))))))
    val v1: Double = 117.0
    val start = nanoTime()
    var result: Double = 117.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}