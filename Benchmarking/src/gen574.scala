import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0,
    p2: s0,
    p3: Vector[s0]
  )
  def f70(v0: Vector[s0], v1: Vector[s0]): Vector[s0] = {
    val v3: s0 = v0(0)
    var v4: s0 = v3
    val v2: Vector[Vector[Double]] = v4.p0
    val v7: Vector[Vector[Double]] = v3.p1
    var v9: Vector[Vector[Double]] = v7
    var v11: Vector[Vector[Double]] = v7
    val v5: Vector[Double] = v9(2)
    val v6: Vector[Double] = v11(1)
    val v19: Vector[Double] = v2(1)
    v9 = v9.updated(2, v19)
    val v8: Vector[Vector[Double]] = v3.p0
    val v13: Vector[Vector[Double]] = v3.p0
    v11 = v11.updated(2, v6)
    v4 = v4.copy(p1 = v9)
    var v14: Vector[s0] = v0
    var v21: Vector[Vector[Double]] = v11
    var v10: Vector[Vector[Double]] = v21
    v4 = v4.copy(p0 = v2)
    v9 = v9.updated(2, v19)
    var v18: s0 = v4
    val v49: Vector[Vector[Double]] = v3.p1
    v21 = v21.updated(0, v6)
    val v20: Vector[Double] = v8(1)
    v14 = v14.updated(0, v18)
    val v34: Vector[Vector[Double]] = v3.p1
    val v30: Vector[Vector[Double]] = v3.p1
    var v24: s0 = v18
    v21 = v10
    val v43: Vector[Vector[Double]] = v4.p0
    val v26: Vector[Double] = v13(1)
    val v80: Vector[Double] = v30(1)
    v9 = v9.updated(2, v80)
    v24 = v24.copy(p1 = v21)
    val v38: Vector[Double] = v34(0)
    val v36: Vector[Vector[Double]] = v3.p1
    v10 = v10.updated(0, v38)
    val v46: Vector[Vector[Double]] = v18.p0
    val v90: Vector[Double] = v43(0)
    v24 = v24.copy(p0 = v43)
    v14 = v14.updated(0, v24)
    val v73: Vector[Vector[Double]] = v18.p1
    v14 = v14.updated(0, v18)
    val v50: s0 = s0(v8, v73)
    v11 = v11.updated(1, v20)
    var v63: Vector[s0] = v14
    val v54: Vector[Vector[Double]] = v50.p1
    var v103: Vector[Vector[Double]] = v46
    v18 = v18.copy(p0 = v103)
    v9 = v9.updated(2, v26)
    v4 = v4.copy(p1 = v49)
    v18 = v18.copy(p1 = v9)
    v21 = v21.updated(2, v90)
    v24 = v24.copy(p1 = v54)
    v14 = v0
    v24 = v24.copy(p1 = v36)
    v24 = v24.copy(p1 = v7)
    v21 = v21.updated(0, v5)
    v63
  }
  def f22(v0: Vector[s0]): Vector[s0] = {
    val v1: Vector[s0] = f70(v0, v0)
    val v7: Vector[s0] = f70(v1, v0)
    v7
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v2: Vector[Vector[s0]] = v0
    val v3: Vector[s0] = v2(2)
    var v5: Vector[s0] = v3
    v2 = v2.updated(0, v3)
    val v7: Vector[s0] = f70(v3, v5)
    var v9: Vector[Vector[s0]] = v0
    v2 = v2.updated(1, v7)
    val v13: Vector[s0] = v2(0)
    v2 = v2.updated(2, v5)
    val v10: s0 = v13(0)
    val v17: s1 = s1(v9, v10, v10, v13)
    v9 = v9.updated(2, v3)
    val v16: s0 = v17.p2
    val v14: Vector[s0] = f22(v3)
    val v23: s1 = s1(v9, v16, v10, v13)
    var v21: s0 = v16
    v9 = v9.updated(0, v7)
    val v30: Vector[s0] = v23.p3
    val v19: Vector[Vector[Double]] = v21.p1
    val v33: Vector[Double] = v19(1)
    v21 = v21.copy(p1 = v19)
    v5 = v5.updated(0, v10)
    val v46: s0 = v13(0)
    v2 = v2.updated(0, v3)
    val v92: Vector[Vector[Double]] = v21.p1
    val v41: Vector[s0] = f22(v14)
    v9 = v9.updated(0, v30)
    v21 = v21.copy(p1 = v92)
    v2 = v2.updated(2, v3)
    v9 = v9.updated(0, v41)
    v21 = v46
    val v96: Double = v33(0)
    v96
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