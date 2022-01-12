import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s6 (
    p0: s2,
    p1: s1
  )
  case class s10 (
    p0: s6,
    p1: Vector[Vector[s2]]
  )
  def f65(v0: s10): s10 = {
    var v7: s10 = v0
    var v39: s10 = v7
    v39
  }
  def f36(v0: s10): s10 = {
    val v5: Vector[s10] = Vector(v0, v0, v0, v0, v0)
    var v6: Vector[s10] = v5
    val v9: s10 = v5(4)
    val v3: s10 = v5(0)
    val v10: s10 = f65(v3)
    v6 = v6.updated(2, v10)
    val v23: s10 = v5(2)
    val v24: s10 = v6(4)
    v6 = v6.updated(3, v23)
    v6 = v6.updated(2, v3)
    v6 = v6.updated(2, v24)
    v6 = v6.updated(0, v0)
    v6 = v6.updated(0, v9)
    val v61: s10 = v6(3)
    v6 = v6.updated(3, v61)
    v6 = v6.updated(4, v0)
    v6 = v6.updated(1, v61)
    val v161: s10 = f65(v61)
    v161
  }
  def f25(v0: s10, v1: Double): Double = {
    val v4: s10 = f36(v0)
    val v6: s6 = v4.p0
    val v10: s2 = v6.p0
    val v9: s1 = v10.p0
    var v43: s1 = v9
    val v107: Vector[s0] = v43.p1
    var v23: s1 = v43
    val v47: s0 = v23.p0
    v43 = v43.copy(p1 = v107)
    val v41: Vector[Vector[Double]] = v47.p0
    val v68: Vector[Double] = v41(1)
    val v64: Double = v68(0)
    var v166: Double = v64
    var v161: Double = v166
    v161
  }
  @noinline
  def f0(v0: s3, v1: Vector[Vector[s10]], v2: s2, v3: Double): Double = {
    val v4: s0 = v0.p1
    var v5: Double = v3
    val v6: Vector[s10] = v1(0)
    val v7: s10 = v6(0)
    var v8: Double = v5
    val v15: Vector[Vector[Double]] = v4.p0
    val v25: s10 = f65(v7)
    val v56: Vector[Double] = v15(1)
    var v34: Vector[Double] = v56
    v34 = v34.updated(0, v3)
    v34 = v34.updated(0, v3)
    var v31: Vector[Double] = v34
    val v64: Double = v31(0)
    val v67: Double = v5 + v8
    v34 = v34.updated(0, v67)
    val v83: Double = f25(v25, v64)
    v83
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0), Vector(4.0), Vector(5.0))))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0))))
    val v1: Vector[Vector[s10]] = Vector(Vector(s10(s6(s2(s1(s0(Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0))))), s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)))))), s1(s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)))))), Vector(Vector(s2(s1(s0(Vector(Vector(27.0), Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0))))), s1(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)))))))))), Vector(s10(s6(s2(s1(s0(Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0))))), s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)))))), s1(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)))))), Vector(Vector(s2(s1(s0(Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0))))), s1(s0(Vector(Vector(63.0), Vector(64.0), Vector(65.0))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)))))))))))
    val v2: s2 = s2(s1(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0))))), s1(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0))))))
    val v3: Double = 81.0
    val start = nanoTime()
    var result: Double = 81.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}