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
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s1]
  )
  case class s6 (
    p0: s2,
    p1: Vector[Vector[s1]]
  )
  case class s10 (
    p0: s3
  )
  case class s11 (
    p0: Double,
    p1: Vector[s6]
  )
  def f13(v0: Double): Double = {
    var v7: Double = v0
    var v4: Double = v7
    var v6: Double = v7
    val v3: Vector[Double] = Vector(v0, v7, v4, v0)
    val v5: Double = v3(0)
    val v9: Double = v3(3)
    var v15: Double = v5
    var v20: Vector[Double] = v3
    val v16: Double = v20(0)
    v20 = v20.updated(3, v9)
    v20 = v20.updated(2, v6)
    v6 = v15
    v16
  }
  @noinline
  def f0(v0: s11, v1: s3, v2: s10, v3: Double): Double = {
    val v8: Double = f13(v3)
    val v10: Double = f13(v8)
    var v14: s11 = v0
    v14 = v0
    v14 = v14.copy(p0 = v10)
    val v25: Double = v14.p0
    v25
  }
  def benchmark(): Unit = {
    val v0: s11 = s11(0.0, Vector(s6(s2(Vector(Vector(s1(s0(Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0))), s0(Vector(Vector(7.0), Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0))))), Vector(s1(s0(Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0))), s0(Vector(Vector(19.0), Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))))), Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0)))), Vector(s0(Vector(Vector(31.0), Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)))), Vector(s0(Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0)))))), Vector(Vector(s1(s0(Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0))), s0(Vector(Vector(49.0), Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))), Vector(s1(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0))), s0(Vector(Vector(61.0), Vector(62.0), Vector(63.0)), Vector(Vector(64.0), Vector(65.0), Vector(66.0))))), Vector(s1(s0(Vector(Vector(67.0), Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0))), s0(Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)))))))))
    val v1: s3 = s3(Vector(s1(s0(Vector(Vector(79.0), Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0), Vector(90.0)))), s1(s0(Vector(Vector(91.0), Vector(92.0), Vector(93.0)), Vector(Vector(94.0), Vector(95.0), Vector(96.0))), s0(Vector(Vector(97.0), Vector(98.0), Vector(99.0)), Vector(Vector(100.0), Vector(101.0), Vector(102.0))))))
    val v2: s10 = s10(s3(Vector(s1(s0(Vector(Vector(103.0), Vector(104.0), Vector(105.0)), Vector(Vector(106.0), Vector(107.0), Vector(108.0))), s0(Vector(Vector(109.0), Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0)))), s1(s0(Vector(Vector(115.0), Vector(116.0), Vector(117.0)), Vector(Vector(118.0), Vector(119.0), Vector(120.0))), s0(Vector(Vector(121.0), Vector(122.0), Vector(123.0)), Vector(Vector(124.0), Vector(125.0), Vector(126.0)))))))
    val v3: Double = 127.0
    val start = nanoTime()
    var result: Double = 127.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}