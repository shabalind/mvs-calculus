import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Double
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: s2
  )
  case class s4 (
    p0: s1,
    p1: Vector[s3]
  )
  def f108(v0: s1): s1 = {
    var v6: s1 = v0
    val v5: Double = v6.p0
    val v2: Double = v0.p0
    val v18: Double = v6.p0
    val v19: s1 = s1(v2)
    v6 = v0
    v6 = v6.copy(p0 = v18)
    val v26: Double = v19.p0
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p0 = v5)
    v6 = v6.copy(p0 = v26)
    v6
  }
  def f95(v0: s2): s2 = {
    v0
  }
  def f71(v0: s1, v1: s3): s3 = {
    var v131: s3 = v1
    v131
  }
  def f65(v0: s3): s3 = {
    val v4: Vector[s3] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v1: s3 = v4(2)
    val v5: s3 = v4(1)
    var v8: s3 = v5
    val v3: s3 = v4(6)
    val v2: Vector[Vector[s1]] = v5.p0
    val v7: Vector[Vector[s1]] = v3.p0
    val v10: Vector[s1] = v2(0)
    val v13: Vector[Vector[s1]] = v0.p0
    v8 = v8.copy(p0 = v7)
    val v6: s3 = v4(1)
    val v11: s1 = v10(0)
    v8 = v8.copy(p0 = v7)
    val v12: Double = v11.p0
    var v24: Vector[s3] = v4
    var v22: s1 = v11
    val v16: s3 = v24(6)
    val v19: s1 = v10(0)
    val v18: s3 = f71(v22, v8)
    val v34: Double = v19.p0
    val v20: s3 = f71(v19, v18)
    val v17: s2 = v5.p1
    val v49: s2 = f95(v17)
    val v53: s1 = v10(0)
    var v70: s3 = v8
    val v45: Double = v53.p0
    val v23: s3 = f71(v22, v70)
    v70 = v70.copy(p1 = v49)
    val v56: s2 = f95(v49)
    v22 = v22.copy(p0 = v34)
    v8 = v8.copy(p1 = v49)
    v22 = v22.copy(p0 = v12)
    v70 = v20
    val v44: Vector[s3] = Vector(v23, v18, v6, v6, v1, v16)
    v22 = v22.copy(p0 = v45)
    v70 = v70.copy(p0 = v13)
    val v210: s2 = f95(v56)
    v8 = v8.copy(p1 = v210)
    var v213: Vector[s3] = v44
    v213 = v213.updated(0, v3)
    val v150: s3 = v213(4)
    v8 = v8.copy(p0 = v13)
    v150
  }
  def f56(v0: s3): s3 = {
    val v3: s2 = v0.p1
    var v5: s3 = v0
    val v2: Vector[Vector[s1]] = v0.p0
    v5 = v5.copy(p0 = v2)
    var v7: s2 = v3
    var v8: Vector[Vector[s1]] = v2
    var v4: Vector[Vector[s1]] = v2
    v5 = v5.copy(p0 = v4)
    val v1: s2 = f95(v3)
    val v14: s2 = f95(v7)
    val v20: s1 = v1.p0
    val v27: Vector[s1] = v8(0)
    v5 = v5.copy(p1 = v1)
    val v48: s1 = f108(v20)
    val v28: Vector[Vector[s1]] = v5.p0
    v5 = v5.copy(p0 = v28)
    v5 = v5.copy(p1 = v7)
    v4 = v4.updated(0, v27)
    v5 = v5.copy(p1 = v3)
    var v75: s1 = v20
    val v67: s3 = s3(v28, v14)
    val v87: s3 = f71(v75, v67)
    v7 = v7.copy(p0 = v48)
    v5 = v5.copy(p1 = v7)
    v87
  }
  def f54(v0: s2): s2 = {
    val v2: s2 = f95(v0)
    val v1: s2 = f95(v2)
    var v4: s2 = v1
    var v6: s2 = v4
    val v8: s1 = v1.p0
    val v7: s1 = v0.p0
    v6 = v6.copy(p0 = v7)
    val v11: Vector[s1] = Vector(v8, v8, v7, v8, v8)
    val v14: s1 = v11(1)
    var v19: Vector[s1] = v11
    v6 = v6.copy(p0 = v7)
    val v12: Vector[s1] = Vector(v7, v14, v7, v7)
    val v23: s1 = v19(2)
    val v21: s1 = v12(0)
    v6 = v6.copy(p0 = v23)
    v6 = v6.copy(p0 = v21)
    v19 = v19.updated(1, v7)
    val v34: Vector[Vector[s1]] = Vector(v19, v19, v19, v19, v19)
    val v25: s1 = v11(2)
    val v26: Vector[s1] = v34(1)
    v19 = v19.updated(3, v25)
    v19 = v26
    v6
  }
  def f41(v0: s2, v1: s4): s4 = {
    var v5: s4 = v1
    var v4: s4 = v1
    val v10: Vector[s3] = v5.p1
    val v11: Vector[s3] = v4.p1
    v5 = v5.copy(p1 = v11)
    v4 = v4.copy(p1 = v11)
    val v14: Vector[s4] = Vector(v4, v1, v4, v5, v4, v4)
    val v12: s4 = v14(2)
    v4 = v4.copy(p1 = v10)
    var v23: Vector[s4] = v14
    v5 = v5.copy(p1 = v10)
    val v38: s4 = v23(4)
    v23 = v23.updated(5, v12)
    v23 = v14
    var v51: Vector[s4] = v23
    val v108: s4 = v51(5)
    v51 = v51.updated(4, v38)
    val v81: s4 = v51(0)
    v51 = v23
    v51 = v51.updated(5, v108)
    var v132: s4 = v5
    v5 = v1
    v23 = v23.updated(2, v132)
    v81
  }
  def f29(v0: s4): s4 = {
    val v4: Vector[s3] = v0.p1
    val v1: Vector[s3] = v0.p1
    var v2: s4 = v0
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p1 = v4)
    val v7: s3 = v4(0)
    val v6: Vector[s3] = v2.p1
    val v3: s3 = f65(v7)
    var v15: s4 = v2
    val v10: s3 = v1(1)
    var v8: Vector[s3] = v6
    val v12: s3 = f65(v3)
    v2 = v2.copy(p1 = v6)
    v8 = v8.updated(0, v3)
    v8 = v8.updated(1, v7)
    var v28: s4 = v15
    v2 = v2.copy(p1 = v8)
    val v13: s3 = f56(v12)
    val v19: s3 = v6(0)
    val v16: s3 = f56(v13)
    v8 = v8.updated(0, v16)
    val v37: Vector[Vector[s1]] = v19.p0
    v8 = v8.updated(0, v10)
    v15 = v15.copy(p1 = v1)
    val v35: Vector[s1] = v37(0)
    val v48: s3 = v8(1)
    val v26: s1 = v35(0)
    v15 = v15.copy(p0 = v26)
    v28 = v0
    v8 = v8.updated(1, v48)
    val v23: s3 = f71(v26, v10)
    val v51: s1 = f108(v26)
    val v39: s1 = f108(v51)
    v2 = v2.copy(p0 = v39)
    v8 = v8.updated(1, v23)
    v28
  }
  def f27(v0: s4): s4 = {
    var v8: s4 = v0
    v8
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v2: Double = v1 + v1
    val v7: Vector[Vector[s4]] = Vector(v0, v0, v0, v0, v0, v0)
    var v5: Vector[s4] = v0
    var v9: Vector[Vector[s4]] = v7
    var v4: Vector[s4] = v5
    v9 = v9.updated(1, v0)
    val v14: Vector[s4] = v9(0)
    val v6: s4 = v14(2)
    val v8: Vector[s3] = v6.p1
    val v13: s4 = f27(v6)
    v9 = v9.updated(3, v5)
    val v3: s4 = f29(v13)
    v5 = v0
    val v17: s3 = v8(1)
    val v28: s2 = v17.p1
    v4 = v4.updated(0, v13)
    val v21: s3 = v8(1)
    val v19: s2 = f54(v28)
    val v25: s4 = v0(0)
    val v42: Vector[s4] = v9(0)
    val v40: s1 = v13.p0
    val v27: s3 = f71(v40, v21)
    var v22: s4 = v13
    v9 = v9.updated(3, v5)
    val v24: s4 = f41(v19, v25)
    v5 = v5.updated(2, v3)
    val v18: s4 = v4(0)
    var v33: Vector[Vector[s4]] = v9
    var v39: Vector[Vector[s4]] = v33
    val v41: s2 = v27.p1
    val v31: s1 = s1(v2)
    v5 = v5.updated(2, v24)
    val v45: s0 = v41.p1
    var v48: Vector[Vector[s4]] = v39
    val v53: s2 = s2(v31, v45)
    val v57: Vector[s4] = v48(1)
    val v69: Vector[s4] = v33(0)
    v9 = v9.updated(4, v69)
    v33 = v33.updated(5, v0)
    val v104: s1 = v53.p0
    v22 = v22.copy(p0 = v40)
    v5 = v5.updated(2, v22)
    v33 = v33.updated(4, v42)
    v22 = v22.copy(p0 = v104)
    val v93: Double = v104.p0
    v33 = v33.updated(4, v57)
    var v75: Vector[Vector[s4]] = v39
    val v61: Vector[s4] = v33(0)
    v5 = v5.updated(1, v18)
    v33 = v33.updated(5, v61)
    v5 = v5.updated(1, v6)
    v33 = v33.updated(3, v4)
    v9 = v75
    v93
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s1(0.0), Vector(s3(Vector(Vector(s1(1.0))), s2(s1(2.0), s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(6.0), Vector(Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))))), s3(Vector(Vector(s1(13.0))), s2(s1(14.0), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0), Vector(Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))))))), s4(s1(25.0), Vector(s3(Vector(Vector(s1(26.0))), s2(s1(27.0), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(31.0), Vector(Vector(32.0)), Vector(Vector(33.0)), Vector(Vector(34.0)), Vector(Vector(35.0), Vector(36.0), Vector(37.0))))), s3(Vector(Vector(s1(38.0))), s2(s1(39.0), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0), Vector(Vector(44.0)), Vector(Vector(45.0)), Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))))))), s4(s1(50.0), Vector(s3(Vector(Vector(s1(51.0))), s2(s1(52.0), s0(Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(56.0), Vector(Vector(57.0)), Vector(Vector(58.0)), Vector(Vector(59.0)), Vector(Vector(60.0), Vector(61.0), Vector(62.0))))), s3(Vector(Vector(s1(63.0))), s2(s1(64.0), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(68.0), Vector(Vector(69.0)), Vector(Vector(70.0)), Vector(Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))))))))
    val v1: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}