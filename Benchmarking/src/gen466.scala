import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f13(v0: s0): s0 = {
    var v4: s0 = v0
    var v7: s0 = v0
    var v8: s0 = v4
    var v1: s0 = v0
    val v2: Vector[Vector[Double]] = v1.p1
    val v6: Vector[s0] = Vector(v7, v4, v7, v8)
    val v9: Vector[Vector[Double]] = v0.p0
    var v5: Vector[s0] = v6
    v5 = v5.updated(0, v8)
    v4 = v4.copy(p1 = v2)
    v5 = v5.updated(1, v8)
    val v29: s0 = v6(1)
    v5 = v5.updated(2, v29)
    val v16: s0 = v5(1)
    v7 = v7.copy(p0 = v9)
    val v23: Vector[Vector[Double]] = v16.p0
    var v37: s0 = v0
    v37 = v1
    val v31: Vector[Vector[Double]] = v37.p1
    v1 = v1.copy(p0 = v23)
    var v22: Vector[s0] = v5
    val v83: s0 = v22(2)
    v8 = v8.copy(p1 = v31)
    v83
  }
  def f7(v0: s0): s0 = {
    var v2: s0 = v0
    val v3: s0 = f13(v2)
    val v4: Vector[Vector[Double]] = v2.p1
    val v5: s0 = f13(v0)
    var v1: s0 = v3
    val v10: s0 = f13(v0)
    var v9: s0 = v10
    val v13: Vector[Vector[Double]] = v3.p0
    val v25: Vector[Double] = v13(0)
    val v20: Vector[Vector[Double]] = v9.p0
    val v15: s0 = f13(v5)
    var v62: Vector[Vector[Double]] = v4
    v2 = v2.copy(p0 = v20)
    val v30: s0 = f13(v15)
    val v23: s0 = f13(v0)
    val v45: Vector[Vector[Double]] = v3.p1
    var v33: Vector[Vector[Double]] = v62
    v62 = v62.updated(0, v25)
    val v35: Vector[Vector[Double]] = v10.p1
    val v59: s0 = f13(v30)
    val v26: Vector[s0] = Vector(v1, v2, v0, v59, v23)
    val v56: s0 = f13(v1)
    val v37: Vector[Vector[Double]] = v56.p1
    v1 = v1.copy(p1 = v45)
    var v89: Vector[s0] = v26
    v9 = v9.copy(p1 = v35)
    v2 = v2.copy(p1 = v33)
    val v354: s0 = v89(2)
    v1 = v1.copy(p1 = v37)
    v354
  }
  def f5(v0: s0): s0 = {
    val v3: s0 = f7(v0)
    var v1: s0 = v0
    val v6: s0 = f7(v3)
    val v2: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Vector[Double]] = v6.p1
    val v4: Vector[Double] = v5(1)
    v1 = v3
    var v7: s0 = v6
    var v8: Vector[Double] = v4
    val v10: Double = v8(0)
    val v13: Double = v8(0)
    val v9: s0 = f7(v6)
    val v15: s0 = f7(v3)
    val v20: Vector[Vector[Double]] = v3.p0
    v8 = v8.updated(0, v13)
    v8 = v4
    val v12: s0 = s0(v20, v5)
    v7 = v7.copy(p1 = v2)
    v8 = v8.updated(0, v13)
    val v19: Vector[Vector[Double]] = v9.p0
    var v18: Vector[Vector[Double]] = v20
    v18 = v19
    val v32: Vector[Vector[Double]] = v9.p0
    val v27: Vector[Vector[Double]] = v7.p0
    v7 = v7.copy(p0 = v20)
    val v35: Vector[Double] = v18(0)
    v8 = v8.updated(0, v10)
    val v43: s0 = s0(v19, v2)
    v7 = v7.copy(p1 = v2)
    val v37: Vector[Vector[Double]] = v0.p0
    var v26: Vector[Vector[Double]] = v5
    val v31: Vector[Double] = v27(0)
    val v50: Vector[Vector[Double]] = v9.p1
    val v38: Vector[Vector[Double]] = v43.p1
    val v30: Double = v31(0)
    v1 = v1.copy(p0 = v19)
    val v34: Vector[Vector[Double]] = v9.p0
    val v22: Vector[Double] = v2(1)
    var v29: Vector[Vector[Double]] = v50
    v7 = v7.copy(p0 = v18)
    val v41: Vector[Vector[Double]] = v6.p1
    val v25: Vector[Double] = v18(0)
    val v54: Vector[Vector[Vector[Double]]] = Vector(v50, v38, v38, v38, v38)
    v18 = v18.updated(0, v25)
    v29 = v29.updated(1, v31)
    v18 = v27
    val v42: Vector[Vector[Double]] = v1.p0
    val v73: Vector[Vector[Double]] = v12.p0
    val v84: Vector[Double] = v32(0)
    var v52: Vector[Vector[Double]] = v73
    val v125: Vector[Vector[Double]] = v54(3)
    val v69: Vector[Double] = v125(0)
    val v80: s0 = f13(v15)
    v26 = v26.updated(0, v22)
    v52 = v52.updated(0, v8)
    val v46: s0 = f7(v12)
    v18 = v18.updated(0, v84)
    val v72: Vector[Vector[Double]] = v46.p1
    v7 = v7.copy(p1 = v41)
    v29 = v29.updated(1, v35)
    v1 = v1.copy(p0 = v37)
    val v66: s0 = s0(v19, v26)
    v1 = v1.copy(p1 = v2)
    val v74: Vector[Vector[Double]] = v3.p1
    v1 = v1.copy(p1 = v72)
    v7 = v7.copy(p0 = v42)
    val v49: Vector[Vector[Double]] = v1.p0
    v8 = v8.updated(0, v30)
    v7 = v7.copy(p0 = v52)
    v26 = v26.updated(1, v31)
    val v110: Vector[Vector[Double]] = v1.p0
    v7 = v7.copy(p0 = v34)
    var v92: Vector[Vector[Vector[Double]]] = v54
    val v98: Vector[Double] = v37(0)
    val v67: s0 = f13(v80)
    val v95: s0 = f13(v67)
    v1 = v1.copy(p1 = v29)
    var v200: s0 = v3
    v200 = v200.copy(p1 = v41)
    v52 = v52.updated(0, v69)
    val v146: Vector[Vector[Double]] = v12.p1
    v200 = v200.copy(p1 = v146)
    v52 = v52.updated(0, v22)
    val v176: s0 = f13(v95)
    var v172: Vector[Vector[Double]] = v37
    val v170: Vector[Vector[Double]] = v92(1)
    val v151: Vector[Double] = v72(0)
    val v260: Vector[Vector[Double]] = v66.p0
    var v89: s0 = v200
    v7 = v7.copy(p1 = v170)
    v200 = v200.copy(p0 = v19)
    v18 = v18.updated(0, v98)
    v18 = v18.updated(0, v84)
    var v169: Vector[Vector[Double]] = v74
    v1 = v1.copy(p1 = v169)
    v200 = v200.copy(p0 = v172)
    v172 = v172.updated(0, v35)
    v29 = v29.updated(0, v151)
    v89 = v89.copy(p0 = v49)
    v200 = v200.copy(p0 = v260)
    val v139: Vector[Vector[Double]] = v176.p1
    v1 = v1.copy(p1 = v139)
    v89 = v89.copy(p0 = v110)
    v89
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: s0, v2: Vector[s0], v3: Double): Double = {
    val v5: s0 = f5(v1)
    val v12: Vector[Vector[Double]] = v5.p1
    val v15: Vector[Double] = v12(1)
    val v25: Double = v15(0)
    val v49: Double = v3 * v25
    var v40: Double = v49
    v40
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))))
    val v1: s0 = s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v3: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}