import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s5 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  case class s7 (
    p0: Vector[Vector[s2]],
    p1: s5
  )
  def f9(v0: s2): s2 = {
    val v6: s0 = v0.p1
    var v1: s2 = v0
    var v8: s0 = v6
    var v2: s2 = v1
    v1 = v1.copy(p1 = v8)
    val v4: Vector[Vector[Double]] = v6.p0
    v2 = v0
    var v3: s2 = v0
    var v5: s0 = v6
    v3 = v3.copy(p1 = v5)
    val v13: Vector[Vector[Vector[Double]]] = Vector(v4, v4, v4)
    v2 = v1
    val v12: Vector[Vector[Double]] = v13(2)
    val v10: s0 = v3.p1
    val v7: Vector[Double] = v12(1)
    val v11: Vector[Double] = v12(0)
    val v9: Vector[Vector[Double]] = v10.p0
    var v21: s0 = v8
    var v15: Vector[Vector[Vector[Double]]] = v13
    v15 = v15.updated(1, v9)
    val v25: Vector[Vector[Double]] = v15(2)
    v2 = v2.copy(p1 = v6)
    v15 = v15.updated(2, v12)
    v15 = v15.updated(1, v12)
    var v46: Vector[Vector[Double]] = v25
    var v35: Vector[Vector[Double]] = v46
    var v39: Vector[Double] = v7
    v46 = v46.updated(0, v39)
    v21 = v21.copy(p0 = v4)
    v15 = v15.updated(0, v35)
    v39 = v11
    v8 = v8.copy(p1 = v35)
    v2 = v2.copy(p1 = v10)
    v2 = v2.copy(p1 = v21)
    v2
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v9: s7 = v0(0)
    val v2: s7 = v0(1)
    val v4: s5 = v9.p1
    var v13: s5 = v4
    val v10: Vector[Vector[s2]] = v9.p0
    v13 = v4
    val v12: s2 = v13.p0
    val v7: Vector[s2] = v10(0)
    v13 = v13.copy(p0 = v12)
    val v20: s2 = v13.p0
    val v17: s0 = v20.p1
    val v25: s2 = v7(0)
    v13 = v13.copy(p0 = v25)
    val v32: s5 = v2.p1
    val v24: Vector[Vector[Double]] = v17.p0
    val v31: s2 = f9(v12)
    v13 = v13.copy(p0 = v20)
    v13 = v13.copy(p0 = v25)
    v13 = v13.copy(p0 = v12)
    v13 = v13.copy(p0 = v25)
    v13 = v4
    val v38: Vector[Double] = v24(0)
    val v23: s2 = v32.p0
    v13 = v13.copy(p0 = v31)
    v13 = v13.copy(p0 = v23)
    var v82: Vector[Double] = v38
    val v78: Vector[Vector[s1]] = v4.p1
    v13 = v13.copy(p1 = v78)
    v13 = v13.copy(p0 = v12)
    val v210: Double = v82(0)
    v210
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), Vector(Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))), s5(s2(Vector(s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), Vector(Vector(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(Vector(s1(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))))))), Vector(s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))))))))), s7(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), Vector(Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))))), s5(s2(Vector(s1(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), Vector(Vector(s1(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))), Vector(s1(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))), Vector(Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0)))))))))), s7(Vector(Vector(s2(Vector(s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))))))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)))))), s5(s2(Vector(s1(s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))))), s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0)))), Vector(Vector(s1(s0(Vector(Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0))))))), Vector(s1(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0), Vector(115.0))), Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0)))))))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}