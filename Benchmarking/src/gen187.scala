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
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s2,
    p2: s2
  )
  def f51(v0: s3): s3 = {
    val v6: s2 = v0.p1
    val v5: Vector[s1] = v0.p0
    val v8: Vector[s2] = Vector(v6, v6, v6, v6, v6, v6)
    val v13: Vector[s1] = v6.p0
    val v33: s2 = v8(0)
    val v23: s2 = v8(2)
    val v34: s2 = v8(5)
    val v46: Vector[s1] = v0.p0
    val v49: Vector[s1] = v34.p0
    var v26: Vector[s2] = v8
    val v47: Vector[Vector[s1]] = Vector(v46, v13, v13, v46, v5)
    val v93: s2 = v26(1)
    val v50: Vector[s1] = v47(4)
    var v39: Vector[s1] = v50
    val v87: s3 = s3(v49, v33, v93)
    v39 = v46
    var v139: s3 = v87
    v139 = v139.copy(p0 = v39)
    v26 = v26.updated(3, v23)
    v139
  }
  def f48(v0: Double): Double = {
    var v1: Double = v0
    val v6: Double = v1 / v0
    v1 = v6
    var v5: Double = v0
    var v8: Double = v6
    val v3: Double = v5 - v8
    v1 = v8
    var v11: Double = v8
    var v12: Double = v11
    var v15: Double = v12
    var v49: Double = v6
    val v80: Vector[Double] = Vector(v15)
    val v36: Double = v80(0)
    val v38: Vector[Double] = Vector(v3, v49)
    var v75: Vector[Double] = v38
    val v99: Vector[Vector[Double]] = Vector(v38, v38, v75, v38, v38)
    val v68: Vector[Double] = v99(4)
    val v84: Double = v68(1)
    v75 = v75.updated(1, v36)
    v84
  }
  def f41(v0: s2, v1: s2): s2 = {
    val v5: Vector[s1] = v1.p0
    val v10: s1 = v5(0)
    var v3: Vector[s1] = v5
    val v11: s3 = s3(v3, v1, v1)
    val v18: s3 = f51(v11)
    val v20: Vector[Vector[s0]] = v10.p0
    v3 = v3.updated(0, v10)
    val v41: Vector[s0] = v10.p1
    val v101: s3 = f51(v18)
    val v44: s1 = s1(v20, v41)
    val v208: s2 = v101.p1
    v3 = v3.updated(0, v44)
    v208
  }
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v5: s2 = v0.p1
    val v7: Double = f48(v1)
    val v3: s2 = f41(v5, v5)
    val v4: s2 = f41(v5, v3)
    val v10: s2 = f41(v4, v5)
    var v24: Double = v1
    val v39: Vector[s1] = v10.p0
    val v43: Double = f48(v24)
    val v26: s1 = v39(0)
    val v44: Vector[s0] = v26.p1
    val v74: s0 = v44(1)
    val v62: Double = f48(v43)
    val v49: Vector[Vector[Double]] = v74.p1
    val v113: Vector[Double] = v49(2)
    var v172: Vector[Double] = v113
    val v155: Double = v172(0)
    v172 = v172.updated(0, v7)
    val v118: Double = f48(v62)
    v172 = v172.updated(0, v118)
    v155
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))))), s2(Vector(s1(Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))), Vector(s1(Vector(Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))))))))
    val v1: Double = 108.0
    val start = nanoTime()
    var result: Double = 108.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}