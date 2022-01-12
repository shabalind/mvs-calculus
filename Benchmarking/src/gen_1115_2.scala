import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: Vector[s0]
  )
  def f40(v0: s0): s0 = {
    var v1: s0 = v0
    var v3: s0 = v0
    val v8: Vector[s0] = Vector(v3, v3)
    val v6: Vector[Double] = v1.p0
    val v4: Double = v6(0)
    var v5: Vector[s0] = v8
    v5 = v5.updated(0, v1)
    val v7: s0 = v8(0)
    v5 = v5.updated(1, v1)
    v3 = v3.copy(p0 = v6)
    v1 = v1.copy(p0 = v6)
    var v2: Double = v4
    val v9: Vector[Vector[Double]] = v3.p1
    var v15: Vector[Double] = v6
    v3 = v3.copy(p1 = v9)
    v15 = v15.updated(0, v2)
    val v12: Vector[Vector[Double]] = v1.p1
    val v13: Double = v15(1)
    val v14: Vector[Double] = v0.p0
    val v10: Vector[Double] = v3.p0
    val v17: Vector[Double] = v9(0)
    val v22: Double = v17(0)
    v5 = v5.updated(0, v3)
    val v35: Vector[Double] = v1.p0
    v1 = v1.copy(p1 = v12)
    v3 = v3.copy(p0 = v15)
    v1 = v1.copy(p0 = v10)
    v1 = v1.copy(p1 = v12)
    v15 = v15.updated(0, v22)
    v3 = v3.copy(p0 = v35)
    v15 = v15.updated(0, v13)
    val v25: Vector[Vector[Double]] = v3.p1
    v1 = v1.copy(p0 = v15)
    val v33: s0 = v5(1)
    v3 = v3.copy(p0 = v14)
    val v26: Vector[Vector[Double]] = v0.p1
    var v36: Vector[Vector[Double]] = v25
    val v30: Vector[Double] = v3.p0
    var v42: Vector[Vector[Double]] = v26
    v3 = v3.copy(p0 = v14)
    v3 = v3.copy(p1 = v9)
    v5 = v5.updated(1, v3)
    v1 = v1.copy(p1 = v12)
    v3 = v3.copy(p1 = v36)
    v5 = v5.updated(1, v7)
    val v43: Vector[Double] = v25(1)
    v36 = v36.updated(1, v43)
    v1 = v1.copy(p1 = v42)
    v1 = v1.copy(p0 = v30)
    v3 = v3.copy(p0 = v10)
    v5 = v5.updated(1, v7)
    v33
  }
  def f36(v0: s0): s0 = {
    val v4: Vector[s0] = Vector(v0, v0)
    val v3: Vector[Vector[Double]] = v0.p1
    val v7: s0 = f40(v0)
    val v9: Vector[Double] = v3(2)
    val v8: s0 = f40(v7)
    val v5: s0 = f40(v0)
    var v12: Vector[Vector[Double]] = v3
    var v18: Vector[Vector[Double]] = v12
    var v10: Vector[s0] = v4
    val v14: Vector[Double] = v8.p0
    val v17: s0 = s0(v14, v18)
    val v28: s0 = v10(1)
    val v15: s0 = f40(v28)
    val v23: s0 = f40(v15)
    var v22: Vector[Double] = v9
    val v36: Vector[Double] = v17.p0
    val v37: Double = v36(0)
    v22 = v22.updated(0, v37)
    var v66: Vector[Double] = v9
    val v40: s0 = f40(v17)
    val v48: Vector[Vector[Double]] = v23.p1
    v18 = v3
    val v67: s0 = f40(v5)
    v66 = v22
    val v89: Vector[Double] = v48(2)
    val v86: Double = v66(0)
    v22 = v22.updated(0, v86)
    var v306: s0 = v40
    v12 = v12.updated(1, v66)
    v12 = v12.updated(0, v89)
    v10 = v10.updated(0, v67)
    v306
  }
  def f35(v0: s0): s0 = {
    var v8: s0 = v0
    val v7: Vector[Double] = v0.p0
    val v1: s0 = f36(v8)
    val v4: Vector[Double] = v1.p0
    v8 = v0
    val v2: Double = v4(0)
    val v3: Vector[Vector[Double]] = v1.p1
    val v6: s0 = f36(v1)
    var v11: Double = v2
    var v9: Vector[Vector[Double]] = v3
    val v5: Vector[Double] = v9(0)
    val v12: s0 = f40(v6)
    val v16: Vector[Vector[Double]] = v12.p1
    val v10: Vector[Vector[Double]] = v12.p1
    v9 = v9.updated(2, v5)
    v8 = v8.copy(p1 = v10)
    var v18: Vector[Double] = v7
    v18 = v18.updated(1, v11)
    val v26: s0 = f36(v12)
    val v32: Vector[Vector[Double]] = v26.p1
    val v40: Double = v7(0)
    var v34: s0 = v0
    val v36: s0 = f40(v6)
    v8 = v8.copy(p1 = v32)
    v8 = v8.copy(p1 = v10)
    v34 = v34.copy(p1 = v3)
    val v51: Vector[Double] = v34.p0
    val v45: Vector[Double] = v0.p0
    v34 = v34.copy(p0 = v18)
    val v73: Vector[Vector[Double]] = v36.p1
    var v67: Vector[Vector[Double]] = v32
    val v60: s0 = s0(v45, v67)
    val v78: s0 = f36(v6)
    val v49: Vector[Double] = v26.p0
    val v58: Vector[Double] = v36.p0
    var v130: Vector[Vector[Double]] = v67
    val v115: Vector[Vector[Double]] = v26.p1
    v8 = v8.copy(p0 = v58)
    val v120: s0 = f40(v60)
    val v107: Vector[Double] = v73(1)
    var v85: s0 = v78
    val v259: Double = v11 / v40
    v34 = v34.copy(p1 = v130)
    v34 = v34.copy(p0 = v49)
    var v122: Vector[Double] = v107
    v11 = v259
    v85 = v85.copy(p0 = v45)
    v34 = v34.copy(p1 = v115)
    val v63: Vector[Double] = v120.p0
    val v198: Vector[Double] = v16(2)
    v85 = v85.copy(p0 = v51)
    var v125: Vector[Double] = v63
    v85 = v85.copy(p1 = v9)
    v8 = v8.copy(p0 = v125)
    v9 = v9.updated(2, v122)
    v67 = v67.updated(1, v198)
    v85
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v2: Vector[s0] = v0.p0
    val v5: s0 = v2(0)
    val v8: s0 = f35(v5)
    val v11: Vector[Double] = v8.p0
    val v12: s0 = f40(v5)
    val v7: Vector[Double] = Vector(v1, v1)
    val v14: Vector[Double] = v12.p0
    val v10: Vector[s0] = v0.p2
    var v36: Vector[Double] = v11
    v36 = v7
    val v18: s0 = v10(0)
    val v17: Double = v36(1)
    v36 = v36.updated(1, v17)
    val v26: Vector[Double] = v18.p0
    val v41: Double = v26(0)
    v36 = v36.updated(1, v41)
    val v38: Double = v17 - v17
    val v70: Double = v38 + v1
    v36 = v36.updated(1, v41)
    v36 = v14
    v70
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(5.0, 6.0), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(10.0, 11.0), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(15.0, 16.0), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(s0(Vector(25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}