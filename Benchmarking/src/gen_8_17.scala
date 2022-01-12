import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  def f66(v0: Vector[s1]): Vector[s1] = {
    var v26: Vector[s1] = v0
    v26
  }
  def f65(v0: Vector[s1]): Vector[s1] = {
    val v1: Vector[s1] = f66(v0)
    var v3: Vector[s1] = v1
    val v7: s1 = v0(0)
    var v4: Vector[s1] = v1
    val v8: s1 = v4(0)
    var v6: s1 = v7
    var v9: s1 = v8
    var v2: Vector[s1] = v4
    val v11: Vector[Vector[s0]] = v6.p1
    val v10: Vector[s1] = f66(v3)
    v9 = v9.copy(p1 = v11)
    var v5: Vector[s1] = v3
    val v22: Vector[s0] = v11(0)
    var v15: Vector[Vector[s0]] = v11
    val v13: s1 = v0(0)
    v4 = v4.updated(0, v7)
    val v21: Vector[s1] = f66(v0)
    val v14: Vector[Vector[s1]] = Vector(v21, v21, v0, v5, v10, v2, v21)
    val v25: Vector[Vector[s0]] = v8.p1
    val v12: Vector[s0] = v11(1)
    val v42: Vector[Vector[s0]] = v7.p1
    val v16: Vector[s1] = f66(v5)
    val v27: s0 = v13.p0
    val v36: s1 = s1(v27, v15)
    var v30: s0 = v27
    val v17: Vector[s1] = v14(4)
    val v24: Vector[s1] = f66(v16)
    v6 = v6.copy(p0 = v30)
    val v51: Vector[s1] = f66(v5)
    v5 = v5.updated(0, v13)
    val v47: Vector[s1] = f66(v5)
    v15 = v15.updated(0, v12)
    val v57: Vector[s1] = f66(v47)
    v2 = v2.updated(0, v6)
    var v28: s1 = v36
    v9 = v9.copy(p1 = v25)
    val v19: s0 = v8.p0
    v28 = v28.copy(p1 = v42)
    val v38: Vector[s1] = f66(v5)
    val v34: Vector[s1] = f66(v5)
    val v35: s0 = v12(0)
    v28 = v28.copy(p0 = v27)
    val v32: s0 = v22(0)
    var v33: s1 = v28
    val v72: Vector[Vector[Double]] = v19.p1
    v6 = v6.copy(p1 = v11)
    val v43: s0 = v13.p0
    val v64: Vector[Vector[Double]] = v27.p1
    var v63: Vector[Vector[s0]] = v42
    v6 = v6.copy(p0 = v19)
    v5 = v5.updated(0, v13)
    v28 = v28.copy(p0 = v35)
    v30 = v30.copy(p1 = v72)
    val v23: Vector[s1] = f66(v24)
    v6 = v6.copy(p0 = v35)
    val v95: s1 = v17(0)
    val v61: s1 = v34(0)
    val v53: Vector[Vector[Vector[Double]]] = Vector(v64, v72, v72, v64)
    val v84: Vector[Vector[Double]] = v53(0)
    val v103: Vector[Vector[s1]] = Vector(v57, v34, v23, v51, v34)
    val v71: Vector[Vector[s0]] = v36.p1
    v5 = v5.updated(0, v33)
    v2 = v2.updated(0, v13)
    v4 = v4.updated(0, v95)
    v33 = v33.copy(p0 = v32)
    var v169: Vector[Vector[s1]] = v103
    v6 = v6.copy(p0 = v43)
    val v48: Vector[s0] = v71(0)
    v33 = v33.copy(p1 = v63)
    var v89: s0 = v43
    v6 = v6.copy(p0 = v89)
    v33 = v33.copy(p1 = v11)
    var v98: Vector[Vector[s1]] = v169
    var v70: Vector[Vector[s1]] = v169
    v5 = v5.updated(0, v9)
    v15 = v15.updated(0, v48)
    v169 = v70
    val v129: Vector[s1] = f66(v17)
    val v214: Vector[s1] = v98(2)
    v6 = v6.copy(p1 = v63)
    v28 = v28.copy(p1 = v15)
    v169 = v169.updated(3, v38)
    val v160: Vector[s1] = f66(v214)
    v30 = v30.copy(p1 = v84)
    v4 = v4.updated(0, v61)
    v98 = v98.updated(2, v129)
    v33 = v6
    v160
  }
  def f32(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Vector[Double]] = v0.p0
    val v9: Vector[Vector[Double]] = v0.p1
    val v13: Vector[Vector[Vector[Double]]] = Vector(v4, v9, v9, v4, v4, v9, v4)
    var v16: Vector[Vector[Vector[Double]]] = v13
    val v19: Vector[Vector[Double]] = v16(6)
    val v35: s0 = s0(v1, v19)
    v35
  }
  def f20(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    val v1: Vector[Vector[Double]] = v0.p0
    var v3: s0 = v0
    val v11: Vector[Vector[Double]] = v3.p0
    var v8: s0 = v3
    val v18: s0 = f32(v8)
    v3 = v8
    val v14: Vector[Vector[Double]] = v0.p0
    val v13: s0 = f32(v8)
    var v12: Vector[Vector[Double]] = v4
    v3 = v3.copy(p0 = v4)
    val v19: Vector[Vector[Double]] = v18.p0
    val v25: s0 = f32(v18)
    var v15: s0 = v18
    val v22: s0 = f32(v25)
    val v37: Vector[Vector[Double]] = v13.p0
    val v24: s0 = f32(v15)
    v3 = v3.copy(p0 = v19)
    var v33: s0 = v24
    v8 = v8.copy(p0 = v1)
    val v27: Vector[Vector[Double]] = v22.p1
    val v42: s0 = f32(v24)
    v8 = v8.copy(p1 = v27)
    val v45: Vector[Vector[Double]] = v24.p1
    v33 = v33.copy(p0 = v37)
    v33 = v33.copy(p0 = v12)
    val v63: Vector[Vector[Double]] = v24.p1
    val v44: Vector[Vector[Double]] = v42.p1
    v3 = v3.copy(p0 = v37)
    v3 = v3.copy(p0 = v37)
    val v77: Vector[Double] = v44(1)
    v15 = v15.copy(p0 = v1)
    v12 = v12.updated(2, v77)
    val v54: Vector[Vector[Double]] = v3.p1
    v8 = v8.copy(p0 = v14)
    val v84: Vector[Double] = v54(1)
    val v107: s0 = f32(v33)
    val v123: s0 = f32(v107)
    v15 = v15.copy(p1 = v45)
    v12 = v12.updated(1, v84)
    v3 = v3.copy(p1 = v63)
    v15 = v15.copy(p0 = v11)
    v33 = v15
    v123
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v7: Vector[s1] = v0.p0
    val v11: Vector[s1] = f65(v7)
    val v30: s1 = v11(0)
    val v19: s0 = v30.p0
    val v10: s0 = v30.p0
    val v9: s0 = v30.p0
    val v15: Vector[Vector[Double]] = v10.p1
    val v13: s0 = f32(v19)
    val v26: Vector[Vector[Double]] = v9.p1
    val v24: Vector[Double] = v26(0)
    val v85: s0 = f32(v13)
    var v70: s0 = v85
    val v60: s0 = f20(v9)
    var v114: s0 = v70
    v70 = v60
    val v98: Vector[Vector[Double]] = v114.p1
    val v135: Vector[Double] = v98(0)
    val v117: Vector[Vector[Double]] = v114.p0
    var v106: Vector[Vector[Double]] = v117
    v106 = v106.updated(0, v24)
    val v163: Vector[Double] = v106(2)
    v70 = v70.copy(p1 = v15)
    val v190: Double = v163(0)
    v106 = v106.updated(0, v135)
    v190
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))))), s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), Vector(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))))
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