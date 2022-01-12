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
    p0: s1,
    p1: s0
  )
  def f22(v0: Vector[Vector[Double]]): Vector[Vector[Double]] = {
    val v4: Vector[Double] = v0(0)
    var v1: Vector[Double] = v4
    var v8: Vector[Double] = v4
    var v7: Vector[Vector[Double]] = v0
    var v3: Vector[Vector[Double]] = v7
    val v11: Vector[Double] = v3(0)
    var v2: Vector[Double] = v8
    val v12: Vector[Vector[Double]] = Vector(v4, v2, v8)
    val v19: Vector[Double] = v12(0)
    var v14: Vector[Vector[Double]] = v3
    v14 = v14.updated(0, v11)
    val v18: Double = v8(0)
    var v21: Vector[Vector[Double]] = v14
    v21 = v21.updated(0, v1)
    v2 = v11
    val v44: Vector[Double] = v7(0)
    v2 = v2.updated(0, v18)
    val v26: Double = v19(0)
    v21 = v21.updated(0, v44)
    v8 = v8.updated(0, v26)
    v1 = v1.updated(0, v18)
    v21
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v7: s1 = v0.p0
    var v5: s2 = v0
    val v8: s0 = v5.p1
    v5 = v5.copy(p1 = v8)
    v5 = v5.copy(p1 = v8)
    v5 = v5.copy(p0 = v7)
    v5 = v5.copy(p0 = v7)
    var v4: s0 = v8
    val v3: s0 = v7.p1
    v5 = v5.copy(p1 = v4)
    var v2: s0 = v3
    val v6: s0 = v0.p1
    val v12: Vector[Vector[Double]] = v6.p0
    val v16: Vector[Double] = v12(1)
    val v14: s2 = s2(v7, v2)
    var v13: Vector[Vector[Double]] = v12
    var v11: s2 = v0
    v11 = v5
    val v26: Vector[Vector[Double]] = v2.p1
    v13 = v13.updated(1, v16)
    v5 = v11
    val v35: Vector[Vector[Double]] = f22(v26)
    val v37: Vector[Double] = v13(1)
    var v9: s2 = v14
    v2 = v8
    val v18: Vector[Vector[Double]] = f22(v35)
    val v50: s1 = v5.p0
    val v33: Vector[Vector[Double]] = f22(v35)
    val v21: Vector[Double] = v26(0)
    v5 = v0
    var v23: s0 = v3
    val v25: s0 = v0.p1
    val v20: Vector[Vector[s0]] = v50.p0
    val v41: Vector[Vector[Double]] = f22(v18)
    v9 = v9.copy(p1 = v23)
    val v61: Vector[Vector[Double]] = f22(v26)
    val v36: s0 = v9.p1
    v2 = v25
    var v84: s1 = v50
    val v86: s2 = s2(v84, v25)
    var v55: Vector[Vector[Double]] = v13
    v4 = v4.copy(p1 = v41)
    v4 = v4.copy(p0 = v55)
    v23 = v23.copy(p0 = v13)
    val v66: s0 = v14.p1
    v84 = v84.copy(p1 = v36)
    val v71: s1 = s1(v20, v66)
    val v116: Vector[Vector[Double]] = v23.p0
    val v151: Vector[Vector[Double]] = f22(v33)
    v13 = v13.updated(0, v21)
    v84 = v84.copy(p0 = v20)
    v9 = v9.copy(p0 = v71)
    v9 = v9.copy(p0 = v84)
    v5 = v86
    v23 = v23.copy(p1 = v151)
    val v81: Double = v37(0)
    val v76: s0 = s0(v116, v61)
    v9 = v9.copy(p1 = v76)
    v5 = v5.copy(p1 = v66)
    v4 = v4.copy(p0 = v116)
    v81
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
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