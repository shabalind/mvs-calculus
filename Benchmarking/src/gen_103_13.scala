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
  def f26(v0: Double): Double = {
    var v3: Double = v0
    var v1: Double = v0
    val v9: Vector[Double] = Vector(v0, v1, v3, v1, v0, v1, v1)
    val v7: Double = v9(2)
    val v4: Double = v9(6)
    var v6: Vector[Double] = v9
    v6 = v6.updated(0, v1)
    v3 = v4
    val v15: Double = v6(5)
    v1 = v15
    var v2: Vector[Double] = v6
    v6 = v6.updated(3, v7)
    val v11: Double = v6(4)
    v2 = v2.updated(1, v0)
    val v17: Double = v9(5)
    v6 = v6.updated(2, v4)
    v6 = v9
    var v34: Vector[Double] = v2
    var v61: Double = v11
    var v21: Vector[Double] = v34
    val v27: Double = v9(6)
    v21 = v21.updated(3, v27)
    v34 = v2
    val v79: Double = v21(2)
    var v49: Vector[Double] = v6
    v2 = v2.updated(6, v61)
    v2 = v49
    v6 = v6.updated(1, v17)
    v79
  }
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    val v2: Double = f26(v1)
    val v6: Double = f26(v2)
    v6
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(Vector(0.0), Vector(1.0), Vector(2.0)), Vector(Vector(3.0))), s0(Vector(Vector(4.0), Vector(5.0), Vector(6.0)), Vector(Vector(7.0))))
    val v1: Double = 8.0
    val start = nanoTime()
    var result: Double = 8.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}