import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s0
  )
  case class s5 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s5, v1: Vector[s2], v2: Double): Double = {
    val v6: s2 = v1(0)
    val v9: s0 = v6.p1
    val v15: s2 = v1(1)
    val v4: Vector[Vector[Double]] = v9.p1
    var v19: Vector[Vector[Double]] = v4
    val v11: Vector[Double] = v19(0)
    val v21: Double = v11(0)
    val v24: s1 = v15.p0
    val v22: Vector[Double] = v4(0)
    v19 = v19.updated(0, v22)
    val v53: Vector[Double] = Vector(v2, v21, v21)
    val v27: s0 = v24.p0
    var v18: Vector[Double] = v53
    val v17: Vector[Vector[Double]] = v27.p0
    val v30: Vector[Double] = v17(1)
    val v26: Double = v18(2)
    val v115: Double = v18(2)
    v18 = v18.updated(2, v115)
    v19 = v19.updated(0, v30)
    val v85: Double = v30(0)
    val v55: Vector[Double] = Vector(v26, v85)
    val v90: Double = v18(2)
    val v128: Double = v55(0)
    val v162: Double = v90 - v128
    v162
  }
  def benchmark(): Unit = {
    val v0: s5 = s5(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), Vector(s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))))
    val v1: Vector[s2] = Vector(s2(s1(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s2(s1(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0))), s0(Vector(Vector(28.0), Vector(29.0), Vector(30.0)), Vector(Vector(31.0)))), s0(Vector(Vector(32.0), Vector(33.0), Vector(34.0)), Vector(Vector(35.0)))), s2(s1(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0))), s0(Vector(Vector(40.0), Vector(41.0), Vector(42.0)), Vector(Vector(43.0)))), s0(Vector(Vector(44.0), Vector(45.0), Vector(46.0)), Vector(Vector(47.0)))))
    val v2: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}