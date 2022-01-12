import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  def f15(v0: s2): s2 = {
    var v4: s2 = v0
    val v2: s0 = v0.p1
    var v3: s2 = v4
    val v7: Vector[Vector[Double]] = v2.p0
    val v6: s0 = s0(v7, v7)
    val v9: Vector[s2] = Vector(v4, v3, v4, v0)
    val v11: s2 = v9(2)
    val v1: s0 = v4.p1
    var v14: Vector[s2] = v9
    var v19: Vector[s2] = v14
    var v20: Vector[s2] = v19
    var v12: s0 = v6
    v4 = v4.copy(p1 = v6)
    val v13: s2 = v14(0)
    v4 = v4.copy(p1 = v12)
    var v27: s2 = v11
    var v21: Vector[Vector[Double]] = v7
    v4 = v4.copy(p1 = v1)
    v19 = v19.updated(3, v0)
    var v22: s2 = v3
    val v48: s2 = v19(0)
    v12 = v12.copy(p1 = v21)
    val v33: s0 = v22.p1
    var v26: Vector[s2] = v20
    val v23: Vector[Vector[Double]] = v6.p1
    val v49: Vector[Double] = v21(0)
    var v28: s2 = v13
    val v44: Vector[s1] = v4.p0
    var v29: Vector[s1] = v44
    v26 = v26.updated(0, v48)
    v28 = v28.copy(p1 = v33)
    v26 = v20
    v21 = v21.updated(0, v49)
    val v30: Vector[Vector[Double]] = v2.p1
    v12 = v12.copy(p0 = v21)
    val v65: s0 = v27.p1
    val v43: s0 = v28.p1
    val v90: Vector[Vector[Double]] = v43.p1
    val v68: s2 = v26(0)
    val v45: s2 = v9(1)
    v26 = v26.updated(3, v68)
    v22 = v22.copy(p0 = v29)
    v12 = v12.copy(p1 = v30)
    v14 = v14.updated(2, v45)
    var v75: Vector[Vector[Double]] = v23
    v4 = v4.copy(p1 = v65)
    v12 = v12.copy(p1 = v75)
    v12 = v12.copy(p0 = v90)
    v26 = v9
    v68
  }
  def f9(v0: s1): s1 = {
    val v2: Vector[Vector[s0]] = v0.p0
    val v1: Vector[s0] = v2(1)
    val v10: Vector[s0] = v2(1)
    val v3: s0 = v1(0)
    var v6: s1 = v0
    val v19: s0 = v0.p1
    var v24: s1 = v6
    v24 = v24.copy(p1 = v19)
    v24 = v24.copy(p1 = v19)
    val v26: s0 = v24.p1
    val v18: Vector[s1] = Vector(v0, v24, v6, v6, v24, v0)
    val v25: Vector[Vector[s0]] = v6.p0
    val v40: Vector[Vector[s0]] = v6.p0
    var v39: Vector[Vector[s0]] = v25
    val v73: s1 = v18(0)
    v6 = v6.copy(p0 = v40)
    val v43: s1 = v18(2)
    val v77: s1 = v18(4)
    var v51: Vector[s1] = v18
    v39 = v39.updated(0, v10)
    v24 = v24.copy(p1 = v26)
    val v48: s0 = v43.p1
    val v91: Vector[Vector[s0]] = v24.p0
    v24 = v24.copy(p1 = v19)
    v6 = v6.copy(p0 = v39)
    val v41: s1 = v51(3)
    v6 = v6.copy(p1 = v48)
    v6 = v6.copy(p1 = v26)
    val v74: Vector[Vector[s0]] = v73.p0
    v6 = v6.copy(p0 = v74)
    v24 = v24.copy(p0 = v2)
    v6 = v6.copy(p1 = v3)
    v6 = v6.copy(p0 = v91)
    v51 = v51.updated(4, v77)
    v41
  }
  def f8(v0: Vector[s1]): Vector[s1] = {
    var v3: Vector[s1] = v0
    var v8: Vector[s1] = v3
    val v7: s1 = v3(0)
    var v2: Vector[s1] = v8
    v3 = v3.updated(0, v7)
    val v11: s1 = f9(v7)
    val v15: s1 = v8(0)
    v8 = v8.updated(0, v11)
    v8 = v0
    v2 = v2.updated(0, v15)
    v2 = v2.updated(0, v11)
    v2
  }
  def f5(v0: s2): s2 = {
    var v1: s2 = v0
    val v3: Vector[s1] = v0.p0
    val v7: s2 = f15(v0)
    var v10: s2 = v0
    v10 = v1
    v1 = v7
    v1 = v0
    var v29: s2 = v1
    val v12: s2 = f15(v10)
    var v36: s2 = v29
    val v33: Vector[s1] = f8(v3)
    v10 = v10.copy(p0 = v3)
    val v40: s2 = f15(v12)
    v10 = v10.copy(p0 = v33)
    v1 = v36
    v40
  }
  @noinline
  def f0(v0: Vector[s2], v1: s2, v2: Double): Double = {
    val v3: s2 = v0(0)
    val v7: Vector[s1] = v1.p0
    var v6: s2 = v3
    val v11: s0 = v6.p1
    val v5: s2 = f5(v3)
    v6 = v5
    val v18: Vector[Vector[Double]] = v11.p1
    var v20: Vector[s1] = v7
    val v24: s1 = v20(0)
    val v14: Vector[Double] = v18(1)
    val v44: s0 = v24.p1
    var v25: Vector[s1] = v7
    val v40: s1 = v20(0)
    v25 = v25.updated(0, v40)
    val v95: s1 = v20(0)
    val v84: s1 = f9(v95)
    v20 = v20.updated(0, v84)
    v6 = v6.copy(p0 = v25)
    val v122: Double = v14(0)
    v6 = v6.copy(p1 = v44)
    v122
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))))
    val v1: s2 = s2(Vector(s1(Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))
    val v2: Double = 32.0
    val start = nanoTime()
    var result: Double = 32.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}