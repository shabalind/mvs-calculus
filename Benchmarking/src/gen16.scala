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
    p0: Vector[s0],
    p1: s0
  )
  case class s4 (
    p0: Vector[Vector[s2]],
    p1: s2
  )
  def f121(v0: s0): s0 = {
    val v6: Vector[Vector[Double]] = v0.p0
    val v1: s1 = s1(v0, v0)
    val v9: Vector[Double] = v6(2)
    val v4: Vector[Vector[Double]] = v0.p1
    val v3: Vector[Double] = v6(0)
    val v14: Vector[Double] = v4(1)
    val v11: s0 = s0(v6, v4)
    val v23: Vector[Vector[Double]] = v11.p0
    val v24: Vector[Vector[Double]] = Vector(v3, v14, v3, v3, v14, v9)
    val v20: s0 = v1.p0
    var v17: s1 = v1
    val v33: Vector[Vector[Double]] = v11.p0
    val v19: Vector[Vector[Double]] = v11.p0
    var v41: s0 = v11
    val v43: s0 = v17.p1
    var v59: s0 = v41
    val v52: s0 = v17.p1
    var v54: Vector[Vector[Double]] = v24
    val v27: s0 = v1.p1
    val v32: Vector[Vector[Double]] = v11.p1
    v17 = v17.copy(p1 = v41)
    var v77: Vector[Vector[Double]] = v23
    val v58: s1 = s1(v27, v20)
    val v22: Vector[Double] = v54(2)
    var v56: Vector[Vector[Double]] = v33
    v17 = v1
    v17 = v17.copy(p0 = v52)
    v41 = v41.copy(p1 = v32)
    v41 = v41.copy(p0 = v56)
    var v45: s1 = v58
    v45 = v45.copy(p1 = v59)
    val v97: s0 = s0(v77, v32)
    val v71: s0 = v45.p0
    v45 = v45.copy(p0 = v0)
    v45 = v45.copy(p0 = v43)
    v45 = v45.copy(p0 = v97)
    v17 = v17.copy(p1 = v59)
    v41 = v41.copy(p1 = v32)
    v41 = v41.copy(p0 = v19)
    v77 = v77.updated(1, v22)
    v71
  }
  def f6(v0: s0): s0 = {
    var v6: s0 = v0
    var v3: s0 = v6
    val v4: Vector[Vector[Double]] = v3.p1
    v3 = v3.copy(p1 = v4)
    var v9: s0 = v3
    val v10: Vector[Vector[Double]] = v3.p1
    v6 = v6.copy(p1 = v4)
    v9 = v9.copy(p1 = v10)
    v9 = v3
    val v60: s0 = f121(v9)
    v60
  }
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v2: s4 = v0(0)
    val v4: s2 = v2.p1
    val v10: s0 = v4.p1
    var v18: s0 = v10
    val v12: s0 = f6(v18)
    val v29: s0 = f6(v12)
    val v24: Vector[Vector[Double]] = v12.p1
    v18 = v18.copy(p1 = v24)
    val v36: Vector[Vector[Double]] = v29.p1
    val v66: Vector[Double] = v36(1)
    val v61: Double = v66(0)
    v61
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s2(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))))), Vector(s2(Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))), Vector(s2(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s2(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))))), s4(Vector(Vector(s2(Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))))), Vector(s2(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(s2(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))))), s2(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))), s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))))), s4(Vector(Vector(s2(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0)))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))))), Vector(s2(Vector(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0))))), Vector(s2(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))))), s2(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))), s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0))))))
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