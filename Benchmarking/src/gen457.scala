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
    p0: s0,
    p1: s1
  )
  def f21(v0: s0): s0 = {
    var v4: s0 = v0
    var v6: s0 = v4
    val v2: Vector[Vector[Double]] = v0.p0
    var v1: Vector[Vector[Double]] = v2
    var v3: Vector[Vector[Double]] = v1
    val v7: Vector[Double] = v3(0)
    var v5: Vector[Double] = v7
    val v9: Vector[Vector[Double]] = v0.p1
    v1 = v1.updated(0, v5)
    val v11: Vector[Vector[Double]] = v6.p1
    v1 = v1.updated(0, v5)
    v1 = v1.updated(0, v7)
    v4 = v4.copy(p1 = v11)
    val v16: Double = v7(0)
    v4 = v4.copy(p1 = v9)
    val v20: Vector[Vector[Double]] = v4.p0
    v1 = v1.updated(0, v7)
    v5 = v5.updated(0, v16)
    v4 = v4.copy(p0 = v1)
    val v23: Vector[Double] = v20(0)
    v3 = v3.updated(0, v5)
    v3 = v3.updated(0, v23)
    v4
  }
  def f11(v0: s0): s0 = {
    val v18: s0 = f21(v0)
    val v13: s0 = f21(v18)
    v13
  }
  def f4(v0: s0): s0 = {
    val v7: s0 = f21(v0)
    var v2: s0 = v7
    var v6: s0 = v0
    val v5: Vector[s0] = Vector(v7, v6, v7, v7, v2)
    val v4: s0 = v5(0)
    val v3: s0 = v5(1)
    val v13: Vector[Vector[Double]] = v2.p1
    v6 = v6.copy(p0 = v13)
    var v9: Vector[s0] = v5
    val v19: s0 = v9(0)
    val v15: Vector[Vector[Double]] = v4.p0
    val v28: s0 = v9(3)
    val v11: Vector[Vector[s0]] = Vector(v5, v5, v9, v9, v9)
    val v33: Vector[Vector[Double]] = v28.p0
    v2 = v2.copy(p0 = v33)
    val v17: s0 = f11(v4)
    var v38: Vector[Vector[s0]] = v11
    v38 = v38.updated(2, v9)
    val v34: s0 = f21(v4)
    val v30: Vector[Vector[Double]] = v19.p0
    var v27: s0 = v3
    var v37: Vector[s0] = v5
    val v53: s0 = f21(v7)
    val v51: Vector[Vector[Double]] = v27.p1
    v27 = v27.copy(p0 = v30)
    val v36: s0 = v37(2)
    v2 = v7
    v37 = v37.updated(3, v28)
    val v104: Vector[Vector[Double]] = v36.p1
    v6 = v6.copy(p1 = v104)
    val v56: s0 = f11(v4)
    v2 = v7
    v6 = v6.copy(p0 = v51)
    v37 = v37.updated(1, v34)
    val v73: Vector[s0] = v38(2)
    v6 = v6.copy(p1 = v15)
    val v144: Vector[Vector[Double]] = v17.p1
    val v170: Vector[Vector[Double]] = v53.p0
    v9 = v73
    val v87: s0 = f21(v56)
    val v109: Vector[s0] = v11(1)
    v27 = v27.copy(p1 = v51)
    val v118: s0 = v109(3)
    v27 = v27.copy(p0 = v170)
    var v92: Vector[Vector[Double]] = v144
    v9 = v9.updated(0, v6)
    v9 = v9.updated(0, v87)
    v2 = v2.copy(p0 = v92)
    v118
  }
  @noinline
  def f0(v0: Vector[s0], v1: s2, v2: Double): Double = {
    val v6: s1 = v1.p1
    val v8: s0 = v6.p1
    val v15: s0 = f4(v8)
    val v35: Vector[Vector[Double]] = v15.p1
    val v64: Vector[Double] = v35(0)
    val v70: Double = v64(0)
    v70
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: s2 = s2(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))
    val v2: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}