import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s6 (
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    var v5: Vector[s1] = v0
    val v7: s1 = v0(1)
    val v8: s1 = v5(1)
    v5 = v5.updated(1, v7)
    val v11: Vector[s0] = v8.p1
    val v10: s0 = v11(0)
    val v16: s6 = s6(v7, v10)
    val v27: s0 = v16.p1
    val v102: Vector[Vector[Double]] = v27.p2
    val v277: Vector[Double] = v102(1)
    val v109: Double = v277(0)
    v109
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0)), Vector(Vector(10.0))), Vector(s0(Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0), Vector(23.0)), Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0)), Vector(Vector(31.0)), Vector(Vector(32.0))))), s1(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0))), Vector(s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)), Vector(Vector(54.0))), s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)), Vector(Vector(64.0)), Vector(Vector(65.0))))), s1(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)), Vector(Vector(75.0)), Vector(Vector(76.0))), Vector(s0(Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0)), Vector(Vector(81.0), Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)), Vector(Vector(87.0))), s0(Vector(Vector(88.0), Vector(89.0)), Vector(Vector(90.0), Vector(91.0)), Vector(Vector(92.0), Vector(93.0), Vector(94.0)), Vector(Vector(95.0), Vector(96.0)), Vector(Vector(97.0)), Vector(Vector(98.0))))))
    val v1: Double = 99.0
    val start = nanoTime()
    var result: Double = 99.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}