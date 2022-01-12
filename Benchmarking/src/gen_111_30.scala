import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]],
    p4: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s3 (
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s3], v1: s3, v2: Double): Double = {
    val v5: s1 = v1.p0
    val v8: Vector[s0] = v5.p1
    val v4: s0 = v8(0)
    val v3: Vector[Vector[Double]] = v4.p4
    val v14: Vector[Double] = v3(0)
    val v9: Vector[Double] = v3(0)
    val v36: Double = v14(0)
    var v17: Double = v2
    val v20: Double = v9(0)
    val v44: Double = v14(0)
    val v84: Vector[Double] = Vector(v44, v17, v2, v36, v20, v2, v36)
    val v94: Double = v84(1)
    val v98: Double = v94 + v94
    v98
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0), Vector(28.0)), Vector(Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0)))))
    val v1: s3 = s3(s1(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0), Vector(48.0)), Vector(Vector(49.0))), Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0)), Vector(Vector(53.0), Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0))))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0), Vector(75.0)), Vector(Vector(76.0), Vector(77.0), Vector(78.0)), Vector(Vector(79.0))))
    val v2: Double = 80.0
    val start = nanoTime()
    var result: Double = 80.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}