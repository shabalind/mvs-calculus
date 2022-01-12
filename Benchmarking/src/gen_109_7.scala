import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f14(v0: Vector[s1]): Vector[s1] = {
    var v2: Vector[s1] = v0
    val v6: s1 = v2(0)
    v2 = v2.updated(0, v6)
    var v7: s1 = v6
    v2 = v2.updated(0, v7)
    v2 = v2.updated(0, v7)
    val v8: s1 = v2(0)
    val v3: s1 = v2(0)
    var v13: Vector[s1] = v0
    var v4: Vector[s1] = v2
    v4 = v4.updated(0, v7)
    val v9: s0 = v8.p0
    val v5: Vector[Vector[s1]] = Vector(v4, v13, v4)
    val v11: s0 = v6.p0
    var v14: s0 = v9
    val v15: Vector[s1] = v5(2)
    var v10: s0 = v11
    val v22: s1 = v2(0)
    var v18: Vector[s1] = v4
    val v16: Vector[Vector[Double]] = v10.p2
    v2 = v2.updated(0, v22)
    val v12: s0 = v22.p0
    var v17: Vector[Vector[s1]] = v5
    var v52: s0 = v11
    v10 = v10.copy(p2 = v16)
    v4 = v4.updated(0, v6)
    v7 = v7.copy(p1 = v9)
    val v28: Vector[Vector[Double]] = v11.p0
    v7 = v7.copy(p1 = v9)
    val v20: Vector[s1] = v17(0)
    val v19: s0 = v6.p0
    var v27: Vector[Vector[s1]] = v17
    val v23: s0 = v7.p1
    val v49: Vector[Vector[Double]] = v23.p4
    v10 = v10.copy(p0 = v49)
    v52 = v52.copy(p1 = v49)
    var v43: Vector[s1] = v18
    val v34: s0 = v8.p0
    var v37: Vector[Vector[Double]] = v16
    v10 = v10.copy(p0 = v28)
    v43 = v15
    var v21: Vector[Vector[Double]] = v28
    v52 = v52.copy(p1 = v28)
    val v101: s1 = s1(v34, v19)
    var v75: Vector[s1] = v43
    v75 = v75.updated(0, v3)
    val v100: s1 = v20(0)
    val v40: Vector[s1] = v5(0)
    v2 = v2.updated(0, v22)
    val v41: s1 = s1(v52, v19)
    v7 = v7.copy(p0 = v14)
    v2 = v18
    val v66: s1 = v40(0)
    v43 = v43.updated(0, v7)
    v14 = v14.copy(p2 = v37)
    val v108: Vector[Vector[Double]] = v9.p3
    val v119: s0 = v8.p0
    v17 = v17.updated(0, v75)
    v43 = v43.updated(0, v41)
    val v46: s0 = v101.p0
    var v83: Vector[Vector[Double]] = v108
    var v55: s0 = v23
    v52 = v52.copy(p2 = v37)
    v10 = v10.copy(p3 = v83)
    val v127: s0 = v66.p1
    v7 = v7.copy(p1 = v127)
    var v62: Vector[Vector[s1]] = v17
    val v103: Vector[Vector[Double]] = v46.p3
    val v134: s1 = v13(0)
    val v71: Vector[Vector[Double]] = v11.p4
    val v74: Vector[Vector[Vector[s1]]] = Vector(v27, v62, v27, v27, v27)
    v14 = v14.copy(p0 = v71)
    v7 = v7.copy(p1 = v12)
    v4 = v4.updated(0, v3)
    val v181: Vector[Vector[Double]] = v23.p2
    v10 = v10.copy(p0 = v21)
    val v94: Vector[Double] = v37(0)
    val v150: Vector[Vector[s1]] = v74(0)
    v4 = v4.updated(0, v134)
    v55 = v55.copy(p3 = v103)
    val v178: Vector[s1] = v150(2)
    v7 = v7.copy(p0 = v119)
    val v254: s0 = v100.p0
    v7 = v7.copy(p1 = v254)
    val v230: Vector[s1] = v150(1)
    v7 = v7.copy(p1 = v55)
    v27 = v27.updated(2, v178)
    v62 = v62.updated(1, v230)
    v21 = v21.updated(0, v94)
    v52 = v52.copy(p4 = v28)
    v14 = v14.copy(p2 = v181)
    v230
  }
  def f6(v0: Vector[s1]): Vector[s1] = {
    var v2: Vector[s1] = v0
    val v7: Vector[s1] = f14(v0)
    var v1: Vector[s1] = v7
    val v5: s1 = v7(0)
    val v4: Vector[Vector[s1]] = Vector(v2, v2, v2, v7, v2, v1, v1)
    val v6: Vector[s1] = v4(0)
    v1 = v1.updated(0, v5)
    val v3: Vector[s1] = v4(5)
    var v15: Vector[Vector[s1]] = v4
    val v18: Vector[s1] = v15(5)
    val v12: Vector[s1] = f14(v0)
    val v29: s1 = v3(0)
    v1 = v1.updated(0, v29)
    var v23: Vector[Vector[s1]] = v15
    var v112: Vector[Vector[s1]] = v23
    val v142: Vector[s1] = v112(1)
    val v80: Vector[s1] = f14(v1)
    v23 = v23.updated(4, v80)
    v23 = v23.updated(2, v12)
    v15 = v15.updated(6, v6)
    var v198: Vector[s1] = v3
    v112 = v112.updated(6, v18)
    v15 = v15.updated(5, v198)
    v142
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    val v4: Vector[s1] = v0(0)
    val v5: Vector[s1] = f6(v4)
    var v8: Vector[Vector[s1]] = v0
    v8 = v8.updated(0, v5)
    val v3: Vector[s1] = v8(0)
    val v2: Vector[s1] = f14(v3)
    v8 = v8.updated(0, v2)
    var v9: Vector[s1] = v5
    v8 = v8.updated(0, v3)
    val v11: Vector[s1] = f14(v4)
    val v20: s1 = v5(0)
    val v13: s1 = v9(0)
    val v15: s1 = v11(0)
    var v19: Vector[s1] = v4
    val v17: s0 = v20.p1
    var v24: s0 = v17
    val v10: Vector[Vector[Double]] = v17.p1
    val v12: s1 = v5(0)
    v9 = v9.updated(0, v12)
    val v22: Vector[s1] = f6(v9)
    v8 = v8.updated(0, v11)
    val v16: Vector[s1] = f14(v11)
    val v25: Vector[s1] = f14(v16)
    val v35: s0 = v13.p1
    var v51: s0 = v24
    var v31: s1 = v13
    val v29: Vector[s1] = f14(v11)
    var v42: s1 = v15
    v8 = v8.updated(0, v19)
    v31 = v13
    val v33: Vector[Vector[Vector[s1]]] = Vector(v8)
    val v27: s0 = v42.p1
    val v41: Vector[Vector[s1]] = v33(0)
    val v56: Vector[s1] = f6(v2)
    val v68: Vector[Vector[Double]] = v27.p2
    val v37: s1 = v56(0)
    var v46: Vector[s1] = v29
    val v49: s1 = v29(0)
    val v47: Vector[s1] = f6(v46)
    v24 = v24.copy(p1 = v10)
    v9 = v9.updated(0, v49)
    val v59: s1 = v22(0)
    v8 = v8.updated(0, v25)
    val v61: s0 = v42.p0
    v42 = v42.copy(p0 = v51)
    v31 = v31.copy(p0 = v61)
    val v53: s0 = v31.p1
    val v58: Vector[Vector[Double]] = v35.p3
    val v170: Vector[Vector[Double]] = v51.p1
    v19 = v19.updated(0, v59)
    v24 = v24.copy(p3 = v58)
    v42 = v42.copy(p0 = v53)
    v42 = v42.copy(p0 = v61)
    val v99: Vector[s1] = v41(0)
    v8 = v8.updated(0, v29)
    v8 = v8.updated(0, v99)
    v31 = v37
    val v89: Vector[Double] = v68(1)
    v46 = v46.updated(0, v12)
    val v191: Double = v89(0)
    v24 = v24.copy(p0 = v170)
    v8 = v8.updated(0, v47)
    v191
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}