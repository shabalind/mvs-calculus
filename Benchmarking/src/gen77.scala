import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Double,
    p1: Vector[Vector[Double]]
  )
  case class s1 (
    p0: s0,
    p1: Vector[s0]
  )
  @noinline
  def f0(v0: Vector[Double], v1: Vector[Vector[s1]], v2: s0, v3: Double): Double = {
    var v7: Vector[Double] = v0
    v7 = v7.updated(0, v3)
    var v4: Double = v3
    v7 = v7.updated(0, v4)
    v7 = v7.updated(0, v4)
    v7 = v7.updated(0, v4)
    var v6: Vector[Double] = v7
    val v12: Double = v2.p0
    val v5: Vector[Vector[Double]] = v2.p1
    val v21: Vector[Vector[Vector[Double]]] = Vector(v5, v5, v5, v5)
    val v19: Vector[Vector[Double]] = v21(2)
    val v23: Double = v0(0)
    v6 = v6.updated(0, v4)
    v6 = v6.updated(0, v23)
    val v56: Vector[Double] = v19(0)
    v6 = v6.updated(0, v23)
    val v42: Double = v12 / v3
    var v37: Vector[Double] = v56
    v37 = v6
    val v194: Double = v37(0)
    v37 = v37.updated(0, v42)
    v194
  }
  def benchmark(): Unit = {
    val v0: Vector[Double] = Vector(0.0)
    val v1: Vector[Vector[s1]] = Vector(Vector(s1(s0(1.0, Vector(Vector(2.0), Vector(3.0), Vector(4.0))), Vector(s0(5.0, Vector(Vector(6.0), Vector(7.0), Vector(8.0)))))))
    val v2: s0 = s0(9.0, Vector(Vector(10.0), Vector(11.0), Vector(12.0)))
    val v3: Double = 13.0
    val start = nanoTime()
    var result: Double = 13.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1, v2, v3)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}