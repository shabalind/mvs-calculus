import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[Vector[s1]]
  )
  case class s5 (
    p0: s1,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s3], v1: s5, v2: Double): Double = {
    val v3: Vector[Double] = Vector(v2, v2, v2, v2, v2, v2)
    val v11: Double = v2 / v2
    var v18: Double = v11
    var v16: Vector[Double] = v3
    val v15: Vector[Vector[Double]] = Vector(v3, v16, v3, v3, v3)
    val v17: Double = v3(3)
    v16 = v16.updated(2, v11)
    v16 = v16.updated(5, v17)
    v16 = v16.updated(5, v17)
    v16 = v16.updated(3, v18)
    val v23: Vector[Double] = v15(2)
    val v33: Double = v23(4)
    v16 = v16.updated(1, v18)
    v33
  }
  def benchmark(): Unit = {
    val v0: Vector[s3] = Vector(s3(s1(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))), s3(s1(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))))), s3(s1(Vector(Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))), Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0))))), s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s1(Vector(Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))), s0(Vector(Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))))
    val v1: s5 = s5(s1(Vector(Vector(s0(Vector(Vector(72.0)), Vector(Vector(73.0), Vector(74.0))))), s0(Vector(Vector(75.0)), Vector(Vector(76.0), Vector(77.0)))), s0(Vector(Vector(78.0)), Vector(Vector(79.0), Vector(80.0))))
    val v2: Double = 81.0
    val start = nanoTime()
    var result: Double = 81.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}