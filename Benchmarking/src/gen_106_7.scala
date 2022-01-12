import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Double
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s2, v1: Vector[s2], v2: s2, v3: s1, v4: s0, v5: s2, v6: Double): Double = {
    val v7: Vector[Double] = Vector(v6, v6)
    var v16: Double = v6
    var v12: Vector[Double] = v7
    var v21: Double = v6
    var v37: Double = v16
    v12 = v12.updated(0, v6)
    val v53: Double = v12(1)
    v12 = v12.updated(1, v37)
    val v26: Double = v12(1)
    val v34: Double = v7(0)
    v12 = v12.updated(0, v21)
    v21 = v34
    v12 = v12.updated(0, v53)
    v12 = v12.updated(1, v21)
    v12 = v12.updated(1, v16)
    val v58: Double = v7(0)
    v12 = v12.updated(1, v26)
    v12 = v12.updated(0, v26)
    var v39: Double = v16
    v12 = v12.updated(0, v34)
    val v61: Double = v12(0)
    val v155: Vector[Double] = Vector(v39, v58, v58, v61, v58, v39, v53)
    v12 = v12.updated(1, v26)
    var v97: Vector[Double] = v155
    v12 = v12.updated(1, v61)
    v21 = v61
    v12 = v12.updated(0, v34)
    val v355: Double = v97(4)
    v355
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), 3.0), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), 7.0), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), 11.0)))
    val v1: Vector[s2] = Vector(s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), 15.0), Vector(s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), 19.0), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), 23.0))), s2(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), 27.0), Vector(s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), 31.0), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), 35.0))), s2(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), 39.0), Vector(s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), 43.0), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), 47.0))))
    val v2: s2 = s2(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), 51.0), Vector(s0(Vector(Vector(52.0), Vector(53.0), Vector(54.0)), 55.0), s0(Vector(Vector(56.0), Vector(57.0), Vector(58.0)), 59.0)))
    val v3: s1 = s1(s0(Vector(Vector(60.0), Vector(61.0), Vector(62.0)), 63.0), s0(Vector(Vector(64.0), Vector(65.0), Vector(66.0)), 67.0))
    val v4: s0 = s0(Vector(Vector(68.0), Vector(69.0), Vector(70.0)), 71.0)
    val v5: s2 = s2(s0(Vector(Vector(72.0), Vector(73.0), Vector(74.0)), 75.0), Vector(s0(Vector(Vector(76.0), Vector(77.0), Vector(78.0)), 79.0), s0(Vector(Vector(80.0), Vector(81.0), Vector(82.0)), 83.0)))
    val v6: Double = 84.0
    val start = nanoTime()
    var result: Double = 84.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}