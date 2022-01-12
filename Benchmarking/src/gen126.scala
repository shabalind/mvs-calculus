import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s0]]
  )
  def f97(v0: s1, v1: s0): s0 = {
    val v23: Vector[Vector[s0]] = v0.p1
    val v35: Vector[s0] = v23(0)
    val v37: s0 = v35(0)
    v37
  }
  def f91(v0: s0, v1: s0): s0 = {
    var v3: s0 = v0
    var v5: s0 = v3
    var v6: s0 = v0
    val v4: Vector[Vector[Double]] = v6.p0
    val v8: Vector[Vector[Double]] = v5.p1
    val v2: Vector[Double] = v8(1)
    var v7: Vector[Vector[Double]] = v4
    var v9: Vector[Vector[Double]] = v8
    v6 = v6.copy(p0 = v7)
    val v10: Vector[Double] = v4(1)
    var v11: Vector[Vector[Double]] = v9
    v6 = v6.copy(p0 = v4)
    v5 = v5.copy(p0 = v7)
    var v23: Vector[Vector[Double]] = v8
    val v20: Vector[Double] = v7(1)
    v23 = v23.updated(0, v10)
    v11 = v23
    v11 = v11.updated(1, v10)
    val v16: Vector[Vector[Double]] = v6.p1
    v11 = v11.updated(1, v20)
    var v19: Vector[Vector[Double]] = v16
    v3 = v3.copy(p1 = v8)
    v5 = v5.copy(p0 = v4)
    val v21: Vector[Double] = v19(0)
    val v24: Vector[Vector[Vector[Double]]] = Vector(v11, v19, v16)
    v6 = v6.copy(p0 = v4)
    v9 = v9.updated(0, v21)
    v19 = v19.updated(1, v2)
    val v30: Vector[Double] = v16(0)
    v7 = v7.updated(1, v30)
    val v43: Vector[Vector[Double]] = v24(0)
    v6 = v6.copy(p1 = v8)
    val v32: Vector[Vector[Double]] = v24(0)
    val v75: Vector[Vector[Double]] = v6.p0
    v3 = v3.copy(p1 = v43)
    v9 = v8
    v3 = v3.copy(p0 = v75)
    val v45: Vector[Vector[Double]] = v3.p0
    v5 = v5.copy(p0 = v45)
    v23 = v23.updated(1, v21)
    val v48: s0 = s0(v45, v32)
    v5 = v5.copy(p0 = v45)
    v48
  }
  def f90(v0: s1): s1 = {
    val v5: Vector[Vector[s0]] = v0.p1
    val v4: Vector[Vector[s0]] = v0.p1
    val v2: Vector[Vector[s0]] = v0.p2
    var v6: Vector[Vector[s0]] = v2
    var v7: s1 = v0
    var v14: Vector[Vector[s0]] = v4
    val v10: Vector[s0] = v14(2)
    val v8: Vector[s0] = v0.p0
    val v3: Vector[s0] = v5(1)
    v7 = v7.copy(p1 = v4)
    val v1: Vector[s0] = v0.p0
    var v15: Vector[s0] = v1
    v6 = v6.updated(0, v10)
    val v24: Vector[s0] = v0.p0
    val v11: Vector[Vector[s0]] = v0.p2
    val v30: Vector[Vector[s0]] = v0.p1
    val v12: s0 = v3(0)
    val v16: s0 = f91(v12, v12)
    var v19: s1 = v0
    v7 = v7.copy(p1 = v5)
    v15 = v15.updated(0, v12)
    v15 = v15.updated(2, v16)
    v19 = v19.copy(p2 = v6)
    v7 = v7.copy(p0 = v1)
    v7 = v7.copy(p0 = v1)
    val v36: Vector[Vector[s0]] = Vector(v8, v1, v24, v1)
    val v25: Vector[Vector[s0]] = v19.p1
    v19 = v19.copy(p1 = v30)
    v19 = v19.copy(p2 = v11)
    v7 = v7.copy(p0 = v15)
    val v22: Vector[Vector[s0]] = v7.p2
    v19 = v19.copy(p0 = v15)
    val v45: Vector[s0] = v5(1)
    v14 = v14.updated(0, v3)
    val v27: Vector[s0] = v36(3)
    val v28: Vector[s0] = v36(1)
    v19 = v19.copy(p0 = v24)
    v6 = v6.updated(0, v45)
    v19 = v19.copy(p0 = v28)
    val v29: Vector[Vector[s0]] = v7.p2
    val v32: s1 = s1(v15, v25, v11)
    v14 = v14.updated(2, v3)
    v19 = v19.copy(p0 = v28)
    v7 = v19
    var v34: Vector[Vector[s0]] = v6
    var v39: Vector[Vector[s0]] = v29
    v39 = v34
    v7 = v7.copy(p2 = v39)
    val v56: Vector[s0] = v32.p0
    val v73: s1 = s1(v56, v4, v22)
    val v151: Vector[Vector[s0]] = v19.p2
    v19 = v19.copy(p0 = v27)
    v7 = v7.copy(p2 = v6)
    var v93: Vector[Vector[s0]] = v4
    v34 = v34.updated(0, v45)
    v7 = v7.copy(p0 = v24)
    v7 = v7.copy(p2 = v11)
    v19 = v19.copy(p1 = v93)
    v7 = v7.copy(p2 = v151)
    v93 = v93.updated(1, v10)
    v73
  }
  def f89(v0: s1): s1 = {
    val v4: Vector[Vector[s0]] = v0.p2
    val v7: Vector[s0] = v4(0)
    var v5: Vector[Vector[s0]] = v4
    v5 = v5.updated(0, v7)
    var v9: s1 = v0
    val v3: s0 = v7(0)
    val v8: s0 = v7(0)
    v5 = v5.updated(0, v7)
    v9 = v9.copy(p2 = v4)
    var v13: s0 = v3
    v9 = v9.copy(p2 = v4)
    val v1: s0 = f97(v9, v13)
    v9 = v9.copy(p2 = v4)
    val v6: s1 = f90(v9)
    val v10: Vector[Vector[s0]] = v9.p1
    val v11: Vector[s0] = v0.p0
    v9 = v9.copy(p2 = v5)
    var v18: Vector[s0] = v11
    v5 = v5.updated(0, v7)
    v18 = v18.updated(2, v1)
    val v12: s0 = f91(v1, v3)
    v5 = v5.updated(0, v7)
    val v36: s0 = v7(0)
    v9 = v9.copy(p2 = v5)
    val v21: Vector[Vector[Double]] = v12.p1
    var v17: Vector[Vector[s0]] = v5
    val v20: Vector[s0] = v6.p0
    v18 = v18.updated(0, v13)
    v9 = v9.copy(p0 = v18)
    v9 = v9.copy(p0 = v20)
    val v62: Vector[Vector[Double]] = v3.p0
    val v16: Vector[Double] = v62(0)
    v18 = v18.updated(0, v13)
    val v41: Vector[s0] = v10(0)
    var v34: Vector[s0] = v41
    var v23: Vector[Vector[Double]] = v21
    val v24: s0 = f91(v36, v8)
    v9 = v9.copy(p2 = v17)
    v23 = v23.updated(0, v16)
    v9 = v9.copy(p1 = v10)
    val v35: s1 = s1(v18, v10, v5)
    v18 = v18.updated(0, v24)
    val v91: Vector[Vector[s0]] = v35.p1
    val v64: s1 = f90(v35)
    v17 = v17.updated(0, v34)
    var v44: Vector[Vector[s0]] = v91
    v13 = v13.copy(p1 = v23)
    v9 = v9.copy(p1 = v44)
    v34 = v34.updated(0, v13)
    v9 = v9.copy(p0 = v20)
    v64
  }
  def f87(v0: Vector[s0]): Vector[s0] = {
    var v2: Vector[s0] = v0
    v2 = v0
    val v4: s0 = v0(0)
    v2 = v2.updated(0, v4)
    var v6: Vector[s0] = v2
    v2 = v2.updated(0, v4)
    val v1: Vector[Vector[Double]] = v4.p1
    var v3: s0 = v4
    val v7: Vector[Vector[s0]] = Vector(v0, v6, v0, v2)
    val v5: Vector[s0] = v7(1)
    var v8: Vector[Vector[Double]] = v1
    var v9: Vector[Vector[Double]] = v8
    val v12: Vector[Vector[Double]] = v4.p0
    val v13: Vector[Double] = v9(0)
    val v11: s0 = f91(v4, v4)
    v9 = v9.updated(0, v13)
    v2 = v2.updated(0, v4)
    v3 = v3.copy(p0 = v12)
    var v19: Vector[Vector[s0]] = v7
    val v17: s0 = f91(v3, v4)
    v19 = v19.updated(0, v2)
    val v10: Vector[Vector[Double]] = v17.p0
    v3 = v3.copy(p0 = v10)
    val v15: s0 = f91(v11, v17)
    val v39: s0 = v2(0)
    val v44: Double = v13(0)
    val v16: Vector[Vector[Double]] = v3.p1
    val v28: s0 = f91(v11, v39)
    v3 = v3.copy(p0 = v12)
    val v55: s0 = v0(0)
    val v23: Vector[Vector[Vector[Double]]] = Vector(v16, v1, v9, v1, v1, v16, v1)
    val v37: Vector[Vector[Double]] = v23(1)
    val v31: s0 = f91(v4, v4)
    var v65: Vector[Double] = v13
    val v50: Vector[Vector[Double]] = v55.p1
    val v43: Vector[Vector[Vector[s0]]] = Vector(v7, v19, v19, v19)
    v6 = v6.updated(0, v15)
    var v36: Vector[Double] = v13
    v3 = v3.copy(p1 = v37)
    v3 = v3.copy(p1 = v8)
    val v51: Vector[Double] = v9(1)
    val v149: Vector[Vector[Double]] = v55.p1
    v2 = v5
    val v79: s0 = f91(v31, v28)
    val v45: Double = v51(0)
    v9 = v9.updated(0, v36)
    v2 = v5
    v3 = v3.copy(p1 = v149)
    var v82: Double = v44
    v19 = v19.updated(1, v6)
    var v141: Vector[Double] = v65
    val v99: Vector[Vector[s0]] = v43(1)
    val v123: Vector[s0] = v99(3)
    v3 = v3.copy(p1 = v50)
    var v69: Double = v82
    v2 = v2.updated(0, v79)
    v141 = v141.updated(0, v69)
    val v167: Vector[s0] = v99(3)
    v19 = v19.updated(3, v167)
    v8 = v37
    v36 = v141
    v3 = v3.copy(p1 = v8)
    v36 = v36.updated(0, v45)
    v123
  }
  def f85(v0: s1): s1 = {
    val v2: s1 = f89(v0)
    var v1: s1 = v0
    var v4: s1 = v2
    v1 = v0
    val v5: Vector[Vector[s0]] = v1.p2
    val v10: Vector[s0] = v5(0)
    val v3: Vector[Vector[s0]] = v4.p1
    val v9: Vector[Vector[Vector[s0]]] = Vector(v3, v3)
    val v7: Vector[s0] = v0.p0
    val v12: Vector[s0] = f87(v10)
    v1 = v1.copy(p1 = v3)
    val v25: s1 = f89(v1)
    val v16: s1 = f90(v4)
    v4 = v4.copy(p2 = v5)
    val v17: Vector[Vector[s0]] = v2.p2
    val v27: Vector[Vector[s0]] = v9(0)
    val v30: Vector[Vector[s0]] = v16.p2
    var v28: Vector[s0] = v7
    val v26: Vector[Vector[s0]] = v0.p2
    val v23: s1 = f89(v16)
    var v24: Vector[Vector[s0]] = v17
    v4 = v4.copy(p2 = v24)
    var v42: Vector[Vector[s0]] = v27
    v1 = v25
    v42 = v42.updated(2, v12)
    v4 = v4.copy(p2 = v26)
    val v45: s1 = f89(v23)
    v1 = v1.copy(p2 = v26)
    var v57: Vector[s0] = v28
    var v139: Vector[Vector[s0]] = v42
    v1 = v1.copy(p1 = v139)
    v4 = v4.copy(p0 = v57)
    v1 = v1.copy(p0 = v57)
    v4 = v4.copy(p2 = v26)
    v1 = v1.copy(p2 = v24)
    v4 = v4.copy(p2 = v30)
    v1 = v1.copy(p2 = v17)
    v4 = v4.copy(p1 = v139)
    v4 = v4.copy(p1 = v3)
    v45
  }
  def f66(v0: s1): s1 = {
    var v2: s1 = v0
    val v1: Vector[s1] = Vector(v2)
    val v7: s1 = v1(0)
    val v4: Vector[Vector[s0]] = v2.p2
    v2 = v2.copy(p2 = v4)
    var v3: s1 = v0
    v2 = v2.copy(p2 = v4)
    val v8: s1 = v1(0)
    v3 = v2
    val v11: s1 = f90(v3)
    val v10: s1 = f90(v11)
    v3 = v7
    var v30: s1 = v10
    val v24: Vector[s0] = v30.p0
    v30 = v30.copy(p2 = v4)
    v30 = v30.copy(p0 = v24)
    val v40: Vector[s0] = v8.p0
    v3 = v3.copy(p0 = v40)
    v30
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v8: s1 = v0
    val v5: Vector[s0] = v8.p0
    val v2: s0 = v5(0)
    val v6: s0 = v5(2)
    val v7: s1 = f66(v8)
    var v4: s1 = v8
    v8 = v8.copy(p0 = v5)
    val v13: Vector[Vector[Double]] = v6.p1
    val v15: Vector[Vector[s0]] = v7.p2
    val v25: Vector[Double] = v13(0)
    val v10: Vector[Vector[s0]] = v0.p1
    val v35: Vector[s0] = v15(0)
    var v32: Vector[s0] = v5
    val v53: s0 = v35(0)
    val v21: Vector[Vector[Double]] = v2.p1
    val v30: Vector[s0] = v7.p0
    v32 = v32.updated(0, v53)
    val v17: Vector[s0] = v10(1)
    val v34: s0 = f97(v4, v53)
    val v42: Vector[Double] = v21(0)
    val v70: Double = v1 + v1
    var v22: Vector[s0] = v30
    var v43: Double = v70
    var v61: Vector[Vector[s0]] = v10
    val v45: Double = v42(0)
    v61 = v61.updated(1, v17)
    v43 = v45
    var v50: Vector[Double] = v25
    val v92: s1 = f85(v4)
    v4 = v4.copy(p0 = v32)
    val v176: s1 = s1(v22, v61, v15)
    val v215: Vector[Vector[s0]] = v176.p1
    val v163: Vector[Vector[s0]] = v8.p2
    v8 = v8.copy(p1 = v215)
    v8 = v92
    v50 = v50.updated(0, v43)
    v4 = v4.copy(p0 = v22)
    v32 = v32.updated(0, v34)
    v8 = v8.copy(p2 = v163)
    val v322: Double = v50(0)
    var v226: Double = v322
    var v184: Double = v226
    v184
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))))
    val v1: Double = 35.0
    val start = nanoTime()
    var result: Double = 35.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}