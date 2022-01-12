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
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  def f38(v0: s1): s1 = {
    val v4: s0 = v0.p1
    val v1: s0 = v0.p0
    val v11: s0 = v0.p1
    val v6: s0 = v0.p0
    val v7: Vector[Vector[Double]] = v1.p0
    var v12: Vector[Vector[Double]] = v7
    val v15: Vector[Double] = v7(0)
    val v10: Vector[Vector[Double]] = v4.p0
    val v3: s0 = v0.p0
    val v8: Vector[Vector[Double]] = v6.p1
    val v17: Vector[Vector[Double]] = v11.p1
    v12 = v12.updated(0, v15)
    v12 = v12.updated(0, v15)
    var v9: Vector[Vector[Double]] = v7
    val v19: Vector[Double] = v8(0)
    val v18: Vector[Double] = v8(1)
    val v26: Vector[Double] = v17(2)
    val v16: s0 = v0.p1
    val v21: Vector[Vector[Double]] = v3.p1
    v12 = v12.updated(0, v19)
    var v40: Vector[Vector[Double]] = v10
    v40 = v9
    v40 = v40.updated(0, v26)
    val v24: Vector[Double] = v7(0)
    v40 = v12
    val v20: Vector[Double] = v21(0)
    v12 = v12.updated(0, v24)
    v40 = v40.updated(0, v15)
    val v38: Vector[Double] = v17(1)
    v9 = v9.updated(0, v18)
    val v33: Vector[Double] = v9(0)
    v9 = v9.updated(0, v20)
    var v34: s0 = v16
    v40 = v40.updated(0, v38)
    val v59: s1 = s1(v4, v34)
    v34 = v34.copy(p1 = v8)
    v9 = v9.updated(0, v33)
    v34 = v34.copy(p0 = v40)
    v59
  }
  def f16(v0: s2): s2 = {
    var v13: s2 = v0
    v13
  }
  def f6(v0: s0): s0 = {
    var v5: s0 = v0
    val v1: s1 = s1(v0, v0)
    val v4: Vector[Vector[Double]] = v5.p0
    var v7: Vector[Vector[Double]] = v4
    val v3: Vector[Double] = v4(0)
    val v12: Vector[Double] = v7(0)
    val v17: s0 = v1.p1
    v7 = v7.updated(0, v3)
    val v6: s1 = f38(v1)
    val v13: s1 = f38(v1)
    val v11: s1 = f38(v13)
    val v19: Vector[Vector[Double]] = v0.p1
    v7 = v7.updated(0, v3)
    val v25: s1 = f38(v11)
    v5 = v5.copy(p0 = v4)
    v5 = v5.copy(p0 = v4)
    val v34: Vector[Double] = v19(2)
    var v27: Vector[Vector[Double]] = v4
    var v33: Vector[Vector[Double]] = v19
    v5 = v5.copy(p0 = v27)
    var v40: Vector[Vector[Double]] = v33
    v33 = v40
    val v44: s0 = v25.p1
    val v22: s0 = s0(v7, v40)
    val v35: Vector[Vector[Double]] = v44.p0
    val v26: Vector[Double] = v7(0)
    v27 = v27.updated(0, v34)
    val v15: Vector[Double] = v40(0)
    v40 = v40.updated(0, v12)
    val v51: Vector[Vector[Double]] = v17.p0
    val v70: Vector[Double] = v40(2)
    v5 = v5.copy(p0 = v51)
    v7 = v7.updated(0, v15)
    v7 = v7.updated(0, v70)
    v5 = v5.copy(p1 = v19)
    val v112: s0 = v6.p1
    var v121: s0 = v22
    v5 = v5.copy(p0 = v35)
    val v83: Vector[Vector[Double]] = v112.p0
    v7 = v7.updated(0, v26)
    v5 = v5.copy(p0 = v83)
    v27 = v83
    v121
  }
  @noinline
  def f0(v0: Vector[s2], v1: Double): Double = {
    val v3: s2 = v0(1)
    val v6: s2 = f16(v3)
    val v19: Vector[s0] = v6.p0
    val v23: s0 = v19(0)
    val v24: s0 = f6(v23)
    val v52: Vector[Vector[Double]] = v24.p0
    var v56: Vector[Vector[Double]] = v52
    val v86: Vector[Double] = v56(0)
    var v96: Vector[Double] = v86
    val v113: Double = v86(0)
    var v210: Double = v113
    v56 = v56.updated(0, v96)
    v210
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), s2(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s2(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))))
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