import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  case class s4 (
    p0: Vector[Vector[s0]],
    p1: Vector[Vector[s0]]
  )
  @noinline
  def f0(v0: Vector[s4], v1: s2, v2: Double): Double = {
    val v5: s4 = v0(0)
    val v3: Vector[Vector[s0]] = v5.p1
    val v8: Vector[s0] = v3(1)
    val v9: s0 = v8(0)
    val v19: Vector[Vector[Double]] = v9.p0
    var v29: Double = v2
    val v34: Vector[Double] = v19(0)
    var v23: Vector[Double] = v34
    val v36: Vector[Vector[Double]] = v9.p0
    v23 = v23.updated(0, v2)
    val v37: Vector[Double] = v36(1)
    v23 = v23.updated(0, v2)
    var v48: Double = v2
    val v51: Double = v23(0)
    v23 = v23.updated(0, v48)
    val v60: Double = v2 + v2
    val v159: Double = v29 - v51
    v23 = v23.updated(0, v60)
    var v200: Double = v159
    val v85: Double = v48 * v51
    val v192: Double = v37(0)
    val v135: Double = v85 * v192
    v23 = v23.updated(0, v200)
    v135
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))))), Vector(Vector(s0(Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), Vector(s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)))), Vector(s0(Vector(Vector(25.0), Vector(26.0), Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))))), s4(Vector(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))))), Vector(Vector(s0(Vector(Vector(45.0), Vector(46.0), Vector(47.0)), Vector(Vector(48.0), Vector(49.0)))), Vector(s0(Vector(Vector(50.0), Vector(51.0), Vector(52.0)), Vector(Vector(53.0), Vector(54.0)))), Vector(s0(Vector(Vector(55.0), Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))))))
    val v1: s2 = s2(s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), Vector(Vector(63.0), Vector(64.0))), Vector(s0(Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0))))), Vector(s0(Vector(Vector(70.0), Vector(71.0), Vector(72.0)), Vector(Vector(73.0), Vector(74.0)))))
    val v2: Double = 75.0
    val start = nanoTime()
    var result: Double = 75.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}