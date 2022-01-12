import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s6 (
    p0: Vector[s1],
    p1: s3
  )
  case class s7 (
    p0: s3,
    p1: Vector[s6]
  )
  def f17(v0: Double): Double = {
    var v3: Double = v0
    var v2: Double = v0
    var v7: Double = v0
    var v6: Double = v7
    var v8: Double = v6
    var v4: Double = v6
    val v5: Double = v7 - v2
    var v10: Double = v3
    var v1: Double = v10
    var v11: Double = v7
    var v12: Double = v6
    var v9: Double = v12
    var v13: Double = v5
    var v18: Double = v12
    var v15: Double = v11
    var v20: Double = v3
    val v14: Vector[Double] = Vector(v18, v2, v7, v6, v6, v15, v20)
    var v17: Vector[Double] = v14
    v17 = v17.updated(6, v13)
    v17 = v17.updated(2, v1)
    var v40: Double = v18
    var v29: Vector[Double] = v17
    var v25: Vector[Double] = v29
    v40 = v7
    v29 = v29.updated(1, v40)
    val v55: Vector[Vector[Double]] = Vector(v14, v25, v17, v25, v29)
    val v57: Vector[Double] = v55(3)
    v17 = v17.updated(3, v9)
    v17 = v17.updated(4, v4)
    v17 = v17.updated(3, v8)
    v25 = v25.updated(4, v20)
    val v124: Double = v57(5)
    v29 = v29.updated(4, v11)
    v124
  }
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v28: Double = v1 + v1
    val v34: Double = f17(v28)
    var v20: Double = v34
    val v19: Double = f17(v34)
    val v31: Vector[Double] = Vector(v20, v1, v19, v20, v34)
    var v44: Vector[Double] = v31
    val v67: Double = v44(0)
    v67
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))), Vector(s6(Vector(s1(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0))), Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))), s3(s1(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))), Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))))), s6(Vector(s1(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))), s1(s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0))), Vector(s0(Vector(Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))))), s1(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0))), Vector(s0(Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0), Vector(98.0), Vector(99.0)))))), s3(s1(s0(Vector(Vector(100.0), Vector(101.0)), Vector(Vector(102.0), Vector(103.0), Vector(104.0))), Vector(s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0), Vector(108.0), Vector(109.0))))), Vector(s0(Vector(Vector(110.0), Vector(111.0)), Vector(Vector(112.0), Vector(113.0), Vector(114.0))), s0(Vector(Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))))
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