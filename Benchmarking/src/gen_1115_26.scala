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
    p0: Vector[s1],
    p1: Vector[Vector[s1]],
    p2: s0,
    p3: Vector[s0]
  )
  case class s6 (
    p0: s2,
    p1: s0
  )
  def f68(v0: Double): Double = {
    val v5: Double = v0 * v0
    var v2: Double = v5
    v2 = v5
    var v7: Double = v2
    var v4: Double = v7
    var v1: Double = v5
    var v3: Double = v0
    var v6: Double = v2
    var v8: Double = v6
    val v14: Double = v8 - v3
    var v11: Double = v1
    v6 = v11
    var v19: Double = v14
    var v15: Double = v4
    var v16: Double = v15
    val v9: Vector[Double] = Vector(v11, v19, v15, v4)
    val v21: Double = v9(0)
    val v52: Double = v16 + v21
    v52
  }
  @noinline
  def f0(v0: s6, v1: Double): Double = {
    var v11: Double = v1
    val v26: Double = f68(v11)
    v26
  }
  def benchmark(): Unit = {
    val v0: s6 = s6(s2(Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0)))), s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0)))), s1(Vector(s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0)))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))))), Vector(Vector(s1(Vector(s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0)))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))))), Vector(s1(Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))))), Vector(s1(Vector(s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))), s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0)))))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0))))
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