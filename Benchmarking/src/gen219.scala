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
    p1: Vector[s0]
  )
  def f46(v0: s0): s0 = {
    var v8: s0 = v0
    v8 = v0
    var v12: s0 = v8
    val v10: Vector[Vector[Double]] = v12.p1
    val v49: Vector[Vector[Double]] = v0.p0
    v12 = v12.copy(p0 = v49)
    var v51: s0 = v12
    v8 = v8.copy(p1 = v10)
    v8 = v8.copy(p0 = v49)
    v51
  }
  @noinline
  def f0(v0: Vector[s3], v1: s3, v2: Vector[Vector[s3]], v3: Vector[Vector[s1]], v4: Double): Double = {
    var v5: Double = v4
    val v7: s0 = v1.p0
    val v21: s0 = f46(v7)
    val v16: Vector[Vector[Double]] = v21.p1
    val v28: Double = v5 * v4
    val v30: Vector[Double] = v16(0)
    val v19: Double = v30(0)
    var v42: Double = v4
    var v41: Double = v4
    val v56: Vector[Double] = Vector(v28, v42, v28, v19, v4)
    val v83: Double = v56(0)
    val v155: Double = v41 + v83
    v155
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), s3(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), s3(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))
    val v1: s3 = s3(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))), s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))))), Vector(s3(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))), s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0)))))))
    val v3: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0))), s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))))))
    val v4: Double = 104.0
    val start = nanoTime()
    var result: Double = 104.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}