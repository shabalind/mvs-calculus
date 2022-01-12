import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f72(v0: s1): s1 = {
    v0
  }
  def f71(v0: s0): s0 = {
    var v5: s0 = v0
    val v3: Vector[Vector[Double]] = v5.p1
    var v4: Vector[Vector[Double]] = v3
    v5 = v5.copy(p1 = v4)
    val v2: Vector[Vector[Double]] = v0.p1
    val v1: Vector[Double] = v2(2)
    val v9: Vector[Vector[Double]] = v0.p0
    var v8: s0 = v0
    v4 = v4.updated(1, v1)
    var v6: Vector[Vector[Double]] = v9
    val v7: Vector[Vector[Double]] = v8.p1
    v8 = v8.copy(p1 = v4)
    v8 = v8.copy(p1 = v4)
    var v16: Vector[Vector[Double]] = v6
    var v13: Vector[Vector[Double]] = v16
    val v25: Vector[Vector[Double]] = v8.p0
    v8 = v8.copy(p1 = v2)
    val v24: Vector[Vector[Double]] = v0.p1
    val v18: Vector[Double] = v7(2)
    v5 = v5.copy(p0 = v25)
    v8 = v8.copy(p1 = v3)
    v8 = v8.copy(p0 = v13)
    val v14: Vector[Vector[Vector[Double]]] = Vector(v3, v2, v4, v7, v3, v24, v24)
    val v36: Vector[Vector[Double]] = v14(3)
    v5 = v5.copy(p0 = v13)
    v16 = v16.updated(0, v18)
    var v90: s0 = v0
    v90 = v90.copy(p1 = v36)
    v90
  }
  def f69(v0: s0): s0 = {
    val v2: s0 = f71(v0)
    val v4: Vector[Vector[Double]] = v0.p1
    val v5: s0 = f71(v0)
    var v1: s0 = v2
    val v9: s0 = f71(v5)
    val v7: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p1 = v4)
    var v19: Vector[Vector[Double]] = v7
    v1 = v1.copy(p0 = v19)
    val v22: Vector[Vector[Double]] = v9.p0
    val v14: Vector[Double] = v7(0)
    val v10: Vector[Double] = v7(0)
    var v11: Vector[Double] = v14
    var v17: Vector[Double] = v10
    v19 = v19.updated(0, v14)
    val v29: s0 = f71(v1)
    var v20: Vector[Vector[Double]] = v4
    val v16: Vector[Double] = v20(1)
    v1 = v1.copy(p0 = v22)
    val v25: s0 = s0(v19, v20)
    var v21: Vector[Vector[Double]] = v7
    val v18: Vector[Vector[Double]] = v25.p0
    val v36: Vector[Double] = v19(0)
    val v66: Vector[Vector[Double]] = v5.p1
    val v33: Vector[Vector[Double]] = v29.p1
    v20 = v20.updated(2, v14)
    v1 = v1.copy(p0 = v21)
    v19 = v19.updated(0, v17)
    val v31: s0 = f71(v29)
    v1 = v1.copy(p1 = v33)
    v21 = v21.updated(0, v11)
    val v24: Double = v10(0)
    val v39: Double = v24 * v24
    var v46: Double = v24
    val v72: Double = v46 / v39
    val v61: Double = v11(0)
    v20 = v20.updated(2, v16)
    val v32: Double = v14(0)
    val v50: Vector[Double] = v66(1)
    v17 = v17.updated(0, v61)
    v17 = v17.updated(0, v72)
    val v91: Double = v36(0)
    var v90: Vector[Vector[Double]] = v20
    v17 = v17.updated(0, v24)
    v17 = v10
    v1 = v31
    v21 = v21.updated(0, v50)
    val v142: Vector[Double] = Vector(v91, v72, v72, v46, v32)
    val v77: s0 = s0(v18, v90)
    v1 = v1.copy(p1 = v20)
    v1 = v1.copy(p1 = v90)
    v19 = v19.updated(0, v14)
    val v171: Double = v142(0)
    v17 = v17.updated(0, v171)
    v77
  }
  def f67(v0: s1): s1 = {
    val v1: s1 = f72(v0)
    val v7: Vector[s0] = v1.p0
    val v3: s1 = f72(v0)
    val v5: s0 = v7(0)
    val v6: Vector[s0] = v3.p0
    val v2: s0 = v6(0)
    var v8: s1 = v3
    v8 = v0
    var v12: Vector[s0] = v7
    val v10: s0 = v0.p1
    v12 = v12.updated(1, v5)
    val v15: s0 = f71(v2)
    val v13: Vector[s0] = v1.p0
    v8 = v8.copy(p1 = v15)
    v8 = v8.copy(p0 = v12)
    v8 = v8.copy(p0 = v6)
    val v14: s0 = f69(v10)
    v12 = v12.updated(1, v2)
    v8 = v8.copy(p0 = v13)
    v8 = v8.copy(p1 = v14)
    v8
  }
  def f30(v0: s1): s1 = {
    val v10: s1 = f72(v0)
    val v2: s1 = f67(v10)
    val v72: Vector[s0] = v2.p0
    var v71: s1 = v0
    v71 = v71.copy(p0 = v72)
    v71
  }
  def f22(v0: s0, v1: Vector[s0], v2: s1): Vector[s0] = {
    val v5: s0 = v1(1)
    val v9: s0 = f71(v5)
    var v18: Vector[s0] = v1
    v18 = v18.updated(0, v9)
    val v17: s0 = v2.p1
    v18 = v18.updated(0, v9)
    v18 = v18.updated(0, v17)
    v18
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: Vector[s0] = v0.p0
    var v6: s1 = v0
    var v7: s1 = v6
    var v11: Vector[s0] = v4
    v7 = v7.copy(p0 = v11)
    val v2: s1 = f30(v6)
    val v8: s0 = v2.p1
    val v18: Vector[Vector[Double]] = v8.p0
    val v21: Vector[s0] = f22(v8, v11, v7)
    val v30: s0 = v4(0)
    v11 = v11.updated(1, v30)
    val v31: Vector[Double] = v18(0)
    var v52: Vector[Double] = v31
    v6 = v6.copy(p0 = v21)
    val v84: Double = v52(0)
    v84
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}