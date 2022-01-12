import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0,
    p1: Vector[Vector[s2]]
  )
  def f111(v0: s0): s0 = {
    var v1: s0 = v0
    var v2: s0 = v1
    var v6: s0 = v0
    v2 = v1
    val v3: Vector[Vector[Double]] = v6.p0
    val v11: Vector[Vector[Double]] = v1.p0
    var v4: Vector[Vector[Double]] = v3
    val v9: Vector[Vector[Double]] = v2.p2
    val v7: Vector[Double] = v3(0)
    val v10: s0 = s0(v11, v4, v9)
    v6 = v6.copy(p1 = v11)
    var v8: s0 = v6
    var v14: Vector[Vector[Double]] = v9
    var v22: s0 = v8
    v14 = v14.updated(0, v7)
    val v17: Vector[Double] = v9(0)
    val v16: Vector[Vector[Double]] = v1.p1
    var v21: Vector[Vector[Double]] = v9
    v14 = v14.updated(1, v17)
    v4 = v4.updated(1, v17)
    val v28: Vector[Vector[Double]] = v22.p0
    val v24: Vector[Vector[Double]] = v0.p1
    v4 = v4.updated(0, v17)
    val v52: Vector[Double] = v16(2)
    v4 = v4.updated(1, v7)
    v14 = v14.updated(0, v17)
    v4 = v4.updated(2, v52)
    val v23: Vector[Double] = v21(1)
    v4 = v4.updated(1, v23)
    val v55: Vector[Vector[Double]] = v2.p2
    val v40: Vector[Double] = v14(0)
    v21 = v9
    var v27: Vector[Vector[Double]] = v28
    v21 = v14
    val v44: Vector[Vector[Double]] = v22.p2
    v14 = v14.updated(1, v40)
    v6 = v6.copy(p1 = v11)
    v14 = v14.updated(1, v17)
    val v69: Vector[Vector[Double]] = v6.p0
    v1 = v1.copy(p2 = v44)
    v6 = v6.copy(p1 = v69)
    val v31: Vector[Vector[Double]] = v1.p0
    val v45: Vector[Vector[Double]] = v10.p0
    v22 = v22.copy(p1 = v24)
    v22 = v22.copy(p2 = v55)
    var v38: Vector[Vector[Double]] = v27
    var v306: Vector[Vector[Double]] = v55
    v1 = v1.copy(p0 = v31)
    var v114: Vector[Vector[Double]] = v38
    val v120: Vector[Vector[Double]] = v1.p0
    val v54: s0 = s0(v45, v27, v306)
    v22 = v22.copy(p0 = v114)
    v1 = v1.copy(p0 = v38)
    v2 = v2.copy(p1 = v120)
    v54
  }
  def f107(v0: s0): s0 = {
    var v6: s0 = v0
    var v2: s0 = v6
    val v5: s0 = f111(v0)
    var v7: s0 = v6
    var v11: s0 = v6
    var v17: s0 = v6
    var v3: s0 = v0
    val v10: Vector[Vector[Double]] = v11.p1
    val v13: Vector[Vector[Double]] = v0.p1
    val v14: s0 = f111(v2)
    val v24: Vector[Vector[Double]] = v17.p0
    v11 = v11.copy(p1 = v10)
    val v34: s0 = f111(v3)
    var v22: s0 = v14
    val v47: Vector[Vector[Double]] = v5.p2
    v3 = v3.copy(p2 = v47)
    val v19: s0 = f111(v22)
    v2 = v2.copy(p0 = v10)
    val v27: Vector[Vector[Double]] = v2.p0
    val v36: Vector[Vector[Double]] = v7.p0
    v11 = v11.copy(p0 = v13)
    val v28: s0 = f111(v19)
    v6 = v6.copy(p1 = v27)
    val v61: Vector[Vector[Double]] = v17.p0
    v7 = v7.copy(p1 = v61)
    v2 = v2.copy(p1 = v36)
    val v58: s0 = f111(v28)
    val v93: Vector[Vector[Double]] = v34.p0
    v22 = v22.copy(p0 = v24)
    v22 = v19
    v7 = v7.copy(p1 = v93)
    v58
  }
  def f102(v0: s2): s2 = {
    val v4: Vector[s0] = v0.p1
    val v3: Vector[s0] = v0.p1
    val v2: s0 = v4(0)
    val v7: s1 = v0.p0
    val v9: Vector[s2] = Vector(v0, v0, v0, v0, v0)
    val v28: s0 = v3(0)
    var v22: Vector[s0] = v3
    val v14: s2 = v9(0)
    var v27: s2 = v14
    v27 = v27.copy(p1 = v22)
    var v37: s1 = v7
    v37 = v37.copy(p0 = v4)
    v27 = v27.copy(p1 = v3)
    v27 = v27.copy(p0 = v37)
    v37 = v37.copy(p1 = v2)
    val v33: s0 = f111(v28)
    v37 = v37.copy(p1 = v33)
    v27
  }
  def f100(v0: s3, v1: s3, v2: s3): s3 = {
    val v4: Vector[s3] = Vector(v2)
    var v5: Vector[s3] = v4
    val v7: s3 = v4(0)
    v5 = v5.updated(0, v1)
    v5 = v4
    v5 = v5.updated(0, v0)
    var v28: s3 = v0
    v5 = v5.updated(0, v28)
    var v24: Vector[s3] = v4
    v5 = v5.updated(0, v0)
    v24 = v5
    v24 = v24.updated(0, v7)
    v24 = v24.updated(0, v7)
    v24 = v24.updated(0, v2)
    val v19: s3 = v24(0)
    v19
  }
  def f99(v0: Double): Double = {
    var v5: Double = v0
    v5 = v0
    v5 = v0
    val v1: Vector[Double] = Vector(v5, v5)
    var v2: Double = v5
    var v11: Vector[Double] = v1
    val v7: Double = v1(0)
    var v8: Double = v0
    val v3: Double = v11(0)
    v11 = v11.updated(0, v2)
    var v4: Vector[Double] = v1
    var v17: Double = v0
    val v9: Double = v1(1)
    val v22: Double = v4(1)
    val v10: Double = v1(0)
    v4 = v4.updated(1, v7)
    var v19: Vector[Double] = v4
    v17 = v5
    v19 = v19.updated(0, v22)
    val v21: Double = v10 + v22
    var v24: Vector[Double] = v19
    val v18: Double = v19(0)
    val v15: Double = v19(0)
    v4 = v4.updated(1, v18)
    var v20: Vector[Double] = v1
    v19 = v19.updated(0, v3)
    val v13: Double = v11(1)
    v19 = v19.updated(1, v9)
    val v39: Double = v20(0)
    v24 = v24.updated(1, v21)
    val v44: Double = v11(0)
    v19 = v19.updated(1, v13)
    v24 = v24.updated(0, v17)
    v19 = v19.updated(0, v8)
    val v32: Double = v11(0)
    v19 = v19.updated(0, v32)
    val v47: Double = v1(0)
    val v78: Double = v24(0)
    v5 = v47
    val v46: Vector[Double] = Vector(v44, v39, v15, v78, v17)
    val v126: Double = v46(4)
    v126
  }
  def f75(v0: s2): s2 = {
    val v3: Vector[s2] = Vector(v0, v0, v0, v0)
    val v11: s2 = v3(1)
    v11
  }
  def f70(v0: Vector[s2]): Vector[s2] = {
    val v1: s2 = v0(0)
    var v6: s2 = v1
    val v5: Vector[s2] = Vector(v6, v6)
    val v10: Vector[s0] = v6.p1
    var v14: Vector[s0] = v10
    val v9: s0 = v14(0)
    val v12: s0 = f107(v9)
    val v40: s0 = f107(v12)
    val v22: s2 = v5(0)
    val v60: s0 = f107(v9)
    v14 = v14.updated(0, v60)
    val v73: s2 = f75(v22)
    var v49: Vector[s2] = v0
    val v27: s1 = s1(v10, v40)
    v49 = v49.updated(0, v73)
    v6 = v6.copy(p0 = v27)
    var v105: Vector[s2] = v49
    v105
  }
  def f45(v0: s3): s3 = {
    val v6: s3 = f100(v0, v0, v0)
    var v4: s3 = v0
    val v3: Vector[Vector[s2]] = v6.p1
    v4 = v4.copy(p1 = v3)
    val v9: Vector[s2] = v3(1)
    var v11: s3 = v0
    val v8: Vector[s2] = f70(v9)
    v4 = v4.copy(p1 = v3)
    v11 = v11.copy(p1 = v3)
    v11 = v11.copy(p1 = v3)
    val v14: Vector[Vector[s2]] = v6.p1
    val v5: s2 = v8(0)
    var v20: Vector[Vector[s2]] = v14
    val v16: Vector[s2] = v20(1)
    val v23: Vector[s2] = f70(v8)
    var v30: Vector[s2] = v9
    v11 = v11.copy(p1 = v14)
    v11 = v11.copy(p1 = v20)
    val v19: s2 = f102(v5)
    v20 = v20.updated(1, v23)
    val v70: s3 = f100(v4, v11, v4)
    v20 = v20.updated(0, v16)
    v20 = v20.updated(1, v30)
    v30 = v30.updated(0, v19)
    v20 = v20.updated(1, v16)
    v4 = v4.copy(p1 = v3)
    v70
  }
  @noinline
  def f0(v0: s1, v1: s3, v2: Double): Double = {
    val v28: s3 = f45(v1)
    val v68: s0 = v28.p0
    val v73: Vector[Vector[Double]] = v68.p0
    val v81: Vector[Double] = v73(2)
    val v42: Double = v81(0)
    val v109: Double = f99(v42)
    var v108: Double = v109
    v108 = v109
    v108
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))
    val v1: s3 = s3(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(Vector(s2(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))))), Vector(s2(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))))
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