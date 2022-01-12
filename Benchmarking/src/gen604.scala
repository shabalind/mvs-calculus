import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: Vector[Double],
    p1: s0
  )
  case class s3 (
    p0: Vector[s0],
    p1: s2
  )
  case class s4 (
    p0: s2,
    p1: Vector[s3]
  )
  case class s6 (
    p0: s2,
    p1: s2
  )
  def f57(v0: s4): s4 = {
    v0
  }
  def f10(v0: s4, v1: s4): s4 = {
    val v7: s2 = v0.p0
    var v3: s2 = v7
    val v9: s2 = v1.p0
    var v5: s2 = v3
    val v4: s4 = f57(v0)
    v3 = v9
    var v19: s4 = v4
    var v17: s4 = v19
    val v44: Vector[s3] = v1.p1
    v19 = v19.copy(p0 = v3)
    v17 = v17.copy(p1 = v44)
    val v22: s0 = v5.p1
    var v23: s0 = v22
    var v40: s0 = v22
    val v55: Vector[Vector[Double]] = v22.p0
    val v36: Vector[Vector[Double]] = v23.p1
    v17 = v17.copy(p0 = v5)
    v5 = v5.copy(p1 = v40)
    v40 = v40.copy(p0 = v55)
    val v74: s4 = f57(v17)
    v40 = v40.copy(p1 = v36)
    v74
  }
  @noinline
  def f0(v0: Vector[Vector[s6]], v1: s4, v2: Double): Double = {
    var v7: s4 = v1
    val v10: s4 = f10(v1, v7)
    var v8: s4 = v10
    val v5: s2 = v8.p0
    val v13: s2 = v10.p0
    val v23: s0 = v5.p1
    v7 = v7.copy(p0 = v5)
    val v28: Vector[Vector[Double]] = v23.p0
    var v39: Vector[Vector[Double]] = v28
    v7 = v7.copy(p0 = v13)
    v8 = v8.copy(p0 = v13)
    v7 = v7.copy(p0 = v5)
    val v29: Vector[Double] = v39(1)
    v8 = v8.copy(p0 = v5)
    v7 = v7.copy(p0 = v5)
    val v41: Double = v29(0)
    v39 = v39.updated(1, v29)
    v41
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s6]] = Vector(Vector(s6(s2(Vector(0.0, 1.0), s0(Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0), Vector(6.0)))), s2(Vector(7.0, 8.0), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)))))))
    val v1: s4 = s4(s2(Vector(14.0, 15.0), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)))), Vector(s3(Vector(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0), Vector(25.0))), s0(Vector(Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0), Vector(30.0))), s0(Vector(Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))), s2(Vector(36.0, 37.0), s0(Vector(Vector(38.0), Vector(39.0)), Vector(Vector(40.0), Vector(41.0), Vector(42.0))))), s3(Vector(s0(Vector(Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0), Vector(52.0))), s0(Vector(Vector(53.0), Vector(54.0)), Vector(Vector(55.0), Vector(56.0), Vector(57.0)))), s2(Vector(58.0, 59.0), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0), Vector(64.0))))), s3(Vector(s0(Vector(Vector(65.0), Vector(66.0)), Vector(Vector(67.0), Vector(68.0), Vector(69.0))), s0(Vector(Vector(70.0), Vector(71.0)), Vector(Vector(72.0), Vector(73.0), Vector(74.0))), s0(Vector(Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0), Vector(79.0)))), s2(Vector(80.0, 81.0), s0(Vector(Vector(82.0), Vector(83.0)), Vector(Vector(84.0), Vector(85.0), Vector(86.0)))))))
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