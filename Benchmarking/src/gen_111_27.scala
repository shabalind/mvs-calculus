import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: s1, v1: Vector[Vector[Double]], v2: Double): Double = {
    val v7: Vector[Double] = v1(0)
    val v9: Vector[Double] = v1(0)
    val v3: Double = v9(0)
    val v10: Double = v9(0)
    val v11: Double = v7(0)
    val v6: Double = v7(0)
    val v29: Vector[Double] = v1(0)
    val v69: Double = v29(0)
    var v37: Vector[Double] = v7
    v37 = v37.updated(0, v3)
    var v43: Double = v6
    val v57: Double = v37(0)
    val v116: Double = v57 / v11
    v37 = v37.updated(0, v43)
    v37 = v37.updated(0, v69)
    var v79: Double = v10
    v37 = v37.updated(0, v79)
    v116
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))))
    val v1: Vector[Vector[Double]] = Vector(Vector(10.0))
    val v2: Double = 11.0
    val start = nanoTime()
    var result: Double = 11.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}