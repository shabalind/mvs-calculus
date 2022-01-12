import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[s0], v1: s0, v2: Double): Double = {
    val v7: s0 = v0(0)
    var v6: Double = v2
    val v14: Vector[Vector[Double]] = v7.p0
    val v11: Vector[Double] = v14(1)
    var v29: Double = v2
    val v26: Double = v11(0)
    val v47: Vector[Double] = v14(0)
    var v61: Vector[Double] = v47
    v61 = v61.updated(0, v29)
    v61 = v61.updated(0, v6)
    v29 = v26
    v61 = v61.updated(0, v6)
    val v88: Double = v61(0)
    v88
  }
  def benchmark(): Unit = {
    val v0: Vector[s0] = Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0))), s0(Vector(Vector(8.0), Vector(9.0)), Vector(Vector(10.0), Vector(11.0))))
    val v1: s0 = s0(Vector(Vector(12.0), Vector(13.0)), Vector(Vector(14.0), Vector(15.0)))
    val v2: Double = 16.0
    val start = nanoTime()
    var result: Double = 16.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}