import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f38(v0: Double): Double = {
    var v4: Double = v0
    var v7: Double = v4
    var v8: Double = v4
    val v6: Double = v0 + v8
    var v5: Double = v4
    var v2: Double = v5
    val v3: Vector[Double] = Vector(v4, v2, v7, v4)
    val v1: Double = v3(2)
    val v10: Double = v3(0)
    val v9: Double = v0 / v4
    val v46: Double = v0 - v1
    v5 = v1
    var v11: Vector[Double] = v3
    var v18: Double = v0
    var v12: Double = v7
    val v14: Vector[Vector[Double]] = Vector(v11)
    val v21: Double = v9 - v4
    val v17: Vector[Double] = v14(0)
    var v29: Double = v6
    var v34: Double = v18
    v11 = v11.updated(3, v34)
    val v24: Double = v17(2)
    val v35: Double = v11(3)
    val v45: Vector[Double] = Vector(v24, v4, v29, v35, v10, v46, v4)
    var v31: Vector[Double] = v45
    var v41: Double = v5
    val v57: Double = v9 / v12
    v31 = v31.updated(6, v29)
    var v87: Vector[Double] = v17
    v11 = v11.updated(3, v6)
    val v70: Double = v87(3)
    v11 = v11.updated(3, v41)
    v11 = v11.updated(0, v57)
    val v49: Double = v45(6)
    var v80: Vector[Double] = v31
    v80 = v80.updated(4, v49)
    val v82: Double = v80(0)
    v12 = v70
    v11 = v11.updated(1, v21)
    v82
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Vector[s0], v3: Vector[s1], v4: Vector[Vector[s0]], v5: Vector[s1], v6: Vector[Vector[s1]], v7: Double): Double = {
    val v8: Double = f38(v7)
    val v30: Double = f38(v7)
    val v32: Double = v8 + v7
    val v56: Double = v32 / v30
    val v34: Vector[Double] = Vector(v56, v56)
    val v58: Double = v8 - v30
    val v98: Double = v34(0)
    val v119: Double = v98 + v58
    v119
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))
    val v2: Vector[s0] = Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))
    val v3: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))))
    val v4: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))))
    val v5: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))), s1(Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))))
    val v6: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0))))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))))), Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))))
    val v7: Double = 132.0
    val start = nanoTime()
    var result: Double = 132.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}