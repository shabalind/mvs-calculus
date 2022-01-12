import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: Vector[s0],
    p3: Vector[s0]
  )
  case class s2 (
    p0: s0,
    p1: s1,
    p2: s1,
    p3: s0,
    p4: s0,
    p5: s1,
    p6: Vector[s0],
    p7: s0
  )
  case class s4 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v2: s1 = v0.p1
    val v5: s1 = v0.p1
    var v8: s1 = v5
    val v10: Vector[s1] = Vector(v2)
    val v3: Vector[s1] = Vector(v2, v2, v5, v2, v8)
    val v4: s1 = v3(1)
    var v9: s2 = v0
    var v13: Vector[s1] = v3
    val v14: s1 = v10(0)
    var v17: Vector[s1] = v13
    val v12: Vector[s0] = v4.p3
    val v15: s0 = v9.p7
    v8 = v8.copy(p0 = v15)
    var v11: s1 = v2
    val v16: s0 = v5.p0
    v13 = v13.updated(3, v4)
    v11 = v11.copy(p0 = v16)
    v17 = v17.updated(0, v8)
    val v23: s0 = v12(0)
    v13 = v13.updated(2, v8)
    val v22: s0 = v0.p0
    val v26: s1 = v10(0)
    v13 = v13.updated(0, v11)
    val v50: s0 = v8.p0
    val v28: s1 = v0.p5
    v9 = v9.copy(p1 = v4)
    val v55: s4 = s4(v5, v8)
    val v21: s1 = v55.p1
    v8 = v8.copy(p1 = v50)
    v9 = v9.copy(p2 = v14)
    var v43: s2 = v0
    v11 = v11.copy(p3 = v12)
    v9 = v43
    var v32: s4 = v55
    v8 = v14
    v43 = v43.copy(p1 = v21)
    var v52: s1 = v8
    v52 = v52.copy(p1 = v22)
    v8 = v8.copy(p0 = v23)
    v32 = v32.copy(p1 = v11)
    v52 = v52.copy(p1 = v15)
    val v61: s1 = v32.p1
    v43 = v43.copy(p1 = v52)
    val v86: Vector[s0] = v28.p2
    v8 = v5
    v52 = v52.copy(p2 = v86)
    val v44: s0 = v9.p3
    v32 = v32.copy(p1 = v2)
    v9 = v9.copy(p1 = v61)
    var v80: s0 = v44
    val v137: Vector[Double] = v80.p0
    v32 = v32.copy(p1 = v26)
    v32 = v32.copy(p0 = v52)
    val v119: s1 = v17(3)
    var v97: s1 = v119
    val v114: Double = v137(0)
    v32 = v32.copy(p0 = v97)
    v17 = v13
    v114
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(0.0), Vector(Vector(1.0), Vector(2.0))), s1(s0(Vector(3.0), Vector(Vector(4.0), Vector(5.0))), s0(Vector(6.0), Vector(Vector(7.0), Vector(8.0))), Vector(s0(Vector(9.0), Vector(Vector(10.0), Vector(11.0))), s0(Vector(12.0), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(15.0), Vector(Vector(16.0), Vector(17.0))))), s1(s0(Vector(18.0), Vector(Vector(19.0), Vector(20.0))), s0(Vector(21.0), Vector(Vector(22.0), Vector(23.0))), Vector(s0(Vector(24.0), Vector(Vector(25.0), Vector(26.0))), s0(Vector(27.0), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(30.0), Vector(Vector(31.0), Vector(32.0))))), s0(Vector(33.0), Vector(Vector(34.0), Vector(35.0))), s0(Vector(36.0), Vector(Vector(37.0), Vector(38.0))), s1(s0(Vector(39.0), Vector(Vector(40.0), Vector(41.0))), s0(Vector(42.0), Vector(Vector(43.0), Vector(44.0))), Vector(s0(Vector(45.0), Vector(Vector(46.0), Vector(47.0))), s0(Vector(48.0), Vector(Vector(49.0), Vector(50.0)))), Vector(s0(Vector(51.0), Vector(Vector(52.0), Vector(53.0))))), Vector(s0(Vector(54.0), Vector(Vector(55.0), Vector(56.0))), s0(Vector(57.0), Vector(Vector(58.0), Vector(59.0)))), s0(Vector(60.0), Vector(Vector(61.0), Vector(62.0))))
    val v1: Double = 63.0
    val start = nanoTime()
    var result: Double = 63.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}