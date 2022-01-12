import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f107(v0: Vector[s0]): Vector[s0] = {
    var v1: Vector[s0] = v0
    val v5: s0 = v0(2)
    var v3: Vector[s0] = v0
    val v7: s0 = v3(0)
    val v6: s0 = v1(0)
    val v9: Vector[Vector[s0]] = Vector(v3, v1, v0, v0, v3, v1, v0)
    val v8: s0 = v3(0)
    v3 = v3.updated(0, v8)
    v1 = v3
    val v16: Vector[s0] = v9(4)
    val v12: s0 = v16(1)
    v1 = v1.updated(1, v8)
    v3 = v3.updated(2, v7)
    var v25: Vector[s0] = v16
    var v28: Vector[s0] = v25
    v1 = v1.updated(2, v12)
    v3 = v3.updated(0, v5)
    v3 = v3.updated(2, v5)
    v1 = v1.updated(1, v7)
    val v26: s1 = s1(v28, v6)
    v28 = v28.updated(1, v12)
    v25 = v25.updated(2, v12)
    val v37: s0 = v26.p1
    val v100: Vector[s0] = v26.p0
    v28 = v28.updated(0, v37)
    v1 = v1.updated(0, v5)
    v25 = v28
    v28 = v28.updated(0, v7)
    var v113: Vector[s0] = v100
    v28 = v28.updated(1, v7)
    v113
  }
  def f106(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p2
    val v8: Vector[Vector[Double]] = v0.p2
    val v4: Vector[Double] = v8(0)
    val v1: Vector[Vector[Double]] = v0.p0
    val v11: Vector[Vector[Double]] = v0.p2
    var v6: s0 = v0
    v6 = v6.copy(p0 = v1)
    var v22: Vector[Vector[Double]] = v11
    var v15: s0 = v6
    val v14: Vector[Vector[Double]] = v6.p0
    v6 = v6.copy(p0 = v1)
    v6 = v6.copy(p0 = v14)
    var v69: Vector[Vector[Double]] = v1
    val v24: Vector[Double] = v3(1)
    val v17: Vector[Vector[Double]] = v6.p0
    v15 = v15.copy(p0 = v17)
    v6 = v0
    v22 = v22.updated(0, v24)
    v22 = v22.updated(1, v4)
    v6 = v6.copy(p0 = v1)
    var v40: s0 = v15
    v40 = v40.copy(p0 = v69)
    v15 = v15.copy(p2 = v3)
    v40 = v40.copy(p1 = v22)
    val v61: Vector[Vector[Double]] = v40.p1
    val v38: Vector[Vector[Double]] = v15.p0
    v69 = v69.updated(0, v24)
    v15 = v15.copy(p1 = v22)
    val v96: s0 = s0(v38, v61, v8)
    v96
  }
  def f105(v0: s0): s0 = {
    var v6: s0 = v0
    var v2: s0 = v0
    val v4: s0 = f106(v6)
    val v12: Vector[Vector[Double]] = v2.p1
    val v5: Vector[Double] = v12(0)
    var v11: s0 = v2
    var v10: Vector[Vector[Double]] = v12
    v6 = v6.copy(p2 = v12)
    v10 = v12
    v10 = v10.updated(0, v5)
    v2 = v2.copy(p1 = v10)
    var v14: Vector[Vector[Double]] = v12
    v11 = v11.copy(p2 = v14)
    val v17: s0 = f106(v4)
    val v13: Vector[Vector[Double]] = v17.p2
    val v19: Vector[Vector[Double]] = v17.p0
    var v31: Vector[Vector[Double]] = v19
    v31 = v31.updated(1, v5)
    val v20: Vector[Double] = v19(0)
    val v22: Vector[Vector[Vector[Double]]] = Vector(v13, v12)
    val v23: Vector[Vector[Double]] = v11.p2
    val v29: s0 = s0(v31, v23, v13)
    v31 = v31.updated(1, v5)
    val v33: Vector[Vector[Double]] = v22(0)
    v11 = v11.copy(p1 = v14)
    var v93: Vector[Double] = v20
    v11 = v11.copy(p0 = v19)
    val v51: Vector[Vector[Double]] = v29.p1
    val v110: s0 = f106(v29)
    v14 = v14.updated(1, v93)
    val v205: Vector[Vector[Double]] = v110.p0
    v11 = v11.copy(p2 = v33)
    v6 = v6.copy(p0 = v205)
    v11 = v11.copy(p2 = v51)
    v110
  }
  def f101(v0: s1): s1 = {
    var v2: s1 = v0
    var v5: s1 = v2
    val v3: s0 = v0.p1
    val v8: s0 = f106(v3)
    v2 = v2.copy(p1 = v8)
    var v4: s0 = v3
    v5 = v2
    v2 = v2.copy(p1 = v4)
    v5
  }
  def f98(v0: s1): s1 = {
    val v1: s1 = f101(v0)
    val v7: Vector[s0] = v1.p0
    val v3: Vector[s0] = f107(v7)
    var v9: s1 = v0
    v9 = v9.copy(p0 = v3)
    var v5: s1 = v1
    val v8: s0 = v7(1)
    var v10: s0 = v8
    v5 = v5.copy(p0 = v7)
    val v11: s0 = f106(v10)
    val v22: s0 = f106(v11)
    val v14: Vector[s0] = v1.p0
    v5 = v5.copy(p0 = v14)
    val v20: Vector[s0] = v9.p0
    val v18: s1 = s1(v3, v10)
    val v31: s1 = f101(v18)
    val v46: Vector[Vector[Double]] = v22.p2
    v5 = v5.copy(p0 = v20)
    var v32: s1 = v31
    v10 = v10.copy(p2 = v46)
    val v56: Vector[s0] = v5.p0
    v32 = v32.copy(p0 = v56)
    v32
  }
  def f97(v0: s0, v1: s1): s0 = {
    val v5: Vector[s0] = v1.p0
    var v8: Vector[s0] = v5
    val v6: s1 = s1(v8, v0)
    val v2: s1 = f101(v6)
    var v4: s0 = v0
    val v3: Vector[s0] = f107(v5)
    val v15: s0 = v3(2)
    v4 = v15
    val v11: s0 = v2.p1
    var v22: s0 = v11
    val v12: Vector[Vector[Double]] = v0.p2
    val v23: s0 = f106(v4)
    v4 = v4.copy(p2 = v12)
    v8 = v8.updated(1, v23)
    v4 = v4.copy(p2 = v12)
    val v29: s0 = v5(2)
    val v70: Vector[Vector[Double]] = v29.p1
    v22 = v22.copy(p2 = v70)
    v22
  }
  def f93(v0: s1): s1 = {
    val v4: Vector[s0] = v0.p0
    val v18: s1 = f98(v0)
    val v14: s0 = v18.p1
    val v29: s1 = s1(v4, v14)
    v29
  }
  def f92(v0: Vector[s0], v1: s0): s0 = {
    val v7: s0 = v0(0)
    val v6: s0 = f105(v7)
    val v2: s0 = v0(1)
    var v9: Vector[s0] = v0
    v9 = v9.updated(2, v1)
    val v5: s0 = v0(1)
    val v4: Vector[Vector[Double]] = v7.p2
    val v8: Vector[s0] = f107(v0)
    val v24: s0 = v8(2)
    val v12: s1 = s1(v8, v6)
    val v19: s0 = f106(v5)
    v9 = v0
    val v11: s0 = v12.p1
    val v43: s0 = v12.p1
    val v18: Vector[s0] = f107(v9)
    v9 = v9.updated(2, v7)
    var v30: s1 = v12
    v9 = v9.updated(0, v11)
    v9 = v9.updated(0, v24)
    v9 = v9.updated(2, v43)
    var v15: s1 = v30
    var v23: Vector[s0] = v18
    val v50: s0 = v15.p1
    v15 = v15.copy(p1 = v6)
    val v25: s0 = v8(2)
    v23 = v23.updated(1, v24)
    v15 = v15.copy(p0 = v8)
    val v29: s0 = f106(v19)
    v30 = v30.copy(p0 = v9)
    val v27: s0 = f97(v6, v15)
    v9 = v9.updated(0, v50)
    var v32: Vector[Vector[Double]] = v4
    v9 = v9.updated(1, v2)
    v15 = v15.copy(p0 = v9)
    v23 = v23.updated(2, v29)
    val v68: s0 = v12.p1
    v30 = v30.copy(p0 = v23)
    v30 = v30.copy(p1 = v5)
    v15 = v15.copy(p1 = v25)
    v30 = v30.copy(p1 = v68)
    var v112: s0 = v25
    v30 = v30.copy(p1 = v112)
    v112 = v112.copy(p1 = v4)
    v112 = v112.copy(p2 = v32)
    v27
  }
  def f91(v0: s1): s1 = {
    val v5: Vector[s0] = v0.p0
    var v7: Vector[s0] = v5
    val v3: s1 = f93(v0)
    val v2: s0 = v5(2)
    var v8: s0 = v2
    v7 = v7.updated(0, v8)
    var v6: s0 = v8
    val v11: s1 = f93(v3)
    var v10: s0 = v2
    val v17: Vector[Vector[Double]] = v8.p2
    val v1: s0 = f97(v6, v11)
    val v9: s0 = v0.p1
    var v4: s1 = v11
    val v20: Vector[Vector[Double]] = v6.p1
    val v12: s0 = v5(1)
    val v13: Vector[s0] = v4.p0
    var v18: s0 = v9
    var v19: Vector[s0] = v7
    v18 = v2
    var v15: s1 = v4
    val v30: Vector[Vector[Double]] = v18.p2
    v19 = v19.updated(2, v12)
    val v25: s0 = f97(v12, v11)
    val v16: Vector[Vector[Double]] = v18.p0
    val v29: s0 = v13(1)
    val v27: Vector[Vector[Double]] = v25.p2
    val v21: s0 = v19(2)
    v4 = v4.copy(p0 = v13)
    var v42: Vector[Vector[Double]] = v30
    v7 = v7.updated(1, v6)
    var v43: Vector[Vector[Double]] = v16
    val v37: Vector[Double] = v17(1)
    var v67: Vector[Vector[Double]] = v43
    val v31: s0 = f105(v2)
    val v52: s0 = v15.p1
    var v32: Vector[Double] = v37
    var v82: s0 = v1
    val v53: Vector[Vector[Double]] = v52.p1
    v43 = v67
    val v73: Vector[s0] = f107(v7)
    v6 = v6.copy(p2 = v20)
    v10 = v10.copy(p0 = v67)
    v6 = v6.copy(p0 = v43)
    val v56: Vector[Vector[Double]] = v82.p1
    v82 = v82.copy(p1 = v53)
    v10 = v10.copy(p0 = v67)
    val v47: s1 = s1(v7, v21)
    val v79: Vector[Vector[Double]] = v21.p0
    v19 = v19.updated(0, v25)
    v18 = v18.copy(p2 = v42)
    val v118: Vector[Double] = v27(1)
    val v81: Vector[Vector[Double]] = v8.p0
    v18 = v31
    v18 = v18.copy(p1 = v56)
    v42 = v42.updated(0, v32)
    v4 = v4.copy(p1 = v29)
    val v71: Vector[Double] = v79(0)
    val v101: s1 = f93(v47)
    v42 = v42.updated(0, v71)
    v4 = v4.copy(p1 = v10)
    v15 = v15.copy(p0 = v73)
    v67 = v67.updated(2, v118)
    v82 = v82.copy(p0 = v81)
    v42 = v42.updated(1, v118)
    v6 = v6.copy(p2 = v17)
    v101
  }
  def f89(v0: s1): s1 = {
    var v6: s1 = v0
    val v7: s1 = f91(v6)
    var v2: s1 = v7
    val v4: Vector[s0] = v2.p0
    val v13: Vector[s0] = v6.p0
    var v3: Vector[s0] = v13
    val v10: s0 = v4(1)
    var v9: s0 = v10
    v3 = v3.updated(1, v10)
    v3 = v3.updated(1, v9)
    v3 = v3.updated(2, v10)
    val v15: s0 = v3(1)
    val v24: Vector[s0] = v6.p0
    val v14: s0 = f92(v24, v15)
    var v19: s0 = v14
    val v23: s1 = s1(v4, v15)
    val v20: Vector[s0] = f107(v3)
    var v59: s1 = v23
    var v79: Vector[s0] = v20
    v3 = v3.updated(0, v19)
    val v60: s0 = v59.p1
    v79 = v79.updated(1, v60)
    v6 = v6.copy(p0 = v79)
    v59
  }
  @noinline
  def f0(v0: Vector[s0], v1: s1, v2: Double): Double = {
    val v6: s1 = f101(v1)
    val v5: s1 = f89(v6)
    val v12: s0 = v5.p1
    val v9: Double = v2 * v2
    val v21: Vector[Vector[Double]] = v12.p1
    val v26: Vector[Double] = v21(1)
    var v37: Vector[Double] = v26
    val v104: Double = v37(0)
    val v80: Double = v104 * v2
    val v122: Double = v80 - v9
    v122
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0))))
    val v1: s1 = s1(Vector(s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}