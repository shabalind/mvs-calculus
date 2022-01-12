import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[Vector[s0]],
    p2: s0,
    p3: s0
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v3: s1 = v0(0)
    val v4: s0 = v3.p2
    var v7: s0 = v4
    val v15: Vector[Vector[Double]] = v4.p0
    var v22: Vector[Vector[Double]] = v15
    v7 = v7.copy(p1 = v22)
    val v41: Vector[Vector[Double]] = v7.p0
    val v28: Vector[Vector[Double]] = v7.p1
    val v17: Vector[Vector[Double]] = v7.p1
    val v16: Vector[Double] = v22(0)
    v7 = v7.copy(p1 = v17)
    v22 = v22.updated(0, v16)
    var v36: Vector[Vector[Double]] = v15
    val v37: Vector[Double] = v28(0)
    v22 = v22.updated(0, v37)
    val v39: s0 = s0(v36, v17)
    v7 = v39
    v7 = v7.copy(p1 = v41)
    val v72: Double = v16(0)
    v72
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0))), s0(Vector(Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0)), Vector(Vector(5.0)))), Vector(Vector(s0(Vector(Vector(6.0)), Vector(Vector(7.0))))), s0(Vector(Vector(8.0)), Vector(Vector(9.0))), s0(Vector(Vector(10.0)), Vector(Vector(11.0)))), s1(Vector(s0(Vector(Vector(12.0)), Vector(Vector(13.0))), s0(Vector(Vector(14.0)), Vector(Vector(15.0))), s0(Vector(Vector(16.0)), Vector(Vector(17.0)))), Vector(Vector(s0(Vector(Vector(18.0)), Vector(Vector(19.0))))), s0(Vector(Vector(20.0)), Vector(Vector(21.0))), s0(Vector(Vector(22.0)), Vector(Vector(23.0)))))
    val v1: Double = 24.0
    val start = nanoTime()
    var result: Double = 24.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}