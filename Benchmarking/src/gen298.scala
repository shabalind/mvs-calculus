import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f37(v0: Vector[s0]): Vector[s0] = {
    var v3: Vector[s0] = v0
    var v6: Vector[s0] = v3
    val v1: s0 = v6(1)
    val v4: s0 = v6(2)
    var v8: Vector[s0] = v0
    var v13: s0 = v4
    var v10: s0 = v1
    v8 = v8.updated(2, v4)
    val v7: Vector[Vector[Double]] = v4.p0
    val v5: s0 = s0(v7)
    v10 = v10.copy(p0 = v7)
    v13 = v13.copy(p0 = v7)
    val v20: Vector[Vector[Double]] = v13.p0
    v3 = v3.updated(0, v1)
    v8 = v8.updated(1, v5)
    v3 = v3.updated(0, v10)
    var v15: s0 = v10
    val v12: Vector[Vector[Double]] = v15.p0
    val v24: Vector[Vector[Double]] = v10.p0
    val v21: s0 = s0(v7)
    v13 = v13.copy(p0 = v12)
    val v26: s0 = v0(2)
    val v27: Vector[Vector[Double]] = v10.p0
    var v25: Vector[s0] = v8
    v13 = v13.copy(p0 = v20)
    v15 = v15.copy(p0 = v24)
    v8 = v8.updated(1, v26)
    val v37: s0 = v25(0)
    val v55: Vector[Vector[Double]] = v21.p0
    val v100: s1 = s1(v15, v25)
    v8 = v8.updated(1, v5)
    v6 = v6.updated(1, v13)
    var v49: s0 = v4
    v15 = v15.copy(p0 = v12)
    val v48: Vector[Vector[Double]] = v26.p0
    var v38: s1 = v100
    v15 = v15.copy(p0 = v48)
    v15 = v15.copy(p0 = v27)
    v13 = v13.copy(p0 = v55)
    v38 = v38.copy(p0 = v49)
    v38 = v38.copy(p1 = v25)
    v8 = v8.updated(1, v37)
    val v116: Vector[s0] = v38.p1
    v116
  }
  def f35(v0: s1): s1 = {
    var v6: s1 = v0
    var v2: s1 = v6
    val v7: s0 = v6.p0
    var v1: s0 = v7
    v6 = v6.copy(p0 = v7)
    var v4: s0 = v1
    var v5: s0 = v1
    val v9: Vector[s0] = v0.p1
    var v3: s0 = v7
    val v11: Vector[s0] = f37(v9)
    var v10: s0 = v7
    val v8: Vector[s0] = f37(v11)
    val v14: Vector[Vector[Double]] = v5.p0
    v3 = v4
    val v21: Vector[s0] = v0.p1
    var v17: s1 = v0
    v4 = v4.copy(p0 = v14)
    var v20: s1 = v17
    val v61: s0 = s0(v14)
    val v37: Vector[Vector[Double]] = v5.p0
    val v36: Vector[s1] = Vector(v6, v17, v20, v20, v6)
    val v62: Vector[Double] = v14(2)
    var v16: Vector[Vector[Double]] = v14
    v17 = v2
    v16 = v16.updated(0, v62)
    v1 = v1.copy(p0 = v16)
    val v24: Vector[Vector[Double]] = v10.p0
    val v23: Vector[Double] = v16(1)
    v20 = v20.copy(p1 = v9)
    var v48: Vector[Vector[Double]] = v24
    v48 = v48.updated(0, v62)
    val v27: Vector[Double] = v48(2)
    v10 = v10.copy(p0 = v37)
    val v54: Vector[s0] = f37(v8)
    v5 = v5.copy(p0 = v14)
    var v25: Vector[Vector[Double]] = v14
    val v43: s1 = v36(2)
    v16 = v16.updated(1, v27)
    val v47: Vector[s0] = f37(v21)
    val v45: Vector[Vector[Double]] = v5.p0
    v2 = v43
    v10 = v10.copy(p0 = v14)
    v16 = v48
    v2 = v2.copy(p1 = v47)
    v5 = v5.copy(p0 = v45)
    val v51: Vector[Vector[Double]] = v61.p0
    var v46: Vector[Vector[Double]] = v37
    v1 = v1.copy(p0 = v51)
    var v215: Vector[s1] = v36
    v20 = v20.copy(p1 = v9)
    v2 = v2.copy(p0 = v10)
    v46 = v46.updated(0, v23)
    var v76: Vector[Vector[Double]] = v46
    v4 = v4.copy(p0 = v14)
    v46 = v25
    v10 = v10.copy(p0 = v76)
    val v156: s1 = v36(0)
    v17 = v17.copy(p1 = v54)
    v215 = v215.updated(3, v156)
    val v104: s1 = v215(3)
    v25 = v25.updated(1, v62)
    v16 = v16.updated(1, v23)
    v20 = v20.copy(p0 = v3)
    v104
  }
  def f32(v0: s1): s1 = {
    var v4: s1 = v0
    val v8: s1 = f35(v0)
    val v7: s0 = v4.p0
    var v9: s0 = v7
    val v3: s0 = v4.p0
    val v1: s1 = f35(v4)
    var v5: s0 = v7
    v4 = v4.copy(p0 = v9)
    v4 = v4.copy(p0 = v7)
    v4 = v4.copy(p0 = v7)
    var v6: s1 = v1
    v4 = v4.copy(p0 = v3)
    val v18: s0 = v4.p0
    val v13: Vector[Vector[Double]] = v3.p0
    val v12: Vector[Double] = v13(1)
    var v16: Vector[Double] = v12
    var v14: Vector[Double] = v16
    val v11: Vector[Double] = v13(2)
    val v27: Vector[Vector[Double]] = v9.p0
    var v30: Vector[Vector[Double]] = v27
    v5 = v5.copy(p0 = v27)
    var v17: s0 = v5
    var v24: s1 = v4
    v30 = v30.updated(1, v14)
    val v20: s1 = f35(v8)
    var v19: Vector[Double] = v12
    val v23: Double = v11(0)
    val v22: s0 = s0(v13)
    v17 = v17.copy(p0 = v13)
    val v32: Vector[Double] = v13(0)
    val v43: Vector[Double] = v13(2)
    val v49: Double = v19(0)
    val v37: Vector[Vector[Double]] = v22.p0
    val v50: Vector[Vector[Double]] = v18.p0
    val v56: Vector[s0] = v20.p1
    val v35: Vector[Vector[Double]] = v9.p0
    val v118: Vector[s0] = f37(v56)
    val v39: s1 = f35(v24)
    v16 = v16.updated(0, v23)
    v30 = v30.updated(1, v14)
    v5 = v5.copy(p0 = v30)
    v9 = v9.copy(p0 = v37)
    val v59: s0 = v56(0)
    v19 = v19.updated(0, v23)
    val v61: Vector[s0] = f37(v56)
    val v70: s0 = v6.p0
    v6 = v6.copy(p1 = v61)
    val v76: Vector[s0] = Vector(v17, v22)
    v4 = v4.copy(p0 = v70)
    val v40: Vector[Vector[Double]] = v59.p0
    v14 = v14.updated(0, v49)
    val v82: Vector[s0] = f37(v61)
    v4 = v4.copy(p0 = v7)
    val v134: Vector[s0] = f37(v56)
    val v71: s0 = v118(0)
    val v160: s1 = f35(v39)
    v9 = v9.copy(p0 = v35)
    v30 = v30.updated(2, v43)
    v9 = v9.copy(p0 = v40)
    v24 = v24.copy(p0 = v9)
    v6 = v6.copy(p1 = v82)
    val v123: Double = v11(0)
    val v72: Double = v32(0)
    v30 = v30.updated(1, v32)
    val v92: s0 = v76(1)
    v14 = v14.updated(0, v72)
    val v162: s0 = v134(0)
    v30 = v30.updated(1, v16)
    val v129: Double = v19(0)
    v6 = v6.copy(p1 = v134)
    v19 = v19.updated(0, v72)
    val v154: Vector[s0] = f37(v118)
    v14 = v14.updated(0, v72)
    v17 = v17.copy(p0 = v50)
    v14 = v14.updated(0, v129)
    val v125: Vector[Vector[Double]] = v71.p0
    v24 = v24.copy(p1 = v118)
    v24 = v24.copy(p1 = v134)
    v24 = v24.copy(p0 = v92)
    v14 = v14.updated(0, v123)
    v24 = v24.copy(p0 = v162)
    v17 = v17.copy(p0 = v125)
    v6 = v6.copy(p1 = v154)
    v160
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v5: s1 = v0
    val v6: Vector[s0] = v5.p1
    val v2: Vector[s0] = v0.p1
    val v11: Vector[s0] = f37(v6)
    val v3: s1 = f32(v5)
    val v4: s0 = v11(0)
    val v8: Vector[Vector[Double]] = v4.p0
    val v13: s0 = v2(0)
    var v14: Vector[Vector[Double]] = v8
    val v34: Vector[Double] = v14(2)
    val v12: s0 = v2(0)
    v5 = v3
    v14 = v14.updated(0, v34)
    val v41: Vector[Vector[Double]] = v13.p0
    val v17: Vector[s0] = v3.p1
    val v24: Vector[Double] = v41(2)
    v14 = v14.updated(1, v34)
    val v20: s0 = v11(0)
    v5 = v5.copy(p0 = v20)
    val v30: s0 = v17(0)
    v5 = v5.copy(p0 = v30)
    var v26: Double = v1
    var v82: Vector[s0] = v17
    v14 = v14.updated(1, v24)
    v14 = v14.updated(0, v24)
    v5 = v5.copy(p0 = v12)
    val v98: Double = v34(0)
    v5 = v5.copy(p1 = v2)
    v5 = v5.copy(p1 = v82)
    var v97: Double = v26
    val v206: Double = v97 / v98
    v206
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}