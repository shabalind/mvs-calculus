import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Double]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: Double): Double = {
    var v6: Vector[Vector[s1]] = v0
    val v4: Vector[s1] = v6(2)
    val v7: s1 = v4(0)
    val v3: s0 = v7.p0
    v6 = v6.updated(0, v4)
    var v9: s0 = v3
    val v15: Vector[Vector[Double]] = v9.p0
    var v21: s0 = v9
    v21 = v21.copy(p0 = v15)
    v21 = v21.copy(p2 = v15)
    val v38: Vector[Double] = v21.p4
    v6 = v6.updated(2, v4)
    v6 = v0
    val v50: Double = v38(1)
    v50
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), Vector(9.0, 10.0, 11.0)), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0)), Vector(Vector(19.0), Vector(20.0)), Vector(21.0, 22.0, 23.0))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0), Vector(32.0)), Vector(33.0, 34.0, 35.0))), Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0)), Vector(45.0, 46.0, 47.0)))))), Vector(s1(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0)), Vector(57.0, 58.0, 59.0)), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0)), Vector(69.0, 70.0, 71.0))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0)), Vector(81.0, 82.0, 83.0))), Vector(s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0), Vector(87.0), Vector(88.0)), Vector(Vector(89.0), Vector(90.0)), Vector(Vector(91.0), Vector(92.0)), Vector(93.0, 94.0, 95.0)))))), Vector(s1(s0(Vector(Vector(96.0), Vector(97.0)), Vector(Vector(98.0), Vector(99.0), Vector(100.0)), Vector(Vector(101.0), Vector(102.0)), Vector(Vector(103.0), Vector(104.0)), Vector(105.0, 106.0, 107.0)), Vector(Vector(s0(Vector(Vector(108.0), Vector(109.0)), Vector(Vector(110.0), Vector(111.0), Vector(112.0)), Vector(Vector(113.0), Vector(114.0)), Vector(Vector(115.0), Vector(116.0)), Vector(117.0, 118.0, 119.0))), Vector(s0(Vector(Vector(120.0), Vector(121.0)), Vector(Vector(122.0), Vector(123.0), Vector(124.0)), Vector(Vector(125.0), Vector(126.0)), Vector(Vector(127.0), Vector(128.0)), Vector(129.0, 130.0, 131.0))), Vector(s0(Vector(Vector(132.0), Vector(133.0)), Vector(Vector(134.0), Vector(135.0), Vector(136.0)), Vector(Vector(137.0), Vector(138.0)), Vector(Vector(139.0), Vector(140.0)), Vector(141.0, 142.0, 143.0)))))))
    val v1: Double = 144.0
    val start = nanoTime()
    var result: Double = 144.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}