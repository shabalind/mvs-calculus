import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  def f90(v0: s1): s1 = {
    val v3: s0 = v0.p0
    var v6: s0 = v3
    val v10: Vector[Vector[Double]] = v3.p1
    v6 = v6.copy(p1 = v10)
    var v1: s1 = v0
    val v11: s0 = v0.p0
    val v8: Vector[Vector[Double]] = v11.p3
    var v17: s1 = v1
    val v36: s1 = s1(v3, v11)
    val v12: Vector[Vector[Double]] = v3.p3
    val v18: s0 = v1.p1
    v1 = v1.copy(p0 = v11)
    val v37: s0 = v17.p1
    val v28: Vector[s1] = Vector(v17, v17, v36, v0)
    val v22: Vector[s0] = Vector(v3, v6, v18)
    var v29: Vector[s0] = v22
    v6 = v6.copy(p1 = v10)
    v1 = v1.copy(p0 = v37)
    val v34: s1 = v28(3)
    val v59: s0 = v0.p0
    v17 = v17.copy(p0 = v3)
    val v38: s0 = v29(0)
    v1 = v1.copy(p1 = v6)
    v17 = v17.copy(p0 = v38)
    v6 = v6.copy(p2 = v8)
    val v83: s0 = v29(2)
    val v70: s0 = v36.p0
    v17 = v17.copy(p1 = v59)
    v1 = v1.copy(p0 = v83)
    v17 = v17.copy(p1 = v70)
    v6 = v6.copy(p2 = v12)
    v34
  }
  def f88(v0: s1): s1 = {
    var v2: s1 = v0
    val v7: s1 = f90(v0)
    var v4: s1 = v0
    val v1: s1 = f90(v2)
    var v9: s1 = v7
    val v6: s0 = v9.p1
    val v13: Vector[s0] = Vector(v6, v6, v6, v6, v6, v6)
    val v11: Vector[Vector[Double]] = v6.p1
    var v8: Vector[s0] = v13
    val v15: s0 = v8(2)
    val v10: s0 = v13(1)
    val v12: s0 = v1.p1
    val v23: s1 = s1(v12, v15)
    val v24: s0 = v2.p0
    v8 = v8.updated(4, v10)
    v8 = v8.updated(1, v12)
    val v19: Vector[Vector[Double]] = v10.p0
    val v16: s0 = v1.p1
    v8 = v8.updated(5, v24)
    val v21: s1 = f90(v4)
    val v29: Vector[Vector[Double]] = v6.p2
    val v39: Vector[Vector[Double]] = v15.p0
    v9 = v9.copy(p1 = v15)
    val v44: s0 = v13(3)
    v8 = v8.updated(0, v10)
    val v59: s1 = f90(v21)
    v8 = v8.updated(1, v44)
    var v37: s0 = v16
    val v32: Vector[Vector[Double]] = v16.p3
    v2 = v2.copy(p0 = v37)
    v9 = v9.copy(p1 = v6)
    val v56: s0 = v0.p1
    val v73: s0 = s0(v19, v11, v39, v39)
    v37 = v37.copy(p0 = v32)
    v8 = v8.updated(2, v37)
    val v136: s1 = f90(v23)
    val v53: Vector[Vector[Double]] = v12.p3
    var v63: s0 = v10
    v63 = v63.copy(p1 = v11)
    v8 = v8.updated(2, v6)
    v4 = v4.copy(p0 = v73)
    v37 = v37.copy(p2 = v53)
    v9 = v59
    v9 = v9.copy(p1 = v44)
    val v93: s1 = f90(v136)
    v37 = v37.copy(p3 = v29)
    v2 = v2.copy(p1 = v56)
    v9 = v9.copy(p1 = v63)
    v93
  }
  def f84(v0: s0, v1: s0): s0 = {
    var v6: s0 = v1
    val v3: Vector[Vector[Double]] = v1.p1
    var v2: Vector[Vector[Double]] = v3
    val v9: Vector[Vector[Double]] = v1.p2
    var v10: Vector[Vector[Double]] = v3
    val v8: Vector[Vector[Double]] = v6.p1
    val v4: Vector[Double] = v3(0)
    var v5: Vector[Double] = v4
    val v11: Vector[Double] = v8(0)
    val v12: Vector[Vector[Double]] = v6.p0
    val v15: Double = v11(0)
    val v16: Vector[Vector[Double]] = v6.p3
    v5 = v5.updated(0, v15)
    var v29: Double = v15
    val v13: Vector[Vector[Double]] = v0.p2
    v6 = v6.copy(p0 = v12)
    val v22: Vector[Double] = v12(0)
    var v17: Double = v29
    val v36: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v13)
    val v21: Double = v17 / v17
    v5 = v5.updated(0, v29)
    v6 = v6.copy(p2 = v12)
    var v34: Double = v21
    var v32: Vector[Vector[Double]] = v9
    v2 = v2.updated(1, v4)
    val v49: Vector[Vector[Double]] = v1.p0
    v5 = v5.updated(0, v34)
    v6 = v6.copy(p2 = v16)
    v6 = v6.copy(p2 = v49)
    v2 = v2.updated(0, v5)
    var v56: Vector[Vector[Double]] = v2
    val v87: Vector[Vector[Double]] = v6.p3
    v32 = v32.updated(0, v11)
    val v42: Vector[Vector[Double]] = v6.p1
    var v39: s0 = v1
    var v55: s0 = v39
    val v85: s1 = s1(v55, v55)
    val v52: s1 = f90(v85)
    val v30: s1 = f88(v52)
    val v54: Vector[Vector[Double]] = v55.p1
    val v51: Vector[Double] = v54(1)
    v6 = v6.copy(p1 = v2)
    v2 = v2.updated(1, v51)
    val v48: s1 = f90(v52)
    v55 = v55.copy(p0 = v16)
    val v77: s1 = f90(v48)
    val v69: Vector[Double] = v87(0)
    v10 = v10.updated(0, v22)
    val v98: s1 = f90(v85)
    val v68: s0 = v77.p0
    v39 = v39.copy(p1 = v56)
    v55 = v55.copy(p1 = v8)
    v10 = v8
    v55 = v55.copy(p3 = v36)
    v5 = v5.updated(0, v29)
    val v93: s1 = f88(v30)
    val v81: s1 = f90(v93)
    val v76: s0 = v98.p1
    val v144: Vector[Double] = v10(1)
    val v111: s0 = v81.p0
    v2 = v2.updated(1, v144)
    val v82: Vector[Double] = v42(0)
    v10 = v10.updated(1, v11)
    v32 = v32.updated(0, v51)
    v56 = v56.updated(0, v69)
    val v184: Vector[Vector[Double]] = v76.p0
    var v122: Vector[Double] = v4
    var v165: s0 = v111
    v2 = v2.updated(1, v82)
    val v273: Vector[s0] = Vector(v68, v55, v76, v165)
    v6 = v6.copy(p3 = v32)
    v10 = v10.updated(0, v122)
    var v161: Vector[s0] = v273
    v55 = v55.copy(p0 = v184)
    val v130: s0 = v161(0)
    v130
  }
  def f83(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v7: s0 = f84(v0, v0)
    val v2: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v2(1)
    val v10: s0 = f84(v0, v7)
    var v8: s0 = v0
    val v13: Vector[Double] = v2(0)
    v8 = v8.copy(p1 = v2)
    val v6: s1 = s1(v7, v10)
    val v18: s1 = f88(v6)
    val v11: Vector[Vector[Double]] = v10.p3
    var v9: s0 = v7
    val v23: s0 = v6.p0
    val v21: Vector[Double] = v11(0)
    val v25: Vector[s0] = Vector(v0, v7, v9, v7, v23, v9)
    val v27: s0 = f84(v0, v10)
    val v12: s0 = v25(4)
    val v19: s0 = f84(v23, v12)
    val v16: s0 = f84(v8, v27)
    val v61: Vector[Vector[Double]] = v12.p0
    val v33: s1 = f90(v18)
    var v41: Vector[Double] = v21
    v8 = v8.copy(p2 = v11)
    val v38: s0 = v25(4)
    val v54: Vector[Vector[Double]] = v16.p0
    v8 = v8.copy(p2 = v54)
    val v48: Double = v13(0)
    var v50: Vector[Vector[Double]] = v2
    val v29: s0 = v33.p0
    val v36: Vector[Vector[Double]] = v29.p1
    v8 = v8.copy(p1 = v2)
    val v42: Vector[Vector[Double]] = v38.p3
    val v31: Vector[Vector[Double]] = v8.p0
    val v51: Vector[Vector[Double]] = v16.p0
    v9 = v9.copy(p3 = v42)
    var v62: Vector[Vector[Double]] = v50
    var v37: Vector[Double] = v13
    v8 = v8.copy(p0 = v51)
    v9 = v9.copy(p1 = v62)
    v9 = v9.copy(p2 = v54)
    val v84: Vector[Vector[Double]] = v23.p0
    v9 = v9.copy(p3 = v84)
    val v91: Vector[Vector[Double]] = v19.p3
    val v175: s0 = s0(v91, v36, v31, v91)
    v8 = v8.copy(p3 = v51)
    var v148: s0 = v175
    val v195: s0 = f84(v148, v7)
    v50 = v50.updated(1, v3)
    v50 = v50.updated(0, v41)
    v8 = v8.copy(p2 = v51)
    v9 = v9.copy(p2 = v61)
    v62 = v62.updated(0, v37)
    v37 = v37.updated(0, v48)
    v148 = v148.copy(p1 = v4)
    v195
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: s0, v3: Double): Double = {
    val v5: s0 = v0.p1
    val v8: s0 = f83(v1)
    val v12: Vector[Vector[Double]] = v8.p1
    val v22: Vector[Vector[Double]] = v5.p3
    val v23: s0 = s0(v22, v12, v22, v22)
    val v31: Vector[Vector[Double]] = v23.p0
    val v33: Vector[Double] = v31(0)
    val v47: Double = v33(0)
    v47
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0))), s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)), Vector(Vector(9.0))))
    val v1: s0 = s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)))
    val v2: s0 = s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0)), Vector(Vector(19.0)))
    val v3: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}