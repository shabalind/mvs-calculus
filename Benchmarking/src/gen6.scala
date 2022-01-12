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
    p2: s0
  )
  case class s2 (
    p0: s1
  )
  def f102(v0: s0): s0 = {
    val v4: Vector[Vector[Double]] = v0.p1
    val v6: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v0.p1
    var v15: s0 = v0
    val v7: Vector[Vector[Double]] = v15.p1
    v15 = v15.copy(p0 = v6)
    v15 = v15.copy(p1 = v4)
    val v2: Vector[Vector[Double]] = v15.p0
    v15 = v15.copy(p0 = v2)
    val v12: Vector[Vector[Double]] = v15.p0
    v15 = v15.copy(p0 = v12)
    val v13: Vector[Vector[Double]] = v0.p1
    var v21: s0 = v0
    val v9: Vector[Vector[Double]] = v15.p0
    v21 = v21.copy(p0 = v4)
    val v18: Vector[Double] = v9(0)
    var v20: s0 = v15
    v21 = v21.copy(p0 = v6)
    var v33: Vector[Vector[Double]] = v4
    v33 = v33.updated(0, v18)
    v33 = v33.updated(0, v18)
    v15 = v15.copy(p0 = v33)
    v15 = v21
    val v32: Vector[Vector[Double]] = v21.p0
    val v41: Vector[Vector[Double]] = v21.p0
    v15 = v15.copy(p1 = v8)
    v15 = v15.copy(p0 = v41)
    v15 = v15.copy(p0 = v7)
    v21 = v21.copy(p0 = v8)
    val v49: Vector[Vector[Double]] = v20.p1
    val v104: Vector[Double] = v32(0)
    val v46: Vector[Vector[Double]] = v15.p1
    v21 = v21.copy(p0 = v6)
    v15 = v15.copy(p0 = v49)
    var v34: s0 = v0
    val v95: Vector[Vector[Double]] = v20.p0
    v21 = v21.copy(p0 = v13)
    v34 = v34.copy(p1 = v46)
    val v77: Vector[Vector[Double]] = v15.p0
    v33 = v33.updated(0, v104)
    v15 = v15.copy(p1 = v41)
    v20 = v20.copy(p0 = v95)
    v15 = v15.copy(p1 = v77)
    v34
  }
  def f89(v0: s0): s0 = {
    var v2: s0 = v0
    val v5: s0 = f102(v2)
    v5
  }
  def f74(v0: s0): s0 = {
    val v8: s0 = f89(v0)
    val v1: s0 = f102(v8)
    val v5: s0 = f102(v1)
    val v3: s0 = f102(v5)
    val v10: Vector[Vector[Double]] = v8.p0
    val v14: s0 = f102(v3)
    var v25: s0 = v14
    v25 = v25.copy(p1 = v10)
    val v36: Vector[Vector[Double]] = v3.p1
    v25 = v25.copy(p1 = v36)
    v25
  }
  @noinline
  def f0(v0: s1, v1: s2, v2: Double): Double = {
    val v3: s0 = v0.p2
    val v11: s0 = f74(v3)
    val v49: Double = v2 / v2
    val v36: Vector[Vector[Double]] = v11.p1
    var v59: Double = v49
    val v71: Vector[Double] = v36(0)
    var v137: Vector[Double] = v71
    v137 = v137.updated(0, v59)
    v137 = v137.updated(0, v2)
    val v177: Double = v137(0)
    v177
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))), s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))))
    val v1: s2 = s2(s1(Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0)), Vector(Vector(19.0)))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}