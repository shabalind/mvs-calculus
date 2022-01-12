import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  def f46(v0: s0): s0 = {
    var v5: s0 = v0
    var v6: s0 = v0
    val v3: Vector[s0] = Vector(v5, v6, v5, v0)
    val v2: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v5.p0
    var v9: Vector[Vector[Double]] = v2
    v5 = v6
    val v10: Vector[Vector[Double]] = v0.p0
    v6 = v6.copy(p1 = v4)
    val v17: s0 = v3(1)
    val v7: Vector[Vector[Double]] = v6.p1
    val v8: Vector[Vector[Double]] = v6.p1
    val v12: Vector[Double] = v2(1)
    v5 = v5.copy(p1 = v10)
    var v13: Vector[Vector[Double]] = v8
    val v14: Vector[Double] = v2(0)
    var v21: s0 = v17
    val v11: Vector[Vector[Double]] = v6.p1
    var v24: s0 = v21
    val v16: Vector[Double] = v4(1)
    val v15: Double = v14(0)
    var v28: Vector[Double] = v14
    var v22: Double = v15
    v24 = v24.copy(p1 = v7)
    val v35: s0 = v3(2)
    v9 = v10
    v21 = v35
    v6 = v6.copy(p1 = v2)
    v6 = v6.copy(p1 = v2)
    val v32: Vector[Double] = v2(0)
    v5 = v5.copy(p0 = v8)
    val v36: s0 = v3(1)
    v5 = v5.copy(p0 = v11)
    v6 = v6.copy(p1 = v11)
    v28 = v28.updated(0, v22)
    v6 = v6.copy(p1 = v8)
    val v97: Vector[Vector[Double]] = v24.p1
    val v26: s0 = v3(3)
    var v18: Vector[Vector[Double]] = v11
    val v43: Vector[Vector[Double]] = v35.p1
    val v30: Vector[Vector[Double]] = v26.p0
    var v38: Vector[Vector[Double]] = v97
    v24 = v24.copy(p1 = v13)
    val v53: Vector[Vector[Double]] = Vector(v28, v28, v14, v16, v28)
    v38 = v38.updated(0, v32)
    val v52: Vector[s0] = Vector(v36, v35, v6, v35)
    v24 = v24.copy(p0 = v43)
    val v63: Vector[Vector[Double]] = v24.p1
    var v87: Vector[Vector[Double]] = v53
    v38 = v38.updated(0, v14)
    v9 = v9.updated(0, v32)
    val v70: Vector[Vector[Double]] = v26.p0
    v6 = v6.copy(p1 = v18)
    val v77: s0 = v52(3)
    v24 = v24.copy(p0 = v9)
    v38 = v38.updated(1, v12)
    val v88: Vector[Double] = v87(4)
    val v59: Vector[Vector[Double]] = v5.p0
    v18 = v18.updated(0, v88)
    v6 = v6.copy(p0 = v30)
    v24 = v24.copy(p0 = v43)
    v5 = v5.copy(p1 = v63)
    val v101: Vector[Double] = v38(0)
    v21 = v21.copy(p0 = v18)
    v21 = v21.copy(p1 = v70)
    val v104: Vector[Vector[Double]] = v24.p0
    v5 = v5.copy(p0 = v59)
    v21 = v26
    v87 = v87.updated(3, v101)
    v6 = v6.copy(p0 = v63)
    v24 = v24.copy(p1 = v70)
    v5 = v5.copy(p0 = v104)
    v77
  }
  def f2(v0: s0): s0 = {
    val v1: s0 = f46(v0)
    var v4: s0 = v0
    var v8: s0 = v1
    val v7: s0 = f46(v8)
    var v6: s0 = v1
    val v5: s0 = f46(v1)
    val v3: Vector[Vector[Double]] = v4.p0
    val v2: Vector[Double] = v3(1)
    var v14: Vector[Vector[Double]] = v3
    val v10: Vector[Vector[Double]] = v0.p0
    v8 = v8.copy(p0 = v10)
    v14 = v14.updated(1, v2)
    val v9: Vector[Double] = v14(1)
    var v11: Vector[Vector[Double]] = v10
    val v25: Double = v9(0)
    var v18: Vector[Vector[Double]] = v10
    var v40: s0 = v6
    var v21: Double = v25
    var v12: Vector[Double] = v2
    val v16: Vector[Vector[Double]] = v4.p1
    var v17: Vector[Vector[Double]] = v14
    val v19: Double = v2(0)
    val v73: Vector[Vector[Double]] = v8.p1
    val v20: Vector[Vector[Double]] = v6.p0
    var v39: Vector[Vector[Double]] = v3
    val v41: s0 = f46(v7)
    val v51: Vector[Double] = v11(0)
    val v50: s0 = f46(v8)
    v39 = v39.updated(0, v51)
    v17 = v17.updated(0, v2)
    val v29: s0 = s0(v3, v14)
    v6 = v6.copy(p0 = v18)
    v8 = v8.copy(p1 = v39)
    var v58: Vector[Vector[Double]] = v11
    val v70: Vector[Double] = v58(0)
    var v24: Vector[Double] = v2
    val v56: Vector[Vector[Double]] = v50.p1
    var v46: Vector[Vector[Double]] = v10
    val v30: Double = v70(0)
    val v52: s0 = f46(v40)
    var v75: Vector[Double] = v24
    v6 = v6.copy(p0 = v17)
    val v69: s0 = f46(v6)
    v18 = v18.updated(0, v24)
    v8 = v52
    var v192: Vector[Double] = v75
    val v133: Vector[Vector[Double]] = v29.p0
    v17 = v46
    val v57: Vector[Double] = v56(1)
    v4 = v4.copy(p0 = v16)
    v192 = v192.updated(0, v30)
    var v91: Vector[Vector[Double]] = v14
    v40 = v52
    v8 = v7
    val v109: s0 = f46(v69)
    v91 = v91.updated(0, v9)
    var v87: s0 = v41
    v192 = v51
    v4 = v4.copy(p1 = v46)
    val v63: Double = v57(0)
    val v108: Vector[Vector[Double]] = v109.p0
    var v164: Double = v19
    v18 = v18.updated(0, v24)
    v4 = v4.copy(p0 = v133)
    v46 = v46.updated(0, v192)
    v24 = v24.updated(0, v164)
    v8 = v8.copy(p1 = v18)
    v87 = v87.copy(p0 = v133)
    v4 = v4.copy(p1 = v91)
    v24 = v24.updated(0, v63)
    val v125: Vector[Vector[Double]] = v5.p0
    v12 = v12.updated(0, v21)
    v91 = v73
    v58 = v125
    v4 = v4.copy(p0 = v108)
    v87 = v87.copy(p0 = v20)
    val v373: Vector[Vector[Double]] = v50.p1
    v87 = v87.copy(p0 = v373)
    v39 = v39.updated(1, v12)
    v91 = v17
    v87
  }
  @noinline
  def f0(v0: s0, v1: Vector[s2], v2: Double): Double = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: s0 = s0(v3, v3)
    val v6: Vector[Vector[Double]] = v4.p1
    val v18: Vector[Vector[Double]] = v0.p1
    val v14: s0 = s0(v18, v6)
    val v37: Double = v2 - v2
    val v58: s0 = f2(v14)
    val v30: Vector[Vector[Double]] = v58.p0
    val v35: Vector[Double] = v30(0)
    var v28: Vector[Double] = v35
    val v50: Double = v28(0)
    v28 = v28.updated(0, v37)
    v50
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), s2(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), s2(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))))))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}