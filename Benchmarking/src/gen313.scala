import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s2,
    p1: Vector[s2]
  )
  case class s4 (
    p0: Vector[s3],
    p1: Vector[s1]
  )
  case class s5 (
    p0: s3,
    p1: Vector[Double]
  )
  case class s6 (
    p0: s4,
    p1: Vector[s5]
  )
  def f59(v0: s6, v1: s5): s5 = {
    val v3: Vector[s5] = v0.p1
    var v2: s6 = v0
    val v5: Vector[s5] = v2.p1
    v2 = v2.copy(p1 = v5)
    v2 = v2.copy(p1 = v5)
    v2 = v2.copy(p1 = v3)
    var v32: Vector[s5] = v5
    v32 = v3
    val v36: s5 = v32(1)
    v36
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    val v4: Vector[s5] = v0.p1
    val v3: s5 = v4(1)
    val v2: s5 = f59(v0, v3)
    val v9: s5 = f59(v0, v2)
    val v67: Vector[Double] = v9.p1
    var v71: Vector[Double] = v67
    v71 = v67
    val v63: Double = v71(1)
    val v115: Double = v63 + v63
    v115
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s4(Vector(s3(s2(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)))), s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))))))), Vector(s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), s1(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)))))), Vector(s5(s3(s2(s1(Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0)))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))))), Vector(64.0, 65.0)), s5(s3(s2(s1(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))), s0(Vector(Vector(70.0)), Vector(Vector(71.0), Vector(72.0), Vector(73.0)))), Vector(s0(Vector(Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), Vector(s2(s1(Vector(s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0), Vector(81.0)))), s0(Vector(Vector(82.0)), Vector(Vector(83.0), Vector(84.0), Vector(85.0)))), Vector(s0(Vector(Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))))), Vector(90.0, 91.0))))
    val v1: Double = 92.0
    val start = nanoTime()
    var result: Double = 92.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}