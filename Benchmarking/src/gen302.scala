import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double,
    p2: Vector[Vector[Double]],
    p3: Double
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s5 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s8 (
    p0: Vector[Vector[Double]],
    p1: s1,
    p2: s0
  )
  case class s11 (
    p0: Vector[s8],
    p1: Vector[s5]
  )
  def f15(v0: s0): s0 = {
    val v3: Double = v0.p1
    var v8: s0 = v0
    var v6: s0 = v0
    var v1: Double = v3
    v8 = v8.copy(p1 = v3)
    val v9: Double = v8.p1
    val v5: Vector[Vector[Double]] = v8.p2
    var v2: Vector[Vector[Double]] = v5
    val v14: Vector[Vector[Double]] = v8.p0
    val v11: Vector[Double] = v2(1)
    val v25: Vector[Vector[Double]] = v6.p2
    v6 = v6.copy(p3 = v9)
    val v10: Vector[Vector[Double]] = v6.p2
    v2 = v2.updated(0, v11)
    val v26: Vector[Double] = v25(0)
    val v18: Double = v26(0)
    val v19: Vector[Vector[Double]] = v0.p0
    val v22: Double = v11(0)
    val v24: Vector[Double] = v19(1)
    v2 = v2.updated(1, v24)
    v8 = v8.copy(p0 = v14)
    v6 = v6.copy(p0 = v2)
    var v30: s0 = v0
    val v45: Vector[Vector[Double]] = v6.p2
    val v49: Double = v30.p1
    v8 = v8.copy(p0 = v45)
    v6 = v6.copy(p0 = v10)
    v30 = v30.copy(p2 = v19)
    v30 = v30.copy(p1 = v49)
    val v73: Vector[s0] = Vector(v0, v0, v30, v8, v0, v6, v0)
    val v40: s0 = v73(4)
    v6 = v6.copy(p3 = v1)
    val v78: Double = v6.p3
    val v62: Vector[Vector[Double]] = v40.p0
    v30 = v30.copy(p1 = v22)
    v6 = v6.copy(p3 = v18)
    var v74: Vector[s0] = v73
    v6 = v6.copy(p2 = v62)
    val v90: s0 = v74(3)
    v6 = v6.copy(p3 = v78)
    v30 = v30.copy(p0 = v62)
    v90
  }
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    val v2: Vector[s8] = v0.p0
    val v9: s8 = v2(1)
    var v8: Double = v1
    val v6: Vector[Double] = Vector(v1, v8, v8, v1, v1, v1)
    var v10: Vector[Double] = v6
    val v12: s0 = v9.p2
    var v15: Double = v1
    v10 = v10.updated(1, v15)
    v10 = v10.updated(1, v15)
    var v18: Vector[Double] = v10
    var v39: Double = v15
    val v73: s0 = f15(v12)
    v10 = v10.updated(2, v39)
    val v70: Double = v18(5)
    val v47: Double = v73.p1
    v8 = v1
    v10 = v10.updated(1, v47)
    v70
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(Vector(s8(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), s1(Vector(s0(Vector(Vector(3.0), Vector(4.0)), 5.0, Vector(Vector(6.0), Vector(7.0)), 8.0), s0(Vector(Vector(9.0), Vector(10.0)), 11.0, Vector(Vector(12.0), Vector(13.0)), 14.0)), Vector(s0(Vector(Vector(15.0), Vector(16.0)), 17.0, Vector(Vector(18.0), Vector(19.0)), 20.0))), s0(Vector(Vector(21.0), Vector(22.0)), 23.0, Vector(Vector(24.0), Vector(25.0)), 26.0)), s8(Vector(Vector(27.0), Vector(28.0), Vector(29.0)), s1(Vector(s0(Vector(Vector(30.0), Vector(31.0)), 32.0, Vector(Vector(33.0), Vector(34.0)), 35.0), s0(Vector(Vector(36.0), Vector(37.0)), 38.0, Vector(Vector(39.0), Vector(40.0)), 41.0)), Vector(s0(Vector(Vector(42.0), Vector(43.0)), 44.0, Vector(Vector(45.0), Vector(46.0)), 47.0))), s0(Vector(Vector(48.0), Vector(49.0)), 50.0, Vector(Vector(51.0), Vector(52.0)), 53.0))), Vector(s5(s0(Vector(Vector(54.0), Vector(55.0)), 56.0, Vector(Vector(57.0), Vector(58.0)), 59.0), Vector(s0(Vector(Vector(60.0), Vector(61.0)), 62.0, Vector(Vector(63.0), Vector(64.0)), 65.0), s0(Vector(Vector(66.0), Vector(67.0)), 68.0, Vector(Vector(69.0), Vector(70.0)), 71.0), s0(Vector(Vector(72.0), Vector(73.0)), 74.0, Vector(Vector(75.0), Vector(76.0)), 77.0))), s5(s0(Vector(Vector(78.0), Vector(79.0)), 80.0, Vector(Vector(81.0), Vector(82.0)), 83.0), Vector(s0(Vector(Vector(84.0), Vector(85.0)), 86.0, Vector(Vector(87.0), Vector(88.0)), 89.0), s0(Vector(Vector(90.0), Vector(91.0)), 92.0, Vector(Vector(93.0), Vector(94.0)), 95.0), s0(Vector(Vector(96.0), Vector(97.0)), 98.0, Vector(Vector(99.0), Vector(100.0)), 101.0)))))
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