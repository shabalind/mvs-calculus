import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Double
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f51(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p0
    var v3: Vector[Vector[Double]] = v4
    val v7: Vector[Double] = v3(1)
    var v9: Vector[Vector[Double]] = v3
    v3 = v9
    val v14: Vector[s0] = Vector(v0, v0, v0)
    val v6: Vector[Vector[s0]] = Vector(v14, v14, v14, v14, v14, v14)
    val v8: Vector[s0] = v6(0)
    val v10: Vector[Vector[Double]] = v0.p0
    val v18: s0 = v8(2)
    val v16: Double = v18.p2
    val v19: Vector[Double] = v10(1)
    var v34: Vector[Double] = v19
    val v35: s0 = s0(v9, v3, v16)
    v3 = v3.updated(1, v34)
    v9 = v9.updated(1, v7)
    v35
  }
  def f43(v0: s0, v1: Vector[s0]): Vector[s0] = {
    var v7: s0 = v0
    val v5: s0 = f51(v7)
    var v15: Vector[s0] = v1
    v7 = v5
    var v24: s0 = v7
    var v17: Vector[s0] = v15
    v17 = v17.updated(0, v24)
    v15 = v15.updated(0, v7)
    v17
  }
  def f33(v0: Double, v1: s0): Double = {
    val v6: s0 = f51(v1)
    var v5: s0 = v6
    var v2: Double = v0
    v5 = v5.copy(p2 = v0)
    val v8: Double = v1.p2
    v5 = v5.copy(p2 = v2)
    v5 = v5.copy(p2 = v8)
    val v13: Double = v5.p2
    v2 = v8
    v13
  }
  def f31(v0: s0): s0 = {
    val v3: s0 = f51(v0)
    var v5: s0 = v3
    val v10: Vector[Vector[Double]] = v0.p0
    val v6: Vector[Double] = v10(1)
    val v4: Vector[Vector[Double]] = v3.p1
    var v2: Vector[Vector[Double]] = v4
    v5 = v5.copy(p1 = v4)
    val v7: Vector[Vector[Double]] = v0.p1
    v5 = v5.copy(p1 = v10)
    val v13: Vector[Vector[Double]] = v5.p1
    val v8: s0 = f51(v5)
    v5 = v5.copy(p0 = v13)
    val v9: Vector[Double] = v13(1)
    val v12: s0 = f51(v8)
    val v15: Vector[Vector[Double]] = v3.p0
    val v20: s0 = f51(v3)
    v2 = v2.updated(1, v9)
    val v18: Double = v20.p2
    val v51: Double = f33(v18, v12)
    val v23: Double = v20.p2
    v5 = v5.copy(p2 = v23)
    val v54: s0 = f51(v8)
    val v40: Vector[Vector[Double]] = v3.p1
    v5 = v5.copy(p0 = v2)
    var v36: Vector[Vector[Double]] = v7
    v5 = v5.copy(p1 = v15)
    var v31: s0 = v54
    v36 = v36.updated(1, v9)
    v36 = v36.updated(1, v6)
    v31 = v31.copy(p0 = v36)
    val v37: Vector[Vector[Double]] = v31.p0
    val v97: s0 = s0(v36, v37, v51)
    v5 = v5.copy(p0 = v40)
    v97
  }
  def f30(v0: s0): s0 = {
    val v4: s0 = f51(v0)
    val v2: Vector[Vector[Double]] = v0.p0
    val v5: s0 = f51(v4)
    val v7: Vector[s0] = Vector(v5, v5, v0, v0, v4, v5, v5)
    var v1: Vector[s0] = v7
    v1 = v1.updated(6, v0)
    val v3: s0 = f51(v5)
    var v6: s0 = v5
    val v9: s0 = f51(v6)
    v1 = v1.updated(0, v5)
    v1 = v1.updated(1, v0)
    val v22: Double = v5.p2
    val v13: Double = f33(v22, v9)
    val v24: Double = f33(v22, v3)
    val v16: s0 = f31(v3)
    var v51: s0 = v3
    var v23: Vector[s0] = v1
    val v27: s0 = v23(2)
    v51 = v51.copy(p0 = v2)
    var v30: Vector[Vector[Double]] = v2
    val v39: s0 = v7(5)
    val v41: Vector[Double] = v30(0)
    val v68: Double = v41(0)
    val v28: Double = f33(v68, v51)
    val v35: Double = v39.p2
    val v48: Vector[Double] = Vector(v28, v24, v13, v35, v22, v22, v68)
    val v38: s0 = f51(v6)
    val v123: Double = v48(3)
    val v43: Vector[Vector[Double]] = v51.p1
    v30 = v43
    v23 = v23.updated(2, v9)
    var v31: s0 = v0
    val v65: s0 = f51(v38)
    v6 = v6.copy(p2 = v123)
    v23 = v23.updated(5, v16)
    val v81: Vector[Vector[Double]] = v65.p1
    v1 = v1.updated(0, v31)
    v31 = v31.copy(p0 = v81)
    v6 = v6.copy(p1 = v81)
    v27
  }
  def f26(v0: s0): s0 = {
    var v5: s0 = v0
    val v4: Double = v0.p2
    v5 = v5.copy(p2 = v4)
    v5 = v0
    val v11: s0 = f51(v5)
    val v16: s0 = f30(v11)
    val v17: s0 = f30(v16)
    v17
  }
  def f19(v0: Vector[s0], v1: Vector[s0], v2: s0): Vector[s0] = {
    var v10: Vector[s0] = v0
    v10
  }
  def f17(v0: s1): s1 = {
    val v5: s0 = v0.p0
    var v3: s0 = v5
    val v1: Vector[s0] = v0.p1
    var v6: s1 = v0
    var v2: s1 = v6
    val v7: s0 = f51(v5)
    val v13: Vector[s0] = f19(v1, v1, v3)
    val v8: Vector[s0] = v6.p1
    v2 = v2.copy(p0 = v7)
    v6 = v6.copy(p0 = v7)
    val v9: s0 = v1(1)
    v2 = v2.copy(p1 = v8)
    val v18: s0 = v1(0)
    val v11: Vector[Vector[Double]] = v3.p0
    var v40: Vector[Vector[Double]] = v11
    val v12: Vector[Vector[Double]] = v18.p1
    var v4: Vector[Vector[Double]] = v12
    val v31: s0 = f26(v9)
    val v16: Vector[Double] = v11(1)
    val v28: Vector[s0] = f19(v8, v13, v31)
    v6 = v6.copy(p1 = v28)
    val v39: Vector[Double] = v4(0)
    val v53: Vector[s0] = v2.p1
    v40 = v40.updated(0, v16)
    v40 = v40.updated(0, v39)
    v4 = v4.updated(0, v16)
    v6 = v6.copy(p1 = v53)
    val v46: s0 = f31(v7)
    v3 = v3.copy(p1 = v40)
    val v56: Vector[s0] = f43(v46, v28)
    v6 = v6.copy(p1 = v56)
    v2
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v6: Vector[s0] = v0.p1
    val v8: s1 = f17(v0)
    var v9: s1 = v8
    var v4: Vector[s0] = v6
    val v18: s0 = v6(1)
    val v32: s0 = v9.p0
    v4 = v4.updated(0, v32)
    val v14: s0 = v4(0)
    val v19: Vector[Vector[Double]] = v14.p1
    val v26: Vector[Double] = v19(0)
    v4 = v4.updated(0, v18)
    val v24: Double = v26(0)
    v9 = v9.copy(p1 = v6)
    v24
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), 4.0), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), 9.0), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0)), 14.0)))
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