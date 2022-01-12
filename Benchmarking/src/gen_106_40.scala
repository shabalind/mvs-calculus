import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[s0]],
    p3: s0,
    p4: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s6 (
    p0: s2,
    p1: s1
  )
  def f52(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v7
    val v6: Vector[Double] = Vector(v0, v7, v4, v0, v4)
    var v11: Vector[Double] = v6
    val v2: Double = v11(2)
    v7 = v2
    v11 = v6
    v11 = v11.updated(4, v7)
    v11 = v11.updated(1, v2)
    val v17: Double = v11(4)
    v11 = v11.updated(3, v7)
    v17
  }
  def f48(v0: Vector[s0]): Vector[s0] = {
    val v2: s0 = v0(0)
    var v5: Vector[s0] = v0
    val v7: s0 = v0(0)
    v5 = v5.updated(1, v7)
    var v14: Vector[s0] = v0
    val v12: s0 = v14(1)
    v14 = v5
    v5 = v5.updated(1, v2)
    val v61: s1 = s1(v5, v12)
    val v126: Vector[s0] = v61.p0
    v126
  }
  def f42(v0: s0, v1: s1): s1 = {
    val v8: Vector[s1] = Vector(v1, v1, v1, v1)
    var v6: Vector[s1] = v8
    v6 = v6.updated(1, v1)
    val v9: s1 = v6(1)
    v6 = v8
    v6 = v6.updated(3, v1)
    var v18: Vector[s1] = v6
    v18 = v18.updated(1, v1)
    v6 = v8
    v6 = v18
    v6 = v6.updated(0, v1)
    v18 = v18.updated(2, v1)
    v9
  }
  def f40(v0: s1): s1 = {
    var v7: s1 = v0
    var v8: s1 = v7
    val v1: Vector[s0] = v7.p0
    val v2: Vector[s0] = f48(v1)
    val v3: s0 = v1(0)
    val v4: s0 = v2(0)
    v8 = v7
    val v11: Vector[s1] = Vector(v0, v8, v7)
    val v5: s1 = f42(v3, v0)
    val v18: s0 = v0.p1
    var v14: Vector[s1] = v11
    val v17: Vector[s0] = Vector(v4)
    v7 = v7.copy(p1 = v18)
    v8 = v8.copy(p0 = v1)
    val v24: s1 = v14(0)
    v14 = v14.updated(2, v5)
    v8 = v7
    val v49: Vector[s1] = Vector(v24, v5, v5)
    val v27: s1 = v14(0)
    val v35: s0 = v17(0)
    var v43: Vector[s1] = v49
    val v38: s1 = f42(v35, v27)
    v43 = v43.updated(2, v0)
    v43 = v43.updated(2, v38)
    val v90: s1 = v43(1)
    v90
  }
  @noinline
  def f0(v0: s6, v1: s1, v2: Vector[s4], v3: Double): Double = {
    val v4: s1 = f40(v1)
    val v17: Vector[s0] = v4.p0
    val v23: Vector[s0] = f48(v17)
    val v35: Vector[s0] = f48(v23)
    val v26: s0 = v35(1)
    val v43: Vector[Vector[Double]] = v26.p1
    val v51: Vector[Double] = v43(0)
    val v31: Double = v51(0)
    val v41: Double = f52(v31)
    v41
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s2(Vector(s1(Vector(s0(Vector(0.0), Vector(Vector(1.0))), s0(Vector(2.0), Vector(Vector(3.0)))), s0(Vector(4.0), Vector(Vector(5.0)))), s1(Vector(s0(Vector(6.0), Vector(Vector(7.0))), s0(Vector(8.0), Vector(Vector(9.0)))), s0(Vector(10.0), Vector(Vector(11.0))))), Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(s0(Vector(15.0), Vector(Vector(16.0)))), Vector(s0(Vector(17.0), Vector(Vector(18.0)))), Vector(s0(Vector(19.0), Vector(Vector(20.0))))), s0(Vector(21.0), Vector(Vector(22.0))), Vector(Vector(s1(Vector(s0(Vector(23.0), Vector(Vector(24.0))), s0(Vector(25.0), Vector(Vector(26.0)))), s0(Vector(27.0), Vector(Vector(28.0))))))), s1(Vector(s0(Vector(29.0), Vector(Vector(30.0))), s0(Vector(31.0), Vector(Vector(32.0)))), s0(Vector(33.0), Vector(Vector(34.0)))))
    val v1: s1 = s1(Vector(s0(Vector(35.0), Vector(Vector(36.0))), s0(Vector(37.0), Vector(Vector(38.0)))), s0(Vector(39.0), Vector(Vector(40.0))))
    val v2: Vector[s4] = Vector(s4(Vector(Vector(s1(Vector(s0(Vector(41.0), Vector(Vector(42.0))), s0(Vector(43.0), Vector(Vector(44.0)))), s0(Vector(45.0), Vector(Vector(46.0))))), Vector(s1(Vector(s0(Vector(47.0), Vector(Vector(48.0))), s0(Vector(49.0), Vector(Vector(50.0)))), s0(Vector(51.0), Vector(Vector(52.0))))), Vector(s1(Vector(s0(Vector(53.0), Vector(Vector(54.0))), s0(Vector(55.0), Vector(Vector(56.0)))), s0(Vector(57.0), Vector(Vector(58.0)))))), s0(Vector(59.0), Vector(Vector(60.0)))))
    val v3: Double = 61.0
    val start = nanoTime()
    var result: Double = 61.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}