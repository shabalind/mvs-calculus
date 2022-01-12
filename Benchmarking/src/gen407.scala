import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: s0, v3: s0, v4: Double): Double = {
    var v6: Double = v4
    val v7: s0 = v0(0)
    val v9: Vector[Vector[Double]] = v7.p1
    var v10: Vector[Vector[Double]] = v9
    val v37: Vector[Vector[Double]] = v3.p0
    val v11: Vector[Double] = v37(1)
    var v26: Vector[Double] = v11
    val v16: Vector[Double] = v37(0)
    v26 = v26.updated(0, v6)
    val v20: Vector[Vector[Double]] = v3.p0
    v10 = v10.updated(0, v16)
    var v19: Vector[Vector[Double]] = v20
    val v31: Vector[Double] = v10(0)
    val v63: Vector[Double] = v19(1)
    val v66: Double = v31(0)
    v26 = v26.updated(0, v66)
    v26 = v26.updated(0, v4)
    val v61: Vector[Vector[Double]] = Vector(v26, v26, v63, v11, v63)
    v26 = v26.updated(0, v66)
    val v67: Vector[Double] = v61(4)
    val v153: Double = v67(0)
    v153
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