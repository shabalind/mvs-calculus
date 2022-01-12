import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1
  )
  def f121(v0: Vector[Double]): Vector[Double] = {
    val v1: Vector[Vector[Double]] = Vector(v0)
    var v5: Vector[Vector[Double]] = v1
    val v4: Double = v0(0)
    v5 = v1
    var v7: Double = v4
    v5 = v5.updated(0, v0)
    val v14: Vector[Double] = v5(0)
    var v19: Vector[Double] = v14
    var v13: Vector[Double] = v19
    v19 = v19.updated(0, v7)
    var v12: Vector[Double] = v13
    v5 = v5.updated(0, v14)
    v5 = v5.updated(0, v12)
    v12 = v12.updated(0, v7)
    var v44: Vector[Double] = v13
    v44
  }
  def f115(v0: s0): s0 = {
    var v7: s0 = v0
    v7 = v0
    var v1: s0 = v7
    val v2: Vector[Vector[Double]] = v7.p0
    v1 = v7
    v7 = v7.copy(p0 = v2)
    val v14: Vector[Vector[Double]] = v0.p0
    v1 = v1.copy(p0 = v2)
    val v9: s1 = s1(v7, v0)
    val v25: Vector[Vector[Double]] = v7.p0
    val v32: Vector[s0] = Vector(v1, v7)
    v1 = v1.copy(p0 = v14)
    val v42: s1 = s1(v0, v1)
    val v17: Vector[Vector[Double]] = v7.p1
    var v46: s1 = v9
    val v29: s0 = v46.p0
    val v16: s0 = v9.p0
    val v22: Vector[s0] = Vector(v29, v16, v7, v1, v7, v0)
    val v59: s0 = v9.p1
    v7 = v7.copy(p1 = v17)
    var v49: s1 = v42
    val v47: s0 = v32(0)
    val v65: Vector[Vector[Double]] = v1.p0
    v46 = v46.copy(p0 = v7)
    var v92: Vector[s0] = v32
    v1 = v1.copy(p0 = v25)
    v7 = v7.copy(p1 = v17)
    val v71: s0 = v49.p0
    v7 = v7.copy(p1 = v17)
    val v67: s0 = v42.p1
    val v80: s0 = s0(v65, v17)
    val v44: s0 = v92(0)
    val v54: s0 = v46.p0
    val v172: s0 = v9.p1
    v49 = v49.copy(p0 = v47)
    v49 = v49.copy(p0 = v67)
    v49 = v49.copy(p1 = v29)
    v49 = v9
    val v58: Vector[Vector[Double]] = v54.p1
    val v123: s0 = v22(5)
    val v197: Vector[Vector[Double]] = v80.p1
    v1 = v1.copy(p1 = v197)
    var v75: Vector[s0] = v22
    v46 = v46.copy(p0 = v44)
    v49 = v49.copy(p0 = v123)
    v92 = v92.updated(0, v16)
    val v124: s0 = v75(5)
    var v235: s0 = v59
    v7 = v71
    v49 = v49.copy(p0 = v235)
    v49 = v49.copy(p0 = v59)
    v46 = v46.copy(p0 = v172)
    v235 = v235.copy(p1 = v58)
    v124
  }
  def f88(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p0
    var v5: Vector[Vector[Double]] = v7
    val v2: Vector[Double] = v5(1)
    val v1: Vector[Double] = v7(0)
    v5 = v5.updated(2, v2)
    val v3: s0 = f115(v0)
    v5 = v5.updated(2, v1)
    v5 = v7
    var v13: Vector[Vector[Double]] = v7
    var v15: s0 = v3
    val v12: s0 = f115(v3)
    val v47: s0 = f115(v0)
    var v21: Vector[Vector[Double]] = v5
    v15 = v15.copy(p0 = v21)
    v15 = v15.copy(p0 = v13)
    val v17: Vector[Vector[Double]] = v12.p1
    var v20: Vector[Vector[Double]] = v17
    val v48: Vector[Vector[Double]] = v0.p0
    var v22: s0 = v3
    val v74: Vector[Double] = v20(0)
    val v38: Vector[Double] = v48(2)
    v21 = v21.updated(0, v74)
    val v35: Vector[Double] = f121(v38)
    v15 = v15.copy(p1 = v20)
    val v68: Vector[Vector[Double]] = v15.p0
    v22 = v22.copy(p0 = v13)
    v15 = v15.copy(p0 = v68)
    val v99: s0 = f115(v22)
    var v59: s0 = v0
    v15 = v15.copy(p1 = v17)
    val v55: s0 = f115(v59)
    val v95: Vector[Vector[Double]] = v3.p1
    v59 = v59.copy(p1 = v95)
    val v61: s0 = f115(v3)
    val v49: Vector[Vector[Double]] = v47.p1
    v59 = v59.copy(p0 = v21)
    val v104: Vector[Vector[Double]] = v61.p1
    val v94: Vector[Double] = f121(v35)
    v59 = v59.copy(p1 = v49)
    val v66: Vector[Vector[Double]] = v99.p0
    val v129: s1 = s1(v55, v47)
    v15 = v15.copy(p0 = v13)
    val v93: Vector[Vector[Double]] = v59.p1
    val v96: Vector[Vector[Double]] = v61.p0
    v21 = v21.updated(2, v94)
    v15 = v15.copy(p1 = v93)
    v22 = v22.copy(p1 = v104)
    v15 = v15.copy(p0 = v66)
    val v117: Vector[Double] = v104(0)
    v59 = v59.copy(p0 = v68)
    var v81: s1 = v129
    var v100: s1 = v81
    val v121: s0 = v100.p1
    v5 = v5.updated(1, v117)
    v15 = v15.copy(p0 = v96)
    v121
  }
  def f69(v0: s1): s1 = {
    val v4: s0 = v0.p0
    val v7: s0 = f88(v4)
    val v3: s0 = f115(v7)
    val v8: Vector[Vector[Double]] = v4.p1
    val v2: s0 = f115(v4)
    val v5: s0 = v0.p1
    val v17: s0 = f115(v2)
    var v12: s1 = v0
    val v16: s0 = f88(v5)
    var v15: s0 = v7
    val v11: s0 = v0.p1
    val v21: s0 = v12.p1
    val v41: s0 = f88(v16)
    val v22: s1 = s1(v17, v41)
    val v32: Vector[Vector[Double]] = v21.p0
    var v29: s1 = v12
    v15 = v15.copy(p1 = v8)
    val v36: s0 = f88(v3)
    val v31: s0 = f88(v41)
    v12 = v0
    v12 = v29
    val v25: s0 = f115(v41)
    val v24: s0 = s0(v32, v8)
    val v52: s0 = f115(v24)
    v12 = v12.copy(p0 = v31)
    v12 = v12.copy(p0 = v52)
    v12 = v12.copy(p0 = v36)
    v15 = v41
    val v144: s0 = v0.p1
    val v50: s0 = v12.p0
    v29 = v29.copy(p1 = v15)
    val v71: Vector[Vector[Double]] = v17.p1
    v15 = v15.copy(p1 = v71)
    v29 = v29.copy(p1 = v4)
    v12 = v12.copy(p0 = v16)
    var v179: s1 = v12
    v15 = v15.copy(p1 = v8)
    v29 = v29.copy(p1 = v144)
    v15 = v11
    v29 = v29.copy(p0 = v17)
    v12 = v12.copy(p1 = v25)
    v29 = v22
    v179 = v179.copy(p0 = v50)
    val v91: s0 = f115(v24)
    v15 = v91
    v179
  }
  @noinline
  def f0(v0: Vector[s0], v1: s2, v2: Double): Double = {
    val v5: s1 = v1.p1
    val v8: s0 = v5.p1
    val v16: Vector[Vector[Double]] = v8.p0
    val v14: s1 = f69(v5)
    val v26: s0 = v14.p0
    val v33: Vector[Vector[Double]] = v26.p1
    var v29: Vector[Vector[Double]] = v33
    val v25: Vector[Double] = v16(0)
    v29 = v29.updated(1, v25)
    val v50: Vector[Double] = v29(1)
    v29 = v29.updated(0, v50)
    val v98: Double = v50(0)
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))
    val v1: s2 = s2(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))
    val v2: Double = 25.0
    val start = nanoTime()
    var result: Double = 25.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}