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
  case class s2 (
    p0: Vector[s1]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s2
  )
  case class s5 (
    p0: Double,
    p1: Vector[s4]
  )
  case class s6 (
    p0: s0,
    p1: s4
  )
  case class s8 (
    p0: Vector[s5],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s6, v1: Vector[s8], v2: Double): Double = {
    val v3: s8 = v1(0)
    val v5: s4 = v0.p1
    val v12: s8 = v1(0)
    val v8: s0 = v0.p0
    val v6: Vector[s5] = v3.p0
    var v14: s8 = v3
    v14 = v14.copy(p0 = v6)
    v14 = v14.copy(p0 = v6)
    val v18: Vector[s0] = v3.p1
    var v20: Vector[s8] = v1
    var v17: Vector[s8] = v1
    val v16: s8 = v20(0)
    v20 = v20.updated(0, v3)
    val v26: Vector[s0] = v14.p1
    val v27: s0 = v26(0)
    v14 = v14.copy(p0 = v6)
    val v11: Vector[Vector[s1]] = v5.p0
    var v25: s0 = v8
    v20 = v17
    v14 = v14.copy(p1 = v26)
    v20 = v20.updated(0, v14)
    val v41: Vector[s1] = v11(0)
    v20 = v1
    val v39: s0 = v18(2)
    val v42: Vector[Vector[Double]] = v39.p1
    val v45: Vector[s5] = v16.p0
    val v38: s1 = v41(0)
    val v50: Vector[Vector[Double]] = v25.p0
    v17 = v17.updated(1, v16)
    var v71: Vector[Vector[Double]] = v50
    val v74: Vector[Vector[Double]] = v25.p1
    v25 = v25.copy(p0 = v50)
    val v78: Vector[Double] = v42(0)
    val v65: Vector[s0] = v38.p0
    v17 = v20
    val v89: Vector[Double] = v71(0)
    v14 = v14.copy(p0 = v45)
    val v69: Double = v89(0)
    val v84: Double = v2 - v69
    v25 = v25.copy(p0 = v74)
    v17 = v17.updated(1, v12)
    val v112: s0 = v65(0)
    val v106: Vector[Vector[Double]] = v112.p1
    val v253: Vector[Vector[Double]] = v27.p0
    v25 = v25.copy(p0 = v253)
    v25 = v25.copy(p0 = v106)
    v71 = v71.updated(0, v78)
    v84
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s4(Vector(Vector(s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))))), s2(Vector(s1(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s1(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s0(Vector(Vector(12.0)), Vector(Vector(13.0))))))))
    val v1: Vector[s8] = Vector(s8(Vector(s5(14.0, Vector(s4(Vector(Vector(s1(Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0)))), s0(Vector(Vector(17.0)), Vector(Vector(18.0)))))), s2(Vector(s1(Vector(s0(Vector(Vector(19.0)), Vector(Vector(20.0)))), s0(Vector(Vector(21.0)), Vector(Vector(22.0)))), s1(Vector(s0(Vector(Vector(23.0)), Vector(Vector(24.0)))), s0(Vector(Vector(25.0)), Vector(Vector(26.0)))))))))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0))), s0(Vector(Vector(29.0)), Vector(Vector(30.0))), s0(Vector(Vector(31.0)), Vector(Vector(32.0))))), s8(Vector(s5(33.0, Vector(s4(Vector(Vector(s1(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))))), s2(Vector(s1(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), s1(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0)))), s0(Vector(Vector(44.0)), Vector(Vector(45.0)))))))))), Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))))))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}