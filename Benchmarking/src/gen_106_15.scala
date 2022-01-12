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
  def f14(v0: s1, v1: s0): s1 = {
    var v2: s0 = v1
    val v3: s0 = v0.p0
    val v6: s0 = v0.p0
    var v7: s0 = v3
    var v5: s0 = v6
    val v11: Vector[Vector[Double]] = v5.p2
    v7 = v7.copy(p0 = v11)
    val v12: Vector[Double] = v11(0)
    val v13: s0 = v0.p0
    val v19: s1 = s1(v7, v6)
    var v16: Vector[Vector[Double]] = v11
    val v17: Vector[Vector[Double]] = v3.p1
    val v48: Vector[Vector[Double]] = v13.p2
    v5 = v2
    var v35: Vector[Vector[Double]] = v48
    var v24: Vector[Vector[Double]] = v17
    val v39: Vector[s1] = Vector(v0)
    v5 = v5.copy(p2 = v16)
    val v37: Vector[Vector[Double]] = v7.p0
    val v44: s1 = v39(0)
    var v38: s1 = v19
    val v29: Vector[Double] = v24(2)
    v7 = v7.copy(p2 = v11)
    var v81: Vector[Vector[Double]] = v17
    v81 = v81.updated(1, v29)
    val v23: s0 = v38.p0
    v35 = v35.updated(0, v29)
    val v137: s0 = v44.p1
    val v70: Vector[Vector[Double]] = v23.p1
    v5 = v5.copy(p1 = v70)
    v24 = v24.updated(0, v29)
    v81 = v81.updated(2, v12)
    v5 = v5.copy(p0 = v48)
    val v73: Vector[Double] = v70(1)
    v2 = v2.copy(p2 = v35)
    val v64: Vector[Vector[Double]] = v7.p2
    var v75: Vector[Vector[Double]] = v64
    v2 = v2.copy(p2 = v37)
    var v61: s0 = v23
    v7 = v7.copy(p0 = v75)
    v7 = v7.copy(p1 = v81)
    val v136: Vector[Vector[Double]] = v137.p2
    v75 = v75.updated(0, v73)
    val v128: s0 = v44.p1
    val v96: Vector[Double] = v24(1)
    v75 = v75.updated(0, v96)
    v61 = v61.copy(p2 = v136)
    val v134: s1 = s1(v128, v61)
    v134
  }
  def f13(v0: s1, v1: s0, v2: Vector[s1], v3: s1): s0 = {
    val v4: s0 = v0.p0
    val v12: Vector[Vector[Double]] = v1.p1
    var v5: s0 = v1
    v5 = v4
    v5 = v5.copy(p1 = v12)
    val v9: s0 = v0.p0
    val v18: s1 = f14(v0, v5)
    val v33: s1 = f14(v18, v9)
    v5 = v1
    val v30: Vector[Vector[Double]] = v1.p0
    val v20: s0 = v18.p0
    val v73: s1 = f14(v33, v4)
    val v85: s1 = f14(v73, v20)
    val v140: s1 = f14(v85, v5)
    val v108: s0 = v140.p1
    v5 = v5.copy(p0 = v30)
    v108
  }
  def f6(v0: s0, v1: s0): s0 = {
    val v8: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Vector[Double]] = v1.p2
    var v18: s0 = v0
    v18 = v18.copy(p2 = v6)
    v18 = v1
    var v11: s0 = v18
    val v15: Vector[Vector[Double]] = v1.p1
    var v45: Vector[Vector[Double]] = v15
    var v19: Vector[Vector[Double]] = v8
    val v25: s1 = s1(v11, v1)
    val v29: Vector[Vector[Double]] = v1.p0
    v18 = v18.copy(p1 = v45)
    var v30: s0 = v11
    var v36: s0 = v18
    v36 = v36.copy(p0 = v19)
    val v41: s1 = f14(v25, v30)
    val v24: Vector[Double] = v15(1)
    v19 = v19.updated(0, v24)
    val v33: s1 = f14(v41, v18)
    v11 = v18
    var v86: Vector[Vector[Double]] = v19
    val v47: s1 = f14(v33, v36)
    v18 = v18.copy(p2 = v86)
    v18 = v18.copy(p2 = v29)
    var v58: Vector[Vector[Double]] = v15
    v45 = v58
    v11 = v11.copy(p2 = v29)
    v11 = v11.copy(p2 = v6)
    val v66: s0 = v47.p1
    v19 = v8
    v66
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s1, v2: Double): Double = {
    val v4: Vector[s1] = v0(1)
    val v6: Vector[s1] = v0(0)
    val v14: s0 = v1.p0
    val v12: s1 = v6(0)
    val v24: s1 = f14(v12, v14)
    var v28: s1 = v24
    val v13: s1 = f14(v28, v14)
    val v19: s0 = f6(v14, v14)
    val v23: s1 = f14(v12, v19)
    val v41: s0 = v28.p1
    val v11: s0 = v23.p0
    v28 = v28.copy(p1 = v11)
    v28 = v28.copy(p0 = v14)
    val v63: Vector[Vector[Double]] = v41.p2
    val v54: s0 = f13(v13, v11, v4, v13)
    v28 = v28.copy(p1 = v14)
    v28 = v28.copy(p1 = v54)
    val v170: Vector[Double] = v63(0)
    val v128: Double = v170(0)
    v128
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0))), s0(Vector(Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0))))), Vector(s1(s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))))))
    val v1: s1 = s1(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0))), s0(Vector(Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))
    val v2: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}