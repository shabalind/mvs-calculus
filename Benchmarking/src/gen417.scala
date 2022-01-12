import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f29(v0: s0): s0 = {
    val v2: Vector[Vector[Double]] = v0.p0
    var v9: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p1
    v9 = v9.copy(p1 = v7)
    val v3: Vector[Vector[Double]] = v9.p0
    var v4: Vector[Vector[Double]] = v2
    val v5: Vector[Vector[Double]] = v0.p1
    var v6: Vector[Vector[Double]] = v3
    val v8: s0 = s0(v2, v5)
    v9 = v9.copy(p0 = v3)
    val v12: Vector[Double] = v2(0)
    val v11: Vector[Vector[Double]] = v0.p0
    val v22: Vector[Vector[Double]] = v8.p0
    val v13: Vector[Double] = v11(0)
    var v15: Vector[Double] = v13
    val v41: s0 = s0(v2, v7)
    val v30: Vector[Double] = v5(0)
    v9 = v9.copy(p0 = v4)
    v4 = v4.updated(0, v12)
    var v23: Vector[Vector[Double]] = v7
    v6 = v6.updated(1, v15)
    var v32: Vector[Vector[Double]] = v7
    val v33: Vector[Vector[Double]] = v41.p0
    val v36: s0 = s0(v2, v7)
    val v42: Vector[Vector[Double]] = v0.p1
    val v51: Vector[Vector[Double]] = v41.p1
    val v58: Vector[Double] = v32(1)
    var v50: s0 = v9
    v9 = v9.copy(p1 = v5)
    v6 = v6.updated(0, v30)
    v9 = v9.copy(p0 = v11)
    v23 = v23.updated(1, v12)
    val v59: Vector[Vector[Double]] = v36.p1
    v9 = v9.copy(p0 = v6)
    v50 = v50.copy(p0 = v6)
    val v107: Vector[Double] = v22(1)
    val v70: s0 = s0(v22, v32)
    v50 = v50.copy(p0 = v3)
    v9 = v9.copy(p1 = v59)
    v9 = v9.copy(p1 = v42)
    val v119: Vector[Vector[Double]] = v70.p1
    v23 = v23.updated(1, v107)
    v9 = v9.copy(p0 = v33)
    v50 = v50.copy(p1 = v23)
    val v71: Vector[Double] = v119(0)
    v9 = v9.copy(p0 = v33)
    v9 = v9.copy(p1 = v7)
    v9 = v9.copy(p1 = v51)
    v9 = v9.copy(p0 = v33)
    v4 = v4.updated(1, v58)
    v23 = v23.updated(2, v71)
    v9 = v9.copy(p1 = v59)
    v50
  }
  def f16(v0: Double): Double = {
    var v3: Double = v0
    var v1: Double = v0
    var v4: Double = v1
    var v2: Double = v3
    val v7: Vector[Double] = Vector(v2, v0, v1, v3, v3)
    val v9: Double = v7(3)
    var v6: Vector[Double] = v7
    var v8: Double = v2
    var v5: Vector[Double] = v7
    val v15: Double = v5(4)
    val v11: Double = v6(4)
    var v18: Vector[Double] = v5
    v6 = v6.updated(1, v9)
    var v16: Vector[Double] = v18
    val v14: Double = v16(3)
    var v13: Vector[Double] = v6
    val v20: Double = v7(1)
    val v48: Double = v6(1)
    v6 = v6.updated(4, v20)
    val v19: Double = v18(4)
    val v28: Double = v18(0)
    val v33: Double = v13(2)
    var v34: Vector[Double] = v13
    var v29: Double = v15
    var v55: Vector[Double] = v34
    val v38: Vector[Double] = Vector(v0, v14, v11, v33, v4, v19, v14)
    var v43: Vector[Double] = v38
    v6 = v6.updated(1, v8)
    val v56: Double = v55(4)
    v34 = v34.updated(4, v48)
    v55 = v55.updated(4, v29)
    var v47: Vector[Double] = v43
    v47 = v47.updated(2, v56)
    v34 = v34.updated(2, v28)
    val v91: Double = v47(6)
    v5 = v5.updated(1, v28)
    v91
  }
  def f6(v0: s0): s0 = {
    val v5: Vector[Vector[Double]] = v0.p1
    val v4: s0 = f29(v0)
    val v2: s0 = f29(v4)
    val v3: Vector[Vector[Double]] = v2.p1
    val v24: Vector[Vector[Double]] = v4.p1
    var v21: s0 = v4
    val v34: Vector[Vector[Double]] = v21.p0
    val v19: Vector[Vector[Double]] = v2.p0
    val v47: s0 = s0(v19, v24)
    v21 = v21.copy(p1 = v3)
    val v46: Vector[Vector[Double]] = v47.p0
    val v26: s0 = f29(v47)
    v21 = v21.copy(p0 = v46)
    v21 = v21.copy(p1 = v5)
    v21 = v26
    var v40: s0 = v0
    val v32: Vector[Vector[Double]] = v26.p1
    v40 = v40.copy(p1 = v5)
    var v61: s0 = v40
    v61 = v61.copy(p1 = v32)
    v40 = v40.copy(p0 = v34)
    v61
  }
  def f5(v0: Double): Double = {
    val v4: Double = f16(v0)
    val v1: Double = f16(v0)
    val v7: Double = f16(v1)
    val v2: Double = f16(v0)
    val v5: Double = f16(v0)
    var v9: Double = v1
    val v6: Double = f16(v9)
    val v11: Double = v4 - v4
    var v10: Double = v7
    val v8: Double = v1 + v0
    val v14: Double = v9 - v7
    var v16: Double = v5
    var v12: Double = v9
    var v18: Double = v8
    var v21: Double = v5
    val v23: Double = f16(v6)
    val v24: Double = f16(v12)
    val v40: Double = v10 * v21
    val v17: Vector[Double] = Vector(v14, v9, v0)
    v16 = v11
    v18 = v2
    val v63: Double = f16(v18)
    val v47: Vector[Double] = Vector(v1, v63, v16, v40, v23)
    var v46: Vector[Double] = v47
    val v66: Double = v46(1)
    var v39: Vector[Double] = v17
    val v80: Double = v39(2)
    v18 = v24
    var v78: Double = v66
    v16 = v80
    v78
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v3: Vector[s0] = v0(1)
    val v7: s0 = v3(0)
    val v17: s0 = f6(v7)
    val v61: Vector[Vector[Double]] = v17.p1
    val v36: Vector[Double] = v61(2)
    val v43: Double = v36(0)
    val v139: Double = f5(v43)
    v139
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}