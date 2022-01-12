import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: s0
  )
  case class s7 (
    p0: Double
  )
  @noinline
  def f0(v0: s2, v1: s7, v2: Double): Double = {
    val v13: s0 = v0.p1
    var v9: s0 = v13
    var v4: s0 = v9
    val v21: s0 = v0.p1
    val v19: s0 = v0.p1
    val v14: Vector[Vector[Double]] = v4.p1
    val v17: Vector[Vector[s1]] = v0.p0
    val v25: Vector[s1] = v17(2)
    val v32: Vector[Double] = v14(0)
    val v35: s1 = v25(0)
    val v40: Vector[Vector[Double]] = Vector(v32, v32)
    val v43: Vector[Vector[Double]] = v19.p1
    val v39: Vector[Double] = v40(0)
    val v24: Double = v39(0)
    val v58: s0 = v35.p1
    v9 = v9.copy(p1 = v43)
    val v73: Vector[Vector[Double]] = v58.p0
    val v56: Vector[Vector[Double]] = v21.p1
    v9 = v9.copy(p1 = v56)
    v4 = v4.copy(p0 = v56)
    v4 = v4.copy(p1 = v73)
    v9 = v9.copy(p1 = v73)
    v24
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s1(Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))), Vector(s1(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0), Vector(56.0)), Vector(Vector(57.0), Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0), Vector(65.0)))), s0(Vector(Vector(66.0), Vector(67.0), Vector(68.0)), Vector(Vector(69.0), Vector(70.0), Vector(71.0)))))), s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), Vector(Vector(75.0), Vector(76.0), Vector(77.0))))
    val v1: s7 = s7(78.0)
    val v2: Double = 79.0
    val start = nanoTime()
    var result: Double = 79.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}