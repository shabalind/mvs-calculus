import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f118(v0: s0): s0 = {
    var v6: s0 = v0
    val v2: Vector[Vector[Double]] = v6.p0
    val v1: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v6.p1
    val v4: Vector[Double] = v1(1)
    var v7: Vector[Vector[Double]] = v2
    val v14: Vector[Vector[Double]] = v6.p0
    val v11: Vector[Vector[Double]] = v0.p0
    val v15: Vector[Vector[Double]] = v0.p1
    var v16: s0 = v6
    var v34: Vector[Vector[Double]] = v2
    var v21: s0 = v0
    v16 = v16.copy(p0 = v11)
    val v18: Vector[Vector[Double]] = v21.p1
    val v17: Vector[Vector[Double]] = v6.p0
    val v28: Vector[Double] = v15(1)
    v7 = v7.updated(1, v28)
    v7 = v7.updated(0, v28)
    v34 = v14
    v6 = v6.copy(p1 = v1)
    val v23: Vector[Double] = v17(0)
    val v54: Vector[Vector[Double]] = v0.p1
    var v29: Vector[Vector[Double]] = v54
    val v84: Vector[Vector[Double]] = v6.p1
    v16 = v16.copy(p0 = v34)
    val v38: Vector[Double] = v8(1)
    val v43: Vector[Vector[Double]] = v16.p0
    var v36: Vector[Vector[Double]] = v18
    var v30: Vector[Vector[Double]] = v43
    val v35: Vector[Double] = v15(1)
    v6 = v6.copy(p0 = v7)
    val v56: Vector[Vector[Double]] = Vector(v35, v4, v38, v38, v23)
    val v104: Vector[Double] = v84(1)
    v36 = v36.updated(0, v28)
    v29 = v84
    v21 = v21.copy(p1 = v29)
    v21 = v21.copy(p1 = v36)
    v6 = v6.copy(p0 = v7)
    var v122: Vector[Vector[Double]] = v56
    v16 = v16.copy(p1 = v36)
    v29 = v36
    v122 = v56
    var v42: Vector[Vector[Double]] = v30
    v42 = v42.updated(1, v104)
    val v161: Vector[Double] = v122(4)
    v34 = v34.updated(1, v161)
    val v201: s0 = s0(v42, v54)
    var v94: s0 = v201
    v94
  }
  def f107(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Double] = v4(2)
    val v6: Double = v2(0)
    val v3: Vector[Vector[Double]] = v0.p0
    val v14: Vector[Vector[Double]] = v0.p1
    val v13: Vector[Double] = v4(1)
    val v20: Vector[Double] = v3(1)
    val v12: Vector[Vector[Double]] = v0.p1
    val v11: Vector[Double] = v7(0)
    var v15: Vector[Vector[Double]] = v14
    v15 = v15.updated(0, v11)
    var v29: s0 = v0
    val v17: s0 = f118(v29)
    v29 = v29.copy(p1 = v12)
    val v34: s0 = f118(v17)
    val v24: s0 = f118(v29)
    var v23: Vector[Double] = v20
    val v35: Vector[Vector[Double]] = v34.p1
    v29 = v29.copy(p1 = v14)
    v15 = v15.updated(1, v23)
    v23 = v23.updated(0, v6)
    v15 = v15.updated(0, v20)
    val v39: Vector[Vector[Double]] = v34.p1
    val v32: Double = v13(0)
    v15 = v15.updated(0, v2)
    val v124: Vector[Vector[Vector[Double]]] = Vector(v14, v35, v15, v39, v35)
    val v52: Vector[Vector[Double]] = v124(2)
    v15 = v52
    v15 = v15.updated(1, v20)
    val v79: s0 = s0(v4, v52)
    val v72: s0 = f118(v34)
    v23 = v23.updated(0, v32)
    v23 = v23.updated(0, v6)
    val v160: Vector[s0] = Vector(v72, v24, v24, v17, v34, v79, v0)
    val v130: s0 = v160(1)
    v130
  }
  def f49(v0: s0): s0 = {
    var v2: s0 = v0
    var v3: s0 = v0
    val v1: s0 = f107(v2)
    val v9: Vector[Vector[Double]] = v2.p0
    val v6: s0 = f118(v1)
    val v5: s0 = f118(v2)
    var v7: Vector[Vector[Double]] = v9
    val v8: Vector[Vector[Double]] = v3.p1
    val v4: Vector[Vector[Double]] = v5.p0
    val v11: s0 = f118(v6)
    val v12: s0 = f107(v3)
    var v18: s0 = v12
    val v10: s0 = f107(v5)
    val v14: Vector[Double] = v4(1)
    var v13: Vector[Vector[Double]] = v7
    val v20: Vector[Vector[Vector[Double]]] = Vector(v4, v7)
    v7 = v7.updated(0, v14)
    val v21: s0 = f107(v0)
    val v25: Vector[Double] = v4(2)
    val v17: s0 = f107(v10)
    val v39: Vector[Vector[Double]] = v5.p0
    val v26: s0 = f118(v17)
    v7 = v7.updated(0, v25)
    val v32: Vector[Vector[Double]] = v1.p0
    val v53: s0 = f107(v26)
    val v36: Vector[Vector[Double]] = v11.p1
    val v19: s0 = f118(v18)
    v18 = v18.copy(p0 = v32)
    var v31: Vector[Vector[Double]] = v8
    var v28: Vector[Vector[Vector[Double]]] = v20
    v31 = v31.updated(1, v25)
    val v35: Vector[Vector[Double]] = v3.p1
    val v29: Vector[Vector[Double]] = v28(1)
    val v34: s0 = f107(v19)
    val v44: Vector[Vector[Double]] = v19.p1
    v18 = v18.copy(p0 = v7)
    val v40: Vector[Double] = v7(2)
    val v27: Vector[Double] = v44(0)
    v3 = v3.copy(p0 = v4)
    val v54: Vector[Double] = v31(1)
    v7 = v7.updated(0, v27)
    v7 = v7.updated(2, v40)
    val v51: Vector[Vector[Double]] = v12.p0
    val v62: Vector[Vector[Double]] = v34.p0
    v28 = v28.updated(1, v13)
    var v91: Vector[Vector[Double]] = v39
    val v74: Vector[Vector[Double]] = v21.p1
    v3 = v3.copy(p1 = v36)
    var v137: Vector[Double] = v54
    val v125: Vector[Vector[Double]] = v53.p0
    val v69: s0 = f118(v5)
    v7 = v51
    v3 = v3.copy(p0 = v13)
    v3 = v3.copy(p1 = v44)
    v2 = v2.copy(p0 = v125)
    v18 = v18.copy(p0 = v13)
    val v80: Vector[Vector[Double]] = v19.p1
    v2 = v2.copy(p1 = v8)
    v13 = v91
    v31 = v80
    v2 = v2.copy(p0 = v62)
    v13 = v13.updated(0, v137)
    v91 = v7
    val v94: s0 = s0(v29, v36)
    v3 = v3.copy(p1 = v8)
    v3 = v3.copy(p1 = v35)
    v3 = v3.copy(p1 = v74)
    val v87: Vector[Vector[Double]] = v69.p0
    v2 = v2.copy(p0 = v87)
    v94
  }
  def f4(v0: s0): s0 = {
    val v1: s0 = f107(v0)
    var v4: s0 = v0
    var v5: s0 = v1
    val v6: s0 = f49(v4)
    val v3: Vector[s0] = Vector(v1, v4, v5, v6)
    val v7: Vector[Vector[Double]] = v4.p1
    v5 = v5.copy(p1 = v7)
    val v10: Vector[Vector[Double]] = v1.p0
    v4 = v4.copy(p1 = v7)
    v5 = v5.copy(p0 = v10)
    val v84: Vector[Vector[s0]] = Vector(v3, v3)
    v4 = v4.copy(p0 = v10)
    val v106: Vector[s0] = v84(0)
    var v97: Vector[s0] = v106
    val v77: s0 = v97(2)
    v77
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v7: Vector[s0] = Vector(v0, v0, v0, v0, v0, v0, v0)
    val v2: s0 = v7(0)
    val v3: s0 = f4(v0)
    val v6: Vector[Vector[Double]] = v2.p0
    val v9: s0 = f107(v3)
    var v8: Vector[Vector[Double]] = v6
    val v13: Vector[Double] = v8(1)
    v8 = v8.updated(2, v13)
    val v16: Vector[Double] = v6(0)
    val v15: s0 = f4(v9)
    val v21: s0 = v7(5)
    val v18: Vector[Double] = v6(2)
    v8 = v6
    val v17: s0 = f107(v15)
    val v63: Vector[Double] = v6(2)
    v8 = v8.updated(1, v63)
    var v35: Vector[Vector[Double]] = v8
    var v45: Vector[Double] = v63
    val v29: Vector[Vector[Double]] = v21.p0
    val v60: Vector[Double] = v29(1)
    v35 = v35.updated(0, v45)
    val v19: Vector[Double] = v35(0)
    var v83: Double = v1
    v8 = v8.updated(0, v18)
    val v101: Double = v19(0)
    val v105: Double = v101 + v83
    val v68: Vector[Vector[Double]] = v17.p0
    v8 = v8.updated(2, v60)
    v35 = v35.updated(2, v16)
    val v172: Vector[Vector[Double]] = v2.p0
    v8 = v172
    v8 = v68
    v105
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Double = 5.0
    val start = nanoTime()
    var result: Double = 5.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}