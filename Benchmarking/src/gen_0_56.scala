import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1,
    p2: s1
  )
  case class s3 (
    p0: Vector[s2]
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: s3, v2: Double): Double = {
    val v7: Vector[s2] = v0(0)
    val v6: Vector[s2] = v1.p0
    var v5: Vector[s2] = v7
    v5 = v6
    val v9: s2 = v5(0)
    val v20: s2 = v7(0)
    v5 = v5.updated(0, v20)
    val v42: s2 = v6(0)
    v5 = v5.updated(0, v42)
    val v76: s1 = v9.p0
    val v75: s0 = v76.p1
    val v100: Vector[Vector[Double]] = v75.p1
    val v102: Vector[Double] = v100(1)
    val v104: Double = v102(0)
    v104
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(s1(Vector(Vector(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0))))), s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0)))), s1(Vector(Vector(s0(Vector(8.0, 9.0), Vector(Vector(10.0), Vector(11.0))))), s0(Vector(12.0, 13.0), Vector(Vector(14.0), Vector(15.0)))), s1(Vector(Vector(s0(Vector(16.0, 17.0), Vector(Vector(18.0), Vector(19.0))))), s0(Vector(20.0, 21.0), Vector(Vector(22.0), Vector(23.0)))))), Vector(s2(s1(Vector(Vector(s0(Vector(24.0, 25.0), Vector(Vector(26.0), Vector(27.0))))), s0(Vector(28.0, 29.0), Vector(Vector(30.0), Vector(31.0)))), s1(Vector(Vector(s0(Vector(32.0, 33.0), Vector(Vector(34.0), Vector(35.0))))), s0(Vector(36.0, 37.0), Vector(Vector(38.0), Vector(39.0)))), s1(Vector(Vector(s0(Vector(40.0, 41.0), Vector(Vector(42.0), Vector(43.0))))), s0(Vector(44.0, 45.0), Vector(Vector(46.0), Vector(47.0)))))), Vector(s2(s1(Vector(Vector(s0(Vector(48.0, 49.0), Vector(Vector(50.0), Vector(51.0))))), s0(Vector(52.0, 53.0), Vector(Vector(54.0), Vector(55.0)))), s1(Vector(Vector(s0(Vector(56.0, 57.0), Vector(Vector(58.0), Vector(59.0))))), s0(Vector(60.0, 61.0), Vector(Vector(62.0), Vector(63.0)))), s1(Vector(Vector(s0(Vector(64.0, 65.0), Vector(Vector(66.0), Vector(67.0))))), s0(Vector(68.0, 69.0), Vector(Vector(70.0), Vector(71.0)))))))
    val v1: s3 = s3(Vector(s2(s1(Vector(Vector(s0(Vector(72.0, 73.0), Vector(Vector(74.0), Vector(75.0))))), s0(Vector(76.0, 77.0), Vector(Vector(78.0), Vector(79.0)))), s1(Vector(Vector(s0(Vector(80.0, 81.0), Vector(Vector(82.0), Vector(83.0))))), s0(Vector(84.0, 85.0), Vector(Vector(86.0), Vector(87.0)))), s1(Vector(Vector(s0(Vector(88.0, 89.0), Vector(Vector(90.0), Vector(91.0))))), s0(Vector(92.0, 93.0), Vector(Vector(94.0), Vector(95.0)))))))
    val v2: Double = 96.0
    val start = nanoTime()
    var result: Double = 96.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}