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
  case class s5 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s6 (
    p0: s5,
    p1: Vector[s1]
  )
  def f98(v0: s0): s0 = {
    var v7: s0 = v0
    var v19: s0 = v7
    v7 = v0
    v19
  }
  def f95(v0: s0): s0 = {
    var v5: s0 = v0
    val v7: Vector[s0] = Vector(v0, v5, v5, v0)
    val v2: s0 = v7(0)
    val v6: s0 = v7(2)
    val v8: s0 = f98(v2)
    var v15: Vector[s0] = v7
    val v13: Vector[Vector[Double]] = v2.p1
    val v10: s0 = v7(0)
    val v12: s0 = v7(3)
    val v14: Vector[Vector[Double]] = v2.p1
    val v9: Vector[Vector[Double]] = v6.p1
    v5 = v5.copy(p0 = v13)
    v15 = v15.updated(2, v8)
    v5 = v5.copy(p0 = v9)
    var v25: Vector[s0] = v7
    v25 = v25.updated(3, v6)
    val v34: Vector[Vector[Double]] = v10.p1
    var v21: Vector[Vector[Double]] = v14
    val v30: Vector[Vector[Double]] = v10.p1
    val v11: s0 = v15(3)
    v5 = v5.copy(p1 = v30)
    val v26: s0 = f98(v12)
    v5 = v5.copy(p0 = v21)
    v25 = v25.updated(3, v8)
    v5 = v5.copy(p0 = v14)
    val v37: s0 = f98(v26)
    v5 = v8
    val v29: Vector[Vector[Double]] = v37.p0
    val v55: Vector[Vector[Double]] = v11.p1
    v5 = v5.copy(p1 = v29)
    v5 = v5.copy(p1 = v9)
    v5 = v5.copy(p0 = v30)
    val v60: Vector[Vector[Double]] = v6.p0
    val v50: Vector[Vector[Double]] = v2.p1
    var v44: Vector[Vector[Double]] = v21
    v25 = v25.updated(0, v8)
    v5 = v5.copy(p0 = v44)
    v5 = v5.copy(p0 = v34)
    v5 = v5.copy(p1 = v60)
    v5 = v5.copy(p0 = v50)
    val v135: Vector[Double] = v55(1)
    val v61: s0 = v25(2)
    v44 = v44.updated(0, v135)
    v61
  }
  def f59(v0: s0): s0 = {
    val v1: s0 = f98(v0)
    val v3: s0 = f98(v1)
    val v5: Vector[Vector[Double]] = v1.p1
    val v6: Vector[Vector[Double]] = v1.p0
    val v7: s0 = f95(v1)
    val v2: s0 = f95(v3)
    var v13: s0 = v7
    var v10: s0 = v13
    v13 = v2
    v10 = v10.copy(p0 = v6)
    v10 = v10.copy(p1 = v6)
    v13 = v13.copy(p0 = v5)
    val v18: Vector[Vector[Double]] = v7.p0
    v13 = v13.copy(p0 = v6)
    val v47: s0 = f95(v2)
    v10 = v10.copy(p0 = v18)
    val v88: Vector[Vector[Double]] = v47.p1
    val v48: s0 = f98(v10)
    v13 = v13.copy(p0 = v88)
    v48
  }
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v2: s6 = v0(0)
    val v10: Vector[s1] = v2.p1
    val v26: s1 = v10(2)
    val v20: s0 = v26.p0
    val v18: s0 = f59(v20)
    val v79: Vector[Vector[Double]] = v18.p1
    val v146: Vector[Double] = v79(1)
    var v105: Vector[Double] = v146
    v105 = v105.updated(0, v1)
    val v96: Double = v105(0)
    v96
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s5(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), Vector(s1(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))), s1(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))))), s1(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0)))))))))
    val v1: Double = 102.0
    val start = nanoTime()
    var result: Double = 102.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}