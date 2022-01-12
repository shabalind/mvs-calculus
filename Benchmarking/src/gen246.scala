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
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: s0
  )
  case class s4 (
    p0: s3,
    p1: s0,
    p2: s3,
    p3: Vector[s2]
  )
  case class s5 (
    p0: s4,
    p1: Vector[s0]
  )
  case class s7 (
    p0: s1,
    p1: s5
  )
  case class s8 (
    p0: s7,
    p1: Vector[s0]
  )
  def f22(v0: Double): Double = {
    var v2: Double = v0
    var v5: Double = v2
    v5 = v0
    var v3: Double = v5
    var v8: Double = v0
    var v7: Double = v2
    var v1: Double = v8
    val v11: Double = v2 / v1
    var v6: Double = v3
    var v12: Double = v0
    var v10: Double = v11
    val v4: Vector[Double] = Vector(v8, v2, v8, v2, v6, v10)
    val v22: Double = v4(5)
    var v9: Vector[Double] = v4
    var v16: Double = v3
    val v21: Double = v4(1)
    v9 = v9.updated(0, v12)
    var v13: Double = v21
    var v20: Double = v6
    v9 = v9.updated(5, v7)
    v9 = v4
    val v18: Double = v4(5)
    var v29: Vector[Double] = v4
    v9 = v9.updated(3, v13)
    v29 = v29.updated(4, v7)
    val v38: Double = v4(0)
    v29 = v29.updated(4, v18)
    v29 = v29.updated(1, v38)
    val v37: Double = v29(2)
    var v19: Double = v21
    var v14: Vector[Double] = v9
    var v24: Double = v2
    v14 = v14.updated(4, v22)
    v20 = v19
    var v51: Double = v1
    val v58: Double = v9(3)
    val v47: Double = v14(0)
    v9 = v9.updated(4, v20)
    v14 = v14.updated(3, v0)
    var v73: Double = v11
    var v40: Vector[Double] = v4
    var v85: Vector[Double] = v14
    v29 = v29.updated(2, v1)
    var v39: Vector[Double] = v4
    v9 = v9.updated(5, v37)
    var v48: Double = v24
    val v137: Double = v4(3)
    val v59: Double = v40(3)
    val v72: Double = v14(2)
    val v114: Double = v29(4)
    val v143: Double = v39(3)
    v85 = v85.updated(0, v51)
    v85 = v85.updated(0, v73)
    v9 = v9.updated(1, v114)
    v40 = v40.updated(3, v47)
    val v95: Double = v59 + v137
    v9 = v9.updated(4, v72)
    v14 = v14.updated(3, v12)
    v85 = v85.updated(0, v21)
    var v88: Vector[Double] = v85
    v39 = v39.updated(0, v48)
    v40 = v88
    v40 = v40.updated(5, v58)
    var v68: Double = v143
    v29 = v29.updated(5, v16)
    v29 = v29.updated(2, v68)
    v95
  }
  @noinline
  def f0(v0: Vector[Vector[s8]], v1: Double): Double = {
    val v6: Double = v1 / v1
    val v15: Double = f22(v1)
    val v28: Double = f22(v15)
    val v39: Double = v15 + v28
    val v110: Double = v39 / v6
    v110
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s8]] = Vector(Vector(s8(s7(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), s5(s4(s3(s2(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s3(s2(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0)))), Vector(s2(s1(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))), s2(s1(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), s2(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))), Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}