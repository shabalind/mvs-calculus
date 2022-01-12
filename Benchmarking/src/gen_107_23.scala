import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    var v5: Vector[Vector[s0]] = v0
    var v2: Double = v1
    val v4: Vector[s0] = v5(1)
    val v9: s0 = v4(0)
    val v12: Vector[Vector[Double]] = v9.p0
    val v27: Vector[Double] = v12(0)
    val v24: Double = v2 + v1
    val v21: Double = v27(0)
    val v30: Double = v24 + v21
    val v70: Double = v2 - v30
    v70
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)))), Vector(s0(Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)))))
    val v1: Double = 6.0
    val start = nanoTime()
    var result: Double = 6.0
    (1 to 1000).foreach { _ =>
      result = f0(v0, v1)
    }
    val end = nanoTime()
    println(result)
    println(end - start)
  }
  benchmark()
}