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
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s1]],
    p2: Vector[s1],
    p3: Vector[Vector[s1]]
  )
  def f62(v0: Double): Double = {
    var v6: Double = v0
    val v2: Double = v0 * v6
    val v7: Vector[Double] = Vector(v2)
    val v5: Double = v7(0)
    var v1: Vector[Double] = v7
    var v3: Vector[Double] = v1
    val v8: Double = v1(0)
    val v20: Double = v7(0)
    var v11: Vector[Double] = v7
    var v10: Vector[Double] = v3
    var v14: Vector[Double] = v10
    var v13: Double = v2
    val v25: Double = v11(0)
    var v16: Double = v5
    var v15: Double = v8
    val v22: Double = v3(0)
    v14 = v14.updated(0, v15)
    val v30: Double = v7(0)
    v14 = v14.updated(0, v30)
    v11 = v11.updated(0, v20)
    val v18: Double = v14(0)
    var v17: Vector[Double] = v14
    v17 = v17.updated(0, v13)
    var v35: Vector[Double] = v17
    v35 = v35.updated(0, v25)
    v11 = v11.updated(0, v22)
    val v23: Double = v14(0)
    val v46: Double = v10(0)
    val v21: Double = v35(0)
    val v29: Double = v1(0)
    v3 = v3.updated(0, v46)
    v3 = v1
    v1 = v1.updated(0, v0)
    var v24: Vector[Double] = v35
    v17 = v17.updated(0, v6)
    var v71: Double = v18
    v24 = v24.updated(0, v23)
    val v54: Double = v1(0)
    val v43: Double = v35(0)
    val v58: Double = v7(0)
    v3 = v3.updated(0, v0)
    var v68: Vector[Double] = v14
    v11 = v11.updated(0, v23)
    val v38: Double = v68(0)
    v24 = v24.updated(0, v29)
    val v75: Vector[Double] = Vector(v15, v54, v16, v21, v16, v58)
    var v77: Double = v13
    v3 = v3.updated(0, v71)
    var v59: Vector[Double] = v75
    v3 = v3.updated(0, v58)
    val v89: Double = v59(0)
    v3 = v3.updated(0, v77)
    v17 = v17.updated(0, v38)
    v17 = v24
    val v53: Double = v89 / v21
    v11 = v11.updated(0, v43)
    v53
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v31: Double = v1 * v1
    val v72: Double = f62(v1)
    val v103: Double = v1 / v72
    var v213: Double = v103
    val v109: Double = v213 - v31
    v109
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(Vector(s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))))), Vector(s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))))), Vector(s1(s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), s1(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))))), Vector(Vector(s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))))), Vector(s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))), Vector(s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))), s0(Vector(Vector(120.0)), Vector(Vector(121.0), Vector(122.0), Vector(123.0))))))))
    val v1: Double = 124.0
    val start = nanoTime()
    var result: Double = 124.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}