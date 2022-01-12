import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: s0,
    p1: s1
  )
  case class s5 (
    p0: Vector[s3],
    p1: s1,
    p2: Vector[Vector[s0]]
  )
  case class s6 (
    p0: Vector[Vector[s0]],
    p1: Vector[s4],
    p2: s0
  )
  case class s10 (
    p0: s5,
    p1: s6
  )
  def f6(v0: s2): s2 = {
    var v6: s2 = v0
    var v3: s2 = v0
    var v1: s2 = v6
    val v5: Vector[Vector[s0]] = v3.p1
    v1 = v1.copy(p1 = v5)
    v1 = v0
    val v4: Vector[Vector[Double]] = v1.p0
    var v10: Vector[Vector[Double]] = v4
    val v38: Vector[Double] = v4(1)
    v10 = v10.updated(0, v38)
    var v11: s2 = v0
    val v24: Vector[Vector[s0]] = v0.p1
    val v15: Vector[Vector[s0]] = v3.p1
    var v14: Vector[Vector[Double]] = v4
    v11 = v11.copy(p0 = v14)
    v14 = v14.updated(1, v38)
    val v20: Vector[Vector[Double]] = v11.p0
    v6 = v6.copy(p0 = v20)
    v1 = v1.copy(p0 = v14)
    v1 = v1.copy(p0 = v10)
    var v22: s2 = v11
    v22 = v22.copy(p1 = v15)
    v22 = v22.copy(p1 = v24)
    v22
  }
  @noinline
  def f0(v0: s10, v1: Vector[s2], v2: Double): Double = {
    var v7: Vector[s2] = v1
    v7 = v1
    var v5: Double = v2
    v7 = v1
    val v4: s2 = v7(0)
    var v17: Vector[s2] = v7
    val v10: s2 = f6(v4)
    val v11: s2 = f6(v4)
    v17 = v17.updated(0, v11)
    val v14: s2 = f6(v10)
    val v62: Vector[Vector[Double]] = v4.p0
    val v40: Double = v5 + v5
    v7 = v17
    val v46: s2 = v17(0)
    val v39: s2 = f6(v10)
    val v24: Double = v5 - v40
    v17 = v17.updated(0, v46)
    val v31: Vector[Double] = v62(0)
    val v43: Double = v31(0)
    val v79: s2 = f6(v11)
    v17 = v17.updated(0, v39)
    val v48: Vector[s2] = Vector(v4, v11, v39, v14, v79)
    val v44: s2 = f6(v79)
    val v63: Double = v31(0)
    val v42: Double = v63 / v43
    var v61: Vector[s2] = v48
    val v161: Double = v63 / v24
    v61 = v61.updated(2, v46)
    val v174: s2 = v61(4)
    val v172: Double = v40 * v42
    v7 = v7.updated(0, v10)
    v61 = v61.updated(1, v10)
    v61 = v61.updated(3, v79)
    val v173: Double = v161 * v172
    v17 = v17.updated(0, v174)
    v7 = v7.updated(0, v44)
    v173
  }
  def benchmark(): Unit = {
    val v0: s10 = s10(s5(Vector(s3(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(Vector(s1(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0))))))), s3(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), Vector(Vector(s1(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))))), Vector(s1(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))))), s3(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), Vector(Vector(s1(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0))))), Vector(s1(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))))))), s1(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0)))), Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))))), s6(Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))), Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))), Vector(s4(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), s1(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0))), s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))), s4(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), s1(s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))), s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))), s4(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), s1(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0)))))
    val v1: Vector[s2] = Vector(s2(Vector(Vector(136.0), Vector(137.0), Vector(138.0)), Vector(Vector(s0(Vector(Vector(139.0), Vector(140.0), Vector(141.0)), Vector(Vector(142.0)))))))
    val v2: Double = 143.0
    val start = nanoTime()
    var result: Double = 143.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}