import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s5 (
    p0: s0,
    p1: s0
  )
  def f93(v0: s5, v1: s0): s0 = {
    var v5: s5 = v0
    v5 = v0
    val v6: s0 = v5.p1
    val v9: s0 = v0.p0
    val v2: Vector[Vector[Double]] = v6.p1
    val v14: Vector[Vector[Double]] = v9.p0
    var v47: Vector[Vector[Double]] = v2
    val v26: s0 = v0.p1
    val v30: Vector[Double] = v14(1)
    var v49: s0 = v26
    v49 = v49.copy(p1 = v2)
    v47 = v47.updated(0, v30)
    v49 = v49.copy(p1 = v47)
    v49
  }
  def f75(v0: s5): s5 = {
    v0
  }
  def f66(v0: s5): s5 = {
    var v6: s5 = v0
    var v2: s5 = v6
    val v1: s0 = v2.p1
    val v3: Vector[Vector[Double]] = v1.p1
    var v8: Vector[Vector[Double]] = v3
    v2 = v2.copy(p1 = v1)
    val v10: s5 = f75(v0)
    var v16: s0 = v1
    val v18: s5 = f75(v10)
    val v20: Vector[Double] = v8(0)
    val v27: s0 = v18.p1
    v16 = v16.copy(p1 = v3)
    val v30: s5 = s5(v27, v16)
    val v26: s5 = f75(v30)
    val v21: Vector[Vector[Double]] = v1.p1
    v8 = v8.updated(0, v20)
    v2 = v2.copy(p1 = v1)
    v16 = v16.copy(p1 = v8)
    val v97: s5 = f75(v26)
    v16 = v16.copy(p1 = v21)
    val v106: s0 = v6.p1
    v6 = v6.copy(p0 = v106)
    v97
  }
  def f59(v0: s5): s5 = {
    val v5: s5 = f75(v0)
    var v8: s5 = v0
    var v3: s5 = v5
    val v6: s0 = v0.p0
    val v4: Vector[Vector[Double]] = v6.p0
    var v11: s5 = v3
    v3 = v3.copy(p1 = v6)
    var v19: s0 = v6
    val v17: s5 = f66(v5)
    val v14: s5 = f75(v0)
    var v13: s5 = v17
    val v20: Vector[Vector[Double]] = v6.p0
    val v10: s0 = v11.p1
    val v30: s5 = f75(v17)
    val v16: Vector[Double] = v20(2)
    v11 = v11.copy(p0 = v6)
    var v18: s0 = v6
    val v27: s0 = v14.p1
    val v48: s5 = f66(v13)
    val v26: s0 = f93(v30, v10)
    v3 = v11
    val v28: s0 = v3.p0
    val v38: s5 = f66(v13)
    val v103: Vector[s5] = Vector(v48, v0, v11, v11, v38, v8, v17)
    val v49: s5 = v103(1)
    v3 = v3.copy(p0 = v18)
    v8 = v8.copy(p0 = v28)
    v3 = v3.copy(p1 = v26)
    val v102: Vector[Vector[Double]] = v27.p1
    var v157: Vector[s5] = v103
    var v44: Vector[Vector[Double]] = v102
    val v65: Vector[Vector[Double]] = v19.p0
    v18 = v18.copy(p1 = v44)
    var v47: Vector[Vector[Double]] = v4
    v44 = v44.updated(0, v16)
    val v54: s0 = v30.p1
    val v74: Vector[Double] = v65(2)
    val v96: s0 = v49.p1
    val v124: s5 = v157(3)
    v11 = v11.copy(p0 = v54)
    v18 = v18.copy(p0 = v47)
    v44 = v44.updated(0, v74)
    v8 = v8.copy(p0 = v96)
    var v91: s5 = v124
    v47 = v47.updated(1, v74)
    v91
  }
  def f12(v0: s0): s0 = {
    val v4: s5 = s5(v0, v0)
    val v2: s5 = f59(v4)
    val v1: s0 = v2.p0
    var v3: s0 = v1
    v3
  }
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v5: s0 = v0(0)
    val v6: s0 = f12(v5)
    val v3: Double = v2 / v2
    val v20: Vector[Vector[Double]] = v6.p1
    val v35: Vector[Double] = v20(0)
    val v103: Double = v35(0)
    var v81: Double = v103
    v81 = v3
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}