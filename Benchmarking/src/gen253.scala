import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f11(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v7: Vector[s0] = Vector(v0, v0, v0, v0, v0)
    val v2: s0 = v7(3)
    var v11: Vector[s0] = v7
    v11 = v11.updated(2, v0)
    val v1: Vector[Vector[Double]] = v2.p0
    val v13: Vector[Vector[Double]] = v0.p0
    var v12: s0 = v2
    var v21: Vector[s0] = v11
    val v17: Vector[Vector[Double]] = v12.p1
    v21 = v21.updated(0, v12)
    val v9: Vector[Vector[Double]] = v0.p1
    var v16: Vector[Vector[Double]] = v1
    v12 = v12.copy(p1 = v17)
    v12 = v12.copy(p0 = v1)
    val v10: Vector[Vector[Double]] = v12.p1
    v12 = v12.copy(p0 = v13)
    val v50: Vector[Vector[Double]] = v2.p0
    v12 = v12.copy(p1 = v4)
    var v26: Vector[s0] = v21
    v12 = v12.copy(p0 = v50)
    v12 = v12.copy(p0 = v16)
    val v49: s0 = v26(2)
    val v52: Vector[Vector[Double]] = v12.p0
    v12 = v12.copy(p0 = v50)
    var v48: Vector[Vector[Double]] = v10
    val v46: s0 = v26(3)
    val v47: Vector[Double] = v52(1)
    var v57: s0 = v49
    v12 = v12.copy(p1 = v4)
    val v14: s0 = v7(2)
    v57 = v57.copy(p0 = v13)
    val v67: Vector[Vector[Double]] = v57.p0
    val v72: Vector[Vector[Double]] = v46.p0
    v12 = v12.copy(p1 = v9)
    v48 = v48.updated(0, v47)
    var v38: s0 = v46
    var v108: Vector[s0] = v21
    v57 = v57.copy(p0 = v72)
    v26 = v26.updated(4, v57)
    v108 = v108.updated(3, v14)
    v12 = v12.copy(p0 = v67)
    val v175: s0 = v7(3)
    v12 = v12.copy(p1 = v48)
    var v124: Vector[Vector[Double]] = v9
    val v106: s0 = v108(0)
    v38 = v38.copy(p1 = v124)
    v26 = v26.updated(1, v175)
    v108 = v108.updated(4, v38)
    v106
  }
  def f8(v0: s0): s0 = {
    val v1: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Double] = v1(2)
    var v2: Vector[Vector[Double]] = v1
    val v8: s0 = f11(v0)
    val v12: Vector[Vector[Double]] = v8.p0
    v2 = v2.updated(1, v4)
    val v15: Vector[Vector[Double]] = v0.p1
    val v5: s0 = s0(v2, v15)
    val v3: s0 = f11(v5)
    val v11: Vector[Vector[Double]] = v3.p0
    val v14: s0 = s0(v12, v15)
    val v28: s0 = f11(v3)
    v2 = v11
    val v35: s0 = f11(v14)
    val v31: s0 = f11(v14)
    val v74: Vector[s0] = Vector(v35, v35, v31, v28)
    val v63: s0 = v74(2)
    v63
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v7: Vector[s0] = v0(1)
    var v6: Vector[s0] = v7
    val v3: s0 = v6(0)
    v6 = v6.updated(0, v3)
    val v2: s0 = f8(v3)
    val v8: s0 = f11(v2)
    val v23: Vector[Vector[Double]] = v8.p1
    val v21: Vector[Double] = v23(0)
    val v44: Double = v21(0)
    var v124: Double = v44
    v124
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}