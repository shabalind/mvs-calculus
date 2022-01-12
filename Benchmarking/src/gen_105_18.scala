import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  def f2(v0: Double): Double = {
    var v6: Double = v0
    var v1: Double = v6
    var v7: Double = v1
    var v10: Double = v0
    v7 = v10
    var v21: Double = v10
    var v8: Double = v7
    var v15: Double = v7
    var v35: Double = v21
    var v26: Double = v8
    var v34: Double = v35
    var v16: Double = v34
    var v29: Double = v26
    val v37: Vector[Double] = Vector(v16, v15, v29, v26)
    val v47: Double = v37(1)
    v47
  }
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v3: Double = f2(v1)
    var v2: Double = v1
    val v8: Vector[Double] = Vector(v1, v3, v2)
    var v7: Vector[Double] = v8
    val v10: Double = v7(2)
    val v26: Double = f2(v1)
    val v46: Double = v8(1)
    val v104: Double = v3 * v26
    val v58: Double = v104 / v10
    v7 = v7.updated(1, v46)
    v7 = v7.updated(0, v1)
    v7 = v8
    v58
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0), Vector(4.0)))), Vector(s0(Vector(Vector(5.0), Vector(6.0)), Vector(Vector(7.0), Vector(8.0), Vector(9.0)))), Vector(s0(Vector(Vector(10.0), Vector(11.0)), Vector(Vector(12.0), Vector(13.0), Vector(14.0)))))
    val v1: Double = 15.0
    val start = nanoTime()
    var result: Double = 15.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}