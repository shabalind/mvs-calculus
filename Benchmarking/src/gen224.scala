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
  def f41(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Double] = v5(0)
    val v9: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v0.p0
    val v12: Vector[Double] = v5(0)
    val v16: Vector[Vector[Double]] = v0.p0
    val v10: Vector[Double] = v1(0)
    val v13: Vector[Vector[Double]] = v0.p1
    var v17: Vector[Vector[Double]] = v1
    val v21: Vector[Vector[Double]] = v0.p0
    var v15: s0 = v0
    val v32: Vector[Vector[Double]] = v15.p1
    v15 = v15.copy(p0 = v5)
    v15 = v15.copy(p1 = v13)
    v17 = v17.updated(0, v12)
    v15 = v15.copy(p1 = v32)
    val v23: Vector[Vector[Double]] = v0.p0
    v17 = v17.updated(0, v10)
    val v45: Vector[Vector[Double]] = v0.p1
    val v30: Vector[Double] = v45(0)
    var v28: Vector[Vector[Double]] = v13
    v15 = v15.copy(p0 = v21)
    v17 = v17.updated(0, v30)
    v15 = v15.copy(p0 = v21)
    v15 = v15.copy(p0 = v17)
    val v38: s1 = s1(v15, v15)
    val v84: s0 = v38.p0
    var v68: s0 = v0
    val v47: Vector[Double] = v5(0)
    var v76: s0 = v15
    v28 = v28.updated(0, v47)
    v76 = v76.copy(p0 = v17)
    v17 = v17.updated(0, v30)
    v17 = v17.updated(0, v7)
    val v67: Vector[Double] = v23(0)
    val v35: Vector[Double] = v13(0)
    v15 = v15.copy(p0 = v16)
    val v46: s1 = s1(v68, v76)
    v15 = v76
    val v112: s0 = v46.p1
    v28 = v28.updated(0, v67)
    v76 = v76.copy(p1 = v9)
    v68 = v68.copy(p0 = v5)
    var v78: s1 = v38
    v76 = v76.copy(p1 = v28)
    v76 = v112
    v17 = v17.updated(0, v35)
    v78 = v78.copy(p1 = v84)
    val v136: s0 = v78.p0
    v136
  }
  def f35(v0: s0): s0 = {
    val v3: Vector[s0] = Vector(v0, v0, v0)
    val v5: s0 = v3(0)
    val v8: s1 = s1(v5, v5)
    val v11: s0 = v8.p0
    val v28: s0 = f41(v11)
    v28
  }
  def f27(v0: s1, v1: s1): s1 = {
    var v3: s1 = v1
    v3
  }
  def f12(v0: Vector[s1]): Vector[s1] = {
    val v4: s1 = v0(2)
    val v7: s0 = v4.p0
    val v3: s0 = f41(v7)
    val v2: s1 = v0(1)
    var v6: s1 = v2
    var v11: s1 = v4
    var v5: Vector[s1] = v0
    val v9: s0 = f41(v3)
    val v18: s0 = v6.p1
    val v1: s1 = v5(2)
    v11 = v11.copy(p0 = v9)
    v5 = v5.updated(1, v2)
    val v22: s0 = v4.p1
    v5 = v5.updated(0, v6)
    val v14: s1 = f27(v4, v6)
    var v29: s0 = v3
    v5 = v5.updated(1, v1)
    val v23: s1 = s1(v7, v22)
    val v25: s1 = f27(v2, v23)
    v5 = v5.updated(0, v25)
    var v30: s1 = v2
    v5 = v5.updated(0, v14)
    v11 = v11.copy(p0 = v9)
    v5 = v5.updated(2, v1)
    v30 = v30.copy(p0 = v29)
    val v77: s0 = v11.p0
    v5 = v5.updated(2, v30)
    var v41: Vector[s1] = v0
    val v73: s1 = v5(2)
    v6 = v6.copy(p0 = v18)
    v41 = v41.updated(1, v6)
    v6 = v6.copy(p0 = v77)
    val v64: Vector[Vector[s1]] = Vector(v5, v41, v0, v5, v0, v0)
    val v72: s1 = v0(0)
    v6 = v6.copy(p1 = v22)
    v5 = v5.updated(2, v73)
    v41 = v41.updated(0, v72)
    v41 = v41.updated(2, v25)
    val v85: Vector[s1] = v64(1)
    v85
  }
  def f10(v0: s0): s0 = {
    var v7: s0 = v0
    var v8: s0 = v7
    val v4: s0 = f35(v8)
    val v3: s0 = f35(v8)
    var v5: s0 = v7
    val v2: Vector[Vector[Double]] = v0.p1
    val v13: Vector[Vector[Vector[Double]]] = Vector(v2, v2, v2, v2)
    val v1: Vector[Vector[Double]] = v7.p1
    v8 = v8.copy(p1 = v1)
    var v9: Vector[Vector[Vector[Double]]] = v13
    val v21: s0 = f41(v5)
    v7 = v7.copy(p1 = v2)
    val v20: Vector[Vector[Double]] = v7.p1
    val v17: Vector[Vector[Double]] = v21.p0
    v9 = v9.updated(2, v1)
    val v23: Vector[Vector[Double]] = v7.p0
    val v25: Vector[Vector[Double]] = v7.p0
    v9 = v9.updated(0, v2)
    val v58: Vector[Vector[Double]] = v4.p1
    var v28: Vector[Vector[Vector[Double]]] = v9
    v7 = v21
    v28 = v28.updated(3, v2)
    v28 = v28.updated(1, v20)
    val v19: Vector[Vector[Double]] = v28(1)
    val v37: s0 = f41(v3)
    val v27: s0 = f35(v21)
    v28 = v28.updated(0, v2)
    v8 = v3
    val v29: Vector[Vector[Double]] = v37.p0
    var v42: s0 = v27
    v8 = v8.copy(p1 = v19)
    v28 = v28.updated(3, v19)
    val v84: s0 = f35(v42)
    v8 = v8.copy(p0 = v29)
    v9 = v9.updated(3, v58)
    val v39: Vector[Vector[Double]] = v84.p0
    val v81: s0 = f35(v37)
    v5 = v4
    val v69: Vector[Vector[Double]] = v3.p0
    v8 = v8.copy(p0 = v29)
    v28 = v28.updated(0, v19)
    val v66: Vector[Vector[Double]] = v81.p1
    val v82: Vector[Vector[Vector[Double]]] = Vector(v39, v25, v69, v23, v17)
    val v77: Vector[Vector[Double]] = v82(1)
    val v93: s0 = s0(v77, v66)
    v93
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v5: Vector[s1] = f12(v0)
    val v6: Vector[s1] = f12(v0)
    val v3: s1 = v0(0)
    val v7: s1 = v0(1)
    var v4: s1 = v7
    v4 = v7
    val v8: s1 = v0(0)
    var v12: Vector[s1] = v5
    v12 = v12.updated(1, v7)
    val v19: s1 = v0(1)
    val v11: s0 = v8.p0
    val v22: s0 = v4.p1
    val v13: s0 = f35(v22)
    val v17: s1 = v12(2)
    var v43: s0 = v13
    v4 = v4.copy(p1 = v11)
    val v31: s0 = f10(v22)
    val v55: Vector[Vector[Double]] = v43.p0
    v4 = v4.copy(p0 = v31)
    val v54: s0 = f41(v22)
    val v28: Vector[Vector[Double]] = v43.p1
    var v51: Vector[Vector[Double]] = v28
    val v91: Vector[Double] = v55(0)
    val v47: s0 = v17.p0
    var v96: Vector[Double] = v91
    val v143: s1 = v6(1)
    v43 = v43.copy(p1 = v51)
    v4 = v4.copy(p0 = v13)
    val v66: s1 = f27(v143, v19)
    val v140: Vector[Vector[Double]] = v54.p0
    val v132: Vector[Vector[Double]] = v47.p1
    val v120: Vector[Double] = v140(0)
    val v112: Vector[Double] = v140(0)
    v51 = v51.updated(1, v112)
    val v173: s0 = v66.p0
    v51 = v51.updated(0, v120)
    val v105: Double = v96(0)
    v4 = v4.copy(p1 = v173)
    v12 = v12.updated(2, v3)
    v4 = v4.copy(p0 = v54)
    v43 = v43.copy(p1 = v132)
    val v165: Vector[Vector[Double]] = v173.p0
    v43 = v43.copy(p0 = v165)
    v4 = v4.copy(p1 = v173)
    v105
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s1(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))))
    val v1: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}