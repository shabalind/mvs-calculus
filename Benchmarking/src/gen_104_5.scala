import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: s0, v3: s0, v4: Double): Double = {
    val v28: Vector[Double] = Vector(v4, v4, v4)
    val v14: Double = v4 + v4
    val v31: Double = v28(1)
    var v40: Vector[Double] = v28
    val v35: Vector[Double] = Vector(v4, v4, v4, v4, v14)
    val v46: Double = v40(0)
    v40 = v40.updated(0, v31)
    var v74: Vector[Double] = v40
    v74 = v74.updated(1, v46)
    var v45: Vector[Double] = v74
    v45 = v45.updated(0, v46)
    val v115: Double = v35(1)
    v74 = v74.updated(1, v115)
    var v152: Vector[Double] = v45
    val v406: Double = v152(0)
    v406
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: s0 = s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0)))
    val v2: s0 = s0(Vector(Vector(12.0), Vector(13.0), Vector(14.0)), Vector(Vector(15.0)))
    val v3: s0 = s0(Vector(Vector(16.0), Vector(17.0), Vector(18.0)), Vector(Vector(19.0)))
    val v4: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3, v4)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}