import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s7 (
    p0: s2,
    p1: Vector[s0]
  )
  def f28(v0: s0): s0 = {
    v0
  }
  def f19(v0: s0): s0 = {
    val v3: s0 = f28(v0)
    var v4: s0 = v3
    v4 = v3
    val v8: Vector[Vector[Double]] = v4.p1
    v4 = v4.copy(p1 = v8)
    v4 = v4.copy(p0 = v8)
    v4
  }
  def f2(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v7: Vector[Double] = v6(0)
    val v3: s0 = f19(v0)
    val v5: Vector[Vector[Double]] = v3.p1
    val v4: Vector[Double] = v5(0)
    val v9: s0 = f28(v0)
    var v12: Vector[Vector[Double]] = v5
    v12 = v12.updated(0, v4)
    val v31: Double = v7(0)
    var v40: Vector[Double] = v7
    v40 = v4
    v12 = v12.updated(0, v40)
    v12 = v12.updated(0, v4)
    v40 = v40.updated(0, v31)
    v12 = v12.updated(0, v4)
    v40 = v7
    val v44: Vector[Vector[Double]] = v9.p1
    val v85: s0 = s0(v12, v44)
    v85
  }
  @noinline
  def f0(v0: s2, v1: Vector[s0], v2: Vector[s7], v3: Double): Double = {
    var v5: Double = v3
    val v4: s0 = v1(0)
    val v11: s0 = f2(v4)
    val v9: Vector[Vector[Double]] = v11.p1
    var v8: Vector[Vector[Double]] = v9
    var v17: Vector[Vector[Double]] = v9
    val v19: Vector[Double] = v17(0)
    v17 = v17.updated(0, v19)
    val v31: Vector[Double] = v8(0)
    v17 = v17.updated(0, v19)
    val v24: Vector[Double] = v8(0)
    v17 = v17.updated(0, v31)
    val v46: Vector[Double] = v17(0)
    v8 = v8.updated(0, v19)
    val v112: Double = v24(0)
    val v72: Double = v5 - v112
    v17 = v17.updated(0, v24)
    v8 = v8.updated(0, v46)
    val v186: Double = v3 / v72
    v8 = v8.updated(0, v24)
    v186
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), Vector(s1(s0(Vector(Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0))))
    val v2: Vector[s7] = Vector(s7(s2(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), Vector(s1(s0(Vector(Vector(22.0)), Vector(Vector(23.0))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))), s1(s0(Vector(Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))))))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), s7(s2(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), Vector(s1(s0(Vector(Vector(38.0)), Vector(Vector(39.0))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0))))), s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0))))))), Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0))))))
    val v3: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}