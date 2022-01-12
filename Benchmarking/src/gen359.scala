import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s2]
  )
  def f70(v0: s0, v1: s0): s0 = {
    val v5: Vector[Vector[Double]] = v1.p1
    val v7: Vector[Vector[Double]] = v0.p0
    val v2: Vector[Double] = v7(0)
    var v6: s0 = v0
    val v13: Vector[Vector[Double]] = v1.p0
    v6 = v6.copy(p0 = v13)
    val v8: Vector[Double] = v5(1)
    var v19: Vector[Vector[Double]] = v13
    val v15: Vector[Vector[Double]] = v6.p1
    var v47: s0 = v0
    val v22: Vector[Vector[Double]] = v1.p1
    v47 = v47.copy(p0 = v19)
    var v18: s0 = v47
    v19 = v19.updated(0, v8)
    v47 = v47.copy(p1 = v15)
    v19 = v19.updated(0, v2)
    var v24: s0 = v18
    v47 = v47.copy(p1 = v15)
    v18 = v18.copy(p1 = v22)
    v24
  }
  def f36(v0: Double): Double = {
    var v1: Double = v0
    var v5: Double = v0
    val v3: Vector[Double] = Vector(v5, v0, v0, v5, v1)
    val v8: Double = v3(2)
    var v7: Vector[Double] = v3
    val v6: Vector[Double] = Vector(v1, v5, v0, v8, v5)
    v7 = v7.updated(1, v8)
    val v4: Double = v7(4)
    val v2: Double = v3(0)
    v5 = v8
    val v15: Double = v3(4)
    val v11: Vector[Vector[Double]] = Vector(v6, v7, v6, v6, v6, v3, v7)
    val v13: Vector[Double] = Vector(v15, v2, v4, v2, v2, v1)
    var v23: Vector[Vector[Double]] = v11
    val v16: Double = v13(3)
    v7 = v7.updated(4, v8)
    v23 = v23.updated(0, v3)
    v5 = v0
    val v33: Vector[Double] = v23(6)
    val v14: Double = v13(1)
    v1 = v2
    v23 = v23.updated(5, v33)
    val v24: Double = v33(4)
    val v31: Vector[Double] = v23(4)
    val v45: Double = v7(0)
    var v35: Double = v5
    var v48: Vector[Double] = v13
    v48 = v48.updated(5, v24)
    var v71: Vector[Double] = v48
    val v72: Double = v71(5)
    v7 = v7.updated(2, v35)
    var v41: Double = v4
    val v62: Double = v71(2)
    v7 = v7.updated(2, v14)
    v7 = v7.updated(1, v24)
    val v108: Vector[Double] = Vector(v41, v24, v45, v72)
    var v74: Vector[Double] = v108
    v23 = v23.updated(1, v31)
    v74 = v74.updated(1, v16)
    var v192: Vector[Double] = v74
    val v181: Double = v192(1)
    v35 = v62
    v181
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s1], v2: s3, v3: Double): Double = {
    val v6: s1 = v1(2)
    var v10: Double = v3
    val v15: s0 = v6.p0
    val v13: s0 = f70(v15, v15)
    val v39: Vector[Vector[Double]] = v13.p1
    val v16: Double = f36(v10)
    val v58: Vector[Double] = v39(0)
    val v45: Double = v58(0)
    v10 = v3
    val v109: Double = v10 + v16
    val v44: Double = v109 - v45
    v44
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))))))
    val v2: s3 = s3(s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), Vector(s2(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), s2(s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))), s2(s1(s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))), Vector(s0(Vector(Vector(124.0)), Vector(Vector(125.0), Vector(126.0), Vector(127.0))), s0(Vector(Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))), s0(Vector(Vector(132.0)), Vector(Vector(133.0), Vector(134.0), Vector(135.0))))), Vector(s0(Vector(Vector(136.0)), Vector(Vector(137.0), Vector(138.0), Vector(139.0))), s0(Vector(Vector(140.0)), Vector(Vector(141.0), Vector(142.0), Vector(143.0)))))))
    val v3: Double = 144.0
    val start = nanoTime()
    var result: Double = 144.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}