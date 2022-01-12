import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0,
    p3: s0,
    p4: Vector[Vector[s0]],
    p5: Vector[s0]
  )
  case class s9 (
    p0: Vector[Vector[s0]],
    p1: s1
  )
  def f14(v0: Double): Double = {
    var v7: Double = v0
    v7 = v0
    v7 = v0
    var v4: Double = v7
    var v2: Double = v0
    var v5: Double = v4
    var v3: Double = v5
    var v9: Double = v7
    var v10: Double = v0
    var v6: Double = v2
    var v1: Double = v9
    var v17: Double = v3
    var v14: Double = v10
    val v13: Vector[Double] = Vector(v10, v17, v5, v4)
    var v12: Double = v9
    val v33: Double = v13(1)
    val v15: Vector[Double] = Vector(v33)
    val v38: Double = v13(3)
    val v22: Double = v15(0)
    var v58: Vector[Double] = v15
    v5 = v14
    val v43: Vector[Double] = Vector(v38, v12, v22, v33, v4, v6)
    v58 = v58.updated(0, v1)
    v58 = v58.updated(0, v2)
    v58 = v58.updated(0, v10)
    var v89: Vector[Double] = v43
    var v47: Vector[Double] = v58
    v47 = v47.updated(0, v17)
    val v101: Double = v47(0)
    val v142: Double = v89(4)
    v7 = v142
    v101
  }
  @noinline
  def f0(v0: Vector[s9], v1: Double): Double = {
    val v10: Double = f14(v1)
    val v12: Double = v10 * v10
    v12
  }
  def benchmark(): Unit = {
    val v0: Vector[s9] = Vector(s9(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))))), s1(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), Vector(Vector(s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))))), Vector(s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))))), s9(Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), Vector(s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))), s1(s0(Vector(Vector(78.0), Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0), Vector(88.0), Vector(89.0))), s0(Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))), s0(Vector(Vector(96.0), Vector(97.0), Vector(98.0)), Vector(Vector(99.0), Vector(100.0), Vector(101.0))), Vector(Vector(s0(Vector(Vector(102.0), Vector(103.0), Vector(104.0)), Vector(Vector(105.0), Vector(106.0), Vector(107.0)))), Vector(s0(Vector(Vector(108.0), Vector(109.0), Vector(110.0)), Vector(Vector(111.0), Vector(112.0), Vector(113.0))))), Vector(s0(Vector(Vector(114.0), Vector(115.0), Vector(116.0)), Vector(Vector(117.0), Vector(118.0), Vector(119.0)))))))
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