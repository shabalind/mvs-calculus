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
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[Vector[s1]],
    p1: Vector[s2]
  )
  case class s4 (
    p0: s1,
    p1: Vector[Vector[s1]],
    p2: s3,
    p3: s3
  )
  def f53(v0: Double): Double = {
    var v4: Double = v0
    var v1: Double = v4
    var v8: Double = v1
    v8
  }
  def f27(v0: Double): Double = {
    val v4: Double = v0 / v0
    val v6: Vector[Double] = Vector(v4, v0, v0, v0, v4, v4, v4)
    val v1: Double = v6(1)
    val v5: Double = f53(v1)
    val v8: Double = v6(1)
    var v7: Vector[Double] = v6
    var v9: Vector[Double] = v7
    var v13: Double = v1
    v9 = v9.updated(0, v13)
    val v12: Double = f53(v13)
    var v22: Double = v4
    val v18: Double = f53(v8)
    var v15: Double = v4
    val v34: Double = f53(v18)
    val v17: Double = v6(4)
    var v16: Double = v22
    v9 = v9.updated(1, v17)
    v7 = v7.updated(6, v12)
    v7 = v7.updated(0, v16)
    v9 = v9.updated(5, v15)
    val v25: Double = f53(v34)
    var v38: Double = v5
    v9 = v9.updated(0, v25)
    val v69: Double = f53(v38)
    val v46: Double = v9(6)
    var v32: Vector[Double] = v9
    val v44: Double = v6(4)
    val v39: Double = v32(2)
    v32 = v32.updated(4, v69)
    v9 = v9.updated(0, v44)
    v9 = v9.updated(4, v17)
    v32 = v32.updated(1, v1)
    val v142: Double = v46 + v39
    v142
  }
  @noinline
  def f0(v0: s4, v1: Double): Double = {
    var v7: Double = v1
    val v9: Double = f53(v7)
    var v6: Double = v9
    v7 = v6
    val v8: Vector[Double] = Vector(v6, v7, v9, v6)
    val v11: Double = v8(0)
    val v12: Double = v8(0)
    v7 = v12
    val v59: Double = f27(v11)
    v59
  }
  def benchmark(): Unit = {
    val v0: s4 = s4(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(Vector(s1(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))))), Vector(s1(s0(Vector(Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0), Vector(27.0))), s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), Vector(s1(s0(Vector(Vector(40.0)), Vector(Vector(41.0), Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))))), Vector(s2(Vector(s1(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0), Vector(51.0))), s0(Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)))), s1(s0(Vector(Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0)))), s1(s0(Vector(Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))))), s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)))))), s3(Vector(Vector(s1(s0(Vector(Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))))), Vector(s1(s0(Vector(Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0)), Vector(Vector(89.0), Vector(90.0), Vector(91.0)))))), Vector(s2(Vector(s1(s0(Vector(Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))), s1(s0(Vector(Vector(100.0)), Vector(Vector(101.0), Vector(102.0), Vector(103.0))), s0(Vector(Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), s1(s0(Vector(Vector(108.0)), Vector(Vector(109.0), Vector(110.0), Vector(111.0))), s0(Vector(Vector(112.0)), Vector(Vector(113.0), Vector(114.0), Vector(115.0))))), s0(Vector(Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))
    val v1: Double = 120.0
    val start = nanoTime()
    var result: Double = 120.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}