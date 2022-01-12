import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Double],
    p4: Vector[Vector[Double]],
    p5: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0
  )
  case class s4 (
    p0: Vector[s1],
    p1: s0
  )
  @noinline
  def f0(v0: Vector[Vector[s4]], v1: Double): Double = {
    val v3: Vector[s4] = v0(0)
    val v5: s4 = v3(0)
    val v7: s0 = v5.p1
    val v8: s0 = v5.p1
    val v17: Vector[Vector[Double]] = v8.p2
    val v50: Vector[Double] = v17(0)
    val v24: Vector[Vector[Double]] = v7.p2
    val v20: Double = v50(0)
    val v72: Vector[Double] = v24(0)
    var v67: Vector[Double] = v72
    val v211: Double = v67(0)
    v67 = v67.updated(0, v20)
    v211
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s4]] = Vector(Vector(s4(Vector(s1(s0(Vector(Vector(0.0)), Vector(Vector(1.0)), Vector(Vector(2.0)), Vector(3.0, 4.0, 5.0), Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s1(s0(Vector(Vector(12.0)), Vector(Vector(13.0)), Vector(Vector(14.0)), Vector(15.0, 16.0, 17.0), Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0)))), s1(s0(Vector(Vector(24.0)), Vector(Vector(25.0)), Vector(Vector(26.0)), Vector(27.0, 28.0, 29.0), Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0), Vector(35.0))))), s0(Vector(Vector(36.0)), Vector(Vector(37.0)), Vector(Vector(38.0)), Vector(39.0, 40.0, 41.0), Vector(Vector(42.0), Vector(43.0), Vector(44.0)), Vector(Vector(45.0), Vector(46.0), Vector(47.0))))))
    val v1: Double = 48.0
    val start = nanoTime()
    var result: Double = 48.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}