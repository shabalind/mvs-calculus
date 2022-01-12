import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s5 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s8 (
    p0: s5,
    p1: Vector[s5]
  )
  def f116(v0: s0): s0 = {
    var v7: s0 = v0
    v7 = v0
    var v5: s0 = v7
    val v2: Vector[Vector[Double]] = v5.p1
    v5 = v5.copy(p1 = v2)
    val v1: Vector[Double] = v2(1)
    val v6: Vector[Vector[Double]] = v7.p0
    val v4: Vector[Double] = v2(0)
    val v10: Vector[Vector[Double]] = v0.p0
    var v15: Vector[Vector[Double]] = v2
    val v13: Vector[Double] = v6(2)
    var v12: Vector[Vector[Double]] = v6
    v12 = v12.updated(2, v4)
    var v42: Vector[Vector[Double]] = v15
    v7 = v0
    var v21: Vector[Vector[Double]] = v15
    v12 = v12.updated(2, v4)
    v15 = v15.updated(1, v13)
    val v22: Vector[Double] = v2(1)
    val v44: s0 = s0(v10, v42)
    v5 = v5.copy(p0 = v6)
    val v31: Vector[Double] = v10(0)
    v42 = v21
    v15 = v15.updated(1, v1)
    val v50: Vector[Double] = v6(2)
    v7 = v7.copy(p0 = v12)
    v12 = v12.updated(2, v31)
    val v64: Double = v22(0)
    v15 = v15.updated(0, v50)
    var v81: Vector[Double] = v13
    v81 = v81.updated(0, v64)
    var v61: Vector[Vector[Double]] = v6
    v21 = v21.updated(0, v81)
    v5 = v5.copy(p0 = v61)
    v44
  }
  def f90(v0: s0, v1: Vector[s5]): Vector[s5] = {
    var v8: Vector[s5] = v1
    val v9: s5 = v8(0)
    v8 = v1
    v8 = v8.updated(0, v9)
    val v7: s5 = v1(0)
    var v10: Vector[s5] = v1
    v8 = v1
    val v12: s5 = v10(0)
    v10 = v10.updated(0, v12)
    val v20: s5 = v8(0)
    v10 = v10.updated(0, v7)
    v10 = v10.updated(0, v20)
    v8 = v10
    v10
  }
  def f83(v0: Vector[Double]): Vector[Double] = {
    val v4: Double = v0(0)
    var v2: Vector[Double] = v0
    val v9: Double = v0(0)
    v2 = v2.updated(0, v9)
    val v5: Double = v2(0)
    v2 = v2.updated(0, v4)
    val v6: Double = v2(0)
    var v13: Double = v6
    val v11: Double = v2(0)
    val v24: Double = v0(0)
    val v18: Double = v0(0)
    v2 = v2.updated(0, v11)
    v2 = v2.updated(0, v18)
    val v10: Double = v0(0)
    var v8: Vector[Double] = v0
    val v12: Vector[Double] = Vector(v6)
    var v14: Vector[Double] = v2
    val v21: Double = v8(0)
    val v15: Double = v8(0)
    val v23: Double = v14(0)
    val v17: Double = v0(0)
    val v19: Vector[Double] = Vector(v10, v11, v24, v15, v23, v17, v17)
    val v51: Vector[Vector[Double]] = Vector(v19, v19, v19, v19, v19)
    val v26: Vector[Double] = v51(2)
    v14 = v14.updated(0, v6)
    v14 = v14.updated(0, v18)
    v8 = v8.updated(0, v5)
    var v33: Vector[Double] = v12
    val v37: Double = v0(0)
    v33 = v33.updated(0, v37)
    v2 = v2.updated(0, v4)
    v33 = v33.updated(0, v21)
    v14 = v14.updated(0, v13)
    val v44: Double = v8(0)
    var v38: Vector[Double] = v33
    v14 = v38
    v14 = v14.updated(0, v10)
    v33 = v33.updated(0, v21)
    val v60: Double = v44 - v10
    val v48: Double = v26(5)
    v33 = v33.updated(0, v48)
    v2 = v33
    v33 = v33.updated(0, v60)
    v2 = v12
    v38
  }
  def f75(v0: s5): s5 = {
    val v3: Vector[Vector[s0]] = v0.p1
    val v2: s0 = v0.p0
    var v7: s0 = v2
    var v8: s0 = v7
    val v1: Vector[s5] = Vector(v0)
    var v6: Vector[s5] = v1
    val v10: Vector[s0] = v3(0)
    var v11: Vector[Vector[s0]] = v3
    val v5: Vector[Vector[Double]] = v7.p1
    val v12: Vector[Vector[s0]] = v0.p1
    var v35: s5 = v0
    v11 = v11.updated(1, v10)
    var v19: s0 = v2
    val v17: s5 = v6(0)
    val v14: Vector[Vector[s0]] = v35.p1
    val v18: Vector[Vector[Double]] = v7.p1
    var v13: s5 = v17
    val v30: Vector[Double] = v18(1)
    v8 = v8.copy(p1 = v18)
    val v23: Vector[Vector[s5]] = Vector(v6)
    val v46: s0 = f116(v8)
    var v16: Vector[s0] = v10
    v13 = v13.copy(p0 = v46)
    val v44: s0 = v16(0)
    v6 = v6.updated(0, v17)
    val v58: s5 = s5(v7, v11)
    val v24: s0 = f116(v7)
    val v39: Vector[s0] = v11(2)
    val v29: Vector[s5] = v23(0)
    val v31: Vector[Vector[Double]] = v19.p0
    v13 = v13.copy(p1 = v14)
    v11 = v11.updated(0, v16)
    val v47: s0 = v13.p0
    val v33: s0 = f116(v24)
    val v53: s0 = v0.p0
    v6 = v6.updated(0, v13)
    v16 = v16.updated(0, v53)
    v8 = v8.copy(p1 = v5)
    val v55: Vector[Vector[Double]] = v33.p1
    v7 = v7.copy(p0 = v31)
    val v62: Vector[Double] = f83(v30)
    val v56: Vector[Vector[Double]] = v44.p1
    v11 = v11.updated(1, v16)
    val v40: s0 = f116(v19)
    v19 = v19.copy(p0 = v31)
    val v69: s0 = v10(0)
    val v60: s0 = f116(v2)
    v7 = v60
    val v78: Vector[Vector[Double]] = v8.p1
    v13 = v13.copy(p1 = v11)
    v6 = v6.updated(0, v13)
    v13 = v13.copy(p0 = v44)
    v35 = v35.copy(p1 = v12)
    val v94: Vector[s5] = f90(v53, v29)
    v19 = v19.copy(p0 = v31)
    v7 = v2
    val v66: Vector[Vector[s0]] = v58.p1
    val v83: s5 = s5(v47, v66)
    v19 = v19.copy(p1 = v56)
    val v45: Vector[Vector[Double]] = v44.p1
    val v96: Vector[Vector[Double]] = v40.p1
    var v132: Vector[Vector[Double]] = v96
    v19 = v19.copy(p1 = v45)
    v8 = v8.copy(p1 = v78)
    v8 = v8.copy(p0 = v31)
    v6 = v6.updated(0, v83)
    v8 = v8.copy(p1 = v55)
    v16 = v16.updated(0, v46)
    v13 = v13.copy(p0 = v69)
    var v70: Vector[Vector[Double]] = v132
    val v116: s0 = v39(0)
    v132 = v132.updated(1, v62)
    val v85: Vector[Vector[Double]] = v53.p0
    val v191: s5 = v94(0)
    val v242: s0 = v17.p0
    v8 = v8.copy(p1 = v56)
    v8 = v242
    v13 = v0
    v16 = v16.updated(0, v116)
    v8 = v8.copy(p1 = v78)
    v8 = v8.copy(p0 = v85)
    v6 = v6.updated(0, v58)
    v7 = v7.copy(p1 = v70)
    v6 = v6.updated(0, v191)
    v83
  }
  def f44(v0: s8): s8 = {
    val v2: s5 = v0.p0
    val v5: s5 = v0.p0
    val v1: Vector[s5] = Vector(v2, v2, v5, v2, v2)
    val v7: s5 = v1(2)
    val v10: Vector[s5] = v0.p1
    val v21: Vector[Vector[s5]] = Vector(v10, v10, v10, v10)
    val v69: Vector[s5] = v21(2)
    val v95: s8 = s8(v7, v69)
    var v37: s8 = v95
    v37
  }
  def f8(v0: s8): s8 = {
    val v4: Vector[s5] = v0.p1
    val v7: s5 = v4(1)
    var v6: s8 = v0
    val v3: s5 = f75(v7)
    var v2: Vector[s5] = v4
    val v5: s5 = v2(2)
    v6 = v6.copy(p0 = v5)
    v6 = v6.copy(p0 = v3)
    val v27: s8 = f44(v6)
    v27
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v4: s8 = f8(v0)
    val v6: s8 = f44(v4)
    val v3: s5 = v6.p0
    val v8: s0 = v3.p0
    val v9: Vector[Vector[Double]] = v8.p1
    val v13: Vector[Double] = v9(1)
    val v17: Double = v13(0)
    v17
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s5(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), Vector(s5(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))), s5(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), s5(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))))))
    val v1: Double = 80.0
    val start = nanoTime()
    var result: Double = 80.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}