import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]],
    p2: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Double
  )
  @noinline
  def f0(v0: Vector[s1], v1: Double): Double = {
    val v5: s1 = v0(0)
    val v4: s1 = v0(2)
    val v8: Double = v4.p1
    val v3: s1 = v0(0)
    val v7: s0 = v3.p0
    val v28: Vector[Vector[Double]] = v7.p0
    val v29: Vector[Double] = v28(1)
    val v23: Vector[Vector[Double]] = v7.p0
    val v33: Double = v5.p1
    val v26: Double = v1 / v8
    var v35: Vector[Double] = v29
    val v42: Double = v26 + v1
    val v19: Double = v35(0)
    v35 = v35.updated(0, v33)
    val v30: Vector[Double] = v23(0)
    var v43: Vector[Double] = v29
    val v46: Double = v30(0)
    var v31: Double = v42
    v35 = v35.updated(0, v42)
    v31 = v46
    v43 = v43.updated(0, v19)
    v43 = v43.updated(0, v46)
    val v92: Double = v35(0)
    v35 = v35.updated(0, v19)
    v35 = v35.updated(0, v92)
    val v82: Double = v43(0)
    v43 = v43.updated(0, v19)
    v35 = v35.updated(0, v31)
    v82
  }
  def benchmark(): Unit = {
    val v0: Vector[s1] = Vector(s1(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)), Vector(Vector(4.0), Vector(5.0))), 6.0), s1(s0(Vector(Vector(7.0), Vector(8.0)), Vector(Vector(9.0), Vector(10.0)), Vector(Vector(11.0), Vector(12.0))), 13.0), s1(s0(Vector(Vector(14.0), Vector(15.0)), Vector(Vector(16.0), Vector(17.0)), Vector(Vector(18.0), Vector(19.0))), 20.0))
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