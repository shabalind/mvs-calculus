import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f96(v0: s0): s0 = {
    var v6: s0 = v0
    val v1: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v1(1)
    val v4: Vector[Vector[Double]] = v6.p0
    v6 = v0
    val v16: Vector[Vector[Double]] = v6.p0
    val v9: Vector[Vector[Double]] = v6.p1
    val v8: s0 = s0(v1, v9)
    val v13: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v9)
    val v21: Vector[Vector[Double]] = v8.p1
    v6 = v6.copy(p0 = v21)
    var v30: Vector[Vector[Double]] = v13
    v30 = v9
    v6 = v6.copy(p1 = v30)
    val v19: s0 = s0(v16, v16)
    v6 = v6.copy(p0 = v4)
    var v64: s0 = v19
    v64 = v64.copy(p0 = v4)
    v30 = v30.updated(1, v3)
    val v105: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p1 = v105)
    v64
  }
  def f91(v0: s0, v1: s0): s0 = {
    var v5: s0 = v0
    var v2: s0 = v5
    var v10: s0 = v2
    v10
  }
  def f90(v0: s0, v1: s0): s0 = {
    val v5: Vector[Vector[Double]] = v1.p1
    val v4: Vector[Vector[Double]] = v0.p0
    val v10: Vector[s0] = Vector(v1, v0, v1, v0, v1)
    val v3: Vector[Double] = v5(0)
    val v7: Vector[Vector[Double]] = v1.p0
    val v2: s0 = f96(v1)
    val v18: s0 = f96(v1)
    val v8: s0 = f96(v18)
    val v27: s0 = f91(v8, v2)
    val v20: Vector[Vector[Double]] = v18.p0
    val v16: Vector[Double] = v5(0)
    val v26: Vector[Vector[Double]] = v1.p1
    val v28: s0 = f96(v8)
    var v29: Vector[Vector[Double]] = v5
    val v32: s0 = v10(4)
    val v55: Vector[Vector[Double]] = v28.p1
    val v24: s0 = f91(v32, v1)
    val v42: Vector[Vector[Double]] = v24.p0
    val v63: s0 = f96(v27)
    var v52: s0 = v8
    var v47: Vector[Vector[Double]] = v29
    val v35: s0 = s0(v55, v29)
    v52 = v52.copy(p1 = v20)
    v52 = v52.copy(p1 = v42)
    v52 = v52.copy(p0 = v26)
    v52 = v52.copy(p0 = v5)
    v52 = v52.copy(p0 = v42)
    v52 = v52.copy(p0 = v47)
    v52 = v35
    v47 = v7
    v52 = v52.copy(p1 = v42)
    val v135: s0 = f91(v18, v52)
    v52 = v52.copy(p0 = v42)
    v29 = v29.updated(1, v16)
    v52 = v52.copy(p0 = v4)
    v47 = v47.updated(1, v3)
    val v366: s0 = f91(v135, v63)
    v366
  }
  def f65(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v1: s0 = s0(v5, v5)
    val v2: s0 = f91(v1, v0)
    var v8: Vector[Vector[Double]] = v5
    var v3: s0 = v2
    val v11: Vector[Vector[Double]] = v3.p0
    val v6: s0 = f96(v3)
    val v9: s0 = f91(v1, v2)
    val v14: Vector[Vector[Double]] = v9.p1
    v3 = v3.copy(p1 = v5)
    v3 = v3.copy(p1 = v11)
    val v16: Vector[Vector[Double]] = v6.p0
    v3 = v3.copy(p1 = v16)
    val v25: Vector[Vector[Double]] = v9.p1
    val v27: s0 = f90(v9, v3)
    v3 = v3.copy(p1 = v25)
    val v26: Vector[s0] = Vector(v9)
    val v44: s0 = s0(v11, v8)
    val v49: s0 = v26(0)
    val v61: s0 = f91(v49, v1)
    val v29: Vector[Vector[Double]] = v9.p1
    val v35: s0 = f91(v44, v44)
    val v46: s0 = s0(v14, v25)
    v3 = v3.copy(p1 = v29)
    val v95: Vector[s0] = Vector(v46, v35, v61, v46, v35, v27)
    val v74: s0 = v95(4)
    v74
  }
  def f43(v0: s0): s0 = {
    var v1: s0 = v0
    val v6: s0 = f90(v1, v0)
    val v2: Vector[Vector[Double]] = v1.p0
    var v7: s0 = v1
    val v4: Vector[Vector[Double]] = v1.p0
    var v8: s0 = v1
    v7 = v7.copy(p0 = v2)
    val v9: Vector[Vector[Double]] = v1.p1
    v1 = v1.copy(p0 = v4)
    val v24: Vector[Vector[Double]] = v0.p1
    val v21: s0 = f96(v0)
    val v17: Vector[Vector[Double]] = v6.p1
    val v23: s0 = f91(v8, v8)
    val v32: s0 = f91(v21, v23)
    val v27: Vector[Vector[Double]] = v32.p1
    v7 = v7.copy(p1 = v4)
    var v30: s0 = v7
    val v37: Vector[Vector[Double]] = v6.p1
    val v43: Vector[Vector[Double]] = v6.p0
    var v16: s0 = v30
    v30 = v30.copy(p1 = v43)
    v1 = v1.copy(p0 = v2)
    v8 = v8.copy(p1 = v37)
    v7 = v7.copy(p0 = v24)
    v30 = v30.copy(p0 = v24)
    v30 = v30.copy(p0 = v27)
    v8 = v8.copy(p1 = v9)
    val v68: Vector[Vector[Double]] = v23.p1
    v16 = v16.copy(p0 = v9)
    var v132: s0 = v16
    v132 = v132.copy(p1 = v37)
    val v89: Vector[Vector[Double]] = v21.p0
    val v104: Vector[Vector[Double]] = v23.p0
    v30 = v30.copy(p1 = v43)
    v30 = v30.copy(p0 = v17)
    v8 = v8.copy(p1 = v89)
    v1 = v1.copy(p0 = v68)
    v132 = v132.copy(p0 = v104)
    v16 = v16.copy(p1 = v4)
    v132
  }
  def f38(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    var v3: Vector[Vector[Double]] = v7
    val v2: Vector[Double] = v7(0)
    val v10: Vector[Vector[Double]] = v0.p1
    val v4: s0 = f43(v0)
    v3 = v3.updated(1, v2)
    val v9: Vector[Vector[Double]] = v0.p1
    val v11: Vector[Vector[Double]] = v0.p1
    val v5: s0 = f96(v4)
    val v6: s0 = f96(v5)
    val v15: Vector[Double] = v10(1)
    v3 = v3.updated(0, v15)
    val v19: Vector[Vector[Double]] = v5.p0
    val v16: s0 = s0(v19, v3)
    val v14: s0 = f96(v16)
    var v21: Vector[Vector[Double]] = v3
    val v12: s0 = f91(v14, v16)
    v3 = v19
    val v43: s0 = s0(v21, v7)
    val v29: Vector[Vector[Double]] = v43.p0
    val v20: s0 = s0(v3, v29)
    v21 = v21.updated(1, v2)
    val v84: s0 = f96(v6)
    val v27: Vector[Vector[Double]] = Vector(v2)
    v21 = v21.updated(1, v2)
    var v48: Vector[Vector[Double]] = v7
    val v33: Vector[Vector[Vector[Double]]] = Vector(v7, v9, v19, v48, v9, v48, v11)
    v48 = v48.updated(0, v2)
    val v54: Vector[Vector[Double]] = v20.p0
    val v53: Vector[Vector[Double]] = v12.p0
    val v28: s0 = f65(v84)
    var v37: Vector[Vector[Double]] = v27
    val v76: Vector[Vector[Double]] = v33(3)
    val v97: Vector[Vector[Double]] = v33(2)
    val v39: Vector[Double] = v37(0)
    v37 = v37.updated(0, v39)
    var v74: Vector[Vector[Double]] = v11
    var v102: s0 = v28
    v48 = v48.updated(0, v39)
    v102 = v102.copy(p1 = v76)
    val v125: Vector[Vector[Double]] = v28.p0
    v102 = v102.copy(p1 = v125)
    v48 = v74
    v102 = v102.copy(p0 = v54)
    v102 = v102.copy(p1 = v53)
    v102 = v102.copy(p1 = v11)
    v102 = v102.copy(p1 = v11)
    v102 = v102.copy(p1 = v97)
    v102 = v102.copy(p1 = v21)
    v102
  }
  def f29(v0: s0): s0 = {
    var v6: s0 = v0
    val v3: s0 = f38(v0)
    val v5: Vector[Vector[Double]] = v0.p1
    val v2: Vector[Vector[Double]] = v3.p1
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p1 = v2)
    val v4: s0 = f96(v3)
    v6 = v6.copy(p0 = v2)
    v6 = v6.copy(p1 = v5)
    val v13: s0 = f65(v3)
    val v34: Vector[Vector[Double]] = v0.p0
    val v20: Vector[Vector[Double]] = v3.p0
    v6 = v6.copy(p1 = v5)
    val v21: s0 = f65(v6)
    v6 = v6.copy(p1 = v20)
    val v30: Vector[Vector[Double]] = v21.p0
    val v50: Vector[Vector[Double]] = v4.p0
    val v24: Vector[Vector[Double]] = v13.p0
    v6 = v6.copy(p0 = v50)
    val v33: Vector[Vector[Double]] = v13.p1
    var v26: s0 = v3
    v6 = v6.copy(p1 = v24)
    v26 = v26.copy(p0 = v33)
    val v48: Vector[Vector[Double]] = v0.p0
    v26 = v26.copy(p1 = v30)
    val v72: Vector[Vector[Double]] = v13.p0
    val v101: Vector[Vector[Double]] = v3.p0
    var v44: Vector[Vector[Double]] = v72
    v26 = v26.copy(p1 = v48)
    val v87: s0 = f96(v26)
    v26 = v26.copy(p0 = v101)
    v26 = v26.copy(p0 = v33)
    v26 = v26.copy(p0 = v44)
    v6 = v6.copy(p1 = v34)
    v87
  }
  def f11(v0: s0): s0 = {
    var v5: s0 = v0
    val v1: Vector[Vector[Double]] = v5.p0
    val v7: s0 = f90(v0, v5)
    val v4: s0 = f91(v0, v0)
    v5 = v5.copy(p0 = v1)
    val v2: Vector[Vector[Double]] = v5.p0
    val v15: Vector[Vector[Double]] = v4.p1
    v5 = v5.copy(p0 = v2)
    v5 = v5.copy(p0 = v15)
    v5 = v5.copy(p1 = v15)
    v7
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    var v2: s0 = v0
    val v3: Vector[Vector[Double]] = v2.p1
    var v6: s0 = v2
    val v10: Vector[Vector[Double]] = v0.p1
    val v8: s0 = f11(v0)
    val v14: s0 = f91(v2, v6)
    val v4: Vector[Vector[Double]] = v8.p1
    v2 = v2.copy(p0 = v4)
    val v13: s0 = f43(v0)
    val v21: Vector[Vector[Double]] = v14.p0
    val v20: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p0 = v3)
    v6 = v6.copy(p0 = v3)
    var v26: s0 = v6
    v2 = v2.copy(p0 = v21)
    val v39: s0 = s0(v21, v21)
    val v49: s0 = f29(v13)
    var v36: Vector[Vector[Double]] = v10
    v6 = v6.copy(p1 = v4)
    val v72: s0 = f91(v26, v49)
    v2 = v2.copy(p0 = v36)
    v6 = v6.copy(p1 = v20)
    var v64: s0 = v8
    val v224: s0 = f96(v72)
    val v136: Vector[Vector[Double]] = v224.p1
    val v99: Vector[s0] = Vector(v64, v64, v39, v13, v49)
    val v102: s0 = v99(1)
    val v94: Vector[Vector[Double]] = v102.p1
    val v91: Vector[Double] = v94(0)
    v6 = v6.copy(p1 = v136)
    val v178: Double = v91(0)
    v2 = v2.copy(p0 = v10)
    v64 = v64.copy(p0 = v4)
    v178
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Double = 4.0
    val start = nanoTime()
    var result: Double = 4.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}