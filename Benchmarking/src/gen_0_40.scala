import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s1],
    p1: Vector[Double]
  )
  case class s4 (
    p0: s0,
    p1: s0
  )
  def f81(v0: Double): Double = {
    var v7: Double = v0
    v7 = v0
    var v5: Double = v0
    var v2: Double = v5
    val v4: Double = v0 / v7
    var v9: Double = v0
    var v3: Double = v5
    v5 = v4
    var v10: Double = v9
    var v12: Double = v3
    var v41: Double = v2
    val v32: Double = v41 + v12
    var v46: Double = v32
    val v18: Double = v46 / v32
    v2 = v10
    v18
  }
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Vector[s1], v2: Vector[Vector[s4]], v3: Vector[s2], v4: Double): Double = {
    val v7: s2 = v3(0)
    val v16: Vector[Double] = v7.p1
    var v26: Vector[Double] = v16
    v26 = v26.updated(2, v4)
    val v28: Double = v26(1)
    val v14: Double = f81(v4)
    v26 = v26.updated(1, v28)
    v26 = v26.updated(0, v28)
    v26 = v26.updated(0, v14)
    v26 = v26.updated(0, v4)
    v26 = v26.updated(0, v14)
    val v23: Double = f81(v28)
    val v39: Double = v23 + v28
    v39
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))))), s1(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))))), Vector(20.0, 21.0, 22.0))), Vector(s2(Vector(s1(s0(Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0)))))), s1(s0(Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0))), Vector(Vector(s0(Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0))))))), Vector(43.0, 44.0, 45.0))), Vector(s2(Vector(s1(s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), Vector(Vector(s0(Vector(Vector(51.0), Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))))), s1(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0))), Vector(Vector(s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))))), Vector(66.0, 67.0, 68.0))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(69.0), Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0))), Vector(Vector(s0(Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)))))), s1(s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0))), Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0)))))))
    val v2: Vector[Vector[s4]] = Vector(Vector(s4(s0(Vector(Vector(89.0), Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0))), s0(Vector(Vector(94.0), Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0))))))
    val v3: Vector[s2] = Vector(s2(Vector(s1(s0(Vector(Vector(99.0), Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0))), Vector(Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0)))))), s1(s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0))), Vector(Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0))))))), Vector(119.0, 120.0, 121.0)))
    val v4: Double = 122.0
    val start = nanoTime()
    var result: Double = 122.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}