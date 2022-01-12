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
  case class s3 (
    p0: s0,
    p1: s1
  )
  case class s4 (
    p0: Vector[Vector[s1]],
    p1: Vector[s3]
  )
  case class s9 (
    p0: Vector[s1],
    p1: Vector[Vector[s0]]
  )
  case class s11 (
    p0: s4,
    p1: Vector[s9]
  )
  def f13(v0: s11): s11 = {
    val v6: s4 = v0.p0
    var v4: s4 = v6
    val v11: Vector[s4] = Vector(v6, v6)
    val v14: s4 = v11(0)
    var v26: s11 = v0
    v26 = v26.copy(p0 = v14)
    val v41: s4 = v11(0)
    var v29: s11 = v26
    v29 = v29.copy(p0 = v4)
    val v22: s4 = v11(1)
    val v84: s4 = v11(0)
    v29 = v29.copy(p0 = v84)
    v26 = v26.copy(p0 = v41)
    val v66: Vector[s3] = v41.p1
    v29 = v29.copy(p0 = v22)
    v26 = v26.copy(p0 = v6)
    v4 = v4.copy(p1 = v66)
    v29
  }
  def f3(v0: s4): s4 = {
    val v7: Vector[Vector[s1]] = v0.p0
    var v6: s4 = v0
    val v2: Vector[s3] = v6.p1
    v6 = v6.copy(p1 = v2)
    var v8: Vector[Vector[s1]] = v7
    val v1: Vector[Vector[s1]] = v0.p0
    val v4: Vector[Vector[s1]] = v6.p0
    v6 = v6.copy(p0 = v4)
    v6 = v6.copy(p0 = v8)
    val v10: Vector[s1] = v1(2)
    v6 = v6.copy(p0 = v1)
    v8 = v8.updated(1, v10)
    var v36: s4 = v6
    val v59: Vector[s3] = v0.p1
    val v58: Vector[Vector[s1]] = v36.p0
    v6 = v6.copy(p0 = v58)
    v6 = v6.copy(p1 = v59)
    v36
  }
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    val v5: s11 = f13(v0)
    var v3: s11 = v5
    v3 = v5
    val v8: s11 = f13(v0)
    var v6: s11 = v3
    val v7: s11 = f13(v6)
    var v2: s11 = v7
    val v9: s11 = f13(v8)
    val v10: s11 = f13(v9)
    val v12: s11 = f13(v10)
    val v16: s4 = v2.p0
    val v11: Vector[s3] = v16.p1
    val v14: s3 = v11(1)
    val v24: Vector[s9] = v3.p1
    val v25: s1 = v14.p1
    v2 = v2.copy(p0 = v16)
    val v26: s0 = v25.p0
    v2 = v2.copy(p1 = v24)
    v2 = v2.copy(p0 = v16)
    var v20: s0 = v26
    val v17: Vector[s9] = v10.p1
    val v59: Vector[s9] = v12.p1
    val v27: s4 = f3(v16)
    val v43: Vector[Vector[Double]] = v20.p0
    val v29: Vector[Double] = v43(0)
    val v35: Double = v29(0)
    v3 = v3.copy(p1 = v59)
    v6 = v6.copy(p1 = v17)
    var v42: s4 = v27
    val v57: s4 = f3(v42)
    v3 = v3.copy(p1 = v17)
    val v82: Double = v1 + v1
    val v52: Double = v35 + v82
    v6 = v6.copy(p0 = v57)
    v52
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(s4(Vector(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))), Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))), Vector(s3(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s3(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))), Vector(s9(Vector(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), Vector(Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), s9(Vector(s1(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s1(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))))), Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))), s9(Vector(s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0)))), s1(s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0))), s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))))), Vector(Vector(s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0)))), Vector(s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0))))))))
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