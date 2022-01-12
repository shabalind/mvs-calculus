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
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: s2,
    p1: s0
  )
  def f117(v0: s2): s2 = {
    var v11: s2 = v0
    v11
  }
  def f114(v0: s5): s5 = {
    var v4: s5 = v0
    var v5: s5 = v0
    val v2: s0 = v4.p1
    val v7: Vector[s5] = Vector(v5, v0, v4, v4, v4, v0, v0)
    val v3: s2 = v0.p0
    val v10: s2 = f117(v3)
    var v9: Vector[s5] = v7
    val v31: s2 = f117(v3)
    v5 = v5.copy(p1 = v2)
    val v17: s2 = f117(v31)
    val v22: s5 = v9(1)
    val v13: Vector[s0] = Vector(v2, v2, v2, v2)
    val v20: s0 = v13(1)
    val v21: s2 = f117(v17)
    v4 = v4.copy(p1 = v2)
    v5 = v5.copy(p0 = v3)
    var v16: s2 = v10
    val v30: s2 = f117(v3)
    v9 = v9.updated(0, v4)
    v4 = v4.copy(p0 = v16)
    val v35: Vector[s0] = v21.p0
    var v40: Vector[s0] = v35
    v5 = v5.copy(p0 = v17)
    val v58: s0 = v0.p1
    val v60: s0 = v40(0)
    var v103: s5 = v22
    v103 = v103.copy(p1 = v60)
    v5 = v5.copy(p1 = v2)
    v5 = v5.copy(p1 = v20)
    v103 = v5
    v103 = v103.copy(p0 = v30)
    v103 = v103.copy(p1 = v58)
    v103
  }
  def f112(v0: s2): s2 = {
    val v1: s2 = f117(v0)
    val v2: s2 = f117(v1)
    val v8: s2 = f117(v1)
    val v5: Vector[Vector[s1]] = v8.p1
    var v7: Vector[Vector[s1]] = v5
    var v3: Vector[Vector[s1]] = v7
    val v13: s2 = f117(v2)
    val v4: Vector[s1] = v7(0)
    val v19: s2 = f117(v13)
    var v18: Vector[s1] = v4
    val v15: s1 = v18(0)
    val v10: s1 = v4(0)
    var v14: s1 = v10
    val v17: s2 = f117(v19)
    val v32: Vector[s1] = v7(0)
    val v22: Vector[s1] = Vector(v14, v15, v10, v15, v15)
    val v36: Vector[Vector[s1]] = v17.p1
    val v31: s1 = v18(0)
    val v21: Vector[s1] = v7(0)
    var v30: Vector[s1] = v21
    val v34: Vector[s0] = v8.p0
    var v20: Vector[s1] = v32
    val v50: Vector[Vector[s1]] = Vector(v20, v20, v30)
    val v27: Vector[s1] = v3(0)
    val v23: s1 = v30(0)
    var v39: Vector[Vector[s1]] = v50
    val v56: s1 = v22(3)
    val v57: Vector[s0] = v14.p0
    v18 = v18.updated(0, v31)
    v39 = v39.updated(0, v30)
    val v41: s0 = v34(0)
    v14 = v14.copy(p1 = v41)
    v18 = v18.updated(0, v14)
    val v98: s0 = v57(2)
    val v47: Vector[Vector[Double]] = v98.p1
    val v44: Vector[s0] = v15.p0
    v7 = v7.updated(0, v27)
    var v49: s0 = v41
    val v89: s0 = v44(2)
    v14 = v14.copy(p1 = v49)
    v18 = v18.updated(0, v23)
    var v107: Vector[Vector[Double]] = v47
    val v129: s5 = s5(v0, v89)
    val v69: s5 = f114(v129)
    var v80: Vector[Vector[s1]] = v39
    v49 = v49.copy(p1 = v107)
    v39 = v39.updated(1, v20)
    val v133: Vector[s0] = v31.p0
    val v74: Vector[s1] = v80(0)
    v14 = v14.copy(p0 = v133)
    val v123: s5 = f114(v69)
    val v120: s0 = v56.p1
    val v114: s5 = f114(v123)
    v7 = v7.updated(0, v74)
    val v122: s2 = v114.p0
    val v135: Vector[Vector[Double]] = v89.p0
    v49 = v49.copy(p0 = v135)
    v14 = v14.copy(p1 = v120)
    v3 = v36
    v39 = v39.updated(2, v18)
    v122
  }
  def f110(v0: s2): s2 = {
    val v2: s2 = f112(v0)
    val v12: s2 = f112(v2)
    val v10: s2 = f117(v12)
    v10
  }
  def f108(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v0.p0
    var v5: s0 = v0
    v5 = v5.copy(p0 = v1)
    v5 = v5.copy(p0 = v2)
    v5
  }
  def f107(v0: Vector[s0]): Vector[s0] = {
    val v7: Vector[Vector[s0]] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v6: Vector[Vector[s0]] = v7
    var v9: Vector[Vector[s0]] = v6
    v9 = v9.updated(1, v0)
    val v18: Vector[s0] = v9(2)
    v18
  }
  def f106(v0: Vector[s0]): Vector[s0] = {
    var v6: Vector[s0] = v0
    val v4: s0 = v0(0)
    var v2: Vector[s0] = v6
    val v13: s0 = v2(0)
    val v5: s0 = v2(0)
    val v9: Vector[s0] = f107(v2)
    v2 = v2.updated(0, v5)
    v6 = v6.updated(0, v13)
    v2 = v2.updated(0, v13)
    v2 = v2.updated(0, v13)
    v2 = v2.updated(0, v13)
    v6 = v6.updated(0, v4)
    val v75: s0 = f108(v4)
    v2 = v2.updated(0, v75)
    val v137: Vector[s0] = f107(v9)
    v137
  }
  def f95(v0: s0): s0 = {
    val v1: s0 = f108(v0)
    val v3: Vector[Vector[Double]] = v1.p0
    var v7: s0 = v1
    val v9: Vector[Vector[Double]] = v0.p0
    var v8: Vector[Vector[Double]] = v9
    v7 = v7.copy(p0 = v9)
    var v4: s0 = v1
    val v5: s0 = f108(v7)
    val v2: Vector[Double] = v3(0)
    var v20: Vector[Double] = v2
    var v15: Vector[Double] = v20
    val v13: Vector[Double] = v3(0)
    val v25: Double = v13(0)
    val v14: s0 = f108(v5)
    var v10: s0 = v4
    var v24: Double = v25
    val v19: Vector[Double] = v8(0)
    v10 = v10.copy(p0 = v9)
    var v12: Vector[Vector[Double]] = v8
    var v16: Double = v25
    v4 = v4.copy(p0 = v12)
    v7 = v7.copy(p0 = v12)
    v20 = v20.updated(0, v16)
    val v71: s0 = f108(v0)
    val v29: Vector[Vector[Double]] = v4.p1
    v8 = v8.updated(0, v15)
    val v21: Vector[Vector[Double]] = v14.p0
    val v34: Vector[Vector[Double]] = v71.p1
    v8 = v8.updated(0, v19)
    v12 = v8
    v15 = v15.updated(0, v24)
    v15 = v15.updated(0, v24)
    v7 = v7.copy(p1 = v29)
    val v38: Vector[Double] = v34(2)
    var v103: Vector[Vector[Double]] = v34
    v10 = v10.copy(p1 = v103)
    v103 = v103.updated(1, v15)
    v8 = v8.updated(0, v38)
    v20 = v20.updated(0, v25)
    v10 = v10.copy(p0 = v21)
    v10
  }
  def f54(v0: s1): s1 = {
    val v2: s0 = v0.p1
    var v1: s1 = v0
    v1 = v1.copy(p1 = v2)
    val v5: s0 = f95(v2)
    v1 = v0
    val v6: s0 = f95(v5)
    v1 = v1.copy(p1 = v5)
    val v25: Vector[s0] = v1.p0
    val v28: s0 = v25(0)
    val v19: s0 = f95(v6)
    val v33: s0 = f95(v6)
    val v93: s0 = v0.p1
    var v41: s1 = v1
    val v22: s0 = f95(v93)
    val v16: s0 = f108(v28)
    val v46: s0 = f95(v22)
    v41 = v41.copy(p1 = v6)
    v1 = v1.copy(p0 = v25)
    var v31: s1 = v41
    v31 = v31.copy(p0 = v25)
    v31 = v31.copy(p0 = v25)
    val v84: s0 = f108(v16)
    v1 = v1.copy(p0 = v25)
    v31 = v31.copy(p1 = v19)
    v1 = v1.copy(p1 = v19)
    val v112: s0 = f95(v33)
    v31 = v31.copy(p1 = v46)
    v41 = v41.copy(p1 = v84)
    v41 = v41.copy(p1 = v112)
    v31
  }
  def f49(v0: s1): s1 = {
    var v1: s1 = v0
    var v3: s1 = v1
    val v6: Vector[s0] = v1.p0
    val v2: Vector[s0] = v3.p0
    val v5: Vector[s0] = v0.p0
    val v7: s1 = f54(v3)
    val v27: s0 = v5(2)
    val v17: s1 = f54(v7)
    v1 = v1.copy(p0 = v5)
    v3 = v3.copy(p0 = v5)
    v1 = v1.copy(p1 = v27)
    val v28: s1 = f54(v17)
    v3 = v3.copy(p0 = v2)
    val v142: Vector[s1] = Vector(v7, v28)
    val v55: Vector[s0] = v3.p0
    var v138: Vector[s1] = v142
    v3 = v3.copy(p0 = v6)
    val v106: s1 = v138(1)
    v1 = v1.copy(p0 = v55)
    val v95: s1 = f54(v106)
    val v121: s1 = f54(v28)
    v3 = v121
    v95
  }
  def f42(v0: s2): s2 = {
    val v7: s2 = f110(v0)
    val v2: s2 = f117(v7)
    val v6: Vector[s0] = v7.p0
    val v3: Vector[s0] = f107(v6)
    val v9: Vector[Vector[s1]] = v2.p1
    val v5: Vector[Vector[s1]] = v2.p1
    val v10: Vector[Vector[s0]] = Vector(v3, v6, v3)
    val v11: s2 = f117(v0)
    val v13: Vector[s0] = v7.p0
    var v18: Vector[Vector[s1]] = v5
    val v30: s0 = v13(0)
    val v8: s2 = f110(v11)
    val v12: s2 = f117(v7)
    val v14: Vector[s0] = v10(2)
    var v17: s2 = v12
    val v42: Vector[s0] = v17.p0
    v17 = v17.copy(p0 = v6)
    val v16: Vector[s1] = v9(0)
    v18 = v18.updated(0, v16)
    v17 = v8
    val v48: Vector[s1] = v9(0)
    v18 = v18.updated(0, v16)
    v18 = v18.updated(0, v48)
    val v22: Vector[s1] = v9(0)
    val v29: Vector[s0] = v8.p0
    val v49: s0 = f95(v30)
    v17 = v17.copy(p1 = v5)
    v17 = v17.copy(p1 = v18)
    val v50: s1 = v22(0)
    val v53: s0 = v50.p1
    v17 = v17.copy(p0 = v13)
    var v59: Vector[s0] = v42
    var v55: s2 = v11
    v18 = v18.updated(0, v22)
    v59 = v59.updated(0, v49)
    v55 = v55.copy(p0 = v29)
    val v180: Vector[Vector[s1]] = v8.p1
    v55 = v55.copy(p0 = v14)
    v59 = v59.updated(0, v53)
    v18 = v18.updated(0, v22)
    v18 = v180
    v18 = v18.updated(0, v16)
    v55 = v55.copy(p0 = v59)
    v55
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v5: s2 = v0
    val v4: s2 = f112(v5)
    val v10: Vector[s0] = v0.p0
    val v11: s2 = f112(v0)
    val v3: Vector[s0] = v5.p0
    val v13: Vector[s0] = f107(v3)
    var v21: Vector[s0] = v13
    val v14: s0 = v13(0)
    var v16: s0 = v14
    val v19: Vector[Vector[Double]] = v16.p0
    val v26: s2 = f42(v11)
    val v25: s0 = f95(v16)
    val v35: Vector[s0] = f106(v10)
    v21 = v21.updated(0, v25)
    val v28: Vector[Vector[s1]] = v4.p1
    v21 = v10
    val v24: Vector[Vector[s1]] = v26.p1
    val v23: Vector[Vector[Double]] = v16.p1
    v21 = v21.updated(0, v16)
    var v53: Vector[Vector[s1]] = v28
    val v62: Vector[s1] = v53(0)
    v5 = v5.copy(p0 = v21)
    v5 = v5.copy(p1 = v24)
    val v60: Vector[Double] = v23(1)
    val v46: s0 = v35(0)
    val v51: Double = v60(0)
    val v57: s1 = v62(0)
    v21 = v21.updated(0, v46)
    var v114: Double = v51
    var v54: s1 = v57
    val v99: s1 = f49(v54)
    val v102: s0 = v99.p1
    v16 = v16.copy(p0 = v19)
    v21 = v21.updated(0, v102)
    v114
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(Vector(s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}