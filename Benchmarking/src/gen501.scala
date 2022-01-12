import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: Vector[Vector[s0]],
    p3: s0
  )
  case class s3 (
    p0: Vector[Vector[Double]],
    p1: s1
  )
  case class s6 (
    p0: Vector[s3],
    p1: s0
  )
  def f41(v0: Double, v1: s6): Double = {
    var v4: s6 = v1
    val v6: Vector[s3] = v4.p0
    var v3: s6 = v1
    v4 = v3
    val v2: s0 = v1.p1
    val v9: s3 = v6(0)
    val v11: Vector[Vector[Double]] = v9.p0
    val v37: Vector[Double] = v11(1)
    v4 = v4.copy(p0 = v6)
    val v16: s6 = s6(v6, v2)
    v3 = v3.copy(p1 = v2)
    val v19: Double = v37(0)
    v3 = v3.copy(p1 = v2)
    v4 = v4.copy(p0 = v6)
    v4 = v4.copy(p0 = v6)
    val v38: Vector[s3] = v16.p0
    v3 = v3.copy(p1 = v2)
    v4 = v4.copy(p0 = v6)
    v3 = v3.copy(p0 = v6)
    v3 = v3.copy(p1 = v2)
    v4 = v4.copy(p0 = v38)
    v19
  }
  @noinline
  def f0(v0: s3, v1: s6, v2: Double): Double = {
    var v7: s6 = v1
    var v6: s6 = v1
    val v9: Vector[s3] = v6.p0
    val v8: s3 = v9(0)
    v7 = v7.copy(p0 = v9)
    val v12: s3 = v9(2)
    v6 = v6.copy(p0 = v9)
    val v19: s1 = v12.p1
    val v17: Double = f41(v2, v7)
    v7 = v7.copy(p0 = v9)
    v6 = v6.copy(p0 = v9)
    val v30: Vector[s0] = v19.p0
    val v21: s0 = v30(0)
    v6 = v6.copy(p0 = v9)
    val v26: Vector[Vector[Double]] = v8.p0
    v6 = v6.copy(p0 = v9)
    v6 = v6.copy(p1 = v21)
    v6 = v6.copy(p0 = v9)
    val v59: Vector[Double] = v26(1)
    val v85: Double = v59(0)
    v6 = v6.copy(p0 = v9)
    val v80: Double = v17 / v85
    v6 = v6.copy(p0 = v9)
    var v253: Double = v80
    v253
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(Vector(0.0), Vector(1.0)), s1(Vector(s0(Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0))))), Vector(Vector(s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0), Vector(21.0)))))
    val v1: s6 = s6(Vector(s3(Vector(Vector(22.0), Vector(23.0)), s1(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0)))), Vector(Vector(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))), Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))))), s3(Vector(Vector(44.0), Vector(45.0)), s1(Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))), Vector(Vector(s0(Vector(Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))), Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0))))), Vector(Vector(s0(Vector(Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0))))), s0(Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0))))), s3(Vector(Vector(66.0), Vector(67.0)), s1(Vector(s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))), Vector(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), Vector(Vector(s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0)))))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0))))
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