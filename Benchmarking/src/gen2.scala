import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  def f80(v0: s0): s0 = {
    val v5: Vector[Double] = v0.p0
    val v2: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v0.p0
    var v11: s0 = v0
    val v1: Vector[Vector[Vector[Double]]] = Vector(v2, v2, v2, v2, v2, v2)
    var v10: Vector[Vector[Vector[Double]]] = v1
    v10 = v10.updated(5, v2)
    var v12: Vector[Vector[Vector[Double]]] = v1
    val v17: Vector[Vector[Double]] = v11.p1
    v11 = v11.copy(p0 = v3)
    val v19: Vector[Vector[Double]] = v0.p1
    v11 = v11.copy(p1 = v2)
    val v42: s0 = s0(v3, v17)
    val v14: Vector[Double] = v11.p0
    val v16: Vector[Vector[Double]] = v0.p1
    var v45: Vector[Vector[Vector[Double]]] = v10
    v12 = v12.updated(0, v16)
    val v23: Vector[Double] = v11.p0
    val v26: Vector[Vector[Double]] = v45(5)
    v11 = v11.copy(p1 = v17)
    v11 = v11.copy(p0 = v5)
    v10 = v45
    v45 = v1
    val v24: Vector[Vector[Double]] = v12(2)
    v12 = v12.updated(4, v2)
    v10 = v10.updated(2, v16)
    v11 = v11.copy(p0 = v3)
    v12 = v12.updated(0, v2)
    v12 = v12.updated(0, v17)
    val v35: Vector[Double] = v42.p0
    val v43: Vector[Vector[Double]] = v45(4)
    v11 = v11.copy(p0 = v23)
    val v41: Vector[Vector[Double]] = v11.p1
    val v50: Vector[Vector[Double]] = v42.p1
    v11 = v11.copy(p0 = v5)
    var v74: Vector[Vector[Double]] = v17
    var v32: s0 = v42
    v11 = v11.copy(p0 = v23)
    val v34: s0 = s0(v35, v74)
    val v48: Vector[Vector[Double]] = v11.p1
    v11 = v11.copy(p1 = v50)
    v10 = v10.updated(5, v43)
    v11 = v11.copy(p1 = v41)
    v32 = v32.copy(p1 = v19)
    val v37: Vector[s0] = Vector(v11, v42, v34, v34, v34, v0, v0)
    v32 = v32.copy(p0 = v14)
    v10 = v10.updated(4, v26)
    val v47: Vector[Vector[Double]] = v32.p1
    v45 = v45.updated(3, v47)
    val v85: s0 = v37(3)
    val v55: Vector[Double] = v85.p0
    var v76: Vector[s0] = v37
    val v49: Vector[Vector[Double]] = v42.p1
    v11 = v11.copy(p0 = v55)
    v32 = v32.copy(p1 = v24)
    var v160: Vector[s0] = v76
    v11 = v11.copy(p1 = v49)
    v11 = v11.copy(p1 = v48)
    val v150: s0 = v160(4)
    val v62: Vector[Double] = v150.p0
    v11 = v11.copy(p1 = v26)
    v76 = v76.updated(6, v11)
    val v177: s0 = s0(v62, v26)
    v177
  }
  def f79(v0: s1, v1: s0): s1 = {
    var v3: s1 = v0
    var v2: s1 = v3
    val v7: Vector[Vector[s0]] = v3.p0
    val v21: Vector[s0] = Vector(v1, v1)
    val v11: s0 = f80(v1)
    val v18: s0 = v21(1)
    var v10: s1 = v0
    val v14: Vector[Vector[s0]] = v0.p0
    val v17: s0 = f80(v11)
    val v12: s0 = f80(v17)
    v3 = v10
    v3 = v3.copy(p0 = v14)
    var v20: Vector[s0] = v21
    v3 = v3.copy(p1 = v18)
    v20 = v20.updated(1, v1)
    v2 = v2.copy(p0 = v7)
    val v38: Vector[Vector[s0]] = v10.p0
    val v44: s0 = f80(v12)
    v20 = v20.updated(1, v17)
    v2 = v2.copy(p0 = v38)
    v2 = v2.copy(p0 = v14)
    val v53: s0 = f80(v44)
    v20 = v20.updated(0, v17)
    v10 = v10.copy(p0 = v14)
    val v106: s0 = v20(1)
    v10 = v10.copy(p1 = v106)
    val v133: s0 = f80(v18)
    v2 = v2.copy(p1 = v133)
    v20 = v20.updated(1, v53)
    v20 = v20.updated(1, v1)
    v2
  }
  def f66(v0: Vector[s0]): Vector[s0] = {
    val v6: s0 = v0(0)
    val v1: s0 = f80(v6)
    var v3: Vector[s0] = v0
    val v5: s0 = v3(0)
    val v11: Vector[Vector[s0]] = Vector(v0)
    v3 = v3.updated(0, v6)
    v3 = v3.updated(0, v6)
    val v7: s0 = v3(0)
    val v9: s0 = f80(v1)
    val v17: Vector[Vector[Double]] = v9.p1
    val v24: Vector[Double] = v9.p0
    val v31: s0 = f80(v5)
    val v20: Vector[s0] = v11(0)
    v3 = v3.updated(0, v7)
    val v18: s0 = s0(v24, v17)
    var v33: Vector[s0] = v20
    val v68: s0 = f80(v6)
    v33 = v33.updated(0, v18)
    v3 = v3.updated(0, v31)
    v33 = v33.updated(0, v31)
    v3 = v3.updated(0, v9)
    v33 = v33.updated(0, v68)
    v3 = v3.updated(0, v6)
    v33
  }
  def f65(v0: s1, v1: Vector[s1]): s1 = {
    val v7: s1 = v1(0)
    val v2: s1 = v1(0)
    var v9: s1 = v7
    val v13: Vector[Vector[s0]] = v2.p0
    var v15: Vector[Vector[s0]] = v13
    var v20: Vector[Vector[s0]] = v15
    var v19: s1 = v7
    v19 = v19.copy(p0 = v20)
    val v39: Vector[Vector[s0]] = v9.p0
    val v30: Vector[s0] = v13(0)
    val v38: Vector[s0] = v39(2)
    val v56: s0 = v7.p1
    val v18: Vector[s0] = v39(2)
    val v33: Vector[s0] = f66(v18)
    val v29: s0 = v30(0)
    v15 = v15.updated(0, v33)
    var v27: Vector[Vector[s0]] = v15
    v27 = v27.updated(2, v38)
    val v28: Vector[s0] = Vector(v29, v56, v29, v29)
    val v86: s0 = v28(0)
    val v26: s0 = v19.p1
    v19 = v19.copy(p0 = v20)
    v19 = v19.copy(p0 = v27)
    var v88: Vector[Vector[s0]] = v15
    v9 = v9.copy(p1 = v86)
    val v98: Vector[s0] = f66(v33)
    val v59: s1 = s1(v88, v26)
    val v72: s0 = v18(0)
    v88 = v88.updated(0, v98)
    val v69: s1 = f79(v59, v72)
    v69
  }
  def f54(v0: s1, v1: Double, v2: Double): Double = {
    v2
  }
  def f27(v0: Double): Double = {
    val v7: Vector[Double] = Vector(v0, v0, v0, v0, v0, v0, v0)
    var v6: Vector[Double] = v7
    val v9: Vector[Double] = Vector(v0, v0, v0, v0, v0)
    var v8: Vector[Double] = v9
    val v1: Double = v8(4)
    val v5: Double = v6(3)
    val v12: Double = v6(5)
    v6 = v6.updated(2, v0)
    val v10: Double = v5 * v12
    v6 = v6.updated(4, v10)
    v8 = v8.updated(1, v0)
    v6 = v6.updated(3, v1)
    v10
  }
  @noinline
  def f0(v0: Vector[s1], v1: s1, v2: Double): Double = {
    val v7: s0 = v1.p1
    val v6: Double = f54(v1, v2, v2)
    var v9: Vector[s1] = v0
    var v4: Double = v6
    v9 = v9.updated(0, v1)
    var v34: Double = v2
    var v17: Double = v34
    val v53: s1 = f65(v1, v9)
    val v19: s1 = f65(v1, v0)
    val v16: Vector[Vector[Double]] = v7.p1
    var v38: Vector[Vector[Double]] = v16
    v17 = v34
    var v57: Vector[s1] = v0
    val v69: s1 = f65(v19, v57)
    v57 = v57.updated(0, v69)
    val v81: Vector[Double] = v38(0)
    val v54: Double = f27(v4)
    val v146: Double = v17 / v54
    val v77: Double = v81(0)
    val v106: Double = v77 + v34
    val v88: Double = f54(v53, v146, v34)
    v9 = v9.updated(0, v69)
    v4 = v6
    val v177: Vector[Double] = Vector(v6, v88, v106, v77, v106)
    val v279: Double = v177(3)
    v279
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0)))), Vector(s0(Vector(8.0, 9.0), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(12.0, 13.0), Vector(Vector(14.0), Vector(15.0)))))
    val v1: s1 = s1(Vector(Vector(s0(Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(24.0, 25.0), Vector(Vector(26.0), Vector(27.0))))), s0(Vector(28.0, 29.0), Vector(Vector(30.0), Vector(31.0))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}