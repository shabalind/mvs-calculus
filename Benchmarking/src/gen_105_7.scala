import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f45(v0: s0): s0 = {
    var v4: s0 = v0
    var v6: s0 = v4
    var v2: s0 = v0
    var v1: s0 = v2
    val v8: Vector[Vector[Double]] = v1.p0
    val v3: Vector[Vector[Double]] = v6.p1
    val v7: Vector[Vector[Double]] = v6.p1
    v4 = v4.copy(p1 = v7)
    var v13: s0 = v6
    v4 = v1
    var v17: Vector[Vector[Double]] = v8
    v13 = v13.copy(p0 = v8)
    v4 = v13
    var v32: Vector[Vector[Double]] = v8
    v1 = v1.copy(p0 = v32)
    v2 = v2.copy(p1 = v3)
    v2 = v2.copy(p0 = v32)
    v2 = v2.copy(p0 = v17)
    v1
  }
  def f43(v0: s0): s0 = {
    var v7: s0 = v0
    val v8: Vector[Vector[Double]] = v7.p1
    val v6: s0 = f45(v0)
    val v12: s0 = f45(v7)
    val v13: s0 = f45(v6)
    val v14: Vector[Vector[Vector[Double]]] = Vector(v8, v8, v8)
    val v31: Vector[Vector[Double]] = v12.p0
    val v16: Vector[Vector[Double]] = v12.p1
    val v23: Vector[Vector[Vector[Double]]] = Vector(v31)
    val v27: Vector[Vector[Double]] = v23(0)
    var v25: Vector[Vector[Vector[Double]]] = v23
    var v33: Vector[Vector[Double]] = v16
    val v29: Vector[Vector[Double]] = v14(2)
    val v30: s0 = f45(v12)
    v7 = v13
    val v47: s0 = f45(v30)
    v7 = v7.copy(p1 = v29)
    v25 = v23
    var v70: s0 = v47
    v70 = v70.copy(p1 = v33)
    val v86: Vector[Vector[Double]] = v25(0)
    v7 = v7.copy(p0 = v27)
    v7 = v7.copy(p0 = v86)
    v70
  }
  def f21(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v9: Vector[Vector[Double]] = v0.p0
    val v1: s0 = f45(v0)
    val v8: Vector[Vector[Double]] = v1.p1
    val v16: Vector[Double] = v8(2)
    val v11: Vector[Vector[Vector[Double]]] = Vector(v6, v8, v8, v8, v8, v6, v6)
    var v42: Vector[Vector[Double]] = v9
    v42 = v42.updated(0, v16)
    var v63: Vector[Vector[Vector[Double]]] = v11
    val v72: Vector[Vector[Double]] = v63(5)
    v63 = v63.updated(2, v6)
    val v57: s0 = s0(v42, v72)
    v57
  }
  def f5(v0: s0): s0 = {
    val v5: s0 = f21(v0)
    val v7: s0 = f45(v5)
    var v4: s0 = v0
    val v1: s0 = f43(v7)
    var v11: s0 = v5
    var v6: s0 = v11
    val v8: Vector[Vector[Double]] = v7.p0
    v6 = v6.copy(p0 = v8)
    var v13: s0 = v5
    val v10: Vector[Vector[Double]] = v6.p1
    val v15: Vector[Vector[Double]] = v5.p0
    v13 = v13.copy(p1 = v10)
    val v9: s0 = f21(v6)
    val v14: Vector[Double] = v8(1)
    val v34: s0 = f21(v0)
    val v17: Vector[Vector[Double]] = v1.p1
    val v16: Vector[Double] = v17(2)
    var v24: Vector[Vector[Double]] = v17
    val v28: s0 = f45(v9)
    val v30: Vector[Double] = v15(0)
    var v21: Vector[Vector[Double]] = v15
    v21 = v21.updated(0, v16)
    v4 = v0
    var v19: Vector[Vector[Double]] = v8
    val v42: s0 = s0(v21, v10)
    v13 = v13.copy(p1 = v24)
    v4 = v4.copy(p1 = v17)
    val v31: Vector[Vector[Double]] = v5.p1
    val v43: s0 = f43(v28)
    v6 = v43
    var v41: Vector[Vector[Double]] = v17
    val v57: s0 = f43(v34)
    v4 = v4.copy(p1 = v41)
    v6 = v6.copy(p1 = v24)
    val v61: s0 = f43(v57)
    v21 = v21.updated(0, v30)
    val v35: s0 = f43(v13)
    v6 = v6.copy(p0 = v19)
    val v80: Vector[s0] = Vector(v61)
    v24 = v24.updated(0, v30)
    val v53: s0 = f21(v4)
    var v50: Vector[s0] = v80
    val v32: s0 = f45(v35)
    val v70: Vector[Vector[Double]] = v1.p1
    val v121: Vector[Vector[Double]] = v42.p1
    val v131: Vector[Vector[Double]] = v61.p0
    var v58: s0 = v11
    v24 = v24.updated(2, v14)
    v11 = v11.copy(p1 = v70)
    val v47: s0 = f21(v53)
    val v44: Vector[Double] = v10(1)
    v13 = v7
    v4 = v4.copy(p0 = v19)
    val v339: s0 = v50(0)
    v13 = v13.copy(p0 = v19)
    val v193: Vector[Vector[Double]] = v53.p0
    v58 = v58.copy(p1 = v121)
    v6 = v6.copy(p1 = v31)
    var v139: Vector[Vector[Double]] = v41
    val v126: s0 = f43(v339)
    val v101: s0 = f43(v126)
    val v66: Vector[Vector[Double]] = v35.p0
    v6 = v6.copy(p0 = v66)
    val v163: Vector[Vector[Double]] = v32.p0
    val v177: s0 = f45(v58)
    val v114: s0 = f43(v101)
    v13 = v13.copy(p1 = v139)
    val v115: Vector[s0] = Vector(v114, v47, v101, v1, v177)
    v13 = v13.copy(p0 = v193)
    v58 = v58.copy(p1 = v139)
    val v100: s0 = v115(1)
    v4 = v4.copy(p0 = v163)
    v11 = v11.copy(p0 = v131)
    v139 = v139.updated(0, v44)
    v6 = v6.copy(p0 = v19)
    v100
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v3: Vector[s0] = v0.p0
    val v4: s0 = v3(1)
    val v11: s0 = f21(v4)
    val v12: s0 = f5(v11)
    var v10: s0 = v12
    val v8: Vector[Vector[Double]] = v10.p1
    var v36: Vector[Vector[Double]] = v8
    val v19: Vector[Double] = v36(0)
    v36 = v36.updated(0, v19)
    val v25: Vector[Vector[Double]] = v12.p0
    v10 = v10.copy(p0 = v25)
    val v57: Double = v19(0)
    var v112: Double = v57
    v112
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))
    val v1: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}