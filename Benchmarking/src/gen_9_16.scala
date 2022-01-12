import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s2 (
    p0: s0,
    p1: Double
  )
  case class s3 (
    p0: s0,
    p1: s0
  )
  case class s4 (
    p0: s3,
    p1: s2
  )
  @noinline
  def f0(v0: Vector[s4], v1: Double): Double = {
    val v2: s4 = v0(0)
    val v5: s2 = v2.p1
    var v7: Double = v1
    var v9: Double = v1
    val v4: s0 = v5.p0
    v9 = v7
    val v12: Vector[Vector[Double]] = v4.p0
    v7 = v1
    val v40: Vector[Double] = v12(1)
    val v24: Vector[Vector[Double]] = v4.p0
    val v50: Vector[Double] = v24(1)
    val v68: Double = v5.p1
    val v26: Double = v50(0)
    var v32: Vector[Double] = v40
    v32 = v32.updated(0, v7)
    v32 = v32.updated(0, v9)
    v32 = v32.updated(0, v68)
    val v81: Double = v32(0)
    v32 = v32.updated(0, v26)
    v81
  }
  def benchmark(): Unit = {
    val v0: Vector[s4] = Vector(s4(s3(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0), Vector(4.0))), s0(Vector(Vector(5.0), Vector(6.0), Vector(7.0)), Vector(Vector(8.0), Vector(9.0)))), s2(s0(Vector(Vector(10.0), Vector(11.0), Vector(12.0)), Vector(Vector(13.0), Vector(14.0))), 15.0)))
    val v1: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}