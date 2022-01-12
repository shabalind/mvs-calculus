import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[s1],
    p1: s1
  )
  case class s8 (
    p0: Vector[s0],
    p1: Vector[s4]
  )
  def f32(v0: Double): Double = {
    var v2: Double = v0
    var v1: Double = v2
    var v10: Double = v0
    var v7: Double = v0
    var v5: Double = v1
    val v11: Vector[Double] = Vector(v5, v10, v7)
    var v9: Double = v7
    var v12: Vector[Double] = v11
    var v18: Double = v1
    val v24: Vector[Vector[Double]] = Vector(v11, v12, v11, v11)
    val v32: Vector[Double] = v24(3)
    val v36: Vector[Double] = v24(2)
    val v30: Vector[Double] = v24(2)
    v12 = v12.updated(0, v10)
    var v25: Vector[Vector[Double]] = v24
    var v16: Vector[Double] = v32
    var v27: Vector[Double] = v30
    val v17: Vector[Double] = v25(3)
    var v19: Vector[Double] = v27
    val v48: Vector[Double] = v24(3)
    val v31: Double = v36(2)
    val v54: Vector[Double] = v24(2)
    v12 = v12.updated(2, v31)
    val v141: Double = v36(0)
    var v45: Double = v9
    var v34: Vector[Vector[Double]] = v25
    v25 = v25.updated(0, v17)
    var v33: Vector[Vector[Double]] = v34
    var v50: Vector[Double] = v19
    var v79: Vector[Double] = v54
    v12 = v12.updated(1, v141)
    val v40: Vector[Double] = v33(0)
    v79 = v79.updated(2, v45)
    v19 = v19.updated(2, v141)
    v25 = v25.updated(2, v48)
    v27 = v27.updated(1, v45)
    v34 = v34.updated(1, v79)
    v33 = v33.updated(1, v36)
    val v95: Double = v40(2)
    v79 = v79.updated(2, v18)
    v34 = v34.updated(3, v50)
    v25 = v25.updated(0, v16)
    v95
  }
  def f16(v0: Double): Double = {
    var v1: Double = v0
    var v7: Double = v1
    val v3: Double = f32(v7)
    var v10: Double = v3
    var v9: Double = v10
    val v23: Double = f32(v9)
    var v37: Double = v10
    var v55: Double = v37
    val v102: Double = v23 / v55
    v102
  }
  @noinline
  def f0(v0: s2, v1: Vector[s8], v2: Double): Double = {
    val v7: Double = f32(v2)
    val v9: Double = f32(v7)
    var v14: Double = v9
    val v104: Double = v14 + v2
    val v76: Double = f16(v104)
    v76
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0))), s1(Vector(s0(Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0)))))
    val v1: Vector[s8] = Vector(s8(Vector(s0(Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)))), Vector(s4(Vector(s1(Vector(s0(Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0))))), s1(Vector(s0(Vector(Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0))), s0(Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0))))), s1(Vector(s0(Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0)))), s0(Vector(Vector(52.0), Vector(53.0))))), s1(Vector(s0(Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0))), s0(Vector(Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0))))))), s8(Vector(s0(Vector(Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0)))), Vector(s4(Vector(s1(Vector(s0(Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)))), s0(Vector(Vector(72.0), Vector(73.0))))), s1(Vector(s0(Vector(Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0))), s0(Vector(Vector(78.0), Vector(79.0)))), s0(Vector(Vector(80.0), Vector(81.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0))), s0(Vector(Vector(86.0), Vector(87.0)))), s0(Vector(Vector(88.0), Vector(89.0))))), s1(Vector(s0(Vector(Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0))), s0(Vector(Vector(94.0), Vector(95.0)))), s0(Vector(Vector(96.0), Vector(97.0))))), s4(Vector(s1(Vector(s0(Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0), Vector(103.0)))), s0(Vector(Vector(104.0), Vector(105.0))))), s1(Vector(s0(Vector(Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0)))), s0(Vector(Vector(112.0), Vector(113.0))))))))
    val v2: Double = 114.0
    val start = nanoTime()
    var result: Double = 114.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}