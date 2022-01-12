import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0],
    p2: Vector[s0],
    p3: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s1
  )
  case class s6 (
    p0: s3,
    p1: s3
  )
  def f107(v0: s1): s1 = {
    var v7: s1 = v0
    val v4: Vector[s0] = v7.p2
    val v1: Vector[s0] = v0.p2
    val v3: Vector[s0] = v7.p3
    val v2: Vector[s0] = v0.p2
    v7 = v7.copy(p2 = v4)
    val v5: s3 = s3(v7)
    v7 = v7.copy(p3 = v3)
    var v15: s1 = v0
    var v13: s3 = v5
    v7 = v15
    v15 = v15.copy(p2 = v1)
    v13 = v13.copy(p0 = v15)
    val v46: s0 = v2(0)
    val v41: s1 = v13.p0
    val v26: s1 = v13.p0
    val v50: s1 = v13.p0
    var v81: s1 = v41
    v7 = v7.copy(p0 = v46)
    var v37: s3 = v13
    v13 = v13.copy(p0 = v50)
    val v52: s1 = v37.p0
    val v105: s2 = s2(v81, v52)
    v37 = v37.copy(p0 = v26)
    val v190: s1 = v105.p1
    v190
  }
  def f104(v0: s3, v1: s3, v2: Double): s3 = {
    v0
  }
  def f94(v0: Vector[s0]): Vector[s0] = {
    val v7: Vector[Vector[s0]] = Vector(v0, v0)
    val v8: Vector[s0] = v7(1)
    val v3: s0 = v8(1)
    val v12: Vector[Vector[Double]] = v3.p0
    val v6: Vector[Vector[Double]] = v3.p1
    var v2: s0 = v3
    val v17: Vector[Vector[Double]] = v3.p0
    val v1: Vector[s0] = v7(0)
    val v11: Vector[s0] = v7(0)
    val v25: Vector[Vector[Double]] = v3.p0
    val v39: Vector[Vector[Double]] = v2.p0
    val v20: Vector[Double] = v12(0)
    v2 = v2.copy(p0 = v17)
    val v23: Vector[Vector[Double]] = v3.p1
    v2 = v2.copy(p1 = v23)
    val v27: s0 = v11(0)
    var v29: Vector[Vector[Double]] = v6
    v2 = v2.copy(p1 = v6)
    var v33: Vector[s0] = v1
    val v45: Vector[Vector[Double]] = v2.p1
    v33 = v33.updated(0, v2)
    v2 = v2.copy(p1 = v29)
    v2 = v2.copy(p1 = v6)
    v33 = v33.updated(0, v27)
    val v46: Vector[Double] = v23(0)
    v2 = v2.copy(p1 = v29)
    v29 = v29.updated(0, v20)
    val v98: s0 = v0(1)
    val v49: Vector[Vector[Double]] = v3.p0
    val v73: Vector[Vector[Double]] = v3.p1
    var v69: Vector[Vector[Double]] = v39
    v2 = v2.copy(p1 = v73)
    v2 = v2.copy(p0 = v69)
    val v83: Vector[Vector[Double]] = v98.p1
    v2 = v27
    v29 = v29.updated(0, v46)
    val v55: s0 = s0(v12, v83)
    v2 = v2.copy(p1 = v6)
    v2 = v2.copy(p0 = v25)
    v2 = v2.copy(p0 = v49)
    v2 = v2.copy(p1 = v83)
    val v67: Vector[Vector[Double]] = v55.p1
    v2 = v2.copy(p1 = v45)
    v2 = v2.copy(p1 = v67)
    v2 = v2.copy(p1 = v29)
    v2 = v2.copy(p1 = v45)
    v33
  }
  def f88(v0: s3): s3 = {
    var v4: s3 = v0
    val v5: s6 = s6(v0, v4)
    val v6: Vector[s3] = Vector(v4, v4, v0, v0, v4, v4)
    val v8: s1 = v0.p0
    var v1: s3 = v0
    var v9: s6 = v5
    var v21: s3 = v0
    val v13: s1 = v0.p0
    val v15: s1 = v1.p0
    val v7: Vector[s0] = v13.p1
    val v17: Vector[s0] = f94(v7)
    v21 = v21.copy(p0 = v13)
    val v16: s0 = v17(1)
    v21 = v21.copy(p0 = v8)
    var v38: Vector[s3] = v6
    val v30: s3 = v38(2)
    v38 = v38.updated(2, v4)
    v21 = v21.copy(p0 = v15)
    val v43: s3 = v9.p0
    val v35: Vector[Vector[Double]] = v16.p1
    v9 = v9.copy(p0 = v43)
    val v56: Vector[Double] = v35(0)
    val v77: Double = v56(0)
    val v102: Vector[Double] = v35(0)
    val v45: s3 = v9.p1
    v1 = v1.copy(p0 = v13)
    val v73: s3 = f104(v45, v21, v77)
    val v78: s3 = f104(v73, v30, v77)
    val v66: Double = v102(0)
    val v128: s3 = f104(v78, v1, v66)
    v21 = v78
    v38 = v38.updated(3, v45)
    v128
  }
  def f87(v0: s3, v1: s0): s0 = {
    var v4: s3 = v0
    val v2: s1 = v4.p0
    var v5: s1 = v2
    val v12: s1 = v4.p0
    v4 = v4.copy(p0 = v12)
    var v3: s1 = v12
    val v6: Vector[s0] = v3.p1
    val v9: Vector[s0] = v12.p2
    val v8: Vector[s0] = f94(v6)
    val v16: s1 = f107(v2)
    val v36: s1 = f107(v16)
    val v13: Vector[s0] = v36.p1
    var v18: Vector[s0] = v8
    var v19: Vector[s0] = v9
    val v35: s0 = v19(1)
    val v33: s0 = v13(0)
    v19 = v19.updated(0, v33)
    val v31: s0 = v8(1)
    v19 = v19.updated(1, v33)
    v3 = v3.copy(p2 = v6)
    v19 = v19.updated(1, v31)
    v19 = v19.updated(1, v1)
    val v63: Vector[s0] = f94(v6)
    v4 = v4.copy(p0 = v5)
    var v71: Vector[s0] = v18
    v3 = v3.copy(p1 = v71)
    val v116: Vector[s0] = f94(v63)
    val v86: s0 = v116(0)
    v4 = v4.copy(p0 = v3)
    v4 = v4.copy(p0 = v36)
    v3 = v3.copy(p0 = v35)
    v86
  }
  def f66(v0: s0): s0 = {
    var v2: s0 = v0
    val v1: Vector[Vector[Double]] = v2.p1
    var v5: Vector[Vector[Double]] = v1
    val v3: Vector[Vector[Double]] = v0.p1
    v2 = v2.copy(p1 = v5)
    val v6: Vector[Vector[Double]] = v2.p0
    v5 = v3
    var v7: Vector[Vector[Double]] = v6
    val v4: Vector[Double] = v6(0)
    val v9: Vector[Vector[Double]] = v0.p1
    var v8: Vector[Vector[Double]] = v6
    val v10: Vector[Vector[Double]] = v2.p1
    v5 = v5.updated(0, v4)
    val v12: Vector[Double] = v8(2)
    val v16: Vector[Double] = v1(0)
    var v13: s0 = v0
    val v25: Vector[Vector[Vector[Double]]] = Vector(v5, v10)
    v8 = v7
    v7 = v7.updated(1, v16)
    v13 = v13.copy(p0 = v6)
    val v26: Vector[Vector[Double]] = v0.p0
    v5 = v5.updated(0, v4)
    v5 = v5.updated(0, v12)
    val v15: Vector[Vector[Double]] = v25(0)
    v8 = v26
    v7 = v7.updated(1, v4)
    val v28: Vector[Double] = v26(0)
    v2 = v2.copy(p1 = v9)
    v7 = v7.updated(0, v16)
    v13 = v13.copy(p0 = v6)
    v5 = v5.updated(0, v28)
    v13 = v13.copy(p0 = v26)
    v13 = v13.copy(p1 = v15)
    v13
  }
  def f52(v0: s1): s1 = {
    val v1: s1 = f107(v0)
    val v2: s0 = v1.p0
    var v24: s1 = v0
    val v26: s0 = f66(v2)
    v24 = v24.copy(p0 = v26)
    v24
  }
  def f43(v0: s1, v1: s3): s1 = {
    val v3: s1 = v1.p0
    var v6: s1 = v3
    val v8: s1 = f52(v6)
    val v13: s1 = v1.p0
    val v27: Vector[s0] = v8.p2
    var v18: Vector[s0] = v27
    var v21: s1 = v13
    val v15: s0 = v18(0)
    v6 = v6.copy(p2 = v27)
    val v25: Vector[s0] = Vector(v15, v15, v15, v15, v15, v15, v15)
    val v24: s0 = v25(6)
    val v39: s0 = v25(6)
    var v50: s1 = v21
    v18 = v18.updated(1, v39)
    v50 = v50.copy(p2 = v18)
    val v57: Vector[s0] = v6.p2
    v21 = v21.copy(p1 = v18)
    v50 = v50.copy(p1 = v57)
    v21 = v21.copy(p0 = v24)
    v50
  }
  def f37(v0: s3, v1: s0): s3 = {
    val v8: s0 = f66(v1)
    val v6: Vector[s3] = Vector(v0, v0, v0, v0, v0)
    val v2: s3 = v6(2)
    val v11: Vector[Vector[Double]] = v8.p1
    val v28: Vector[Double] = v11(0)
    val v34: s3 = v6(1)
    val v39: Double = v28(0)
    val v61: s3 = f88(v2)
    val v58: s3 = f104(v61, v34, v39)
    v58
  }
  def f29(v0: s3, v1: s1): s1 = {
    var v2: s1 = v1
    val v6: Vector[s0] = v1.p2
    val v5: s0 = v1.p0
    v2 = v2.copy(p1 = v6)
    v2 = v2.copy(p0 = v5)
    val v4: s0 = f87(v0, v5)
    val v7: Vector[Vector[Double]] = v4.p1
    v2 = v2.copy(p2 = v6)
    val v11: Vector[s0] = v2.p3
    val v8: s3 = f37(v0, v4)
    var v15: s3 = v0
    val v9: Vector[Double] = v7(0)
    val v13: s3 = f88(v8)
    val v12: s0 = v11(0)
    val v16: Double = v9(0)
    v2 = v2.copy(p3 = v11)
    val v14: Vector[s0] = f94(v6)
    v15 = v15.copy(p0 = v2)
    val v39: s3 = f104(v0, v15, v16)
    v2 = v2.copy(p1 = v6)
    var v27: s1 = v2
    var v21: Vector[s0] = v11
    var v20: s3 = v13
    val v23: s0 = v2.p0
    val v51: s0 = v21(0)
    val v37: s0 = v14(1)
    val v31: s3 = f37(v20, v51)
    val v25: Vector[s0] = v1.p2
    v21 = v21.updated(0, v12)
    val v47: Vector[Double] = v7(0)
    v20 = v20.copy(p0 = v1)
    val v50: Double = v47(0)
    v2 = v2.copy(p2 = v25)
    val v55: s1 = v20.p0
    v20 = v20.copy(p0 = v27)
    val v65: s1 = f52(v2)
    v20 = v20.copy(p0 = v27)
    val v104: s1 = v8.p0
    val v78: s1 = v31.p0
    v15 = v15.copy(p0 = v55)
    v21 = v21.updated(0, v37)
    val v80: Vector[s1] = Vector(v65, v2, v78, v1, v55, v104)
    v20 = v20.copy(p0 = v2)
    val v86: s1 = v80(0)
    v21 = v21.updated(0, v23)
    val v48: s3 = f104(v8, v39, v50)
    v20 = v20.copy(p0 = v55)
    v20 = v48
    v86
  }
  @noinline
  def f0(v0: Vector[s3], v1: s3, v2: Double): Double = {
    val v3: s3 = v0(1)
    val v4: s1 = v1.p0
    val v9: s1 = f52(v4)
    val v30: s1 = f29(v3, v9)
    val v10: s1 = f43(v9, v3)
    val v13: s1 = v1.p0
    var v39: s1 = v13
    val v50: s3 = v0(0)
    val v26: s1 = f43(v10, v50)
    val v19: Vector[s0] = v39.p2
    val v28: s0 = v26.p0
    val v33: s1 = v50.p0
    v39 = v39.copy(p0 = v28)
    val v35: s0 = v19(0)
    val v48: s0 = v30.p0
    v39 = v39.copy(p0 = v48)
    val v60: Vector[Vector[Double]] = v35.p1
    val v64: Vector[Double] = v60(0)
    val v89: Vector[s0] = v33.p3
    v39 = v39.copy(p3 = v89)
    val v43: Vector[s0] = v26.p1
    val v68: Double = v64(0)
    val v57: s0 = v43(1)
    v39 = v39.copy(p0 = v57)
    v68
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), s3(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))))
    val v1: s3 = s3(s1(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0)))), Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))
    val v2: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}