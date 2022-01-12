import java.lang.System.nanoTime
import scala.collection.immutable.Vector
object Gen extends App {
  case class s0 (
    p0: Vector[Vector[Double]],
    p1: Vector[Vector[Double]]
  )
  @noinline
  def f0(v0: Vector[Vector[s0]], v1: Double): Double = {
    val v3: Vector[s0] = v0(1)
    var v2: Vector[s0] = v3
    var v10: Vector[Vector[s0]] = v0
    val v6: Vector[s0] = v10(1)
    v10 = v0
    v10 = v10.updated(1, v2)
    val v13: s0 = v2(0)
    val v14: Vector[Vector[Double]] = v13.p1
    val v11: Vector[s0] = v0(1)
    v10 = v10.updated(0, v2)
    val v40: Vector[Double] = v14(0)
    v10 = v10.updated(0, v11)
    var v41: Vector[s0] = v6
    v10 = v0
    val v170: s0 = v41(0)
    v2 = v2.updated(0, v170)
    val v130: Double = v40(0)
    v130
  }
  def benchmark(): Unit = {
    val v0: Vector[Vector[s0]] = Vector(Vector(s0(Vector(Vector(0.0), Vector(1.0)), Vector(Vector(2.0), Vector(3.0)))), Vector(s0(Vector(Vector(4.0), Vector(5.0)), Vector(Vector(6.0), Vector(7.0)))))
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