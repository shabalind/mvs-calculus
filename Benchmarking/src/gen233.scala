import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s2 (
    p0: s1,
    p1: s1,
    p2: Vector[Vector[s0]],
    p3: Vector[s1],
    p4: s1
  )
  @noinline
  def f0(v0: s2, v1: s2, v2: Double): Double = {
    val v7: Vector[Double] = Vector(v2, v2, v2, v2, v2, v2)
    val v4: s1 = v0.p0
    val v8: s0 = v4.p0
    val v9: Double = v7(2)
    val v12: Vector[Double] = v8.p0
    val v3: Double = v12(0)
    val v11: Double = v12(0)
    var v15: Vector[Double] = v7
    v15 = v15.updated(3, v3)
    val v20: Double = v12(0)
    val v17: Double = v12(0)
    v15 = v15.updated(1, v20)
    v15 = v15.updated(2, v9)
    var v21: Vector[Double] = v12
    val v43: Double = v21(0)
    v15 = v15.updated(5, v11)
    val v102: Double = v15(2)
    val v82: Double = v102 - v17
    v15 = v15.updated(3, v43)
    v82
  }
  def benchmark(): Unit = {
    val v0: s2 = s2(s1(s0(Vector(0.0), Vector(Vector(1.0))), s0(Vector(2.0), Vector(Vector(3.0)))), s1(s0(Vector(4.0), Vector(Vector(5.0))), s0(Vector(6.0), Vector(Vector(7.0)))), Vector(Vector(s0(Vector(8.0), Vector(Vector(9.0)))), Vector(s0(Vector(10.0), Vector(Vector(11.0)))), Vector(s0(Vector(12.0), Vector(Vector(13.0))))), Vector(s1(s0(Vector(14.0), Vector(Vector(15.0))), s0(Vector(16.0), Vector(Vector(17.0)))), s1(s0(Vector(18.0), Vector(Vector(19.0))), s0(Vector(20.0), Vector(Vector(21.0))))), s1(s0(Vector(22.0), Vector(Vector(23.0))), s0(Vector(24.0), Vector(Vector(25.0)))))
    val v1: s2 = s2(s1(s0(Vector(26.0), Vector(Vector(27.0))), s0(Vector(28.0), Vector(Vector(29.0)))), s1(s0(Vector(30.0), Vector(Vector(31.0))), s0(Vector(32.0), Vector(Vector(33.0)))), Vector(Vector(s0(Vector(34.0), Vector(Vector(35.0)))), Vector(s0(Vector(36.0), Vector(Vector(37.0)))), Vector(s0(Vector(38.0), Vector(Vector(39.0))))), Vector(s1(s0(Vector(40.0), Vector(Vector(41.0))), s0(Vector(42.0), Vector(Vector(43.0)))), s1(s0(Vector(44.0), Vector(Vector(45.0))), s0(Vector(46.0), Vector(Vector(47.0))))), s1(s0(Vector(48.0), Vector(Vector(49.0))), s0(Vector(50.0), Vector(Vector(51.0)))))
    val v2: Double = 52.0
    val start = nanoTime()
    var result: Double = 52.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}