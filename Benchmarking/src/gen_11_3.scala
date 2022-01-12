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
  def f59(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Double] = v2(0)
    var v7: s0 = v0
    var v9: Vector[Vector[Double]] = v3
    v9 = v9.updated(0, v4)
    var v8: Vector[Vector[Double]] = v2
    val v11: Vector[Vector[Double]] = v7.p0
    val v5: Vector[Vector[Double]] = v7.p1
    var v10: Vector[Vector[Double]] = v11
    v7 = v7.copy(p0 = v10)
    v8 = v8.updated(0, v4)
    var v17: Vector[Vector[Double]] = v11
    var v16: Vector[Vector[Double]] = v9
    v7 = v7.copy(p0 = v11)
    val v21: Vector[Double] = v17(0)
    v8 = v8.updated(0, v21)
    val v12: Vector[Vector[Double]] = v7.p0
    val v24: Vector[Double] = v17(1)
    val v27: Vector[Vector[Double]] = v7.p1
    val v50: Vector[Double] = v10(1)
    v17 = v17.updated(2, v21)
    v8 = v8.updated(0, v50)
    val v37: Vector[Double] = v12(2)
    var v30: s0 = v7
    val v23: Vector[Vector[Double]] = v30.p1
    v16 = v16.updated(0, v4)
    var v36: s0 = v0
    var v101: s0 = v36
    val v56: s0 = s0(v10, v16)
    val v67: Vector[Vector[Double]] = v101.p0
    val v63: Vector[Vector[Double]] = v56.p0
    v30 = v30.copy(p0 = v67)
    v36 = v36.copy(p0 = v17)
    v17 = v17.updated(2, v37)
    val v85: Vector[Vector[Double]] = v56.p0
    v9 = v9.updated(0, v24)
    v36 = v36.copy(p1 = v23)
    val v71: s0 = s0(v67, v5)
    v30 = v0
    v30 = v30.copy(p1 = v9)
    v8 = v3
    v36 = v36.copy(p1 = v27)
    v7 = v7.copy(p0 = v85)
    v101 = v101.copy(p1 = v8)
    val v137: Vector[Vector[Double]] = v30.p0
    v7 = v7.copy(p0 = v63)
    v17 = v137
    v71
  }
  def f4(v0: s0): s0 = {
    var v3: s0 = v0
    val v2: s0 = f59(v3)
    var v6: s0 = v0
    val v1: s0 = f59(v3)
    val v4: s0 = f59(v3)
    val v8: s0 = f59(v2)
    var v9: s0 = v4
    val v5: Vector[Vector[Double]] = v1.p0
    val v11: s0 = f59(v8)
    var v15: Vector[Vector[Double]] = v5
    val v17: Vector[Vector[Double]] = v3.p0
    var v10: Vector[Vector[Double]] = v17
    val v21: Vector[Vector[Double]] = v4.p0
    val v18: Vector[Double] = v5(0)
    var v16: s0 = v1
    val v26: Vector[Vector[Double]] = v9.p0
    v3 = v3.copy(p0 = v15)
    val v22: Vector[Double] = v21(1)
    var v14: Vector[Vector[Double]] = v17
    var v20: Vector[Double] = v18
    var v33: Vector[Vector[Double]] = v14
    val v42: Vector[Double] = v26(1)
    val v24: s0 = f59(v0)
    var v35: Vector[Vector[Double]] = v17
    val v19: Vector[Double] = v10(1)
    val v41: Vector[Vector[Double]] = v24.p0
    var v36: s0 = v11
    val v51: Vector[Vector[Double]] = Vector(v42, v20, v19, v20, v19, v20, v20)
    v33 = v33.updated(1, v22)
    v14 = v14.updated(1, v22)
    var v37: Vector[Double] = v19
    val v104: s0 = f59(v16)
    v16 = v16.copy(p0 = v15)
    val v55: Double = v37(0)
    val v49: Vector[Vector[Vector[Double]]] = Vector(v51, v51)
    var v61: Double = v55
    v20 = v20.updated(0, v55)
    var v40: s0 = v36
    val v66: s0 = f59(v104)
    v40 = v40.copy(p0 = v41)
    v37 = v37.updated(0, v55)
    v36 = v36.copy(p0 = v33)
    v3 = v3.copy(p0 = v35)
    val v72: s0 = f59(v40)
    val v79: s0 = f59(v72)
    val v112: s0 = f59(v66)
    var v70: Vector[Vector[Double]] = v15
    v14 = v14.updated(1, v19)
    val v80: Vector[Vector[Double]] = v49(0)
    val v58: Vector[Double] = v80(1)
    val v94: s0 = f59(v79)
    val v97: Vector[Vector[Double]] = v6.p1
    val v82: Double = v61 / v55
    val v87: Vector[Double] = v97(0)
    val v48: Vector[Vector[Double]] = v112.p0
    v14 = v14.updated(2, v58)
    v15 = v15.updated(2, v87)
    v10 = v10.updated(2, v58)
    v9 = v9.copy(p0 = v70)
    val v177: s0 = f59(v94)
    val v137: s0 = f59(v177)
    v16 = v16.copy(p1 = v97)
    v37 = v37.updated(0, v82)
    v6 = v6.copy(p0 = v48)
    v137
  }
  @noinline
  def f0(v0: s1, v1: Vector[s1], v2: Double): Double = {
    val v4: Double = v2 / v2
    val v7: s0 = v0.p1
    var v6: s0 = v7
    val v5: s0 = f4(v6)
    val v15: Vector[Vector[Double]] = v6.p0
    val v10: Vector[Vector[Double]] = v5.p0
    val v14: Vector[Double] = v15(1)
    var v21: Vector[Vector[Double]] = v10
    val v26: Double = v14(0)
    v21 = v21.updated(1, v14)
    v6 = v6.copy(p0 = v21)
    val v40: Double = v4 * v26
    v6 = v6.copy(p0 = v10)
    v40
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))))
    val v2: Double = 64.0
    val start = nanoTime()
    var result: Double = 64.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}