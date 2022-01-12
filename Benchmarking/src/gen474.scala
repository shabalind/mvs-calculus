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
    p0: s1,
    p1: s0
  )
  case class s4 (
    p0: s1,
    p1: s2
  )
  case class s12 (
    p0: Vector[s4],
    p1: s2
  )
  def f15(v0: Double): Double = {
    val v6: Double = v0 * v0
    var v3: Double = v6
    var v5: Double = v0
    var v4: Double = v0
    var v1: Double = v3
    var v8: Double = v4
    val v10: Vector[Double] = Vector(v6, v6, v0, v1)
    val v25: Vector[Vector[Double]] = Vector(v10, v10, v10, v10, v10)
    val v12: Vector[Double] = v25(4)
    val v18: Vector[Double] = v25(4)
    var v14: Vector[Vector[Double]] = v25
    var v17: Vector[Vector[Double]] = v14
    v17 = v17.updated(3, v10)
    var v37: Vector[Double] = v12
    val v26: Vector[Double] = v17(3)
    v37 = v37.updated(1, v0)
    v14 = v14.updated(1, v18)
    val v57: Double = v8 + v5
    val v41: Double = v12(0)
    v17 = v17.updated(3, v37)
    v14 = v14.updated(4, v12)
    var v24: Vector[Double] = v26
    v14 = v14.updated(0, v26)
    val v48: Double = v24(3)
    v24 = v24.updated(0, v1)
    v24 = v24.updated(3, v57)
    v37 = v37.updated(2, v3)
    var v61: Double = v48
    val v63: Double = v61 * v41
    v63
  }
  @noinline
  def f0(v0: Vector[s12], v1: Double): Double = {
    var v5: Double = v1
    val v4: Double = f15(v1)
    val v3: Double = f15(v4)
    v5 = v3
    var v23: Double = v5
    val v32: Double = f15(v23)
    v23 = v32
    v32
  }
  def benchmark(): Unit = {
    val v0: Vector[s12] = Vector(s12(Vector(s4(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), s2(s1(Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0), Vector(27.0))))), s4(s1(Vector(s0(Vector(Vector(28.0), Vector(29.0)), Vector(Vector(30.0), Vector(31.0))), s0(Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0)))), s2(s1(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0))), s0(Vector(Vector(44.0), Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)))), s0(Vector(Vector(52.0), Vector(53.0)), Vector(Vector(54.0), Vector(55.0)))))), s2(s1(Vector(s0(Vector(Vector(56.0), Vector(57.0)), Vector(Vector(58.0), Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0), Vector(63.0)))), s0(Vector(Vector(64.0), Vector(65.0)), Vector(Vector(66.0), Vector(67.0)))), s0(Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))))))
    val v1: Double = 72.0
    val start = nanoTime()
    var result: Double = 72.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}