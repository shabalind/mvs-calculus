import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s3 (
    p0: Vector[s2],
    p1: Vector[Vector[s2]]
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: Vector[s2] = v0.p0
    val v5: Vector[s2] = v0.p0
    val v8: s2 = v2(0)
    val v4: Vector[s1] = v8.p0
    val v9: s2 = v5(0)
    val v12: s0 = v9.p1
    val v16: s1 = v4(0)
    val v21: Vector[s0] = v16.p0
    val v17: Vector[s0] = Vector(v12, v12, v12, v12)
    val v30: s0 = v21(0)
    var v19: Vector[s0] = v21
    val v43: s0 = v19(0)
    val v85: Vector[Vector[Double]] = v43.p0
    v19 = v19.updated(1, v30)
    val v81: Vector[Double] = v85(0)
    val v41: Vector[s0] = v16.p0
    v19 = v19.updated(0, v30)
    val v69: s0 = v41(1)
    val v75: s0 = v17(2)
    v19 = v19.updated(0, v69)
    v19 = v19.updated(0, v75)
    val v106: Double = v81(0)
    v106
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))), s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0)))), s2(Vector(s1(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))))), s1(Vector(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))))), Vector(Vector(s2(Vector(s1(Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))))), s1(Vector(s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0)))), Vector(s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0)))))), s0(Vector(Vector(78.0), Vector(79.0)), Vector(Vector(80.0)))))))
    val v1: Double = 81.0
    val start = nanoTime()
    var result: Double = 81.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}