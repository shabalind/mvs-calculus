import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  case class s5 (
    p0: s2,
    p1: Vector[s3]
  )
  case class s6 (
    p0: Vector[s2]
  )
  def f56(v0: Double): Double = {
    var v3: Double = v0
    var v5: Double = v0
    var v4: Double = v0
    v4 = v3
    var v7: Double = v3
    var v9: Double = v4
    val v2: Vector[Double] = Vector(v5, v5, v4, v0, v3, v9, v9)
    var v20: Vector[Double] = v2
    var v8: Vector[Double] = v2
    val v21: Double = v2(4)
    val v22: Double = v20(3)
    var v12: Vector[Double] = v8
    v12 = v12.updated(4, v7)
    var v18: Vector[Double] = v2
    val v30: Double = v21 / v3
    val v27: Double = v2(6)
    val v33: Double = v18(4)
    val v44: Double = v30 * v22
    var v35: Double = v33
    var v24: Double = v4
    var v19: Vector[Double] = v12
    val v58: Double = v19(2)
    v12 = v12.updated(1, v44)
    v8 = v8.updated(2, v35)
    v12 = v12.updated(4, v24)
    v7 = v33
    var v51: Vector[Double] = v19
    v12 = v12.updated(4, v35)
    v20 = v20.updated(5, v58)
    v19 = v19.updated(2, v33)
    val v63: Double = v51(1)
    v8 = v8.updated(3, v63)
    v7 = v27
    v63
  }
  def f39(v0: s0): s0 = {
    val v4: Vector[Double] = v0.p0
    val v6: Vector[Vector[Double]] = v0.p1
    val v7: Vector[Double] = v6(0)
    var v20: s0 = v0
    var v45: s0 = v20
    v45 = v45.copy(p0 = v4)
    var v19: s0 = v45
    var v31: s0 = v19
    val v21: Vector[Double] = v31.p0
    v45 = v45.copy(p0 = v7)
    val v68: Vector[Double] = v19.p0
    v45 = v45.copy(p0 = v68)
    val v32: Vector[Vector[Double]] = v19.p1
    v45 = v45.copy(p0 = v4)
    val v89: Vector[Vector[Double]] = v19.p1
    val v158: s0 = s0(v21, v32)
    val v163: Vector[Double] = v89(0)
    v20 = v20.copy(p0 = v163)
    v158
  }
  def f38(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p1
    var v5: s0 = v0
    var v13: s0 = v5
    v5 = v5.copy(p1 = v1)
    v5 = v5.copy(p1 = v1)
    v13
  }
  def f17(v0: Vector[Double]): Vector[Double] = {
    var v4: Vector[Double] = v0
    val v2: Double = v4(0)
    v4 = v4.updated(0, v2)
    val v5: Double = f56(v2)
    var v7: Vector[Double] = v0
    v7 = v7.updated(0, v2)
    val v3: Double = f56(v2)
    var v6: Double = v5
    val v8: Double = f56(v3)
    val v11: Double = f56(v3)
    var v14: Vector[Double] = v4
    val v16: Double = v7(0)
    var v9: Vector[Double] = v4
    v9 = v9.updated(0, v8)
    v4 = v4.updated(0, v11)
    var v1: Double = v6
    val v10: Double = v4(0)
    val v29: Double = v9(0)
    var v34: Vector[Double] = v0
    var v33: Double = v3
    var v37: Double = v10
    val v17: Double = f56(v37)
    var v12: Vector[Double] = v34
    var v19: Double = v16
    v19 = v11
    var v27: Vector[Double] = v7
    val v28: Double = v12(0)
    val v25: Double = v14(0)
    val v40: Double = v34(0)
    v4 = v4.updated(0, v40)
    v12 = v12.updated(0, v33)
    v12 = v12.updated(0, v40)
    var v23: Double = v25
    val v35: Vector[Vector[Double]] = Vector(v14, v14, v12, v27, v0, v0)
    val v57: Vector[Double] = v35(2)
    v27 = v27.updated(0, v17)
    v12 = v12.updated(0, v11)
    v4 = v4.updated(0, v3)
    val v43: Double = f56(v1)
    val v47: Double = f56(v25)
    v9 = v9.updated(0, v16)
    v27 = v27.updated(0, v10)
    v12 = v12.updated(0, v28)
    v12 = v12.updated(0, v43)
    val v31: Double = f56(v47)
    var v54: Vector[Double] = v57
    v54 = v54.updated(0, v29)
    v12 = v12.updated(0, v23)
    v14 = v14.updated(0, v11)
    v14 = v14.updated(0, v16)
    var v71: Double = v40
    v34 = v34.updated(0, v19)
    v54 = v54.updated(0, v31)
    v9 = v9.updated(0, v71)
    v23 = v1
    v4 = v4.updated(0, v47)
    var v143: Vector[Double] = v54
    v143
  }
  def f14(v0: Double, v1: s0): Double = {
    val v4: Vector[Vector[Double]] = v1.p1
    val v2: Vector[Double] = v4(0)
    var v6: Vector[Vector[Double]] = v4
    val v7: Vector[Double] = f17(v2)
    var v3: s0 = v1
    var v10: Vector[Vector[Double]] = v6
    val v16: s0 = s0(v7, v4)
    val v20: Vector[Double] = f17(v7)
    val v9: s0 = f38(v16)
    v10 = v10.updated(0, v7)
    var v12: Vector[Double] = v20
    val v11: Vector[Vector[Double]] = v1.p1
    val v26: s0 = f39(v3)
    v3 = v3.copy(p0 = v20)
    val v21: Vector[Vector[Double]] = v9.p1
    val v15: Vector[Double] = v11(0)
    v10 = v10.updated(0, v15)
    v6 = v6.updated(0, v15)
    val v17: Vector[Vector[Double]] = v1.p1
    val v25: s0 = f39(v9)
    val v30: Vector[Double] = v26.p0
    v3 = v3.copy(p0 = v30)
    val v47: Vector[Double] = v25.p0
    v3 = v3.copy(p1 = v21)
    v3 = v3.copy(p1 = v10)
    v3 = v3.copy(p0 = v12)
    v3 = v3.copy(p1 = v21)
    val v34: Double = v30(0)
    val v53: Double = f56(v34)
    val v24: Double = v47(0)
    val v59: Double = f56(v24)
    val v44: Vector[Double] = v17(0)
    v3 = v3.copy(p0 = v44)
    val v77: Double = v53 / v59
    v77
  }
  @noinline
  def f0(v0: s0, v1: Vector[s6], v2: Vector[Vector[s5]], v3: s2, v4: Double): Double = {
    val v10: Vector[Double] = v0.p0
    var v7: Vector[Double] = v10
    var v8: s0 = v0
    v7 = v7.updated(0, v4)
    val v17: Double = v4 * v4
    val v14: Double = v10(0)
    v8 = v8.copy(p0 = v10)
    v7 = v7.updated(0, v4)
    v8 = v8.copy(p0 = v7)
    v8 = v8.copy(p0 = v7)
    var v35: Vector[Double] = v10
    v8 = v8.copy(p0 = v35)
    v8 = v8.copy(p0 = v7)
    val v60: Double = v7(0)
    val v29: Double = v4 + v17
    val v33: Double = v60 + v60
    v35 = v7
    val v31: Double = v14 * v33
    val v43: Vector[Double] = f17(v35)
    val v68: Double = v43(0)
    val v54: Double = v17 / v31
    var v51: Double = v29
    val v39: Vector[Double] = f17(v7)
    val v52: Double = v54 * v51
    val v56: Double = v39(0)
    v8 = v8.copy(p0 = v35)
    v35 = v35.updated(0, v56)
    val v87: Double = v43(0)
    v35 = v35.updated(0, v68)
    v7 = v7.updated(0, v60)
    v35 = v35.updated(0, v87)
    val v122: Double = v54 * v52
    val v221: Double = f14(v68, v8)
    v7 = v7.updated(0, v221)
    v122
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(0.0), Vector(Vector(1.0)))
    val v1: Vector[s6] = Vector(s6(Vector(s2(s0(Vector(2.0), Vector(Vector(3.0))), Vector(Vector(s1(Vector(s0(Vector(4.0), Vector(Vector(5.0)))), s0(Vector(6.0), Vector(Vector(7.0))))), Vector(s1(Vector(s0(Vector(8.0), Vector(Vector(9.0)))), s0(Vector(10.0), Vector(Vector(11.0))))))), s2(s0(Vector(12.0), Vector(Vector(13.0))), Vector(Vector(s1(Vector(s0(Vector(14.0), Vector(Vector(15.0)))), s0(Vector(16.0), Vector(Vector(17.0))))), Vector(s1(Vector(s0(Vector(18.0), Vector(Vector(19.0)))), s0(Vector(20.0), Vector(Vector(21.0))))))))))
    val v2: Vector[Vector[s5]] = Vector(Vector(s5(s2(s0(Vector(22.0), Vector(Vector(23.0))), Vector(Vector(s1(Vector(s0(Vector(24.0), Vector(Vector(25.0)))), s0(Vector(26.0), Vector(Vector(27.0))))), Vector(s1(Vector(s0(Vector(28.0), Vector(Vector(29.0)))), s0(Vector(30.0), Vector(Vector(31.0))))))), Vector(s3(s1(Vector(s0(Vector(32.0), Vector(Vector(33.0)))), s0(Vector(34.0), Vector(Vector(35.0)))), s1(Vector(s0(Vector(36.0), Vector(Vector(37.0)))), s0(Vector(38.0), Vector(Vector(39.0))))), s3(s1(Vector(s0(Vector(40.0), Vector(Vector(41.0)))), s0(Vector(42.0), Vector(Vector(43.0)))), s1(Vector(s0(Vector(44.0), Vector(Vector(45.0)))), s0(Vector(46.0), Vector(Vector(47.0))))), s3(s1(Vector(s0(Vector(48.0), Vector(Vector(49.0)))), s0(Vector(50.0), Vector(Vector(51.0)))), s1(Vector(s0(Vector(52.0), Vector(Vector(53.0)))), s0(Vector(54.0), Vector(Vector(55.0)))))))))
    val v3: s2 = s2(s0(Vector(56.0), Vector(Vector(57.0))), Vector(Vector(s1(Vector(s0(Vector(58.0), Vector(Vector(59.0)))), s0(Vector(60.0), Vector(Vector(61.0))))), Vector(s1(Vector(s0(Vector(62.0), Vector(Vector(63.0)))), s0(Vector(64.0), Vector(Vector(65.0)))))))
    val v4: Double = 66.0
    val start = nanoTime()
    var result: Double = 66.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}