import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Double]
  )
  case class s1 (
    p0: Vector[s0],
    p1: s0
  )
  def f10(v0: Vector[s0]): Vector[s0] = {
    val v4: s0 = v0(1)
    var v6: Vector[s0] = v0
    v6 = v6.updated(2, v4)
    v6
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v4: Vector[s0] = v0.p0
    val v10: s0 = v4(1)
    val v16: s1 = s1(v4, v10)
    val v15: Vector[s0] = v16.p0
    val v49: Vector[s0] = f10(v15)
    val v30: s0 = v49(1)
    val v34: Vector[Vector[Double]] = v30.p1
    val v36: Vector[Double] = v34(0)
    var v48: Vector[Double] = v36
    val v59: Double = v48(0)
    v59
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0)), Vector(Vector(5.0), Vector(6.0)), Vector(7.0, 8.0, 9.0)), s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0)), Vector(17.0, 18.0, 19.0)), s0(Vector(Vector(20.0), Vector(21.0), Vector(22.0)), Vector(Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(27.0, 28.0, 29.0))), s0(Vector(Vector(30.0), Vector(31.0), Vector(32.0)), Vector(Vector(33.0), Vector(34.0)), Vector(Vector(35.0), Vector(36.0)), Vector(37.0, 38.0, 39.0)))
    val v1: Double = 40.0
    val start = nanoTime()
    var result: Double = 40.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}