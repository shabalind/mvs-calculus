import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: s0
  )
  case class s5 (
    p0: Vector[s0]
  )
  case class s6 (
    p0: s2,
    p1: s5
  )
  @noinline
  def f0(v0: Vector[s6], v1: Double): Double = {
    val v6: s6 = v0(2)
    val v3: s5 = v6.p1
    val v11: Vector[s0] = v3.p0
    val v13: s0 = v11(0)
    val v39: Vector[Vector[Double]] = v13.p1
    val v59: Vector[Double] = v39(0)
    val v61: s0 = v11(0)
    val v48: Vector[Vector[Double]] = v61.p0
    val v68: Vector[Double] = v48(2)
    val v136: Double = v59(0)
    var v174: Vector[Double] = v68
    v174 = v174.updated(0, v136)
    val v284: Double = v174(0)
    v284
  }
  def benchmark(): Unit = {
    val v0: Vector[s6] = Vector(s6(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s5(Vector(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)))))), s6(s2(s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), s5(Vector(s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0)))))), s6(s2(s0(Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0), Vector(41.0))), s0(Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0)))), s5(Vector(s0(Vector(Vector(48.0), Vector(49.0), Vector(50.0)), Vector(Vector(51.0), Vector(52.0), Vector(53.0)))))))
    val v1: Double = 54.0
    val start = nanoTime()
    var result: Double = 54.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}