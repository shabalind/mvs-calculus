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
    p0: Vector[s0],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Vector[s2], v2: s2, v3: s1, v4: Double): Double = {
    val v8: s0 = v3.p1
    var v5: s0 = v8
    var v7: s0 = v5
    val v31: Vector[Vector[Double]] = v7.p1
    v5 = v5.copy(p1 = v31)
    var v33: Vector[Vector[Double]] = v31
    var v46: Vector[Vector[Double]] = v31
    val v53: Vector[Double] = v33(0)
    v46 = v46.updated(0, v53)
    val v23: Vector[Double] = v46(0)
    v33 = v33.updated(0, v23)
    var v90: Vector[Vector[Double]] = v33
    v90 = v90.updated(0, v53)
    v90 = v90.updated(0, v53)
    var v96: Vector[Vector[Double]] = v90
    v33 = v33.updated(0, v53)
    v5 = v5.copy(p1 = v31)
    val v87: Vector[Double] = v96(0)
    v46 = v46.updated(0, v53)
    val v171: Double = v87(0)
    v171
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0))), s0(Vector(Vector(3.0)), Vector(Vector(4.0), Vector(5.0))))
    val v1: Vector[s2] = Vector(s2(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0), Vector(8.0))), s0(Vector(Vector(9.0)), Vector(Vector(10.0), Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), s0(Vector(Vector(15.0)), Vector(Vector(16.0), Vector(17.0))))), s2(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0), Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0), Vector(26.0))), s0(Vector(Vector(27.0)), Vector(Vector(28.0), Vector(29.0))))), s2(Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0), Vector(32.0))), s0(Vector(Vector(33.0)), Vector(Vector(34.0), Vector(35.0)))), Vector(s0(Vector(Vector(36.0)), Vector(Vector(37.0), Vector(38.0))), s0(Vector(Vector(39.0)), Vector(Vector(40.0), Vector(41.0))))))
    val v2: s2 = s2(Vector(s0(Vector(Vector(42.0)), Vector(Vector(43.0), Vector(44.0))), s0(Vector(Vector(45.0)), Vector(Vector(46.0), Vector(47.0)))), Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0), Vector(50.0))), s0(Vector(Vector(51.0)), Vector(Vector(52.0), Vector(53.0)))))
    val v3: s1 = s1(s0(Vector(Vector(54.0)), Vector(Vector(55.0), Vector(56.0))), s0(Vector(Vector(57.0)), Vector(Vector(58.0), Vector(59.0))))
    val v4: Double = 60.0
    val start = nanoTime()
    var result: Double = 60.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}