import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s1
  )
  case class s5 (
    p0: s1,
    p1: s2
  )
  def f94(v0: Double): Double = {
    val v4: Vector[Double] = Vector(v0)
    val v3: Double = v4(0)
    val v5: Double = v4(0)
    var v1: Vector[Double] = v4
    v1 = v1.updated(0, v3)
    var v8: Vector[Double] = v4
    val v21: Double = v4(0)
    v1 = v1.updated(0, v5)
    var v16: Vector[Double] = v1
    val v25: Double = v16(0)
    val v45: Vector[Vector[Double]] = Vector(v16, v4, v8, v16)
    v8 = v8.updated(0, v25)
    var v69: Double = v21
    val v26: Vector[Double] = v45(3)
    v1 = v1.updated(0, v69)
    val v73: Double = v26(0)
    v73
  }
  @noinline
  def f0(v0: Vector[Vector[s1]], v1: s5, v2: Double): Double = {
    var v4: Double = v2
    val v9: Double = f94(v4)
    val v50: Double = v2 * v4
    val v113: Vector[Double] = Vector(v2, v2, v2, v50, v9, v4)
    val v145: Double = v113(0)
    val v179: Double = v50 * v145
    v179
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s1]] = Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), Vector(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))))
    val v1: s5 = s5(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0)))), s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s2(Vector(Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0))))), Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0))), s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))), s1(Vector(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))
    val v2: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}