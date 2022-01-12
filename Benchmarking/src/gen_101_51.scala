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
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  case class s4 (
    p0: Vector[s1],
    p1: Double
  )
  case class s5 (
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  def f36(v0: s4): s4 = {
    var v12: s4 = v0
    v12
  }
  @noinline
  def f0(v0: s4, v1: s3, v2: Vector[s3], v3: Vector[s5], v4: Vector[Vector[s1]], v5: Double): Double = {
    val v10: Double = v0.p1
    var v41: s4 = v0
    v41 = v41.copy(p1 = v10)
    v41 = v41.copy(p1 = v10)
    val v27: Vector[s1] = v0.p0
    val v48: Vector[Vector[s1]] = Vector(v27, v27, v27, v27, v27)
    v41 = v41.copy(p1 = v5)
    val v32: s4 = f36(v41)
    v41 = v41.copy(p1 = v10)
    val v66: s4 = f36(v32)
    v41 = v41.copy(p0 = v27)
    val v44: Vector[s1] = v48(3)
    val v71: Double = v66.p1
    v41 = v41.copy(p0 = v44)
    v41 = v41.copy(p1 = v10)
    v71
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), Vector(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))))), 18.0)
    val v1: s3 = s3(s2(s1(s0(Vector(Vector(19.0), Vector(20.0)), Vector(Vector(21.0))), Vector(s0(Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0))))), s1(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0)))))), Vector(Vector(s1(s0(Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0))), Vector(s0(Vector(Vector(34.0), Vector(35.0)), Vector(Vector(36.0)))))), Vector(s1(s0(Vector(Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)))))), Vector(s1(s0(Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0))), Vector(s0(Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0))))))))
    val v2: Vector[s3] = Vector(s3(s2(s1(s0(Vector(Vector(49.0), Vector(50.0)), Vector(Vector(51.0))), Vector(s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0))))), s1(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0))), Vector(s0(Vector(Vector(58.0), Vector(59.0)), Vector(Vector(60.0)))))), Vector(Vector(s1(s0(Vector(Vector(61.0), Vector(62.0)), Vector(Vector(63.0))), Vector(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0)))))), Vector(s1(s0(Vector(Vector(67.0), Vector(68.0)), Vector(Vector(69.0))), Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0)))))), Vector(s1(s0(Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0))), Vector(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0)))))))))
    val v3: Vector[s5] = Vector(s5(s0(Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0))), Vector(Vector(s1(s0(Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))))), Vector(s1(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0))), Vector(s0(Vector(Vector(91.0), Vector(92.0)), Vector(Vector(93.0)))))))), s5(s0(Vector(Vector(94.0), Vector(95.0)), Vector(Vector(96.0))), Vector(Vector(s1(s0(Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0))), Vector(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0)))))), Vector(s1(s0(Vector(Vector(103.0), Vector(104.0)), Vector(Vector(105.0))), Vector(s0(Vector(Vector(106.0), Vector(107.0)), Vector(Vector(108.0)))))))))
    val v4: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(109.0), Vector(110.0)), Vector(Vector(111.0))), Vector(s0(Vector(Vector(112.0), Vector(113.0)), Vector(Vector(114.0)))))), Vector(s1(s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0))), Vector(s0(Vector(Vector(118.0), Vector(119.0)), Vector(Vector(120.0)))))), Vector(s1(s0(Vector(Vector(121.0), Vector(122.0)), Vector(Vector(123.0))), Vector(s0(Vector(Vector(124.0), Vector(125.0)), Vector(Vector(126.0)))))))
    val v5: Double = 127.0
    val start = nanoTime()
    var result: Double = 127.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}