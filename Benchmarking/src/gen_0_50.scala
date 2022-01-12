import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Double]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: Vector[s1]
  )
  @noinline
  def f0(v0: Vector[s1], v1: s3, v2: Double): Double = {
    val v4: s0 = v1.p0
    val v6: Vector[Double] = v4.p1
    val v5: Double = v6(0)
    val v13: s0 = v1.p0
    var v19: Double = v5
    v19 = v5
    val v24: Vector[s0] = Vector(v4, v13, v13, v13, v13)
    val v43: s0 = v24(4)
    val v67: Vector[Vector[Double]] = v43.p0
    val v60: Vector[Double] = v67(1)
    var v40: Vector[Double] = v60
    val v135: Double = v40(0)
    v40 = v40.updated(0, v19)
    v135
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(3.0, 4.0)))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(8.0, 9.0))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(13.0, 14.0))), Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(18.0, 19.0))))))
    val v1: s3 = s3(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(23.0, 24.0)), Vector(s1(Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(28.0, 29.0)))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(33.0, 34.0))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(38.0, 39.0))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(43.0, 44.0))))), s1(Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(48.0, 49.0)))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(53.0, 54.0))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(58.0, 59.0))), Vector(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(63.0, 64.0))))), s1(Vector(Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(68.0, 69.0)))), Vector(Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(73.0, 74.0))), Vector(s0(Vector(Vector(75.0), Vector(76.0), Vector(77.0)), Vector(78.0, 79.0))), Vector(s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), Vector(83.0, 84.0)))))))
    val v2: Double = 85.0
    val start = nanoTime()
    var result: Double = 85.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}