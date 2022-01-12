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
  case class s2 (
    p0: Vector[s1],
    p1: s1
  )
  def f65(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p1
    val v8: Vector[Vector[Double]] = v0.p0
    val v4: Vector[s0] = Vector(v0, v0, v0, v0)
    val v13: s0 = v4(2)
    val v17: Vector[Vector[Double]] = v0.p0
    val v12: s0 = v4(3)
    val v24: Vector[Vector[Double]] = v13.p1
    var v19: s0 = v12
    val v50: Vector[Vector[Double]] = v19.p1
    v19 = v19.copy(p1 = v50)
    val v47: Vector[Vector[Double]] = v19.p0
    v19 = v19.copy(p1 = v6)
    v19 = v19.copy(p1 = v24)
    v19 = v19.copy(p1 = v6)
    v19 = v19.copy(p0 = v47)
    v19 = v19.copy(p0 = v8)
    val v67: s1 = s1(v19, v13)
    var v131: s1 = v67
    val v80: s0 = v4(1)
    var v87: s1 = v131
    v131 = v131.copy(p1 = v80)
    v19 = v19.copy(p0 = v17)
    val v180: s0 = v87.p0
    v180
  }
  def f41(v0: s2): s2 = {
    var v5: s2 = v0
    val v6: s1 = v5.p1
    val v3: s1 = v5.p1
    v5 = v5.copy(p1 = v6)
    v5 = v0
    val v4: s1 = v5.p1
    v5 = v5.copy(p1 = v6)
    v5 = v5.copy(p1 = v4)
    val v11: Vector[s1] = v0.p0
    v5 = v5.copy(p1 = v6)
    var v40: s1 = v4
    v5 = v0
    val v62: s0 = v3.p0
    v40 = v40.copy(p0 = v62)
    val v83: s2 = s2(v11, v40)
    v83
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v8: Double = v1
    var v2: s2 = v0
    var v5: Double = v8
    val v9: Double = v5 - v8
    val v6: Vector[s1] = v2.p0
    val v10: s1 = v6(1)
    val v11: s0 = v10.p0
    val v19: s0 = f65(v11)
    val v25: Vector[Vector[Double]] = v19.p0
    val v18: s2 = f41(v0)
    val v23: s1 = v18.p1
    var v36: Double = v9
    val v39: Vector[Double] = v25(0)
    var v16: Vector[Double] = v39
    v2 = v2.copy(p0 = v6)
    val v24: Double = v16(0)
    v16 = v16.updated(0, v36)
    v2 = v2.copy(p1 = v23)
    v2 = v2.copy(p1 = v10)
    v24
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}