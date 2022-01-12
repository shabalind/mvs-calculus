import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  def f75(v0: s1): s1 = {
    v0
  }
  def f72(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v0
    var v5: Double = v1
    var v6: Double = v0
    var v10: Double = v1
    val v8: Vector[Double] = Vector(v0, v2, v1, v6)
    var v11: Double = v6
    var v3: Vector[Double] = v8
    v3 = v3.updated(1, v1)
    v3 = v8
    v3 = v3.updated(1, v5)
    val v9: Double = v8(2)
    var v18: Vector[Double] = v3
    var v28: Vector[Double] = v3
    val v13: Vector[Vector[Double]] = Vector(v8, v28, v3)
    val v17: Vector[Double] = v13(0)
    var v20: Vector[Vector[Double]] = v13
    v3 = v3.updated(2, v10)
    var v14: Vector[Vector[Double]] = v20
    v20 = v20.updated(0, v17)
    v14 = v14.updated(1, v28)
    val v21: Vector[Double] = v14(2)
    var v19: Vector[Double] = v3
    v18 = v18.updated(1, v0)
    val v12: Vector[Double] = v13(0)
    var v29: Vector[Double] = v17
    val v23: Double = v12(3)
    val v27: Vector[Double] = v14(1)
    val v22: Vector[Vector[Double]] = Vector(v27, v18, v17, v12, v17, v29, v17)
    v3 = v3.updated(3, v5)
    v14 = v14.updated(0, v8)
    v18 = v18.updated(2, v6)
    var v31: Vector[Vector[Double]] = v22
    val v56: Vector[Double] = v20(1)
    v19 = v19.updated(1, v1)
    v14 = v14.updated(0, v27)
    v31 = v31.updated(6, v56)
    v29 = v29.updated(0, v11)
    v10 = v9
    val v67: Vector[Vector[Vector[Double]]] = Vector(v31, v22, v22, v22, v31, v31)
    var v66: Vector[Vector[Double]] = v22
    val v52: Vector[Vector[Double]] = v67(1)
    v31 = v66
    val v44: Vector[Vector[Vector[Double]]] = Vector(v31, v52, v66, v52, v31, v22, v66)
    v20 = v20.updated(2, v17)
    var v42: Vector[Vector[Vector[Double]]] = v44
    val v76: Vector[Vector[Double]] = v67(4)
    v29 = v29.updated(3, v0)
    val v43: Vector[Vector[Double]] = v42(5)
    v42 = v42.updated(6, v31)
    v14 = v14.updated(2, v19)
    v3 = v3.updated(2, v23)
    v14 = v14.updated(1, v29)
    v31 = v43
    v20 = v14
    v31 = v66
    val v81: Vector[Double] = v76(4)
    val v103: Double = v3(3)
    v10 = v11
    val v59: Double = v21(0)
    v14 = v14.updated(1, v81)
    v19 = v19.updated(3, v103)
    v59
  }
  def f69(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v2: Double = v0.p1
    val v4: Vector[Double] = v7(0)
    val v12: Double = v0.p1
    var v17: Double = v2
    val v14: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v0.p0
    val v18: Double = v4(0)
    val v20: Double = f72(v17)
    val v24: Double = f72(v18)
    var v38: Vector[Vector[Double]] = v9
    val v27: Vector[Vector[Double]] = v0.p0
    v38 = v38.updated(0, v4)
    val v32: Double = f72(v24)
    val v35: s0 = s0(v38, v20)
    val v28: Vector[Vector[Double]] = v35.p0
    var v23: s0 = v35
    v23 = v23.copy(p0 = v14)
    val v55: Vector[Double] = v27(0)
    v23 = v23.copy(p0 = v38)
    v38 = v38.updated(0, v55)
    v23 = v23.copy(p1 = v32)
    v23 = v23.copy(p1 = v12)
    v23 = v23.copy(p0 = v28)
    v23
  }
  def f68(v0: s4, v1: s1): s4 = {
    var v8: s4 = v0
    val v11: Vector[s1] = v8.p1
    var v24: s4 = v0
    val v9: Vector[Vector[s1]] = Vector(v11, v11)
    val v12: Vector[s1] = v9(0)
    val v31: s0 = v24.p0
    var v29: s0 = v31
    v8 = v8.copy(p1 = v11)
    val v27: s4 = s4(v29, v12)
    v27
  }
  def f51(v0: s1, v1: Vector[Vector[s0]]): s1 = {
    val v6: s1 = f75(v0)
    val v3: s1 = f75(v6)
    val v8: s1 = f75(v6)
    var v2: Vector[Vector[s0]] = v1
    val v5: Vector[Vector[s0]] = v6.p1
    var v14: Vector[Vector[s0]] = v2
    val v41: Vector[s0] = v5(0)
    val v51: Vector[s0] = v14(0)
    val v38: s1 = s1(v51, v5)
    val v54: Vector[s0] = v8.p0
    val v65: s1 = f75(v38)
    val v47: Vector[s0] = v3.p0
    v14 = v14.updated(0, v47)
    val v79: s1 = f75(v65)
    var v118: Vector[Vector[s0]] = v1
    val v73: Vector[s0] = v118(0)
    v14 = v1
    v14 = v14.updated(0, v51)
    var v367: s1 = v79
    v367 = v367.copy(p0 = v41)
    v367 = v367.copy(p0 = v73)
    v367 = v367.copy(p0 = v54)
    v367
  }
  def f24(v0: s1, v1: s0): s0 = {
    var v6: s0 = v1
    var v3: s1 = v0
    var v7: s1 = v3
    val v4: Vector[s1] = Vector(v3, v0, v0, v7)
    val v5: Double = v6.p1
    var v8: Double = v5
    val v9: Vector[Vector[s0]] = v7.p1
    val v11: Double = f72(v8)
    val v2: Vector[s0] = v9(0)
    v7 = v7.copy(p1 = v9)
    val v16: s0 = f69(v1)
    var v17: s1 = v3
    v3 = v3.copy(p1 = v9)
    v6 = v6.copy(p1 = v11)
    var v21: s0 = v6
    val v33: s0 = f69(v1)
    val v15: s0 = f69(v21)
    val v24: s1 = v4(1)
    val v23: s0 = f69(v6)
    val v29: Vector[s0] = v7.p0
    var v14: s0 = v16
    val v18: s1 = f75(v7)
    val v19: Vector[Vector[s0]] = v18.p1
    val v31: Double = f72(v11)
    var v52: Vector[s0] = v29
    val v22: s1 = v4(3)
    val v49: Vector[Vector[s0]] = v17.p1
    v52 = v52.updated(0, v23)
    val v26: Double = v33.p1
    v52 = v52.updated(0, v33)
    v6 = v6.copy(p1 = v11)
    v52 = v52.updated(0, v14)
    v52 = v52.updated(0, v15)
    val v32: Double = f72(v26)
    val v41: Vector[Vector[s0]] = Vector(v52)
    val v30: s1 = f51(v22, v41)
    val v51: Vector[s0] = v3.p0
    var v45: Vector[Vector[s0]] = v19
    val v39: Vector[s0] = v49(0)
    val v37: s0 = v52(0)
    v7 = v7.copy(p0 = v39)
    v21 = v21.copy(p1 = v32)
    v3 = v3.copy(p0 = v51)
    var v66: Vector[s0] = v39
    v66 = v66.updated(0, v21)
    val v36: s0 = f69(v23)
    val v58: Vector[Vector[s0]] = v30.p1
    v52 = v52.updated(0, v36)
    var v46: s1 = v24
    val v91: Vector[Vector[s0]] = v24.p1
    v46 = v46.copy(p0 = v2)
    v3 = v3.copy(p0 = v66)
    v7 = v7.copy(p0 = v2)
    v14 = v21
    v6 = v6.copy(p1 = v31)
    v66 = v66.updated(0, v36)
    v7 = v7.copy(p1 = v49)
    v6 = v36
    v21 = v36
    v7 = v7.copy(p0 = v39)
    v46 = v46.copy(p1 = v58)
    val v85: Double = v23.p1
    val v235: Vector[Vector[s0]] = v30.p1
    v14 = v14.copy(p1 = v85)
    v17 = v17.copy(p1 = v91)
    v52 = v52.updated(0, v1)
    v3 = v3.copy(p1 = v45)
    val v349: Vector[s0] = v46.p0
    v17 = v17.copy(p1 = v235)
    v7 = v7.copy(p0 = v52)
    v3 = v3.copy(p0 = v52)
    v3 = v3.copy(p0 = v349)
    v37
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    var v7: s4 = v0
    val v3: Vector[s1] = v7.p1
    val v11: Vector[s1] = v7.p1
    val v15: s1 = v3(0)
    v7 = v7.copy(p1 = v3)
    val v19: s4 = f68(v7, v15)
    val v20: s0 = v19.p0
    val v13: s1 = v11(0)
    val v9: s1 = f75(v13)
    val v33: Vector[s1] = v7.p1
    v7 = v7.copy(p1 = v33)
    v7 = v7.copy(p1 = v33)
    val v14: Vector[s1] = v19.p1
    val v57: s0 = f24(v9, v20)
    v7 = v7.copy(p1 = v14)
    val v97: s0 = v19.p0
    v7 = v7.copy(p0 = v97)
    v7 = v7.copy(p0 = v97)
    val v115: Vector[Vector[Double]] = v57.p0
    v7 = v7.copy(p1 = v33)
    val v138: Vector[Double] = v115(0)
    val v144: Double = v138(0)
    v144
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s0(Vector(Vector(0.0)), 1.0), Vector(s1(Vector(s0(Vector(Vector(2.0)), 3.0)), Vector(Vector(s0(Vector(Vector(4.0)), 5.0)), Vector(s0(Vector(Vector(6.0)), 7.0)), Vector(s0(Vector(Vector(8.0)), 9.0))))))
    val v1: Double = 10.0
    val start = nanoTime()
    var result: Double = 10.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}