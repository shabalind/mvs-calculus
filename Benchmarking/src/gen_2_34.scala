import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0,
    p2: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0
  )
  case class s5 (
    p0: s1,
    p1: Vector[s2]
  )
  def f10(v0: Double): Double = {
    var v7: Double = v0
    v7 = v0
    var v8: Double = v7
    var v4: Double = v0
    var v10: Double = v8
    var v2: Double = v10
    var v6: Double = v4
    var v3: Double = v2
    var v1: Double = v0
    var v13: Double = v1
    var v14: Double = v13
    v4 = v6
    var v34: Double = v2
    var v23: Double = v34
    var v18: Double = v3
    val v17: Vector[Double] = Vector(v18, v23, v8, v4, v8)
    var v49: Vector[Double] = v17
    v49 = v49.updated(2, v6)
    v49 = v49.updated(1, v14)
    val v45: Double = v49(2)
    v45
  }
  @noinline
  def f0(v0: s5, v1: s0, v2: Double): Double = {
    val v4: Double = f10(v2)
    val v18: Double = v4 + v2
    v18
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), Vector(s2(Vector(s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0)))), s1(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))), s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0)))), s2(Vector(s1(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0)))), s1(s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))))), s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0)))), s2(Vector(s1(s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))), s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0)))), s1(s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))), s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0))), s0(Vector(Vector(66.0), Vector(67.0)), Vector(Vector(68.0))))), s0(Vector(Vector(69.0), Vector(70.0)), Vector(Vector(71.0))))))
    val v1: s0 = s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0)))
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