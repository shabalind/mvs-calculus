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
    p0: Vector[Vector[s0]],
    p1: Vector[s0]
  )
  def f5(v0: s1): s1 = {
    val v1: Vector[s0] = v0.p1
    val v2: s0 = v1(1)
    val v17: Vector[s0] = v0.p1
    val v21: s1 = s1(v2, v17)
    v21
  }
  @noinline
  def f0(v0: Vector[s2], v1: s1, v2: Vector[s2], v3: Double): Double = {
    val v7: Vector[s0] = v1.p1
    val v5: s0 = v7(0)
    val v9: Vector[Vector[Double]] = v5.p1
    val v11: Vector[Double] = v9(1)
    val v13: s1 = f5(v1)
    var v8: Vector[Double] = v11
    val v17: s0 = v13.p0
    v8 = v11
    val v23: Vector[Vector[Double]] = v17.p1
    v8 = v8.updated(0, v3)
    val v47: Vector[Vector[Double]] = v5.p0
    val v31: Vector[Double] = v23(0)
    val v21: Vector[Vector[Double]] = v5.p0
    var v29: Vector[Vector[Double]] = v21
    var v51: Vector[Vector[Double]] = v47
    val v44: Double = v31(0)
    val v58: Vector[Double] = v29(0)
    v8 = v8.updated(0, v3)
    v29 = v51
    val v55: Double = v58(0)
    v8 = v8.updated(0, v44)
    val v120: Vector[Double] = v51(0)
    v29 = v29.updated(0, v8)
    v29 = v29.updated(0, v11)
    var v73: Vector[Double] = v11
    v51 = v51.updated(0, v73)
    val v53: Double = v55 - v3
    val v123: Double = v3 - v53
    v51 = v51.updated(0, v120)
    v29 = v29.updated(0, v11)
    v123
  }
  def benchmark(): Unit = {
    val v0: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0)))), Vector(s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0)))), Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))))), Vector(s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))), s2(Vector(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))))), Vector(s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0))))), s2(Vector(Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0)))), Vector(s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))))), Vector(s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0))))))
    val v1: s1 = s1(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), Vector(s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0)))))
    val v2: Vector[s2] = Vector(s2(Vector(Vector(s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0)))), Vector(s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0))))), Vector(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))))), s2(Vector(Vector(s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0)))), Vector(s0(Vector(Vector(60.0)), Vector(Vector(61.0), Vector(62.0)))), Vector(s0(Vector(Vector(63.0)), Vector(Vector(64.0), Vector(65.0))))), Vector(s0(Vector(Vector(66.0)), Vector(Vector(67.0), Vector(68.0))))))
    val v3: Double = 69.0
    val start = nanoTime()
    var result: Double = 69.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}