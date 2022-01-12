import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f22(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v6: s0 = v0
    v6 = v6.copy(p0 = v5)
    val v4: Vector[Vector[Double]] = v0.p0
    v6 = v0
    val v7: Vector[Vector[Double]] = v6.p0
    val v1: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p0 = v4)
    val v3: Vector[Double] = v7(0)
    val v10: Vector[Vector[Double]] = v6.p1
    val v9: Vector[Vector[Double]] = v0.p0
    var v18: s0 = v0
    val v13: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v1)
    var v8: Vector[Vector[Double]] = v10
    var v11: s0 = v0
    v6 = v6.copy(p1 = v10)
    val v25: Vector[Double] = v8(1)
    var v23: Vector[Double] = v25
    v8 = v8.updated(1, v3)
    var v12: Vector[Vector[Double]] = v10
    v6 = v6.copy(p0 = v13)
    val v31: Vector[Double] = v12(0)
    v12 = v12.updated(0, v3)
    v12 = v12.updated(0, v23)
    var v20: s0 = v6
    val v17: Vector[Vector[Double]] = v0.p0
    var v44: Vector[Double] = v3
    v20 = v20.copy(p0 = v17)
    val v26: Vector[Vector[Double]] = v0.p1
    v11 = v11.copy(p1 = v8)
    v20 = v20.copy(p0 = v9)
    val v36: Vector[Vector[Double]] = v0.p0
    v20 = v0
    val v27: s0 = s0(v1, v12)
    val v24: Vector[Vector[Double]] = v18.p0
    val v21: Double = v31(0)
    v11 = v11.copy(p0 = v24)
    v20 = v11
    val v60: Vector[Vector[Double]] = v18.p1
    v11 = v0
    var v38: Vector[Double] = v3
    v12 = v12.updated(0, v44)
    var v54: Double = v21
    val v98: Vector[Vector[Double]] = v0.p0
    v44 = v44.updated(0, v54)
    v44 = v44.updated(0, v54)
    v11 = v11.copy(p1 = v26)
    v23 = v23.updated(0, v21)
    v6 = v6.copy(p0 = v98)
    var v65: Vector[Double] = v44
    var v58: Double = v54
    v65 = v65.updated(0, v58)
    v12 = v12.updated(1, v31)
    v12 = v12.updated(1, v65)
    val v50: Vector[s0] = Vector(v11)
    var v78: s0 = v27
    v12 = v12.updated(0, v25)
    var v99: s0 = v78
    val v101: s0 = v50(0)
    val v86: Vector[Vector[Double]] = v20.p0
    val v105: Vector[Vector[Double]] = v18.p1
    var v118: Vector[s0] = v50
    v11 = v11.copy(p0 = v24)
    v11 = v11.copy(p0 = v36)
    v18 = v18.copy(p0 = v86)
    v20 = v20.copy(p0 = v1)
    val v144: Double = v38(0)
    var v69: s0 = v20
    val v100: Vector[Vector[Double]] = v20.p1
    v99 = v101
    v20 = v20.copy(p1 = v60)
    v11 = v11.copy(p1 = v105)
    val v87: s0 = v118(0)
    val v67: s0 = v50(0)
    v18 = v18.copy(p1 = v60)
    v6 = v6.copy(p1 = v26)
    val v113: Vector[Vector[Double]] = v99.p0
    v20 = v20.copy(p1 = v26)
    val v103: Vector[s0] = Vector(v87, v11, v69)
    v118 = v118.updated(0, v6)
    v65 = v65.updated(0, v144)
    v118 = v118.updated(0, v67)
    v69 = v69.copy(p1 = v100)
    v6 = v6.copy(p0 = v113)
    var v194: Vector[s0] = v103
    var v110: Vector[s0] = v194
    val v135: s0 = v110(2)
    v135
  }
  def f19(v0: s0): s0 = {
    val v18: s0 = f22(v0)
    val v9: s0 = f22(v18)
    val v22: s0 = f22(v9)
    val v70: s0 = f22(v22)
    v70
  }
  def f16(v0: s0): s0 = {
    val v5: s0 = f22(v0)
    val v2: s0 = f22(v5)
    val v3: s0 = f22(v2)
    val v6: Vector[Vector[Double]] = v2.p1
    val v8: Vector[Vector[Double]] = v2.p1
    val v4: s0 = f19(v3)
    val v1: Vector[Double] = v8(0)
    var v14: Vector[Vector[Double]] = v8
    val v20: Vector[Vector[Double]] = v4.p0
    var v12: s0 = v5
    v12 = v12.copy(p0 = v20)
    v12 = v12.copy(p1 = v14)
    var v13: Vector[Vector[Double]] = v20
    v14 = v14.updated(0, v1)
    v12 = v12.copy(p1 = v6)
    val v18: s0 = s0(v20, v6)
    val v29: Vector[Vector[Double]] = v12.p1
    val v21: s0 = s0(v13, v14)
    val v26: s0 = f22(v5)
    var v30: s0 = v18
    val v48: Vector[Vector[Double]] = v30.p1
    val v33: Vector[Double] = v13(1)
    val v73: Vector[Vector[Double]] = v21.p1
    val v22: Vector[Vector[Double]] = v30.p0
    v12 = v12.copy(p1 = v73)
    v13 = v13.updated(0, v33)
    var v55: s0 = v26
    val v39: s0 = f22(v55)
    v55 = v55.copy(p1 = v29)
    var v90: Vector[Vector[Double]] = v8
    v55 = v55.copy(p0 = v22)
    val v76: s0 = f19(v39)
    val v102: Vector[Vector[Double]] = v21.p1
    v30 = v30.copy(p1 = v48)
    v55 = v55.copy(p1 = v90)
    v30 = v30.copy(p1 = v102)
    v76
  }
  @noinline
  def f0(v0: s1, v1: Vector[s1], v2: s1, v3: Double): Double = {
    val v4: Vector[s0] = v2.p0
    val v10: s1 = v1(0)
    var v11: s1 = v10
    val v13: Vector[s0] = v10.p0
    val v20: s0 = v11.p1
    v11 = v11.copy(p0 = v13)
    v11 = v11.copy(p0 = v4)
    val v44: s0 = f16(v20)
    val v70: Vector[Vector[Double]] = v44.p1
    val v56: Vector[Double] = v70(0)
    var v128: Vector[Double] = v56
    val v48: Double = v128(0)
    v48
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))
    val v3: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}