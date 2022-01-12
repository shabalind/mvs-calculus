import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: Vector[s0],
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v8: s1 = v0(0)
    val v9: Vector[s0] = v8.p1
    val v10: s0 = v9(0)
    val v11: s0 = v9(0)
    val v14: s0 = v9(0)
    var v21: s0 = v11
    val v17: Vector[Vector[Double]] = v10.p0
    v21 = v21.copy(p0 = v17)
    val v24: Vector[Vector[Double]] = v14.p0
    val v49: Vector[Double] = v24(2)
    var v31: Vector[Double] = v49
    val v54: Vector[Vector[Double]] = v21.p1
    val v36: Vector[Double] = v17(2)
    val v57: Vector[Double] = v54(0)
    val v164: Vector[Vector[Double]] = Vector(v31, v31, v49, v31, v57, v36)
    val v104: Vector[Double] = v164(0)
    val v169: Double = v104(0)
    v169
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(Vector(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0)))), Vector(s0(Vector(Vector(8.0), Vector(9.0), Vector(10.0)), Vector(Vector(11.0))))))
    val v1: Double = 12.0
    val start = nanoTime()
    var result: Double = 12.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}