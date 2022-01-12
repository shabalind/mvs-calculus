import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  case class s5 (
    p0: s1
  )
  def f81(v0: s2, v1: s2): s2 = {
    v0
  }
  def f30(v0: Double, v1: s2): s2 = {
    val v10: s2 = f81(v1, v1)
    val v6: s1 = v1.p1
    val v5: s5 = s5(v6)
    val v14: s1 = v5.p0
    val v4: s2 = f81(v10, v1)
    var v28: s2 = v4
    v28 = v28.copy(p1 = v14)
    val v22: s2 = f81(v28, v4)
    v28 = v28.copy(p1 = v14)
    val v85: s2 = f81(v10, v22)
    v85
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v5: s2 = f30(v1, v0)
    val v7: s1 = v5.p1
    var v8: s1 = v7
    val v36: Vector[s0] = v8.p1
    v8 = v7
    val v17: s0 = v36(2)
    val v24: s0 = v36(0)
    var v38: Vector[s0] = v36
    v38 = v38.updated(2, v24)
    val v67: Vector[Vector[Double]] = v24.p0
    val v29: Double = v1 * v1
    v8 = v8.copy(p1 = v38)
    val v103: s0 = v38(2)
    v38 = v38.updated(2, v17)
    v38 = v38.updated(2, v17)
    val v52: Vector[Double] = v67(1)
    val v42: Double = v52(0)
    v38 = v38.updated(1, v17)
    val v54: Double = v42 + v29
    var v115: Double = v54
    v38 = v38.updated(1, v103)
    v115
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s1(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))))), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))))
    val v1: Double = 45.0
    val start = nanoTime()
    var result: Double = 45.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}