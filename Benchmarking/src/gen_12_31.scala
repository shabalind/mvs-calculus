import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: s3,
    p1: s1
  )
  case class s5 (
    p0: s1,
    p1: s0
  )
  case class s6 (
    p0: Vector[s4],
    p1: s0
  )
  def f35(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v7
    var v5: Double = v6
    var v8: Double = v5
    v6 = v7
    var v2: Double = v8
    var v3: Double = v5
    var v4: Double = v2
    var v12: Double = v0
    var v13: Double = v4
    var v10: Double = v3
    val v9: Vector[Double] = Vector(v2, v6, v13, v13)
    var v22: Vector[Double] = v9
    v22 = v22.updated(1, v3)
    var v19: Double = v8
    v4 = v0
    var v26: Vector[Double] = v22
    v26 = v26.updated(1, v6)
    val v34: Double = v22(0)
    val v30: Double = v26(2)
    var v15: Double = v30
    v22 = v22.updated(2, v2)
    v22 = v22.updated(2, v19)
    var v25: Double = v15
    val v42: Double = v9(1)
    val v31: Vector[Double] = Vector(v19, v7, v10, v42, v34, v12, v25)
    v26 = v26.updated(3, v0)
    var v54: Vector[Double] = v31
    v26 = v26.updated(2, v15)
    val v23: Double = v54(5)
    val v86: Double = v15 / v0
    val v40: Double = v31(2)
    var v46: Double = v40
    v10 = v86
    v54 = v54.updated(1, v25)
    var v43: Double = v23
    v26 = v26.updated(0, v43)
    v46
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: Vector[s5], v2: s1, v3: Vector[Vector[s5]], v4: Double): Double = {
    val v7: Double = f35(v4)
    var v10: Double = v7
    var v21: Double = v10
    val v25: Double = f35(v21)
    v25
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(Vector(s4(s3(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s1(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), Vector(s6(Vector(s4(s3(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), s1(Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))))
    val v1: Vector[s5] = Vector(s5(s1(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0)))), s5(s1(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))))), s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))
    val v2: s1 = s1(Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0)))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))
    val v3: Vector[Vector[s5]] = Vector(Vector(s5(s1(Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0), Vector(124.0), Vector(125.0)))), Vector(s0(Vector(Vector(126.0), Vector(127.0), Vector(128.0)), Vector(Vector(129.0), Vector(130.0), Vector(131.0))))), s0(Vector(Vector(132.0), Vector(133.0), Vector(134.0)), Vector(Vector(135.0), Vector(136.0), Vector(137.0))))))
    val v4: Double = 138.0
    val start = nanoTime()
    var result: Double = 138.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}