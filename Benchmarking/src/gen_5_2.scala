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
    p0: Vector[Double],
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: s3,
    p1: s1
  )
  @noinline
  def f0(v0: s5, v1: s5, v2: Double): Double = {
    val v6: s3 = v0.p0
    val v8: Double = v2 * v2
    val v3: Vector[Double] = v6.p0
    val v9: Double = v3(0)
    var v12: Double = v9
    val v10: Vector[Vector[s1]] = v6.p1
    val v15: Double = v3(0)
    val v20: Vector[Double] = v6.p0
    val v11: Vector[s1] = v10(1)
    val v27: Double = v20(0)
    val v17: s1 = v11(0)
    val v19: s0 = v17.p1
    val v36: Vector[Vector[Double]] = v19.p1
    val v14: Vector[Vector[Double]] = v19.p1
    val v23: Vector[Double] = v14(0)
    v12 = v8
    var v21: Vector[Vector[Double]] = v36
    v21 = v21.updated(0, v23)
    var v28: Vector[Double] = v23
    v21 = v21.updated(0, v28)
    v28 = v28.updated(0, v27)
    v28 = v28.updated(0, v12)
    val v49: Vector[Double] = v21(0)
    val v43: Double = v12 + v27
    var v57: Vector[Double] = v49
    v28 = v28.updated(0, v43)
    val v90: Double = v57(0)
    val v85: Double = v15 / v90
    v85
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s3(Vector(0.0, 1.0), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0))))), s0(Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0)))), Vector(s0(Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0)))), Vector(s0(Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(Vector(37.0)))), Vector(s0(Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0))))), s0(Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))))))), s1(Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0)))), Vector(s0(Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0))))), s0(Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))))
    val v1: s5 = s5(s3(Vector(66.0, 67.0), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0)))), Vector(s0(Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0)))), Vector(s0(Vector(Vector(104.0), Vector(105.0), Vector(106.0)), Vector(Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0))))), s0(Vector(Vector(112.0), Vector(113.0), Vector(114.0)), Vector(Vector(115.0))))))), s1(Vector(Vector(s0(Vector(Vector(116.0), Vector(117.0), Vector(118.0)), Vector(Vector(119.0)))), Vector(s0(Vector(Vector(120.0), Vector(121.0), Vector(122.0)), Vector(Vector(123.0)))), Vector(s0(Vector(Vector(124.0), Vector(125.0), Vector(126.0)), Vector(Vector(127.0))))), s0(Vector(Vector(128.0), Vector(129.0), Vector(130.0)), Vector(Vector(131.0)))))
    val v2: Double = 132.0
    val start = nanoTime()
    var result: Double = 132.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}