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
    p2: Vector[s0],
    p3: Vector[s0]
  )
  case class s2 (
    p0: Vector[Vector[s1]],
    p1: Vector[Vector[s1]]
  )
  def f14(v0: Double): Double = {
    var v6: Double = v0
    var v4: Double = v0
    var v1: Double = v6
    var v7: Double = v0
    var v8: Double = v4
    v1 = v7
    var v5: Double = v4
    var v3: Double = v7
    var v11: Double = v3
    var v2: Double = v8
    val v13: Vector[Double] = Vector(v8, v5, v2, v8, v6, v1)
    v1 = v11
    val v10: Double = v13(5)
    val v14: Double = v13(2)
    var v34: Vector[Double] = v13
    val v32: Double = v34(2)
    v34 = v34.updated(3, v14)
    v34 = v34.updated(3, v10)
    v34 = v34.updated(3, v0)
    v34 = v34.updated(2, v2)
    v32
  }
  @noinline
  def f0(v0: s2, v1: Double): Double = {
    var v8: Double = v1
    val v9: Double = f14(v8)
    var v7: Double = v8
    val v11: Double = f14(v9)
    v8 = v7
    val v142: Double = v11 * v11
    v142
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(Vector(Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0))), s0(Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0))), Vector(s0(Vector(Vector(6.0), Vector(7.0)), Vector(Vector(8.0))), s0(Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0))), s0(Vector(Vector(15.0), Vector(16.0)), Vector(Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0)))))), Vector(s1(s0(Vector(Vector(21.0), Vector(22.0)), Vector(Vector(23.0))), s0(Vector(Vector(24.0), Vector(25.0)), Vector(Vector(26.0))), Vector(s0(Vector(Vector(27.0), Vector(28.0)), Vector(Vector(29.0))), s0(Vector(Vector(30.0), Vector(31.0)), Vector(Vector(32.0)))), Vector(s0(Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0))), s0(Vector(Vector(36.0), Vector(37.0)), Vector(Vector(38.0))), s0(Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0))))))), Vector(Vector(s1(s0(Vector(Vector(42.0), Vector(43.0)), Vector(Vector(44.0))), s0(Vector(Vector(45.0), Vector(46.0)), Vector(Vector(47.0))), Vector(s0(Vector(Vector(48.0), Vector(49.0)), Vector(Vector(50.0))), s0(Vector(Vector(51.0), Vector(52.0)), Vector(Vector(53.0)))), Vector(s0(Vector(Vector(54.0), Vector(55.0)), Vector(Vector(56.0))), s0(Vector(Vector(57.0), Vector(58.0)), Vector(Vector(59.0))), s0(Vector(Vector(60.0), Vector(61.0)), Vector(Vector(62.0))))))))
    val v1: Double = 63.0
    val start = nanoTime()
    var result: Double = 63.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}