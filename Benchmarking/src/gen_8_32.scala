import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v5: Vector[Vector[s0]] = v0
    var v8: Vector[Vector[s0]] = v5
    val v9: Vector[Vector[Vector[s0]]] = Vector(v8, v5)
    val v2: Vector[s0] = v0(1)
    val v3: Vector[Vector[s0]] = v9(0)
    v5 = v5.updated(1, v2)
    val v15: Vector[s0] = v3(2)
    val v13: s0 = v15(0)
    val v11: Vector[Vector[Double]] = v13.p1
    val v21: Vector[Double] = v11(0)
    val v68: Double = v21(0)
    v8 = v8.updated(1, v2)
    v5 = v5.updated(1, v15)
    v68
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0)), Vector(Vector(1.0), Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0)), Vector(Vector(5.0), Vector(6.0), Vector(7.0)))), Vector(s0(Vector(Vector(8.0)), Vector(Vector(9.0), Vector(10.0), Vector(11.0)))))
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