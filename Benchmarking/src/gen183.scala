import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  case class s3 (
    p0: s0
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: s2
  )
  case class s7 (
    p0: Vector[s4],
    p1: Vector[Vector[s4]]
  )
  case class s8 (
    p0: Vector[s7]
  )
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: s0, v2: Vector[Vector[s3]], v3: s8, v4: Double): Double = {
    var v6: Double = v4
    val v14: Vector[Vector[Double]] = v1.p1
    var v10: Vector[Vector[Double]] = v14
    val v19: Vector[Vector[Double]] = v1.p0
    val v21: Vector[Double] = v19(0)
    v10 = v10.updated(0, v21)
    v10 = v10.updated(0, v21)
    val v22: Vector[Double] = v10(0)
    val v50: Double = v22(0)
    val v56: Double = v50 + v6
    val v51: Double = v6 + v56
    v51
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0)), Vector(Vector(1.0))))))
    val v1: s0 = s0(Vector(Vector(2.0)), Vector(Vector(3.0)))
    val v2: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(4.0)), Vector(Vector(5.0))))))
    val v3: s8 = s8(Vector(s7(Vector(s4(Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0))))), s2(Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0))))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0)))))), s4(Vector(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0))))), s2(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0)))))), s4(Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))), s2(Vector(Vector(s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0))))))), Vector(Vector(s4(Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0))))), s2(Vector(Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0))))), s2(Vector(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), Vector(s0(Vector(Vector(44.0)), Vector(Vector(45.0))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))))), s2(Vector(Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0))))), Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0))))))))), s7(Vector(s4(Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0)))), Vector(s0(Vector(Vector(56.0)), Vector(Vector(57.0))))), s2(Vector(Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0))))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0)))))), s4(Vector(Vector(s0(Vector(Vector(62.0)), Vector(Vector(63.0)))), Vector(s0(Vector(Vector(64.0)), Vector(Vector(65.0))))), s2(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0))))), Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0)))))), s4(Vector(Vector(s0(Vector(Vector(70.0)), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0))))), s2(Vector(Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0))))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0))))))), Vector(Vector(s4(Vector(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0)))), Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0))))), s2(Vector(Vector(s0(Vector(Vector(82.0)), Vector(Vector(83.0))))), Vector(s0(Vector(Vector(84.0)), Vector(Vector(85.0))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(86.0)), Vector(Vector(87.0)))), Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0))))), s2(Vector(Vector(s0(Vector(Vector(90.0)), Vector(Vector(91.0))))), Vector(s0(Vector(Vector(92.0)), Vector(Vector(93.0))))))), Vector(s4(Vector(Vector(s0(Vector(Vector(94.0)), Vector(Vector(95.0)))), Vector(s0(Vector(Vector(96.0)), Vector(Vector(97.0))))), s2(Vector(Vector(s0(Vector(Vector(98.0)), Vector(Vector(99.0))))), Vector(s0(Vector(Vector(100.0)), Vector(Vector(101.0)))))))))))
    val v4: Double = 102.0
    val start = nanoTime()
    var result: Double = 102.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}