import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0,
    p3: Vector[s0],
    p4: Vector[Vector[s0]],
    p5: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[s0]
  )
  case class s6 (
    p0: s1,
    p1: s0
  )
  def f31(v0: Double): Double = {
    var v2: Double = v0
    var v7: Double = v2
    var v1: Double = v2
    var v3: Double = v7
    var v6: Double = v2
    var v13: Double = v7
    var v5: Double = v0
    var v11: Double = v3
    var v10: Double = v0
    var v8: Double = v10
    var v31: Double = v1
    var v19: Double = v13
    val v18: Vector[Double] = Vector(v1, v11, v1, v10, v8, v0, v19)
    val v17: Double = v18(5)
    var v21: Vector[Double] = v18
    v21 = v21.updated(2, v11)
    val v27: Double = v18(0)
    val v33: Double = v5 - v27
    val v44: Double = v21(5)
    val v43: Double = v18(4)
    val v41: Double = v19 + v13
    v21 = v21.updated(6, v17)
    var v93: Double = v6
    v21 = v21.updated(6, v93)
    val v28: Vector[Double] = Vector(v44, v8, v0, v41, v43)
    v21 = v21.updated(0, v11)
    var v22: Vector[Double] = v28
    v22 = v22.updated(4, v33)
    v22 = v22.updated(0, v7)
    val v116: Double = v22(1)
    v21 = v21.updated(3, v31)
    v116
  }
  @noinline
  def f0(v0: Vector[s6], v1: s2, v2: Double): Double = {
    val v3: Double = f31(v2)
    var v6: Double = v2
    var v7: Double = v2
    v6 = v2
    v7 = v3
    v6 = v7
    v6
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))), s6(s1(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s6(s1(Vector(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)))))
    val v1: s2 = s2(Vector(Vector(s1(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))))), Vector(s1(Vector(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0))), s0(Vector(Vector(87.0), Vector(88.0)), Vector(Vector(89.0))), Vector(s0(Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0)))), Vector(Vector(s0(Vector(Vector(93.0), Vector(94.0)), Vector(Vector(95.0))))), s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0))))), Vector(s1(Vector(s0(Vector(Vector(99.0), Vector(100.0)), Vector(Vector(101.0)))), s0(Vector(Vector(102.0), Vector(103.0)), Vector(Vector(104.0))), s0(Vector(Vector(105.0), Vector(106.0)), Vector(Vector(107.0))), Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0)))), Vector(Vector(s0(Vector(Vector(111.0), Vector(112.0)), Vector(Vector(113.0))))), s0(Vector(Vector(114.0), Vector(115.0)), Vector(Vector(116.0)))))), Vector(s0(Vector(Vector(117.0), Vector(118.0)), Vector(Vector(119.0))), s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0))), s0(Vector(Vector(123.0), Vector(124.0)), Vector(Vector(125.0)))))
    val v2: Double = 126.0
    val start = nanoTime()
    var result: Double = 126.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}