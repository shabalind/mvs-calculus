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
  def f21(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    var v5: Vector[Vector[Double]] = v0
    val v7: Vector[Double] = v5(0)
    val v1: Vector[Double] = v5(0)
    var v3: Vector[Double] = v7
    val v6: Vector[Double] = v5(0)
    v5 = v5.updated(0, v3)
    val v4: Double = v3(0)
    var v8: Double = v4
    val v12: Vector[Double] = v5(0)
    v5 = v5.updated(0, v7)
    val v9: Vector[Double] = v0(0)
    v5 = v5.updated(0, v12)
    val v11: Vector[Double] = v5(0)
    val v16: Vector[Double] = v0(0)
    val v17: Double = v16(0)
    val v13: Double = v9(0)
    val v23: Double = v12(0)
    var v18: Double = v17
    v5 = v5.updated(0, v1)
    var v33: Vector[Double] = v6
    v3 = v3.updated(0, v13)
    var v30: Vector[Double] = v11
    val v31: Double = v23 / v13
    var v46: Vector[Vector[Double]] = v5
    val v34: Double = v7(0)
    v46 = v5
    v30 = v30.updated(0, v34)
    v3 = v3.updated(0, v18)
    v46 = v46.updated(0, v30)
    v5 = v5.updated(0, v33)
    v33 = v33.updated(0, v31)
    var v50: Vector[Vector[Double]] = v46
    v33 = v33.updated(0, v8)
    v50
  }
  def f20(v0: s0, v1: s1): s0 = {
    val v3: Vector[Vector[Double]] = v0.p1
    val v2: s0 = v1.p1
    var v5: Vector[Vector[Double]] = v3
    val v4: s0 = v1.p0
    val v7: Vector[Double] = v3(0)
    val v10: Vector[Vector[Double]] = v4.p1
    var v6: Vector[Vector[Double]] = v10
    val v8: s0 = v1.p1
    val v9: Vector[Double] = v6(0)
    v6 = v6.updated(0, v7)
    var v14: Vector[Vector[Double]] = v5
    v6 = v10
    val v12: Vector[Double] = v14(0)
    var v19: s1 = v1
    v6 = v6.updated(1, v9)
    val v15: s0 = v19.p0
    v5 = v5.updated(0, v9)
    var v16: s0 = v2
    v19 = v19.copy(p0 = v16)
    v6 = v6.updated(1, v9)
    v6 = v6.updated(0, v12)
    var v28: s0 = v0
    v16 = v16.copy(p1 = v14)
    v19 = v19.copy(p0 = v4)
    var v35: s1 = v19
    val v33: Vector[Vector[Double]] = v8.p2
    v19 = v19.copy(p0 = v0)
    val v51: Vector[Vector[Double]] = f21(v33)
    v6 = v6.updated(1, v9)
    val v46: s0 = v35.p1
    val v43: Vector[Vector[Double]] = v46.p2
    val v106: Vector[Vector[Double]] = f21(v43)
    val v89: s0 = v35.p1
    val v37: Vector[Double] = v5(0)
    val v146: Vector[Vector[Double]] = f21(v51)
    val v98: Vector[Vector[Double]] = v15.p1
    val v77: Vector[Vector[Double]] = f21(v146)
    v14 = v14.updated(0, v37)
    v35 = v35.copy(p0 = v15)
    v16 = v16.copy(p2 = v77)
    var v109: s1 = v35
    v16 = v16.copy(p2 = v106)
    val v80: s0 = v109.p0
    v109 = v109.copy(p1 = v89)
    var v113: Vector[Vector[Double]] = v98
    v28 = v28.copy(p1 = v113)
    v109 = v109.copy(p0 = v8)
    v19 = v19.copy(p1 = v28)
    v80
  }
  def f19(v0: s0): s0 = {
    val v1: s1 = s1(v0, v0)
    val v2: s0 = f20(v0, v1)
    val v11: s0 = f20(v2, v1)
    val v13: s0 = f20(v11, v1)
    val v14: s0 = f20(v13, v1)
    v14
  }
  @noinline
  def f0(v0: s1, v1: s0, v2: Double): Double = {
    val v7: s0 = v0.p0
    val v10: s0 = f19(v1)
    val v3: s0 = f20(v10, v0)
    val v6: Vector[s0] = Vector(v3, v1, v7, v1)
    var v39: Double = v2
    val v26: s0 = v6(0)
    val v21: Vector[Vector[Double]] = v26.p0
    var v34: Vector[Vector[Double]] = v21
    val v58: Vector[Double] = v34(1)
    var v33: Vector[Double] = v58
    v34 = v34.updated(2, v58)
    val v75: Double = v33(0)
    val v244: Double = v75 / v39
    v244
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))
    val v2: Double = 18.0
    val start = nanoTime()
    var result: Double = 18.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}