import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: Vector[s0], v2: Double): Double = {
    var v3: Double = v2
    var v8: Vector[s0] = v1
    val v7: s0 = v0(1)
    v8 = v8.updated(1, v7)
    v8 = v8.updated(0, v7)
    val v4: Double = v2 * v3
    val v9: s0 = v8(1)
    v8 = v8.updated(1, v7)
    v8 = v8.updated(2, v7)
    val v15: s0 = v0(1)
    var v35: Double = v2
    val v21: Vector[Vector[Double]] = v9.p1
    val v27: Vector[Double] = v21(1)
    val v33: Vector[Vector[Double]] = v15.p1
    v3 = v2
    var v63: Double = v2
    var v30: Vector[Double] = v27
    val v40: Vector[Double] = v33(0)
    v30 = v30.updated(0, v2)
    val v67: Double = v4 / v63
    val v28: Double = v40(0)
    v30 = v30.updated(0, v67)
    var v73: Vector[Double] = v40
    v73 = v40
    v73 = v73.updated(0, v3)
    val v80: Double = v30(0)
    val v85: Double = v27(0)
    var v88: Double = v80
    v73 = v73.updated(0, v35)
    val v86: Double = v73(0)
    val v151: Vector[Double] = Vector(v2, v88, v28, v86, v4)
    val v119: Double = v151(2)
    var v259: Double = v119
    v30 = v30.updated(0, v85)
    v259
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))))
    val v1: Vector[s0] = Vector(s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))), s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0))), s0(Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))))
    val v2: Double = 20.0
    val start = nanoTime()
    var result: Double = 20.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}