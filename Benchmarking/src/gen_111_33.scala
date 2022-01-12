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
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]],
    p2: Vector[Vector[s0]]
  )
  case class s4 (
    p0: Vector[s2],
    p1: s2,
    p2: s0,
    p3: s0
  )
  def f4(v0: Double): Double = {
    var v7: Double = v0
    var v6: Double = v7
    var v5: Double = v6
    var v1: Double = v6
    var v2: Double = v7
    var v4: Double = v0
    var v9: Double = v7
    var v3: Double = v2
    var v12: Double = v9
    var v20: Double = v2
    var v15: Double = v9
    var v13: Double = v1
    v2 = v13
    var v30: Double = v1
    var v29: Double = v12
    var v32: Double = v15
    var v23: Double = v6
    var v49: Double = v29
    val v25: Double = v29 + v2
    var v27: Double = v49
    var v58: Double = v20
    var v69: Double = v4
    var v57: Double = v5
    var v42: Double = v49
    val v59: Vector[Double] = Vector(v69, v58, v25)
    val v70: Double = v59(0)
    var v74: Vector[Double] = v59
    v74 = v74.updated(0, v42)
    val v68: Vector[Double] = Vector(v32, v30, v12, v3, v69, v70, v23)
    val v102: Double = v68(1)
    val v89: Double = v68(1)
    var v48: Vector[Double] = v74
    val v62: Double = v74(0)
    val v85: Double = v68(6)
    val v61: Double = v85 / v7
    var v92: Vector[Double] = v68
    v74 = v74.updated(1, v23)
    v48 = v48.updated(1, v85)
    v48 = v48.updated(2, v57)
    val v125: Double = v48(2)
    var v117: Vector[Double] = v92
    var v90: Double = v125
    v74 = v74.updated(1, v1)
    var v149: Double = v90
    v117 = v117.updated(5, v62)
    var v170: Vector[Double] = v117
    v48 = v48.updated(0, v6)
    v74 = v74.updated(0, v102)
    v74 = v74.updated(2, v149)
    v29 = v61
    var v358: Vector[Double] = v170
    val v253: Double = v358(6)
    v74 = v74.updated(2, v89)
    v74 = v74.updated(1, v27)
    v253
  }
  @noinline
  def f0(v0: s4, v1: Vector[s1], v2: Double): Double = {
    val v12: Double = f4(v2)
    var v11: Double = v12
    val v10: Double = f4(v2)
    val v72: Double = v10 / v11
    val v54: Double = f4(v11)
    val v49: Double = v54 / v72
    val v120: Double = f4(v49)
    v120
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), s1(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0)))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), Vector(s1(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0)))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))))), Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))))), s2(Vector(s1(Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0)))), s1(Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), Vector(s1(Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0)))))), Vector(Vector(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))))), s2(Vector(s1(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0)))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0)))), s1(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))), s0(Vector(Vector(81.0)), Vector(Vector(82.0), Vector(83.0))))), Vector(s1(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0)))), s0(Vector(Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))))), Vector(Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0), Vector(92.0)))), Vector(s0(Vector(Vector(93.0)), Vector(Vector(94.0), Vector(95.0)))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0)))))), s0(Vector(Vector(99.0)), Vector(Vector(100.0), Vector(101.0))), s0(Vector(Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))
    val v1: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(105.0)), Vector(Vector(106.0), Vector(107.0)))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0)))), s1(Vector(s0(Vector(Vector(111.0)), Vector(Vector(112.0), Vector(113.0)))), s0(Vector(Vector(114.0)), Vector(Vector(115.0), Vector(116.0)))))
    val v2: Double = 117.0
    val start = nanoTime()
    var result: Double = 117.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}