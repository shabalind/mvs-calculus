import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0],
    p2: Vector[Vector[s0]],
    p3: Vector[Vector[s0]]
  )
  case class s2 (
    p0: s1,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    val v2: s1 = v0.p0
    val v7: Vector[s0] = v2.p0
    var v11: Vector[s0] = v7
    var v4: Vector[s0] = v11
    val v8: s0 = v11(2)
    v4 = v4.updated(2, v8)
    val v9: s0 = v4(1)
    val v18: Vector[Vector[Double]] = v9.p1
    v11 = v11.updated(1, v8)
    val v22: Vector[Double] = v18(0)
    val v35: Vector[Vector[Double]] = v9.p0
    v4 = v11
    var v16: s0 = v9
    val v23: Double = v22(0)
    val v19: Vector[Double] = v35(1)
    val v27: Double = v22(0)
    val v34: Double = v19(0)
    v11 = v11.updated(0, v16)
    val v29: Vector[s0] = v2.p1
    val v46: s0 = v29(1)
    var v57: Vector[s0] = v4
    v11 = v11.updated(2, v46)
    val v117: Double = v23 - v34
    v4 = v57
    v57 = v57.updated(1, v8)
    val v188: Double = v117 - v27
    v16 = v16.copy(p0 = v35)
    v188
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0))), s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))), Vector(s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0), Vector(18.0), Vector(19.0))), s0(Vector(Vector(20.0), Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)))), Vector(Vector(s0(Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))), Vector(s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0), Vector(34.0)))), Vector(s0(Vector(Vector(35.0), Vector(36.0)), Vector(Vector(37.0), Vector(38.0), Vector(39.0))))), Vector(Vector(s0(Vector(Vector(40.0), Vector(41.0)), Vector(Vector(42.0), Vector(43.0), Vector(44.0)))))), Vector(s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0), Vector(48.0), Vector(49.0)))))
    val v1: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}