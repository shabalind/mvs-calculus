import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: Vector[s1]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s1]
  )
  case class s6 (
    p0: s4,
    p1: s4
  )
  case class s11 (
    p0: Vector[s1],
    p1: s6
  )
  @noinline
  def f0(v0: s11, v1: Double): Double = {
    val v4: s6 = v0.p1
    val v3: s4 = v4.p1
    var v6: s4 = v3
    val v5: Vector[s1] = v0.p0
    var v10: Vector[s1] = v5
    var v11: Vector[s1] = v5
    val v25: s1 = v10(0)
    val v9: s1 = v11(0)
    v11 = v11.updated(0, v9)
    val v27: s1 = v10(0)
    val v23: Vector[Vector[s0]] = v9.p0
    v11 = v11.updated(0, v27)
    var v30: s1 = v9
    v10 = v10.updated(0, v27)
    v10 = v10.updated(0, v25)
    val v20: s1 = v11(0)
    val v29: Vector[s0] = v23(0)
    v11 = v11.updated(0, v27)
    val v22: s0 = v29(0)
    v10 = v10.updated(0, v27)
    val v43: Vector[Vector[Double]] = v22.p1
    v30 = v30.copy(p1 = v22)
    val v81: Vector[s1] = v6.p1
    val v56: Vector[Double] = v43(0)
    var v21: s1 = v30
    v11 = v11.updated(0, v21)
    val v83: Double = v56(0)
    v10 = v10.updated(0, v20)
    v10 = v10.updated(0, v27)
    val v52: s1 = v81(0)
    v11 = v11.updated(0, v9)
    v30 = v52
    v83
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s6(s4(Vector(s3(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))), s3(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))))), s3(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))), s1(Vector(Vector(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))))), s4(Vector(s3(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))))), s3(Vector(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))), s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))))), s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))))), s3(Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))), s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), Vector(s1(Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0))))))), Vector(s1(Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0))))), s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0)))), s1(Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0))))), s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0))))))))
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