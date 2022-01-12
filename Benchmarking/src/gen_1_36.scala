import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s7 (
    p0: s2,
    p1: Vector[s3]
  )
  @noinline
  def f0(v0: Vector[s7], v1: Double): Double = {
    val v2: s7 = v0(0)
    val v6: s2 = v2.p0
    val v11: Vector[Vector[s0]] = v6.p1
    val v27: Vector[s0] = v11(1)
    val v70: s0 = v27(0)
    var v111: s0 = v70
    val v91: Vector[Vector[Double]] = v70.p1
    val v143: Vector[Vector[Double]] = v111.p1
    val v172: Vector[Double] = v143(0)
    val v112: Double = v172(0)
    v111 = v111.copy(p1 = v91)
    v112
  }
  def benchmark(): Unit = {
    val v0: Vector[s7] = Vector(s7(s2(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))), Vector(Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))))), Vector(s3(Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s2(Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0))))), Vector(Vector(s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), Vector(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0))))))), s3(Vector(s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))), s2(Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0)))), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), Vector(Vector(55.0))))), Vector(Vector(s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0)))), Vector(s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), Vector(Vector(67.0))))))), s3(Vector(s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), s2(Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0)))), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))), Vector(Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(Vector(83.0)))), Vector(s0(Vector(Vector(84.0), Vector(85.0), Vector(86.0)), Vector(Vector(87.0)))), Vector(s0(Vector(Vector(88.0), Vector(89.0), Vector(90.0)), Vector(Vector(91.0))))))))))
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