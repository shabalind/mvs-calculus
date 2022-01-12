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
    p0: Vector[s0],
    p1: s1
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s4 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s5 (
    p0: Vector[Double],
    p1: Vector[s2]
  )
  case class s6 (
    p0: Vector[Vector[s2]],
    p1: s3
  )
  case class s7 (
    p0: s0,
    p1: s6
  )
  def f24(v0: s6): s6 = {
    val v1: Vector[Vector[s2]] = v0.p0
    var v5: s6 = v0
    v5 = v5.copy(p0 = v1)
    v5 = v0
    var v9: Vector[Vector[s2]] = v1
    val v7: Vector[Vector[Vector[s2]]] = Vector(v9, v1)
    v5 = v5.copy(p0 = v9)
    v5 = v5.copy(p0 = v9)
    val v16: Vector[Vector[s2]] = v7(0)
    var v23: s6 = v0
    val v21: s3 = v23.p1
    v23 = v23.copy(p0 = v16)
    v5 = v5.copy(p1 = v21)
    v5
  }
  def f17(v0: s6): s6 = {
    val v3: s6 = f24(v0)
    val v1: Vector[Vector[s2]] = v3.p0
    val v5: Vector[Vector[s2]] = v0.p0
    val v7: Vector[s2] = v5(1)
    var v2: Vector[Vector[s2]] = v5
    var v4: Vector[Vector[s2]] = v1
    val v8: Vector[s2] = v4(0)
    v2 = v2.updated(1, v8)
    val v22: s6 = f24(v3)
    val v21: s2 = v8(0)
    v4 = v4.updated(0, v7)
    val v17: Vector[Vector[s2]] = v3.p0
    v2 = v2.updated(1, v7)
    v4 = v4.updated(1, v8)
    val v13: Vector[Vector[s2]] = v0.p0
    val v12: Vector[s2] = Vector(v21)
    val v16: Vector[s2] = v4(0)
    var v55: Vector[Vector[s2]] = v2
    v55 = v55.updated(1, v8)
    v55 = v55.updated(0, v16)
    var v65: s6 = v22
    val v33: Vector[s2] = v17(0)
    v4 = v4.updated(0, v33)
    v2 = v2.updated(0, v8)
    v65 = v65.copy(p0 = v55)
    v55 = v55.updated(0, v33)
    v4 = v4.updated(0, v12)
    v65 = v65.copy(p0 = v13)
    v65
  }
  def f12(v0: s7, v1: Double): Double = {
    val v3: s0 = v0.p0
    val v17: Vector[Vector[Double]] = v3.p1
    val v28: Vector[Double] = v17(0)
    val v37: Double = v28(0)
    var v206: Double = v37
    v206
  }
  def f8(v0: s7): s7 = {
    var v7: s7 = v0
    var v6: s7 = v7
    val v3: s6 = v0.p1
    val v1: s6 = v6.p1
    var v14: s7 = v7
    val v16: s6 = f17(v1)
    v7 = v7.copy(p1 = v16)
    v6 = v14
    var v78: s7 = v7
    v78 = v78.copy(p1 = v3)
    v78
  }
  def f7(v0: s7, v1: s5): s7 = {
    val v95: s7 = f8(v0)
    v95
  }
  @noinline
  def f0(v0: s7, v1: s1, v2: Vector[s5], v3: s4, v4: Double): Double = {
    val v7: s5 = v2(0)
    val v9: s7 = f7(v0, v7)
    var v13: Double = v4
    val v43: Double = f12(v9, v4)
    val v21: Double = v13 * v43
    var v32: Double = v21
    val v54: Double = f12(v0, v32)
    v54
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s6(Vector(Vector(s2(Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))), Vector(s2(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))))), s3(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))))))
    val v1: s1 = s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))))
    val v2: Vector[s5] = Vector(s5(Vector(42.0), Vector(s2(Vector(s0(Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0)))), s1(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0))))))), s5(Vector(52.0), Vector(s2(Vector(s0(Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0)))), s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0))), s0(Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0))))))), s5(Vector(62.0), Vector(s2(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))), s1(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))))
    val v3: s4 = s4(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), Vector(s1(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)))), s1(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), s1(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0))))))
    val v4: Double = 93.0
    val start = nanoTime()
    var result: Double = 93.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}