import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1
  )
  def f55(v0: s1): s1 = {
    val v6: Vector[s0] = v0.p1
    val v1: s0 = v6(2)
    var v4: s0 = v1
    var v3: s0 = v4
    val v2: s0 = v6(2)
    val v7: s0 = v6(0)
    var v9: s1 = v0
    var v8: Vector[s0] = v6
    v8 = v8.updated(1, v3)
    v8 = v6
    v9 = v9.copy(p1 = v8)
    v9 = v9.copy(p1 = v8)
    v8 = v8.updated(1, v7)
    val v11: s0 = v8(0)
    var v15: Vector[s0] = v6
    val v22: Vector[Vector[s0]] = v9.p0
    var v10: s1 = v0
    v8 = v8.updated(2, v2)
    val v27: Vector[Vector[s0]] = v10.p0
    val v19: Vector[s0] = v0.p1
    v9 = v9.copy(p1 = v15)
    var v33: s1 = v0
    v8 = v8.updated(2, v1)
    var v30: Vector[Vector[s0]] = v22
    var v17: Vector[Vector[s0]] = v30
    v10 = v10.copy(p0 = v27)
    v15 = v15.updated(2, v11)
    v9 = v9.copy(p1 = v19)
    val v43: Vector[Vector[s0]] = v10.p0
    val v56: Vector[s0] = v9.p1
    var v54: s1 = v33
    v10 = v10.copy(p0 = v30)
    val v93: Vector[s0] = v54.p1
    v9 = v10
    v10 = v10.copy(p1 = v15)
    var v58: Vector[Vector[s0]] = v22
    var v128: s1 = v33
    var v100: s1 = v128
    val v92: Vector[s0] = v0.p1
    var v95: Vector[s0] = v93
    var v82: s1 = v100
    v8 = v92
    v100 = v100.copy(p0 = v58)
    v58 = v17
    v128 = v128.copy(p1 = v56)
    v95 = v95.updated(1, v2)
    v10 = v10.copy(p1 = v95)
    v9 = v9.copy(p0 = v43)
    var v187: Vector[Vector[s0]] = v30
    v54 = v54.copy(p0 = v187)
    v82
  }
  def f40(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p0
    var v1: s0 = v0
    v1 = v1.copy(p0 = v5)
    var v3: s0 = v0
    var v8: s0 = v3
    v3 = v3.copy(p1 = v5)
    val v4: Vector[Vector[Double]] = v3.p0
    v8 = v8.copy(p0 = v4)
    val v16: Vector[Vector[Double]] = v3.p0
    val v12: Vector[s0] = Vector(v0, v0, v1, v3, v8, v3)
    val v20: Vector[Vector[Double]] = v8.p0
    val v13: Vector[s0] = Vector(v3, v1)
    val v22: Vector[Vector[Double]] = v3.p1
    var v23: Vector[s0] = v13
    val v21: Vector[Vector[Double]] = v3.p0
    v1 = v1.copy(p0 = v16)
    v3 = v3.copy(p1 = v22)
    val v31: Vector[Vector[Double]] = v1.p0
    v23 = v23.updated(1, v8)
    v23 = v23.updated(1, v0)
    var v36: Vector[Vector[Double]] = v31
    v8 = v8.copy(p1 = v22)
    var v33: Vector[s0] = v12
    val v58: s0 = v23(0)
    v8 = v8.copy(p1 = v21)
    v3 = v58
    var v60: s0 = v8
    v1 = v1.copy(p1 = v36)
    var v70: Vector[s0] = v33
    val v83: Vector[Vector[Double]] = v60.p0
    v1 = v1.copy(p0 = v83)
    val v85: s0 = v70(2)
    v3 = v3.copy(p1 = v20)
    v85
  }
  def f25(v0: s1): s1 = {
    val v3: s1 = f55(v0)
    var v8: s1 = v0
    val v10: Vector[s0] = v3.p1
    v8 = v8.copy(p1 = v10)
    v8 = v8.copy(p1 = v10)
    v8 = v8.copy(p1 = v10)
    val v17: s1 = f55(v8)
    v17
  }
  def f2(v0: s0): s0 = {
    val v7: Vector[Vector[Double]] = v0.p1
    val v4: Vector[Vector[Double]] = v0.p1
    val v5: Vector[Double] = v4(1)
    val v14: s0 = f40(v0)
    val v6: s0 = f40(v14)
    var v1: s0 = v0
    val v8: Vector[Vector[Double]] = v0.p1
    val v11: Vector[Vector[Double]] = v0.p0
    val v16: s0 = f40(v1)
    val v15: Vector[Vector[Double]] = v14.p1
    v1 = v14
    var v22: Vector[Vector[Double]] = v7
    val v21: Vector[Vector[Double]] = v14.p1
    v1 = v1.copy(p1 = v8)
    val v45: s0 = f40(v1)
    v22 = v15
    val v25: s0 = f40(v16)
    val v39: Vector[Vector[Double]] = v1.p0
    val v33: Vector[Vector[Double]] = v0.p0
    var v53: Vector[Vector[Double]] = v39
    v53 = v53.updated(2, v5)
    val v42: s0 = f40(v25)
    val v68: s0 = f40(v42)
    var v37: s0 = v68
    val v80: Vector[Double] = v33(0)
    val v51: Vector[Vector[Double]] = v1.p1
    v53 = v53.updated(1, v80)
    v1 = v1.copy(p0 = v33)
    val v49: Vector[Vector[Double]] = v45.p0
    val v81: Vector[Vector[Double]] = v16.p1
    val v230: Vector[Vector[Double]] = v6.p1
    v22 = v22.updated(0, v5)
    v1 = v1.copy(p1 = v15)
    v1 = v1.copy(p0 = v33)
    v1 = v1.copy(p1 = v11)
    v37 = v37.copy(p0 = v22)
    v37 = v37.copy(p1 = v49)
    v1 = v1.copy(p0 = v53)
    v37 = v37.copy(p1 = v22)
    v37 = v37.copy(p0 = v81)
    v1 = v1.copy(p1 = v230)
    v1 = v1.copy(p0 = v51)
    v37 = v37.copy(p1 = v81)
    var v108: Vector[Vector[Double]] = v21
    v37 = v37.copy(p1 = v108)
    val v106: s0 = f40(v37)
    v37 = v37.copy(p0 = v4)
    v37 = v37.copy(p0 = v39)
    v106
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v4: s1 = v0.p0
    val v5: s1 = f25(v4)
    val v12: Vector[s0] = v5.p1
    var v3: Vector[s0] = v12
    val v18: s0 = v3(1)
    val v17: s0 = f2(v18)
    v3 = v3.updated(0, v17)
    val v25: Vector[Vector[Double]] = v17.p0
    val v15: Vector[Vector[Double]] = v18.p1
    val v24: s0 = v12(0)
    val v30: s0 = s0(v25, v15)
    val v29: Vector[Double] = v25(1)
    v3 = v3.updated(2, v24)
    val v77: Vector[Vector[Double]] = v30.p0
    val v99: Vector[Double] = v77(0)
    val v165: Double = v29(0)
    val v196: Double = v99(0)
    val v97: Double = v165 * v1
    var v154: Double = v97
    val v80: Double = v1 + v196
    val v173: Double = v80 / v154
    v173
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}