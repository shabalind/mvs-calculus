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
    p0: Vector[s0],
    p1: s1
  )
  case class s4 (
    p0: s2,
    p1: Vector[s0],
    p2: s2,
    p3: Vector[s1]
  )
  def f89(v0: s0): s0 = {
    val v3: Vector[Vector[Double]] = v0.p0
    val v4: Vector[s0] = Vector(v0, v0, v0, v0)
    val v1: Vector[Vector[Double]] = v0.p0
    var v5: s0 = v0
    v5 = v5.copy(p0 = v3)
    val v2: Vector[Double] = v1(0)
    var v8: Vector[s0] = v4
    v5 = v5.copy(p0 = v3)
    val v13: Vector[Vector[Double]] = v5.p1
    val v10: Vector[Vector[Vector[Double]]] = Vector(v3, v3, v1, v1, v1)
    val v9: Vector[Vector[Double]] = v0.p1
    val v19: Vector[Vector[Double]] = v10(3)
    v5 = v5.copy(p1 = v13)
    v5 = v5.copy(p0 = v1)
    var v21: Vector[Vector[Double]] = v19
    v5 = v5.copy(p0 = v19)
    val v31: Vector[Vector[Double]] = v5.p1
    val v15: Vector[Vector[Double]] = v5.p1
    var v28: Vector[Vector[Double]] = v31
    val v16: Vector[Vector[Double]] = v5.p0
    val v39: Vector[Vector[Double]] = v0.p0
    v5 = v5.copy(p0 = v39)
    val v50: Vector[Vector[Double]] = v0.p1
    val v29: s0 = v8(3)
    val v27: Vector[Vector[Vector[Double]]] = Vector(v28, v50, v28, v9, v28, v28)
    val v20: Vector[Double] = v9(0)
    v5 = v5.copy(p0 = v21)
    var v44: Vector[Vector[Double]] = v50
    val v17: Vector[Vector[Double]] = v29.p1
    var v49: s0 = v0
    val v71: s0 = v4(0)
    var v83: s0 = v49
    val v37: Vector[Vector[Double]] = v27(1)
    v21 = v21.updated(0, v2)
    val v72: Vector[Vector[Double]] = v5.p0
    val v38: Vector[Double] = v16(0)
    val v74: Vector[Vector[Double]] = v49.p1
    var v119: s0 = v83
    v83 = v83.copy(p0 = v19)
    v83 = v83.copy(p0 = v16)
    v119 = v119.copy(p1 = v15)
    v83 = v83.copy(p0 = v72)
    v119 = v119.copy(p1 = v17)
    v83 = v83.copy(p1 = v31)
    var v56: Vector[Double] = v20
    v49 = v49.copy(p1 = v31)
    v49 = v49.copy(p1 = v74)
    v21 = v21.updated(0, v38)
    v28 = v28.updated(0, v56)
    var v58: s0 = v119
    v119 = v119.copy(p1 = v37)
    v83 = v83.copy(p1 = v31)
    v28 = v28.updated(0, v56)
    v119 = v119.copy(p0 = v19)
    v49 = v49.copy(p1 = v44)
    v49 = v71
    v8 = v8.updated(3, v71)
    v58
  }
  def f12(v0: s0): s0 = {
    var v6: s0 = v0
    val v4: s0 = f89(v6)
    val v10: s0 = f89(v4)
    var v12: s0 = v10
    v12
  }
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s4]], v2: Vector[s1], v3: Double): Double = {
    var v8: s0 = v0
    v8 = v0
    val v11: Vector[Vector[Double]] = v8.p1
    val v12: Vector[Double] = v11(0)
    v8 = v8.copy(p1 = v11)
    val v19: Vector[Vector[Double]] = v8.p0
    val v20: s0 = f12(v8)
    var v16: s0 = v20
    v8 = v8.copy(p0 = v19)
    val v29: Vector[Vector[Double]] = v20.p0
    v16 = v16.copy(p1 = v11)
    val v51: Double = v12(0)
    val v50: s0 = f89(v16)
    val v95: Double = v51 - v3
    val v99: Vector[Vector[Double]] = v50.p1
    var v192: Double = v95
    v16 = v16.copy(p0 = v29)
    v8 = v8.copy(p1 = v99)
    v16 = v16.copy(p1 = v99)
    v192
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))
    val v1: Vector[Vector[s4]] = Vector(Vector(s4(s2(Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s1(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s2(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), s1(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), Vector(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))), Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))))), Vector(s1(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))))))), Vector(s4(s2(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), Vector(Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), Vector(s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s2(Vector(s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))), s1(s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), Vector(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)))), Vector(s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0))))))), Vector(s1(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0))), Vector(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))), Vector(s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))), Vector(s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))))))
    val v2: Vector[s1] = Vector(s1(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0))), Vector(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)))), Vector(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0)))), Vector(s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))))))
    val v3: Double = 117.0
    val start = nanoTime()
    var result: Double = 117.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}