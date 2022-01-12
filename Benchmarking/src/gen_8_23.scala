import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]],
    p3: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s1], v2: Double): Double = {
    var v3: Double = v2
    val v8: s0 = v0(0)
    val v4: Vector[s0] = Vector(v8)
    val v6: s0 = v0(0)
    var v16: Double = v3
    val v18: s0 = v4(0)
    var v12: Vector[s0] = v4
    v12 = v12.updated(0, v18)
    val v45: s0 = v12(0)
    val v20: Vector[Vector[Double]] = v45.p1
    val v26: Vector[Double] = v20(2)
    val v36: Double = v26(0)
    v12 = v12.updated(0, v6)
    val v88: Double = v36 / v16
    v88
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0))), s0(Vector(Vector(7.0)), Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0))))
    val v1: Vector[s1] = Vector(s1(s0(Vector(Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0)), Vector(Vector(20.0))), s0(Vector(Vector(21.0)), Vector(Vector(22.0), Vector(23.0), Vector(24.0)), Vector(Vector(25.0), Vector(26.0)), Vector(Vector(27.0)))), s1(s0(Vector(Vector(28.0)), Vector(Vector(29.0), Vector(30.0), Vector(31.0)), Vector(Vector(32.0), Vector(33.0)), Vector(Vector(34.0))), s0(Vector(Vector(35.0)), Vector(Vector(36.0), Vector(37.0), Vector(38.0)), Vector(Vector(39.0), Vector(40.0)), Vector(Vector(41.0)))))
    val v2: Double = 42.0
    val start = nanoTime()
    var result: Double = 42.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}