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
    p0: s1,
    p1: s1
  )
  case class s3 (
    p0: Vector[s0],
    p1: s0
  )
  case class s6 (
    p0: Vector[s3],
    p1: s0
  )
  case class s10 (
    p0: s2,
    p1: s6
  )
  def f32(v0: Double, v1: s0): Double = {
    val v8: Vector[Vector[Double]] = v1.p0
    var v4: Vector[Vector[Double]] = v8
    val v3: Vector[Double] = v4(0)
    val v2: Vector[Vector[Double]] = v1.p1
    val v5: Double = v3(0)
    val v7: Vector[Double] = v2(2)
    val v17: Vector[Vector[Double]] = v1.p0
    val v18: Vector[Vector[Double]] = v1.p1
    val v20: Vector[Double] = v18(0)
    v4 = v4.updated(0, v7)
    v4 = v4.updated(0, v20)
    val v12: Vector[Double] = v17(1)
    val v16: Double = v12(0)
    val v26: Double = v5 - v16
    v4 = v4.updated(0, v3)
    v26
  }
  @noinline
  def f0(v0: Vector[Vector[s10]], v1: s3, v2: Double): Double = {
    var v7: s3 = v1
    val v5: Vector[s0] = v7.p0
    val v10: Vector[s0] = v7.p0
    val v22: s0 = v10(0)
    val v60: Double = f32(v2, v22)
    v7 = v7.copy(p0 = v5)
    val v62: Double = f32(v60, v22)
    v62
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s10]] = Vector(Vector(s10(s2(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))))), s1(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))))))), s6(Vector(s3(Vector(s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))))), Vector(s10(s2(s1(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), s1(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0))), Vector(Vector(s0(Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0), Vector(54.0))))))), s6(Vector(s3(Vector(s0(Vector(Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0)))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))), s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0)))))))
    val v1: s3 = s3(Vector(s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0)))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0))))
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