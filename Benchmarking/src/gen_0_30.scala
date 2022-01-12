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
  def f19(v0: s1, v1: Double, v2: s0, v3: Vector[s0]): Double = {
    val v4: Vector[s0] = v0.p1
    val v6: s0 = v4(1)
    val v39: Vector[Vector[Double]] = v6.p0
    val v20: Vector[Double] = v39(1)
    var v38: Double = v1
    var v42: Vector[Double] = v20
    val v90: Double = v42(0)
    val v80: Double = v38 + v90
    v80
  }
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s1]], v2: s1, v3: s1, v4: Vector[Vector[s0]], v5: s1, v6: Vector[Vector[s0]], v7: Vector[Vector[s0]], v8: Double): Double = {
    val v10: Vector[s0] = v2.p1
    val v12: s0 = v10(1)
    val v15: Vector[s0] = v7(0)
    val v37: Double = f19(v2, v8, v12, v15)
    v37
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))))))
    val v2: s1 = s1(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))
    val v3: s1 = s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0)))))
    val v4: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))))
    val v5: s1 = s1(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0)))))
    val v6: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)))), Vector(s0(Vector(Vector(105.0), Vector(106.0), Vector(107.0)), Vector(Vector(108.0), Vector(109.0)))))
    val v7: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)))))
    val v8: Double = 115.0
    val start = nanoTime()
    var result: Double = 115.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7, v8)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}