import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s2]
  )
  case class s5 (
    p0: s3,
    p1: Vector[s0]
  )
  def f14(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v7
    var v4: Double = v7
    var v5: Double = v0
    v5 = v4
    v4 = v6
    var v11: Double = v5
    var v3: Double = v11
    v4 = v7
    var v9: Double = v7
    var v15: Double = v9
    val v16: Double = v6 * v15
    var v1: Double = v11
    v9 = v3
    val v31: Vector[Double] = Vector(v1)
    v11 = v16
    var v58: Vector[Double] = v31
    v58 = v58.updated(0, v15)
    val v36: Double = v58(0)
    val v42: Double = v58(0)
    v58 = v58.updated(0, v3)
    v58 = v58.updated(0, v36)
    v58 = v58.updated(0, v7)
    v58 = v58.updated(0, v9)
    var v38: Vector[Double] = v58
    var v81: Double = v42
    val v69: Vector[Vector[Double]] = Vector(v38)
    var v79: Vector[Vector[Double]] = v69
    v38 = v38.updated(0, v81)
    var v138: Vector[Vector[Double]] = v79
    val v68: Vector[Double] = v79(0)
    v38 = v38.updated(0, v36)
    v138 = v138.updated(0, v68)
    val v108: Vector[Double] = v138(0)
    val v176: Double = v108(0)
    v176
  }
  @noinline
  def f0(v0: Vector[s5], v1: Vector[s0], v2: Vector[s2], v3: Double): Double = {
    val v5: Double = f14(v3)
    var v13: Vector[s2] = v2
    val v16: s2 = v13(0)
    v13 = v13.updated(1, v16)
    val v17: s0 = v16.p1
    val v10: s0 = v16.p1
    val v14: s2 = s2(v17, v17)
    v13 = v13.updated(0, v14)
    val v26: Vector[Vector[Double]] = v10.p0
    val v19: Vector[Double] = v26(1)
    v13 = v13.updated(0, v16)
    val v31: Double = v19(0)
    val v49: Double = v5 + v31
    v49
  }
  def benchmark(): Unit = {
    val v0: Vector[s5] = Vector(s5(s3(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), Vector(s2(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))))), s5(s3(Vector(s2(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), Vector(s2(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))), s5(s3(Vector(s2(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))), Vector(s2(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))))), Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0))), s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0))))
    val v2: Vector[s2] = Vector(s2(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0)))), s2(s0(Vector(Vector(125.0), Vector(126.0), Vector(127.0)), Vector(Vector(128.0), Vector(129.0))), s0(Vector(Vector(130.0), Vector(131.0), Vector(132.0)), Vector(Vector(133.0), Vector(134.0)))))
    val v3: Double = 135.0
    val start = nanoTime()
    var result: Double = 135.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}