import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[Vector[s0]]
  )
  case class s2 (
    p0: Vector[s0],
    p1: s1,
    p2: s0
  )
  case class s3 (
    p0: s1,
    p1: s1
  )
  @noinline
  def f0(v0: s0, v1: Vector[Vector[s1]], v2: s3, v3: s0, v4: s2, v5: Vector[s3], v6: s2, v7: Double): Double = {
    val v20: Vector[s1] = v1(0)
    var v25: Double = v7
    val v18: s1 = v20(0)
    val v22: s0 = v18.p0
    val v30: Vector[Vector[Double]] = v22.p0
    var v61: Vector[Vector[Double]] = v30
    var v43: Double = v7
    var v28: Vector[Vector[Double]] = v61
    val v29: Double = v25 / v43
    val v137: Double = v29 * v43
    val v77: Vector[Double] = v28(1)
    val v128: Double = v77(0)
    val v246: Double = v128 - v29
    v43 = v246
    v137
  }
  def benchmark(): Unit = {
    val v0: s0 = s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0)))
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), Vector(Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))))))), Vector(s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), Vector(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))))))), Vector(s1(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), Vector(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))))))))
    val v2: s3 = s3(s1(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), Vector(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))))), s1(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))))))
    val v3: s0 = s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))
    val v4: s2 = s2(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))))
    val v5: Vector[s3] = Vector(s3(s1(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), Vector(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0)))))), s1(s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), Vector(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))))))))
    val v6: s2 = s2(Vector(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0)))), s1(s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))), Vector(Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0))))
    val v7: Double = 78.0
    val start = nanoTime()
    var result: Double = 78.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}