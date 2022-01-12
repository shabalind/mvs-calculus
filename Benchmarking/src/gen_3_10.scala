import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: Vector[s1],
    p1: s0
  )
  def f76(v0: s0): s0 = {
    val v7: Vector[Double] = v0.p0
    val v3: Vector[Vector[Double]] = v0.p1
    var v6: s0 = v0
    val v1: Vector[Double] = v0.p0
    val v4: Vector[Vector[Double]] = v6.p1
    val v8: Vector[Double] = v4(0)
    v6 = v6.copy(p0 = v7)
    v6 = v6.copy(p1 = v3)
    val v12: Vector[Double] = v0.p0
    v6 = v6.copy(p0 = v12)
    v6 = v6.copy(p1 = v4)
    v6 = v6.copy(p1 = v3)
    v6 = v6.copy(p0 = v12)
    val v30: Vector[Vector[Double]] = v0.p1
    val v25: Vector[Double] = v6.p0
    val v22: Vector[Vector[Double]] = v6.p1
    var v36: Vector[Vector[Double]] = v30
    v36 = v36.updated(1, v8)
    v6 = v6.copy(p1 = v36)
    var v43: Vector[Vector[Double]] = v22
    v6 = v6.copy(p0 = v1)
    v6 = v6.copy(p1 = v43)
    var v40: Vector[Double] = v25
    v6 = v6.copy(p0 = v40)
    var v87: s0 = v6
    val v79: s1 = s1(v87, v6)
    val v69: s0 = v79.p1
    v69
  }
  @noinline
  def f0(v0: s1, v1: Vector[Vector[s3]], v2: Double): Double = {
    val v5: s0 = v0.p0
    val v6: Vector[Double] = v5.p0
    val v14: s0 = v0.p1
    val v11: Double = v6(2)
    val v25: s0 = f76(v14)
    var v23: Vector[Double] = v6
    v23 = v23.updated(2, v11)
    val v37: Double = v6(1)
    val v36: Vector[Double] = v25.p0
    val v61: Double = v23(1)
    val v39: Double = v36(0)
    v23 = v23.updated(0, v37)
    v23 = v23.updated(0, v39)
    v23 = v6
    v61
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(0.0, 1.0, 2.0), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(6.0, 7.0, 8.0), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))
    val v1: Vector[Vector[s3]] = Vector(Vector(s3(Vector(s1(s0(Vector(12.0, 13.0, 14.0), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(18.0, 19.0, 20.0), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s1(s0(Vector(24.0, 25.0, 26.0), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(30.0, 31.0, 32.0), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s1(s0(Vector(36.0, 37.0, 38.0), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(42.0, 43.0, 44.0), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), s0(Vector(48.0, 49.0, 50.0), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), Vector(s3(Vector(s1(s0(Vector(54.0, 55.0, 56.0), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(60.0, 61.0, 62.0), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), s1(s0(Vector(66.0, 67.0, 68.0), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(72.0, 73.0, 74.0), Vector(Vector(75.0), Vector(76.0), Vector(77.0)))), s1(s0(Vector(78.0, 79.0, 80.0), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(84.0, 85.0, 86.0), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))), s0(Vector(90.0, 91.0, 92.0), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))), Vector(s3(Vector(s1(s0(Vector(96.0, 97.0, 98.0), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), s0(Vector(102.0, 103.0, 104.0), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s1(s0(Vector(108.0, 109.0, 110.0), Vector(Vector(111.0), Vector(112.0), Vector(113.0))), s0(Vector(114.0, 115.0, 116.0), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))), s1(s0(Vector(120.0, 121.0, 122.0), Vector(Vector(123.0), Vector(124.0), Vector(125.0))), s0(Vector(126.0, 127.0, 128.0), Vector(Vector(129.0), Vector(130.0), Vector(131.0))))), s0(Vector(132.0, 133.0, 134.0), Vector(Vector(135.0), Vector(136.0), Vector(137.0))))))
    val v2: Double = 138.0
    val start = nanoTime()
    var result: Double = 138.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}