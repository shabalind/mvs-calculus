import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[Vector[s0]],
    p1: s0
  )
  case class s2 (
    p0: Vector[s1],
    p1: s0,
    p2: Vector[s0]
  )
  def f22(v0: Double): Double = {
    var v2: Double = v0
    var v7: Double = v0
    var v5: Double = v2
    var v1: Double = v7
    var v4: Double = v5
    v2 = v1
    v4
  }
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Vector[Vector[s1]], v3: Vector[Vector[s2]], v4: Vector[s0], v5: Double): Double = {
    val v9: Double = v5 - v5
    val v12: Double = f22(v5)
    val v22: Double = v9 - v12
    val v180: Double = v22 + v9
    v180
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))))
    val v2: Vector[Vector[s1]] = Vector(Vector(s1(Vector(Vector(s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))))))
    val v3: Vector[Vector[s2]] = Vector(Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), s0(Vector(Vector(20.0)), Vector(Vector(21.0)))), s1(Vector(Vector(s0(Vector(Vector(22.0)), Vector(Vector(23.0)))), Vector(s0(Vector(Vector(24.0)), Vector(Vector(25.0))))), s0(Vector(Vector(26.0)), Vector(Vector(27.0))))), s0(Vector(Vector(28.0)), Vector(Vector(29.0))), Vector(s0(Vector(Vector(30.0)), Vector(Vector(31.0)))))), Vector(s2(Vector(s1(Vector(Vector(s0(Vector(Vector(32.0)), Vector(Vector(33.0)))), Vector(s0(Vector(Vector(34.0)), Vector(Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)))), s1(Vector(Vector(s0(Vector(Vector(38.0)), Vector(Vector(39.0)))), Vector(s0(Vector(Vector(40.0)), Vector(Vector(41.0))))), s0(Vector(Vector(42.0)), Vector(Vector(43.0))))), s0(Vector(Vector(44.0)), Vector(Vector(45.0))), Vector(s0(Vector(Vector(46.0)), Vector(Vector(47.0)))))))
    val v4: Vector[s0] = Vector(s0(Vector(Vector(48.0)), Vector(Vector(49.0))))
    val v5: Double = 50.0
    val start = nanoTime()
    var result: Double = 50.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}