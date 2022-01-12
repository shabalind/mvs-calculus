import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  case class s3 (
    p0: s1,
    p1: Vector[Double]
  )
  case class s7 (
    p0: Vector[s3],
    p1: s1
  )
  def f86(v0: Double): Double = {
    var v7: Double = v0
    v7 = v0
    var v1: Double = v7
    var v6: Double = v0
    var v9: Double = v7
    var v4: Double = v1
    var v14: Double = v6
    v9 = v6
    val v21: Vector[Double] = Vector(v0, v0, v6, v4, v9, v0)
    var v25: Vector[Double] = v21
    var v40: Double = v0
    val v23: Double = v21(2)
    v25 = v25.updated(3, v14)
    var v20: Double = v23
    val v57: Double = v25(5)
    var v32: Vector[Double] = v21
    v25 = v25.updated(5, v7)
    v25 = v25.updated(2, v20)
    val v64: Double = v32(2)
    val v61: Double = v21(2)
    v1 = v40
    v25 = v25.updated(5, v64)
    v25 = v25.updated(3, v61)
    v57
  }
  @noinline
  def f0(v0: s7, v1: Double): Double = {
    val v17: Double = f86(v1)
    val v10: Vector[Double] = Vector(v1, v1)
    var v13: Double = v17
    var v25: Double = v13
    var v48: Vector[Double] = v10
    val v39: Vector[Vector[Double]] = Vector(v10, v10, v10, v48, v48, v48)
    val v61: Vector[Double] = v39(1)
    val v147: Double = v10(0)
    val v73: Double = f86(v147)
    v48 = v48.updated(1, v25)
    val v115: Double = v61(0)
    v48 = v48.updated(0, v73)
    v115
  }
  def benchmark(): Unit = {
    val v0: s7 = s7(Vector(s3(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(10.0))), s1(s0(Vector(Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0), Vector(20.0)))))
    val v1: Double = 21.0
    val start = nanoTime()
    var result: Double = 21.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}