import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Double,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s1
  )
  def f61(v0: s1): s1 = {
    val v7: Vector[s0] = v0.p1
    val v2: s0 = v7(0)
    val v6: Vector[Vector[Double]] = v2.p0
    val v22: Vector[Double] = v6(1)
    val v10: Vector[s0] = v0.p1
    var v29: Vector[Double] = v22
    val v19: Double = v0.p0
    val v17: Double = v29(0)
    var v24: s1 = v0
    val v26: Double = v19 / v17
    v24 = v24.copy(p0 = v26)
    v24 = v24.copy(p1 = v10)
    v24
  }
  def f60(v0: s0): s0 = {
    var v4: s0 = v0
    var v6: s0 = v0
    val v3: Vector[Vector[Double]] = v4.p0
    val v11: Vector[Double] = v4.p1
    val v19: Vector[Double] = v3(1)
    val v2: Double = v11(1)
    val v22: Double = v11(0)
    val v14: Vector[Vector[Double]] = v0.p0
    val v24: Vector[Vector[Double]] = v6.p0
    v4 = v4.copy(p1 = v11)
    val v15: s0 = s0(v24, v11)
    val v23: Vector[Double] = v6.p1
    val v16: s0 = s0(v14, v23)
    var v29: Vector[Vector[Double]] = v24
    val v17: Vector[Double] = v6.p1
    val v28: Vector[Vector[Double]] = v6.p0
    val v36: Vector[Double] = v28(1)
    var v25: s0 = v16
    v6 = v6.copy(p1 = v23)
    val v61: Vector[Double] = v29(1)
    val v31: Double = v61(0)
    var v45: s0 = v25
    var v87: Vector[Double] = v11
    v45 = v45.copy(p1 = v17)
    v29 = v29.updated(1, v36)
    val v122: Double = v19(0)
    val v92: Double = v122 * v22
    v87 = v87.updated(1, v92)
    val v125: Vector[Vector[Double]] = v4.p0
    v45 = v45.copy(p1 = v87)
    v6 = v6.copy(p0 = v125)
    val v255: Vector[Double] = Vector(v2, v31)
    val v186: Vector[s0] = Vector(v45, v4, v6)
    v25 = v15
    v25 = v25.copy(p1 = v255)
    val v98: s0 = v186(0)
    v98
  }
  def f52(v0: s1, v1: s1, v2: s1): s1 = {
    val v3: s3 = s3(v0)
    val v5: s1 = v3.p0
    val v8: Double = v1.p0
    var v15: Double = v8
    var v4: s1 = v5
    v4 = v4.copy(p0 = v15)
    val v13: s1 = v3.p0
    val v9: s1 = f61(v13)
    v4 = v9
    v4 = v4.copy(p0 = v8)
    v4
  }
  def f48(v0: s1): s1 = {
    var v3: s1 = v0
    var v1: s1 = v3
    var v5: s1 = v3
    var v4: s1 = v0
    var v10: s1 = v3
    val v7: s1 = f61(v1)
    var v8: s1 = v7
    val v11: Double = v5.p0
    val v13: Double = v1.p0
    var v9: s1 = v10
    var v2: Double = v13
    val v23: Vector[s0] = v7.p1
    val v18: s1 = f52(v9, v10, v10)
    val v22: s0 = v23(0)
    var v16: Vector[s0] = v23
    var v29: s1 = v18
    v16 = v16.updated(0, v22)
    v3 = v3.copy(p0 = v11)
    val v21: Vector[s0] = v29.p1
    val v31: s1 = f61(v4)
    var v73: Double = v2
    val v25: s0 = v23(0)
    v16 = v16.updated(0, v22)
    val v20: s0 = v23(0)
    val v24: Vector[Double] = v20.p1
    val v33: Vector[Double] = v22.p1
    val v71: s0 = f60(v22)
    val v61: Vector[Vector[Double]] = v25.p0
    v9 = v9.copy(p1 = v16)
    val v32: s0 = v23(0)
    v5 = v5.copy(p0 = v13)
    val v45: s0 = s0(v61, v24)
    val v50: s1 = s1(v73, v16)
    v16 = v16.updated(0, v32)
    val v38: Double = v33(0)
    v1 = v1.copy(p1 = v21)
    val v169: Vector[s0] = v8.p1
    v16 = v16.updated(0, v45)
    v16 = v16.updated(0, v45)
    v5 = v5.copy(p1 = v23)
    v16 = v16.updated(0, v32)
    val v117: Double = v31.p0
    v3 = v3.copy(p1 = v169)
    v9 = v9.copy(p0 = v117)
    val v48: Double = v31.p0
    v3 = v3.copy(p1 = v16)
    v29 = v29.copy(p1 = v23)
    v16 = v16.updated(0, v71)
    v29 = v29.copy(p0 = v38)
    v2 = v48
    v10 = v10.copy(p0 = v38)
    v50
  }
  def f46(v0: s1): s1 = {
    var v1: s1 = v0
    var v3: s1 = v1
    var v6: s1 = v1
    val v7: Vector[s0] = v1.p1
    var v5: Vector[s0] = v7
    val v2: s0 = v7(0)
    var v12: s0 = v2
    var v10: s0 = v12
    val v9: Vector[Double] = v12.p1
    val v13: s3 = s3(v0)
    var v17: Vector[s0] = v7
    var v4: s1 = v0
    v1 = v1.copy(p1 = v5)
    var v16: s0 = v10
    v16 = v16.copy(p1 = v9)
    val v14: Vector[Vector[Double]] = v12.p0
    val v18: s3 = s3(v6)
    val v15: s1 = f52(v0, v3, v4)
    v3 = v3.copy(p1 = v17)
    v5 = v5.updated(0, v10)
    val v29: Vector[Vector[Double]] = v16.p0
    val v32: s1 = f52(v15, v0, v4)
    v5 = v5.updated(0, v16)
    val v25: s1 = v18.p0
    v17 = v17.updated(0, v16)
    v5 = v5.updated(0, v12)
    v12 = v12.copy(p0 = v29)
    v1 = v1.copy(p1 = v5)
    v16 = v16.copy(p0 = v14)
    val v22: Vector[Double] = v2.p1
    val v72: s1 = f52(v0, v3, v6)
    v3 = v3.copy(p1 = v17)
    v17 = v17.updated(0, v10)
    val v36: s1 = v13.p0
    val v62: s1 = f52(v36, v3, v1)
    val v93: s3 = s3(v0)
    val v56: s1 = v93.p0
    val v79: s0 = f60(v16)
    v17 = v17.updated(0, v79)
    val v77: s1 = f48(v62)
    val v44: s0 = v5(0)
    v12 = v12.copy(p1 = v22)
    val v50: Vector[s1] = Vector(v25, v32, v0, v77)
    v4 = v56
    val v159: s0 = s0(v29, v9)
    val v91: Vector[s0] = v62.p1
    v16 = v16.copy(p0 = v29)
    v17 = v17.updated(0, v44)
    val v84: s1 = v50(0)
    v1 = v1.copy(p1 = v91)
    val v297: s1 = f52(v72, v84, v77)
    var v95: s0 = v159
    v12 = v95
    val v123: s1 = f61(v297)
    v123
  }
  def f43(v0: s1): s1 = {
    var v3: s1 = v0
    val v2: Vector[s0] = v3.p1
    val v6: Vector[s0] = v0.p1
    val v8: s1 = f61(v3)
    val v1: s0 = v2(0)
    val v7: s1 = f61(v0)
    var v5: s1 = v0
    val v17: s1 = f46(v8)
    v3 = v3.copy(p1 = v6)
    var v9: Vector[s0] = v2
    v5 = v5.copy(p1 = v9)
    val v15: s1 = f52(v7, v3, v0)
    v9 = v9.updated(0, v1)
    val v10: Double = v7.p0
    val v11: Double = v5.p0
    val v19: s1 = f52(v17, v15, v8)
    var v24: s1 = v19
    val v16: s1 = f46(v3)
    var v33: s1 = v16
    v5 = v17
    v5 = v7
    val v23: s1 = f61(v17)
    val v26: Vector[s0] = v3.p1
    val v21: s0 = v6(0)
    v9 = v9.updated(0, v21)
    val v49: Vector[Double] = v1.p1
    val v40: s2 = s2(v17, v17)
    var v54: s2 = v40
    v3 = v3.copy(p0 = v10)
    var v42: Vector[Double] = v49
    val v45: Double = v15.p0
    var v69: Double = v11
    var v80: Double = v10
    val v139: s1 = f52(v8, v24, v23)
    val v41: Double = v8.p0
    var v72: Double = v45
    val v147: s1 = v54.p0
    v3 = v3.copy(p1 = v6)
    val v51: Double = v42(1)
    v42 = v42.updated(0, v69)
    v72 = v69
    val v73: s1 = f52(v33, v24, v139)
    v54 = v54.copy(p0 = v8)
    v3 = v3.copy(p0 = v72)
    v42 = v42.updated(1, v80)
    var v44: Double = v80
    v69 = v44
    val v90: s1 = f52(v8, v147, v73)
    v9 = v26
    var v105: s1 = v90
    v33 = v33.copy(p0 = v51)
    val v103: s1 = f46(v105)
    v24 = v24.copy(p0 = v41)
    v103
  }
  @noinline
  def f0(v0: Vector[s2], v1: s1, v2: Vector[s3], v3: Vector[Vector[s2]], v4: Double): Double = {
    val v18: s1 = f43(v1)
    val v5: Double = v18.p0
    var v21: Double = v5
    val v20: Vector[Double] = Vector(v4, v21, v4, v5, v5, v21)
    val v31: Double = v20(0)
    v31
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(s1(0.0, Vector(s0(Vector(Vector(1.0), Vector(2.0)), Vector(3.0, 4.0)))), s1(5.0, Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(8.0, 9.0))))), s2(s1(10.0, Vector(s0(Vector(Vector(11.0), Vector(12.0)), Vector(13.0, 14.0)))), s1(15.0, Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(18.0, 19.0))))), s2(s1(20.0, Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(23.0, 24.0)))), s1(25.0, Vector(s0(Vector(Vector(26.0), Vector(27.0)), Vector(28.0, 29.0))))))
    val v1: s1 = s1(30.0, Vector(s0(Vector(Vector(31.0), Vector(32.0)), Vector(33.0, 34.0))))
    val v2: Vector[s3] = Vector(s3(s1(35.0, Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(38.0, 39.0))))))
    val v3: Vector[Vector[s2]] = Vector(Vector(s2(s1(40.0, Vector(s0(Vector(Vector(41.0), Vector(42.0)), Vector(43.0, 44.0)))), s1(45.0, Vector(s0(Vector(Vector(46.0), Vector(47.0)), Vector(48.0, 49.0)))))), Vector(s2(s1(50.0, Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(53.0, 54.0)))), s1(55.0, Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(58.0, 59.0)))))))
    val v4: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}