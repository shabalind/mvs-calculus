import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Double],
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: s0
  )
  @noinline
  def f0(v0: s1, v1: Double): Double = {
    var v2: Double = v1
    val v3: Vector[Double] = Vector(v1, v1, v1, v2)
    val v6: Double = v3(2)
    val v7: Double = v3(3)
    val v9: Double = v3(3)
    var v4: Double = v2
    var v13: Vector[Double] = v3
    v13 = v13.updated(2, v9)
    var v11: Double = v9
    val v15: Double = v13(3)
    v2 = v15
    val v34: Double = v3(0)
    var v16: Double = v6
    val v26: Double = v4 + v7
    v13 = v13.updated(1, v34)
    val v50: Vector[Double] = Vector(v11, v26, v16, v2, v6, v34)
    v13 = v13.updated(2, v15)
    val v57: Double = v50(0)
    v57
  }
  def benchmark(): Unit = {
    val v0: s1 = s1(s0(Vector(0.0, 1.0), Vector(Vector(2.0), Vector(3.0))), s0(Vector(4.0, 5.0), Vector(Vector(6.0), Vector(7.0))))
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