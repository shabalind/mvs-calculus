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
    p1: Vector[s0]
  )
  def f110(v0: s1): s1 = {
    var v5: s1 = v0
    val v1: Vector[s0] = v5.p1
    val v4: s0 = v1(1)
    val v6: Vector[s0] = v0.p1
    val v2: s0 = v1(0)
    v5 = v5.copy(p1 = v1)
    val v3: s0 = v1(1)
    val v11: s0 = v6(1)
    v5 = v5.copy(p1 = v6)
    var v9: Vector[s0] = v6
    v5 = v5.copy(p0 = v1)
    v5 = v5.copy(p1 = v1)
    val v8: Vector[s0] = v5.p0
    v5 = v5.copy(p1 = v1)
    var v10: Vector[s0] = v8
    var v18: s1 = v0
    v5 = v5.copy(p1 = v10)
    val v20: Vector[s0] = v0.p0
    v10 = v10.updated(1, v3)
    var v29: s1 = v18
    v9 = v9.updated(0, v4)
    val v30: Vector[Vector[Double]] = v11.p2
    v9 = v8
    v5 = v5.copy(p0 = v9)
    val v24: s1 = s1(v20, v1)
    val v38: s1 = s1(v8, v6)
    v9 = v9.updated(0, v2)
    val v45: Vector[s0] = v0.p0
    v5 = v5.copy(p0 = v45)
    val v57: s0 = v6(1)
    v18 = v18.copy(p0 = v8)
    val v51: Vector[s0] = v38.p1
    val v60: Vector[s0] = v0.p1
    val v72: Vector[s0] = v18.p0
    v10 = v10.updated(1, v57)
    val v37: s0 = v60(0)
    v9 = v9.updated(1, v11)
    v10 = v10.updated(1, v37)
    v29 = v29.copy(p1 = v45)
    v29 = v29.copy(p0 = v51)
    val v119: s0 = v72(0)
    var v55: s0 = v2
    v55 = v57
    v29 = v29.copy(p1 = v45)
    v55 = v55.copy(p2 = v30)
    val v144: Vector[s0] = v24.p1
    var v170: s1 = v29
    v10 = v10.updated(1, v55)
    v9 = v9.updated(1, v119)
    v5 = v5.copy(p0 = v144)
    v170 = v170.copy(p0 = v9)
    v170
  }
  def f107(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v1: Vector[Double] = v0(2)
    var v5: Vector[Double] = v1
    var v4: Vector[Double] = v5
    var v6: Vector[Vector[Double]] = v0
    var v2: Vector[Double] = v5
    val v3: Vector[Vector[Vector[Double]]] = Vector(v0, v6, v0)
    val v7: Vector[Vector[Double]] = v3(2)
    var v8: Vector[Vector[Double]] = v7
    var v12: Vector[Double] = v2
    val v13: Vector[Vector[Double]] = v3(1)
    var v11: Vector[Vector[Vector[Double]]] = v3
    v6 = v6.updated(2, v5)
    v11 = v11.updated(1, v6)
    v6 = v6.updated(0, v4)
    v6 = v6.updated(2, v1)
    val v19: Vector[Vector[Double]] = v11(2)
    val v16: Vector[Vector[Double]] = v3(0)
    var v9: Vector[Double] = v5
    val v14: Vector[Vector[Vector[Double]]] = Vector(v19, v16, v13, v7, v13, v0, v8)
    val v26: Double = v12(0)
    val v21: Double = v9(0)
    var v45: Double = v21
    v4 = v12
    v12 = v5
    val v27: Vector[Double] = v13(1)
    v12 = v12.updated(0, v26)
    v12 = v12.updated(0, v45)
    v2 = v2.updated(0, v26)
    val v59: Vector[Vector[Vector[Vector[Double]]]] = Vector(v14, v14, v14, v14, v14)
    var v29: Vector[Vector[Vector[Vector[Double]]]] = v59
    v12 = v27
    val v55: Double = v5(0)
    val v74: Vector[Vector[Vector[Double]]] = v29(2)
    var v231: Vector[Vector[Vector[Double]]] = v74
    v9 = v9.updated(0, v55)
    val v70: Vector[Vector[Double]] = v231(3)
    v6 = v6.updated(2, v4)
    v70
  }
  def f103(v0: s0): s0 = {
    var v3: s0 = v0
    val v1: Vector[Vector[Double]] = v3.p0
    var v11: Vector[Vector[Double]] = v1
    val v4: Vector[Vector[Double]] = v0.p2
    val v2: Vector[Vector[Double]] = f107(v11)
    var v5: Vector[Vector[Double]] = v4
    val v7: Vector[Double] = v4(0)
    var v10: Vector[Vector[Double]] = v5
    v10 = v4
    v3 = v3.copy(p1 = v11)
    val v17: Vector[Vector[Double]] = f107(v1)
    v10 = v10.updated(0, v7)
    v11 = v11.updated(0, v7)
    v5 = v5.updated(0, v7)
    val v20: Vector[Double] = v2(1)
    v5 = v5.updated(0, v20)
    v3 = v3.copy(p0 = v11)
    var v24: s0 = v0
    v24 = v24.copy(p2 = v10)
    v24 = v24.copy(p0 = v17)
    v24
  }
  def f85(v0: s0, v1: s0): s0 = {
    var v7: s0 = v1
    val v5: s0 = f103(v7)
    val v4: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v5.p1
    val v2: Vector[Vector[Double]] = f107(v4)
    val v8: Vector[Double] = v6(1)
    v7 = v7.copy(p1 = v2)
    val v12: s0 = f103(v1)
    val v25: Vector[Double] = v2(2)
    val v9: Vector[Vector[Double]] = v12.p2
    val v15: Vector[Vector[Double]] = f107(v4)
    val v17: Vector[Vector[Double]] = f107(v15)
    v7 = v7.copy(p1 = v17)
    val v14: Vector[Vector[Double]] = v5.p0
    val v13: Vector[Vector[Double]] = v5.p2
    v7 = v7.copy(p0 = v4)
    var v11: s0 = v12
    val v21: Vector[Vector[Double]] = v7.p0
    val v22: Double = v25(0)
    val v26: Vector[Double] = v13(0)
    val v46: s0 = f103(v11)
    var v35: Vector[Double] = v26
    val v37: Double = v8(0)
    v35 = v26
    v7 = v7.copy(p2 = v13)
    val v42: Vector[Vector[Double]] = v0.p2
    val v24: Vector[Vector[Double]] = f107(v2)
    var v34: Vector[Vector[Double]] = v42
    v35 = v35.updated(0, v22)
    v35 = v35.updated(0, v37)
    v7 = v7.copy(p0 = v4)
    var v71: Vector[Vector[Double]] = v24
    var v33: Vector[Vector[Double]] = v34
    val v107: s0 = f103(v5)
    v7 = v7.copy(p2 = v13)
    val v53: s0 = f103(v107)
    v7 = v7.copy(p0 = v21)
    v11 = v11.copy(p1 = v14)
    v7 = v7.copy(p2 = v13)
    v7 = v7.copy(p0 = v71)
    v33 = v9
    val v38: s0 = f103(v46)
    v11 = v11.copy(p2 = v33)
    val v108: Vector[s0] = Vector(v38, v12, v53, v53, v0, v11)
    v33 = v33.updated(0, v8)
    v71 = v71.updated(0, v35)
    val v56: s0 = v108(0)
    val v187: s0 = f103(v56)
    v187
  }
  def f66(v0: s0): s0 = {
    var v3: s0 = v0
    val v5: s0 = f85(v3, v0)
    var v1: s0 = v3
    var v4: s0 = v0
    var v2: s0 = v4
    val v6: s0 = f103(v2)
    val v12: Vector[Vector[Double]] = v4.p2
    v3 = v3.copy(p2 = v12)
    val v11: Vector[Vector[Double]] = v4.p0
    v1 = v1.copy(p0 = v11)
    val v21: Vector[Vector[Double]] = f107(v11)
    v1 = v6
    val v13: Vector[Double] = v21(2)
    var v17: s0 = v2
    val v20: s0 = f103(v5)
    v17 = v17.copy(p1 = v11)
    val v16: Vector[Vector[Double]] = v1.p2
    v3 = v3.copy(p1 = v11)
    val v27: s0 = s0(v21, v21, v12)
    var v26: Vector[Double] = v13
    val v25: Vector[Vector[Double]] = v17.p1
    val v29: Vector[Vector[Double]] = v20.p0
    var v42: Vector[Vector[Double]] = v25
    val v33: Vector[Vector[Double]] = v27.p1
    val v23: Vector[Vector[Double]] = v5.p2
    val v56: Vector[Double] = v42(2)
    v1 = v1.copy(p2 = v23)
    v42 = v42.updated(1, v26)
    v4 = v4.copy(p2 = v12)
    v17 = v17.copy(p1 = v33)
    var v44: Vector[Vector[Double]] = v12
    var v67: Vector[Vector[Double]] = v29
    v3 = v3.copy(p2 = v23)
    var v74: Vector[Double] = v13
    var v46: Vector[Double] = v74
    val v35: Vector[Vector[Vector[Double]]] = Vector(v16)
    v4 = v4.copy(p0 = v21)
    val v144: Vector[Vector[Double]] = v35(0)
    v44 = v44.updated(0, v46)
    val v66: Vector[Vector[Double]] = v35(0)
    v1 = v1.copy(p2 = v66)
    val v48: Double = v56(0)
    v4 = v4.copy(p2 = v44)
    var v92: Vector[Vector[Double]] = v67
    v1 = v1.copy(p0 = v92)
    v74 = v74.updated(0, v48)
    val v152: s0 = s0(v25, v42, v144)
    v2 = v2.copy(p0 = v33)
    v152
  }
  def f55(v0: Double): Double = {
    var v7: Double = v0
    val v1: Vector[Double] = Vector(v0, v7, v0, v7, v0, v7, v7)
    var v5: Double = v7
    val v6: Vector[Vector[Double]] = Vector(v1, v1, v1, v1, v1)
    var v3: Vector[Double] = v1
    v3 = v1
    v3 = v3.updated(3, v7)
    var v11: Vector[Vector[Double]] = v6
    v11 = v11.updated(1, v1)
    var v10: Vector[Vector[Double]] = v11
    v10 = v10.updated(1, v3)
    var v21: Vector[Vector[Double]] = v10
    var v18: Vector[Double] = v1
    v21 = v21.updated(2, v3)
    var v40: Vector[Vector[Double]] = v6
    v10 = v10.updated(4, v18)
    var v25: Vector[Vector[Double]] = v10
    val v57: Vector[Double] = v40(2)
    v11 = v11.updated(3, v57)
    v3 = v3.updated(3, v7)
    val v39: Vector[Double] = v25(0)
    v3 = v3.updated(4, v5)
    v21 = v21.updated(1, v39)
    val v116: Vector[Vector[Vector[Double]]] = Vector(v21)
    val v96: Vector[Vector[Double]] = v116(0)
    val v98: Vector[Double] = v96(4)
    val v53: Double = v98(1)
    v53
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v3: s1 = v0(0)
    val v2: s1 = v0(1)
    var v4: s1 = v3
    val v5: Vector[s0] = v3.p0
    var v9: s1 = v2
    val v6: Vector[s0] = v9.p1
    val v20: Vector[s0] = v4.p0
    val v10: s1 = s1(v6, v5)
    val v14: Vector[s0] = v2.p1
    val v27: Double = f55(v1)
    val v28: s1 = f110(v9)
    val v32: Double = f55(v27)
    var v21: Vector[s0] = v20
    val v15: Vector[s0] = v2.p0
    var v42: Vector[s0] = v15
    var v26: Vector[s0] = v21
    val v18: s0 = v20(0)
    val v19: s0 = v14(0)
    val v30: s0 = f85(v19, v18)
    v9 = v9.copy(p1 = v6)
    v21 = v21.updated(1, v30)
    val v37: Vector[s0] = v2.p1
    v9 = v28
    val v58: Vector[Vector[Double]] = v30.p0
    val v43: Vector[Double] = v58(2)
    val v38: s0 = f66(v30)
    var v46: Double = v1
    var v85: Vector[Double] = v43
    v9 = v9.copy(p0 = v6)
    val v69: s0 = v26(1)
    v4 = v4.copy(p1 = v42)
    v26 = v26.updated(0, v18)
    val v56: Double = v32 - v46
    v4 = v4.copy(p0 = v6)
    val v57: Vector[s0] = v10.p1
    val v115: Double = v85(0)
    v9 = v9.copy(p0 = v37)
    v85 = v85.updated(0, v56)
    var v107: s1 = v3
    val v100: Vector[s0] = v107.p0
    val v132: Vector[s0] = v9.p0
    var v99: Double = v115
    v42 = v42.updated(1, v38)
    v107 = v107.copy(p1 = v132)
    v42 = v42.updated(0, v69)
    v85 = v85.updated(0, v56)
    v107 = v107.copy(p0 = v57)
    v9 = v9.copy(p0 = v100)
    v99
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), s1(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))))
    val v1: Double = 56.0
    val start = nanoTime()
    var result: Double = 56.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}