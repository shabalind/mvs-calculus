import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Double,
    p1: Vector[Vector[s2]]
  )
  def f4(v0: s4): s4 = {
    val v1: Vector[s4] = Vector(v0, v0, v0, v0, v0)
    val v3: s4 = v1(0)
    var v2: s4 = v3
    val v6: s4 = v1(0)
    val v4: Vector[Vector[s2]] = v3.p1
    v2 = v2.copy(p1 = v4)
    v2 = v2.copy(p1 = v4)
    var v17: s4 = v6
    val v21: Vector[Vector[s2]] = v2.p1
    val v30: Vector[Vector[s2]] = v2.p1
    v17 = v17.copy(p1 = v30)
    v2 = v2.copy(p1 = v21)
    v17
  }
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: s4, v2: Double): Double = {
    val v3: s4 = f4(v1)
    val v7: Vector[s4] = v0(0)
    var v8: Vector[s4] = v7
    val v11: Vector[s4] = v0(0)
    var v6: s4 = v3
    v8 = v8.updated(0, v6)
    val v9: s4 = v8(0)
    val v12: s4 = f4(v6)
    val v4: s4 = f4(v9)
    val v10: s4 = f4(v12)
    val v17: s4 = v11(0)
    val v18: s4 = f4(v10)
    val v5: Vector[Vector[s2]] = v4.p1
    val v21: s4 = f4(v6)
    var v20: Vector[Vector[s2]] = v5
    v8 = v8.updated(0, v21)
    val v61: Vector[Vector[s2]] = v17.p1
    v6 = v6.copy(p1 = v61)
    v6 = v6.copy(p1 = v61)
    v6 = v6.copy(p1 = v20)
    v6 = v6.copy(p1 = v61)
    val v40: Vector[Vector[s2]] = v4.p1
    val v62: Vector[Vector[s2]] = v18.p1
    val v90: Double = v4.p0
    v20 = v40
    v6 = v6.copy(p1 = v62)
    v90
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(0.0, Vector(Vector(s2(s1(Vector(Vector(s0(1.0, Vector(Vector(2.0)))), Vector(s0(3.0, Vector(Vector(4.0)))), Vector(s0(5.0, Vector(Vector(6.0))))), s0(7.0, Vector(Vector(8.0)))), Vector(Vector(s1(Vector(Vector(s0(9.0, Vector(Vector(10.0)))), Vector(s0(11.0, Vector(Vector(12.0)))), Vector(s0(13.0, Vector(Vector(14.0))))), s0(15.0, Vector(Vector(16.0)))))))), Vector(s2(s1(Vector(Vector(s0(17.0, Vector(Vector(18.0)))), Vector(s0(19.0, Vector(Vector(20.0)))), Vector(s0(21.0, Vector(Vector(22.0))))), s0(23.0, Vector(Vector(24.0)))), Vector(Vector(s1(Vector(Vector(s0(25.0, Vector(Vector(26.0)))), Vector(s0(27.0, Vector(Vector(28.0)))), Vector(s0(29.0, Vector(Vector(30.0))))), s0(31.0, Vector(Vector(32.0)))))))), Vector(s2(s1(Vector(Vector(s0(33.0, Vector(Vector(34.0)))), Vector(s0(35.0, Vector(Vector(36.0)))), Vector(s0(37.0, Vector(Vector(38.0))))), s0(39.0, Vector(Vector(40.0)))), Vector(Vector(s1(Vector(Vector(s0(41.0, Vector(Vector(42.0)))), Vector(s0(43.0, Vector(Vector(44.0)))), Vector(s0(45.0, Vector(Vector(46.0))))), s0(47.0, Vector(Vector(48.0))))))))))))
    val v1: s4 = s4(49.0, Vector(Vector(s2(s1(Vector(Vector(s0(50.0, Vector(Vector(51.0)))), Vector(s0(52.0, Vector(Vector(53.0)))), Vector(s0(54.0, Vector(Vector(55.0))))), s0(56.0, Vector(Vector(57.0)))), Vector(Vector(s1(Vector(Vector(s0(58.0, Vector(Vector(59.0)))), Vector(s0(60.0, Vector(Vector(61.0)))), Vector(s0(62.0, Vector(Vector(63.0))))), s0(64.0, Vector(Vector(65.0)))))))), Vector(s2(s1(Vector(Vector(s0(66.0, Vector(Vector(67.0)))), Vector(s0(68.0, Vector(Vector(69.0)))), Vector(s0(70.0, Vector(Vector(71.0))))), s0(72.0, Vector(Vector(73.0)))), Vector(Vector(s1(Vector(Vector(s0(74.0, Vector(Vector(75.0)))), Vector(s0(76.0, Vector(Vector(77.0)))), Vector(s0(78.0, Vector(Vector(79.0))))), s0(80.0, Vector(Vector(81.0)))))))), Vector(s2(s1(Vector(Vector(s0(82.0, Vector(Vector(83.0)))), Vector(s0(84.0, Vector(Vector(85.0)))), Vector(s0(86.0, Vector(Vector(87.0))))), s0(88.0, Vector(Vector(89.0)))), Vector(Vector(s1(Vector(Vector(s0(90.0, Vector(Vector(91.0)))), Vector(s0(92.0, Vector(Vector(93.0)))), Vector(s0(94.0, Vector(Vector(95.0))))), s0(96.0, Vector(Vector(97.0))))))))))
    val v2: Double = 98.0
    val start = nanoTime()
    var result: Double = 98.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}