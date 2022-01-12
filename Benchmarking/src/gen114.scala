import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0,
    p2: Vector[Vector[s0]]
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s2]], v1: Vector[s3], v2: Double): Double = {
    var v4: Double = v2
    var v7: Double = v2
    var v8: Double = v7
    val v12: Double = v8 / v7
    var v19: Double = v8
    var v60: Double = v12
    val v36: Double = v19 + v2
    v7 = v2
    v4 = v36
    var v198: Double = v4
    v60 = v19
    val v91: Vector[Double] = Vector(v198, v60)
    val v305: Double = v91(0)
    v305
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s1(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), s1(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), Vector(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))))), Vector(s2(Vector(s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), s1(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), s1(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), Vector(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), Vector(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))))))), Vector(s2(Vector(s1(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0)))), s1(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), Vector(Vector(s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))), Vector(s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0))))))))
    val v1: Vector[s3] = Vector(s3(s0(Vector(Vector(81.0), Vector(82.0)), Vector(Vector(83.0))), s0(Vector(Vector(84.0), Vector(85.0)), Vector(Vector(86.0)))))
    val v2: Double = 87.0
    val start = nanoTime()
    var result: Double = 87.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}