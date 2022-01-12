import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  def f50(v0: s0): s0 = {
    v0
  }
  def f45(v0: s0, v1: s0): s0 = {
    val v7: s0 = f50(v1)
    var v8: s0 = v0
    val v3: Vector[Vector[Double]] = v7.p0
    val v6: Vector[Vector[Double]] = v1.p0
    v8 = v8.copy(p0 = v6)
    v8 = v8.copy(p0 = v6)
    v8 = v0
    val v5: Vector[Double] = v6(1)
    val v2: Vector[Vector[Double]] = v8.p0
    var v10: Vector[Vector[Double]] = v2
    v8 = v8.copy(p0 = v3)
    v8 = v8.copy(p0 = v10)
    v8 = v8.copy(p0 = v6)
    val v20: s0 = f50(v0)
    val v35: Double = v5(0)
    val v23: s0 = f50(v20)
    v8 = v8.copy(p0 = v3)
    var v25: s0 = v23
    v25 = v25.copy(p1 = v35)
    v25 = v25.copy(p0 = v2)
    val v38: s0 = f50(v25)
    v38
  }
  def f44(v0: s0): s0 = {
    var v4: s0 = v0
    val v3: Vector[Vector[Double]] = v4.p0
    val v2: Double = v0.p1
    val v8: s0 = f45(v0, v0)
    val v5: s0 = f50(v4)
    val v1: Vector[s0] = Vector(v0)
    var v14: s0 = v8
    v4 = v4.copy(p1 = v2)
    val v13: Vector[Vector[Double]] = v5.p0
    val v16: Double = v4.p1
    val v15: s0 = v1(0)
    val v28: Vector[Double] = v13(1)
    var v20: Vector[Double] = v28
    v4 = v15
    val v40: Double = v14.p1
    var v65: Vector[Vector[Double]] = v3
    v65 = v65.updated(1, v20)
    var v71: Double = v40
    val v70: s0 = s0(v65, v40)
    v4 = v4.copy(p1 = v71)
    v14 = v14.copy(p1 = v40)
    v65 = v65.updated(1, v28)
    v4 = v4.copy(p1 = v16)
    v65 = v65.updated(1, v20)
    val v93: s0 = f45(v70, v5)
    v93
  }
  def f42(v0: s0): s0 = {
    val v5: Double = v0.p1
    val v2: Double = v5 + v5
    val v4: Double = v0.p1
    var v1: Double = v4
    var v8: Double = v5
    val v9: Vector[Vector[Double]] = v0.p0
    val v7: s0 = f44(v0)
    val v10: s0 = f50(v7)
    var v17: s0 = v0
    v17 = v17.copy(p1 = v2)
    val v20: s0 = f45(v10, v17)
    val v32: s0 = f45(v17, v20)
    v1 = v8
    val v26: s0 = f45(v32, v10)
    v17 = v17.copy(p0 = v9)
    val v87: s0 = f45(v20, v26)
    v17 = v17.copy(p1 = v1)
    v87
  }
  def f41(v0: s0): s0 = {
    var v3: s0 = v0
    val v9: s0 = f45(v0, v0)
    var v6: s0 = v3
    var v5: s0 = v6
    var v8: s0 = v9
    var v7: s0 = v8
    var v4: s0 = v0
    val v2: s0 = f42(v6)
    var v10: s0 = v7
    val v11: Vector[Vector[Double]] = v3.p0
    val v25: Vector[Double] = v11(2)
    val v1: Vector[Double] = v11(1)
    val v13: Vector[Vector[Double]] = v0.p0
    var v12: Vector[Vector[Double]] = v13
    var v16: s0 = v3
    v4 = v4.copy(p0 = v11)
    val v18: s0 = f42(v4)
    val v22: Vector[Double] = v12(1)
    var v35: Vector[Double] = v25
    val v23: Double = v25(0)
    var v14: s0 = v16
    val v24: Double = v18.p1
    val v26: Double = v9.p1
    var v15: Double = v23
    v3 = v2
    var v43: Vector[Double] = v35
    v12 = v12.updated(2, v43)
    v43 = v43.updated(0, v24)
    v14 = v14.copy(p0 = v11)
    val v32: s0 = f45(v0, v2)
    val v34: s0 = f50(v10)
    var v58: Vector[Double] = v22
    val v72: s0 = f44(v8)
    val v28: Double = v1(0)
    val v47: s0 = f42(v72)
    var v46: Double = v28
    val v68: Double = v34.p1
    v43 = v35
    val v39: Double = v5.p1
    v4 = v4.copy(p1 = v46)
    v43 = v43.updated(0, v26)
    val v49: Double = v43(0)
    v35 = v35.updated(0, v49)
    v58 = v58.updated(0, v15)
    v58 = v58.updated(0, v46)
    val v57: s0 = f45(v5, v4)
    v16 = v32
    v12 = v12.updated(2, v58)
    v4 = v4.copy(p1 = v68)
    val v228: Vector[Double] = v11(0)
    var v104: Vector[Double] = v25
    var v82: Vector[Vector[Double]] = v13
    v12 = v12.updated(2, v22)
    val v38: s0 = f45(v14, v57)
    v82 = v82.updated(1, v104)
    v58 = v228
    val v157: Vector[Vector[Double]] = v47.p0
    v3 = v3.copy(p1 = v23)
    v7 = v7.copy(p0 = v157)
    v35 = v35.updated(0, v68)
    v43 = v43.updated(0, v39)
    v16 = v16.copy(p0 = v82)
    v5 = v5.copy(p0 = v157)
    var v169: Vector[Double] = v58
    val v149: Double = v0.p1
    v4 = v4.copy(p1 = v149)
    v82 = v82.updated(1, v169)
    v58 = v58.updated(0, v46)
    v82 = v82.updated(2, v43)
    v38
  }
  def f40(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v7: s0 = v0
    val v4: Vector[Double] = v5(2)
    val v9: Double = v4(0)
    val v6: s0 = f45(v7, v0)
    v7 = v7.copy(p0 = v5)
    val v8: s0 = f41(v6)
    val v19: Vector[Vector[Double]] = v8.p0
    val v18: Double = v4(0)
    v7 = v7.copy(p1 = v18)
    val v13: Vector[Vector[Double]] = v6.p0
    v7 = v7.copy(p1 = v9)
    val v37: s0 = f45(v8, v8)
    v7 = v7.copy(p0 = v19)
    v7 = v7.copy(p0 = v13)
    val v29: s0 = f42(v6)
    var v48: s0 = v29
    val v53: s0 = f45(v37, v48)
    v53
  }
  @noinline
  def f0(v0: s0, v1: Vector[s0], v2: Double): Double = {
    val v6: s0 = f40(v0)
    val v19: Vector[Vector[Double]] = v6.p0
    val v17: Vector[Double] = v19(0)
    val v21: Double = v17(0)
    v21
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), 3.0)
    val v1: Vector[s0] = Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), 7.0))
    val v2: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}