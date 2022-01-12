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
  case class s3 (
    p0: Vector[s1],
    p1: s1
  )
  case class s4 (
    p0: Vector[s3],
    p1: s3
  )
  case class s5 (
    p0: s4,
    p1: Vector[s4]
  )
  case class s7 (
    p0: s3,
    p1: Vector[s1]
  )
  case class s9 (
    p0: Vector[s7],
    p1: s5
  )
  def f29(v0: Double): Double = {
    var v2: Double = v0
    var v6: Double = v0
    var v7: Double = v6
    var v3: Double = v7
    v3 = v2
    var v1: Double = v7
    var v10: Double = v2
    var v9: Double = v3
    var v8: Double = v7
    var v18: Double = v7
    var v11: Double = v8
    var v14: Double = v10
    var v24: Double = v0
    var v15: Double = v9
    v9 = v7
    var v21: Double = v9
    var v26: Double = v18
    var v38: Double = v21
    var v16: Double = v38
    var v17: Double = v15
    var v23: Double = v26
    v1 = v17
    var v40: Double = v2
    var v44: Double = v17
    var v34: Double = v23
    var v43: Double = v16
    v18 = v10
    var v32: Double = v6
    var v50: Double = v32
    v7 = v24
    val v92: Vector[Double] = Vector(v11, v50)
    val v28: Double = v92(0)
    v11 = v2
    var v33: Vector[Double] = v92
    var v61: Vector[Double] = v92
    var v41: Double = v8
    var v48: Double = v34
    var v51: Vector[Double] = v92
    v21 = v48
    v61 = v61.updated(0, v43)
    v51 = v51.updated(1, v40)
    val v66: Double = v51(0)
    var v60: Vector[Double] = v33
    v33 = v33.updated(0, v18)
    val v86: Double = v61(0)
    val v65: Vector[Double] = Vector(v44, v41)
    val v125: Vector[Vector[Double]] = Vector(v60, v33, v65, v33, v61, v60, v51)
    v33 = v33.updated(0, v50)
    var v59: Vector[Vector[Double]] = v125
    var v114: Vector[Double] = v33
    val v95: Double = v51(1)
    var v56: Vector[Vector[Double]] = v125
    v51 = v51.updated(1, v14)
    v60 = v60.updated(1, v86)
    var v98: Vector[Double] = v114
    var v64: Vector[Double] = v114
    var v71: Vector[Double] = v64
    v61 = v61.updated(1, v66)
    val v212: Double = v98(1)
    var v110: Vector[Vector[Double]] = v59
    val v148: Vector[Vector[Vector[Double]]] = Vector(v125, v125, v125, v56, v125)
    v44 = v0
    var v296: Vector[Vector[Vector[Double]]] = v148
    v9 = v28
    var v53: Vector[Vector[Double]] = v110
    val v150: Vector[Vector[Double]] = v296(1)
    val v191: Vector[Double] = v150(2)
    var v115: Vector[Vector[Double]] = v56
    v60 = v60.updated(0, v95)
    v114 = v114.updated(0, v50)
    val v172: Vector[Double] = v115(4)
    v59 = v59.updated(1, v71)
    v110 = v110.updated(3, v33)
    val v119: Double = v172(1)
    val v139: Vector[Double] = v53(4)
    v53 = v53.updated(3, v191)
    v33 = v33.updated(1, v1)
    v32 = v212
    v115 = v115.updated(5, v114)
    v115 = v115.updated(5, v139)
    v119
  }
  @noinline
  def f0(v0: s1, v1: s9, v2: Double): Double = {
    val v4: Double = f29(v2)
    val v7: Double = f29(v4)
    val v10: Double = f29(v7)
    var v13: Double = v4
    val v31: Double = v13 * v10
    v31
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0)))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))))
    val v1: s9 = s9(Vector(s7(s3(Vector(s1(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0)))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))), s1(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s1(Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s0(Vector(Vector(22.0)), Vector(Vector(23.0))))))), s5(s4(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0)))), s0(Vector(Vector(26.0)), Vector(Vector(27.0)))), s1(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0)))), s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), s0(Vector(Vector(34.0)), Vector(Vector(35.0))))), s1(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s0(Vector(Vector(38.0)), Vector(Vector(39.0)))))), s3(Vector(s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0)))), s0(Vector(Vector(42.0)), Vector(Vector(43.0)))), s1(Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0)))), s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0)))), s0(Vector(Vector(50.0)), Vector(Vector(51.0))))), s1(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0)))), s0(Vector(Vector(54.0)), Vector(Vector(55.0)))))), Vector(s4(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0)))), s0(Vector(Vector(58.0)), Vector(Vector(59.0)))), s1(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0)))), s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), s1(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0)))), s0(Vector(Vector(66.0)), Vector(Vector(67.0))))), s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0)))), s0(Vector(Vector(70.0)), Vector(Vector(71.0)))))), s3(Vector(s1(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0)))), s0(Vector(Vector(74.0)), Vector(Vector(75.0)))), s1(Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0)))), s0(Vector(Vector(78.0)), Vector(Vector(79.0)))), s1(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0)))), s0(Vector(Vector(82.0)), Vector(Vector(83.0))))), s1(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0)))), s0(Vector(Vector(86.0)), Vector(Vector(87.0)))))), s4(Vector(s3(Vector(s1(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0)))), s0(Vector(Vector(90.0)), Vector(Vector(91.0)))), s1(Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0)))), s0(Vector(Vector(94.0)), Vector(Vector(95.0)))), s1(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0)))), s0(Vector(Vector(98.0)), Vector(Vector(99.0))))), s1(Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0)))), s0(Vector(Vector(102.0)), Vector(Vector(103.0)))))), s3(Vector(s1(Vector(s0(Vector(Vector(104.0)), Vector(Vector(105.0)))), s0(Vector(Vector(106.0)), Vector(Vector(107.0)))), s1(Vector(s0(Vector(Vector(108.0)), Vector(Vector(109.0)))), s0(Vector(Vector(110.0)), Vector(Vector(111.0)))), s1(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0)))), s0(Vector(Vector(114.0)), Vector(Vector(115.0))))), s1(Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0)))), s0(Vector(Vector(118.0)), Vector(Vector(119.0)))))))))
    val v2: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}