import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s0]]
  )
  case class s6 (
    p0: Vector[s0],
    p1: s0
  )
  def f81(v0: s2, v1: s2): s2 = {
    val v7: Vector[Vector[s0]] = v0.p1
    var v6: s2 = v1
    v6 = v0
    val v3: s1 = v0.p0
    val v12: Vector[s0] = v7(0)
    v6 = v6.copy(p0 = v3)
    var v18: Vector[Vector[s0]] = v7
    val v14: s1 = v6.p0
    v6 = v6.copy(p0 = v3)
    v6 = v6.copy(p1 = v18)
    val v40: s2 = s2(v14, v7)
    v18 = v7
    v18 = v18.updated(0, v12)
    v40
  }
  def f77(v0: s1): s1 = {
    val v6: Vector[s1] = Vector(v0, v0, v0, v0, v0, v0)
    val v1: s1 = v6(3)
    val v2: Vector[Vector[s0]] = v1.p1
    val v4: s0 = v0.p0
    val v5: s0 = v0.p0
    val v3: Vector[Double] = v4.p0
    var v12: Vector[Vector[s0]] = v2
    var v10: s0 = v4
    val v7: Vector[Vector[Double]] = v4.p1
    val v9: Vector[s0] = v2(0)
    var v26: Vector[s0] = v9
    val v25: Vector[Double] = v4.p0
    val v11: s1 = s1(v5, v2)
    v26 = v26.updated(0, v5)
    val v13: Vector[s0] = v12(1)
    val v15: Vector[Double] = v7(0)
    var v20: Vector[Double] = v3
    var v22: s0 = v10
    v12 = v12.updated(0, v26)
    v26 = v26.updated(0, v10)
    val v14: s6 = s6(v13, v22)
    val v17: Vector[s0] = v14.p0
    v12 = v12.updated(2, v9)
    v12 = v12.updated(2, v13)
    v12 = v12.updated(0, v13)
    val v24: s0 = v14.p1
    val v18: Vector[s6] = Vector(v14, v14, v14, v14, v14, v14, v14)
    var v60: Vector[Double] = v20
    v12 = v12.updated(0, v26)
    v22 = v22.copy(p1 = v7)
    var v28: Vector[Vector[Double]] = v7
    v26 = v26.updated(0, v24)
    v28 = v28.updated(2, v15)
    v12 = v12.updated(1, v17)
    v22 = v22.copy(p0 = v25)
    v22 = v22.copy(p0 = v20)
    val v45: Vector[Double] = v10.p0
    v22 = v22.copy(p1 = v7)
    v28 = v28.updated(1, v15)
    val v37: s6 = v18(2)
    var v38: Vector[Vector[Double]] = v28
    val v29: s0 = v37.p1
    v10 = v10.copy(p0 = v45)
    val v49: s0 = v26(0)
    val v61: s0 = v13(0)
    val v50: Vector[Double] = v7(1)
    val v41: Vector[Double] = v49.p0
    v10 = v10.copy(p1 = v38)
    var v169: Vector[s0] = v26
    val v89: Vector[Vector[Double]] = Vector(v60, v60, v41, v25)
    v22 = v22.copy(p0 = v25)
    var v96: Vector[Vector[Double]] = v38
    v96 = v96.updated(0, v50)
    v22 = v22.copy(p0 = v60)
    val v167: Vector[Double] = v89(3)
    v169 = v169.updated(0, v61)
    v28 = v96
    v26 = v26.updated(0, v4)
    v12 = v12.updated(1, v169)
    var v99: s1 = v11
    val v216: s0 = v169(0)
    var v74: s1 = v99
    v74 = v74.copy(p0 = v216)
    v10 = v10.copy(p1 = v7)
    v99 = v99.copy(p0 = v29)
    v22 = v22.copy(p0 = v167)
    v74
  }
  def f76(v0: s2): s2 = {
    val v5: s2 = f81(v0, v0)
    var v4: s2 = v5
    val v7: s1 = v4.p0
    var v6: s2 = v0
    var v8: s2 = v5
    var v3: s2 = v0
    val v9: s1 = f77(v7)
    var v10: s2 = v5
    val v13: s2 = f81(v6, v5)
    var v16: s2 = v13
    var v23: s2 = v16
    val v27: s1 = v16.p0
    val v25: s1 = f77(v27)
    var v12: s2 = v10
    var v15: s2 = v6
    val v19: Vector[Vector[s0]] = v27.p1
    var v17: s1 = v9
    val v40: s2 = f81(v0, v3)
    v6 = v6.copy(p0 = v17)
    val v26: Vector[Vector[s0]] = v40.p1
    var v32: Vector[Vector[s0]] = v26
    val v24: Vector[s0] = v19(0)
    val v30: Vector[Vector[s0]] = v27.p1
    var v35: Vector[s0] = v24
    val v33: s1 = f77(v9)
    var v31: Vector[s0] = v24
    v32 = v32.updated(0, v24)
    var v68: s2 = v4
    val v37: s0 = v33.p0
    v12 = v12.copy(p0 = v25)
    val v57: s0 = v31(0)
    val v38: Vector[Vector[s0]] = v9.p1
    var v28: s2 = v23
    v28 = v8
    v35 = v35.updated(0, v57)
    var v76: s2 = v23
    v15 = v15.copy(p1 = v26)
    val v41: Vector[s0] = v30(2)
    val v62: Vector[s0] = v38(0)
    v32 = v32.updated(0, v62)
    val v191: Vector[Vector[s0]] = v76.p1
    val v51: Vector[Vector[s0]] = v28.p1
    v35 = v35.updated(0, v37)
    v32 = v32.updated(0, v35)
    val v50: s1 = f77(v27)
    var v42: Vector[Vector[s0]] = v32
    v17 = v7
    val v46: s2 = f81(v6, v12)
    v42 = v42.updated(0, v41)
    val v83: s2 = f81(v46, v68)
    v68 = v68.copy(p1 = v51)
    v23 = v23.copy(p1 = v51)
    v42 = v42.updated(0, v31)
    v76 = v76.copy(p0 = v50)
    val v118: s2 = f81(v15, v83)
    v4 = v4.copy(p1 = v191)
    v76 = v76.copy(p1 = v42)
    v118
  }
  def f57(v0: Vector[Vector[s0]]): Vector[Vector[s0]] = {
    var v4: Vector[Vector[s0]] = v0
    var v6: Vector[Vector[s0]] = v4
    val v5: Vector[s0] = v6(0)
    var v20: Vector[Vector[s0]] = v0
    v20 = v20.updated(0, v5)
    v20
  }
  @noinline
  def f0(v0: s2, v1: Vector[Vector[s1]], v2: Double): Double = {
    val v7: s2 = f76(v0)
    val v6: Vector[Vector[s0]] = v7.p1
    val v3: s1 = v7.p0
    val v8: Vector[Vector[s0]] = f57(v6)
    val v9: Vector[s0] = v8(0)
    val v4: s0 = v9(0)
    val v10: Vector[s1] = v1(0)
    val v15: s0 = v3.p0
    val v18: s1 = v10(0)
    val v12: s0 = v18.p0
    val v94: Vector[s0] = Vector(v12, v15, v12, v4)
    val v69: s0 = v94(2)
    val v82: Vector[Double] = v69.p0
    val v62: Double = v82(1)
    val v120: Double = v2 + v2
    val v126: Double = v120 / v62
    v126
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(Vector(s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(Vector(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(Vector(s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))))))
    val v2: Double = 54.0
    val start = nanoTime()
    var result: Double = 54.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}