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
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s2]
  )
  case class s4 (
    p0: s1,
    p1: Vector[Vector[s3]]
  )
  def f42(v0: s0, v1: s3): s3 = {
    var v17: s3 = v1
    v17
  }
  def f39(v0: s0): s0 = {
    val v1: Vector[s0] = Vector(v0)
    val v13: s0 = v1(0)
    val v10: s1 = s1(v1, v13)
    var v36: s1 = v10
    val v71: Vector[s1] = Vector(v36, v36, v10, v10, v10, v36)
    val v28: s1 = v71(4)
    val v38: s0 = v28.p1
    v38
  }
  def f22(v0: s0): s0 = {
    var v3: s0 = v0
    var v2: s0 = v3
    val v1: s0 = f39(v3)
    var v9: s0 = v1
    val v5: s0 = f39(v0)
    val v4: s0 = f39(v5)
    val v12: s0 = f39(v2)
    val v13: Vector[Vector[Double]] = v12.p1
    val v26: Vector[s0] = Vector(v9, v0, v5, v0, v4, v0)
    val v17: s0 = v26(2)
    val v27: Vector[Vector[Double]] = v3.p1
    val v30: Vector[Vector[Double]] = v9.p0
    val v32: Vector[Vector[Double]] = v5.p0
    var v51: Vector[s0] = v26
    v2 = v2.copy(p0 = v27)
    v2 = v2.copy(p1 = v30)
    val v44: Vector[Vector[Double]] = v4.p0
    v2 = v2.copy(p0 = v44)
    v51 = v26
    val v62: Vector[Vector[Double]] = v17.p1
    v51 = v51.updated(3, v12)
    v2 = v2.copy(p0 = v13)
    val v117: Vector[Vector[s0]] = Vector(v26, v26, v51, v51, v26, v26)
    val v40: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p0 = v62)
    val v122: Vector[s0] = v117(0)
    v9 = v9.copy(p0 = v44)
    v3 = v3.copy(p0 = v32)
    v2 = v2.copy(p0 = v40)
    v3 = v3.copy(p1 = v30)
    val v78: s0 = v122(3)
    v78
  }
  def f12(v0: Double, v1: s3): Double = {
    var v4: s3 = v1
    v4 = v1
    val v2: Vector[s2] = v4.p0
    var v6: Vector[s2] = v2
    v4 = v4.copy(p0 = v6)
    val v7: Vector[s2] = v4.p0
    val v8: Vector[s2] = v4.p0
    val v13: s2 = v7(0)
    v4 = v4.copy(p0 = v7)
    val v9: s2 = v8(0)
    v6 = v6.updated(0, v13)
    v6 = v6.updated(0, v9)
    val v14: s2 = v6(0)
    val v26: Vector[s2] = v4.p0
    val v18: Vector[s2] = v4.p0
    val v15: Vector[s2] = v1.p0
    val v10: s2 = v26(0)
    v4 = v4.copy(p0 = v26)
    v6 = v6.updated(0, v14)
    val v20: s2 = v2(0)
    val v21: s3 = s3(v18)
    val v34: s2 = v18(0)
    val v33: s2 = v18(0)
    var v19: Vector[s2] = v18
    val v27: s2 = v6(0)
    var v30: s2 = v10
    var v16: s3 = v4
    val v54: s3 = s3(v6)
    v4 = v4.copy(p0 = v26)
    val v29: Vector[Vector[s0]] = v27.p1
    v30 = v30.copy(p1 = v29)
    val v50: Vector[Vector[s2]] = Vector(v6)
    val v43: s2 = v18(0)
    v19 = v19.updated(0, v20)
    val v28: Vector[Vector[s0]] = v9.p1
    v6 = v6.updated(0, v20)
    var v17: s3 = v16
    v19 = v19.updated(0, v9)
    var v24: Vector[Vector[s0]] = v29
    var v35: Vector[s2] = v19
    val v38: Vector[s2] = v50(0)
    val v36: Vector[s1] = v34.p0
    val v66: s2 = v35(0)
    val v45: Vector[s2] = v17.p0
    val v65: s2 = v19(0)
    v16 = v16.copy(p0 = v15)
    v30 = v30.copy(p1 = v28)
    var v49: s2 = v30
    val v59: Vector[s1] = v49.p0
    val v37: Vector[s2] = v21.p0
    var v68: Vector[s1] = v36
    val v39: Vector[s2] = v54.p0
    val v67: s3 = s3(v39)
    val v61: Vector[s1] = v49.p0
    v19 = v19.updated(0, v33)
    v6 = v6.updated(0, v33)
    v17 = v17.copy(p0 = v38)
    v35 = v35.updated(0, v13)
    v4 = v4.copy(p0 = v39)
    v49 = v49.copy(p1 = v28)
    v6 = v6.updated(0, v66)
    val v53: s1 = v68(2)
    val v85: s1 = v59(1)
    val v41: Vector[s0] = v53.p0
    v16 = v16.copy(p0 = v2)
    v30 = v30.copy(p0 = v59)
    val v130: Vector[s1] = v27.p0
    v49 = v49.copy(p0 = v61)
    v17 = v67
    val v90: s1 = v59(0)
    v4 = v4.copy(p0 = v38)
    val v122: s2 = v38(0)
    val v120: s0 = v85.p1
    v17 = v17.copy(p0 = v35)
    v4 = v4.copy(p0 = v45)
    val v69: s0 = v90.p1
    v24 = v24.updated(0, v41)
    val v71: s0 = f22(v69)
    v35 = v35.updated(0, v43)
    val v104: s1 = v130(1)
    v68 = v68.updated(1, v104)
    v30 = v30.copy(p0 = v130)
    val v72: s0 = f22(v120)
    v19 = v19.updated(0, v10)
    val v142: s3 = f42(v72, v67)
    v16 = v16.copy(p0 = v45)
    v30 = v30.copy(p1 = v24)
    val v113: Vector[Vector[Double]] = v71.p1
    v19 = v19.updated(0, v122)
    v4 = v4.copy(p0 = v37)
    v68 = v68.updated(0, v104)
    val v134: Vector[Vector[s0]] = v13.p1
    v30 = v30.copy(p1 = v134)
    v30 = v30.copy(p0 = v59)
    val v105: Vector[Double] = v113(0)
    v6 = v6.updated(0, v65)
    v17 = v142
    val v402: Double = v105(0)
    v402
  }
  @noinline
  def f0(v0: Vector[s4], v1: Vector[s0], v2: Double): Double = {
    val v6: s0 = v1(0)
    val v7: Vector[Vector[Double]] = v6.p0
    val v23: Vector[Double] = v7(0)
    val v14: Double = v23(0)
    val v21: s4 = v0(0)
    val v27: Vector[Vector[s3]] = v21.p1
    val v77: Vector[s3] = v27(0)
    val v44: s3 = v77(0)
    val v40: Double = f12(v14, v44)
    v40
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(Vector(s3(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))))))), Vector(s3(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), s1(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), s0(Vector(Vector(30.0)), Vector(Vector(31.0))))), Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))))))))))), s4(s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(Vector(s3(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), s0(Vector(Vector(42.0)), Vector(Vector(43.0)))), s1(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))))), Vector(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0))))))))), Vector(s3(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), s0(Vector(Vector(58.0)), Vector(Vector(59.0)))), s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), s1(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0)))), s0(Vector(Vector(66.0)), Vector(Vector(67.0))))), Vector(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0))))))))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0))))
    val v2: Double = 74.0
    val start = nanoTime()
    var result: Double = 74.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}