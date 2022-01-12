import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s1]
  )
  case class s8 (
    p0: s2,
    p1: Vector[Vector[s2]]
  )
  def f29(v0: Double): Double = {
    var v3: Double = v0
    var v7: Double = v0
    v3 = v7
    var v6: Double = v3
    v3 = v6
    var v2: Double = v0
    var v9: Double = v2
    var v12: Double = v9
    val v13: Vector[Double] = Vector(v3, v12)
    v7 = v2
    val v33: Vector[Vector[Double]] = Vector(v13, v13, v13, v13, v13, v13, v13)
    val v39: Vector[Double] = v33(0)
    var v25: Vector[Double] = v13
    val v35: Double = v39(0)
    var v19: Vector[Double] = v25
    v19 = v19.updated(0, v7)
    var v27: Vector[Double] = v19
    val v48: Double = v27(1)
    v27 = v27.updated(0, v35)
    v48
  }
  @noinline
  def f0(v0: s8, v1: Double): Double = {
    val v5: Double = f29(v1)
    var v7: Double = v5
    v7
  }
  def benchmark(): Unit = {
    val v0: s8 = s8(s2(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), Vector(s1(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))))), Vector(Vector(s2(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0), Vector(35.0))), Vector(s1(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0), Vector(39.0), Vector(40.0)), Vector(Vector(41.0), Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)), Vector(Vector(50.0), Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))))), Vector(s2(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0), Vector(57.0), Vector(58.0)), Vector(Vector(59.0), Vector(60.0)), Vector(Vector(61.0), Vector(62.0))), Vector(s1(s0(Vector(Vector(63.0), Vector(64.0)), Vector(Vector(65.0), Vector(66.0), Vector(67.0)), Vector(Vector(68.0), Vector(69.0)), Vector(Vector(70.0), Vector(71.0))), s0(Vector(Vector(72.0), Vector(73.0)), Vector(Vector(74.0), Vector(75.0), Vector(76.0)), Vector(Vector(77.0), Vector(78.0)), Vector(Vector(79.0), Vector(80.0)))))))))
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