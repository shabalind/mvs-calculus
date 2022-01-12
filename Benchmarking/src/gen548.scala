import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s5 (
    p0: Vector[Vector[Double]],
    p1: s1
  )
  case class s8 (
    p0: s5,
    p1: Vector[Vector[s4]]
  )
  def f101(v0: Double): Double = {
    var v3: Double = v0
    var v2: Double = v0
    var v6: Double = v3
    val v4: Double = v3 + v6
    var v1: Double = v6
    var v9: Double = v3
    val v8: Vector[Double] = Vector(v0, v9, v3, v2, v1, v6, v4)
    val v17: Double = v8(1)
    var v12: Double = v1
    val v34: Double = v8(4)
    val v20: Vector[Double] = Vector(v17, v17, v12, v34)
    val v41: Vector[Vector[Double]] = Vector(v20)
    val v48: Vector[Double] = v41(0)
    val v39: Double = v48(2)
    v39
  }
  def f88(v0: Double): Double = {
    val v4: Double = f101(v0)
    var v3: Double = v4
    val v2: Vector[Double] = Vector(v0)
    val v1: Double = v2(0)
    var v5: Vector[Double] = v2
    var v10: Vector[Double] = v2
    v10 = v10.updated(0, v0)
    val v9: Double = f101(v0)
    v5 = v5.updated(0, v0)
    val v15: Double = v5(0)
    val v13: Double = v10(0)
    var v21: Vector[Double] = v2
    var v19: Double = v3
    v21 = v10
    v10 = v10.updated(0, v19)
    val v34: Double = f101(v1)
    val v38: Double = v34 * v15
    val v24: Double = v21(0)
    v21 = v21.updated(0, v13)
    v10 = v10.updated(0, v9)
    v21 = v21.updated(0, v38)
    v24
  }
  @noinline
  def f0(v0: Vector[s8], v1: Double): Double = {
    val v16: Double = v1 / v1
    val v68: Double = v16 - v1
    val v121: Double = f88(v16)
    val v105: Double = v68 * v121
    v105
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(s5(Vector(Vector(0.0)), s1(Vector(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)))), s0(Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))))), Vector(Vector(s4(s1(Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)))), s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)))), Vector(s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))))), Vector(s4(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0))), s0(Vector(Vector(41.0), Vector(42.0), Vector(43.0)), Vector(Vector(44.0), Vector(45.0)))), s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))))), Vector(s4(s1(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0))), s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0)))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0)))), Vector(s0(Vector(Vector(71.0), Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0)))))))), s8(s5(Vector(Vector(76.0)), s1(Vector(s0(Vector(Vector(77.0), Vector(78.0), Vector(79.0)), Vector(Vector(80.0), Vector(81.0))), s0(Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0)))), s0(Vector(Vector(87.0), Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))))), Vector(Vector(s4(s1(Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0)))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0)))), Vector(s0(Vector(Vector(107.0), Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0)))))), Vector(s4(s1(Vector(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0))), s0(Vector(Vector(117.0), Vector(118.0), Vector(119.0)), Vector(Vector(120.0), Vector(121.0)))), s0(Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)))), Vector(s0(Vector(Vector(127.0), Vector(128.0), Vector(129.0)), Vector(Vector(130.0), Vector(131.0)))))), Vector(s4(s1(Vector(s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0))), s0(Vector(Vector(137.0), Vector(138.0), Vector(139.0)), Vector(Vector(140.0), Vector(141.0)))), s0(Vector(Vector(142.0), Vector(143.0), Vector(144.0)), Vector(Vector(145.0), Vector(146.0)))), Vector(s0(Vector(Vector(147.0), Vector(148.0), Vector(149.0)), Vector(Vector(150.0), Vector(151.0)))))))))
    val v1: Double = 152.0
    val start = nanoTime()
    var result: Double = 152.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}