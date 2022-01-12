import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  def f47(v0: Double): Double = {
    val v5: Double = v0 + v0
    var v2: Double = v0
    var v7: Double = v2
    v2 = v0
    val v6: Double = v7 * v5
    var v8: Double = v2
    var v1: Double = v5
    var v9: Double = v6
    var v12: Double = v5
    var v4: Double = v1
    val v20: Double = v9 / v1
    var v13: Double = v1
    var v10: Double = v12
    var v11: Double = v13
    var v30: Double = v11
    val v15: Vector[Double] = Vector(v4, v8, v10, v6)
    var v23: Vector[Double] = v15
    var v27: Vector[Double] = v23
    v27 = v27.updated(1, v0)
    var v115: Vector[Double] = v27
    v27 = v27.updated(1, v8)
    v23 = v23.updated(3, v20)
    v115 = v115.updated(3, v20)
    v27 = v27.updated(2, v30)
    val v28: Double = v115(1)
    v23 = v23.updated(1, v30)
    v115 = v115.updated(3, v28)
    v28
  }
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v7: Double = v1
    val v4: Double = f47(v1)
    var v17: Double = v4
    var v16: Double = v17
    var v27: Double = v4
    val v43: Double = f47(v7)
    val v56: Double = v43 * v16
    var v102: Double = v56
    val v120: Double = v102 / v102
    v7 = v27
    v7 = v27
    v120
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0))), Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0))))), s1(s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0), Vector(63.0))))), s1(s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))), s0(Vector(Vector(80.0), Vector(81.0)), Vector(Vector(82.0), Vector(83.0), Vector(84.0)), Vector(Vector(85.0), Vector(86.0), Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0), Vector(92.0)), Vector(Vector(93.0), Vector(94.0), Vector(95.0))))))
    val v1: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}