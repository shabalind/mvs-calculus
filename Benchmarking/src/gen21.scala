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
  def f76(v0: Vector[s0]): Vector[s0] = {
    var v2: Vector[s0] = v0
    var v1: Vector[s0] = v2
    v2 = v1
    val v7: s0 = v2(0)
    var v3: s0 = v7
    v2 = v2.updated(0, v3)
    val v5: s0 = v2(0)
    val v6: s0 = v0(0)
    val v10: s0 = v1(0)
    val v4: s0 = v2(0)
    val v8: Vector[Vector[Double]] = v4.p1
    v2 = v2.updated(0, v10)
    var v16: s0 = v5
    var v11: Vector[Vector[Double]] = v8
    val v13: Vector[Vector[Double]] = v5.p0
    val v33: Vector[Vector[Double]] = v16.p0
    val v30: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p1 = v30)
    var v65: s0 = v5
    v3 = v3.copy(p1 = v11)
    val v19: Vector[Vector[Double]] = v4.p0
    v16 = v16.copy(p0 = v13)
    val v36: Vector[Vector[Double]] = v10.p0
    v3 = v3.copy(p0 = v36)
    v2 = v2.updated(0, v7)
    val v87: Vector[Vector[Double]] = v4.p0
    val v34: Vector[Vector[Double]] = v65.p1
    val v48: Vector[Vector[Double]] = v65.p0
    v1 = v1.updated(0, v6)
    v1 = v1.updated(0, v16)
    v65 = v65.copy(p0 = v36)
    v3 = v3.copy(p0 = v36)
    v3 = v3.copy(p0 = v19)
    v65 = v65.copy(p1 = v34)
    v1 = v1.updated(0, v65)
    val v66: Vector[Vector[Double]] = v16.p0
    v65 = v65.copy(p0 = v33)
    v65 = v65.copy(p0 = v87)
    v1 = v1.updated(0, v7)
    var v128: Vector[Vector[Double]] = v66
    val v165: Vector[Double] = v8(0)
    v16 = v16.copy(p0 = v48)
    v65 = v65.copy(p0 = v128)
    v128 = v128.updated(1, v165)
    v65 = v65.copy(p0 = v66)
    v65 = v65.copy(p1 = v11)
    v1
  }
  def f51(v0: s1): s1 = {
    var v5: s1 = v0
    val v9: s0 = v5.p0
    val v3: s1 = s1(v9, v9)
    var v8: s0 = v9
    var v6: s1 = v3
    v5 = v5.copy(p1 = v8)
    var v2: s1 = v6
    var v1: s0 = v8
    v2 = v2.copy(p1 = v1)
    v2 = v2.copy(p0 = v8)
    v2
  }
  def f46(v0: s0, v1: s0): s0 = {
    val v4: Vector[s0] = Vector(v1, v1)
    val v7: Vector[Vector[Double]] = v0.p1
    var v5: Vector[Vector[Double]] = v7
    var v9: Vector[s0] = v4
    val v2: s1 = s1(v1, v0)
    var v17: s1 = v2
    val v13: s0 = v2.p1
    val v19: s1 = f51(v17)
    val v8: s0 = v2.p0
    val v18: s0 = v9(1)
    val v11: Vector[Vector[Double]] = v8.p0
    var v10: s0 = v13
    val v12: s1 = f51(v2)
    v17 = v17.copy(p0 = v8)
    val v48: Vector[Vector[Double]] = v1.p1
    v17 = v17.copy(p1 = v10)
    val v21: s0 = v12.p0
    val v25: s0 = v19.p0
    v10 = v10.copy(p1 = v5)
    v10 = v10.copy(p1 = v7)
    v10 = v10.copy(p1 = v5)
    v10 = v10.copy(p0 = v11)
    v17 = v17.copy(p0 = v18)
    v17 = v17.copy(p1 = v1)
    val v63: Vector[s0] = Vector(v25)
    var v59: s0 = v21
    val v60: Vector[s0] = f76(v63)
    v9 = v9.updated(0, v59)
    val v53: Vector[s0] = f76(v60)
    v59 = v59.copy(p1 = v48)
    var v30: Vector[s0] = v53
    val v51: s0 = v30(0)
    v51
  }
  def f34(v0: s0): s0 = {
    var v1: s0 = v0
    val v3: s0 = f46(v1, v0)
    var v6: s0 = v0
    val v7: Vector[Vector[Double]] = v0.p0
    val v4: Vector[Vector[Double]] = v1.p0
    v1 = v1.copy(p0 = v4)
    val v5: Vector[Vector[Double]] = v6.p1
    val v11: Vector[Double] = v4(0)
    var v2: s0 = v6
    var v18: Vector[Vector[Double]] = v5
    v18 = v18.updated(0, v11)
    val v33: Vector[Vector[Double]] = v1.p0
    v2 = v1
    v18 = v18.updated(0, v11)
    val v24: s1 = s1(v0, v2)
    val v35: s0 = v24.p1
    v2 = v2.copy(p1 = v18)
    val v23: s0 = f46(v35, v3)
    val v30: s0 = f46(v6, v23)
    val v17: Vector[Double] = v7(1)
    val v27: Vector[Vector[Double]] = v3.p0
    val v29: Vector[Double] = v27(1)
    v18 = v18.updated(0, v29)
    val v31: Vector[Vector[Double]] = v35.p1
    v6 = v6.copy(p0 = v33)
    v18 = v18.updated(0, v17)
    val v77: s0 = f46(v1, v30)
    v2 = v2.copy(p1 = v31)
    v77
  }
  @noinline
  def f0(v0: Vector[s0], v1: Double): Double = {
    val v4: s0 = v0(0)
    val v2: s0 = f34(v4)
    val v18: Vector[Vector[Double]] = v2.p1
    val v9: Vector[Double] = v18(0)
    val v43: Double = v9(0)
    val v72: Double = v43 + v43
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}