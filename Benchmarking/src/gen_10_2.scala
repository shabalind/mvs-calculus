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
    p0: s1,
    p1: s0
  )
  case class s3 (
    p0: s0,
    p1: s1,
    p2: s2
  )
  case class s10 (
    p0: Vector[Vector[s2]],
    p1: s3
  )
  def f22(v0: s3): s3 = {
    val v5: s2 = v0.p2
    var v33: s3 = v0
    val v105: s0 = v5.p1
    v33 = v33.copy(p0 = v105)
    v33
  }
  def f16(v0: s2, v1: s1): s2 = {
    var v8: s2 = v0
    v8
  }
  @noinline
  def f0(v0: Vector[Vector[s3]], v1: s10, v2: Double): Double = {
    var v6: s10 = v1
    val v5: Vector[Vector[s2]] = v6.p0
    val v4: s3 = v1.p1
    val v21: s3 = f22(v4)
    val v13: s3 = f22(v21)
    val v10: s3 = f22(v13)
    val v15: s3 = f22(v10)
    val v23: Vector[s2] = v5(0)
    v6 = v6.copy(p1 = v15)
    val v18: s3 = f22(v4)
    val v29: s1 = v4.p1
    v6 = v6.copy(p1 = v18)
    v6 = v6.copy(p1 = v10)
    val v32: s2 = v23(0)
    v6 = v6.copy(p0 = v5)
    val v68: Vector[Vector[s2]] = v6.p0
    val v33: s3 = v6.p1
    val v73: s2 = f16(v32, v29)
    v6 = v6.copy(p0 = v5)
    v6 = v6.copy(p0 = v68)
    val v42: s0 = v73.p1
    v6 = v6.copy(p0 = v5)
    val v218: Vector[Vector[Double]] = v42.p0
    val v40: Vector[Double] = v218(1)
    v6 = v6.copy(p1 = v4)
    v6 = v6.copy(p1 = v33)
    val v110: Double = v40(0)
    v110
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s3]] = Vector(Vector(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s1(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), s2(s1(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), Vector(s3(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0))), s1(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))), s2(s1(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0))), s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
    val v1: s10 = s10(Vector(Vector(s2(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)))), s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))))), s3(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(Vector(78.0), Vector(79.0))), s1(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0), Vector(84.0))), s0(Vector(Vector(85.0), Vector(86.0), Vector(87.0)), Vector(Vector(88.0), Vector(89.0)))), s2(s1(s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0))), s0(Vector(Vector(95.0), Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0)))), s0(Vector(Vector(100.0), Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0))))))
    val v2: Double = 105.0
    val start = nanoTime()
    var result: Double = 105.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}