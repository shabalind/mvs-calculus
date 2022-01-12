import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s1],
    p1: s1
  )
  case class s5 (
    p0: s0,
    p1: s2
  )
  case class s8 (
    p0: Vector[Vector[s5]],
    p1: s3
  )
  @noinline
  def f0(v0: Vector[s8], v1: Vector[s5], v2: Double): Double = {
    val v3: s5 = v1(2)
    val v6: s0 = v3.p0
    val v8: Double = v2 - v2
    val v19: s5 = v1(2)
    val v24: s0 = v19.p0
    var v39: s0 = v6
    val v30: Vector[Vector[Double]] = v6.p0
    v39 = v39.copy(p0 = v30)
    var v60: s0 = v24
    val v31: Vector[Vector[Double]] = v60.p1
    v39 = v39.copy(p1 = v31)
    val v66: Vector[Double] = v31(0)
    val v48: Double = v8 - v8
    v60 = v60.copy(p0 = v30)
    val v119: Double = v66(0)
    val v143: Double = v119 - v48
    v60 = v39
    v143
  }
  def benchmark(): Unit = {
    val v0: Vector[s8] = Vector(s8(Vector(Vector(s5(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s2(Vector(Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))))))))), s3(Vector(s1(Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))))), s1(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), s1(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))), s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))))))))
    val v1: Vector[s5] = Vector(s5(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), s2(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0))))))), s5(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s2(Vector(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))))), s5(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s2(Vector(Vector(s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))))))))
    val v2: Double = 92.0
    val start = nanoTime()
    var result: Double = 92.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}