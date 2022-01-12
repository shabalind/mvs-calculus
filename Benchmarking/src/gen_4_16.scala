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
    p0: s0,
    p1: Vector[Vector[s1]]
  )
  case class s3 (
    p0: s2,
    p1: Double
  )
  case class s4 (
    p0: s2,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: s0, v1: Vector[s1], v2: Vector[s2], v3: Vector[s4], v4: Vector[s3], v5: Double): Double = {
    val v10: s1 = v1(0)
    val v6: s0 = v10.p1
    val v11: s1 = v1(0)
    val v15: s0 = v11.p1
    val v20: Vector[Vector[Double]] = v6.p1
    var v27: s0 = v15
    v27 = v27.copy(p1 = v20)
    val v72: Vector[Vector[Double]] = v27.p0
    val v110: Vector[Double] = v72(0)
    val v87: Double = v110(0)
    v87
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))))
    val v2: Vector[s2] = Vector(s2(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), Vector(Vector(s1(s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))))
    val v3: Vector[s4] = Vector(s4(s2(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))), Vector(Vector(s1(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))), Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0)))))), s4(s2(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))), Vector(Vector(s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))))))), Vector(s1(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))))), s4(s2(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), Vector(Vector(s1(s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0))))))), Vector(s1(s0(Vector(Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0)))))))
    val v4: Vector[s3] = Vector(s3(s2(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0))), Vector(Vector(s1(s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0))))))), 96.0), s3(s2(s0(Vector(Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0))), Vector(Vector(s1(s0(Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0))))))), 109.0))
    val v5: Double = 110.0
    val start = nanoTime()
    var result: Double = 110.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}