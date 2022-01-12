import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  def f108(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v6: s0 = v0
    v6 = v6.copy(p0 = v2)
    var v1: s0 = v0
    var v5: s0 = v6
    val v3: Vector[Vector[Double]] = v1.p2
    val v7: Vector[Vector[Double]] = v1.p2
    val v12: Vector[Vector[Double]] = v6.p0
    val v13: Vector[Vector[Double]] = v0.p1
    val v9: s0 = s0(v12, v7, v3)
    v5 = v5.copy(p2 = v13)
    v1 = v1.copy(p2 = v7)
    v1 = v1.copy(p1 = v7)
    var v18: s0 = v1
    val v38: Vector[Vector[Double]] = v0.p0
    val v16: Vector[Vector[Double]] = v1.p1
    var v17: Vector[Vector[Double]] = v7
    val v31: Vector[Vector[Double]] = v9.p1
    val v25: Vector[Vector[Double]] = v18.p0
    val v37: Vector[Vector[Double]] = v18.p0
    v6 = v6.copy(p2 = v7)
    v18 = v18.copy(p2 = v16)
    v6 = v6.copy(p2 = v3)
    v6 = v6.copy(p0 = v37)
    val v58: Vector[Vector[Double]] = v6.p0
    v1 = v1.copy(p0 = v25)
    v6 = v6.copy(p2 = v17)
    val v32: s1 = s1(v9, v18)
    v6 = v6.copy(p0 = v38)
    v6 = v5
    v1 = v1.copy(p0 = v58)
    v6 = v6.copy(p1 = v31)
    var v125: s1 = v32
    var v151: s1 = v125
    val v99: s0 = v151.p0
    v99
  }
  def f102(v0: s2): s2 = {
    var v2: s2 = v0
    v2 = v0
    var v6: s2 = v2
    val v4: s1 = v6.p0
    var v8: s2 = v0
    v8 = v8.copy(p0 = v4)
    val v7: s0 = v4.p0
    val v5: s0 = f108(v7)
    val v11: Vector[Vector[Double]] = v5.p1
    var v10: s0 = v7
    v2 = v8
    var v20: s1 = v4
    v10 = v10.copy(p1 = v11)
    val v18: s0 = f108(v5)
    v8 = v8.copy(p0 = v20)
    val v34: s0 = f108(v18)
    v6 = v6.copy(p1 = v10)
    val v37: s2 = s2(v20, v5)
    v20 = v20.copy(p1 = v10)
    v2 = v2.copy(p1 = v10)
    v2 = v2.copy(p0 = v20)
    v20 = v20.copy(p0 = v34)
    v37
  }
  def f100(v0: s1, v1: s0): s0 = {
    var v9: s1 = v0
    val v21: s0 = v0.p0
    var v4: s1 = v9
    v4 = v4.copy(p0 = v21)
    v4 = v0
    val v12: s0 = v4.p0
    v12
  }
  def f97(v0: s0): s0 = {
    val v6: s0 = f108(v0)
    val v3: s0 = f108(v6)
    val v12: s0 = f108(v3)
    val v29: Vector[Vector[Double]] = v6.p0
    val v17: s0 = f108(v12)
    var v31: s0 = v17
    v31 = v31.copy(p0 = v29)
    val v83: s0 = f108(v31)
    v83
  }
  def f86(v0: s1): s1 = {
    var v3: s1 = v0
    val v2: s0 = v3.p1
    val v5: s0 = f108(v2)
    val v1: s0 = f108(v5)
    val v11: s0 = f100(v0, v5)
    val v42: s0 = f97(v11)
    val v54: s0 = f97(v1)
    var v35: s1 = v3
    val v41: s0 = v35.p1
    v3 = v3.copy(p0 = v54)
    v35 = v35.copy(p0 = v41)
    val v108: s0 = v35.p0
    val v58: s0 = f100(v0, v2)
    val v33: s0 = f108(v42)
    v3 = v3.copy(p1 = v108)
    v3 = v3.copy(p1 = v33)
    val v100: s0 = f108(v58)
    v3 = v35
    v3 = v3.copy(p0 = v5)
    val v117: s0 = f108(v33)
    v35 = v3
    val v140: s1 = s1(v100, v58)
    v3 = v3.copy(p0 = v117)
    v140
  }
  def f48(v0: s0): s0 = {
    var v1: s0 = v0
    var v12: s0 = v1
    v12
  }
  def f41(v0: s0): s0 = {
    val v2: s0 = f48(v0)
    val v1: s0 = f48(v0)
    val v3: s0 = f108(v2)
    var v10: s0 = v2
    val v13: Vector[Vector[Double]] = v1.p1
    val v14: Vector[Vector[Double]] = v1.p0
    val v25: Vector[Vector[Double]] = v10.p0
    var v16: Vector[Vector[Double]] = v13
    val v42: s0 = s0(v25, v16, v13)
    val v109: Vector[Double] = v25(0)
    v10 = v10.copy(p2 = v13)
    val v43: Vector[Vector[Double]] = v0.p0
    val v27: Vector[Vector[Double]] = v0.p2
    v10 = v10.copy(p1 = v27)
    val v38: Vector[Vector[Double]] = v42.p1
    val v71: Vector[Double] = v16(0)
    v10 = v10.copy(p0 = v43)
    val v121: Vector[Double] = v25(0)
    val v99: Vector[Vector[Double]] = v3.p2
    v16 = v16.updated(0, v109)
    v16 = v99
    val v63: Vector[Double] = v14(0)
    v16 = v99
    v16 = v16.updated(0, v71)
    v16 = v16.updated(0, v121)
    val v98: s0 = s0(v14, v13, v38)
    var v92: s0 = v98
    v16 = v16.updated(0, v63)
    v92 = v92.copy(p0 = v25)
    v92
  }
  def f29(v0: Vector[s1], v1: s2): s2 = {
    val v6: s0 = v1.p1
    val v3: Vector[Vector[Double]] = v6.p2
    var v7: s0 = v6
    var v10: Vector[Vector[Double]] = v3
    val v2: s1 = v0(0)
    var v12: s0 = v7
    val v8: Vector[Double] = v3(0)
    v12 = v6
    v7 = v7.copy(p1 = v3)
    val v4: s0 = v2.p0
    val v13: Vector[Double] = v10(0)
    v10 = v10.updated(0, v13)
    var v14: Vector[Vector[Double]] = v10
    var v33: Vector[Vector[Double]] = v3
    v33 = v33.updated(0, v8)
    val v19: s0 = f108(v12)
    val v23: s0 = f97(v19)
    val v26: Vector[Vector[Double]] = v6.p2
    val v39: Vector[Double] = v10(0)
    var v36: s0 = v23
    val v35: s2 = f102(v1)
    v36 = v36.copy(p2 = v26)
    v10 = v10.updated(0, v8)
    v33 = v33.updated(0, v39)
    v36 = v36.copy(p2 = v14)
    val v38: s1 = v35.p0
    v12 = v12.copy(p1 = v33)
    val v59: Vector[Double] = v10(0)
    val v52: Vector[Vector[Double]] = v4.p0
    var v91: Vector[Vector[Double]] = v3
    val v29: Double = v59(0)
    val v48: Vector[Vector[Vector[Double]]] = Vector(v14, v3, v33, v26)
    val v79: Double = v59(0)
    v7 = v7.copy(p0 = v52)
    val v98: Vector[Double] = v14(0)
    v7 = v7.copy(p2 = v10)
    var v43: Vector[Vector[Vector[Double]]] = v48
    val v61: Vector[Vector[Double]] = v4.p0
    v36 = v36.copy(p0 = v61)
    v10 = v10.updated(0, v13)
    var v71: Vector[Vector[Vector[Double]]] = v43
    var v72: Vector[Double] = v8
    v43 = v43.updated(3, v91)
    val v90: s2 = s2(v38, v36)
    var v193: Vector[Double] = v59
    val v83: Double = v29 + v79
    v14 = v14.updated(0, v193)
    v193 = v193.updated(0, v83)
    v10 = v10.updated(0, v72)
    val v97: Vector[Vector[Double]] = v43(2)
    val v104: Vector[Vector[Double]] = v71(0)
    v12 = v12.copy(p1 = v10)
    val v148: Vector[Vector[Double]] = v43(3)
    v14 = v14.updated(0, v98)
    v12 = v12.copy(p2 = v97)
    v43 = v43.updated(0, v97)
    v43 = v43.updated(3, v148)
    v36 = v36.copy(p2 = v14)
    v7 = v7.copy(p1 = v104)
    v90
  }
  def f24(v0: s1): s1 = {
    val v3: s1 = f86(v0)
    val v2: s1 = f86(v3)
    val v4: s1 = f86(v3)
    val v1: Vector[s1] = Vector(v4, v3)
    val v7: s0 = v2.p1
    var v15: Vector[s1] = v1
    val v24: s0 = f41(v7)
    val v21: s0 = v4.p0
    val v26: s0 = f41(v21)
    v15 = v15.updated(1, v4)
    val v88: s1 = s1(v26, v21)
    val v54: s0 = f97(v24)
    val v52: s2 = s2(v88, v54)
    val v80: s2 = f102(v52)
    val v85: s2 = f29(v15, v80)
    val v77: s1 = v85.p0
    v77
  }
  @noinline
  def f0(v0: s0, v1: Double): Double = {
    val v6: s1 = s1(v0, v0)
    val v3: s1 = f24(v6)
    val v9: s0 = v3.p1
    val v4: s1 = s1(v9, v9)
    val v11: s0 = v4.p1
    val v16: Vector[Vector[Double]] = v11.p0
    var v33: Double = v1
    val v23: Vector[Double] = v16(2)
    val v24: Double = v23(0)
    val v32: Vector[Double] = v16(2)
    val v22: Double = v32(0)
    var v38: Vector[Double] = v32
    v38 = v38.updated(0, v22)
    var v34: Double = v24
    v38 = v38.updated(0, v33)
    val v99: Double = v32(0)
    v38 = v38.updated(0, v99)
    var v66: Vector[Double] = v38
    v66 = v66.updated(0, v34)
    val v88: Double = v66(0)
    v88
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)), Vector(Vector(4.0)))
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