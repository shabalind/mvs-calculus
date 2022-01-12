import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  case class s7 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  def f25(v0: s0): s0 = {
    var v2: s0 = v0
    v2 = v0
    var v6: s0 = v0
    var v5: s0 = v2
    var v1: s0 = v6
    v6 = v1
    val v4: Vector[Vector[Double]] = v5.p1
    val v3: Vector[Double] = v4(0)
    val v8: Double = v3(0)
    val v15: Vector[Double] = v4(0)
    var v7: Vector[Double] = v3
    val v10: Double = v15(0)
    v7 = v7.updated(0, v10)
    v7 = v7.updated(0, v8)
    val v23: Vector[Double] = v4(0)
    v7 = v7.updated(0, v10)
    var v9: Vector[Vector[Double]] = v4
    v9 = v9.updated(0, v23)
    val v13: Vector[Vector[Double]] = v5.p0
    var v22: s0 = v1
    var v17: s0 = v2
    v9 = v9.updated(0, v15)
    v9 = v9.updated(0, v15)
    var v31: Vector[Vector[Double]] = v13
    v22 = v22.copy(p0 = v31)
    val v42: Vector[Vector[Double]] = v22.p1
    var v18: s0 = v17
    var v14: Vector[Vector[Double]] = v31
    val v37: Vector[Double] = v42(0)
    v31 = v31.updated(0, v7)
    v9 = v9.updated(0, v7)
    v9 = v9.updated(0, v7)
    v18 = v18.copy(p0 = v14)
    v31 = v31.updated(1, v37)
    v17 = v17.copy(p1 = v9)
    v18
  }
  def f24(v0: s0): s0 = {
    val v2: s0 = f25(v0)
    val v3: Vector[Vector[Double]] = v2.p1
    val v7: Vector[Vector[Double]] = v2.p1
    val v5: Vector[Double] = v3(0)
    val v6: s0 = f25(v2)
    var v11: Vector[Vector[Double]] = v7
    val v10: Vector[Double] = v7(0)
    var v14: Vector[Vector[Double]] = v7
    v14 = v14.updated(0, v10)
    val v43: Vector[Double] = v3(0)
    val v52: s0 = f25(v2)
    v11 = v11.updated(0, v10)
    var v13: Vector[Vector[Double]] = v11
    val v36: Vector[Vector[Double]] = v0.p1
    var v23: Vector[Double] = v43
    var v22: Vector[Vector[Double]] = v14
    val v99: s0 = f25(v6)
    var v26: Vector[Double] = v10
    val v25: s0 = f25(v52)
    val v18: Vector[Vector[Double]] = v99.p0
    val v40: Vector[Vector[Double]] = v0.p0
    var v50: s0 = v0
    v50 = v50.copy(p0 = v18)
    val v30: Vector[Double] = v18(1)
    v50 = v50.copy(p1 = v36)
    v11 = v11.updated(0, v5)
    v13 = v13.updated(0, v23)
    v50 = v50.copy(p0 = v40)
    val v27: Vector[Vector[Double]] = v2.p1
    v50 = v50.copy(p1 = v13)
    val v77: s0 = f25(v25)
    val v87: s0 = f25(v77)
    v50 = v50.copy(p1 = v7)
    v22 = v22.updated(0, v30)
    val v37: Vector[Vector[Double]] = v87.p1
    val v67: s0 = f25(v50)
    val v49: Vector[Vector[Double]] = v77.p1
    val v101: s0 = f25(v67)
    v50 = v50.copy(p1 = v36)
    v50 = v50.copy(p1 = v27)
    v11 = v11.updated(0, v5)
    v14 = v14.updated(0, v5)
    v50 = v50.copy(p1 = v13)
    v50 = v50.copy(p1 = v49)
    var v85: s0 = v101
    v14 = v14.updated(0, v23)
    v22 = v22.updated(0, v5)
    val v125: s0 = f25(v85)
    val v65: Double = v10(0)
    val v100: Vector[Vector[Double]] = v25.p0
    v26 = v26.updated(0, v65)
    v50 = v50.copy(p1 = v37)
    v85 = v85.copy(p1 = v22)
    v13 = v13.updated(0, v26)
    v50 = v50.copy(p0 = v100)
    v125
  }
  def f16(v0: s0): s0 = {
    var v3: s0 = v0
    val v5: Vector[Vector[Double]] = v0.p0
    val v6: s0 = f25(v0)
    v3 = v3.copy(p0 = v5)
    val v18: s0 = f25(v0)
    val v11: Vector[Vector[Double]] = v3.p1
    var v25: s0 = v6
    val v14: s0 = f24(v25)
    val v17: Vector[Vector[Double]] = v18.p0
    v3 = v3.copy(p0 = v17)
    var v34: s0 = v3
    val v72: s0 = f24(v14)
    val v40: s0 = f24(v14)
    v34 = v34.copy(p1 = v11)
    val v41: Vector[Vector[Double]] = v72.p0
    v34 = v34.copy(p1 = v11)
    v3 = v3.copy(p0 = v41)
    val v28: Vector[Vector[Double]] = v6.p1
    v3 = v3.copy(p1 = v28)
    val v24: Vector[Vector[Double]] = v40.p1
    v25 = v25.copy(p1 = v28)
    v25 = v25.copy(p1 = v24)
    v34
  }
  @noinline
  def f0(v0: s7, v1: s0, v2: Double): Double = {
    val v4: Vector[Vector[Double]] = v1.p1
    val v6: Vector[Double] = v4(0)
    val v10: s0 = f16(v1)
    val v15: Vector[Double] = v4(0)
    val v80: Vector[Double] = v4(0)
    val v41: Double = v15(0)
    var v38: Vector[Double] = v6
    val v30: Vector[Vector[Double]] = v10.p0
    val v54: Double = v38(0)
    var v52: Vector[Vector[Double]] = v30
    var v81: Double = v2
    val v177: Vector[Double] = v52(0)
    v52 = v52.updated(1, v38)
    var v116: Vector[Double] = v38
    v38 = v116
    v52 = v52.updated(1, v80)
    v38 = v38.updated(0, v54)
    val v144: Vector[Double] = Vector(v2, v41, v54, v81)
    val v270: Double = v144(2)
    v38 = v177
    v270
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s1(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))))), Vector(Vector(s1(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))))), Vector(s1(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))))))))
    val v1: s0 = s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))
    val v2: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}