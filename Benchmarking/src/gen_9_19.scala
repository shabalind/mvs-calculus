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
  case class s3 (
    p0: Vector[s2],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s3, v1: Double): Double = {
    val v2: Vector[s0] = v0.p1
    var v5: Double = v1
    val v13: s0 = v2(0)
    var v37: Double = v5
    val v28: Vector[Vector[Double]] = v13.p1
    val v102: Vector[Double] = v28(2)
    var v39: Vector[Double] = v102
    val v48: Double = v37 + v5
    val v58: Double = v39(0)
    val v89: Double = v5 + v58
    val v82: Double = v89 + v1
    val v83: Double = v58 - v82
    v39 = v39.updated(0, v48)
    v83
  }
  def benchmark(): Unit = {
    val v0: s3 = s3(Vector(s2(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0), Vector(5.0))), s0(Vector(Vector(6.0), Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))), s2(s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0), Vector(16.0), Vector(17.0))), s0(Vector(Vector(18.0), Vector(19.0), Vector(20.0)), Vector(Vector(21.0), Vector(22.0), Vector(23.0))))), Vector(s0(Vector(Vector(24.0), Vector(25.0), Vector(26.0)), Vector(Vector(27.0), Vector(28.0), Vector(29.0)))))
    val v1: Double = 30.0
    val start = nanoTime()
    var result: Double = 30.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}